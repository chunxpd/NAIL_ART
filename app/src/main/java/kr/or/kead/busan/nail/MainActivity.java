package kr.or.kead.busan.nail;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;


public class MainActivity extends AppCompatActivity {
    private BackPressCloseHandler backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backPressCloseHandler = new BackPressCloseHandler(this);
    }

    public void onClickOk(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivityForResult(intent, 0);
    }

    public void onClickLater(View view) {
        Intent intent = new Intent(this, LaterActivity.class);
        //Intent intent = new Intent(this, Step5Activity.class);
        startActivity(intent);
    }

    @Override public void onBackPressed() {
        //super.onBackPressed();
        backPressCloseHandler.onBackPressed(); }
}
