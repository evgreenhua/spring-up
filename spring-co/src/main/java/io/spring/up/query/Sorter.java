package io.spring.up.query;

import io.spring.up.epic.Ut;
import io.spring.up.epic.fn.Fn;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Sorter implements Serializable {
    /**
     * Field
     */
    private transient final List<String> field = new ArrayList<>();
    /**
     * Sort Mode
     */
    private transient final List<Boolean> asc = new ArrayList<>();

    public static Sorter create(final String field,
                                final Boolean asc) {
        return new Sorter(field, asc);
    }

    public static Sorter create() {
        return new Sorter(null, false);
    }

    public static Sorter create(final JsonArray sorter) {
        // Sorter Parsing
        final Sorter target = Sorter.create();
        Ut.itJArray(sorter, String.class, (field, index) -> {
            if (field.contains(",")) {
                final String sortField = field.split(",")[0];
                final boolean asc = field.split(",")[1].equalsIgnoreCase("asc");
                target.add(sortField, asc);
            } else {
                target.add(field, true);
            }
        });
        return target;
    }

    private Sorter(final String field,
                   final Boolean asc) {
        Fn.safeNull(() -> {
            this.field.add(field);
            this.asc.add(asc);
        }, field);
    }

    public <T> JsonObject toJson(final Function<Boolean, T> function) {
        final JsonObject sort = new JsonObject();
        Ut.itList(this.field, (item, index) -> {
            // Extract value from asc
            final boolean mode = this.asc.get(index);
            // Extract result
            final T result = function.apply(mode);
            sort.put(item, result);
        });
        return sort;
    }

    public JsonObject toJson() {
        final JsonObject sort = new JsonObject();
        Ut.itList(this.field, (item, index) -> {
            final boolean mode = this.asc.get(index);
            sort.put(item, mode);
        });
        return sort;
    }

    public Sorter add(final String field,
                      final Boolean asc) {
        this.field.add(field);
        this.asc.add(asc);
        return this;
    }

    public Sorter clear() {
        this.field.clear();
        this.asc.clear();
        return this;
    }
}
