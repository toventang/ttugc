package com.bytedance.android.live.broadcast.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.utils.g */
public final class C3728g {

    /* renamed from: a */
    public static final C3728g f10325a = new C3728g();

    private C3728g() {
    }

    static {
        Covode.recordClassIndex(4243);
    }

    /* renamed from: a */
    public static int m9238a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 1;
        }
        while (true) {
            int i3 = i % i2;
            if (i3 == 0) {
                return i2;
            }
            i2 = i3;
            i = i2;
        }
    }
}
