package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * adds 3 points to team A score
     */
    public void AddThreePointsTeamA(View view)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 2 points to team A score
     */
    public void AddTwoPointsTeamA(View view)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 1 points to team A score
     */
    public void AddOnePointTeamA(View view)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score)
    {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds 3 points to team B score
     */
    public void AddThreePointsTeamB(View view)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 2 points to team B score
     */
    public void AddTwoPointsTeamB(View view)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 1 points to team B score
     */
    public void AddOnePointTeamB(View view)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score)
    {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds 1 points to team B score
     */
    public void ResetScore(View view)
    {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
