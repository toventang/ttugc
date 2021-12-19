package com.bytedance.creativex.recorder.filter.p942a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.a.b */
public final class C14212b {

    /* renamed from: a */
    public final FilterBean f34493a;

    /* renamed from: b */
    public final C14215e f34494b;

    /* renamed from: c */
    public final String f34495c;

    /* renamed from: d */
    public final Float f34496d;

    static {
        Covode.recordClassIndex(16281);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14212b)) {
            return false;
        }
        C14212b bVar = (C14212b) obj;
        return C89219l.m154714a(this.f34493a, bVar.f34493a) && C89219l.m154714a(this.f34494b, bVar.f34494b) && C89219l.m154714a(this.f34495c, bVar.f34495c) && C89219l.m154714a(this.f34496d, bVar.f34496d);
    }

    public final int hashCode() {
        FilterBean filterBean = this.f34493a;
        int i = 0;
        int hashCode = (filterBean != null ? filterBean.hashCode() : 0) * 31;
        C14215e eVar = this.f34494b;
        int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str = this.f34495c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Float f = this.f34496d;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "FilterApplyData(filter=" + this.f34493a + ", source=" + this.f34494b + ", filePath=" + this.f34495c + ", intensity=" + this.f34496d + ")";
    }

    public C14212b(FilterBean filterBean, C14215e eVar, String str, Float f) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        this.f34493a = filterBean;
        this.f34494b = eVar;
        this.f34495c = str;
        this.f34496d = f;
    }
}
