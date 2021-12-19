package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.imagepipeline.memory.k */
public final class C24493k {

    /* renamed from: a */
    private static final SparseIntArray f58199a = new SparseIntArray(0);

    static {
        Covode.recordClassIndex(28637);
    }

    /* renamed from: a */
    public static C24480ad m46791a() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        return new C24480ad(0, i, f58199a);
    }
}
