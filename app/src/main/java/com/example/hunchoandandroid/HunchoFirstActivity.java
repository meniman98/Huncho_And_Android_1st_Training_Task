package com.example.hunchoandandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HunchoFirstActivity extends AppCompatActivity {

    private TextView tvText;
    private Button btnChangeName;
    private EditText etUserWord;
    private String word;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huncho_first_activity);

        tvText = findViewById(R.id.textView);
        btnChangeName = findViewById(R.id.mybutton1);
        etUserWord = findViewById(R.id.userWord);


        btnChangeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word = etUserWord.getText().toString();
                if (word.matches("")) {
                    Toast.makeText(getApplicationContext(), "You did not enter a word", Toast.LENGTH_SHORT).show();
                }
                else {
                tvText.setText(word); }

            }
        });
    }
}
