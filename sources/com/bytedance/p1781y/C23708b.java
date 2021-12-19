package com.bytedance.p1781y;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1781y.AbstractC23713e;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.bytedance.y.b */
public final class C23708b {

    /* renamed from: a */
    public final AbstractC23711c f56068a;

    /* renamed from: b */
    public boolean f56069b;

    /* renamed from: c */
    public int f56070c = 86400;

    /* renamed from: d */
    int f56071d;

    /* renamed from: e */
    public long f56072e;

    /* renamed from: f */
    public long f56073f;

    /* renamed from: g */
    public AbstractC23713e f56074g;

    /* renamed from: h */
    private final Context f56075h;

    /* renamed from: i */
    private int f56076i = 10;

    /* renamed from: j */
    private long f56077j;

    /* renamed from: k */
    private final int f56078k = 5;

    static {
        Covode.recordClassIndex(27813);
    }

    /* renamed from: a */
    public final C23708b mo39133a(int i) {
        if (i <= 0) {
            C23712d.m44808b("Fetcher", "set fetch interval fail. interval = ".concat(String.valueOf(i)));
            return this;
        }
        this.f56070c = i;
        return this;
    }

    /* renamed from: a */
    public final C23708b mo39134a(long j) {
        if (j < 1) {
            C23712d.m44808b("Fetcher", "set config version fail. version = ".concat(String.valueOf(j)));
            return this;
        }
        this.f56077j = j;
        return this;
    }

    public C23708b(Context context, AbstractC23711c cVar) {
        this.f56075h = context;
        this.f56068a = cVar;
    }

    /* renamed from: b */
    public final void mo39136b(final String str, final String str2) {
        C23712d.m44807a("Fetcher", "retry fetch, count = " + this.f56073f);
        if (this.f56071d > this.f56076i) {
            C23712d.m44807a("Fetcher", "fetch fail, module = " + str + ", retry times = " + this.f56071d);
            AbstractC23711c cVar = this.f56068a;
            if (cVar != null) {
                cVar.mo39139a(-999, "fetch fail. try times = " + this.f56071d + ", max = " + this.f56076i);
            }
            this.f56071d = 0;
            return;
        }
        new Timer().schedule(new TimerTask() {
            /* class com.bytedance.p1781y.C23708b.C237102 */

            static {
                Covode.recordClassIndex(27815);
            }

            public final void run() {
                C23708b.this.mo39135a(str, str2);
            }
        }, 5000);
    }

    /* renamed from: a */
    public final void mo39135a(final String str, final String str2) {
        String str3;
        long j = this.f56073f;
        if (j >= Long.MAX_VALUE) {
            this.f56073f = 1;
        } else {
            this.f56073f = j + 1;
        }
        C23712d.m44807a("Fetcher", "start to fetch, module = " + str + ", fetch count = " + this.f56073f);
        if (this.f56074g == null) {
            AbstractC23711c cVar = this.f56068a;
            if (cVar != null) {
                cVar.mo39139a(-996, "netClient is null");
                return;
            }
            return;
        }
        String str4 = C23707a.f56065h;
        if (TextUtils.isEmpty(str4)) {
            C23712d.m44808b("ConfigEnv", "region is null");
            str3 = null;
        } else {
            str3 = C23707a.f56064g;
            if (str4.equals(C23707a.f56059b)) {
                str3 = C23707a.f56062e;
            } else if (str4.equals(C23707a.f56060c)) {
                str3 = C23707a.f56063f;
            } else if (str4.equals(C23707a.f56058a)) {
                str3 = C23707a.f56064g;
            }
        }
        if (TextUtils.isEmpty(str3)) {
            C23712d.m44808b("Fetcher", "get host is null");
            AbstractC23711c cVar2 = this.f56068a;
            if (cVar2 != null) {
                cVar2.mo39139a(-998, "host is null");
                return;
            }
            return;
        }
        this.f56071d++;
        HashMap hashMap = new HashMap();
        hashMap.put("caller_name", "VideoCloud");
        hashMap.put("device_platform", "android");
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("config_version", new StringBuilder().append(this.f56077j).toString());
        if (!hashMap.containsKey("device_brand")) {
            hashMap.put("device_brand", Build.BRAND);
        }
        if (!hashMap.containsKey("device_type")) {
            hashMap.put("device_type", Build.MODEL.toLowerCase());
        }
        if (!TextUtils.isEmpty(str) && !str.equals("all")) {
            hashMap.put("module", str);
        }
        if (this.f56069b) {
            hashMap.put("debug", "1");
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("config_key", str2);
        }
        if (C23707a.m44797a() != null) {
            hashMap.putAll(C23707a.m44797a());
        }
        if (C23707a.m44799b() != null) {
            hashMap.putAll(C23707a.m44799b());
        }
        C23712d.m44807a("Fetcher", "param = " + hashMap.toString());
        this.f56074g.mo39141a("https://" + str3 + C23707a.f56061d, hashMap, new AbstractC23713e.AbstractC23714a() {
            /* class com.bytedance.p1781y.C23708b.C237091 */

            static {
                Covode.recordClassIndex(27814);
            }

            @Override // com.bytedance.p1781y.AbstractC23713e.AbstractC23714a
            /* renamed from: a */
            public final void mo39137a(JSONObject jSONObject, Error error) {
                if (error != null) {
                    C23708b.this.mo39136b(str, str2);
                } else if (jSONObject == null) {
                    C23712d.m44808b("Fetcher", "response is null or empty");
                    C23708b.this.mo39136b(str, str2);
                } else {
                    C23708b.this.f56072e = System.currentTimeMillis();
                    if (C23708b.this.f56069b) {
                        C23712d.m44807a("Fetcher", "fetch suc, fetch count = " + C23708b.this.f56073f + ", response = " + jSONObject.toString());
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (C23708b.this.f56068a != null) {
                        C23708b.this.f56068a.mo39140a(jSONObject.optInt("code"), jSONObject.optString("msg"), optJSONObject, str, str2);
                    }
                }
            }
        });
    }
}
