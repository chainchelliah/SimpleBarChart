package sample.chart.com.simplebarchart.widget;

import android.content.Context;
import android.util.Log;
import android.widget.HorizontalScrollView;

public class CustomHorizontalScrollView extends HorizontalScrollView {

    public CustomHorizontalScrollView(Context context) {
        super(context);
    }


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        // TODO Auto-generated method stub
        Log.i("Scrolling", "X from [" + oldl + "] to [" + l + "]");
        super.onScrollChanged(l, t, oldl, oldt);
    }

}