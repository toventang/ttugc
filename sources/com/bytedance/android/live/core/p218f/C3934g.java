package com.bytedance.android.live.core.p218f;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.f.g */
public final class C3934g {

    /* renamed from: a */
    private static SimpleDateFormat f10812a = new SimpleDateFormat("HH:mm:ss");

    /* renamed from: b */
    private static SimpleDateFormat f10813b = new SimpleDateFormat("HH:mm:ss SSS");

    /* renamed from: c */
    private static SimpleDateFormat f10814c = new SimpleDateFormat("HH:mm:ss.SSS");

    static {
        Covode.recordClassIndex(4463);
    }

    /* renamed from: a */
    public static String m9583a(String str, Object... objArr) {
        try {
            return C1764a.m5929a(Locale.US, str, objArr);
        } catch (Exception unused) {
            return "";
        }
    }
}
