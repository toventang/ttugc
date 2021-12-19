package com.bytedance.ttnet.p1705f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.C14581a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14682e;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14703k;
import com.bytedance.ttnet.p1705f.C22954c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.f.b */
public final class C22953b {

    /* renamed from: a */
    public Context f54278a;

    /* renamed from: b */
    public C22952a f54279b;

    /* renamed from: c */
    public String f54280c = "";

    /* renamed from: d */
    private boolean f54281d;

    /* renamed from: e */
    private String f54282e = "";

    /* renamed from: f */
    private String f54283f = "";

    /* renamed from: g */
    private String f54284g = "";

    static {
        Covode.recordClassIndex(26866);
    }

    /* renamed from: a */
    public static String m43253a() {
        if (TextUtils.isEmpty(C22954c.f54285a)) {
            return null;
        }
        try {
            return new JSONObject(C22954c.f54285a).getString("data");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo37280a(long j) {
        String str;
        if (this.f54281d) {
            SharedPreferences a = C34822d.m71158a(this.f54278a, "ttnet_tnc_config", 0);
            String string = a.getString("tnc_config_str", null);
            String string2 = a.getString("ttnet_tnc_etag", null);
            String string3 = a.getString("ttnet_tnc_abtest", null);
            if (TextUtils.isEmpty(string)) {
                string = m43253a();
                if (TextUtils.isEmpty(string)) {
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                C14703k.m26921a().mo23708a(jSONObject, C22954c.EnumC22957a.TTCACHE.mValue, string2, string3, j);
                C14682e.m26869a().mo23684a(jSONObject);
                C14581a.m26665a(jSONObject);
                C22952a a2 = m43252a(jSONObject);
                if (a2 != null) {
                    this.f54279b = a2;
                }
                if (Logger.debug()) {
                    StringBuilder sb = new StringBuilder("loadLocalConfig: ");
                    if (a2 == null) {
                        str = "null";
                    } else {
                        str = a2.toString();
                    }
                    Logger.m24396d("TNCConfigHandler", sb.append(str).toString());
                }
            } catch (Throwable unused) {
                Logger.debug();
            }
        }
    }

    /* renamed from: a */
    public static C22952a m43252a(JSONObject jSONObject) {
        boolean z;
        try {
            C14703k.m26921a().f35746e.clear();
            JSONObject optJSONObject = jSONObject.optJSONObject("tnc_config");
            C22952a aVar = new C22952a();
            if (optJSONObject == null) {
                return aVar;
            }
            boolean z2 = true;
            if (optJSONObject.has("local_enable")) {
                if (optJSONObject.getInt("local_enable") == 0) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.f54266a = z;
            }
            if (optJSONObject.has("probe_enable")) {
                if (optJSONObject.getInt("probe_enable") == 0) {
                    z2 = false;
                }
                aVar.f54267b = z2;
            }
            if (optJSONObject.has("local_host_filter")) {
                JSONArray jSONArray = optJSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                aVar.f54268c = hashMap;
            } else {
                aVar.f54268c = null;
            }
            if (optJSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = optJSONObject.getJSONObject("host_replace_map");
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            C14703k.m26921a().f35746e.put(next, string2);
                        }
                    }
                }
            }
            aVar.f54269d = optJSONObject.optInt("req_to_cnt", aVar.f54269d);
            aVar.f54270e = optJSONObject.optInt("req_to_api_cnt", aVar.f54270e);
            aVar.f54271f = optJSONObject.optInt("req_to_ip_cnt", aVar.f54271f);
            aVar.f54272g = optJSONObject.optInt("req_err_cnt", aVar.f54272g);
            aVar.f54273h = optJSONObject.optInt("req_err_api_cnt", aVar.f54273h);
            aVar.f54274i = optJSONObject.optInt("req_err_ip_cnt", aVar.f54274i);
            aVar.f54275j = optJSONObject.optInt("update_interval", aVar.f54275j);
            aVar.f54276k = optJSONObject.optInt("update_random_range", aVar.f54276k);
            aVar.f54277l = optJSONObject.optString("http_code_black", aVar.f54277l);
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C22953b(Context context, boolean z) {
        this.f54278a = context;
        this.f54281d = z;
        this.f54279b = new C22952a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:56|57|58|(1:60)|61) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0138, code lost:
        if (android.text.TextUtils.isEmpty(r21.f54280c) != false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r21.f54279b = new com.bytedance.ttnet.p1705f.C22952a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cf, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d0, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d1, code lost:
        r1 = com.p2082ss.android.ugc.aweme.p2387bf.C34822d.m71158a(r21.f54278a, "ttnet_tnc_config", 0).edit();
        r1.putString("tnc_config_str", "").apply();
        com.bytedance.ttnet.utils.C22966b.m43298a(r21.f54278a, 4, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01eb, code lost:
        if (android.text.TextUtils.isEmpty(r24) == false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ed, code lost:
        r1.putString("ttnet_tnc_etag", r24).apply();
        com.bytedance.ttnet.utils.C22966b.m43298a(r21.f54278a, 5, r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ff, code lost:
        if (android.text.TextUtils.isEmpty(r21.f54280c) != false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0201, code lost:
        r21.f54280c = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0203, code lost:
        r1.putString("ttnet_tnc_abtest", r21.f54280c).apply();
        com.bytedance.ttnet.utils.C22966b.m43298a(r21.f54278a, 6, r21.f54280c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0213, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0186 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo37281a(org.json.JSONObject r22, com.bytedance.ttnet.p1705f.C22954c.EnumC22957a r23, java.lang.String r24, java.lang.String r25, long r26) {
        /*
        // Method dump skipped, instructions count: 532
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p1705f.C22953b.mo37281a(org.json.JSONObject, com.bytedance.ttnet.f.c$a, java.lang.String, java.lang.String, long):boolean");
    }
}
