package com.skrn.dash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class WorkerAdapter extends ArrayAdapter<Worker> {

    public WorkerAdapter(Context context, List<Worker> workers) {
        super(context, 0, workers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Worker worker = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.available_workers, parent, false);
        }

        TextView name = convertView.findViewById(R.id.service_name);
        TextView description = convertView.findViewById(R.id.service_description);
        TextView rating = convertView.findViewById(R.id.average_rating);
        TextView xp = convertView.findViewById(R.id.xp);
        TextView min_price = convertView.findViewById(R.id.min_price);

        name.setText(worker.getName());
        description.setText(worker.getDescription());
        rating.setText(worker.getAverage_rating());
        xp.setText(worker.getXp());
        min_price.setText(worker.getMin_price());

        return convertView;
    }
}

