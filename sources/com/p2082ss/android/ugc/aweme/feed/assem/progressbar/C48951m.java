package com.p2082ss.android.ugc.aweme.feed.assem.progressbar;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.m */
public final class C48951m implements AbstractC12853j {

    /* renamed from: a */
    public final int f112848a;

    /* renamed from: b */
    public final boolean f112849b;

    /* renamed from: c */
    public final boolean f112850c;

    /* renamed from: d */
    public final int f112851d;

    /* renamed from: e */
    public final int f112852e;

    static {
        Covode.recordClassIndex(57739);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48951m)) {
            return false;
        }
        C48951m mVar = (C48951m) obj;
        return this.f112848a == mVar.f112848a && this.f112849b == mVar.f112849b && this.f112850c == mVar.f112850c && this.f112851d == mVar.f112851d && this.f112852e == mVar.f112852e;
    }

    public final int hashCode() {
        int i = this.f112848a * 31;
        boolean z = this.f112849b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        if (!this.f112850c) {
            i2 = 0;
        }
        return ((((i6 + i2) * 31) + this.f112851d) * 31) + this.f112852e;
    }

    public final String toString() {
        return "VideoProgressBarState(volume=" + this.f112848a + ", isCurrentShowing=" + this.f112849b + ", awesomeSplashing=" + this.f112850c + ", progress=" + this.f112851d + ", maxProgress=" + this.f112852e + ")";
    }

    public /* synthetic */ C48951m() {
        this(-1, false, false, 0, 0);
    }

    private C48951m(int i, boolean z, boolean z2, int i2, int i3) {
        this.f112848a = i;
        this.f112849b = z;
        this.f112850c = z2;
        this.f112851d = i2;
        this.f112852e = i3;
    }

    /* renamed from: a */
    public static /* synthetic */ C48951m m92133a(C48951m mVar, int i, boolean z, boolean z2, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i;
        boolean z3 = z;
        boolean z4 = z2;
        int i7 = i2;
        if ((i4 & 1) != 0) {
            i6 = mVar.f112848a;
        }
        if ((i4 & 2) != 0) {
            z3 = mVar.f112849b;
        }
        if ((i4 & 4) != 0) {
            z4 = mVar.f112850c;
        }
        if ((i4 & 8) != 0) {
            i7 = mVar.f112851d;
        }
        if ((i4 & 16) != 0) {
            i5 = mVar.f112852e;
        }
        return new C48951m(i6, z3, z4, i7, i5);
    }
}
