package mx.com.cyrux.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvCars = findViewById(R.id.rvCars);
        rvCars.setHasFixedSize(true);
        rvCars.setLayoutManager(new LinearLayoutManager(this));
        rvCars.setAdapter(new CarAdapter(Car.getCarsList()));
    }
}