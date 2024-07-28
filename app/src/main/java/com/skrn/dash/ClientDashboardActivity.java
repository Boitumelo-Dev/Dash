package com.skrn.dash;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ClientDashboardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client_dashboard);
        // Step 1: Create a list of services
        List<Service> servicesList = new ArrayList<>();
        servicesList.add(new Service("Plumber", "Fixes leaks and installs pipes."));
        servicesList.add(new Service("Photographer", "Takes professional photos."));
        // Add more services...

        // Step 2: Create an instance of the custom adapter
        ServiceAdapter adapter = new ServiceAdapter(this, servicesList);

        // Step 3: Bind the adapter to the ListView
        ListView servicesListView = findViewById(R.id.services);
        servicesListView.setAdapter(adapter);

        // Optionally handle item clicks
        servicesListView.setOnItemClickListener((parent, view, position, id) -> {
            Service selectedService = (Service) parent.getItemAtPosition(position);
            Toast.makeText(ClientDashboardActivity.this, "Clicked: " + selectedService.getName(), Toast.LENGTH_SHORT).show();
            //ServiceClicked = selectedService.getName();
            Intent intent = new Intent(ClientDashboardActivity.this, AvailableWorkerActivity.class);
            startActivity(intent);
        });

    }
}
