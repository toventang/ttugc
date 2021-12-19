package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.d */
public final class C44074d {
    @AbstractC27891c(mo46611a = "max_length")

    /* renamed from: a */
    public final Integer f102737a = null;
    @AbstractC27891c(mo46611a = "input_type")

    /* renamed from: b */
    public final Integer f102738b = null;
    @AbstractC27891c(mo46611a = "line_break")

    /* renamed from: c */
    public final boolean f102739c = false;
    @AbstractC27891c(mo46611a = "prefix")

    /* renamed from: d */
    public final String f102740d = null;

    static {
        Covode.recordClassIndex(52385);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44074d)) {
            return false;
        }
        C44074d dVar = (C44074d) obj;
        return C89219l.m154714a(this.f102737a, dVar.f102737a) && C89219l.m154714a(this.f102738b, dVar.f102738b) && this.f102739c == dVar.f102739c && C89219l.m154714a(this.f102740d, dVar.f102740d);
    }

    public final int hashCode() {
        Integer num = this.f102737a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f102738b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.f102739c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        String str = this.f102740d;
        if (str != null) {
            i = str.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "Configuration(maxLength=" + this.f102737a + ", inputType=" + this.f102738b + ", lineBreak=" + this.f102739c + ", prefix=" + this.f102740d + ")";
    }

    private C44074d() {
    }
}
