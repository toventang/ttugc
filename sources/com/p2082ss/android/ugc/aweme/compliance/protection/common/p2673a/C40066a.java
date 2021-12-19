package com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a.a */
public final class C40066a {
    @AbstractC27891c(mo46611a = "screen_time_management")

    /* renamed from: a */
    public final Integer f94112a;
    @AbstractC27891c(mo46611a = "restrict_mode")

    /* renamed from: b */
    public final Integer f94113b;

    static {
        Covode.recordClassIndex(47837);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40066a)) {
            return false;
        }
        C40066a aVar = (C40066a) obj;
        return C89219l.m154714a(this.f94112a, aVar.f94112a) && C89219l.m154714a(this.f94113b, aVar.f94113b);
    }

    public final int hashCode() {
        Integer num = this.f94112a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f94113b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DigitalWellbeingBean(screenTimeManagement=" + this.f94112a + ", restrictMode=" + this.f94113b + ")";
    }

    public /* synthetic */ C40066a() {
        this(0, 0);
    }

    private C40066a(Integer num, Integer num2) {
        this.f94112a = num;
        this.f94113b = num2;
    }
}
