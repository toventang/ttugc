package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFEvent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.internal.model.event.Purchase;
import com.appsflyer.internal.model.event.SdkServices;
import com.appsflyer.internal.model.event.Validate;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.x */
public final class RunnableC2343x implements Runnable {

    /* renamed from: ǃ */
    private static String f7115 = new StringBuilder("https://%svalidate.%s/api/v").append(AppsFlyerLibCore.f6863).append("/androidevent?buildnumber=5.4.1&app_id=").toString();

    /* renamed from: ι */
    private static String f7116 = "https://%ssdk-services.%s/validate-android-signature";

    /* renamed from: ı */
    private WeakReference<Context> f7117;

    /* renamed from: Ɩ */
    private String f7118;

    /* renamed from: ȷ */
    private Map<String, String> f7119;

    /* renamed from: ɩ */
    private String f7120;

    /* renamed from: ɹ */
    private String f7121;

    /* renamed from: Ι */
    private final Intent f7122;

    /* renamed from: І */
    private String f7123;

    /* renamed from: і */
    private String f7124;

    /* renamed from: Ӏ */
    private String f7125;

    static {
        Covode.recordClassIndex(2615);
    }

    public final void run() {
        String str = this.f7120;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isTrackingStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.f7117.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.f7123);
                    hashMap.put("sig-data", this.f7125);
                    hashMap.put("signature", this.f7124);
                    final HashMap hashMap2 = new HashMap(hashMap);
                    new Thread(new Runnable() {
                        /* class com.appsflyer.internal.RunnableC2343x.RunnableC23443 */

                        static {
                            Covode.recordClassIndex(2616);
                        }

                        public final void run() {
                            RunnableC2343x xVar = RunnableC2343x.this;
                            RunnableC2343x.m7155(xVar, hashMap2, xVar.f7119, RunnableC2343x.this.f7117);
                        }
                    }).start();
                    hashMap.put("dev_key", this.f7120);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    hashMap.put("advertiserId", AppsFlyerProperties.getInstance().getString("advertiserId"));
                    String jSONObject = new JSONObject(hashMap).toString();
                    String url = ServerConfigHandler.getUrl(f7116);
                    if (C2306ai.f6989 == null) {
                        C2306ai.f6989 = new C2306ai();
                    }
                    C2306ai.f6989.mo6445("server_request", url, jSONObject);
                    HttpURLConnection r5 = m7154((Purchase) new SdkServices().params(hashMap).urlString(url));
                    int i = -1;
                    if (r5 != null) {
                        i = r5.getResponseCode();
                    }
                    String r4 = AppsFlyerLibCore.getInstance().mo6355(r5);
                    if (C2306ai.f6989 == null) {
                        C2306ai.f6989 = new C2306ai();
                    }
                    C2306ai.f6989.mo6445("server_response", url, String.valueOf(i), r4);
                    JSONObject jSONObject2 = new JSONObject(r4);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        AFLogger.afInfoLog(new StringBuilder("Validate response 200 ok: ").append(jSONObject2.toString()).toString());
                        m7157(jSONObject2.optBoolean("result"), this.f7125, this.f7118, this.f7121, jSONObject2.toString());
                    } else {
                        AFLogger.afInfoLog("Failed Validate request");
                        m7157(false, this.f7125, this.f7118, this.f7121, jSONObject2.toString());
                    }
                    if (r5 != null) {
                        r5.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ǃ */
    private static HttpURLConnection m7154(Purchase purchase) {
        AFLogger.afDebugLog(new StringBuilder("Calling ").append(purchase.urlString()).toString());
        return new RunnableC2298ad(purchase.trackingStopped(AppsFlyerLib.getInstance().isTrackingStopped())).mo6441();
    }

    /* renamed from: Ι */
    static /* synthetic */ void m7155(RunnableC2343x xVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            String obj = new StringBuilder().append(ServerConfigHandler.getUrl(f7115)).append(((Context) weakReference.get()).getPackageName()).toString();
            String string = AppsFlyerLibCore.getSharedPreferences((Context) weakReference.get()).getString("referrer", "");
            AFEvent key = new Validate((Context) weakReference.get()).key(xVar.f7120);
            key.f6813 = string;
            key.f6814 = xVar.f7122;
            Map<String, Object> r4 = AppsFlyerLibCore.getInstance().mo6358(key);
            r4.put("price", xVar.f7118);
            r4.put("currency", xVar.f7121);
            r4.put("receipt_data", map);
            if (map2 != null) {
                r4.put("extra_prms", map2);
            }
            String jSONObject = new JSONObject(r4).toString();
            if (C2306ai.f6989 == null) {
                C2306ai.f6989 = new C2306ai();
            }
            C2306ai.f6989.mo6445("server_request", obj, jSONObject);
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection r2 = m7154((Purchase) key.params(r4).urlString(obj));
                int i = -1;
                if (r2 != null) {
                    i = r2.getResponseCode();
                }
                String r5 = AppsFlyerLibCore.getInstance().mo6355(r2);
                if (C2306ai.f6989 == null) {
                    C2306ai.f6989 = new C2306ai();
                }
                C2306ai.f6989.mo6445("server_response", obj, String.valueOf(i), r5);
                AFLogger.afInfoLog(new StringBuilder("Validate-WH response - ").append(i).append(": ").append(new JSONObject(r5).toString()).toString());
                if (r2 != null) {
                    r2.disconnect();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ι */
    private static void m7157(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLibCore.f6865 != null) {
            AFLogger.afDebugLog(new StringBuilder("Validate callback parameters: ").append(str).append(" ").append(str2).append(" ").append(str3).toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AppsFlyerLibCore.f6865.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLibCore.f6865;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    public RunnableC2343x(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Intent intent) {
        this.f7117 = new WeakReference<>(context);
        this.f7120 = str;
        this.f7123 = str2;
        this.f7125 = str4;
        this.f7118 = str5;
        this.f7121 = str6;
        this.f7119 = map;
        this.f7124 = str3;
        this.f7122 = intent;
    }
}
