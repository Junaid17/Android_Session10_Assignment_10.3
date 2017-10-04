package com.example.jmush.android_session10_assignment_103;

import android.graphics.Bitmap;


/**
 * Created by nbaac on 28/09/17.
 */

public class Employee {
    private Bitmap Bitmap;
    private String Name;
    private int Age;


    public Employee(Bitmap bitmap, String name, int age) {
        Bitmap = bitmap;
        Name = name;
        Age = age;
    }

    public android.graphics.Bitmap getBitmap() {
        return Bitmap;
    }

    public void setBitmap(android.graphics.Bitmap bitmap) {
        Bitmap = bitmap;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
