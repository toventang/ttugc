package com.bytedance.sdk.bridge.p1695js.p1696a;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.C22685a;
import com.bytedance.sdk.bridge.C22700c;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.sdk.bridge.js.a.a */
public final class C22707a {

    /* renamed from: a */
    public static final WeakHashMap<WebView, Object> f53654a = new WeakHashMap<>();

    /* renamed from: b */
    public static final C22707a f53655b = new C22707a();

    /* renamed from: c */
    private static final String f53656c = f53656c;

    /* renamed from: d */
    private static final long f53657d = f53657d;

    /* renamed from: e */
    private static final String f53658e;

    /* renamed from: f */
    private static final String f53659f;

    /* renamed from: g */
    private static final String f53660g;

    /* renamed from: h */
    private static final Handler f53661h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private static final String f53662i = f53662i;

    private C22707a() {
    }

    static {
        String str;
        Covode.recordClassIndex(26528);
        StringBuilder sb = new StringBuilder();
        C22685a aVar = C22700c.f53620a;
        if (aVar == null || (str = aVar.f53592a) == null) {
            str = "nativeapp";
        }
        String sb2 = sb.append(str).append("://").toString();
        f53658e = sb2;
        f53659f = sb2 + "dispatch_message/";
        f53660g = sb2 + "private/setresult/";
    }
}
