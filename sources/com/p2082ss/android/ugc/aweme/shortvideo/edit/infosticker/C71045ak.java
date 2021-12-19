package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ak */
public final class C71045ak {

    /* renamed from: a */
    static int f159067a;

    /* renamed from: b */
    public static int f159068b = 100;

    /* renamed from: c */
    public static final C71045ak f159069c = new C71045ak();

    /* renamed from: d */
    private static C1213t<Integer> f159070d = new C1213t<>();

    private C71045ak() {
    }

    static {
        Covode.recordClassIndex(83543);
    }

    /* renamed from: a */
    public static int m125453a() {
        int i = f159067a + 1;
        f159067a = i;
        int i2 = f159068b;
        if (i > i2) {
            int i3 = i2 + 50;
            f159068b = i3;
            f159070d.setValue(Integer.valueOf(i3));
        }
        return f159067a;
    }
}
