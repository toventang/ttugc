package com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.p2147a.C29929b;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.utils.C80421fd;
import com.p2082ss.android.ugc.aweme.web.jsbridge.AbstractC81622t;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81608g;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.d */
public class C81589d implements AbstractC81582b {

    /* renamed from: a */
    public static final String f182453a = C81589d.class.getSimpleName();

    /* renamed from: b */
    private C18297h f182454b;

    /* renamed from: c */
    private JSONObject f182455c;

    /* renamed from: d */
    private Handler f182456d;

    /* renamed from: e */
    private C18288a f182457e;

    /* renamed from: f */
    private C81577a.AbstractC81578a f182458f;

    /* renamed from: g */
    private C81577a.AbstractC81580c f182459g;

    /* renamed from: h */
    private AbstractC81622t f182460h;

    /* renamed from: i */
    private String f182461i;

    /* renamed from: j */
    private String f182462j;

    /* renamed from: k */
    private String f182463k;

    /* renamed from: l */
    private JSONObject f182464l;

    /* renamed from: m */
    private JSONObject f182465m;

    /* renamed from: n */
    private List<C22027b> f182466n;

    /* renamed from: o */
    private String f182467o;

    /* renamed from: p */
    private Exception f182468p;

    /* renamed from: q */
    private Callable<JSONObject> f182469q = new CallableC81590e(this);

    /* renamed from: r */
    private Callable<JSONObject> f182470r = new CallableC81591f(this);

    /* renamed from: s */
    private Callable<JSONObject> f182471s = new CallableC81592g(this);

    /* renamed from: t */
    private Callable<JSONObject> f182472t = new CallableC81593h(this);

    /* renamed from: u */
    private CommonApi f182473u = ((CommonApi) C18097a.m33698a(Api.f79771d, CommonApi.class));

    static {
        Covode.recordClassIndex(94986);
    }

    /* renamed from: f */
    private static boolean m141462f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final JSONObject mo125281c() {
        String str;
        Exception e;
        String str2 = "";
        String a = m141456a(this.f182462j, this.f182464l);
        this.f182462j = a;
        try {
            JSONObject jSONObject = this.f182465m;
            String str3 = this.f182467o;
            if (str3 == null) {
                str3 = "application/x-www-form-urlencoded";
            }
            C22099u<String> a2 = C80421fd.m139418a(a, jSONObject, str3, this.f182466n);
            T t = a2.f52262b;
            try {
                JSONObject jSONObject2 = new JSONObject();
                String a3 = m141457a(a2.f52261a.f52042d, "x-tt-logid");
                jSONObject2.put("code", 1);
                jSONObject2.put("response", new JSONObject((String) t).put("_AME_Header_RequestID", a3));
                jSONObject2.put("_raw", t);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                str = str2;
                str2 = t;
                this.f182468p = e;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("code", 0);
                    jSONObject3.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
                    jSONObject3.put("_raw", str2);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                return jSONObject3;
            }
        } catch (Exception e4) {
            e = e4;
            str = str2;
            this.f182468p = e;
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put("code", 0);
            jSONObject32.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
            jSONObject32.put("_raw", str2);
            return jSONObject32;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final JSONObject mo125280b() {
        String str;
        Exception e;
        T t;
        String str2 = "";
        this.f182462j = m141456a(this.f182462j, this.f182464l);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f182467o != null) {
                C22099u<String> c = C80421fd.f179981a.mo123730c(this.f182462j, this.f182465m, this.f182467o, this.f182466n);
                t = c.f52262b;
                try {
                    str2 = m141457a(c.f52261a.f52042d, "x-tt-logid");
                } catch (Exception e2) {
                    e = e2;
                    str = str2;
                    str2 = t;
                }
            } else {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject2 = this.f182465m;
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, this.f182465m.optString(next, str2));
                    }
                }
                C29803q.m60037b(hashMap, true);
                C22099u<String> execute = this.f182473u.doPost(this.f182462j, 0, hashMap).execute();
                t = execute.f52262b;
                str2 = m141457a(execute.f52261a.f52042d, "x-tt-logid");
                Api.m68817a(t, this.f182462j);
            }
            str = str2;
            str2 = t;
            try {
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
                jSONObject.put("_raw", str2);
                return jSONObject;
            } catch (Exception e3) {
                e = e3;
                this.f182468p = e;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("code", 0);
                    jSONObject3.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
                    jSONObject3.put("_raw", str2);
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
                return jSONObject3;
            }
        } catch (Exception e5) {
            e = e5;
            str = str2;
            this.f182468p = e;
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put("code", 0);
            jSONObject32.put("response", new JSONObject(str2).put("_AME_Header_RequestID", str));
            jSONObject32.put("_raw", str2);
            return jSONObject32;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final JSONObject mo125282d() {
        String a = m141456a(this.f182462j, this.f182464l);
        this.f182462j = a;
        try {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m141462f();
            }
            if (C58029j.f132256h) {
                String str = (String) Api.m68815a(this.f182473u.doDelete(a, this.f182466n).execute().f52262b, Api.C33600d.f79780a, (String) null, a);
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("_raw", str);
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str));
                return jSONObject;
            }
            throw new IOException();
        } catch (C29929b e) {
            this.f182468p = e;
            JSONObject jSONObject2 = new JSONObject();
            m141460a(jSONObject2, e.getStatusCode(), e.getMessage(), "");
            return jSONObject2;
        } catch (C34485a e2) {
            this.f182468p = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m141460a(jSONObject3, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt());
            return jSONObject3;
        } catch (Exception e3) {
            this.f182468p = e3;
            JSONObject jSONObject4 = new JSONObject();
            m141460a(jSONObject4, -408, e3.getMessage(), "");
            return jSONObject4;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0062, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        r8.f182468p = r0;
        r2 = new org.json.JSONObject();
        m141460a(r2, r0.getStatusCode(), r0.getMessage(), "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r8.f182468p = r0;
        r2 = new org.json.JSONObject();
        m141460a(r2, -408, r0.getMessage(), "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0060, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008e A[ExcHandler: b (r0v1 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x004f A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo125283e() {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81589d.mo125283e():org.json.JSONObject");
    }

    @Override // com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.AbstractC81582b
    /* renamed from: a */
    public final void mo125268a() {
        C18297h hVar = this.f182454b;
        this.f182461i = hVar.f43669b;
        JSONObject jSONObject = hVar.f43671d;
        this.f182462j = jSONObject.optString("url", "");
        this.f182463k = jSONObject.optString("method", "get");
        this.f182464l = jSONObject.optJSONObject("params");
        this.f182465m = jSONObject.optJSONObject("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            this.f182466n = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    this.f182466n.add(new C22027b(next, optString));
                    if ("content-type".equalsIgnoreCase(next)) {
                        this.f182467o = optString;
                    }
                }
            }
        }
        this.f182460h = C81608g.m141469a();
        if ("get".equalsIgnoreCase(this.f182463k)) {
            C34608n.m70658a().mo61083a(this.f182456d, this.f182469q, 25);
        } else if (UGCMonitor.TYPE_POST.equalsIgnoreCase(this.f182463k)) {
            C34608n.m70658a().mo61083a(this.f182456d, this.f182470r, 32);
        } else if ("put".equalsIgnoreCase(this.f182463k)) {
            C34608n.m70658a().mo61083a(this.f182456d, this.f182471s, 33);
        } else if ("delete".equalsIgnoreCase(this.f182463k)) {
            C34608n.m70658a().mo61083a(this.f182456d, this.f182472t, 34);
        }
    }

    /* renamed from: a */
    private void m141458a(C29844g gVar) {
        AbstractC81622t tVar = this.f182460h;
        if (tVar != null) {
            Map<String, String> a = tVar.mo60224a();
            if (!a.isEmpty()) {
                for (Map.Entry<String, String> entry : a.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        gVar.mo52130a(key, value);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo125279a(Message message) {
        if (message.what != 25 && message.what != 32 && message.what != 33 && message.what != 34) {
            return false;
        }
        if (message.obj == null) {
            return true;
        }
        try {
            JSONObject jSONObject = (JSONObject) message.obj;
            if (this.f182459g != null) {
                C81577a.C81579b bVar = new C81577a.C81579b(this.f182463k, m141456a(this.f182462j, this.f182464l), this.f182465m);
                JSONObject jSONObject2 = null;
                if (jSONObject != null && jSONObject.has("response")) {
                    jSONObject2 = jSONObject.optJSONObject("response");
                }
                this.f182459g.mo61885a(bVar, new C81577a.C81581d(jSONObject2, this.f182468p));
            }
            if (this.f182457e == null || TextUtils.isEmpty(this.f182461i)) {
                C81577a.AbstractC81578a aVar = this.f182458f;
                if (aVar == null) {
                    return false;
                }
                aVar.mo61884a(jSONObject);
                return false;
            }
            this.f182457e.mo29249a(this.f182461i, jSONObject);
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private String m141456a(String str, JSONObject jSONObject) {
        C29844g gVar = new C29844g(str);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                gVar.mo52130a(next, jSONObject.optString(next, ""));
            }
        }
        m141458a(gVar);
        m141459a(gVar, "request_tag_from", "h5");
        return gVar.mo52126a();
    }

    /* renamed from: a */
    private static String m141457a(List<C22027b> list, String str) {
        for (C22027b bVar : list) {
            if (str.equals(bVar.f52037a.toLowerCase())) {
                return bVar.f52038b;
            }
        }
        return "";
    }

    /* renamed from: a */
    private static void m141459a(C29844g gVar, String str, String str2) {
        List<C29934d> list = gVar.f71191a;
        if (list != null && !list.isEmpty()) {
            for (C29934d dVar : list) {
                if (str.equalsIgnoreCase(dVar.f71419a)) {
                    return;
                }
            }
        }
        gVar.mo52130a(str, str2);
    }

    /* renamed from: a */
    private static void m141460a(JSONObject jSONObject, int i, String str, String str2) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            m141461b(jSONObject2, i, str, str2);
            jSONObject.put("response", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m141461b(JSONObject jSONObject, int i, String str, String str2) {
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("message", str);
            jSONObject.put("prompts", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public C81589d(C18297h hVar, JSONObject jSONObject, C18288a aVar, C81577a.AbstractC81578a aVar2, C81577a.AbstractC81580c cVar) {
        this.f182454b = hVar;
        this.f182455c = jSONObject;
        this.f182457e = aVar;
        this.f182458f = aVar2;
        this.f182459g = cVar;
        this.f182456d = new Handler(Looper.getMainLooper(), new C81594i(this));
    }
}
