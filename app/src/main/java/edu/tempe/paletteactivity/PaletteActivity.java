package edu.tempe.paletteactivity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {

    String colors[] = {"None Selected", "red", "blue", "green", "white", "gray", "cyan", "magenta", "yellow", "lightgray", "darkgray", "grey", "lightgrey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        setTitle("Palette Activity");

        final Spinner colorSpinner = findViewById(R.id.colorSpinner);
        ColorAdapter adapter = new ColorAdapter(PaletteActivity.this, colors);
        colorSpinner.setAdapter(adapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    intent.putExtra("ViewColor", adapterView.getItemAtPosition(i).toString());
                    if(adapterView.getItemAtPosition(i).toString() != "None Selected") {
                        startActivity(intent);
                    }
                }


            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });
    }
}
