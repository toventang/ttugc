package com.p2082ss.android.ugc.aweme.filter.p2983c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.c.a */
public final class C50649a {

    /* renamed from: a */
    public final boolean f116984a;

    /* renamed from: b */
    public final FilterBean f116985b;

    /* renamed from: c */
    public final boolean f116986c;

    /* renamed from: d */
    public final String f116987d;

    static {
        Covode.recordClassIndex(59811);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50649a)) {
            return false;
        }
        C50649a aVar = (C50649a) obj;
        return this.f116984a == aVar.f116984a && C89219l.m154714a(this.f116985b, aVar.f116985b) && this.f116986c == aVar.f116986c && C89219l.m154714a(this.f116987d, aVar.f116987d);
    }

    public final int hashCode() {
        boolean z = this.f116984a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        FilterBean filterBean = this.f116985b;
        int i6 = 0;
        int hashCode = (i5 + (filterBean != null ? filterBean.hashCode() : 0)) * 31;
        if (!this.f116986c) {
            i = 0;
        }
        int i7 = (hashCode + i) * 31;
        String str = this.f116987d;
        if (str != null) {
            i6 = str.hashCode();
        }
        return i7 + i6;
    }

    public final String toString() {
        return "FilterBeanOp(isAutoUse=" + this.f116984a + ", filter=" + this.f116985b + ", isComposerFilter=" + this.f116986c + ", curNodePath=" + this.f116987d + ")";
    }

    public /* synthetic */ C50649a(boolean z, FilterBean filterBean) {
        this(z, filterBean, false, null);
    }

    public C50649a(boolean z, FilterBean filterBean, boolean z2, String str) {
        this.f116984a = z;
        this.f116985b = filterBean;
        this.f116986c = false;
        this.f116987d = str;
    }
}
