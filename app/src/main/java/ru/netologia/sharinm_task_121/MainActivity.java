package ru.netologia.sharinm_task_121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendButton = findViewById(R.id.SendButton);
        final TextView messageTextView = findViewById(R.id.MessageTextView);
        final EditText userNameEditText = findViewById(R.id.UserNameEditText);
        final EditText emailEditText =findViewById(R.id.EmailEditText);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (userNameEditText.getText().length() != 0) {
                    if (emailEditText.getText().length() != 0){
                        messageTextView.setText(getString(R.string.textMessageNotify
                                                            ,userNameEditText.getText().toString()
                                                            ,emailEditText.getText().toString()));
                    } else {
                        messageTextView.setText(getString(R.string.textMessageErrorEmail));
                    }
                } else {
                    messageTextView.setText(getString(R.string.textMessageErrorUserName));
                }

            }
        });


        Button ClearButton = findViewById(R.id.ClearButton);
        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNameEditText.setText(null);
                emailEditText.setText("");
                messageTextView.setText("");
            }
        });
    }

}
