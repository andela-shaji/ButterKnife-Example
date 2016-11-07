package com.android.java.miss.butterknifeexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
  @Bind(R.id.textview)
  TextView textView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ButterKnife.bind(this);

    textView.setText("Hello from Butterknife");

  }
  @OnClick(R.id.button)
  public void submit() {
    Toast.makeText(MainActivity.this, "Hello from Butterknife OnClick annotation", Toast.LENGTH_LONG).show();
  }
}
