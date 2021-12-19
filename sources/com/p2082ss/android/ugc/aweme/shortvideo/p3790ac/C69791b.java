package com.p2082ss.android.ugc.aweme.shortvideo.p3790ac;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ac.b */
public final class C69791b {
    static {
        Covode.recordClassIndex(82197);
    }

    /* renamed from: a */
    public static final String m123314a(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                if (i2 == 0) {
                    return "none";
                }
            } else if (i != 0) {
                if (i > 1 && i2 == 0) {
                    return "video";
                }
                if (i <= 0) {
                    return "";
                }
            }
            return i2 > 0 ? "mix" : "";
        } else if (i2 == 1) {
            return "none";
        }
        return i2 > 1 ? UGCMonitor.TYPE_PHOTO : "";
    }
}
