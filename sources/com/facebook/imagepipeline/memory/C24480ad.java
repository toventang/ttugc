package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;

/* renamed from: com.facebook.imagepipeline.memory.ad */
public final class C24480ad {

    /* renamed from: a */
    public final int f58167a;

    /* renamed from: b */
    public final int f58168b;

    /* renamed from: c */
    public final SparseIntArray f58169c;

    /* renamed from: d */
    public final int f58170d;

    /* renamed from: e */
    public final int f58171e;

    /* renamed from: f */
    public boolean f58172f;

    /* renamed from: g */
    public final int f58173g;

    static {
        Covode.recordClassIndex(28624);
    }

    public C24480ad(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public C24480ad(int i, int i2, SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        boolean z;
        if (i < 0 || i2 < i) {
            z = false;
        } else {
            z = true;
        }
        C24091i.m45622b(z);
        this.f58168b = i;
        this.f58167a = i2;
        this.f58169c = sparseIntArray;
        this.f58170d = i3;
        this.f58171e = i4;
        this.f58173g = i5;
    }
}
