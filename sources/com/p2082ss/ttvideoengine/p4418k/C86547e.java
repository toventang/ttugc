package com.p2082ss.ttvideoengine.p4418k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.k.e */
public final class C86547e extends C86541a {

    /* renamed from: f */
    private static String f194997f = "";

    /* renamed from: g */
    private int f194998g = 2;

    static {
        Covode.recordClassIndex(101775);
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.C86541a
    /* renamed from: c */
    public final void mo137806c() {
        if (!this.f194974b) {
            this.f194974b = true;
            this.f194977e.mo101097a();
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.C86541a
    /* renamed from: b */
    public final void mo137804b() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + f194997f + "/q?host=");
        sb.append(this.f194975c);
        String sb2 = sb.toString();
        C86641i.m150113b("HTTPDNS", "http dns parse url is".concat(String.valueOf(sb2)));
        Method[] declaredMethods = this.f194977e.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.f194977e.mo101099a(sb2, (Map<String, String>) null, new AbstractC86561j.AbstractC86562a() {
                /* class com.p2082ss.ttvideoengine.p4418k.C86547e.C865481 */

                static {
                    Covode.recordClassIndex(101776);
                }

                @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j.AbstractC86562a
                /* renamed from: a */
                public final void mo137467a(JSONObject jSONObject, C86633c cVar) {
                    C86547e.this.mo137813a(jSONObject, cVar);
                }
            });
        } else {
            this.f194977e.mo101100b(sb2, null, new AbstractC86561j.AbstractC86562a() {
                /* class com.p2082ss.ttvideoengine.p4418k.C86547e.C865492 */

                static {
                    Covode.recordClassIndex(101777);
                }

                @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j.AbstractC86562a
                /* renamed from: a */
                public final void mo137467a(JSONObject jSONObject, C86633c cVar) {
                    C86547e.this.mo137813a(jSONObject, cVar);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m149799a(String str) {
        MethodCollector.m26663i(3059);
        synchronized (C86552g.class) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    f194997f = str;
                }
            } finally {
                MethodCollector.m26664o(3059);
            }
        }
    }

    /* renamed from: a */
    public final void mo137813a(JSONObject jSONObject, C86633c cVar) {
        if (cVar != null) {
            cVar.f195253c = "kTTVideoErrorDomainHTTPDNS";
        } else {
            String str = "TT_";
            if (jSONObject == null || jSONObject.length() == 0) {
                StringBuilder sb = new StringBuilder();
                if (this.f194998g != 2) {
                    str = "ALI_";
                }
                cVar = new C86633c("kTTVideoErrorDomainHTTPDNS", -9997, sb.append(str).append("HTTP dns empty").toString());
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    if (this.f194998g != 2) {
                        str = "ALI_";
                    }
                    cVar = new C86633c("kTTVideoErrorDomainHTTPDNS", -9997, sb2.append(str).append("HTTP dns empty").toString());
                } else {
                    try {
                        jSONObject.put("time", System.currentTimeMillis());
                        jSONObject.put("dns_type", "httpDNS");
                    } catch (JSONException unused) {
                    }
                    mo137803a(jSONObject);
                    return;
                }
            }
        }
        mo137807c(cVar);
    }

    public C86547e(String str, AbstractC86561j jVar, int i) {
        super(str, jVar);
        String str2;
        this.f194998g = i;
        StringBuilder sb = new StringBuilder("DNS use HTTPDNS");
        if (i == 2) {
            str2 = "_TT";
        } else {
            str2 = "_ALI";
        }
        C86641i.m150110a("HTTPDNS", sb.append(str2).toString());
    }
}
