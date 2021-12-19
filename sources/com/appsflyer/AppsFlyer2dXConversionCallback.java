package com.appsflyer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener {
    static {
        Covode.recordClassIndex(2499);
    }

    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        m6941("onInstallConversionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        m6941("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        MethodCollector.m26663i(1575);
        onAppOpenAttributionNative(map);
        MethodCollector.m26664o(1575);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        MethodCollector.m26663i(1524);
        onInstallConversionDataLoadedNative(map);
        MethodCollector.m26664o(1524);
    }

    /* renamed from: Ι */
    private void m6941(String str, String str2) {
        MethodCollector.m26663i(1649);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "failure");
            jSONObject.put("data", str2);
            int hashCode = str.hashCode();
            if (hashCode != -1390007222) {
                if (hashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    onInstallConversionFailureNative(jSONObject);
                    MethodCollector.m26664o(1649);
                    return;
                }
            } else if (str.equals("onAttributionFailure")) {
                onAttributionFailureNative(jSONObject);
            }
            MethodCollector.m26664o(1649);
        } catch (JSONException e) {
            e.printStackTrace();
            MethodCollector.m26664o(1649);
        }
    }
}
