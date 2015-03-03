package com.example.vigion.suportebasicodevidag3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        button = (Button) findViewById(R.id.button112);

        button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent callintent = new Intent(Intent.ACTION_CALL);
            callintent.setPackage("com.android.phone");
            callintent.setData(Uri.parse("tel:112"));
            startActivity(callintent);
        }

        });
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

    //Abre o layout do Engasgamento
    public void buttonOnClickPrincipios(View v) {
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), activity_engasgamento.class));
    }

    //Abre o layout do SBV
    public void buttonOnClickPrincipiosDois(View v) {
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), activity_sbv.class));
    }
}
