package com.bytedance.creativex.recorder.filter.p942a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.filter.a.e */
public final class C14215e {

    /* renamed from: a */
    public final String f34497a;

    /* renamed from: b */
    public final AbstractC50707o f34498b;

    /* renamed from: c */
    public final AbstractC50705m f34499c;

    /* renamed from: d */
    public final AbstractC14220j f34500d;

    static {
        Covode.recordClassIndex(16284);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14215e)) {
            return false;
        }
        C14215e eVar = (C14215e) obj;
        return C89219l.m154714a(this.f34497a, eVar.f34497a) && C89219l.m154714a(this.f34498b, eVar.f34498b) && C89219l.m154714a(this.f34499c, eVar.f34499c) && C89219l.m154714a(this.f34500d, eVar.f34500d);
    }

    public final int hashCode() {
        String str = this.f34497a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC50707o oVar = this.f34498b;
        int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 31;
        AbstractC50705m mVar = this.f34499c;
        int hashCode3 = (hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        AbstractC14220j jVar = this.f34500d;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "FilterSourceData(name=" + this.f34497a + ", repository=" + this.f34498b + ", intensitySource=" + this.f34499c + ", logicStore=" + this.f34500d + ")";
    }

    public C14215e(String str, AbstractC50707o oVar, AbstractC50705m mVar, AbstractC14220j jVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(jVar, "");
        this.f34497a = str;
        this.f34498b = oVar;
        this.f34499c = mVar;
        this.f34500d = jVar;
    }
}
