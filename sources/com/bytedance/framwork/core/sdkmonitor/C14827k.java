package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.framwork.core.p999b.C14770b;
import com.bytedance.framwork.core.p999b.C14781d;
import com.bytedance.framwork.core.p999b.p1000a.AbstractC14768b;
import com.bytedance.framwork.core.p999b.p1002c.AbstractC14778c;
import com.bytedance.framwork.core.p999b.p1002c.C14780e;
import com.bytedance.framwork.core.p999b.p1003d.AbstractC14785b;
import com.bytedance.framwork.core.p999b.p1003d.C14782a;
import com.bytedance.framwork.core.p999b.p1004e.C14795a;
import com.bytedance.framwork.core.p999b.p1004e.C14798c;
import com.bytedance.framwork.core.sdkmonitor.C14823j;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.apm.api.C22710c;
import com.bytedance.services.apm.api.IHttpService;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.k */
public class C14827k implements AbstractC14768b, AbstractC14778c, AbstractC14785b {

    /* renamed from: A */
    private volatile int f36146A;

    /* renamed from: B */
    private volatile JSONObject f36147B;

    /* renamed from: C */
    private volatile List<String> f36148C;

    /* renamed from: D */
    private volatile List<Pattern> f36149D;

    /* renamed from: E */
    private volatile int f36150E = 1;

    /* renamed from: F */
    private volatile long f36151F;

    /* renamed from: G */
    private volatile boolean f36152G;

    /* renamed from: H */
    private volatile long f36153H;

    /* renamed from: a */
    Context f36154a;

    /* renamed from: b */
    public JSONObject f36155b;

    /* renamed from: c */
    public C14781d f36156c;

    /* renamed from: d */
    public C14770b f36157d;

    /* renamed from: e */
    volatile long f36158e;

    /* renamed from: f */
    volatile JSONObject f36159f;

    /* renamed from: g */
    volatile IHttpService f36160g;

    /* renamed from: h */
    volatile int f36161h;

    /* renamed from: i */
    volatile int f36162i;

    /* renamed from: j */
    volatile List<String> f36163j;

    /* renamed from: k */
    volatile List<Pattern> f36164k;

    /* renamed from: l */
    AbstractC14835a f36165l;

    /* renamed from: m */
    public Map<String, String> f36166m;

    /* renamed from: n */
    public List<String> f36167n = new LinkedList();

    /* renamed from: o */
    public volatile boolean f36168o;

    /* renamed from: p */
    public volatile boolean f36169p = true;

    /* renamed from: q */
    public volatile boolean f36170q;

    /* renamed from: r */
    public volatile boolean f36171r;

    /* renamed from: s */
    List<String> f36172s = new LinkedList();

    /* renamed from: t */
    public C14814b f36173t;

    /* renamed from: u */
    String f36174u;

    /* renamed from: v */
    boolean f36175v;

    /* renamed from: w */
    private volatile long f36176w;

    /* renamed from: x */
    private volatile int f36177x;

    /* renamed from: y */
    private volatile int f36178y;

    /* renamed from: z */
    private volatile int f36179z;

    /* renamed from: com.bytedance.framwork.core.sdkmonitor.k$a */
    public interface AbstractC14835a {
        static {
            Covode.recordClassIndex(16936);
        }

        /* renamed from: a */
        Map<String, String> mo21830a();
    }

    static {
        Covode.recordClassIndex(16928);
    }

    @Override // com.bytedance.framwork.core.p999b.p1000a.AbstractC14768b
    /* renamed from: c */
    public final List<String> mo23788c() {
        return this.f36172s;
    }

    @Override // com.bytedance.framwork.core.p999b.p1000a.AbstractC14768b
    /* renamed from: d */
    public final JSONObject mo23789d() {
        return this.f36155b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0079, code lost:
        r6.clear();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo23860a(org.json.JSONObject r10) {
        /*
        // Method dump skipped, instructions count: 560
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.sdkmonitor.C14827k.mo23860a(org.json.JSONObject):void");
    }

    @Override // com.bytedance.framwork.core.p999b.p1003d.AbstractC14785b
    /* renamed from: a */
    public final void mo23794a(long j) {
        if (this.f36176w > 0) {
            mo23867j();
        }
    }

    /* renamed from: a */
    public final void mo23861a(boolean z) {
        this.f36156c.f36036a = z;
    }

    /* renamed from: a */
    public final void mo23856a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (!this.f36171r) {
                this.f36173t.mo23846a(new C14836l(str, i, jSONObject, null, null, jSONObject2, System.currentTimeMillis()));
            } else {
                m27228b(str, i, jSONObject, (JSONObject) null, (JSONObject) null, jSONObject2, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo23858a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        mo23856a(str, 0, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public final void mo23859a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            if (!this.f36171r) {
                this.f36173t.mo23846a(new C14836l(str, 0, null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis()));
            } else {
                m27228b(str, 0, (JSONObject) null, jSONObject, jSONObject2, jSONObject3, System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo23854a(final long j, final long j2, final String str, final String str2, final String str3, final int i, final JSONObject jSONObject) {
        try {
            if (!this.f36171r) {
                this.f36173t.mo23844a(new C14813a("api_all", j, j2, str, str2, str3, i, jSONObject));
            } else {
                C14782a.C14784a.f36049a.mo23819a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.C14827k.RunnableC148325 */

                    static {
                        Covode.recordClassIndex(16933);
                    }

                    public final void run() {
                        C14827k kVar = C14827k.this;
                        long j = j;
                        long j2 = j2;
                        String str = str;
                        String str2 = str2;
                        String str3 = str3;
                        int i = i;
                        JSONObject jSONObject = jSONObject;
                        if (!kVar.mo23864b(str) && C14823j.m27222b(kVar.f36154a)) {
                            JSONObject a = kVar.mo23853a("api_all", j, j2, str, str2, str3, i);
                            C14827k.m27226a(a, jSONObject);
                            if ((a != null && C14827k.m27227a(str, kVar.f36163j, kVar.f36164k)) || kVar.f36162i != 0) {
                                try {
                                    a.put("hit_rules", 1);
                                    kVar.f36156c.mo23817a("api_all", "api_all", a);
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23857a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        if (jSONObject4 == null) {
            try {
                jSONObject4 = new JSONObject();
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObject4.put("log_type", "service_monitor");
        jSONObject4.put("service", str);
        jSONObject4.put("status", i);
        jSONObject4.put("network_type", mo23868k());
        jSONObject4.put("value", jSONObject);
        if (jSONObject2 != null) {
            jSONObject4.put("category", jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject4.put("metric", jSONObject3);
        }
        if (jSONObject4.isNull("timestamp")) {
            jSONObject4.put("timestamp", j);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject4.put("session_id", (Object) null);
        }
        if (this.f36156c != null && m27229c(str)) {
            this.f36156c.mo23817a("service_monitor", "service_monitor", jSONObject4);
        }
    }

    @Override // com.bytedance.framwork.core.p999b.p1000a.AbstractC14768b
    /* renamed from: b */
    public final int mo23787b() {
        if (this.f36178y <= 0) {
            return 100;
        }
        return this.f36178y;
    }

    @Override // com.bytedance.framwork.core.p999b.p1000a.AbstractC14768b
    /* renamed from: e */
    public final int mo23790e() {
        if (this.f36179z <= 0) {
            return 4;
        }
        return this.f36179z;
    }

    @Override // com.bytedance.framwork.core.p999b.p1000a.AbstractC14768b
    /* renamed from: f */
    public final int mo23791f() {
        if (this.f36146A <= 0) {
            return 15;
        }
        return this.f36146A;
    }

    @Override // com.bytedance.framwork.core.p999b.p1000a.AbstractC14768b
    /* renamed from: g */
    public final boolean mo23792g() {
        if (this.f36168o) {
            return this.f36168o;
        }
        return this.f36152G;
    }

    /* renamed from: k */
    public final int mo23868k() {
        return C14798c.m27166b(this.f36154a).getValue();
    }

    /* renamed from: l */
    private boolean m27230l() {
        if ((System.currentTimeMillis() - this.f36158e) / 1000 > this.f36176w) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.framwork.core.p999b.p1000a.AbstractC14768b
    /* renamed from: a */
    public final int mo23786a() {
        if (this.f36177x <= 0) {
            return 120;
        }
        return this.f36177x;
    }

    /* renamed from: h */
    public final IHttpService mo23865h() {
        if (this.f36160g == null) {
            this.f36160g = (IHttpService) C21520c.m40424a(IHttpService.class);
        }
        return this.f36160g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final SharedPreferences mo23866i() {
        return C34822d.m71158a(this.f36154a, "monitor_config" + this.f36174u + C14822i.m27214a(this.f36154a), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo23867j() {
        MethodCollector.m26663i(12949);
        if (this.f36176w < 600) {
            this.f36176w = 600;
        }
        if (m27230l() && C14823j.m27222b(this.f36154a)) {
            synchronized (C14827k.class) {
                try {
                    this.f36158e = System.currentTimeMillis();
                } finally {
                    MethodCollector.m26664o(12949);
                }
            }
            try {
                C14782a.C14784a.f36049a.mo23819a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.C14827k.RunnableC148303 */

                    static {
                        Covode.recordClassIndex(16931);
                    }

                    public final void run() {
                        byte[] bArr;
                        try {
                            if (C14827k.this.f36166m != null) {
                                for (String str : C14827k.this.f36167n) {
                                    String sb = C14827k.this.mo23852a(str).append("&encrypt=close").toString();
                                    try {
                                        if (C14827k.this.mo23865h() != null) {
                                            bArr = C14827k.this.mo23865h().doGet(sb, null).f53674c;
                                        } else {
                                            boolean z = C14827k.this.f36169p;
                                            if (!TextUtils.isDigitsOnly(sb)) {
                                                bArr = C14823j.m27218a(sb, null, null, null, "GET", false, z).f53674c;
                                            } else {
                                                return;
                                            }
                                        }
                                        if (bArr != null) {
                                            C14827k kVar = C14827k.this;
                                            JSONObject jSONObject = new JSONObject(new String(bArr));
                                            if (jSONObject.length() > 0) {
                                                try {
                                                    kVar.mo23860a(jSONObject.getJSONObject("ret"));
                                                    SharedPreferences.Editor edit = kVar.mo23866i().edit();
                                                    edit.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
                                                    edit.putInt("monitor_config_update", 1);
                                                    edit.putString("monitor_net_config", jSONObject.getJSONObject("ret").toString());
                                                    edit.apply();
                                                    if (!kVar.f36171r) {
                                                        kVar.f36171r = true;
                                                        kVar.f36173t.mo23845a(kVar);
                                                        return;
                                                    }
                                                    return;
                                                } catch (Throwable unused) {
                                                    return;
                                                }
                                            } else {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        } catch (Throwable unused3) {
                            if (!C14827k.this.f36171r) {
                                C14827k.this.f36171r = true;
                                C14827k.this.f36173t.mo23845a(C14827k.this);
                            }
                        }
                    }
                });
                MethodCollector.m26664o(12949);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo23862b(long j) {
        this.f36157d.mo23796c(j);
    }

    /* renamed from: c */
    private boolean m27229c(String str) {
        if (this.f36147B == null || TextUtils.isEmpty(str) || this.f36147B.opt(str) == null) {
            return false;
        }
        return true;
    }

    protected C14827k(String str) {
        this.f36174u = str;
        this.f36171r = false;
        this.f36173t = new C14814b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo23864b(String str) {
        return m27227a(str, this.f36148C, this.f36149D);
    }

    /* renamed from: a */
    public final StringBuilder mo23852a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isDigitsOnly(str) && this.f36166m != null) {
            if (!str.contains("?")) {
                sb.append("?");
            }
            m27225a(sb, "sdk_version", "400");
            Map<String, String> map = this.f36166m;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        m27225a(sb, String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                }
            }
        }
        return sb;
    }

    /* renamed from: a */
    private static String m27224a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    static void m27226a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.framwork.core.p999b.p1002c.AbstractC14778c
    /* renamed from: a */
    public final C14780e mo23815a(String str, byte[] bArr) {
        byte[] bArr2;
        Map<String, String> map;
        C14780e eVar = new C14780e();
        try {
            String sb = mo23852a(str).toString();
            new HashMap();
            if (mo23865h() != null) {
                HashMap hashMap = new HashMap();
                byte[] a = C14823j.m27221a(bArr, hashMap);
                if (this.f36169p) {
                    byte[] a2 = EncryptorUtil.m27092a(a, a.length);
                    if (a2 != null) {
                        sb = sb + "&tt_data=a";
                        hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
                    }
                    C22710c doPost = mo23865h().doPost(sb, a2, hashMap);
                    bArr2 = doPost.f53674c;
                    map = doPost.f53673b;
                } else {
                    C22710c doPost2 = mo23865h().doPost(sb, a, hashMap);
                    bArr2 = doPost2.f53674c;
                    map = doPost2.f53673b;
                }
            } else {
                C22710c a3 = C14823j.m27217a(sb, bArr, C14823j.EnumC14824a.GZIP, "application/json; charset=utf-8", this.f36169p);
                bArr2 = a3.f53674c;
                map = a3.f53673b;
            }
            String str2 = null;
            if (map != null && !map.isEmpty()) {
                str2 = map.get("ran");
            }
            eVar.f36034a = 200;
            JSONObject jSONObject = new JSONObject(new String(bArr2));
            try {
                String optString = jSONObject.optString("data");
                if (!optString.isEmpty()) {
                    String a4 = C14795a.m27159a(optString.getBytes(), str2);
                    if (!TextUtils.isEmpty(a4)) {
                        jSONObject = new JSONObject(a4);
                    } else {
                        jSONObject.put("message", "success");
                    }
                }
                eVar.f36035b = jSONObject;
            } catch (Throwable unused) {
            }
            eVar.f36035b = jSONObject;
            return eVar;
        } catch (Throwable th) {
            if (th instanceof C14817d) {
                eVar.f36034a = th.getStatusCode();
            } else {
                eVar.f36034a = -1;
            }
            return eVar;
        }
    }

    /* renamed from: a */
    public final void mo23855a(String str, int i, JSONObject jSONObject) {
        mo23856a(str, i, (JSONObject) null, jSONObject);
    }

    /* renamed from: a */
    private static StringBuilder m27225a(StringBuilder sb, String str, String str2) {
        if (sb.charAt(sb.length() - 1) != '?') {
            sb.append("&");
        }
        sb.append(m27224a(str, "UTF-8")).append('=').append(m27224a(str2, "UTF-8"));
        return sb;
    }

    /* renamed from: a */
    static boolean m27227a(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C14820g.m27212a(list)) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!C14820g.m27212a(list2)) {
                for (Pattern pattern : list2) {
                    if (pattern.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    private void m27228b(final String str, final int i, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j) {
        C14782a.C14784a.f36049a.mo23819a(new Runnable() {
            /* class com.bytedance.framwork.core.sdkmonitor.C14827k.RunnableC148347 */

            static {
                Covode.recordClassIndex(16935);
            }

            public final void run() {
                C14827k.this.mo23857a(str, i, jSONObject, jSONObject2, jSONObject3, jSONObject4, j);
            }
        });
    }

    /* renamed from: b */
    public final void mo23863b(final long j, final long j2, final String str, final String str2, final String str3, final int i, final JSONObject jSONObject) {
        try {
            if (!this.f36171r) {
                this.f36173t.mo23844a(new C14813a("api_all", j, j2, str, str2, str3, i, jSONObject));
            } else {
                C14782a.C14784a.f36049a.mo23819a(new Runnable() {
                    /* class com.bytedance.framwork.core.sdkmonitor.C14827k.RunnableC148336 */

                    static {
                        Covode.recordClassIndex(16934);
                    }

                    public final void run() {
                        C14827k kVar = C14827k.this;
                        long j = j;
                        long j2 = j2;
                        String str = str;
                        String str2 = str2;
                        String str3 = str3;
                        int i = i;
                        JSONObject jSONObject = jSONObject;
                        if (kVar.f36161h != 1 && !kVar.mo23864b(str)) {
                            JSONObject a = kVar.mo23853a("api_error", j, j2, str, str2, str3, i);
                            C14827k.m27226a(a, jSONObject);
                            if (a != null && a.length() > 0 && kVar.f36156c != null) {
                                kVar.f36156c.mo23817a("api_error", "api_error", a);
                            }
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo23853a(String str, long j, long j2, String str2, String str3, String str4, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", str);
            jSONObject.put("duration", j);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", Uri.parse(str2));
            }
            if (j2 > 0) {
                jSONObject.put("timestamp", j2);
            }
            jSONObject.put("status", i);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("ip", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("trace_code", str4);
            } else {
                jSONObject.put("trace_code", "");
            }
            jSONObject.put("network_type", C14823j.m27216a(this.f36154a).getValue());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
