package com.pattersonhs.nyates.newquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    TextView qTextView;
    Button trueButton;
    Button falseButton;
    Button nextButton;
    boolean correctAnswer = false;
    int toastMessageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        qTextView = (TextView) findViewById(R.id.question_text_view);
        trueButton = (Button) findViewById(R.id.true_button);
        falseButton = (Button) findViewById(R.id.false_button);
        nextButton = (Button) findViewById(R.id.next_button);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean givenAnswer = true;
                if (givenAnswer == correctAnswer)
                {
                    toastMessageID = R.string.correct_toast;
                }
                else
                {
                    toastMessageID = R.string.incorrect_toast;
                }

                Toast.makeText(
                        QuizActivity.this, toastMessageID, Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }

}
