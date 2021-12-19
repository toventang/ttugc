package com.p2082ss.android.ugc.aweme.feed.assem.desc;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.b */
public final class C48592b implements AbstractC12853j {

    /* renamed from: a */
    public final int f112387a;

    /* renamed from: b */
    public final int f112388b;

    /* renamed from: c */
    public final Integer f112389c;

    /* renamed from: d */
    public final Integer f112390d;

    /* renamed from: e */
    public final String f112391e;

    /* renamed from: f */
    public final boolean f112392f;

    static {
        Covode.recordClassIndex(57371);
    }

    /* renamed from: a */
    public static C48592b m91962a(int i, int i2, Integer num, Integer num2, String str, boolean z) {
        return new C48592b(i, i2, num, num2, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48592b)) {
            return false;
        }
        C48592b bVar = (C48592b) obj;
        return this.f112387a == bVar.f112387a && this.f112388b == bVar.f112388b && C89219l.m154714a(this.f112389c, bVar.f112389c) && C89219l.m154714a(this.f112390d, bVar.f112390d) && C89219l.m154714a(this.f112391e, bVar.f112391e) && this.f112392f == bVar.f112392f;
    }

    public final int hashCode() {
        int i = ((this.f112387a * 31) + this.f112388b) * 31;
        Integer num = this.f112389c;
        int i2 = 0;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f112390d;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f112391e;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f112392f;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "PromotedTagState(promotedTagVisibility=" + this.f112387a + ", transPromotedTagView=" + this.f112388b + ", bgColor=" + this.f112389c + ", textColor=" + this.f112390d + ", text=" + this.f112391e + ", useTransparent=" + this.f112392f + ")";
    }

    public /* synthetic */ C48592b() {
        this(8, 8, null, null, null, false);
    }

    private C48592b(int i, int i2, Integer num, Integer num2, String str, boolean z) {
        this.f112387a = i;
        this.f112388b = i2;
        this.f112389c = num;
        this.f112390d = num2;
        this.f112391e = str;
        this.f112392f = z;
    }
}
