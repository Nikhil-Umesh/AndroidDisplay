package com.allmycode.p01_05_01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity
                   implements View.OnClickListener {
  CheckBox pepBox, cheeseBox;
  TextView textView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    pepBox = (CheckBox) findViewById(R.id.checkBox);
    cheeseBox = (CheckBox) findViewById(R.id.checkBox2);
    textView = (TextView) findViewById(R.id.textView2);

    ((Button) findViewById(R.id.button))
                      .setOnClickListener(this);

  }

  public void onClick(View view) {
    StringBuilder str = new StringBuilder("");
    if (pepBox.isChecked()) {
      str.append("Pepperoni ");
    }
    if (cheeseBox.isChecked()) {
      str.append("Extra cheese");
    }
    if (str.length() == 0) {
      str.append("Plain");
    }
    textView.setText(str);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();

    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}

