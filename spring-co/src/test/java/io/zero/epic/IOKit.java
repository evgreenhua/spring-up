package io.zero.epic;

import org.junit.Test;

import java.io.InputStream;

public class IOKit {

    @Test
    public void testUrl() {
        final InputStream in = Ut.ioStream("file:/Users/lang/.m2/repository/cn/spring-up/spring-co/0.2/spring-co-0.2.jar!/internal/application-error.yml");
        System.out.println(in);
    }
}
