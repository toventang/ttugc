package com.ttnet.org.chromium.base;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ttnet.org.chromium.base.a */
public class C87441a {

    /* renamed from: a */
    static final /* synthetic */ boolean f198336a = true;

    private C87441a() {
    }

    static {
        Covode.recordClassIndex(103370);
    }

    /* renamed from: a */
    public static int m151768a(Context context, String str, int i, int i2) {
        try {
            return context.checkPermission(str, i, i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }
}
