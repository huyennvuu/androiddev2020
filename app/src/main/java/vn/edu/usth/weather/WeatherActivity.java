package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

public class WeatherActivity extends FragmentActivity {

    private static final String TAG = "WeatherActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity);
        Log.i(TAG,"This is onCreate");
        // Create a new Fragment
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"This is onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"This is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"This is onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"This is onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"This is onResume");
    }
}
