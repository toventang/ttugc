package com.bytedance.creativex.recorder.filter.p943b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.b.b */
public final class C14224b {

    /* renamed from: a */
    public final FilterBean f34511a;

    /* renamed from: b */
    public final float f34512b;

    /* renamed from: c */
    public final C14215e f34513c;

    static {
        Covode.recordClassIndex(16293);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14224b)) {
            return false;
        }
        C14224b bVar = (C14224b) obj;
        return C89219l.m154714a(this.f34511a, bVar.f34511a) && Float.compare(this.f34512b, bVar.f34512b) == 0 && C89219l.m154714a(this.f34513c, bVar.f34513c);
    }

    public final int hashCode() {
        FilterBean filterBean = this.f34511a;
        int i = 0;
        int hashCode = (((filterBean != null ? filterBean.hashCode() : 0) * 31) + Float.floatToIntBits(this.f34512b)) * 31;
        C14215e eVar = this.f34513c;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FilterData(filterBean=" + this.f34511a + ", intensity=" + this.f34512b + ", source=" + this.f34513c + ")";
    }

    public C14224b(FilterBean filterBean, float f, C14215e eVar) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(eVar, "");
        this.f34511a = filterBean;
        this.f34512b = f;
        this.f34513c = eVar;
    }
}
