package csc495s15.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View v) {

        EditText editTextValue = (EditText)findViewById(R.id.editText);

        Toast.makeText(
                getApplicationContext(),
                editTextValue.getText(),
                Toast.LENGTH_SHORT).show();
    }
}