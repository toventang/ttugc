package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17789d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.d */
public final class C17807d {

    /* renamed from: a */
    public boolean f42492a;

    /* renamed from: b */
    public boolean f42493b;

    /* renamed from: c */
    public List<? extends AbstractC17789d> f42494c;

    /* renamed from: d */
    public final List<String> f42495d;

    /* renamed from: e */
    public final List<String> f42496e;

    /* renamed from: f */
    public String f42497f;

    /* renamed from: g */
    public String f42498g;

    static {
        Covode.recordClassIndex(20371);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17807d)) {
            return false;
        }
        C17807d dVar = (C17807d) obj;
        return C89219l.m154714a(this.f42495d, dVar.f42495d) && C89219l.m154714a(this.f42496e, dVar.f42496e) && C89219l.m154714a(this.f42497f, dVar.f42497f) && C89219l.m154714a(this.f42498g, dVar.f42498g);
    }

    public final int hashCode() {
        List<String> list = this.f42495d;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f42496e;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f42497f;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f42498g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "RelationData(preLoads=" + this.f42495d + ", uriList=" + this.f42496e + ", owner=" + this.f42497f + ", stubOwner=" + this.f42498g + ")";
    }

    public /* synthetic */ C17807d(List list, List list2) {
        this(list, list2, null, null);
    }

    public C17807d(List<String> list, List<String> list2, String str, String str2) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        this.f42495d = list;
        this.f42496e = list2;
        this.f42497f = str;
        this.f42498g = str2;
    }
}
