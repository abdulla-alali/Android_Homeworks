package qa.edu.qu.cse.cmps497.homework5;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import qa.edu.qu.cse.cmps497.homework5.utils.Utils;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: grab references to your textview and button here
        //TODO: set the button listener?

        //mTextView = ...
    }

    @Override
    protected void onResume() {

        Utils.setActivityResumed(true); // do not modify

        //TODO register receivers, update UI with current charging status
        super.onResume();
    }

    @Override
    protected void onPause() {

        Utils.setActivityResumed(false); //do not modify

        //TODO unregister your receivers
        super.onPause();
    }

    private void progressClicked() {
        //TODO: launch a progress dialog and make it last for 2 seconds
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //TODO: inflate the menu here
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //TODO: handle dialog launch. Preferably in another
        //TODO: private method called launchAboutDialog()
        switch (item.getItemId()) {
            //case XX:
            //
            //
            //default: return false;
        }

        return true;
    }

    private void launchAboutDialog() {
        //TODO: Launch the about dialog
    }

    private void setACConnected(boolean isConnected) {
        //TODO: must set button enabled/disabled
        //TODO: and the textfield's text and color
        if (isConnected) {
            //
        } else {
            //
        }
    }


    /**
     * Queries the battery charging status.
     * Uses something called Sticky intents (which we did not cover)
     *
     * @return true if battery is charging, false otherwise
     */
    private boolean isBatteryCharging() {
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent intent = registerReceiver(null, filter);
        return Utils.isBatteryCharging(intent);
    }
}
