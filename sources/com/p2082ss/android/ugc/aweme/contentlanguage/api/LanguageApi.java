package com.p2082ss.android.ugc.aweme.contentlanguage.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi */
public interface LanguageApi {
    static {
        Covode.recordClassIndex(47979);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/config/list/")
    AbstractC88979t<ConfigListResponse> getUnloginContentLanguage(@AbstractC89736t(mo144292a = "type") String str, @AbstractC89736t(mo144292a = "content_language") String str2);

    @AbstractC89722f(mo144276a = "/aweme/v1/config/list/")
    AbstractC88979t<ConfigListResponse> getUserConfig(@AbstractC89736t(mo144292a = "type") String str);

    @AbstractC89731o(mo144285a = "/aweme/v1/user/set/settings/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> setContentLanguage(@AbstractC89719c(mo144273a = "field") String str, @AbstractC89719c(mo144273a = "content_language") String str2, @AbstractC89719c(mo144273a = "action_type") int i);

    @AbstractC89731o(mo144285a = "/aweme/v1/user/set/settings/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> setContentLanguageDialogShown(@AbstractC89719c(mo144273a = "field") String str);

    @AbstractC89731o(mo144285a = "/aweme/v1/user/set/settings/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> setUnloginContentPreference(@AbstractC89719c(mo144273a = "field") String str, @AbstractC89719c(mo144273a = "settings_not_login") String str2);
}
