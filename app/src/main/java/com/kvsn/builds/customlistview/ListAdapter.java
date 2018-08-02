package com.kvsn.builds.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter
{
    ArrayList<Person> alp;
    Context ct;

    ListAdapter(ArrayList<Person> alp, Context ct)
    {
        this.alp = alp;
        this.ct =ct;

    }
    @Override
    public int getCount() {

        Toast.makeText(ct,"size is "+alp.size() ,Toast.LENGTH_LONG).show();
        return alp.size();

    }

    @Override
    public Object getItem(int position)
    {
        return alp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Toast.makeText(ct, "Position " + position, Toast.LENGTH_LONG).show();
        Person p = (Person) getItem(position);
        Activity at = (Activity) ct;
        LayoutInflater lif = at.getLayoutInflater();

        View v1 = lif.inflate(R.layout.customlist, null);

        ImageView iv = (ImageView) v1.findViewById(R.id.iv);
        TextView t1 = (TextView) v1.findViewById(R.id.name);
        TextView t2 = (TextView) v1.findViewById(R.id.number);

        iv.setImageResource(p.getImage());

        t1.setText(p.getName());
        t2.setText(p.getDescription());

        return v1;
    }
}