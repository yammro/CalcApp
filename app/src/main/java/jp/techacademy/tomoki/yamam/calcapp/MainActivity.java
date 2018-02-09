package jp.techacademy.tomoki.yamam.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1,mEditText2;
    int fugou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
        Button tasu_button = (Button) findViewById(R.id.tasu_button);
        Button hiku_button = (Button) findViewById(R.id.hiku_button);
        Button kakeru_button = (Button) findViewById(R.id.kakeru_button);
        Button waru_button = (Button) findViewById(R.id.waru_button);
        tasu_button.setOnClickListener(this);
        hiku_button.setOnClickListener(this);
        kakeru_button.setOnClickListener(this);
        waru_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.tasu_button) {
            fugou = 1;   // fugou 1：＋, 2：－,3：×,4：÷
        } else if (v.getId() == R.id.hiku_button) {
            fugou = 2;
        } else if (v.getId() == R.id.kakeru_button) {
            fugou = 3;
        } else if (v.getId() == R.id.waru_button) {
            fugou = 4;
        }
        Log.d("javatest", String.valueOf(fugou)); // デバッグ用に追加する
        Log.d("javatest", String.valueOf(mEditText1.getText().toString())); // デバッグ用に追加する
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", Double.parseDouble(mEditText1.getText().toString()));
        intent.putExtra("VALUE2", Double.parseDouble(mEditText2.getText().toString()));
        intent.putExtra("VALUE3", fugou);
        startActivity(intent);
    }
}