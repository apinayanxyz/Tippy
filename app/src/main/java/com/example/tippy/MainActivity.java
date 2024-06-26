package com.example.tippy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    private EditText etBaseAmount;
    private SeekBar seekBarTip;
    private TextView tvTipPercentLabel;
    private TextView tvTipAmount;
    private TextView tvTotalAmount;
    private Button testButton;

    private ConstraintLayout layout ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etBaseAmount = findViewById(R.id.etBaseAmount);
        seekBarTip = (SeekBar)findViewById(R.id.seekBarTip);
        tvTipPercentLabel = findViewById(R.id.tvTipPercentageLabel);
        tvTipAmount = findViewById(R.id.tvTipAmount);
        tvTotalAmount = findViewById(R.id.tvTotalLabel);
        testButton = findViewById(R.id.testButton);
        layout = findViewById(R.id.layout);

        AnimationDrawable animationDrawable = (AnimationDrawable)
                testButton.getBackground();
        animationDrawable.setEnterFadeDuration(0);
        animationDrawable.setExitFadeDuration(100);
        animationDrawable.start();


        testButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        animationDrawable.stop();
                        animationDrawable.start();
                    }
                }
        );
        seekBarTip.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){

                        Log.i(TAG  , "onProgressChanged " + progress);

                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar){

                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekbar){

                    }
        });
    }
}