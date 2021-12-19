package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39240a;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.api.AppealApi */
public interface AppealApi {

    /* renamed from: a */
    public static final C39318a f92808a = C39318a.f92810b;

    static {
        Covode.recordClassIndex(46997);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/data/user/info/request/list/")
    AbstractC88979t<String> apiUserInfo(@AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "cursor") int i2);

    @AbstractC89722f(mo144276a = "/aweme/v2/appeal/status/")
    C1731i<AppealStatusResponse> getUserAppealStatus(@AbstractC89736t(mo144292a = "object_type") String str, @AbstractC89736t(mo144292a = "object_id") String str2);

    @AbstractC89722f(mo144276a = "/tiktok/account/ban/detail/get/v1/")
    AbstractC88979t<C39240a> syncAccountBannedDetails();

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.api.AppealApi$a */
    public static final class C39318a {

        /* renamed from: a */
        public static final AppealApi f92809a = ((AppealApi) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(AppealApi.class));

        /* renamed from: b */
        static final /* synthetic */ C39318a f92810b = new C39318a();

        private C39318a() {
        }

        static {
            Covode.recordClassIndex(46998);
        }
    }
}
