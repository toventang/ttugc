package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.setting.model.C68179i;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.setting.api.LinkPrivacyPopupApi */
public interface LinkPrivacyPopupApi {

    /* renamed from: a */
    public static final C67993a f152332a = C67993a.f152333a;

    static {
        Covode.recordClassIndex(80181);
    }

    @AbstractC89722f(mo144276a = "/tiktok/v1/link/privacy/popup/status/")
    AbstractC88979t<C68179i> getLinkPrivacyPopupStatus();

    @AbstractC89731o(mo144285a = "/tiktok/v1/link/privacy/popup/status/update/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> updateLinkPrivacyPopupStatus(@AbstractC89719c(mo144273a = "displayed") boolean z);

    /* renamed from: com.ss.android.ugc.aweme.setting.api.LinkPrivacyPopupApi$a */
    public static final class C67993a {

        /* renamed from: a */
        static final /* synthetic */ C67993a f152333a = new C67993a();

        private C67993a() {
        }

        static {
            Covode.recordClassIndex(80182);
        }
    }
}
