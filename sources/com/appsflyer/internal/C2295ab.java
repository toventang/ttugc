package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFDeepLinkManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ab */
public final class C2295ab extends OneLinkHttpTask {

    /* renamed from: ǃ */
    private static List<String> f6969 = Arrays.asList("onelink.me", "onelnk.com", "app.aflink.com");

    /* renamed from: ɩ */
    private String f6970;

    /* renamed from: Ι */
    private String f6971;

    /* renamed from: ι */
    public AbstractC2296b f6972;

    /* renamed from: com.appsflyer.internal.ab$b */
    public interface AbstractC2296b {
        static {
            Covode.recordClassIndex(2548);
        }

        /* renamed from: ı */
        void mo6367(String str);

        /* renamed from: ɩ */
        void mo6368(Map<String, String> map);
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void onErrorResponse() {
        String str = this.f6971;
        if (str == null) {
            str = "Can't get one link data";
        }
        this.f6972.mo6367(str);
    }

    static {
        Covode.recordClassIndex(2547);
    }

    /* renamed from: ι */
    public final boolean mo6438() {
        if (TextUtils.isEmpty(this.oneLinkId) || TextUtils.isEmpty(this.f6970) || this.oneLinkId.equals("app")) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final String getOneLinkUrl() {
        return new StringBuilder().append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1")).append("/").append(this.oneLinkId).append("?id=").append(this.f6970).toString();
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void initRequest(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod("GET");
    }

    @Override // com.appsflyer.OneLinkHttpTask
    public final void handleResponse(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.f6972.mo6368(hashMap);
        } catch (JSONException e) {
            this.f6972.mo6367("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    public C2295ab(Uri uri, AppsFlyerLibCore appsFlyerLibCore) {
        super(appsFlyerLibCore);
        if (!(TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath()))) {
            boolean z = false;
            for (String str : f6969) {
                if (uri.getHost().contains(str)) {
                    z = true;
                }
            }
            if (AFDeepLinkManager.f6805 != null) {
                AFLogger.afRDLog(new StringBuilder("Validate custom domain URLs: ").append(Arrays.asList(AFDeepLinkManager.f6805)).toString());
                String[] strArr = AFDeepLinkManager.f6805;
                for (String str2 : strArr) {
                    if (uri.getHost().contains(str2) && str2 != "") {
                        AFLogger.afDebugLog(new StringBuilder("DeepLink matches customDomain: ").append(uri.toString()).toString());
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.oneLinkId = split[1];
                this.f6970 = split[2];
                this.f6971 = uri.toString();
            }
        }
    }
}
