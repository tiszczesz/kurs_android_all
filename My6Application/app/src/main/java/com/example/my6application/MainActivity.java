package com.example.my6application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewQuestion;
    private Button btnTrue;
    private Button btnFalse;
    private ProgressBar progressBar;
    private TextView textViewStat;
    private int mQuestionIndex;
    private  int mUserScore;
    private final String SCORE_KEY = "SCORE";
    private final String INDEX_KEY = "INDEX";

    private QuizModel[]  questionCollection = new QuizModel[]{
             new QuizModel(R.string.q1,false),
             new QuizModel(R.string.q2,true),
             new QuizModel(R.string.q3,false),
             new QuizModel(R.string.q4,false),
             new QuizModel(R.string.q5,false),
             new QuizModel(R.string.q6,false),
             new QuizModel(R.string.q7,true),
             new QuizModel(R.string.q8,true),
             new QuizModel(R.string.q9,true),
             new QuizModel(R.string.q10,true)
    };
    final int USER_PROGRESS = 1;// (int)Math.ceil(100.0/questionCollection.length);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            mUserScore = savedInstanceState.getInt(SCORE_KEY);
            mQuestionIndex = savedInstanceState.getInt(INDEX_KEY);
        }else{
            mQuestionIndex=0;
            mUserScore=0;
        }

        textViewQuestion = findViewById(R.id.textViewQuestion);
        textViewStat = findViewById(R.id.textViewStat);
        progressBar = findViewById(R.id.progressBar);
        btnFalse = findViewById(R.id.buttonFalse);
        btnTrue = findViewById(R.id.buttonTrue);
        btnTrue.setOnClickListener(this);
        btnFalse.setOnClickListener(this);

        textViewQuestion.setText(questionCollection[mQuestionIndex].getQuestion());
        progressBar.setMax(questionCollection.length);
        textViewStat.setText(mUserScore+"/"+questionCollection.length);
        Toast.makeText(getApplicationContext(),"OnCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_KEY,mUserScore);
        outState.putInt(INDEX_KEY,mQuestionIndex);
        Toast.makeText(getApplicationContext(),"OnSaveInstance",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case  R.id.buttonTrue: {
               evaluateUserQuestion(true);
               changeQuestionOnClick();
                break;
            }

            case R.id.buttonFalse: {
               evaluateUserQuestion(false);
               changeQuestionOnClick();
                break;
            }

            //.... etc
        }

    }
    private void changeQuestionOnClick(){
        mQuestionIndex = (mQuestionIndex+1)%10;
        if(mQuestionIndex==0){
            AlertDialog.Builder quizAlert = new AlertDialog.Builder(this);
            quizAlert.setCancelable(false);
            quizAlert.setTitle("Koniec testu");
            quizAlert.setMessage("Twoje punkty to: "+mUserScore);
            quizAlert.setPositiveButton("Koniec zagadek", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            quizAlert.show();
        }
        progressBar.incrementProgressBy(USER_PROGRESS);
        textViewQuestion.setText(questionCollection[mQuestionIndex].getQuestion());
        textViewStat.setText(mUserScore+"/"+questionCollection.length);
    }
    private void evaluateUserQuestion(boolean userQuastion){
        boolean currentQuastionAnswer = questionCollection[mQuestionIndex].isAnswer();
        if(currentQuastionAnswer==userQuastion){
           Toast.makeText(getApplicationContext(),"Brawo zgadłeś/aś",Toast.LENGTH_SHORT).show();
           mUserScore++;
        }else{
            Toast.makeText(getApplicationContext(),"Słabo nie zgadłeś/aś",Toast.LENGTH_SHORT).show();
        }
    }
}