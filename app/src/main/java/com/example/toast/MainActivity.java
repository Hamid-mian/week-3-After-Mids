package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater layoutInflater = getLayoutInflater();
        View myLayout=layoutInflater.inflate(R.layout.my_layout,null);
        ImageView imageView=myLayout.findViewById(R.id.imageViewCamera);
        imageView.setImageResource(R.drawable.pic1);
        TextView myMessage= myLayout.findViewById(R.id.textView);
        myMessage.setText("My Toast Picture");
        Toast myToast=new Toast(getApplicationContext());
        myToast.setDuration(Toast.LENGTH_LONG);
        myToast.setView(myLayout);

        myToast.show();

    }

    }