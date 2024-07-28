package com.skrn.dash;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AvailableWorkerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.available_workers);
        ListView listViewServices = findViewById(R.id.workerslist);

        // Create a list of workers
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Plumbing", "Fix your plumbing issues", "4.5", "5 years", "$50"));
        workers.add(new Worker("Cleaning", "Home cleaning workers", "4.7", "3 years", "$30"));
        workers.add(new Worker("Electrical", "Electrical maintenance", "4.6", "7 years", "$60"));
        // Add more workers as needed

        // Create an adapter
        WorkerAdapter adapter = new WorkerAdapter(this, workers);
        //ListView servicesListView = findViewById(R.id.workers);
        // Attach the adapter to the ListView
        listViewServices.setAdapter(adapter);
        listViewServices.setOnItemClickListener((parent, view, position, id) -> {
            Worker selectedWorker = (Worker) parent.getItemAtPosition(position);
            Toast.makeText(AvailableWorkerActivity.this, "Clicked: " + selectedWorker.getName(), Toast.LENGTH_SHORT).show();
        });

    }
}
