package com.lynx.tasm.behavior.p2052ui.utils;

import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.behavior.ui.utils.d */
public class C28689d {
    static {
        Covode.recordClassIndex(34765);
    }

    /* renamed from: a */
    public static int m57434a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }
}
