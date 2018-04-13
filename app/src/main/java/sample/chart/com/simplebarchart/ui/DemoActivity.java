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

    }
}
