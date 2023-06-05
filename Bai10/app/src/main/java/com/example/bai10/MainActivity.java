package com.example.bai10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_show_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(this,"This is a toast",Toast.LENGTH_LONG).show();
                Toast toast = new Toast(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.layout_custom_toast, (ViewGroup) findViewById(R.id.layout_custom_toast));
                TextView tvMessage = view.findViewById(R.id.tv_message);
                tvMessage.setText("Nguyen Manh Cuong");
                toast.setView(view);
                toast.setGravity(Gravity.CENTER, 0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });



    }
}