package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings */
public class AdFeSettings {
    @AbstractC27891c(mo46611a = "legal_page")
    private String legalPage;
    @AbstractC27891c(mo46611a = "music_legal")
    private String musicLegal;
    @AbstractC27891c(mo46611a = "revenue_share")
    private RevenueShare revenueShare;

    static {
        Covode.recordClassIndex(62324);
    }

    public String getLegalPage() {
        String str = this.legalPage;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getMusicLegalPage() {
        String str = this.musicLegal;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public RevenueShare getRevenueShare() {
        RevenueShare revenueShare2 = this.revenueShare;
        if (revenueShare2 != null) {
            return revenueShare2;
        }
        throw new C16041a();
    }
}
