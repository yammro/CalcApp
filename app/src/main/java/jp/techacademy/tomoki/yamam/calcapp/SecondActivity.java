package jp.techacademy.tomoki.yamam.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1", 0); //小数点にも対応
        double value2 = intent.getDoubleExtra("VALUE2", 0);
        int value3 = intent.getIntExtra("VALUE3", 0);
        Log.d("javatest", String.valueOf(value3)); // デバッグ用に追加する
        Log.d("javatest", String.valueOf(value1)); // デバッグ用に追加する
        TextView textView = (TextView) findViewById(R.id.textView);
        if(value3==1){  // fugou(value3=) 1：＋, 2：－,3：×,4：÷
            textView.setText(String.valueOf(value1 + value2));
        }else if(value3==2){
            textView.setText(String.valueOf(value1 - value2));
        }else if(value3==3){
            textView.setText(String.valueOf(value1 * value2));
        }else if(value3==4){
            textView.setText(String.valueOf(value1 / value2));
        }
    }
}