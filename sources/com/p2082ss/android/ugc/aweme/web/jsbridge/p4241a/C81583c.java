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
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.p2147a.C29929b;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.web.jsbridge.AbstractC81622t;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81608g;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.c */
public class C81583c implements AbstractC81582b {

    /* renamed from: a */
    public static final String f182427a = C81583c.class.getSimpleName();

    /* renamed from: b */
    public C18288a f182428b;

    /* renamed from: c */
    public C81577a.AbstractC81578a f182429c;

    /* renamed from: d */
    public C81577a.AbstractC81580c f182430d;

    /* renamed from: e */
    public String f182431e;

    /* renamed from: f */
    public String f182432f;

    /* renamed from: g */
    public String f182433g;

    /* renamed from: h */
    public JSONObject f182434h;

    /* renamed from: i */
    public JSONObject f182435i;

    /* renamed from: j */
    public Exception f182436j = null;

    /* renamed from: k */
    private C18297h f182437k;

    /* renamed from: l */
    private JSONObject f182438l;

    /* renamed from: m */
    private Handler f182439m;

    /* renamed from: n */
    private AbstractC81622t f182440n;

    /* renamed from: o */
    private CommonApi f182441o = ((CommonApi) C18097a.m33698a(Api.f79771d, CommonApi.class));

    /* renamed from: p */
    private List<C22027b> f182442p;

    /* renamed from: q */
    private String f182443q;

    /* renamed from: r */
    private Callable<JSONObject> f182444r = new Callable<JSONObject>() {
        /* class com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c.CallableC815841 */

        static {
            Covode.recordClassIndex(94981);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ JSONObject call() {
            return C81583c.this.mo125273e();
        }
    };

    /* renamed from: s */
    private Callable<JSONObject> f182445s = new Callable<JSONObject>() {
        /* class com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c.CallableC815852 */

        static {
            Covode.recordClassIndex(94982);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ JSONObject call() {
            return C81583c.this.mo125270b();
        }
    };

    /* renamed from: t */
    private Callable<JSONObject> f182446t = new Callable<JSONObject>() {
        /* class com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c.CallableC815863 */

        static {
            Covode.recordClassIndex(94983);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ JSONObject call() {
            return C81583c.this.mo125271c();
        }
    };

    /* renamed from: u */
    private Callable<JSONObject> f182447u = new Callable<JSONObject>() {
        /* class com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c.CallableC815874 */

        static {
            Covode.recordClassIndex(94984);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ JSONObject call() {
            return C81583c.this.mo125272d();
        }
    };

    static {
        Covode.recordClassIndex(94980);
    }

    /* renamed from: f */
    private static boolean m141449f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        r2 = r3;
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        r14.f182436j = r4;
        r3 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.put("code", 0);
        r2 = new org.json.JSONObject();
        r2.put("errCode", r4.getStatusCode());
        r2.put("message", r4.getMessage());
        r3.put("error", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[ExcHandler: b (r4v1 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x0015] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo125270b() {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c.mo125270b():org.json.JSONObject");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        r2 = r3;
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r10.f182436j = r4;
        r3 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.put("code", 0);
        r2 = new org.json.JSONObject();
        r2.put("errCode", r4.getStatusCode());
        r2.put("message", r4.getMessage());
        r3.put("error", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f A[ExcHandler: b (r4v1 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x0015] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo125271c() {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c.mo125271c():org.json.JSONObject");
    }

    /* renamed from: d */
    public final JSONObject mo125272d() {
        String a = mo125269a(this.f182432f, this.f182434h);
        this.f182432f = a;
        try {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m141449f();
            }
            if (C58029j.f132256h) {
                ArrayList arrayList = new ArrayList();
                if (!C34717d.m70908a(this.f182442p)) {
                    for (C22027b bVar : this.f182442p) {
                        arrayList.add(new C22027b(bVar.f52037a, bVar.f52038b));
                    }
                }
                String str = (String) Api.m68815a(this.f182441o.doDelete(a, 0, arrayList).execute().f52262b, Api.C33600d.f79780a, (String) null, a);
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("_raw", str);
                return jSONObject;
            }
            throw new IOException();
        } catch (C29929b e) {
            this.f182436j = e;
            JSONObject jSONObject2 = new JSONObject();
            m141447a(jSONObject2, e.getStatusCode(), e.getMessage(), "");
            return jSONObject2;
        } catch (C34485a e2) {
            this.f182436j = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m141447a(jSONObject3, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt());
            return jSONObject3;
        } catch (Exception e3) {
            this.f182436j = e3;
            JSONObject jSONObject4 = new JSONObject();
            m141447a(jSONObject4, -408, e3.getMessage(), "");
            return jSONObject4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        r8.f182436j = r0;
        r2 = new org.json.JSONObject();
        m141447a(r2, -408, r0.getMessage(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r8.f182436j = r0;
        r2 = new org.json.JSONObject();
        m141447a(r2, r0.getStatusCode(), r0.getMessage(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7 A[ExcHandler: b (r0v2 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x0010] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo125273e() {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c.mo125273e():org.json.JSONObject");
    }

    @Override // com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.AbstractC81582b
    /* renamed from: a */
    public final void mo125268a() {
        C18297h hVar = this.f182437k;
        this.f182431e = hVar.f43669b;
        JSONObject jSONObject = hVar.f43671d;
        this.f182432f = jSONObject.optString("url", "");
        this.f182433g = jSONObject.optString("method", "get");
        this.f182434h = jSONObject.optJSONObject("params");
        this.f182435i = jSONObject.optJSONObject("data");
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            this.f182442p = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    this.f182442p.add(new C22027b(next, optString));
                    if ("content-type".equalsIgnoreCase(next)) {
                        this.f182443q = optString;
                    }
                }
            }
        }
        this.f182440n = C81608g.m141469a();
        if ("get".equalsIgnoreCase(this.f182433g)) {
            C34608n.m70658a().mo61083a(this.f182439m, this.f182444r, 25);
        } else if (UGCMonitor.TYPE_POST.equalsIgnoreCase(this.f182433g)) {
            C34608n.m70658a().mo61083a(this.f182439m, this.f182445s, 32);
        } else if ("put".equalsIgnoreCase(this.f182433g)) {
            C34608n.m70658a().mo61083a(this.f182439m, this.f182446t, 33);
        } else if ("delete".equalsIgnoreCase(this.f182433g)) {
            C34608n.m70658a().mo61083a(this.f182439m, this.f182447u, 34);
        }
    }

    /* renamed from: a */
    private void m141445a(C29844g gVar) {
        AbstractC81622t tVar = this.f182440n;
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

    /* renamed from: a */
    private static String m141444a(List<C22027b> list, String str) {
        for (C22027b bVar : list) {
            if (str.equals(bVar.f52037a.toLowerCase())) {
                return bVar.f52038b;
            }
        }
        return "";
    }

    /* renamed from: a */
    public final String mo125269a(String str, JSONObject jSONObject) {
        C29844g gVar = new C29844g(str);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                gVar.mo52130a(next, jSONObject.optString(next, ""));
            }
        }
        m141445a(gVar);
        m141446a(gVar, "request_tag_from", "h5");
        return gVar.mo52126a();
    }

    /* renamed from: a */
    private static void m141446a(C29844g gVar, String str, String str2) {
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
    private static void m141447a(JSONObject jSONObject, int i, String str, String str2) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            m141448b(jSONObject2, i, str, str2);
            jSONObject.put("response", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m141448b(JSONObject jSONObject, int i, String str, String str2) {
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("message", str);
            jSONObject.put("prompts", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public C81583c(C18297h hVar, JSONObject jSONObject, C18288a aVar, C81577a.AbstractC81578a aVar2, C81577a.AbstractC81580c cVar) {
        this.f182437k = hVar;
        this.f182438l = jSONObject;
        this.f182428b = aVar;
        this.f182429c = aVar2;
        this.f182430d = cVar;
        this.f182439m = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            /* class com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c.C815885 */

            static {
                Covode.recordClassIndex(94985);
            }

            public final boolean handleMessage(Message message) {
                if (message.what != 25 && message.what != 32 && message.what != 33 && message.what != 34) {
                    return false;
                }
                if (message.obj == null) {
                    return true;
                }
                try {
                    JSONObject jSONObject = (JSONObject) message.obj;
                    if (C81583c.this.f182430d != null) {
                        String str = C81583c.this.f182433g;
                        C81583c cVar = C81583c.this;
                        C81577a.C81579b bVar = new C81577a.C81579b(str, cVar.mo125269a(cVar.f182432f, C81583c.this.f182434h), C81583c.this.f182435i);
                        JSONObject jSONObject2 = null;
                        if (jSONObject != null && jSONObject.has("response")) {
                            jSONObject2 = jSONObject.optJSONObject("response");
                        }
                        C81583c.this.f182430d.mo61885a(bVar, new C81577a.C81581d(jSONObject2, C81583c.this.f182436j));
                    }
                    if (C81583c.this.f182428b != null && !TextUtils.isEmpty(C81583c.this.f182431e)) {
                        C81583c.this.f182428b.mo29249a(C81583c.this.f182431e, jSONObject);
                        return false;
                    } else if (C81583c.this.f182429c == null) {
                        return false;
                    } else {
                        C81583c.this.f182429c.mo61884a(jSONObject);
                        return false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        });
    }
}
