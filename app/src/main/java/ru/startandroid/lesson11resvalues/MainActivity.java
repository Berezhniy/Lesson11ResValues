package ru.startandroid.lesson11resvalues;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // нахожу View
        LinearLayout llBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);
        //присваиваю цвет
        llBottom.setBackgroundResource(R.color.llBottomColor);
        //присваиваю текст
        tvBottom.setText(R.string.tvBottomText);
        btnBottom.setText(R.string.btnBottomText);

    }
}
