package com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.p2676a.C40088a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89720d;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi */
public final class FamilyPairingApi {

    /* renamed from: a */
    public static final String f94155a;

    /* renamed from: b */
    public static API f94156b;

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.api.FamilyPairingApi$API */
    public interface API {
        static {
            Covode.recordClassIndex(47864);
        }

        @AbstractC89722f(mo144276a = "/aweme/v2/guardian/platform/dynamic/password/")
        AbstractC88979t<C40088a> getDynamicPassword(@AbstractC89736t(mo144292a = "child_user_id") String str, @AbstractC89736t(mo144292a = "sec_child_user_id") String str2);

        @AbstractC89731o(mo144285a = "/aweme/v1/guardian/platform/child/restriction/management/")
        @AbstractC89721e
        AbstractC88979t<BaseResponse> modifyChildRestriction(@AbstractC89720d Map<String, String> map);

        @AbstractC89731o(mo144285a = "/aweme/v1/guardian/platform/child/manage/")
        @AbstractC89721e
        AbstractC88979t<BaseResponse> modifyChildSetting(@AbstractC89720d Map<String, String> map);

        @AbstractC89731o(mo144285a = "/aweme/v2/guardian/platform/verify/password/")
        @AbstractC89721e
        AbstractC88979t<BaseResponse> verifyPassword(@AbstractC89719c(mo144273a = "pass_code") String str);
    }

    static {
        Covode.recordClassIndex(47863);
        String str = Api.f79771d;
        f94155a = str;
        f94156b = (API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(API.class);
    }

    /* renamed from: a */
    public static AbstractC88979t<BaseResponse> m81069a(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map.isEmpty()) {
            return null;
        }
        map.put("user_id", str);
        map.put("sec_user_id", str2);
        return f94156b.modifyChildSetting(map);
    }
}
