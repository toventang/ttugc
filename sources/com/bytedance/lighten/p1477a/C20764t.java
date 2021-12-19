package com.bytedance.lighten.p1477a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lighten.a.t */
public final class C20764t {
    static {
        Covode.recordClassIndex(24337);
    }

    /* renamed from: a */
    public static boolean m39067a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C20761r.m39063b().mo34143c(Uri.parse(str));
    }
}
