package com.bytedance.ies.xbridge.p1301e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.e.a */
public final class C18484a implements Comparable<C18484a> {

    /* renamed from: a */
    public String f44128a = "";

    /* renamed from: b */
    public final String f44129b;

    /* renamed from: c */
    public final long f44130c;

    /* renamed from: d */
    public final AbstractC18754n f44131d;

    static {
        Covode.recordClassIndex(21178);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18484a)) {
            return false;
        }
        C18484a aVar = (C18484a) obj;
        return C89219l.m154714a(this.f44129b, aVar.f44129b) && this.f44130c == aVar.f44130c && C89219l.m154714a(this.f44131d, aVar.f44131d);
    }

    public final int hashCode() {
        String str = this.f44129b;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f44130c;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        AbstractC18754n nVar = this.f44131d;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Event(eventName=" + this.f44129b + ", timestamp=" + this.f44130c + ", params=" + this.f44131d + ")";
    }

    /* renamed from: a */
    public final void mo29624a(String str) {
        C89219l.m154719c(str, "");
        this.f44128a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C18484a aVar) {
        C18484a aVar2 = aVar;
        C89219l.m154719c(aVar2, "");
        if (this.f44130c != aVar2.f44130c) {
            return C89090a.m154604a(Long.valueOf(this.f44130c), Long.valueOf(aVar2.f44130c));
        }
        return -1;
    }

    public C18484a(String str, long j, AbstractC18754n nVar) {
        C89219l.m154719c(str, "");
        this.f44129b = str;
        this.f44130c = j;
        this.f44131d = nVar;
    }
}
