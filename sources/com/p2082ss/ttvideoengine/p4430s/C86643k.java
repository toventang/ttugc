package com.p2082ss.ttvideoengine.p4430s;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttvideoengine.s.k */
public final class C86643k {

    /* renamed from: a */
    public static int f195277a = 1;

    static {
        Covode.recordClassIndex(101871);
    }

    /* renamed from: a */
    public static String m150120a(String str) {
        if (f195277a != 1 || TextUtils.isEmpty(str) || !str.startsWith("http://")) {
            return str;
        }
        C86641i.m150110a("TTVideoEngineUtils", "fetch api need replace https");
        return str.replaceFirst("http://", "https://");
    }
}
