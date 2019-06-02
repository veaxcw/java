package com.chengw.thread.utils.stf;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ConcurrencyTest {

    int iterations() default 20000;

    int thinkTime() default 0;



}
