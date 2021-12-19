package com.p2082ss.android.ugc.aweme.following.p3002a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.a.e */
public final class C51106e {

    /* renamed from: a */
    public final int f117928a;

    /* renamed from: b */
    public final boolean f117929b;

    /* renamed from: c */
    public final String f117930c;

    static {
        Covode.recordClassIndex(60303);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51106e)) {
            return false;
        }
        C51106e eVar = (C51106e) obj;
        return this.f117928a == eVar.f117928a && this.f117929b == eVar.f117929b && C89219l.m154714a(this.f117930c, eVar.f117930c);
    }

    public final int hashCode() {
        int i = this.f117928a * 31;
        boolean z = this.f117929b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        String str = this.f117930c;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RelationStatusItem(type=" + this.f117928a + ", isMySelf=" + this.f117929b + ", des=" + this.f117930c + ")";
    }

    public /* synthetic */ C51106e(int i, boolean z) {
        this(i, z, "");
    }

    public C51106e(int i, boolean z, String str) {
        C89219l.m154721d(str, "");
        this.f117928a = i;
        this.f117929b = z;
        this.f117930c = str;
    }
}
