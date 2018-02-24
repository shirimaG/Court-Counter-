package com.example.goodluck.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsA = 0, pointsB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(3);
    }

    /**
     * when three points button is clicked
     */
    public void addThreeForTeamA(View view) {
        pointsA = pointsA + 3;
        displayForTeamA(pointsA);
    }


    /**
     * when two points button is clicked
     */
    public void addTwoForTeamA(View view) {
        pointsA = pointsA + 2;
        displayForTeamA(pointsA);
    }

    /**
     * when Free Throw button is clicked
     */
    public void addOneForTeamA(View view) {
        pointsA = pointsA + 1;
        displayForTeamA(pointsA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    /**
     * when three points buttonB is clicked
     */

    public void addThreeForTeamB(View view) {
        pointsB = pointsB + 3;
        displayForTeamB(pointsB);
    }

    /**
     * when two points buttonB is clicked
     */
    public void addTwoForTeamB(View view) {
        pointsB = pointsB + 2;
        displayForTeamB(pointsB);
    }

    /**
     * when one point buttonB is clicked
     */
    public void addOneForTeamB(View view) {
        pointsB = pointsB + 1;
        displayForTeamB(pointsB);
    }

    /**
     * Display method for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    /**
     *Resert button code
     */
    public void resertButton(View view){
        pointsA =0;
        pointsB =0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);

    }
}
