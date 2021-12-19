package com.p2082ss.android.ugc.aweme.specact.p3926b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.b.a */
public final class C74936a {

    /* renamed from: a */
    public final int f168465a;

    /* renamed from: b */
    public final String f168466b;

    static {
        Covode.recordClassIndex(87804);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74936a)) {
            return false;
        }
        C74936a aVar = (C74936a) obj;
        return this.f168465a == aVar.f168465a && C89219l.m154714a(this.f168466b, aVar.f168466b);
    }

    public final int hashCode() {
        int i = this.f168465a * 31;
        String str = this.f168466b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ReportResult(type=" + this.f168465a + ", body=" + this.f168466b + ")";
    }

    public C74936a(int i, String str) {
        this.f168465a = i;
        this.f168466b = str;
    }
}
