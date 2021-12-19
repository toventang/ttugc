package com.bytedance.android.monitorV2.p735h.p736a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.bytedance.android.monitorV2.h.a.b */
public final class C12099b implements Comparable<C12099b> {

    /* renamed from: a */
    public String f29073a;

    /* renamed from: b */
    public C89350l f29074b;

    static {
        Covode.recordClassIndex(13828);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12099b)) {
            return false;
        }
        C12099b bVar = (C12099b) obj;
        return C89219l.m154714a(this.f29073a, bVar.f29073a) && C89219l.m154714a(this.f29074b, bVar.f29074b);
    }

    public final int hashCode() {
        String str = this.f29073a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C89350l lVar = this.f29074b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.f29073a + ": [" + this.f29074b + ']';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C12099b bVar) {
        C12099b bVar2 = bVar;
        C89219l.m154719c(bVar2, "");
        return bVar2.f29074b.getPattern().length() - this.f29074b.getPattern().length();
    }

    public C12099b(String str, C89350l lVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(lVar, "");
        this.f29073a = str;
        this.f29074b = lVar;
    }
}
