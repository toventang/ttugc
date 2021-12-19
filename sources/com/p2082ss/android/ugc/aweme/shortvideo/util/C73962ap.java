package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ap */
public final class C73962ap {
    static {
        Covode.recordClassIndex(86712);
    }

    /* renamed from: a */
    public static boolean m130083a(float f, float f2, float f3) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (!Float.isNaN(f) || !Float.isNaN(f2)) {
                return false;
            }
            return true;
        } else if (Math.abs(f2 - f) < f3) {
            return true;
        } else {
            return false;
        }
    }
}
