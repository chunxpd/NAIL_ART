package kr.or.kead.busan.nail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Proc1Activity extends AppCompatActivity {

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proc1);

        Intent intent = getIntent();
        data = intent.getStringExtra("care");
        //Toast.makeText(this, data + " 선택하셨습니다.",Toast.LENGTH_SHORT).show();

        Button button = (Button)findViewById(R.id.button_next);
        button.setText(data + " 진행");
    }

    public void onClick(View view) {
        Intent intent = new Intent(this,Step1Activity.class);
        intent.putExtra("care",data);
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==2) {
            setResult(2);
            finish();
        }
    }
}
