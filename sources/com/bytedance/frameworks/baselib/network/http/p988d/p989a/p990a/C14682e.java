package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14709f;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14668a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14678b;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a.C14670a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a.C14672c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.e */
public class C14682e implements WeakHandler.IHandler {

    /* renamed from: a */
    public static String f35644a = C14682e.class.getSimpleName();

    /* renamed from: l */
    static HandlerThread f35645l;

    /* renamed from: m */
    public static WeakHandler f35646m;

    /* renamed from: n */
    private static ExecutorService f35647n;

    /* renamed from: o */
    private static volatile C14682e f35648o;

    /* renamed from: q */
    private static String f35649q;

    /* renamed from: b */
    public AtomicBoolean f35650b = new AtomicBoolean(false);

    /* renamed from: c */
    public volatile String f35651c;

    /* renamed from: d */
    public ConcurrentSkipListSet<String> f35652d = new ConcurrentSkipListSet<>();

    /* renamed from: e */
    public ConcurrentSkipListSet<String> f35653e = new ConcurrentSkipListSet<>();

    /* renamed from: f */
    public AtomicInteger f35654f = new AtomicInteger(30);

    /* renamed from: g */
    public AtomicInteger f35655g = new AtomicInteger(LiveNetAdaptiveHurryTimeSetting.DEFAULT);

    /* renamed from: h */
    public AtomicInteger f35656h = new AtomicInteger(60);

    /* renamed from: i */
    public final C14709f f35657i = new C14709f();

    /* renamed from: j */
    public volatile AbstractC14686h f35658j;

    /* renamed from: k */
    public boolean f35659k = false;

    /* renamed from: p */
    private AtomicBoolean f35660p = new AtomicBoolean(true);

    /* renamed from: r */
    private ConcurrentMap<String, CopyOnWriteArrayList<String>> f35661r = new ConcurrentHashMap();

    /* renamed from: s */
    private AtomicInteger f35662s = new AtomicInteger(0);

    /* renamed from: t */
    private AtomicInteger f35663t = new AtomicInteger(5);

    /* renamed from: u */
    private AtomicInteger f35664u = new AtomicInteger(5);

    /* renamed from: v */
    private final C14681d f35665v;

    /* renamed from: w */
    private Handler f35666w = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14682e.HandlerC146831 */

        static {
            Covode.recordClassIndex(16780);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && (message.obj instanceof C14682e)) {
                Bundle data = message.getData();
                data.getSerializable("callback_dnsresult_key");
                if (data.getSerializable("callback_dnsresult_job_key") != null) {
                    int i = message.what;
                }
            }
        }
    };

    /* renamed from: a */
    public final synchronized void mo23682a(C14668a.EnumC14669a aVar) {
        MethodCollector.m26663i(11004);
        ConcurrentSkipListSet<String> concurrentSkipListSet = this.f35653e;
        if (concurrentSkipListSet == null || concurrentSkipListSet.size() == 0 || this.f35653e.size() > 10) {
            MethodCollector.m26664o(11004);
            return;
        }
        Iterator<String> it = this.f35653e.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            String next = it.next();
            if (!this.f35665v.mo23676d(next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            MethodCollector.m26664o(11004);
            return;
        }
        m26871a((List<String>) arrayList, aVar, false);
        MethodCollector.m26664o(11004);
    }

    /* renamed from: a */
    public final void mo23684a(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("ttnet_http_dns_enabled", -1);
            boolean z = false;
            if (optInt >= 0) {
                this.f35660p.set(optInt == 1);
            }
            String optString = jSONObject.optString("ttnet_tt_http_dns_domain");
            if (!TextUtils.isEmpty(optString)) {
                this.f35651c = optString;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_tt_http_dns_preload_batch_host");
            if (optJSONArray != null) {
                this.f35653e.clear();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString2 = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString2)) {
                        this.f35653e.add(optString2);
                    }
                }
            }
            int optInt2 = jSONObject.optInt("localdns_cache_ttl", -1);
            if (optInt2 >= 0) {
                this.f35654f.set(optInt2);
            }
            int optInt3 = jSONObject.optInt("httpdns_prefer_time_ms", -1);
            if (optInt3 >= 0) {
                this.f35655g.set(optInt3);
            }
            int optInt4 = jSONObject.optInt("httpdns_stale_cache_interval", -1);
            if (optInt4 >= 0) {
                this.f35656h.set(optInt4);
            }
            int optInt5 = jSONObject.optInt("enable_compare_localdns_httpdns", -1);
            if (optInt5 >= 0) {
                this.f35662s.set(optInt5);
            }
            int optInt6 = jSONObject.optInt("ttnet_http_dns_prefer", -1);
            if (optInt6 >= 0) {
                AtomicBoolean atomicBoolean = this.f35650b;
                if (optInt6 == 1) {
                    z = true;
                }
                atomicBoolean.set(z);
            }
            int optInt7 = jSONObject.optInt("ttnet_http_dns_timeout", -1);
            if (optInt7 >= 0) {
                this.f35663t.set(optInt7);
            }
            int optInt8 = jSONObject.optInt("ttnet_local_dns_time_out", -1);
            if (optInt8 >= 0) {
                this.f35664u.set(optInt8);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("ttnet_http_dns_addr");
            if (optJSONObject != null) {
                this.f35661r.clear();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString3 = optJSONObject.optString(next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString3)) {
                        String[] split = optString3.split(",");
                        if (next.equals(this.f35651c)) {
                            this.f35652d.clear();
                            this.f35652d.addAll(Arrays.asList(split));
                        } else {
                            this.f35661r.put(next, new CopyOnWriteArrayList<>(Arrays.asList(split)));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m26873a(C14680c cVar, C14678b bVar) {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 1;
        Bundle bundle = new Bundle();
        bundle.putSerializable("callback_dnsresult_job_key", cVar);
        bundle.putSerializable("callback_dnsresult_key", bVar);
        obtain.setData(bundle);
        this.f35666w.sendMessage(obtain);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23683a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            this.f35652d.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f35652d.add(optString);
                }
            }
            SharedPreferences.Editor edit = C34822d.m71158a(this.f35658j.mo23687a(), "dispatchersdk_httpdns_hardcodeips", 0).edit();
            edit.putString("httpdns_hardcodeips", String.valueOf(jSONArray));
            edit.apply();
        }
    }

    /* renamed from: a */
    public final C14678b mo23681a(String str) {
        boolean z;
        C14678b bVar;
        Future<Void> f;
        if (this.f35659k && this.f35660p.get() && C14670a.m26843a(str) && !C14672c.m26846b(str) && !C14672c.m26845a(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        boolean equals = str.equals(this.f35651c);
        if (!this.f35650b.get() || equals) {
            C14678b b = m26875b(str, false);
            if (b != null) {
                return b;
            }
            if (this.f35665v.mo23679g(str)) {
                f = this.f35665v.mo23680h(str);
            } else {
                f = m26881f(str);
            }
            if (f == null) {
                C14678b a = m26867a(str, equals);
                if (a == null) {
                    return m26874b(str);
                }
                return a;
            } else if (f.isDone()) {
                bVar = m26875b(str, true);
                if (bVar == null) {
                    bVar = m26867a(str, equals);
                }
            } else {
                try {
                    f.get(((long) this.f35664u.get()) * 1000, TimeUnit.MILLISECONDS);
                    bVar = m26875b(str, true);
                    if (bVar == null) {
                        bVar = m26867a(str, equals);
                    }
                } catch (Exception unused) {
                    bVar = m26867a(str, equals);
                }
            }
        } else {
            C14678b c = m26877c(str, false);
            if (c != null) {
                return c;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, false);
            bVar = m26868a(m26870a(str, arrayList), str, arrayList.get(0).booleanValue());
        }
        if (bVar == null) {
            return m26874b(str);
        }
        return bVar;
    }

    /* renamed from: b */
    public static void m26876b() {
        try {
            f35647n.submit(new CallableC14687i());
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
        }
    }

    static {
        Covode.recordClassIndex(16779);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 6;
        f35647n = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static C14682e m26869a() {
        MethodCollector.m26663i(10865);
        if (f35648o == null) {
            synchronized (C14682e.class) {
                try {
                    if (f35648o == null) {
                        f35648o = new C14682e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10865);
                    throw th;
                }
            }
        }
        C14682e eVar = f35648o;
        MethodCollector.m26664o(10865);
        return eVar;
    }

    private C14682e() {
        HandlerThread handlerThread = new HandlerThread("TTOK-HTTPDNS");
        f35645l = handlerThread;
        handlerThread.start();
        f35646m = new WeakHandler(f35645l.getLooper(), this);
        f35649q = "4.0.71.7-tiktok";
        this.f35665v = new C14681d(f35646m);
    }

    /* renamed from: d */
    private void m26879d(String str) {
        if (C14670a.m26843a(str) && !this.f35665v.mo23676d(str)) {
            this.f35665v.mo23668a(str);
        }
    }

    /* renamed from: e */
    private void m26880e(String str) {
        C14681d dVar;
        C14668a c;
        if (C14670a.m26843a(str) && (c = (dVar = this.f35665v).mo23674c(str)) != null) {
            c.mo23652c();
            dVar.f35632b.remove(str);
        }
    }

    /* renamed from: c */
    private void m26878c(String str) {
        if (C14670a.m26843a(str) && !this.f35665v.mo23676d(str) && this.f35650b.get()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m26871a((List<String>) arrayList, C14668a.EnumC14669a.CACHE_STALE_EXPIRED, false);
        }
    }

    /* renamed from: f */
    private synchronized Future<Void> m26881f(String str) {
        MethodCollector.m26663i(11450);
        if (this.f35665v.mo23679g(str)) {
            Future<Void> h = this.f35665v.mo23680h(str);
            MethodCollector.m26664o(11450);
            return h;
        }
        Future<Void> future = null;
        try {
            future = f35647n.submit(new CallableC14688j(str, this.f35665v, f35646m));
            this.f35665v.f35634d.put(str, future);
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(11450);
        return future;
    }

    /* renamed from: b */
    private C14678b m26874b(String str) {
        if (!this.f35661r.containsKey(str)) {
            return null;
        }
        C14678b bVar = new C14678b();
        Iterator<String> it = this.f35661r.get(str).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (C14672c.m26845a(next)) {
                bVar.ipv6List.add(next);
            } else if (C14672c.m26846b(next)) {
                bVar.ipv4List.add(next);
            }
        }
        bVar.source = C14678b.EnumC14679a.HARDCODE_IPS;
        return bVar;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        if ((message.obj instanceof C14682e) || (message.obj instanceof CallableC14684f) || (message.obj instanceof CallableC14688j) || (message.obj instanceof C14668a) || (message.obj instanceof C14681d)) {
            try {
                if ((message.obj instanceof C14682e) && message.what == 2) {
                    C14680c cVar = (C14680c) message.getData().getSerializable("httpdns_timeout_job_key");
                    if (cVar != null) {
                        if (this.f35665v.mo23670a(cVar)) {
                            m26873a(cVar, m26875b(cVar.getHost(), cVar.isLocalDnsExpired()));
                            this.f35665v.mo23673b(cVar);
                        }
                    }
                } else if (!(message.obj instanceof CallableC14684f) || message.what != 3) {
                    if ((message.obj instanceof CallableC14688j) && message.what == 1) {
                        String string = message.getData().getString("localdns_completed_host");
                        if (string != null) {
                            if (this.f35665v.f35636f.containsKey(string)) {
                                Iterator<C14680c> it = this.f35665v.f35636f.get(string).iterator();
                                while (it.hasNext()) {
                                    C14680c next = it.next();
                                    C14678b b = m26875b(string, true);
                                    if (b == null) {
                                        C14678b c = m26877c(string, false);
                                        if (c == null) {
                                            m26872a(next);
                                            this.f35665v.mo23669a(next.getHost(), next);
                                        } else {
                                            m26873a(next, c);
                                        }
                                    } else {
                                        m26873a(next, b);
                                    }
                                    this.f35665v.mo23675c(next);
                                }
                            }
                        }
                    } else if ((message.obj instanceof C14682e) && message.what == 3) {
                        C14680c cVar2 = (C14680c) message.getData().getSerializable("dns_timeout_job_key");
                        if (cVar2 != null) {
                            C14681d dVar = this.f35665v;
                            if (dVar.f35636f.containsKey(cVar2.getHost()) && dVar.f35636f.get(cVar2.getHost()).contains(cVar2)) {
                                C14678b c2 = m26877c(cVar2.getHost(), false);
                                if (c2 != null) {
                                    m26873a(cVar2, c2);
                                } else {
                                    if (!this.f35665v.mo23676d(cVar2.getHost())) {
                                        m26872a(cVar2);
                                    }
                                    this.f35665v.mo23669a(cVar2.getHost(), cVar2);
                                }
                                this.f35665v.mo23675c(cVar2);
                            }
                        }
                    } else if ((message.obj instanceof C14682e) && message.what == 4) {
                        C14680c cVar3 = (C14680c) message.getData().getSerializable("dns_timeout_job_key");
                        if (cVar3 != null && this.f35665v.mo23670a(cVar3)) {
                            m26873a(cVar3, (C14678b) null);
                            this.f35665v.mo23673b(cVar3);
                        }
                    } else if ((message.obj instanceof C14682e) && message.what == 5) {
                        String string2 = C34822d.m71158a(this.f35658j.mo23687a(), "dispatchersdk_httpdns_hardcodeips", 0).getString("httpdns_hardcodeips", "");
                        if (!TextUtils.isEmpty(string2)) {
                            this.f35652d.clear();
                            try {
                                JSONArray jSONArray = new JSONArray(string2);
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    String optString = jSONArray.optString(i);
                                    if (!TextUtils.isEmpty(optString)) {
                                        this.f35652d.add(optString);
                                    }
                                }
                            } catch (JSONException unused) {
                            }
                        } else if (this.f35658j.mo23691e() != null && this.f35652d.size() == 0) {
                            this.f35652d.addAll(Arrays.asList(this.f35658j.mo23691e()));
                        }
                    } else if ((message.obj instanceof C14682e) && message.what == 6) {
                        this.f35665v.mo23667a(m26869a().f35658j.mo23687a());
                    } else if ((message.obj instanceof C14682e) && message.what == 7) {
                        m26876b();
                    } else if (message.obj instanceof C14668a) {
                        String string3 = message.getData().getString("dnsrecord_host");
                        if (!TextUtils.isEmpty(string3)) {
                            switch (message.what) {
                                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                    m26869a().m26878c(string3);
                                    return;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                    m26869a().m26880e(string3);
                                    return;
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                    C14681d dVar2 = m26869a().f35665v;
                                    dVar2.f35637g.add(string3);
                                    if (dVar2.f35637g.size() >= 10) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.addAll(dVar2.f35637g);
                                        m26869a().m26871a((List<String>) arrayList, C14668a.EnumC14669a.REFRESH_BATCH, false);
                                        return;
                                    }
                                    return;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                    m26869a().m26879d(string3);
                                    return;
                                default:
                                    return;
                            }
                        }
                    } else if ((message.obj instanceof C14681d) && message.what == 20) {
                        this.f35665v.mo23672b();
                    }
                } else {
                    ArrayList<String> stringArrayList = message.getData().getStringArrayList("httpdns_completed_hosts");
                    if (stringArrayList != null) {
                        for (String str : stringArrayList) {
                            if (this.f35665v.f35635e.containsKey(str)) {
                                Iterator<C14680c> it2 = this.f35665v.f35635e.get(str).iterator();
                                while (it2.hasNext()) {
                                    C14680c next2 = it2.next();
                                    C14678b c3 = m26877c(str, true);
                                    if (m26869a().f35650b.get() && c3 == null) {
                                        c3 = m26875b(str, next2.isLocalDnsExpired());
                                    }
                                    m26873a(next2, c3);
                                    this.f35665v.mo23673b(next2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private void m26872a(C14680c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.getHost());
        m26871a((List<String>) arrayList, C14668a.EnumC14669a.CACHE_UNSET, false);
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = this;
        Bundle bundle = new Bundle();
        bundle.putSerializable("dns_timeout_job_key", cVar);
        obtain.setData(bundle);
        f35646m.sendMessageDelayed(obtain, ((long) this.f35663t.get()) * 1000);
    }

    /* renamed from: b */
    private C14678b m26875b(String str, boolean z) {
        C14678b bVar = new C14678b();
        C14668a c = this.f35665v.mo23674c(str);
        if (c == null) {
            return null;
        }
        bVar.ipv4List = c.f35607b;
        bVar.ipv6List = c.f35608c;
        if (z) {
            bVar.source = C14678b.EnumC14679a.LOCALDNS_REQUEST;
        } else {
            bVar.source = C14678b.EnumC14679a.LOCALDNS_CACHE;
        }
        return bVar;
    }

    /* renamed from: a */
    private C14678b m26867a(String str, boolean z) {
        Future<Void> a;
        C14678b bVar = null;
        if (z) {
            return null;
        }
        if (this.f35665v.mo23676d(str)) {
            a = this.f35665v.mo23678f(str);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a = m26871a((List<String>) arrayList, C14668a.EnumC14669a.CACHE_UNSET, true);
        }
        if (a == null) {
            return null;
        }
        if (a.isDone()) {
            return m26877c(str, true);
        }
        try {
            a.get(((long) this.f35663t.get()) * 1000, TimeUnit.MILLISECONDS);
            bVar = m26877c(str, true);
            return bVar;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return bVar;
        }
    }

    /* renamed from: c */
    private C14678b m26877c(String str, boolean z) {
        C14668a b = this.f35665v.mo23671b(str);
        if (b == null) {
            return null;
        }
        C14678b bVar = new C14678b();
        bVar.ipv4List = b.f35607b;
        bVar.ipv6List = b.f35608c;
        if (!z) {
            if ((b.f35609d * 1000) + b.f35610e > System.currentTimeMillis()) {
                bVar.source = C14678b.EnumC14679a.HTTPDNS_CACHE;
            } else {
                bVar.source = C14678b.EnumC14679a.HTTPDNS_STALE_CACHE;
            }
            return bVar;
        } else if ((b.f35609d * 1000) + b.f35610e <= System.currentTimeMillis()) {
            return null;
        } else {
            bVar.source = C14678b.EnumC14679a.HTTPDNS_REQUEST;
            return bVar;
        }
    }

    /* renamed from: a */
    private Future<Void> m26870a(String str, List<Boolean> list) {
        Future<Void> a;
        MethodCollector.m26663i(11297);
        C14668a c = this.f35665v.mo23674c(str);
        if (c == null || c.f35610e + (c.f35609d * 1000) <= System.currentTimeMillis() + ((long) this.f35655g.get())) {
            list.set(0, true);
            if (!this.f35665v.mo23679g(str)) {
                m26881f(str);
            }
        }
        if (this.f35665v.mo23676d(str)) {
            a = this.f35665v.mo23678f(str);
        } else {
            synchronized (this) {
                try {
                    if (this.f35665v.mo23676d(str)) {
                        a = this.f35665v.mo23678f(str);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        a = m26871a((List<String>) arrayList, C14668a.EnumC14669a.CACHE_UNSET, true);
                    }
                } finally {
                    MethodCollector.m26664o(11297);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    private C14678b m26868a(Future<Void> future, String str, boolean z) {
        if (future == null) {
            try {
                return m26875b(str, z);
            } catch (InterruptedException unused) {
                return m26875b(str, z);
            } catch (ExecutionException unused2) {
                return m26875b(str, z);
            } catch (TimeoutException unused3) {
                return m26875b(str, z);
            }
        } else if (future.isDone()) {
            C14678b c = m26877c(str, true);
            if (c == null) {
                return m26875b(str, z);
            }
            return c;
        } else {
            future.get((long) m26869a().f35655g.get(), TimeUnit.MILLISECONDS);
            C14678b c2 = m26877c(str, true);
            if (c2 == null) {
                return m26875b(str, z);
            }
            return c2;
        }
    }

    /* renamed from: a */
    private synchronized Future<Void> m26871a(List<String> list, C14668a.EnumC14669a aVar, boolean z) {
        MethodCollector.m26663i(11449);
        Future<Void> future = null;
        if (list.size() == 0) {
            MethodCollector.m26664o(11449);
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (this.f35665v.mo23676d(list.get(i))) {
                if (z && list.size() == 1 && i == 0) {
                    future = this.f35665v.mo23678f(list.get(i));
                }
                list.remove(list.get(i));
            }
        }
        if (list.size() == 0) {
            MethodCollector.m26664o(11449);
            return future;
        }
        try {
            future = f35647n.submit(new CallableC14684f(C14670a.m26842a(list), f35649q, this.f35665v, aVar, f35646m));
            for (String str : list) {
                this.f35665v.f35633c.put(str, future);
                if (this.f35650b.get()) {
                    C14681d dVar = this.f35665v;
                    if (dVar.f35637g.contains(str)) {
                        dVar.f35637g.remove(str);
                    }
                }
            }
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(11449);
        return future;
    }
}
