package com.p2082ss.android.ugc.aweme.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.p1007g.p1008a.C14844a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.utils.co */
public final class C80309co {

    /* renamed from: a */
    private static boolean f179837a;

    /* renamed from: b */
    private static boolean f179838b;

    static {
        Covode.recordClassIndex(93577);
    }

    /* renamed from: a */
    public static boolean m139212a() {
        boolean z;
        String str;
        if (f179838b) {
            return f179837a;
        }
        if (Build.VERSION.SDK_INT < 21 || !C14844a.m27267a().booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        f179837a = z;
        HashMap hashMap = new HashMap();
        if (f179837a) {
            str = "true";
        } else {
            str = "false";
        }
        hashMap.put("webview_use_zorder", str);
        Npth.addTags(hashMap);
        f179838b = true;
        return f179837a;
    }
}
