package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.v */
public final class C57053v {
    @AbstractC27891c(mo46611a = "interest_list")

    /* renamed from: a */
    public final List<C57054w> f129910a;

    /* renamed from: b */
    public final boolean f129911b;

    static {
        Covode.recordClassIndex(66943);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57053v)) {
            return false;
        }
        C57053v vVar = (C57053v) obj;
        return C89219l.m154714a(this.f129910a, vVar.f129910a) && this.f129911b == vVar.f129911b;
    }

    public final int hashCode() {
        List<C57054w> list = this.f129910a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f129911b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "NewUserInterestPageStruct(interest_list=" + this.f129910a + ", isDefault=" + this.f129911b + ")";
    }
}
