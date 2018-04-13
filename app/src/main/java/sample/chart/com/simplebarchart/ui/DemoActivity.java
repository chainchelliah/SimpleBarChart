package sample.chart.com.simplebarchart.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import sample.chart.com.barchartlib.BarChartModel;
import sample.chart.com.barchartlib.BarChartUtils;
import sample.chart.com.simplebarchart.R;
import sample.chart.com.simplebarchart.adapter.BarChartAdapter;
import sample.chart.com.simplebarchart.base.BaseActivity;
import sample.chart.com.simplebarchart.data.DataProvider;

public class DemoActivity extends BaseActivity {

    @BindView(R.id.rv_bar_chart)
    RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private BarChartAdapter mAdapter;
    /*@BindView(R.id.bar_chart)
        BarChart mBarChart;
        @BindView(R.id.hsv)
        HorizontalScrollView hsv;r
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        ButterKnife.bind(this);
        initUI();
    }

    private void initUI() {
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new BarChartAdapter(DataProvider.getSampleData());
        mRecyclerView.setAdapter(mAdapter);


       /* mBarChart.setBarMaxValue(100);
        for (int i = 0; i < 15; i++) {
            BarChartModel barChartModel = new BarChartModel();
            barChartModel.setBarValue(new Random().nextInt(100)); // bar input value, can be customizable
            barChartModel.setBarColor(BarChartUtils.getRandomColor());
            barChartModel.setBarTag(null);
            barChartModel.setBarText(DataProvider.data[i]);
            mBarChart.addBar(barChartModel);
        }

        hsv.setSmoothScrollingEnabled(true);
        hsv.setFillViewport(true);

        hsv.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (oldScrollX < scrollX) {
                    BarChartModel barChartModel = new BarChartModel();
                    barChartModel.setBarValue(new Random().nextInt(100)); // bar input value, can be customizable
                    barChartModel.setBarColor(BarChartUtils.getRandomColor());
                    barChartModel.setBarTag(null);
                    barChartModel.setBarText("march" + new Random().nextInt(100));
                    mBarChart.addBar(barChartModel);
                } else {
                    mBarChart.updateBar(oldScrollX, mBarChart.getBar(oldScrollX));
                }
            }
        });*/
    }
}
