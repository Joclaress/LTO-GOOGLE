package Traffic_page;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ltorerviewerexam.R;

import Nonpro_page.answerclass;

public class Examtraffic extends AppCompatActivity {
    private Button optionA, optionB, optionC, optionD;
    private TextView questionnumber,  score;
    private ImageView question;
    private TextView checkout1, checkout2;
    int currentIndex;
    int mscore = 0;
    int qn = 1;
    ProgressBar progressBar;


    int CurrentQuestion, CurrentOptionA, CurrentOptionB, CurrentOptionC, CurrentOptionD;

    private answerclass[] questionBank = new answerclass[]{
            new answerclass(R.drawable.sign1rouadaboutahead, R.string.question1d_A, R.string.question1d_B, R.string.question1d_C, R.string.question1d_D, R.string.answer_1d),
            new answerclass(R.drawable.sign2yield, R.string.question2d_A, R.string.question2d_B, R.string.question2d_C, R.string.question2d_D, R.string.answer_2d),
            new answerclass(R.drawable.sign3stop, R.string.question3d_A, R.string.question3d_B, R.string.question3d_C, R.string.question3d_D, R.string.answer_3d),
            new answerclass(R.drawable.sign4hopital, R.string.question4d_A, R.string.question4d_B, R.string.question4d_C, R.string.question4d_D, R.string.answer_4d),
            new answerclass(R.drawable.sign5regulatory, R.string.question5d_A, R.string.question5d_B, R.string.question5d_C, R.string.question5d_D, R.string.answer_5d),
            new answerclass(R.drawable.sign6noentryanim, R.string.question6d_A, R.string.question6d_B, R.string.question6d_C, R.string.question6d_D, R.string.answer_6d),
            new answerclass(R.drawable.signs7lipery, R.string.question7d_A, R.string.question7d_B, R.string.question7d_C, R.string.question7d_D, R.string.answer_7d),
            new answerclass(R.drawable.sign8sgiveway, R.string.question8d_A, R.string.question8d_B, R.string.question8d_C, R.string.question8d_D, R.string.answer_8d),
            new answerclass(R.drawable.sign9nopedestrian, R.string.question9d_A, R.string.question9d_B, R.string.question9d_C, R.string.question9d_D, R.string.answer_9d),
            new answerclass(R.drawable.signs10, R.string.question10d_A, R.string.question10d_B, R.string.question10d_C, R.string.question10d_D, R.string.answer_10d),
            new answerclass(R.drawable.signs11, R.string.question11d_A, R.string.question11d_B, R.string.question11d_C, R.string.question11d_D, R.string.answer_11d),
            new answerclass(R.drawable.signs12, R.string.question12d_A, R.string.question12d_B, R.string.question12d_C, R.string.question12d_D, R.string.answer_12d),
            new answerclass(R.drawable.signs13, R.string.question13d_A, R.string.question13d_B, R.string.question13d_C, R.string.question13d_D, R.string.answer_13d),
            new answerclass(R.drawable.signs14, R.string.question14d_A, R.string.question14d_B, R.string.question14d_C, R.string.question14d_D, R.string.answer_14d),
            new answerclass(R.drawable.signs15, R.string.question15d_A, R.string.question15d_B, R.string.question15d_C, R.string.question15d_D, R.string.answer_15d),
            new answerclass(R.drawable.signs16, R.string.question16d_A, R.string.question16d_B, R.string.question16d_C, R.string.question16d_D, R.string.answer_16d),
            new answerclass(R.drawable.signs17, R.string.question17d_A, R.string.question17d_B, R.string.question17d_C, R.string.question17d_D, R.string.answer_17d),
            new answerclass(R.drawable.signs18, R.string.question18d_A, R.string.question18d_B, R.string.question18d_C, R.string.question18d_D, R.string.answer_18d),
            new answerclass(R.drawable.signs19, R.string.question19d_A, R.string.question19d_B, R.string.question19d_C, R.string.question19d_D, R.string.answer_19d),
            new answerclass(R.drawable.signs20, R.string.question20d_A, R.string.question20d_B, R.string.question20d_C, R.string.question20d_D, R.string.answer_20d),
            new answerclass(R.drawable.signs21, R.string.question21d_A, R.string.question21d_B, R.string.question21d_C, R.string.question21d_D, R.string.answer_21d),
            new answerclass(R.drawable.signs22, R.string.question22d_A, R.string.question22d_B, R.string.question22d_C, R.string.question22d_D, R.string.answer_22d),
            new answerclass(R.drawable.signs23, R.string.question23d_A, R.string.question23d_B, R.string.question23d_C, R.string.question23d_D, R.string.answer_23d),
            new answerclass(R.drawable.signs24, R.string.question24d_A, R.string.question24d_B, R.string.question24d_C, R.string.question24d_D, R.string.answer_24d),
            new answerclass(R.drawable.signs25, R.string.question25d_A, R.string.question25d_B, R.string.question25d_C, R.string.question25d_D, R.string.answer_25d),
            new answerclass(R.drawable.signs26, R.string.question26d_A, R.string.question26d_B, R.string.question26d_C, R.string.question26d_D, R.string.answer_26d),
            new answerclass(R.drawable.signs27, R.string.question27d_A, R.string.question27d_B, R.string.question27d_C, R.string.question27d_D, R.string.answer_27d),
            new answerclass(R.drawable.signs28, R.string.question28d_A, R.string.question28d_B, R.string.question28d_C, R.string.question28d_D, R.string.answer_28d),
            new answerclass(R.drawable.signs29, R.string.question29d_A, R.string.question29d_B, R.string.question29d_C, R.string.question29d_D, R.string.answer_29d),
            new answerclass(R.drawable.signs30, R.string.question30d_A, R.string.question30d_B, R.string.question30d_C, R.string.question30d_D, R.string.answer_30d),
            new answerclass(R.drawable.signs31, R.string.question31d_A, R.string.question31d_B, R.string.question31d_C, R.string.question31d_D, R.string.answer_31d),
            new answerclass(R.drawable.signs32, R.string.question32d_A, R.string.question32d_B, R.string.question32d_C, R.string.question32d_D, R.string.answer_32d),
            new answerclass(R.drawable.signs33, R.string.question33d_A, R.string.question33d_B, R.string.question33d_C, R.string.question33d_D, R.string.answer_33d),
            new answerclass(R.drawable.signs34, R.string.question34d_A, R.string.question34d_B, R.string.question34d_C, R.string.question34d_D, R.string.answer_34d),
            new answerclass(R.drawable.signs35, R.string.question35d_A, R.string.question35d_B, R.string.question35d_C, R.string.question35d_D, R.string.answer_35d),
            new answerclass(R.drawable.signs36, R.string.question36d_A, R.string.question36d_B, R.string.question36d_C, R.string.question36d_D, R.string.answer_36d),
            new answerclass(R.drawable.signs37, R.string.question37d_A, R.string.question37d_B, R.string.question37d_C, R.string.question37d_D, R.string.answer_37d),
            new answerclass(R.drawable.signs38, R.string.question38d_A, R.string.question38d_B, R.string.question38d_C, R.string.question38d_D, R.string.answer_38d),
            new answerclass(R.drawable.signs39, R.string.question39d_A, R.string.question39d_B, R.string.question39d_C, R.string.question39d_D, R.string.answer_39d),
            new answerclass(R.drawable.signs40, R.string.question40d_A, R.string.question40d_B, R.string.question40d_C, R.string.question40d_D, R.string.answer_40d),
    };
    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examtraffic);
        optionA = findViewById(R.id.button1);
        optionB = findViewById(R.id.button2);
        optionC = findViewById(R.id.button3);
        optionD = findViewById(R.id.button4);

        question = findViewById(R.id.questions);
        score = findViewById(R.id.score);
        questionnumber = findViewById(R.id.QuestionNumber);

        checkout1 = findViewById(R.id.selectoption);
        checkout2 = findViewById(R.id.CorrectAnswer);
        progressBar = findViewById(R.id.progressBar);


        CurrentQuestion = questionBank[currentIndex].getQuestionid();
        question.setImageResource(CurrentQuestion);
        CurrentOptionA = questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB = questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC = questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD = questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);


        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionA);
                updateQuestion();

            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionB);
                updateQuestion();
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionC);
                updateQuestion();
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionD);
                updateQuestion();
            }
        });


    }

    private void checkAnswer(int userSelection) {

        int correctanswer = questionBank[currentIndex].getAnswerid();

        checkout1.setText(userSelection);
        checkout2.setText(correctanswer);

        String m = checkout1.getText().toString().trim();
        String n = checkout2.getText().toString().trim();

        if (m.equals(n)) {
            Toast.makeText(getApplicationContext(), "Right", Toast.LENGTH_SHORT).show();
            mscore = mscore + 1;

        } else {
            Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
        }


    }


    private void updateQuestion() {

        currentIndex = (currentIndex + 1) % questionBank.length;


        CurrentQuestion = questionBank[currentIndex].getQuestionid();
        question.setImageResource(CurrentQuestion);
        CurrentOptionA = questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB = questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC = questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD = questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        qn = qn + 1;

        if (qn <= questionBank.length) {
            questionnumber.setText(qn + "/" + questionBank.length + "Question");
        }
        score.setText("Score" + mscore + "/" + questionBank.length);
        progressBar.incrementProgressBy(PROGRESS_BAR);
        progressBar.setProgressTintList(ColorStateList.valueOf(Color.YELLOW));


        if (currentIndex == 0) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("You Failed the Quiz");
            alert.setCancelable(false);
            alert.setMessage("Your Score" + mscore + "points");
            alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });

            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    mscore = 0;
                    qn = 1;
                    progressBar.setProgress(0);
                    score.setText("Score" + mscore + "/" + questionBank.length);
                    questionnumber.setText(qn + "/" + questionBank.length + "Question");
                }
            });

            alert.show();

        }
    }
}