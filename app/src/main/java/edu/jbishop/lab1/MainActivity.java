package edu.jbishop.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    EditText UserName = null;
    GifImageView Gif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = findViewById(R.id.TxtEnter);
        Gif = (GifImageView) findViewById(R.id.GifImg);

    }

    public void process(View view) {
        //called when the Process button is pressed.
        String name = null;

        name = UserName.getText().toString();

        //when the button is pressed sets the gif.
        Gif.setImageResource(R.drawable.waving);
        //sets up the toast when the button is pressed displaying a message + entered text.
        Toast.makeText(this, "Hi " + name, Toast.LENGTH_LONG).show();
        // when the enter button is press clears the entered name from the input.
        UserName.getText().clear();
        







    }
}