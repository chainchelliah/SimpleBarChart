package sample.chart.com.simplebarchart.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import sample.chart.com.barchartlib.BarChart;
import sample.chart.com.barchartlib.BarChartModel;
import sample.chart.com.simplebarchart.R;

/**
 * Created by SangiliPandianC on 4/13/18.
 */
public class BarChartAdapter extends RecyclerView.Adapter<BarChartAdapter.ViewHolder> {

    List<BarChartModel> data;

    public BarChartAdapter(List<BarChartModel> sampleData) {
        this.data = sampleData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bar_cahrt, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(getItem(position));
    }

    private BarChartModel getItem(int position) {
        if (data == null || data.isEmpty()) return null;
        return data.get(position);
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.bar_chart)
        BarChart barChart;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindData(BarChartModel item) {
            if (item == null) return;
            barChart.setBarMaxValue(100);
            barChart.addBar(item);
        }
    }
}
