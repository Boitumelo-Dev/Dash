package com.skrn.dash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class ServiceAdapter extends ArrayAdapter<Service> {

    public ServiceAdapter(Context context, List<Service> services) {
        super(context, 0, services);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Service service = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_services, parent, false);
        }

        TextView nameTextView = convertView.findViewById(R.id.service_name);
        TextView descriptionTextView = convertView.findViewById(R.id.service_description);


        nameTextView.setText(service.getName());
        descriptionTextView.setText(service.getDescription());

        return convertView;
    }
}
