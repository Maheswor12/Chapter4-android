package com.maheswor.chapter4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public ListView listView;
    public static final String country[] =
            {
                    "Nepal", "kathmandu",
                    "India", "New delhi",
                    "China", "Beijhing",
                    "UK", "london"
            };
    private Map<String,String> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        countries = new HashMap();
        for (int i = 0; i < country.length; i += 2) {
            countries.put(country[i], country[i + 1]);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, new ArrayList(countries.keySet()));
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String desh = adapterView.getItemAtPosition(position).toString();
                String capital = countries.get(desh);
                Toast.makeText(MainActivity.this, "Capital of"+desh+" is : "+capital, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
