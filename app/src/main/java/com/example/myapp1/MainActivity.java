package com.example.myapp1;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final EditText editText1 = findViewById (R.id.editText1);
        final EditText editText2 = findViewById (R.id.editText2);
        final EditText editTextTime = findViewById (R.id.editTextTime);
        final EditText editTextDate = findViewById (R.id.editTextDate);
        final TextView textView = findViewById (R.id.textView);

        Date date = new Date();
        editTextTime.setText(date.toString());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer arg1 = Integer.parseInt(editText1.getText().toString());
                Integer arg2 = Integer.parseInt(editText2.getText().toString());
                if (arg1.equals(arg2)) {
                    textView.setText("Равно!");
                    editText1.setText("");
                    editText2.setText("");

                } else {
                    textView.setText("Не равно!");
                    editText1.setText("");
                    editText2.setText("");
                }

            }

        });
    }
}
