package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c.d */
public final class C82773d extends BaseResponse {
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: a */
    public final int f185024a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public final int f185025b;
    @AbstractC27891c(mo46611a = "powered_by")

    /* renamed from: c */
    public final String f185026c;
    @AbstractC27891c(mo46611a = "donation_text")

    /* renamed from: d */
    public final C82770a f185027d;
    @AbstractC27891c(mo46611a = "organizations")

    /* renamed from: e */
    public final List<C82772c> f185028e;

    static {
        Covode.recordClassIndex(96623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82773d)) {
            return false;
        }
        C82773d dVar = (C82773d) obj;
        return this.f185024a == dVar.f185024a && this.f185025b == dVar.f185025b && C89219l.m154714a(this.f185026c, dVar.f185026c) && C89219l.m154714a(this.f185027d, dVar.f185027d) && C89219l.m154714a(this.f185028e, dVar.f185028e);
    }

    public final int hashCode() {
        int i = ((this.f185024a * 31) + this.f185025b) * 31;
        String str = this.f185026c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        C82770a aVar = this.f185027d;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<C82772c> list = this.f185028e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "OrganizationResponse(cursor=" + this.f185024a + ", hasMore=" + this.f185025b + ", poweredBy=" + this.f185026c + ", matchDonationText=" + this.f185027d + ", orgList=" + this.f185028e + ")";
    }
}
