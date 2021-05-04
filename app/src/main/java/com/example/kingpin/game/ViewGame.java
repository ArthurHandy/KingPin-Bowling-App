package com.example.kingpin.game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kingpin.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * ViewGames generates a game for each game entered by the user
 * Places game in listView
 */
public class ViewGame extends AppCompatActivity {

    /**
     * PieChart object to display Game values
     */
    private PieChart pieChart;

    /**
     * Game object g1
     */
    Game g1;

    /**
     * String values for frames 1-10
     */
    String f1, f2, f3, f4,f5, f6, f7, f8, f9, f10;

    /**
     * Total score stored as a String
     */
    String totalScore;

    /**
     * Button backButton
     * For backwards navigation
     */
    Button backButton;

    /**
     * Button nextButton
     * To move to next page
     */
    Button nextButton;

    /**
     * TextView gameHeader
     * Displays the game name
     */
    TextView gameHeader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_game);

        //get intent from previous page
        Intent gIntent = getIntent();

        //initialize buttons
        backButton = (Button) findViewById(R.id.list_prevBTN);
        nextButton = (Button) findViewById(R.id.list_nextBTN);

        //initiliaze gameHeader
        gameHeader = (TextView) findViewById(R.id.textGameHeader);

        //g1 game object saved as intent from savedScore page
        g1 = (Game) gIntent.getSerializableExtra("GAME_SELECTED");

        //Set value of gameHeader
        gameHeader.setText(g1.getName());


        //Get frame 1-10score and totalScore
        f1 = g1.getFrame1score();
        f2 = g1.getFrame2score();
        f3 = g1.getFrame3score();
        f4 = g1.getFrame4score();
        f5 = g1.getFrame5score();
        f6 = g1.getFrame6score();
        f7 = g1.getFrame7score();
        f8 = g1.getFrame8score();
        f9 = g1.getFrame9score();
        f10 = g1.getFrame10score();
        totalScore = g1.getTotalScore();

        //initialize, set up, and load pieChart
        pieChart = findViewById(R.id.activity_pieChart);
        setupPieChart(g1.getTotalScore());
        loadPieChartData(calcPercent(f1, totalScore), calcPercent(f2, totalScore),
                calcPercent(f3, totalScore), calcPercent(f4, totalScore),
                calcPercent(f5, totalScore), calcPercent(f6, totalScore),
                calcPercent(f7, totalScore), calcPercent(f8, totalScore),
                calcPercent(f9, totalScore), calcPercent(f10, totalScore));

        pieChart.animateY(1400, Easing.EaseInOutQuad);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new SavedGamesList();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewGame.this, ViewFrames.class);
                intent.putExtra("GAME_SELECTED", g1);
                startActivity(intent);
            }
        });
    }

    /**
     * Set up piechart with attriubutes
     * @param score displayed in pie hole
     */
    private void setupPieChart(String score) {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(12);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.setCenterText(score);
        pieChart.setCenterTextSize(26);
        pieChart.getDescription().setEnabled(false);


        //Legend --> frames 1-10
        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(true);
        l.setEnabled(true);
    }


    //import data into pie chart
    private void loadPieChartData(float f1, float f2, float f3, float f4, float f5,
                                  float f6, float f7, float f8, float f9, float f10){
        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(f1, "1"));
        entries.add(new PieEntry(f2, "2"));
        entries.add(new PieEntry(f3, "3"));
        entries.add(new PieEntry(f4, "4"));
        entries.add(new PieEntry(f5, "5"));
        entries.add(new PieEntry(f6, "6"));
        entries.add(new PieEntry(f7, "7"));
        entries.add(new PieEntry(f8, "8"));
        entries.add(new PieEntry(f9, "9"));
        entries.add(new PieEntry(f10, "10"));

        ArrayList<Integer> colors = new ArrayList<>();
        for (int color: ColorTemplate.MATERIAL_COLORS) {
            colors.add(color);
        }

        for (int color: ColorTemplate.VORDIPLOM_COLORS) {
            colors.add(color);
        }

        PieDataSet dataSet = new PieDataSet(entries, "Frames");
        dataSet.setColors(colors);

        PieData data = new PieData(dataSet);
        data.setDrawValues(true);
        data.setValueFormatter(new PercentFormatter(pieChart));
        data.setValueTextSize(18f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);
        pieChart.invalidate();
    }


    /**
     * Calculate frame percentage to totalScore
     * @param score
     * @param totalScore
     * @return frac
     */
    public float calcPercent(String score, String totalScore){
        float s=0;
        float tS=0;
        float frac=0;
        if(!score.isEmpty()){
            s = Float.parseFloat(score);
            tS = Float.parseFloat(totalScore);
            frac = (s/tS);
        }
        return frac/100;
    }
}

