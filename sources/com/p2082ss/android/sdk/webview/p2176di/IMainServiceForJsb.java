package com.p2082ss.android.sdk.webview.p2176di;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.di.IMainServiceForJsb */
public interface IMainServiceForJsb {
    static {
        Covode.recordClassIndex(36758);
    }

    String getJSSDKConfigUrl();

    String getPlayNameMobile();

    String getSSLocalScheme();

    boolean hasPlatformBinded();

    boolean isApiSuccess(JSONObject jSONObject);

    boolean isPlatformBinded(String str);

    void startAdsAppActivity(Activity activity, String str);
}
