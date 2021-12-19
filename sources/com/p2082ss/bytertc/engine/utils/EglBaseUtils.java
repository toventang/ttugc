package com.p2082ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import org.webrtc.EglBase;

/* renamed from: com.ss.bytertc.engine.utils.EglBaseUtils */
public class EglBaseUtils {
    static {
        Covode.recordClassIndex(101145);
    }

    public static long getNativeContextFromEGLBaseContext(EglBase.Context context) {
        if (context != null) {
            return context.getNativeEglContext();
        }
        return 0;
    }
}
