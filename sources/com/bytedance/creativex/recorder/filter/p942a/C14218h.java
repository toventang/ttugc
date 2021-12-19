package com.bytedance.creativex.recorder.filter.p942a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.a.h */
public final class C14218h {

    /* renamed from: a */
    public final C89378p<FilterBean, C14215e> f34501a;

    /* renamed from: b */
    public final C89378p<FilterBean, C14215e> f34502b;

    /* renamed from: c */
    public final EnumC14222l f34503c;

    static {
        Covode.recordClassIndex(16287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14218h)) {
            return false;
        }
        C14218h hVar = (C14218h) obj;
        return C89219l.m154714a(this.f34501a, hVar.f34501a) && C89219l.m154714a(this.f34502b, hVar.f34502b) && C89219l.m154714a(this.f34503c, hVar.f34503c);
    }

    public final int hashCode() {
        C89378p<FilterBean, C14215e> pVar = this.f34501a;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C89378p<FilterBean, C14215e> pVar2 = this.f34502b;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        EnumC14222l lVar = this.f34503c;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "FilterSwitchEvent(prev=" + this.f34501a + ", cur=" + this.f34502b + ", direction=" + this.f34503c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.p<? extends com.ss.android.ugc.aweme.filter.FilterBean, com.bytedance.creativex.recorder.filter.a.e> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.p<? extends com.ss.android.ugc.aweme.filter.FilterBean, com.bytedance.creativex.recorder.filter.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14218h(C89378p<? extends FilterBean, C14215e> pVar, C89378p<? extends FilterBean, C14215e> pVar2, EnumC14222l lVar) {
        C89219l.m154721d(lVar, "");
        this.f34501a = pVar;
        this.f34502b = pVar2;
        this.f34503c = lVar;
    }
}
