package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.l */
public final class C39251l {
    @AbstractC27891c(mo46611a = "btn_content")

    /* renamed from: a */
    public final String f92728a;
    @AbstractC27891c(mo46611a = "btn_url")

    /* renamed from: b */
    public final String f92729b;
    @AbstractC27891c(mo46611a = "btn_type")

    /* renamed from: c */
    public final Integer f92730c;

    static {
        Covode.recordClassIndex(46909);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39251l)) {
            return false;
        }
        C39251l lVar = (C39251l) obj;
        return C89219l.m154714a(this.f92728a, lVar.f92728a) && C89219l.m154714a(this.f92729b, lVar.f92729b) && C89219l.m154714a(this.f92730c, lVar.f92730c);
    }

    public final int hashCode() {
        String str = this.f92728a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f92729b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f92730c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "PopButton(btnContent=" + this.f92728a + ", btnUrl=" + this.f92729b + ", btnType=" + this.f92730c + ")";
    }
}
