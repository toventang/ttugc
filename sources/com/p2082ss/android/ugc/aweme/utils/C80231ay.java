package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.ay */
public final class C80231ay {
    static {
        Covode.recordClassIndex(93499);
    }

    /* renamed from: a */
    public static final Integer m139068a(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
