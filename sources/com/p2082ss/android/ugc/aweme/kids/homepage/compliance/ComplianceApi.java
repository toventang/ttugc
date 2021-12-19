package com.p2082ss.android.ugc.aweme.kids.homepage.compliance;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsSettings;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.ComplianceApi */
public interface ComplianceApi {

    /* renamed from: a */
    public static final C57634a f131546a = C57634a.f131547a;

    static {
        Covode.recordClassIndex(67595);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/kids/check/in/")
    AbstractC88979t<BaseResponse> checkIn();

    @AbstractC22000h(mo35789a = "/tiktok/v1/kids/settings/")
    AbstractC88979t<KidsSettings> getKidsSettings();

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.compliance.ComplianceApi$a */
    public static final class C57634a {

        /* renamed from: a */
        static final /* synthetic */ C57634a f131547a = new C57634a();

        private C57634a() {
        }

        static {
            Covode.recordClassIndex(67596);
        }
    }
}
