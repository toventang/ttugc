package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.ep */
public final class C80400ep {
    static {
        Covode.recordClassIndex(93668);
    }

    /* renamed from: a */
    public static void m139375a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str) || (!str.contains("check/in") && !str.contains("story") && !str.contains("rec/new") && !str.contains("follow/feed"))) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (i == 8 && createIUserServicebyMonsterPlugin.isLogin()) {
                try {
                    C31575b.m65860b().logout("LoginoutMonitorHelperLancet", "sdk_expired_logout");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorDesc", "api return errorcode==8");
                    jSONObject.put("errorUrl", str);
                    jSONObject.put("errorCookies", CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost()));
                    jSONObject.put("errorResponse", str2);
                    C34611o.m70671b("aweme_user_logout", "", jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
