package com.p2082ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyRestrictionApi */
public interface PrivacyRestrictionApi {

    /* renamed from: a */
    public static final C39655a f93453a = C39655a.f93454a;

    static {
        Covode.recordClassIndex(47374);
    }

    @AbstractC22000h(mo35789a = "/tiktok/privacy/setting/restriction/v1")
    AbstractC88979t<PrivacyRestrictionResponse> fetchPrivacyRestriction();

    @AbstractC22012t(mo35799a = "/tiktok/privacy/agreement/record/agree/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> updateAgreement(@AbstractC21997e(mo35786a = "record_name") String str);

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyRestrictionApi$a */
    public static final class C39655a {

        /* renamed from: a */
        static final /* synthetic */ C39655a f93454a = new C39655a();

        private C39655a() {
        }

        static {
            Covode.recordClassIndex(47375);
        }
    }
}
