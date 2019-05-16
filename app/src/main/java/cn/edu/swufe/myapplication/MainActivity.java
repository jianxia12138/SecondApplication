package cn.edu.swufe.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView out = findViewById(R.id.txtout);
        out.setText("Hello kkkkk");

        EditText inp = findViewById(R.id.edittext);
        String str = inp.getText().toString();
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        TextView out = findViewById(R.id.txtout);
        out.setText("clicked");
    }
}
