package com.p2082ss.android.p2092ad.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29476r;
import com.p2082ss.android.p2092ad.splash.p2109f.C29638a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.x */
public class C29628x {

    /* renamed from: k */
    private static volatile C29628x f70672k;

    /* renamed from: l */
    private static volatile boolean f70673l;

    /* renamed from: a */
    public volatile C29476r f70674a;

    /* renamed from: b */
    public volatile int f70675b;

    /* renamed from: c */
    public AtomicInteger f70676c;

    /* renamed from: d */
    public AtomicInteger f70677d;

    /* renamed from: e */
    public int f70678e;

    /* renamed from: f */
    public final List<Map<String, String>> f70679f;

    /* renamed from: g */
    public volatile long f70680g;

    /* renamed from: h */
    public boolean f70681h;

    /* renamed from: i */
    public boolean f70682i;

    /* renamed from: j */
    public boolean f70683j;

    /* renamed from: m */
    private int f70684m;

    /* renamed from: n */
    private volatile boolean f70685n;

    /* renamed from: o */
    private long f70686o;

    static {
        Covode.recordClassIndex(36024);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo51925f() {
        this.f70685n = true;
        this.f70674a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final LinkedHashMap<Long, String> mo51921b() {
        if (!mo51923d()) {
            return null;
        }
        return this.f70674a.f70133b;
    }

    /* renamed from: e */
    public final long mo51924e() {
        if (this.f70683j) {
            return -1;
        }
        return this.f70686o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo51922c() {
        if ((!(!this.f70685n) || !f70673l) || this.f70674a == null || this.f70674a.f70132a == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo51923d() {
        if ((!(!this.f70685n) || !f70673l) || this.f70674a == null || this.f70674a.f70133b == null) {
            return false;
        }
        return true;
    }

    private C29628x() {
        this.f70675b = -1;
        this.f70676c = new AtomicInteger();
        this.f70677d = new AtomicInteger();
        this.f70678e = 0;
        this.f70679f = Collections.synchronizedList(new ArrayList());
        this.f70680g = 0;
        this.f70686o = -1;
        this.f70681h = false;
        this.f70682i = false;
        this.f70683j = false;
        this.f70674a = null;
        this.f70682i = false;
        this.f70684m = 0;
        this.f70681h = false;
        this.f70685n = false;
    }

    /* renamed from: a */
    public static C29628x m59641a() {
        MethodCollector.m26663i(12252);
        if (f70672k == null) {
            synchronized (C29628x.class) {
                try {
                    if (f70672k == null) {
                        f70672k = new C29628x();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12252);
                    throw th;
                }
            }
        }
        C29628x xVar = f70672k;
        MethodCollector.m26664o(12252);
        return xVar;
    }

    /* renamed from: a */
    public final void mo51918a(int i) {
        C29644g.m59688b("UDPClient. setUDPSwitchResult: ".concat(String.valueOf(i)));
        this.f70675b = i;
    }

    /* renamed from: a */
    public final void mo51919a(long j) {
        if (j == -1) {
            this.f70686o = -1;
            C29638a.m59659a(0, " time valid, reset remote time ");
        } else if (this.f70686o == -1) {
            C29556v.m59363a().mo51743e(j);
            C29638a.m59659a(0, " time valid, saving remote time: ".concat(String.valueOf(j)));
            this.f70686o = j;
        }
    }

    /* renamed from: a */
    public final void mo51920a(AtomicInteger atomicInteger) {
        JSONObject jSONObject;
        MethodCollector.m26663i(12369);
        this.f70677d = atomicInteger;
        if (this.f70678e == atomicInteger.get()) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                synchronized (this.f70679f) {
                    try {
                        for (Map<String, String> map : this.f70679f) {
                            JSONObject jSONObject4 = new JSONObject();
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                jSONObject4.putOpt(entry.getKey(), entry.getValue());
                            }
                            jSONArray.put(jSONObject4);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(12369);
                        throw th;
                    }
                }
                jSONObject2.put("udp_addrs", jSONArray);
                jSONObject3.putOpt("log_extra", C29535k.m59196a().f70379l);
                jSONObject3.putOpt("ad_extra_data", jSONObject2);
                jSONObject3.putOpt("is_ad_event", "1");
                C29644g.m59688b("UDPClient. sendStopShowingEvent:\n" + jSONObject3.toString());
                jSONObject = jSONObject3;
            } catch (JSONException e) {
                e.printStackTrace();
                jSONObject = null;
            }
            C29495h.m59099a(84378473382L, "splash_ad", "splash_init_monitor_all", jSONObject);
        }
        MethodCollector.m26664o(12369);
    }
}
