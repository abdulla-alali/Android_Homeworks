package qa.edu.qu.cse.cmps497.homework5.utils;

import android.content.Intent;
import android.os.BatteryManager;

/**
 * static methods to use in your code
 */
public class Utils {

    static boolean mIsResumed;

    public static boolean isActivityResumed() {
        return mIsResumed;
    }
    public static void setActivityResumed(boolean isResumed) {
        mIsResumed = isResumed;
    }

    //pass me an intent, and I'll tell you whether we're charging or not
    public static boolean isBatteryCharging(Intent intent) {
        int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        return (status == BatteryManager.BATTERY_STATUS_CHARGING);
    }
}
