package com.p2082ss.android.ugc.aweme.feed.assem.photosensitivevideomask;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.j */
public final class C48896j implements AbstractC12853j {

    /* renamed from: a */
    public final int f112783a;

    /* renamed from: b */
    public final String f112784b;

    /* renamed from: c */
    public final String f112785c;

    /* renamed from: d */
    public final int f112786d;

    /* renamed from: e */
    public final int f112787e;

    static {
        Covode.recordClassIndex(57683);
    }

    /* renamed from: a */
    public static C48896j m92106a(int i, String str, String str2, int i2, int i3) {
        return new C48896j(i, str, str2, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48896j)) {
            return false;
        }
        C48896j jVar = (C48896j) obj;
        return this.f112783a == jVar.f112783a && C89219l.m154714a(this.f112784b, jVar.f112784b) && C89219l.m154714a(this.f112785c, jVar.f112785c) && this.f112786d == jVar.f112786d && this.f112787e == jVar.f112787e;
    }

    public final int hashCode() {
        int i = this.f112783a * 31;
        String str = this.f112784b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f112785c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((hashCode + i2) * 31) + this.f112786d) * 31) + this.f112787e;
    }

    public final String toString() {
        return "PhotosensitiveVideoMaskState(contentVisible=" + this.f112783a + ", titleText=" + this.f112784b + ", contentText=" + this.f112785c + ", positiveButtonVisible=" + this.f112786d + ", negativeButtonVisible=" + this.f112787e + ")";
    }

    public /* synthetic */ C48896j() {
        this(8, null, null, 8, 8);
    }

    private C48896j(int i, String str, String str2, int i2, int i3) {
        this.f112783a = i;
        this.f112784b = str;
        this.f112785c = str2;
        this.f112786d = i2;
        this.f112787e = i3;
    }
}
