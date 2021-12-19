package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.api.ah */
public final class C4394ah {
    static {
        Covode.recordClassIndex(4970);
    }

    /* renamed from: a */
    public static boolean m10505a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: b */
    public static int m10506b(int i, int i2) {
        if (m10505a(i, i2)) {
            return i ^ i2;
        }
        return i;
    }
}
