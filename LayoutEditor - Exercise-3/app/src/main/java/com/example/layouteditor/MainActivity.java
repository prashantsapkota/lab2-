package com.example.layouteditor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count=0;
    private static final String TAG=MainActivity.class.getSimpleName();
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView) findViewById(R.id.textView);
        if(savedInstanceState !=null){
            count=savedInstanceState.getInt(TAG,0);
            text.setText(""+count);
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(TAG, count);
    }

    public void addCount(View view) {
        count++;
        if(text!=null){
            text.setText(Integer.toString(count));
        }

    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        toast.show();
    }
}