package com.utini.utini;

import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

/**
 * Created by garga on 11/12/2017.
 */

public class MySavings extends MainActivity {

    private BarChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_savings);

        mChart = findViewById(R.id.graphBar);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1f, 10));
        barEntries.add(new BarEntry(2f, 20));
        barEntries.add(new BarEntry(3f, 30));
        barEntries.add(new BarEntry(4f, 40));
        barEntries.add(new BarEntry(5f, 50));
        BarDataSet entriset = new BarDataSet(barEntries, "Dates");

        ArrayList<String> months = new ArrayList<>();
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");

        BarData sexyData = new BarData(entriset);
        mChart.setPinchZoom(false);
        mChart.setDoubleTapToZoomEnabled(false);
        mChart.setScaleEnabled(false);
        mChart.setTouchEnabled(false);
        mChart.setDrawBorders(false);
        mChart.setEnabled(true);
        mChart.setGridBackgroundColor(020040);
        mChart.setData(sexyData);
    }
}
