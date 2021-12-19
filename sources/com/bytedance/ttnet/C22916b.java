package com.bytedance.ttnet;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ttnet.b */
public final class C22916b {
    static {
        Covode.recordClassIndex(26824);
    }

    /* renamed from: a */
    public static String m43214a() {
        String c = TTNetInit.getTTNetDepend().mo37265c();
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        throw new IllegalArgumentException("hostSuffix is not init !!!");
    }
}
