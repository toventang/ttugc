package com.bytedance.ttnet.clientkey;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14757g;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ClientKeyManager {

    /* renamed from: a */
    public static Keva f54211a;

    /* renamed from: b */
    public static volatile boolean f54212b;

    /* renamed from: g */
    public static boolean f54213g = true;

    /* renamed from: h */
    public static Map<String, String> f54214h;

    /* renamed from: i */
    private static volatile ClientKeyManager f54215i;

    /* renamed from: l */
    private static final String f54216l = ClientKeyManager.class.getSimpleName();

    /* renamed from: c */
    public String f54217c = "";

    /* renamed from: d */
    public String f54218d = "";

    /* renamed from: e */
    public String f54219e = "";

    /* renamed from: f */
    public String f54220f = "";

    /* renamed from: j */
    private List<String> f54221j = new CopyOnWriteArrayList();

    /* renamed from: k */
    private List<String> f54222k = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(26846);
    }

    private ClientKeyManager() {
    }

    /* renamed from: a */
    public static ClientKeyManager m43224a() {
        MethodCollector.m26663i(4744);
        if (f54215i == null) {
            synchronized (ClientKeyManager.class) {
                try {
                    if (f54215i == null) {
                        f54215i = new ClientKeyManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4744);
                    throw th;
                }
            }
        }
        ClientKeyManager clientKeyManager = f54215i;
        MethodCollector.m26664o(4744);
        return clientKeyManager;
    }

    public static Map<String, String> getClientKeyHeaders() {
        if (f54211a == null || !f54212b) {
            return null;
        }
        if (f54213g) {
            return f54214h;
        }
        return m43226a(f54211a.getString("client_key", ""), f54211a.getString("kms_version", ""));
    }

    /* renamed from: b */
    public final void mo37257b(String str) {
        if (f54211a != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).getJSONObject("data").optJSONObject("client_key_config");
                if (optJSONObject == null) {
                    f54212b = false;
                    f54211a.clear();
                    return;
                }
                f54211a.storeString("client_key_config", optJSONObject.toString());
                mo37256a(optJSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo37255a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("report_time", new StringBuilder().append(System.currentTimeMillis()).toString());
            jSONObject.put("cookie_line", str);
            jSONObject.put("session_id", this.f54218d);
            jSONObject.put("url", this.f54219e);
            TTNetInit.getTTNetDepend().mo37263a("cookie_mismatch", jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo37256a(JSONObject jSONObject) {
        boolean z;
        if (jSONObject.optInt("client_key_sign_enabled", 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        f54212b = z;
        if (!z) {
            f54211a.clear();
            return;
        }
        this.f54221j.clear();
        String optString = jSONObject.optString("update_host_list", null);
        if (!TextUtils.isEmpty(optString)) {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    this.f54221j.add(string);
                }
            }
        }
        this.f54222k.clear();
        String optString2 = jSONObject.optString("update_path_list", null);
        if (!TextUtils.isEmpty(optString2)) {
            JSONArray jSONArray2 = new JSONArray(optString2);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string2 = jSONArray2.getString(i2);
                if (!TextUtils.isEmpty(string2)) {
                    this.f54222k.add(string2);
                }
            }
        }
    }

    /* renamed from: a */
    public static Map<String, String> m43226a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x-bd-client-key", str);
        hashMap.put("x-bd-kmsv", str2);
        return hashMap;
    }

    /* renamed from: a */
    public final synchronized void mo37254a(Request request, C22028c cVar) {
        MethodCollector.m26663i(5241);
        if (f54211a == null || !f54212b) {
            MethodCollector.m26664o(5241);
            return;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        URI uri = null;
        try {
            uri = C14757g.m27060a(request.getUrl());
        } catch (Throwable unused) {
        }
        if (uri == null || !uri.getScheme().equals("https")) {
            MethodCollector.m26664o(5241);
            return;
        }
        if (!this.f54221j.isEmpty()) {
            for (String str : this.f54221j) {
                if (C14759i.m27069a(uri.getHost(), str)) {
                }
            }
            MethodCollector.m26664o(5241);
            return;
        }
        if (!this.f54222k.isEmpty()) {
            for (String str2 : this.f54222k) {
                if (C14759i.m27069a(uri.getPath(), str2)) {
                    String str3 = "";
                    String str4 = "";
                    List<C22027b> b = cVar.mo35846b("Set-Cookie");
                    if (b != null && !b.isEmpty()) {
                        Iterator<C22027b> it = b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String trim = it.next().f52038b.trim();
                            if (trim.toLowerCase().startsWith("sessionid=")) {
                                str3 = trim;
                                break;
                            }
                        }
                    }
                    String[] split = str3.split(";");
                    if (split != null && split.length > 0) {
                        str4 = split[0].trim();
                    }
                    if (TextUtils.isEmpty(str4)) {
                        MethodCollector.m26664o(5241);
                        return;
                    }
                    String str5 = "";
                    String str6 = "";
                    C22027b a = cVar.mo35844a("x-bd-lanusk");
                    C22027b a2 = cVar.mo35844a("x-bd-lanusv");
                    if (a != null && a2 != null) {
                        str5 = a.f52038b;
                        str6 = a2.f52038b;
                        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
                            this.f54217c = "";
                            this.f54220f = "";
                        }
                    } else if (str4.equals(this.f54218d)) {
                        str5 = this.f54217c;
                        str6 = this.f54220f;
                    }
                    this.f54217c = str5;
                    this.f54220f = str6;
                    String url = request.getUrl();
                    this.f54219e = url;
                    this.f54218d = str4;
                    f54211a.storeString("session_url", url);
                    f54211a.storeString("session_id", str3);
                    f54211a.storeString("client_key", this.f54217c);
                    f54211a.storeString("kms_version", this.f54220f);
                    f54211a.storeLong("session_time", System.currentTimeMillis());
                    f54214h = m43226a(this.f54217c, this.f54220f);
                    if (request.getMetrics() != null) {
                        request.getMetrics().f52166I = SystemClock.uptimeMillis() - valueOf.longValue();
                    }
                    MethodCollector.m26664o(5241);
                    return;
                }
            }
        }
        MethodCollector.m26664o(5241);
    }

    /* renamed from: a */
    public static String m43225a(String[] strArr, long j, String str) {
        String[] strArr2;
        String str2;
        if (strArr != null && strArr.length >= 2) {
            long j2 = 0;
            if (j > 0) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strArr2 = null;
                        str2 = null;
                        break;
                    }
                    str2 = strArr[i];
                    if (!TextUtils.isEmpty(str2) && str2.toLowerCase().trim().startsWith("Max-Age=".toLowerCase())) {
                        strArr2 = str2.split("=");
                        break;
                    }
                    i++;
                }
                if (strArr2 != null && strArr2.length == 2) {
                    try {
                        long parseLong = Long.parseLong(strArr2[1]);
                        if (parseLong <= 0) {
                            return null;
                        }
                        long currentTimeMillis = parseLong - ((System.currentTimeMillis() - j) / 1000);
                        if (currentTimeMillis > 0) {
                            j2 = currentTimeMillis;
                        }
                        return str.replaceFirst(str2.trim(), "Max-Age=".concat(String.valueOf(j2)));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m43227a(String str, CookieHandler cookieHandler, URI uri) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        linkedHashMap.put("Set-Cookie", arrayList);
        cookieHandler.put(uri, linkedHashMap);
    }
}
