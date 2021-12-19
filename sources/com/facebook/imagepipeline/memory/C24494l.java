package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.imagepipeline.memory.l */
public final class C24494l {

    /* renamed from: a */
    public static final int f58200a = Runtime.getRuntime().availableProcessors();

    static {
        Covode.recordClassIndex(28638);
    }

    /* renamed from: a */
    public static SparseIntArray m46792a(int i) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i2 = 131072;
        do {
            sparseIntArray.put(i2, i);
            i2 *= 2;
        } while (i2 <= 4194304);
        return sparseIntArray;
    }
}
