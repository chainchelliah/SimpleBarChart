package sample.chart.com.simplebarchart.data;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sample.chart.com.barchartlib.BarChartModel;
import sample.chart.com.barchartlib.BarChartUtils;

/**
 * sample test data provider to draw bar chart
 */
public class DataProvider {

    private static final int MAX_LENGTH = 4;
    public static String data[] = new String[]{"Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "AuG",
            "Sep",
            "Oct",
            "Nov",
            "Dec",
            "Jan",
            "Feb",
            "Mar"};

    public static int dataColor[] = new int[]{
            Color.parseColor("#00BCD4"),
            Color.parseColor("#3F51B5"),
            Color.parseColor("#2196F3"),
            Color.parseColor("#FF9800")};

    public static List<BarChartModel> getSampleData() {
        List<BarChartModel> data = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            BarChartModel barChartModel = new BarChartModel();
            barChartModel.setBarValue(new Random().nextInt(100)); // bar input value, can be customizable
            barChartModel.setBarColor(BarChartUtils.getRandomColor());
            barChartModel.setBarTag(null);
            barChartModel.setBarText(String.format("%04d", new Random().nextInt(10000))); // bar input value, can be customizable
            data.add(barChartModel);
        }
        return data;
    }

}
