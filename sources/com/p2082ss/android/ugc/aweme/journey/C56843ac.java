package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.ac */
public final class C56843ac {
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: a */
    public final Integer f129437a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public final String f129438b;
    @AbstractC27891c(mo46611a = "subtitle")

    /* renamed from: c */
    public final String f129439c;

    static {
        Covode.recordClassIndex(66728);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56843ac)) {
            return false;
        }
        C56843ac acVar = (C56843ac) obj;
        return C89219l.m154714a(this.f129437a, acVar.f129437a) && C89219l.m154714a(this.f129438b, acVar.f129438b) && C89219l.m154714a(this.f129439c, acVar.f129439c);
    }

    public final int hashCode() {
        Integer num = this.f129437a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f129438b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f129439c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Options(value=" + this.f129437a + ", title=" + this.f129438b + ", subtitle=" + this.f129439c + ")";
    }
}
