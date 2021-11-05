package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    // инициализация активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TTT","onCreate()");
    }

    // вызывается, когда активность стала видимой
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TTT","onStart()");
    }

    // возобновление обновления UI
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TTT","onResume()");
    }

    // вызывается, когда выходим из активного состояния
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TTT","onPause()");
    }

    // приостановка обновления UI (активность не на переднем плане)
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TTT","onStop()");
    }

    // перезапуск активности
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TTT","onRestart()");
    }

    // вызывать освобождение ресуров, потоки и завершать откр. соедения
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TTT","onDestroy()");
    }
}