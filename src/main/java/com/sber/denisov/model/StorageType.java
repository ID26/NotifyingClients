package com.sber.denisov.model;

public @interface StorageType {
    Type type() default Type.MEMORY;
}
