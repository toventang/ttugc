package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.f */
public final class C36959f {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f87039a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f87040b;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: c */
    public final C36958e f87041c;

    static {
        Covode.recordClassIndex(44307);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36959f)) {
            return false;
        }
        C36959f fVar = (C36959f) obj;
        return this.f87039a == fVar.f87039a && C89219l.m154714a(this.f87040b, fVar.f87040b) && C89219l.m154714a(this.f87041c, fVar.f87041c);
    }

    public final int hashCode() {
        int i = this.f87039a * 31;
        String str = this.f87040b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        C36958e eVar = this.f87041c;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "GiftSupporterPanelResponse(code=" + this.f87039a + ", msg=" + this.f87040b + ", data=" + this.f87041c + ")";
    }
}
