package sample.android.com.menuoptionexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home_btn) {
            // Home BUtton is clicked

            Toast.makeText(this, "You Click Home Button", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.about_us) {
            // About Us button is clicked
            Toast.makeText(this, "You Click About Us", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.exit_btn) {
            // Exit button is clicked
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
