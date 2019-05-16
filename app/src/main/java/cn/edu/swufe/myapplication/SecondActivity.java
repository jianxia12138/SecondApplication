package cn.edu.swufe.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private final String TAG = "second";


    TextView score;
    TextView score2;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        setContentView(R.layout.activity_second);
        String scorea = ((TextView)findViewById(R.id.score)).getText().toString();
        String scoreb = ((TextView)findViewById(R.id.score2)).getText().toString();

        Log.i(TAG,"onsavedInstanceState: ");
        outState.putString("team_score",scorea);
        outState.putString("team_score",scoreb);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("team_score");
        String scoreb = savedInstanceState.getString("team_score");

        Log.i(TAG,"onRestoreInstanceState: ");
        ((TextView)findViewById(R.id.score)).setText(scorea);
        ((TextView)findViewById(R.id.score2)).setText(scoreb);
    }

    public void btnAdd1(View btn){
        if(btn.getId()==R.id.btn1){
        showScore(1);}
        else{
            showScore2(1);
        }
    }

    public void btnAdd2(View btn){
        if(btn.getId()==R.id.btn2){
        showScore(2);}
        else{
            showScore2(2);
        }
    }
    public void btnAdd3(View btn){
        if(btn.getId()==R.id.btn2){
        showScore(3);}
        else{
            showScore2(3);
        }
    }
    public void btnReset(View btn){
        TextView out = (TextView)findViewById(R.id.score);
        out.setText("0");

        ((TextView)findViewById(R.id.score2)).setText("0");
    }

    private void showScore(int inc){
        Log.i("show","inc="+ inc);
        String oldScore = (String) score.getText();
        int newScore = Integer.parseInt(oldScore)+inc;
        score.setText(""+ newScore);
    }
    private void showScore2(int inc){
        Log.i("show","inc="+ inc);
        String oldScore = (String) score2.getText();
        int newScore = Integer.parseInt(oldScore)+inc;
        score.setText(""+ newScore);
    }




}
