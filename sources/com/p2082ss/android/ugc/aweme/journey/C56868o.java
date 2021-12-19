package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.o */
public final class C56868o extends BaseResponse {
    @AbstractC27891c(mo46611a = "new_user_interest_page")

    /* renamed from: a */
    public final C57053v f129497a;
    @AbstractC27891c(mo46611a = "new_user_content_language_page")

    /* renamed from: b */
    public final C56864k f129498b;
    @AbstractC27891c(mo46611a = "gender_selection_page")

    /* renamed from: c */
    public final C56867n f129499c;
    @AbstractC27891c(mo46611a = "pers_ad")

    /* renamed from: d */
    public final C56845ae f129500d;
    @AbstractC27891c(mo46611a = "journey_flow")

    /* renamed from: e */
    public final C56866m f129501e;
    @AbstractC27891c(mo46611a = "ordered_flow")

    /* renamed from: f */
    public final C56844ad f129502f;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: g */
    public final C57045t f129503g;
    @AbstractC27891c(mo46611a = "topic_interest")

    /* renamed from: h */
    public final List<C56849ai> f129504h;

    /* renamed from: i */
    public final boolean f129505i;

    static {
        Covode.recordClassIndex(66754);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56868o)) {
            return false;
        }
        C56868o oVar = (C56868o) obj;
        return C89219l.m154714a(this.f129497a, oVar.f129497a) && C89219l.m154714a(this.f129498b, oVar.f129498b) && C89219l.m154714a(this.f129499c, oVar.f129499c) && C89219l.m154714a(this.f129500d, oVar.f129500d) && C89219l.m154714a(this.f129501e, oVar.f129501e) && C89219l.m154714a(this.f129502f, oVar.f129502f) && C89219l.m154714a(this.f129503g, oVar.f129503g) && C89219l.m154714a(this.f129504h, oVar.f129504h) && this.f129505i == oVar.f129505i;
    }

    public final int hashCode() {
        C57053v vVar = this.f129497a;
        int i = 0;
        int hashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        C56864k kVar = this.f129498b;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C56867n nVar = this.f129499c;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        C56845ae aeVar = this.f129500d;
        int hashCode4 = (hashCode3 + (aeVar != null ? aeVar.hashCode() : 0)) * 31;
        C56866m mVar = this.f129501e;
        int hashCode5 = (hashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C56844ad adVar = this.f129502f;
        int hashCode6 = (hashCode5 + (adVar != null ? adVar.hashCode() : 0)) * 31;
        C57045t tVar = this.f129503g;
        int hashCode7 = (hashCode6 + (tVar != null ? tVar.hashCode() : 0)) * 31;
        List<C56849ai> list = this.f129504h;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode7 + i) * 31;
        boolean z = this.f129505i;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "JourneyResponse(new_user_interest_page=" + this.f129497a + ", new_user_content_language_page=" + this.f129498b + ", gender_selection_page=" + this.f129499c + ", personalizationAd=" + this.f129500d + ", journey_flow=" + this.f129501e + ", orderedFlow=" + this.f129502f + ", logPb=" + this.f129503g + ", topicInterestList=" + this.f129504h + ", isDefault=" + this.f129505i + ")";
    }
}
