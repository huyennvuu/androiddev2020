package vn.edu.usth.weather;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment
{
    public ForecastFragment(){

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle saveInstanceState )
    {
        View view = inflater.inflate(R.layout.forecast_fragment, container, false);
//        LinearLayout ll = view.findViewById(R.id.container);
//        ll.setGravity(Gravity.CENTER);
//
//        TextView mon_text = new TextView(getContext());
//        TextView tues_text = new TextView(getContext());
//        TextView wed_text = new TextView(getContext());

//        tv.setText("Yesterday");
//        tv.setPadding(10,10,10,50);
//        tv.setTextSize(30);
//        tv.setTypeface(Typeface.DEFAULT_BOLD);
//        ll.addView(tv);

//        tv.setText("Today");
//        tv.setPadding(10,10,10,50);
//        tv.setTextSize(30);
//        tv.setTypeface(Typeface.DEFAULT_BOLD);
//        ll.addView(tv);

//        tv.setText("Tomorow");
//        tv.setPadding(10,10,10,50);
//        tv.setTextSize(30);
//        tv.setTypeface(Typeface.DEFAULT_BOLD);
//        ll.addView(tv);

//        ImageView iv = new ImageView(getContext());
//        iv.setImageResource(R.drawable.sunny);
//        ll.addView(iv);
        view.setBackgroundColor(Color.rgb(232,178,178));
        return view;
    }
}
