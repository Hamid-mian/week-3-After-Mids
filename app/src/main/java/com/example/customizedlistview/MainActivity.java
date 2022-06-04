package com.example.customizedlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Picture 1", "Picture 2", "Picture 3", "Picture 4"};
    String mDescription[] = {"Picture 1 Description", "Picture 2 Description", "Picture 3 Description", "Picture 4 Description"};
    int images[] = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}