package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.c */
public final class C43367c {
    @AbstractC27891c(mo46611a = "region_autofill_hint_message")

    /* renamed from: a */
    public final String f101218a;
    @AbstractC27891c(mo46611a = "option")

    /* renamed from: b */
    public final C43368d f101219b;

    static {
        Covode.recordClassIndex(51593);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43367c)) {
            return false;
        }
        C43367c cVar = (C43367c) obj;
        return C89219l.m154714a(this.f101218a, cVar.f101218a) && C89219l.m154714a(this.f101219b, cVar.f101219b);
    }

    public final int hashCode() {
        String str = this.f101218a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C43368d dVar = this.f101219b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CandDetailPlaceResponse(regionAutofillHintMessage=" + this.f101218a + ", candDetailPlaceOption=" + this.f101219b + ")";
    }
}
