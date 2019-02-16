package edu.tempe.paletteactivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        setTitle("Canvas Activity");

        String viewColor= getIntent().getStringExtra("ViewColor");

        getWindow().getDecorView().setBackgroundColor(Color.parseColor(viewColor));
    }
}
