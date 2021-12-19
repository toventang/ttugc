package com.bytedance.sdk.bdlynx.container;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22643f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.container.b */
public final class C22629b {

    /* renamed from: a */
    public String f53450a;

    /* renamed from: b */
    public final String f53451b;

    /* renamed from: c */
    public final String f53452c;

    /* renamed from: d */
    public C22643f f53453d;

    static {
        Covode.recordClassIndex(26446);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22629b)) {
            return false;
        }
        C22629b bVar = (C22629b) obj;
        return C89219l.m154714a(this.f53451b, bVar.f53451b) && C89219l.m154714a(this.f53452c, bVar.f53452c) && C89219l.m154714a(this.f53453d, bVar.f53453d);
    }

    public final int hashCode() {
        String str = this.f53451b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f53452c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C22643f fVar = this.f53453d;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BDLynxUriEntity(groupId=" + this.f53451b + ", cardId=" + this.f53452c + ", extras=" + this.f53453d + ")";
    }

    public C22629b(String str, String str2, C22643f fVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f53451b = str;
        this.f53452c = str2;
        this.f53453d = fVar;
    }
}
