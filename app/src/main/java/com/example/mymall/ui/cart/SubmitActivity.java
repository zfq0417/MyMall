package com.example.mymall.ui.cart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mymall.R;

//下单
public class SubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        submitweb();
    }

    private void submitweb() {
      //  String html = this.getString(R.string.submit_h5);
    }
}