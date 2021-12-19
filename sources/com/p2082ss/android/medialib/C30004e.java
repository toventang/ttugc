package com.p2082ss.android.medialib;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.medialib.e */
public final class C30004e {
    static {
        Covode.recordClassIndex(36457);
    }

    /* renamed from: a */
    public static boolean m60552a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
