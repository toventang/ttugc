package com.p2082ss.android.ugc.aweme.kids.api.abmock;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.api.abmock.b */
public final class C57150b {

    /* renamed from: a */
    public final String f130110a;

    /* renamed from: b */
    public final boolean f130111b;

    /* renamed from: c */
    public final Object f130112c;

    static {
        Covode.recordClassIndex(67047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57150b)) {
            return false;
        }
        C57150b bVar = (C57150b) obj;
        return C89219l.m154714a(this.f130110a, bVar.f130110a) && this.f130111b == bVar.f130111b && C89219l.m154714a(this.f130112c, bVar.f130112c);
    }

    public final int hashCode() {
        String str = this.f130110a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f130111b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        Object obj = this.f130112c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "KidsGroups(option=" + this.f130110a + ", isDefault=" + this.f130111b + ", value=" + this.f130112c + ")";
    }

    public C57150b(String str, boolean z, Object obj) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(obj, "");
        this.f130110a = str;
        this.f130111b = z;
        this.f130112c = obj;
    }
}
