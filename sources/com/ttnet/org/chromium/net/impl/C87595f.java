package com.ttnet.org.chromium.net.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ttnet.org.chromium.net.impl.f */
public final class C87595f {

    /* renamed from: a */
    public static Map<String, CronetUrlRequest> f198926a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(103577);
    }

    /* renamed from: a */
    public static void m152308a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f198926a.remove(str);
        }
    }

    /* renamed from: a */
    public static void m152309a(String str, CronetUrlRequest cronetUrlRequest) {
        if (!TextUtils.isEmpty(str)) {
            f198926a.put(str, cronetUrlRequest);
        }
    }
}
