package com.p2082ss.android.ugc.awemepushlib.p4253os.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.awemepushlib.os.receiver.ScreenReceiver */
public class ScreenReceiver extends BroadcastReceiver {
    public static String sExtra;
    public static int sFrom = -1;
    public static String sMsg;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public void sendPush(Context context, String str, int i, String str2) {
    }

    static {
        Covode.recordClassIndex(95325);
    }

    public void onReceive(final Context context, Intent intent) {
        String action = intent.getAction();
        Logger.debug();
        if ("android.intent.action.USER_PRESENT".equals(action) && sFrom >= 0) {
            try {
                this.mHandler.postDelayed(new Runnable() {
                    /* class com.p2082ss.android.ugc.awemepushlib.p4253os.receiver.ScreenReceiver.RunnableC819061 */

                    static {
                        Covode.recordClassIndex(95326);
                    }

                    public void run() {
                        ScreenReceiver.this.sendPush(context, ScreenReceiver.sMsg, ScreenReceiver.sFrom, ScreenReceiver.sExtra);
                    }
                }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
