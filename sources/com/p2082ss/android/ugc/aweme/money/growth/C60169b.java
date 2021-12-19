package com.p2082ss.android.ugc.aweme.money.growth;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.money.growth.b */
public final class C60169b {
    @AbstractC27891c(mo46611a = "campaign_id")

    /* renamed from: a */
    public final String f137156a;
    @AbstractC27891c(mo46611a = "campaign")

    /* renamed from: b */
    public final String f137157b;

    static {
        Covode.recordClassIndex(70698);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60169b)) {
            return false;
        }
        C60169b bVar = (C60169b) obj;
        return C89219l.m154714a(this.f137156a, bVar.f137156a) && C89219l.m154714a(this.f137157b, bVar.f137157b);
    }

    public final int hashCode() {
        String str = this.f137156a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f137157b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "GoogleCampaignInfo(campaignId=" + this.f137156a + ", campaign=" + this.f137157b + ")";
    }
}
