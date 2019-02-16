package edu.tempe.paletteactivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    private Context context;
    private String colors[];

    public ColorAdapter(Context applicationContext,  String[] colors) {
        this.context = applicationContext;
        this.colors = colors;
    }


    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public String getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView colortext = new TextView(context);
        colortext.setText(colors[position]);
        colortext.setTextColor(Color.BLACK);
        if(colors[position] != "None Selected") {
            colortext.setBackgroundColor(Color.parseColor(colors[position]));
            return colortext;
        }
        colortext.setBackgroundColor(Color.parseColor("WHITE"));
        return colortext;
    }
}
