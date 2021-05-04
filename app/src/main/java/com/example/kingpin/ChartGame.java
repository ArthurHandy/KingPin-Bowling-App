package com.example.kingpin;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.kingpin.game.Game;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

//import androidx.appcompat.app.AppCompatActivity;

public class ChartGame extends Fragment {
    private PieChart pieChart;
    Game g1;
    String f1, f2, f3, f4,f5, f6, f7, f8, f9, f10;

    String totalScore;

    ListView listView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
//        Intent gIntent = getIntent();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.chart_game, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ///////////////////////////////////////

//        listView = view.findViewById(R.id.listView);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        String userId = user.getUid();

        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference().child(userId).child("Games").child("Game 1");

//        final ArrayList<String> list = new ArrayList<String>();

//        final ArrayAdapter adapter = new ArrayAdapter<String>(this.getContext(), R.layout.fragment_gamedetail, list);
//        listView.setAdapter(adapter);

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                list.clear();

                    g1 = dataSnapshot.getValue(Game.class);
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
                    totalScore =g1.getTotalScore();

                pieChart = getView().findViewById(R.id.activity_pieChart);
                setupPieChart(g1.getTotalScore());
                loadPieChartData(calcPercent(f1, totalScore), calcPercent(f2, totalScore),
                        calcPercent(f3, totalScore), calcPercent(f4, totalScore),
                        calcPercent(f5, totalScore), calcPercent(f6, totalScore),
                        calcPercent(f7, totalScore), calcPercent(f8, totalScore),
                        calcPercent(f9, totalScore), calcPercent(f10, totalScore));

                pieChart.animateY(1400, Easing.EaseInOutQuad);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        ////////////////////////////////////////



//        view.findViewById(R.id.button_prev).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(ChartGame.this)
//                        .navigate(R.id.action_ChartFragment_to_FirstFragment);
//            }
//        });
    }

    private void setupPieChart(String score) {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(12);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.setCenterText(score);
        pieChart.setCenterTextSize(26);
        pieChart.getDescription().setEnabled(false);

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
