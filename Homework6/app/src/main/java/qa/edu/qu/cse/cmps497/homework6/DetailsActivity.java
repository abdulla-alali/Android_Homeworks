package qa.edu.qu.cse.cmps497.homework6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView mTextViewTitle, mTextViewSummary, mTextViewPoints, mTextViewPurpose, mTextViewDue;
    TextView mTextViewPleaseWait;
    ImageView mImageView;
    ProgressBar mProgressBar;

    final static String TAG = "DetailsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //TODO: grab references to your views
        //TODO: grab the extras you pushed and populate the views accordingly


        //TODO: if item has an image. Launch an asynctask to grab that image using its URL
        //TODO: otherwise, just put text "no screenshot available"
        //TODO: play with the views' Visibility to make them appear/disappear dynamically

    }



    //TODO: Your AsyncTask must retrieve the screenshot from the URL field
    //TODO: in your Model. It then needs to set the image to the ImageView of your activity

    //TODO: tip. After you open a HttpURLConnection and get an InputStream. Pass that InputStream
    //TODO: to:
    //BitmapFactory.decodeStream(in)
    //TODO: to get a Bitmap java object which you can set to your ImageView by calling
    //mImageView.setImageBitmap()

}
