package mainactivity.santiagolondono.com.tourism_sopetran;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class activity_bar extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_bar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.inicio) {
            Intent i =new Intent(this,MainActivity.class);
            startActivity(i);
        }

        if (id == R.id.hoteles) {
            Intent i =new Intent(this,activity_hotel.class);
            startActivity(i);
        }

        if (id == R.id.sitios) {
            Intent i =new Intent(this,activity_sitios.class);
            startActivity(i);
        }

        if (id == R.id.demo) {
            Intent i =new Intent(this,activity_demografia.class);
            startActivity(i);
        }


        if (id == R.id.about) {
            Intent i =new Intent(this,activity_about.class);
            startActivity(i);
        }



        return super.onOptionsItemSelected(item);
    }
}
