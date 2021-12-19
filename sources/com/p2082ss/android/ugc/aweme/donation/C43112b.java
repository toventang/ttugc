package com.p2082ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.b */
public final class C43112b extends BaseResponse {
    @AbstractC27891c(mo46611a = "ngo_struct")

    /* renamed from: a */
    public final C43148f f100457a;
    @AbstractC27891c(mo46611a = "donor_list")

    /* renamed from: b */
    public final List<C43147e> f100458b;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: c */
    public final Integer f100459c;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: d */
    public final Boolean f100460d;
    @AbstractC27891c(mo46611a = "banner")

    /* renamed from: e */
    public final C43111a f100461e;
    @AbstractC27891c(mo46611a = "donation_summary")

    /* renamed from: f */
    public final String f100462f;

    static {
        Covode.recordClassIndex(51283);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43112b)) {
            return false;
        }
        C43112b bVar = (C43112b) obj;
        return C89219l.m154714a(this.f100457a, bVar.f100457a) && C89219l.m154714a(this.f100458b, bVar.f100458b) && C89219l.m154714a(this.f100459c, bVar.f100459c) && C89219l.m154714a(this.f100460d, bVar.f100460d) && C89219l.m154714a(this.f100461e, bVar.f100461e) && C89219l.m154714a(this.f100462f, bVar.f100462f);
    }

    public final int hashCode() {
        C43148f fVar = this.f100457a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        List<C43147e> list = this.f100458b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.f100459c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f100460d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        C43111a aVar = this.f100461e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f100462f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DonateResponse(ngo=" + this.f100457a + ", donorList=" + this.f100458b + ", cursor=" + this.f100459c + ", hasMore=" + this.f100460d + ", banner=" + this.f100461e + ", donationSummary=" + this.f100462f + ")";
    }

    public C43112b(C43148f fVar, List<C43147e> list, Integer num, Boolean bool, C43111a aVar, String str) {
        this.f100457a = fVar;
        this.f100458b = list;
        this.f100459c = num;
        this.f100460d = bool;
        this.f100461e = aVar;
        this.f100462f = str;
    }
}
