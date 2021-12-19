package com.benchmark.strategy;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.benchmark.netUtils.BytebenchAPI;
import com.benchmark.netUtils.C2496a;
import com.benchmark.p117a.C2413a;
import com.benchmark.p118b.C2417a;
import com.benchmark.p118b.C2419b;
import com.benchmark.p118b.C2421c;
import com.benchmark.p118b.C2425d;
import com.benchmark.p118b.C2426e;
import com.benchmark.p118b.C2427f;
import com.benchmark.p118b.C2429h;
import com.benchmark.p119c.C2436b;
import com.benchmark.p121d.AbstractC2471a;
import com.benchmark.p121d.C2472b;
import com.benchmark.p121d.C2475c;
import com.benchmark.p121d.C2476d;
import com.benchmark.port.AbstractC2500c;
import com.benchmark.port.C2497a;
import com.benchmark.port.C2499b;
import com.benchmark.settings.C2505a;
import com.benchmark.tools.C2513b;
import com.benchmark.tools.C2527j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p983b.C14620c;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.AbstractC90025ab;
import okhttp3.C90204w;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.benchmark.strategy.b */
public class C2508b implements AbstractC2500c {

    /* renamed from: a */
    public C2505a f7607a;

    /* renamed from: b */
    public AtomicBoolean f7608b = new AtomicBoolean(false);

    /* renamed from: c */
    private ConcurrentHashMap<String, Object> f7609c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private C2475c f7610d;

    /* renamed from: e */
    private C2510a f7611e;

    /* renamed from: f */
    private C28022o f7612f;

    /* renamed from: g */
    private C27910f f7613g = new C27910f();

    /* renamed from: h */
    private AbstractC2471a f7614h = new AbstractC2471a() {
        /* class com.benchmark.strategy.C2508b.C25091 */

        static {
            Covode.recordClassIndex(2877);
        }

        @Override // com.benchmark.p121d.AbstractC2471a
        /* renamed from: a */
        public final void mo6852a() {
            C22099u<C2426e<C2417a>> uVar;
            MethodCollector.m26663i(7599);
            C28022o a = C2508b.this.mo6956a();
            a.mo46801a("ak", C2508b.this.f7607a.f7597e);
            a.mo46801a("sk", C2508b.this.f7607a.f7598f);
            a.mo46800a("appid", Integer.valueOf(C2508b.this.f7607a.f7596d));
            C28022o oVar = new C28022o();
            oVar.mo46797a("extra_info", (AbstractC28019l) new C27917g().mo46682b().mo46670a(a.toString(), C28022o.class));
            String oVar2 = oVar.toString();
            AbstractC90025ab create = AbstractC90025ab.create(C90204w.m156843b("application/json"), oVar2);
            String a2 = C2527j.m7408a(oVar2 + C2508b.this.f7607a.f7598f);
            BytebenchAPI bytebenchAPI = (BytebenchAPI) C2496a.m7360a().mo6917a(BytebenchAPI.class);
            Map<String, String> b = C2508b.this.mo6958b();
            synchronized (C2417a.class) {
                try {
                    AbstractC21983b<C2426e<C2417a>> deviceScore = bytebenchAPI.getDeviceScore(a2, b, create);
                    deviceScore.request().getUrl();
                    deviceScore.request().getHeaders();
                    try {
                        uVar = deviceScore.execute();
                    } catch (Exception e) {
                        e.getMessage();
                        e.printStackTrace();
                        uVar = null;
                    }
                } finally {
                    MethodCollector.m26664o(7599);
                }
            }
            if (uVar == null || !uVar.f52261a.mo35845a()) {
                MethodCollector.m26664o(7599);
                return;
            }
            T t = uVar.f52262b;
            if (t != null && t.f7292a == 0) {
                T t2 = t.f7294c;
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7577h.f7579j, t2.f7264i);
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7571b.f7579j, t2.f7257b);
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7572c.f7579j, t2.f7258c);
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7575f.f7579j, t2.f7261f);
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7573d.f7579j, t2.f7259d);
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7570a.f7579j, t2.f7256a);
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7576g.f7579j, t2.f7262g);
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7578i.f7579j, t2.f7263h);
                C2507a.f7604b.mo6954a(C2508b.this.f7607a.f7596d, C2497a.f7574e.f7579j, t2.f7260e);
            }
        }
    };

    static {
        Covode.recordClassIndex(2876);
    }

    /* renamed from: b */
    public final Map<String, String> mo6958b() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(C2496a.m7360a().mo6918b());
        if (this.f7607a.f7596d > 0) {
            hashMap.put("aid", String.valueOf(this.f7607a.f7596d));
        }
        hashMap.put("access_key", this.f7607a.f7597e);
        hashMap.put("secret_key", this.f7607a.f7598f);
        return hashMap;
    }

    /* renamed from: com.benchmark.strategy.b$a */
    public class C2510a implements AbstractC2471a {

        /* renamed from: b */
        private int f7617b;

        /* renamed from: c */
        private int f7618c;

        /* renamed from: d */
        private BytebenchAPI f7619d = ((BytebenchAPI) C2496a.m7360a().mo6917a(BytebenchAPI.class));

        static {
            Covode.recordClassIndex(2878);
        }

        @Override // com.benchmark.p121d.AbstractC2471a
        /* renamed from: a */
        public final void mo6852a() {
            int i;
            int i2;
            boolean z;
            int i3;
            int i4;
            MethodCollector.m26663i(6286);
            if (!C2508b.this.f7608b.get()) {
                MethodCollector.m26664o(6286);
                return;
            }
            do {
                long currentTimeMillis = System.currentTimeMillis();
                String str = "";
                long j = -1;
                C28022o a = C2508b.this.mo6956a();
                C28022o oVar = new C28022o();
                oVar.mo46797a("extra_info", (AbstractC28019l) new C27917g().mo46682b().mo46670a(a.toString(), C28022o.class));
                String oVar2 = oVar.toString();
                AbstractC90025ab create = AbstractC90025ab.create(C90204w.m156843b("application/json"), oVar2);
                String a2 = C2527j.m7408a(oVar2 + C2508b.this.f7607a.f7598f);
                Map<String, String> b = C2508b.this.mo6958b();
                b.put("offset", String.valueOf(this.f7617b));
                C22099u<C2426e<C2427f>> uVar = null;
                synchronized (C2427f.class) {
                    try {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        AbstractC21983b<C2426e<C2427f>> strategyComprise = this.f7619d.getStrategyComprise(a2, b, create);
                        strategyComprise.request().getUrl();
                        strategyComprise.request().getHeaders();
                        i = -1;
                        try {
                            uVar = strategyComprise.execute();
                            j = System.currentTimeMillis() - currentTimeMillis2;
                            z = false;
                            i3 = 0;
                            i2 = -1;
                        } catch (Exception e) {
                            z = true;
                            str = e.getMessage();
                            e.getMessage();
                            if (e instanceof C14620c) {
                                C14620c cVar = (C14620c) e;
                                cVar.getStatusCode();
                                cVar.getMessage();
                                i2 = cVar.getStatusCode();
                            } else {
                                i2 = -1;
                            }
                            e.printStackTrace();
                            i3 = -1;
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(6286);
                        throw th;
                    }
                }
                if (uVar == null || !uVar.f52261a.mo35845a()) {
                    if (!z) {
                        str = "the request occur error";
                        if (uVar != null) {
                            i2 = uVar.f52261a.f52040b;
                        }
                    } else {
                        i = i3;
                    }
                    i4 = -1;
                } else {
                    T t = uVar.f52262b;
                    if (t == null || t.f7292a != 0) {
                        str = "the server occur error";
                        if (t != null) {
                            i4 = t.f7292a;
                            str = t.f7293b;
                        } else {
                            i4 = -1;
                        }
                    } else {
                        T t2 = t.f7294c;
                        this.f7618c = t2.f7298d;
                        this.f7617b = t2.f7297c;
                        C2508b.this.mo6957a((C2427f) t2);
                        i4 = 0;
                        i = 0;
                    }
                    i2 = uVar.f52261a.f52040b;
                }
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                try {
                    int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ret", i);
                    jSONObject.put("message", str);
                    jSONObject.put("code_time", currentTimeMillis3);
                    jSONObject.put("net_cost_time", j);
                    jSONObject.put("status_code", i4);
                    jSONObject.put("response_code", i2);
                    jSONObject.put("net_status", effectiveConnectionType);
                    jSONObject.put("sdk_version", "2.4.0-8_mt");
                    C2413a.m7259a("bytebench_strategy_request", jSONObject);
                } catch (Exception unused) {
                }
                if (this.f7618c <= this.f7617b) {
                    break;
                }
            } while (C2508b.this.f7608b.get());
            this.f7617b = 0;
            this.f7618c = 0;
            MethodCollector.m26664o(6286);
        }

        public C2510a() {
        }
    }

    /* renamed from: a */
    public final C28022o mo6956a() {
        long j;
        long j2;
        File file;
        MethodCollector.m26663i(6609);
        if (this.f7612f == null) {
            synchronized (C2508b.class) {
                try {
                    if (this.f7612f == null) {
                        this.f7612f = new C28022o();
                        Context context = C2436b.f7319m.f7320a;
                        C28022o oVar = this.f7612f;
                        ActivityManager activityManager = (ActivityManager) C2527j.m7407a(context, "activity");
                        if (activityManager != null) {
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            activityManager.getMemoryInfo(memoryInfo);
                            j = memoryInfo.totalMem;
                        } else {
                            j = 0;
                        }
                        oVar.mo46800a("memory_total_size", Long.valueOf(j));
                        this.f7612f.mo46800a("cpu_core_nums", Integer.valueOf(C2527j.m7406a()));
                        this.f7612f.mo46800a("cpu_freq", Long.valueOf(C2527j.m7409b()));
                        C28022o oVar2 = this.f7612f;
                        long j3 = -1;
                        if (Environment.getDataDirectory() != null) {
                            if (C58016d.f132222c == null || !C58016d.f132224e) {
                                C58016d.f132222c = context.getFilesDir();
                            }
                            j2 = C2513b.m7387b(C58016d.f132222c.getParent());
                        } else {
                            j2 = -1;
                        }
                        oVar2.mo46800a("storage_total_internal_size", Long.valueOf(j2));
                        C28022o oVar3 = this.f7612f;
                        String str = null;
                        if (!TextUtils.isEmpty(null)) {
                            file = context.getExternalFilesDir(null);
                        } else {
                            if (C58016d.f132223d == null || !C58016d.f132224e) {
                                C58016d.f132223d = context.getExternalFilesDir(null);
                            }
                            file = C58016d.f132223d;
                        }
                        if (file != null) {
                            str = file.getParent();
                        }
                        if (!(str == null || Environment.getDataDirectory() == null)) {
                            j3 = C2513b.m7387b(str);
                        }
                        oVar3.mo46800a("storage_total_external_size", Long.valueOf(j3));
                        if (this.f7607a.f7595c != null) {
                            for (Map.Entry<String, String> entry : this.f7607a.f7595c.entrySet()) {
                                this.f7612f.mo46801a(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6609);
                    throw th;
                }
            }
        }
        C28022o oVar4 = this.f7612f;
        MethodCollector.m26664o(6609);
        return oVar4;
    }

    @Override // com.benchmark.port.AbstractC2500c
    /* renamed from: a */
    public final int mo6919a(C2505a aVar) {
        if (!C2499b.f7582a.get()) {
            return -105;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f7607a = aVar;
        C2507a aVar2 = C2507a.f7604b;
        aVar2.f7605a.openRepo(this.f7607a.f7596d);
        this.f7611e = new C2510a();
        C2476d b = new C2476d().mo6858b();
        b.f7430c = this.f7607a.f7593a;
        b.f7428a = this.f7611e;
        if (this.f7607a.f7593a <= 0) {
            b.f7429b = 1;
        } else {
            b.f7429b = Integer.MAX_VALUE;
        }
        this.f7610d = b.mo6857a();
        C2472b.f7412a.mo6854a(this.f7610d);
        C2476d b2 = new C2476d().mo6858b();
        b2.f7429b = 1;
        b2.f7428a = this.f7614h;
        C2472b.f7412a.mo6854a(b2.mo6857a());
        this.f7608b.set(true);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            jSONObject.put("sdk_version", "2.4.0-8_mt");
            C2413a.m7259a("bytebench_strategy_init", jSONObject);
            return 0;
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo6957a(C2427f fVar) {
        List<C2429h> list = fVar.f7296b;
        List<C2425d> list2 = fVar.f7295a;
        for (C2429h hVar : list) {
            if (hVar.f7305b) {
                int i = hVar.f7307d;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C2507a aVar = C2507a.f7604b;
                            aVar.f7605a.storeBoolean(this.f7607a.f7596d, hVar.f7304a, false, ((Boolean) hVar.mo6795a()).booleanValue());
                        } else if (i != 4) {
                        }
                    }
                    C2507a.f7604b.mo6955a(this.f7607a.f7596d, hVar.f7304a, false, (String) hVar.mo6795a());
                } else {
                    C2507a.f7604b.mo6954a(this.f7607a.f7596d, hVar.f7304a, ((Float) hVar.mo6795a()).floatValue());
                }
            }
        }
        for (C2425d dVar : list2) {
            C2421c cVar = new C2421c();
            cVar.f7275a = dVar.f7290a;
            List<C2419b> list3 = dVar.f7291b;
            if (list3 != null) {
                for (C2419b bVar : list3) {
                    C2421c.C2424c cVar2 = new C2421c.C2424c();
                    cVar2.f7285a = bVar.f7269d;
                    cVar2.f7286b = bVar.f7270e;
                    cVar2.f7287c = bVar.f7267b ? 1 : 0;
                    cVar2.f7288d = new ArrayList();
                    List<C2419b.C2420a> list4 = bVar.f7266a;
                    if (list4 == null) {
                        break;
                    }
                    for (C2419b.C2420a aVar2 : list4) {
                        C2421c.C2423b bVar2 = new C2421c.C2423b();
                        C2421c.m7263a(bVar2.f7282b, aVar2.f7272a);
                        C2421c.m7263a(bVar2.f7281a, aVar2.f7274c);
                        C2421c.m7263a(bVar2.f7283c, aVar2.f7273b);
                        cVar2.f7288d.add(bVar2);
                    }
                    cVar.f7276b.add(cVar2);
                }
            }
            C2507a.f7604b.mo6955a(this.f7607a.f7596d, dVar.f7290a, true, this.f7613g.mo46674b(cVar));
        }
    }
}
