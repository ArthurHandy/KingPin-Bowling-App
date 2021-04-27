package com.example.kingpin;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

//import androidx.appcompat.app.AppCompatActivity;

public class ChartGame extends Fragment {
    private PieChart pieChart;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.chart_game, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        pieChart = getView().findViewById(R.id.activity_pieChart);
        setupPieChart();
        loadPieChartData();

        pieChart.animateY(1400, Easing.EaseInOutQuad);

        view.findViewById(R.id.button_prev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ChartGame.this)
                        .navigate(R.id.action_ChartFragment_to_FirstFragment);
            }
        });
    }

    private void setupPieChart() {
        pieChart.setDrawHoleEnabled(true);
        pieChart.setUsePercentValues(true);
        pieChart.setEntryLabelTextSize(12);
        pieChart.setEntryLabelColor(Color.BLACK);
        pieChart.setCenterText("Total Score: 133");
        pieChart.setCenterTextSize(24);
        pieChart.getDescription().setEnabled(false);

        Legend l = pieChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(true);
        l.setEnabled(true);
    }


    //import data into pie chart
    private void loadPieChartData(){
        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(0.03f, "Frame 1"));
        entries.add(new PieEntry(0.067f, "Frame 2"));
        entries.add(new PieEntry(0.112f, "Frame 3"));
        entries.add(new PieEntry(0.15f, "Frame 4"));
        entries.add(new PieEntry(0.082f, "Frame 5"));
        entries.add(new PieEntry(0.007f, "Frame 6"));
        entries.add(new PieEntry(0.12f, "Frame 7"));
        entries.add(new PieEntry(0.15f, "Frame 8"));
        entries.add(new PieEntry(0.15f, "Frame 9"));
        entries.add(new PieEntry(0.12f, "Frame 10"));

        ArrayList<Integer> colors = new ArrayList<>();
        for (int color: ColorTemplate.MATERIAL_COLORS) {
            colors.add(color);
        }

        for (int color: ColorTemplate.VORDIPLOM_COLORS) {
            colors.add(color);
        }

        PieDataSet dataSet = new PieDataSet(entries, "Frame Score");
        dataSet.setColors(colors);

        PieData data = new PieData(dataSet);
        data.setDrawValues(true);
        data.setValueFormatter(new PercentFormatter(pieChart));
        data.setValueTextSize(12f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);
        pieChart.invalidate();
    }

}
