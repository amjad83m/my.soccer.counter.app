package com.example.android.mysoccercounterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        updateTeam1Display(1, team1Goals);
        updateTeam1Display(2, team1FreeKicks);
        updateTeam1Display(3, team1Corners);
        updateTeam1Display(4, team1YCards);
        updateTeam1Display(5, team1RCards);

        updateTeam2Display(1, team2Goals);
        updateTeam2Display(2, team2FreeKicks);
        updateTeam2Display(3, team2Corners);
        updateTeam2Display(4, team2YCards);
        updateTeam2Display(5, team2RCards);
        */
    }

    // team 1 global variables
    int team1Goals = 0;
    int team1FreeKicks = 0;
    int team1Corners = 0;
    int team1YCards = 0;
    int team1RCards = 0;

    // team 2 global variables
    int team2Goals = 0;
    int team2FreeKicks = 0;
    int team2Corners = 0;
    int team2YCards = 0;
    int team2RCards = 0;

    // team 1 methods
    public void updateTeam1Display(int id, int data) {
        TextView targetTextView = null;
        String prefix = "";
        switch (id) {
            case 1: targetTextView = (TextView) findViewById(R.id.team_1_goals);
                prefix = "Goals: ";
                break;
            case 2: targetTextView = (TextView) findViewById(R.id.team_1_free_kicks);
                prefix = "Free Kicks: ";
                break;
            case 3: targetTextView = (TextView) findViewById(R.id.team_1_corners);
                prefix = "Corner Kicks: ";
                break;
            case 4: targetTextView = (TextView) findViewById(R.id.team_1_ycards);
                prefix = "Yellow Cards: ";
                break;
            case 5: targetTextView = (TextView) findViewById(R.id.team_1_rcards);
                prefix = "Red Cards: ";
        }
        targetTextView.setText(prefix + String.valueOf(data));
    }

    public void addTeam1Goal(View view) {
        team1Goals = team1Goals + 1;
        updateTeam1Display(1, team1Goals);
    }

    public void addTeam1FreeKick(View view) {
        team1FreeKicks = team1FreeKicks + 1;
        updateTeam1Display(2, team1FreeKicks);
    }

    public void addTeam1CornerKick(View view) {
        team1Corners = team1Corners + 1;
        updateTeam1Display(3, team1Corners);
    }

    public void addTeam1YellowCard(View view) {
        team1YCards = team1YCards + 1;
        updateTeam1Display(4, team1YCards);
    }

    public void addTeam1RedCards(View view) {
        team1RCards = team1RCards + 1;
        updateTeam1Display(5, team1RCards);
    }

    // team 2 methods
    public void updateTeam2Display(int id, int data) {
        TextView targetTextView = null;
        String prefix = "";
        switch (id) {
            case 1: targetTextView = (TextView) findViewById(R.id.team_2_goals);
                prefix = "Goals: ";
                break;
            case 2: targetTextView = (TextView) findViewById(R.id.team_2_free_kicks);
                prefix = "Free Kicks: ";
                break;
            case 3: targetTextView = (TextView) findViewById(R.id.team_2_corners);
                prefix = "Corner Kicks: ";
                break;
            case 4: targetTextView = (TextView) findViewById(R.id.team_2_ycards);
                prefix = "Yellow Cards: ";
                break;
            case 5: targetTextView = (TextView) findViewById(R.id.team_2_rcards);
                prefix = "Red Cards: ";
        }
        targetTextView.setText(prefix + String.valueOf(data));
    }

    public void addTeam2Goal(View view) {
        team2Goals = team2Goals + 1;
        updateTeam2Display(1, team2Goals);
    }

    public void addTeam2FreeKick(View view) {
        team2FreeKicks = team2FreeKicks + 1;
        updateTeam2Display(2, team2FreeKicks);
    }

    public void addTeam2CornerKick(View view) {
        team2Corners = team2Corners + 1;
        updateTeam2Display(3, team2Corners);
    }

    public void addTeam2YellowCard(View view) {
        team2YCards = team2YCards + 1;
        updateTeam2Display(4, team2YCards);
    }

    public void addTeam2RedCards(View view) {
        team2RCards = team2RCards + 1;
        updateTeam2Display(5, team2RCards);
    }

    public void reset(View view) {
        team1Goals = 0;
        team1FreeKicks = 0;
        team1Corners = 0;
        team1YCards = 0;
        team1RCards = 0;
        updateTeam1Display(1, team1Goals);
        updateTeam1Display(2, team1FreeKicks);
        updateTeam1Display(3, team1Corners);
        updateTeam1Display(4, team1YCards);
        updateTeam1Display(5, team1RCards);

        team2Goals = 0;
        team2FreeKicks = 0;
        team2Corners = 0;
        team2YCards = 0;
        team2RCards = 0;
        updateTeam2Display(1, team2Goals);
        updateTeam2Display(2, team2FreeKicks);
        updateTeam2Display(3, team2Corners);
        updateTeam2Display(4, team2YCards);
        updateTeam2Display(5, team2RCards);
    }
}
