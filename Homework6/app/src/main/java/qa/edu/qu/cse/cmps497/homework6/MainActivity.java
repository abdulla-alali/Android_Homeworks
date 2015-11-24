package qa.edu.qu.cse.cmps497.homework6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    static final String TAG = "MainActivity";
    static final String URL = "http://www.devasque.com/cmps497/homeworks.json";

    TextView mTextView;
    ProgressBar mProgressBar;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: grab references to your activity's views
        //TODO: launch the AsyncTask to populate the listview
        //TODO: with online content


        //TODO: don't forget the listview's onItemClick listener
        //TODO: which will start new activities and push Extras() to them.

    }

}
