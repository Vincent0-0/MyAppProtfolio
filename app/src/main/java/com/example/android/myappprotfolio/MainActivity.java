package com.example.android.myappprotfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastPopularMovie(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(), "This button will launch my popular movies app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastStockHawk(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(), "This button will launch my stock hawk app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastBuildItBigger(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(), "This button will launch my build it bigger app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastMakeYourAppMaterial(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(), "This button will launch my make your app material app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastGoUbiquitous(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(), "This button will launch my go ubiquitous app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastCapstone(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
