package com.icandothisallday2020.ex03imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Create field(reference variable) pointed View
    ImageView imageView;
    Button buttonAus,buttonBel,buttonCa,buttonKor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //res folder's layout folder's activity_main.xml ->Views
        //find by Id and input the reference variable
        imageView=findViewById(R.id.imageview);
        buttonAus=findViewById(R.id.australia);
        buttonBel=findViewById(R.id.belgium);
        buttonCa=findViewById(R.id.canada);
        buttonKor=findViewById(R.id.korea);
        //Create Listener class reacting by 4 button click
        //Only one Listener reacting on all buttons
        buttonAus.setOnClickListener(listener);
        buttonBel.setOnClickListener(listener);
        buttonCa.setOnClickListener(listener);
        buttonKor.setOnClickListener(listener);
        //ImageView Click->Image Change!
        // must set ImageView's attribute:clickable->true
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.flag_australia+a);
                a++;
                if (a==12) a=0;
            }
        });//anonymous class
    }//on Create method


    int a=0;//member variable->Image Change
    //don't care about filed(Abstract class)'s position
    View.OnClickListener listener=new View.OnClickListener() {
        //When the button clicked -> execute this method
        @Override
        public void onClick(View v) {
            //v=pointed(looking) Button class
            //OnClickListener can make Image,Text..(all view) can be clicked
            int id =v.getId();
            switch (id){
                case R.id.australia:
                    imageView.setImageResource(R.drawable.flag_australia);
                    break;
                case R.id.belgium:
                    imageView.setImageResource(R.drawable.flag_belgium);
                    break;
                case R.id.canada:
                    imageView.setImageResource(R.drawable.flag_canada);
                    break;
                case R.id.korea:
                    imageView.setImageResource(R.drawable.flag_korea);
                    break;
            }
        }
    };
}//MainActivity
