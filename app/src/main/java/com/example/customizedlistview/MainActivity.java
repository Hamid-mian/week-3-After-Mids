package com.example.customizedlistview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


    }
}
class MyListView extends ArrayAdapter {
    private final Activity context;
    String maintitle[] = {"Picture 1", "Picture 2", "Picture 3", "Picture 4"};
    String mDescription[] = {"Picture 1 Description", "Picture 2 Description", "Picture 3 Description", "Picture 4 Description"};
    Integer images[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4};

    public MyListView(Activity context, String[] maintitle, String[]
            mDescription, Integer[] images) {
        super(context, R.layout.list_item, maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.mDescription = mDescription;
        this.images = images;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View singleEntityView=inflater.inflate(R.layout.list_item , null,true);
        TextView titleHeading = singleEntityView.findViewById(R.id.textView1 );
        ImageView imageView = singleEntityView.findViewById(R.id.image );
        TextView titleDetails = singleEntityView.findViewById(R.id.textView2 );
        titleHeading.setText(maintitle[position]);
        imageView.setImageResource(images[position]);
        titleDetails.setText(mDescription[position]);
        return singleEntityView;
    };
}
