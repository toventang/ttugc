package com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a.c */
public final class C40068c {
    @AbstractC27891c(mo46611a = "screen_time_management")

    /* renamed from: a */
    public final Integer f94116a;
    @AbstractC27891c(mo46611a = "restrict_mode")

    /* renamed from: b */
    public final Integer f94117b;
    @AbstractC27891c(mo46611a = "search_restriction")

    /* renamed from: c */
    public final Integer f94118c;

    static {
        Covode.recordClassIndex(47839);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40068c)) {
            return false;
        }
        C40068c cVar = (C40068c) obj;
        return C89219l.m154714a(this.f94116a, cVar.f94116a) && C89219l.m154714a(this.f94117b, cVar.f94117b) && C89219l.m154714a(this.f94118c, cVar.f94118c);
    }

    public final int hashCode() {
        Integer num = this.f94116a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f94117b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f94118c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "GuardianRestrictionBean(screenTimeManagement=" + this.f94116a + ", restrictMode=" + this.f94117b + ", searchRestriction=" + this.f94118c + ")";
    }

    public /* synthetic */ C40068c() {
        this(0, 0, 0);
    }

    public C40068c(Integer num, Integer num2, Integer num3) {
        this.f94116a = num;
        this.f94117b = num2;
        this.f94118c = num3;
    }
}
