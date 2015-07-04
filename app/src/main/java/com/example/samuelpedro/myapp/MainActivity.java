package com.example.samuelpedro.myapp;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Buttons */
        /*
            Button buttonSpotify = (Button) findViewById(R.id.button_spotify_streamer);
            buttonSpotify.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    CharSequence text = "This button will launch my Spotify Streamer app!";
                    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
                }
            });

            Button buttonScores = (Button) findViewById(R.id.button_scores_app);
            buttonScores.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    CharSequence text = "This button will launch my Scores app!";
                    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
                }
            });

            Button buttonLibraryApp = (Button) findViewById(R.id.button_library_app);
            buttonLibraryApp.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    CharSequence text = "This button will launch my Library app!";
                    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
                }
            });

            Button buttonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
            buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    CharSequence text = "This button will launch my Build It Bigger app!";
                    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
                }
            });

            Button buttonBaconReader = (Button) findViewById(R.id.button_bacon_reader);
            buttonBaconReader.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    CharSequence text = "This button will launch my Bacon Reader app!";
                    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
                }
            });

            Button buttonCapstoneMyOwn = (Button) findViewById(R.id.button_capstone_my_own_app);
            buttonCapstoneMyOwn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Context context = getApplicationContext();
                    CharSequence text = "This button will launch my Capstone My Own app!";
                    Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
                }
            });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(View view) {

        Button button = (Button) view;

        String buttonText = (String) button.getText();

        Context context = getApplicationContext();
        // open_app would add "Opens the app "
        CharSequence text = getString(R.string.open_app)
               + " " + buttonText;

        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

}
