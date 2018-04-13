package sample.chart.com.barchartlib;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;

import java.util.Random;

public class BarChartUtils {
    public static final int BAR_CHART_HORIZONTAL=0;
    public static final int BAR_CHART_VERTICAL=1;
    public static final int BAR_CHART_WIDTH_DEFAULT=10;
    public static int BAR_CHART_COLOR_DEFAULT= Color.parseColor("#303030");
    public static int BAR_CHART_TEXT_COLOR_DEFAULT= Color.parseColor("#808080");
    public static int BAR_CHART_SPACE=5;

    public static float convertDpToPixel(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    public static float convertPixelsToDp(float px, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return px / ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);

    }

    public static int getRandomColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}

