package com.p2082ss.bytertc.base.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.webrtc.ContextUtils;

/* renamed from: com.ss.bytertc.base.utils.RtcContextUtils */
public class RtcContextUtils {
    private static Context applicationContext;

    static {
        Covode.recordClassIndex(100869);
    }

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    public static void initialize(Context context) {
        if (context != null) {
            ContextUtils.initialize(context);
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }
}
