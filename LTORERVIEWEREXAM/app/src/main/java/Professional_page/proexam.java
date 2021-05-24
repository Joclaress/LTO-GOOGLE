package Professional_page;

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

import java.util.Random;

import Nonpro_page.answerclass;

public class proexam extends AppCompatActivity {
    private Button optionA, optionB, optionC, optionD;
    private TextView questionnumber, question, score;
    private TextView checkout1, checkout2;
    int currentIndex;
    int mscore = 0;
    int qn = 1;
    ProgressBar progressBar;


    int CurrentQuestion, CurrentOptionA, CurrentOptionB, CurrentOptionC, CurrentOptionD;


    private answerclass[] questionBank = new answerclass[]{
            new answerclass(R.string.hquestion_1, R.string.hquestion1_A, R.string.hquestion1_B, R.string.hquestion11_C, R.string.hquestion1_D, R.string.hanswer_1),
            new answerclass(R.string.hquestion_2, R.string.hquestion2_A, R.string.hquestion2_B, R.string.hquestion2_C, R.string.hquestion2_D, R.string.hanswer_2),
            new answerclass(R.string.hquestion_3, R.string.hquestion3_A, R.string.hquestion3_B, R.string.hquestion3_C, R.string.hquestion3_D, R.string.hanswer_3),
            new answerclass(R.string.hquestion_4, R.string.hquestion4_A, R.string.hquestion4_B, R.string.hquestion4_C, R.string.hquestion4_D, R.string.hanswer_4),
            new answerclass(R.string.hquestion_5, R.string.hquestion5_A, R.string.hquestion5_B, R.string.hquestion5_C, R.string.hquestion5_D, R.string.hanswer_5),
            new answerclass(R.string.hquestion_6, R.string.hquestion6_A, R.string.hquestion6_B, R.string.hquestion6_C, R.string.hquestion6_D, R.string.hanswer_6),
            new answerclass(R.string.hquestion_7, R.string.hquestion7_A, R.string.hquestion7_B, R.string.hquestion7_C, R.string.hquestion7_D, R.string.hanswer_7),
            new answerclass(R.string.hquestion_8, R.string.hquestion8_A, R.string.hquestion8_B, R.string.hquestion8_C, R.string.hquestion8_D, R.string.hanswer_8),
            new answerclass(R.string.hquestion_9, R.string.hquestion9_A, R.string.hquestion9_B, R.string.hquestion9_C, R.string.hquestion9_D, R.string.hanswer_9),
            new answerclass(R.string.hquestion_10, R.string.hquestion10_A, R.string.hquestion10_B, R.string.hquestion10_C, R.string.hquestion10_D, R.string.hanswer_10),
            new answerclass(R.string.question_11, R.string.question11_A, R.string.question11_B, R.string.question11_C, R.string.question11_D, R.string.answer_11),
            new answerclass(R.string.hquestion_12, R.string.hquestion12_A, R.string.hquestion12_B, R.string.hquestion12_C, R.string.hquestion12_D, R.string.hanswer_12),
            new answerclass(R.string.hquestion_13, R.string.hquestion13_A, R.string.hquestion13_B, R.string.hquestion13_C, R.string.hquestion13_D, R.string.hanswer_13),
            new answerclass(R.string.hquestion_14, R.string.hquestion14_A, R.string.hquestion14_B, R.string.hquestion14_C, R.string.hquestion14_D, R.string.hanswer_14),
            new answerclass(R.string.hquestion_15, R.string.hquestion15_A, R.string.hquestion15_B, R.string.hquestion15_C, R.string.hquestion15_D, R.string.hanswer_15),
            new answerclass(R.string.hquestion_16, R.string.hquestion16_A, R.string.hquestion16_B, R.string.hquestion16_C, R.string.hquestion16_D, R.string.hanswer_16),
            new answerclass(R.string.hquestion_17, R.string.hquestion17_A, R.string.hquestion17_B, R.string.hquestion17_C, R.string.hquestion17_D, R.string.hanswer_17),
            new answerclass(R.string.hquestion_18, R.string.hquestion18_A, R.string.hquestion18_B, R.string.hquestion18_C, R.string.hquestion18_D, R.string.hanswer_18),
            new answerclass(R.string.hquestion_19, R.string.hquestion19_A, R.string.hquestion19_B, R.string.hquestion19_C, R.string.hquestion19_D, R.string.hanswer_19),
            new answerclass(R.string.hquestion_20, R.string.hquestion20_A, R.string.hquestion20_B, R.string.hquestion20_C, R.string.hquestion20_D, R.string.hanswer_20),
            new answerclass(R.string.hquestion_21, R.string.hquestion21_A, R.string.hquestion21_B, R.string.hquestion21_C, R.string.hquestion21_D, R.string.hanswer_21),
            new answerclass(R.string.hquestion_22, R.string.hquestion22_A, R.string.hquestion22_B, R.string.hquestion22_C, R.string.hquestion22_D, R.string.hanswer_22),
            new answerclass(R.string.hquestion_23, R.string.hquestion23_A, R.string.hquestion23_B, R.string.hquestion23_C, R.string.hquestion23_D, R.string.hanswer_23),
            new answerclass(R.string.hquestion_24, R.string.hquestion24_A, R.string.hquestion24_B, R.string.hquestion24_C, R.string.hquestion24_D, R.string.hanswer_24),
            new answerclass(R.string.hquestion_25, R.string.hquestion25_A, R.string.hquestion25_B, R.string.hquestion25_C, R.string.hquestion25_D, R.string.hanswer_25),
            new answerclass(R.string.hquestion_26, R.string.hquestion26_A, R.string.hquestion26_B, R.string.hquestion26_C, R.string.hquestion26_D, R.string.hanswer_26),
            new answerclass(R.string.hquestion_27, R.string.hquestion27_A, R.string.hquestion27_B, R.string.hquestion27_C, R.string.hquestion27_D, R.string.hanswer_27),
            new answerclass(R.string.hquestion_28, R.string.hquestion28_A, R.string.hquestion28_B, R.string.hquestion28_C, R.string.hquestion28_D, R.string.hanswer_28),
            new answerclass(R.string.hquestion_29, R.string.hquestion29_A, R.string.hquestion29_B, R.string.hquestion29_C, R.string.hquestion29_D, R.string.hanswer_29),
            new answerclass(R.string.hquestion_30, R.string.hquestion30_A, R.string.hquestion30_B, R.string.hquestion30_C, R.string.hquestion30_D, R.string.hanswer_30),
            new answerclass(R.string.hquestion_31, R.string.hquestion31_A, R.string.hquestion31_B, R.string.hquestion31_C, R.string.hquestion31_D, R.string.hanswer_31),
            new answerclass(R.string.hquestion_32, R.string.hquestion32_A, R.string.hquestion32_B, R.string.hquestion32_C, R.string.hquestion32_D, R.string.hanswer_32),
            new answerclass(R.string.hquestion_33, R.string.hquestion33_A, R.string.hquestion33_B, R.string.hquestion33_C, R.string.hquestion33_D, R.string.hanswer_33),
            new answerclass(R.string.hquestion_34, R.string.hquestion34_A, R.string.hquestion34_B, R.string.hquestion34_C, R.string.hquestion34_D, R.string.hanswer_34),
            new answerclass(R.string.hquestion_35, R.string.hquestion35_A, R.string.hquestion35_B, R.string.hquestion35_C, R.string.hquestion35_D, R.string.hanswer_35),
            new answerclass(R.string.hquestion_36, R.string.hquestion36_A, R.string.hquestion36_B, R.string.hquestion36_C, R.string.hquestion36_D, R.string.hanswer_36),
            new answerclass(R.string.hquestion_37, R.string.hquestion37_A, R.string.hquestion37_B, R.string.hquestion37_C, R.string.hquestion37_D, R.string.hanswer_37),
            new answerclass(R.string.hquestion_38, R.string.hquestion38_A, R.string.hquestion38_B, R.string.hquestion38_C, R.string.hquestion38_D, R.string.hanswer_38),
            new answerclass(R.string.hquestion_39, R.string.hquestion39_A, R.string.hquestion39_B, R.string.hquestion39_C, R.string.hquestion39_D, R.string.hanswer_39),
            new answerclass(R.string.hquestion_40, R.string.hquestion40_A, R.string.hquestion40_B, R.string.hquestion40_C, R.string.hquestion40_D, R.string.hanswer_40),
            new answerclass(R.string.hquestion_41, R.string.hquestion41_A, R.string.hquestion41_B, R.string.hquestion41_C, R.string.hquestion41_D, R.string.hanswer_41),
            new answerclass(R.string.hquestion_42, R.string.hquestion42_A, R.string.hquestion42_B, R.string.hquestion42_C, R.string.hquestion42_D, R.string.hanswer_42),
            new answerclass(R.string.hquestion_43, R.string.hquestion43_A, R.string.hquestion43_B, R.string.hquestion43_C, R.string.hquestion43_D, R.string.hanswer_43),
            new answerclass(R.string.hquestion_44, R.string.hquestion44_A, R.string.hquestion44_B, R.string.hquestion44_C, R.string.hquestion44_D, R.string.hanswer_44),
            new answerclass(R.string.hquestion_45, R.string.hquestion45_A, R.string.hquestion45_B, R.string.hquestion45_C, R.string.hquestion45_D, R.string.hanswer_45),
            new answerclass(R.string.hquestion_46, R.string.hquestion46_A, R.string.hquestion46_B, R.string.hquestion46_C, R.string.hquestion46_D, R.string.hanswer_46),
            new answerclass(R.string.hquestion_47, R.string.hquestion47_A, R.string.hquestion47_B, R.string.hquestion47_C, R.string.hquestion47_D, R.string.hanswer_47),
            new answerclass(R.string.hquestion_48, R.string.hquestion48_A, R.string.hquestion48_B, R.string.hquestion48_C, R.string.hquestion48_D, R.string.hanswer_48),
            new answerclass(R.string.hquestion_49, R.string.hquestion49_A, R.string.hquestion49_B, R.string.hquestion49_C, R.string.hquestion49_D, R.string.hanswer_49),
            new answerclass(R.string.hquestion_50, R.string.hquestion50_A, R.string.hquestion50_B, R.string.hquestion50_C, R.string.hquestion50_D, R.string.hanswer_50),
            new answerclass(R.string.hquestion_51, R.string.hquestion51_A, R.string.hquestion51_B, R.string.hquestion51_C, R.string.hquestion51_D, R.string.hanswer_51),
            new answerclass(R.string.hquestion_52, R.string.hquestion52_A, R.string.hquestion52_B, R.string.hquestion52_C, R.string.hquestion52_D, R.string.hanswer_52),
            new answerclass(R.string.hquestion_53, R.string.hquestion53_A, R.string.hquestion53_B, R.string.hquestion53_C, R.string.hquestion53_D, R.string.hanswer_53),
            new answerclass(R.string.hquestion_54, R.string.hquestion54_A, R.string.hquestion54_B, R.string.hquestion54_C, R.string.hquestion54_D, R.string.hanswer_54),
            new answerclass(R.string.hquestion_55, R.string.hquestion55_A, R.string.hquestion55_B, R.string.hquestion55_C, R.string.hquestion55_D, R.string.hanswer_55),
            new answerclass(R.string.hquestion_56, R.string.hquestion56_A, R.string.hquestion56_B, R.string.hquestion56_C, R.string.hquestion56_D, R.string.hanswer_56),
            new answerclass(R.string.hquestion_57, R.string.hquestion57_A, R.string.hquestion57_B, R.string.hquestion57_C, R.string.hquestion57_D, R.string.hanswer_57),
            new answerclass(R.string.hquestion_58, R.string.hquestion58_A, R.string.hquestion58_B, R.string.hquestion58_C, R.string.hquestion58_D, R.string.hanswer_58),
            new answerclass(R.string.hquestion_59, R.string.hquestion59_A, R.string.hquestion59_B, R.string.hquestion59_C, R.string.hquestion59_D, R.string.hanswer_59),
            new answerclass(R.string.hquestion_60, R.string.hquestion60_A, R.string.hquestion60_B, R.string.hquestion60_C, R.string.hquestion60_D, R.string.hanswer_60),


    };
   

    final int PROGRESS_BAR = (int) Math.ceil(100 / questionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proexam);


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