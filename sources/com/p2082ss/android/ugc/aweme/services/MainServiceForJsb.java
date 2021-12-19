package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.C30121a;
import com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl;
import com.p2082ss.android.ugc.aweme.launcher.service.account.C58078a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceForJsb */
public class MainServiceForJsb implements IMainServiceForJsb {
    public static final String JS_SDK_CONFIG_URL = C30121a.m59911a("/client_auth/js_sdk/config/v1/");

    @Override // com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb
    public String getSSLocalScheme() {
        return "sslocal";
    }

    @Override // com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb
    public String getJSSDKConfigUrl() {
        return JS_SDK_CONFIG_URL;
    }

    @Override // com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb
    public String getPlayNameMobile() {
        return C58078a.f132318a.mo95581d();
    }

    @Override // com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb
    public boolean hasPlatformBinded() {
        return C58078a.f132318a.mo95576a();
    }

    static {
        Covode.recordClassIndex(79684);
    }

    public long getUserId() {
        return Long.parseLong(C31575b.m65865g().getCurUserId());
    }

    public boolean isLogin() {
        return C31575b.m65865g().isLogin();
    }

    @Override // com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb
    public boolean isPlatformBinded(String str) {
        return C58078a.f132318a.mo95577a(str);
    }

    public boolean isBrowserActivity(Context context) {
        return CrossPlatformServiceImpl.m81709c().mo69601a().isInstance(context);
    }

    @Override // com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb
    public boolean isApiSuccess(JSONObject jSONObject) {
        if (jSONObject == null || !"success".equals(jSONObject.optString("message"))) {
            return false;
        }
        return true;
    }

    public static IMainServiceForJsb createIMainServiceForJsbbyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(4337);
        Object a = C81908b.m141854a(IMainServiceForJsb.class, z);
        if (a != null) {
            IMainServiceForJsb iMainServiceForJsb = (IMainServiceForJsb) a;
            MethodCollector.m26664o(4337);
            return iMainServiceForJsb;
        }
        if (C81908b.f183348ds == null) {
            synchronized (IMainServiceForJsb.class) {
                try {
                    if (C81908b.f183348ds == null) {
                        C81908b.f183348ds = new MainServiceForJsb();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4337);
                    throw th;
                }
            }
        }
        MainServiceForJsb mainServiceForJsb = (MainServiceForJsb) C81908b.f183348ds;
        MethodCollector.m26664o(4337);
        return mainServiceForJsb;
    }

    @Override // com.p2082ss.android.sdk.webview.p2176di.IMainServiceForJsb
    public void startAdsAppActivity(Activity activity, String str) {
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).startAdsAppActivity(activity, str, "");
    }
}
