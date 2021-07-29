package com.example.android.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        //Log.i("Here is a message", "We come! We fight! We win!");
        TextView textObject1 = (TextView) findViewById(R.id.menu_item_1);
        String text1 = (String) textObject1.getText();
        Log.i("First menu item Text", text1);

        TextView textObject2 = (TextView) findViewById(R.id.menu_item_2);
        String text2 = (String) textObject2.getText();
        Log.i("Second menu item Text", text2);

        TextView textObject3 = (TextView) findViewById(R.id.menu_item_3);
        String text3 = (String) textObject3.getText();
        Log.i("Third menu item Text", text3);


        // Find first menu item TextView and print the text to the logs

        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}