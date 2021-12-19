package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.e */
public final class C43369e {
    @AbstractC27891c(mo46611a = "options")

    /* renamed from: a */
    public final List<C43368d> f101224a;
    @AbstractC27891c(mo46611a = "header")

    /* renamed from: b */
    public final C43371g f101225b;
    @AbstractC27891c(mo46611a = "session_key")

    /* renamed from: c */
    public final String f101226c;

    static {
        Covode.recordClassIndex(51595);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43369e)) {
            return false;
        }
        C43369e eVar = (C43369e) obj;
        return C89219l.m154714a(this.f101224a, eVar.f101224a) && C89219l.m154714a(this.f101225b, eVar.f101225b) && C89219l.m154714a(this.f101226c, eVar.f101226c);
    }

    public final int hashCode() {
        List<C43368d> list = this.f101224a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C43371g gVar = this.f101225b;
        int hashCode2 = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str = this.f101226c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CandInputDataOptions(candInputOptions=" + this.f101224a + ", candHeader=" + this.f101225b + ", sessionKey=" + this.f101226c + ")";
    }
}
