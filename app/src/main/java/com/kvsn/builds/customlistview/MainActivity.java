package com.kvsn.builds.customlistview;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.lv1);
        ArrayList<Person> al = new ArrayList<Person>();
        for(int i=0; i<4;i++)
        {
            Person p = new Person();
            p.setName("Vishnu");
            p.setDescription("Student");
            p.setImage(R.drawable.cont);

            al.add(p);
        }

        ListAdapter la = new ListAdapter(al,this);
        list.setAdapter(la);

    }
}
