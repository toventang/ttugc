package com.p2082ss.android.ugc.aweme.lancet.p3386c;

import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.lancet.c.c */
public final class C58015c {

    /* renamed from: a */
    public static volatile String f132219a;

    static {
        Covode.recordClassIndex(68050);
    }

    /* renamed from: a */
    public static String m104839a() {
        if (TextUtils.isEmpty(f132219a)) {
            try {
                Object obj = Reflect.m24528on(Class.forName("android.app.ActivityThread")).call("currentActivityThread").call("getProcessName").get();
                if (obj != null && (obj instanceof String)) {
                    String str = (String) obj;
                    f132219a = str;
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        return f132219a;
    }
}
