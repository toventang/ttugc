package com.bytedance.android.livesdk.container.util;

import android.content.res.Configuration;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.container.util.h */
public final class C8311h {

    /* renamed from: a */
    public static final C8311h f20584a = new C8311h();

    private C8311h() {
    }

    static {
        Covode.recordClassIndex(9148);
    }

    /* renamed from: a */
    public static String m16462a(Configuration configuration) {
        if (configuration != null && (configuration.uiMode & 48) == 32) {
            return "dark";
        }
        return "light";
    }
}
