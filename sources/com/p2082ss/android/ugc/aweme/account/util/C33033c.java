package com.p2082ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.util.c */
public final class C33033c {

    /* renamed from: a */
    public static final C33033c f78578a = new C33033c();

    private C33033c() {
    }

    static {
        Covode.recordClassIndex(39840);
    }

    /* renamed from: a */
    public static Object m67667a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
