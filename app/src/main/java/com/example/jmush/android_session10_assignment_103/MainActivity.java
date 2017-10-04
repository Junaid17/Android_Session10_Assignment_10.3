package com.example.jmush.android_session10_assignment_103;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private DBhelper DbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Database Instance
        DbHelper = new DBhelper(this);
        // Employee class instance
        Employee employee_One = new Employee(BitmapFactory.decodeResource(
                getResources(), R.drawable.cartoon_face), "Junaid", 26);
        DbHelper.open();
//        Inserting into DB
        DbHelper.insertEmpDetails(employee_One);
        DbHelper.close();
        employee_One = null;
        DbHelper.open();
        //Retreiving data from DB
        employee_One = DbHelper.retriveEmpDetails();
        DbHelper.close();
//      Polpulating all details in Activity
        TextView empname = (TextView) findViewById(R.id.name);
        empname.setText(employee_One.getName());
        ImageView empphoto = (ImageView) findViewById(R.id.photo);
        empphoto.setImageBitmap(employee_One.getBitmap());
        TextView empage = (TextView) findViewById(R.id.age);
        empage.setText("" + employee_One.getAge());
    }
}
