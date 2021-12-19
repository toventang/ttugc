package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.PrivacySettingsApi */
public interface PrivacySettingsApi {

    /* renamed from: a */
    public static final C39725a f93571a = C39725a.f93572a;

    static {
        Covode.recordClassIndex(47452);
    }

    @AbstractC22012t(mo35799a = "/tiktok/privacy/user/follow_list_setting/update/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> setFollowList(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i);

    @AbstractC22012t(mo35799a = "/tiktok/privacy/user/im_setting/update/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> setImSetting(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i);

    @AbstractC22012t(mo35799a = "/tiktok/privacy/user/involve_setting/update/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> setInvolveSetting(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i);

    @AbstractC22012t(mo35799a = "/tiktok/privacy/user/item_setting/update/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> setItemSetting(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i);

    @AbstractC22012t(mo35799a = "/tiktok/privacy/user/liked_list_setting/update/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> setLikedList(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i);

    @AbstractC22012t(mo35799a = "/tiktok/privacy/user/private_account/update/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> setPrivateAccount(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i, @AbstractC21997e(mo35786a = "confirmed") int i2);

    @AbstractC22012t(mo35799a = "/tiktok/privacy/user/recommended_setting/update/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> setRecommendSetting(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i);

    @AbstractC22012t(mo35799a = "/tiktok/privacy/user/suggest_setting/update/v1")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> setSuggestionSetting(@AbstractC21997e(mo35786a = "field") String str, @AbstractC21997e(mo35786a = "value") int i);

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.PrivacySettingsApi$a */
    public static final class C39725a {

        /* renamed from: a */
        static final /* synthetic */ C39725a f93572a = new C39725a();

        private C39725a() {
        }

        static {
            Covode.recordClassIndex(47453);
        }
    }
}
