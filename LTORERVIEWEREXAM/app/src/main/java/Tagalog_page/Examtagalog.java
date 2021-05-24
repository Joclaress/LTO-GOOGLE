package Tagalog_page;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ltorerviewerexam.R;

import Nonpro_page.answerclass;

public class Examtagalog extends AppCompatActivity {

    private Button optionA, optionB, optionC, optionD;
    private TextView questionnumber, question, score;
    private TextView checkout1, checkout2;
    int currentIndex;
    int mscore = 0;
    int qn = 1;
    ProgressBar progressBar;


    int CurrentQuestion, CurrentOptionA, CurrentOptionB, CurrentOptionC, CurrentOptionD;

    private answerclass[] questionBank = new answerclass[]{
            new answerclass(R.string.tquestion_1, R.string.tquestion1_A, R.string.tquestion1_B, R.string.tquestion11_C, R.string.tquestion1_D, R.string.tanswer_1),
            new answerclass(R.string.tquestion_2, R.string.tquestion2_A, R.string.tquestion2_B, R.string.tquestion2_C, R.string.tquestion2_D, R.string.tanswer_2),
            new answerclass(R.string.tquestion_3, R.string.tquestion3_A, R.string.tquestion3_B, R.string.tquestion3_C, R.string.tquestion3_D, R.string.tanswer_3),
            new answerclass(R.string.tquestion_4, R.string.tquestion4_A, R.string.tquestion4_B, R.string.tquestion4_C, R.string.tquestion4_D, R.string.tanswer_4),
            new answerclass(R.string.tquestion_5, R.string.tquestion5_A, R.string.tquestion5_B, R.string.tquestion5_C, R.string.tquestion5_D, R.string.tanswer_5),
            new answerclass(R.string.tquestion_6, R.string.tquestion6_A, R.string.tquestion6_B, R.string.tquestion6_C, R.string.tquestion6_D, R.string.tanswer_6),
            new answerclass(R.string.tquestion_7, R.string.tquestion7_A, R.string.tquestion7_B, R.string.tquestion7_C, R.string.tquestion7_D, R.string.tanswer_7),
            new answerclass(R.string.tquestion_8, R.string.tquestion8_A, R.string.tquestion8_B, R.string.tquestion8_C, R.string.tquestion8_D, R.string.tanswer_8),
            new answerclass(R.string.tquestion_9, R.string.tquestion9_A, R.string.tquestion9_B, R.string.tquestion9_C, R.string.tquestion9_D, R.string.tanswer_9),
            new answerclass(R.string.tquestion_10, R.string.tquestion10_A, R.string.tquestion10_B, R.string.tquestion10_C, R.string.tquestion10_D, R.string.tanswer_10),
            new answerclass(R.string.tquestion_11, R.string.tquestion11_A, R.string.tquestion11_B, R.string.tquestion11_C, R.string.tquestion11_D, R.string.tanswer_11),
            new answerclass(R.string.tquestion_12, R.string.tquestion12_A, R.string.tquestion12_B, R.string.tquestion12_C, R.string.tquestion12_D, R.string.tanswer_12),
            new answerclass(R.string.tquestion_13, R.string.tquestion13_A, R.string.tquestion13_B, R.string.tquestion13_C, R.string.tquestion13_D, R.string.tanswer_13),
            new answerclass(R.string.tquestion_14, R.string.tquestion14_A, R.string.tquestion14_B, R.string.tquestion14_C, R.string.tquestion14_D, R.string.tanswer_14),
            new answerclass(R.string.tquestion_15, R.string.tquestion15_A, R.string.tquestion15_B, R.string.tquestion15_C, R.string.tquestion15_D, R.string.tanswer_15),
            new answerclass(R.string.tquestion_16, R.string.tquestion16_A, R.string.tquestion16_B, R.string.tquestion16_C, R.string.tquestion16_D, R.string.tanswer_16),
            new answerclass(R.string.tquestion_17, R.string.tquestion17_A, R.string.tquestion17_B, R.string.tquestion17_C, R.string.tquestion17_D, R.string.tanswer_17),
            new answerclass(R.string.tquestion_18, R.string.tquestion18_A, R.string.tquestion18_B, R.string.tquestion18_C, R.string.tquestion18_D, R.string.tanswer_18),
            new answerclass(R.string.tquestion_19, R.string.tquestion19_A, R.string.tquestion19_B, R.string.tquestion19_C, R.string.tquestion19_D, R.string.tanswer_19),
            new answerclass(R.string.tquestion_20, R.string.tquestion20_A, R.string.tquestion20_B, R.string.tquestion20_C, R.string.tquestion20_D, R.string.tanswer_20),
            new answerclass(R.string.tquestion_21, R.string.tquestion21_A, R.string.tquestion21_B, R.string.tquestion21_C, R.string.tquestion21_D, R.string.tanswer_21),
            new answerclass(R.string.tquestion_22, R.string.tquestion22_A, R.string.tquestion22_B, R.string.tquestion22_C, R.string.tquestion22_D, R.string.tanswer_22),
            new answerclass(R.string.tquestion_23, R.string.tquestion23_A, R.string.tquestion23_B, R.string.tquestion23_C, R.string.tquestion23_D, R.string.tanswer_23),
            new answerclass(R.string.tquestion_24, R.string.tquestion24_A, R.string.tquestion24_B, R.string.tquestion24_C, R.string.tquestion24_D, R.string.tanswer_24),
            new answerclass(R.string.tquestion_25, R.string.tquestion25_A, R.string.tquestion25_B, R.string.tquestion25_C, R.string.tquestion25_D, R.string.tanswer_25),
            new answerclass(R.string.tquestion_26, R.string.tquestion26_A, R.string.tquestion26_B, R.string.tquestion26_C, R.string.tquestion26_D, R.string.tanswer_26),
            new answerclass(R.string.tquestion_27, R.string.tquestion27_A, R.string.tquestion27_B, R.string.tquestion27_C, R.string.tquestion27_D, R.string.tanswer_27),
            new answerclass(R.string.tquestion_28, R.string.tquestion28_A, R.string.tquestion28_B, R.string.tquestion28_C, R.string.tquestion28_D, R.string.tanswer_28),
            new answerclass(R.string.tquestion_29, R.string.tquestion29_A, R.string.tquestion29_B, R.string.tquestion29_C, R.string.tquestion29_D, R.string.tanswer_29),
            new answerclass(R.string.tquestion_30, R.string.tquestion30_A, R.string.tquestion30_B, R.string.tquestion30_C, R.string.tquestion30_D, R.string.tanswer_30),
            new answerclass(R.string.tquestion_31, R.string.tquestion31_A, R.string.tquestion31_B, R.string.tquestion31_C, R.string.tquestion31_D, R.string.tanswer_31),
            new answerclass(R.string.tquestion_32, R.string.tquestion32_A, R.string.tquestion32_B, R.string.tquestion32_C, R.string.tquestion32_D, R.string.tanswer_32),
            new answerclass(R.string.tquestion_33, R.string.tquestion33_A, R.string.tquestion33_B, R.string.tquestion33_C, R.string.tquestion33_D, R.string.tanswer_33),
            new answerclass(R.string.tquestion_34, R.string.tquestion34_A, R.string.tquestion34_B, R.string.tquestion34_C, R.string.tquestion34_D, R.string.tanswer_34),
            new answerclass(R.string.tquestion_35, R.string.tquestion35_A, R.string.tquestion35_B, R.string.tquestion35_C, R.string.tquestion35_D, R.string.tanswer_35),
            new answerclass(R.string.tquestion_36, R.string.tquestion36_A, R.string.tquestion36_B, R.string.tquestion36_C, R.string.tquestion36_D, R.string.tanswer_36),
            new answerclass(R.string.tquestion_37, R.string.tquestion37_A, R.string.tquestion37_B, R.string.tquestion37_C, R.string.tquestion37_D, R.string.tanswer_37),
            new answerclass(R.string.tquestion_38, R.string.tquestion38_A, R.string.tquestion38_B, R.string.tquestion38_C, R.string.tquestion38_D, R.string.tanswer_38),
            new answerclass(R.string.tquestion_39, R.string.tquestion39_A, R.string.tquestion39_B, R.string.tquestion39_C, R.string.tquestion39_D, R.string.tanswer_39),
            new answerclass(R.string.tquestion_40, R.string.tquestion40_A, R.string.tquestion40_B, R.string.tquestion40_C, R.string.tquestion40_D, R.string.tanswer_40),
            new answerclass(R.string.tquestion_41, R.string.tquestion41_A, R.string.tquestion41_B, R.string.tquestion41_C, R.string.tquestion41_D, R.string.tanswer_41),
            new answerclass(R.string.tquestion_42, R.string.tquestion42_A, R.string.tquestion42_B, R.string.tquestion42_C, R.string.tquestion42_D, R.string.tanswer_42),
            new answerclass(R.string.tquestion_43, R.string.tquestion43_A, R.string.tquestion43_B, R.string.tquestion43_C, R.string.tquestion43_D, R.string.tanswer_43),
            new answerclass(R.string.tquestion_44, R.string.tquestion44_A, R.string.tquestion44_B, R.string.tquestion44_C, R.string.tquestion44_D, R.string.tanswer_44),
            new answerclass(R.string.tquestion_45, R.string.tquestion45_A, R.string.tquestion45_B, R.string.tquestion45_C, R.string.tquestion45_D, R.string.tanswer_45),
            new answerclass(R.string.tquestion_46, R.string.tquestion46_A, R.string.tquestion46_B, R.string.tquestion46_C, R.string.tquestion46_D, R.string.tanswer_46),
            new answerclass(R.string.tquestion_47, R.string.tquestion47_A, R.string.tquestion47_B, R.string.tquestion47_C, R.string.tquestion47_D, R.string.tanswer_47),
            new answerclass(R.string.tquestion_48, R.string.tquestion48_A, R.string.tquestion48_B, R.string.tquestion48_C, R.string.tquestion48_D, R.string.tanswer_48),
            new answerclass(R.string.tquestion_49, R.string.tquestion49_A, R.string.tquestion49_B, R.string.tquestion49_C, R.string.tquestion49_D, R.string.tanswer_49),
            new answerclass(R.string.tquestion_50, R.string.tquestion50_A, R.string.tquestion50_B, R.string.tquestion50_C, R.string.tquestion50_D, R.string.tanswer_50),
            new answerclass(R.string.tquestion_51, R.string.tquestion51_A, R.string.tquestion51_B, R.string.tquestion51_C, R.string.tquestion51_D, R.string.tanswer_51),
            new answerclass(R.string.tquestion_52, R.string.tquestion52_A, R.string.tquestion52_B, R.string.tquestion52_C, R.string.tquestion52_D, R.string.tanswer_52),
            new answerclass(R.string.tquestion_53, R.string.tquestion53_A, R.string.tquestion53_B, R.string.tquestion53_C, R.string.tquestion53_D, R.string.tanswer_53),
            new answerclass(R.string.tquestion_54, R.string.tquestion54_A, R.string.tquestion54_B, R.string.tquestion54_C, R.string.tquestion54_D, R.string.tanswer_54),
            new answerclass(R.string.tquestion_55, R.string.tquestion55_A, R.string.tquestion55_B, R.string.tquestion55_C, R.string.tquestion55_D, R.string.tanswer_55),
            new answerclass(R.string.tquestion_56, R.string.tquestion56_A, R.string.tquestion56_B, R.string.tquestion56_C, R.string.tquestion56_D, R.string.tanswer_56),
            new answerclass(R.string.tquestion_57, R.string.tquestion57_A, R.string.tquestion57_B, R.string.tquestion57_C, R.string.tquestion57_D, R.string.tanswer_57),
            new answerclass(R.string.tquestion_58, R.string.tquestion58_A, R.string.tquestion58_B, R.string.tquestion58_C, R.string.tquestion58_D, R.string.tanswer_58),
            new answerclass(R.string.tquestion_59, R.string.tquestion59_A, R.string.tquestion59_B, R.string.tquestion59_C, R.string.tquestion59_D, R.string.tanswer_59),
            new answerclass(R.string.tquestion_60, R.string.tquestion60_A, R.string.tquestion60_B, R.string.tquestion60_C, R.string.tquestion60_D, R.string.tanswer_60),


    };
    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examtagalog);
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
        question.setText(CurrentQuestion);
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
        question.setText(CurrentQuestion);
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