package com.p2082ss.android.ugc.aweme.compliance.common.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AlgoFreeSettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39262u;
import com.p2082ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.api.ComplianceApi */
public interface ComplianceApi {

    /* renamed from: a */
    public static final C39606a f93368a = C39606a.f93369a;

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.api.ComplianceApi$b */
    public static final class C39607b {
        static {
            Covode.recordClassIndex(47321);
        }
    }

    static {
        Covode.recordClassIndex(47319);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/algo/free/settings/")
    AbstractC88979t<AlgoFreeSettings> getAlgoFreeSettings();

    @AbstractC89722f(mo144276a = "/aweme/v1/compliance/settings/")
    AbstractC88979t<ComplianceSetting> getComplianceSetting(@AbstractC22018z(mo35807a = "teen_mode_status") int i, @AbstractC22018z(mo35807a = "ftc_child_mode") int i2);

    @AbstractC89722f(mo144276a = "/tiktok/v1/ultimate/cmpl/settings/")
    AbstractC88979t<C39262u> getUltimateComplianceSettings();

    @AbstractC89731o(mo144285a = "/aweme/v1/cmpl/set/settings/")
    AbstractC88979t<CmplRespForEncrypt> setComplianceSettings(@AbstractC22018z(mo35807a = "settings") String str);

    @AbstractC89722f(mo144276a = "/aweme/v1/user/set/settings/")
    AbstractC88979t<BaseResponse> setUserSetting(@AbstractC22018z(mo35807a = "field") String str, @AbstractC22018z(mo35807a = "value") int i);

    @AbstractC89722f(mo144276a = "/aweme/v1/user/set/settings/")
    AbstractC88979t<BaseResponse> setVPAContentChoice(@AbstractC22018z(mo35807a = "field") String str, @AbstractC22018z(mo35807a = "vpa_content_choice") int i);

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.api.ComplianceApi$a */
    public static final class C39606a {

        /* renamed from: a */
        static final /* synthetic */ C39606a f93369a = new C39606a();

        private C39606a() {
        }

        static {
            Covode.recordClassIndex(47320);
        }

        /* renamed from: a */
        public static ComplianceApi m80406a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(ComplianceApi.class);
            C89219l.m154716b(create, "");
            return (ComplianceApi) create;
        }
    }
}
