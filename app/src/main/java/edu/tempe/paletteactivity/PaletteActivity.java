package edu.tempe.paletteactivity;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        setTitle("Palette Activity");

        Resources res = getResources();
        String[] colorsText = res.getStringArray(R.array.color_array);
        String[] colors = res.getStringArray(R.array.color_array_en);

        final Spinner colorSpinner = findViewById(R.id.colorSpinner);
        ColorAdapter adapter = new ColorAdapter(PaletteActivity.this, colors, colorsText);
        colorSpinner.setAdapter(adapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    intent.putExtra("ViewColor", adapterView.getItemAtPosition(i).toString());
                    if(i != 0) {
                        startActivity(intent);
                    }
                }


            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });
    }
}
