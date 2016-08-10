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

    public void showToast(View view) {
        Button button = (Button) view;
        String appName = button.getText().toString();
        Toast toast = Toast.makeText(
                getApplicationContext(), "This button will launch my " + appName +" app!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
