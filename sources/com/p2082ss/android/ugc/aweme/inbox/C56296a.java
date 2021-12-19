package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.a */
public final class C56296a {

    /* renamed from: a */
    public final EnumC56315b f128431a;

    /* renamed from: b */
    public final int f128432b;

    /* renamed from: c */
    public final int f128433c;

    static {
        Covode.recordClassIndex(66114);
    }

    /* renamed from: a */
    public static C56296a m102296a(EnumC56315b bVar, int i, int i2) {
        C89219l.m154721d(bVar, "");
        return new C56296a(bVar, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56296a)) {
            return false;
        }
        C56296a aVar = (C56296a) obj;
        return C89219l.m154714a(this.f128431a, aVar.f128431a) && this.f128432b == aVar.f128432b && this.f128433c == aVar.f128433c;
    }

    public final int hashCode() {
        EnumC56315b bVar = this.f128431a;
        return ((((bVar != null ? bVar.hashCode() : 0) * 31) + this.f128432b) * 31) + this.f128433c;
    }

    public final String toString() {
        return "AdapterChangeInfo(type=" + this.f128431a + ", start=" + this.f128432b + ", itemCount=" + this.f128433c + ")";
    }

    public /* synthetic */ C56296a() {
        this(EnumC56315b.INSERT, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private C56296a(EnumC56315b bVar, int i, int i2) {
        C89219l.m154721d(bVar, "");
        this.f128431a = bVar;
        this.f128432b = i;
        this.f128433c = i2;
    }
}
