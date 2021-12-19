package com.facebook.internal;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.internal.u */
public final class C24780u {

    /* renamed from: a */
    public static volatile String f58799a;

    static {
        Covode.recordClassIndex(28933);
    }

    /* renamed from: a */
    public static boolean m47438a() {
        if (f58799a == null || !f58799a.startsWith("Unity.")) {
            return false;
        }
        return true;
    }
}
