package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Button> ListOfButton;
    List<Integer> ListOfColor;
    private Button btn_toast;
    private Button btn_count;
    private Button btn_reset;
    private TextView counter;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_toast = findViewById(R.id.btntst);
        btn_count = findViewById(R.id.btncnt);
        btn_reset = findViewById(R.id.btzero);
        counter = findViewById(R.id.txtview);
        ListOfButton = new ArrayList<>();
        ListOfColor = new ArrayList<>();

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_LONG).show();

            }
        });
        btn_count.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                count = count + 1;

                counter.setText("" + count);
                btn_reset.setBackgroundColor(btn_count.getContext().getResources().getColor(R.color.my_light_blue));
                if (count % 2 == 0) {
                    //btn_count.setBackgroundColor(getResources().getColor(R.color.my_yellow, null));
                    btn_count.setBackgroundColor(btn_count.getContext().getResources().getColor(R.color.my_green));
                } else {
                    btn_count.setBackgroundColor(btn_count.getContext().getResources().getColor(R.color.my_red));
                }

            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")

            @Override
            public void onClick(View v) {
                count = 0;
                counter.setText("" + count);
                btn_reset.setBackgroundColor(btn_count.getContext().getResources().getColor(R.color.my_grey));
                btn_count.setBackgroundColor(btn_count.getContext().getResources().getColor(R.color.purple_700));
            }
        });
    }
}