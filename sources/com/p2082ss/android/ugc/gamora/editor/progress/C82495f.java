package com.p2082ss.android.ugc.gamora.editor.progress;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.gamora.editor.progress.f */
public final class C82495f {
    static {
        Covode.recordClassIndex(96337);
    }

    /* renamed from: a */
    public static final String m142603a(float f) {
        int i = (int) (f / 1000.0f);
        int i2 = i / 60;
        int i3 = i % 60;
        String valueOf = String.valueOf(i2);
        String valueOf2 = String.valueOf(i3);
        if (i3 < 10) {
            valueOf2 = "0".concat(String.valueOf(i3));
        }
        return valueOf + ":" + valueOf2;
    }
}
