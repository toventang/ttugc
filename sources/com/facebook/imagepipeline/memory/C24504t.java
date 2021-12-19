package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;

/* renamed from: com.facebook.imagepipeline.memory.t */
public final class C24504t {
    static {
        Covode.recordClassIndex(28648);
    }

    /* renamed from: a */
    static int m46821a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* renamed from: a */
    static void m46822a(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C24091i.m45620a(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C24091i.m45620a(z3);
        if (i + i4 <= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        C24091i.m45620a(z4);
        if (i3 + i4 > i2) {
            z5 = false;
        }
        C24091i.m45620a(z5);
    }
}
