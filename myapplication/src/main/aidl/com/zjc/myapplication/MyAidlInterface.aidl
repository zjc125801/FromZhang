// MyAidlInterface.aidl
package com.zjc.myapplication;

// Declare any non-default types here with import statements

interface MyAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
     String getName();
     int getAge (int name);

    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
}
