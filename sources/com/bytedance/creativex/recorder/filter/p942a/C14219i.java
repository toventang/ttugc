package com.bytedance.creativex.recorder.filter.p942a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.a.i */
public final class C14219i {

    /* renamed from: a */
    public final FilterBean f34504a;

    /* renamed from: b */
    public final C14215e f34505b;

    /* renamed from: c */
    public final boolean f34506c;

    /* renamed from: d */
    public final String f34507d;

    static {
        Covode.recordClassIndex(16288);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14219i)) {
            return false;
        }
        C14219i iVar = (C14219i) obj;
        return C89219l.m154714a(this.f34504a, iVar.f34504a) && C89219l.m154714a(this.f34505b, iVar.f34505b) && this.f34506c == iVar.f34506c && C89219l.m154714a(this.f34507d, iVar.f34507d);
    }

    public final int hashCode() {
        FilterBean filterBean = this.f34504a;
        int i = 0;
        int hashCode = (filterBean != null ? filterBean.hashCode() : 0) * 31;
        C14215e eVar = this.f34505b;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        boolean z = this.f34506c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        String str = this.f34507d;
        if (str != null) {
            i = str.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "FilterUpdateEvent(filter=" + this.f34504a + ", source=" + this.f34505b + ", fromUser=" + this.f34506c + ", enterFrom=" + this.f34507d + ")";
    }

    public C14219i(FilterBean filterBean, C14215e eVar, boolean z, String str) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(eVar, "");
        this.f34504a = filterBean;
        this.f34505b = eVar;
        this.f34506c = z;
        this.f34507d = str;
    }
}
