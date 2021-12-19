package com.bytedance.android.livesdk.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.C21218m;

/* renamed from: com.bytedance.android.livesdk.browser.c */
public final class C6952c {

    /* renamed from: a */
    public static final C6952c f17374a = new C6952c();

    /* renamed from: b */
    private static int f17375b;

    /* renamed from: c */
    private static int f17376c;

    private C6952c() {
    }

    static {
        Covode.recordClassIndex(7691);
    }

    /* renamed from: a */
    public static final String m14837a() {
        StringBuilder sb = new StringBuilder("WEBVIEW_");
        int i = f17375b;
        f17375b = i + 1;
        return sb.append(i).toString();
    }

    /* renamed from: b */
    public static final String m14838b() {
        StringBuilder sb = new StringBuilder(C21218m.f50362d);
        int i = f17376c;
        f17376c = i + 1;
        return sb.append(i).toString();
    }
}
