package ru.netologia.sharinm_task_121;

import androidx.appcompat.app.AppCompatActivity;

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

        Button SendButton = findViewById(R.id.SendButton);
        final TextView MessangeTextView = findViewById(R.id.MessageTextView);
        final EditText UserNameEditText = findViewById(R.id.UserNameEditText);
        final EditText EmailEditText =findViewById(R.id.EmailEditText);

        SendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (UserNameEditText.getText().length() != 0) {
                    if (EmailEditText.getText().length() != 0){
                        MessangeTextView.setText("Подписка на рассылку удачно подписана для пользователя " + UserNameEditText.getText().toString() + " на электронный адрес " + EmailEditText.getText().toString());
                    } else {
                        MessangeTextView.setText("Будьте внимательны: Вы не ввели электронную почту!");
                    }
                } else {
                    MessangeTextView.setText("Будьте внимательны: Вы не ввели имя пользователя!");
                }

            }
        });


        Button ClearButton = findViewById(R.id.ClearButton);
        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserNameEditText.setText(null);
                EmailEditText.setText("");
                MessangeTextView.setText("");
            }
        });
    }

}
