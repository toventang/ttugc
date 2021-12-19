package com.bytedance.apm.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.block.C12388f;
import com.bytedance.apm.core.AbstractC12437c;
import com.bytedance.apm.core.SharedPreferencesC12438d;
import com.bytedance.apm.impl.C12493a;
import com.bytedance.apm.internal.C12508a;
import com.bytedance.apm.p758b.C12310a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12584g;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.apm.p789q.C12588j;
import com.bytedance.apm.p789q.C12593n;
import com.bytedance.apm.p789q.C12603v;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.C21495h;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.services.apm.api.C22710c;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.config.g */
public class C12426g implements C12560b.AbstractC12565b {

    /* renamed from: a */
    public volatile boolean f30161a;

    /* renamed from: b */
    volatile boolean f30162b;

    /* renamed from: c */
    volatile JSONObject f30163c;

    /* renamed from: d */
    volatile JSONObject f30164d;

    /* renamed from: e */
    List<String> f30165e = C12310a.f29614a;

    /* renamed from: f */
    AbstractC12437c f30166f;

    /* renamed from: g */
    public JSONObject f30167g;

    /* renamed from: h */
    boolean f30168h;

    /* renamed from: i */
    long f30169i = -1;

    /* renamed from: j */
    volatile boolean f30170j;

    /* renamed from: k */
    boolean f30171k;

    /* renamed from: l */
    public boolean f30172l;

    /* renamed from: m */
    List<AbstractC22715a> f30173m;

    /* renamed from: n */
    private volatile JSONObject f30174n;

    /* renamed from: o */
    private volatile long f30175o = 1200;

    /* renamed from: p */
    private volatile SharedPreferences f30176p;

    /* renamed from: q */
    private long f30177q = 60000;

    /* renamed from: r */
    private long f30178r = -1;

    static {
        Covode.recordClassIndex(14234);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo20222a(String str) {
        if (this.f30174n == null || TextUtils.isEmpty(str) || this.f30174n.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.config.g$a */
    public static class C12432a {

        /* renamed from: a */
        private String f30185a;

        /* renamed from: b */
        private Map<String, String> f30186b = new HashMap();

        static {
            Covode.recordClassIndex(14240);
        }

        /* renamed from: a */
        private void m22385a() {
            this.f30186b.put("Content-Type", "application/json; charset=utf-8");
        }

        C12432a(String str) {
            this.f30185a = str;
        }

        /* renamed from: b */
        private void m22386b(Map<String, String> map) {
            map.put("minor_version", "1");
            this.f30185a = C12603v.m22730a(this.f30185a, map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C12493a mo20232a(Map<String, String> map) {
            m22386b(map);
            m22385a();
            return new C12493a(this.f30185a, this.f30186b);
        }
    }

    /* renamed from: e */
    private void m22373e() {
        C12560b.C12564a.f30567a.mo20388a(new Runnable() {
            /* class com.bytedance.apm.config.C12426g.RunnableC124292 */

            static {
                Covode.recordClassIndex(14237);
            }

            public final void run() {
                try {
                    Intent intent = new Intent("com.apm.setting.update.action");
                    intent.putExtra("PROCESS_NAME", C12593n.m22697a());
                    C12397c.f29931a.sendBroadcast(intent);
                } catch (Exception unused) {
                }
            }
        }, 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo20225c() {
        if (this.f30172l || this.f30171k) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo20226d() {
        mo20224b();
        return this.f30176p.getString("monitor_net_config", "");
    }

    C12426g() {
    }

    /* renamed from: f */
    private void m22374f() {
        if (!this.f30161a) {
            this.f30161a = true;
            List<AbstractC22715a> list = this.f30173m;
            if (list != null) {
                for (AbstractC22715a aVar : list) {
                    try {
                        aVar.mo20038d();
                    } catch (Throwable th) {
                        C22708a.m42802a(th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20224b() {
        if (this.f30176p == null) {
            synchronized (this) {
                if (this.f30176p == null) {
                    this.f30176p = SharedPreferencesC12438d.m22396a(C12397c.f29931a, "monitor_config");
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo20221a() {
        String d = mo20226d();
        if (!TextUtils.isEmpty(d)) {
            try {
                JSONObject jSONObject = new JSONObject(d);
                this.f30168h = true;
                if (this.f30176p.getInt("setting_version", 0) == 3) {
                    this.f30169i = this.f30176p.getLong("monitor_configure_refresh_time", 0);
                    C12397c.m22283a("config_time", new StringBuilder().append(this.f30169i).toString());
                    C13037a.f31822d = this.f30169i;
                    m22366a(jSONObject);
                    m22367a(jSONObject, true);
                    m22374f();
                    return false;
                }
            } catch (Exception unused) {
                new String[]{"config read error"};
            }
        }
        return true;
    }

    @Override // com.bytedance.apm.p788p.C12560b.AbstractC12565b
    /* renamed from: a */
    public final void mo20219a(long j) {
        mo20220a(false);
    }

    /* renamed from: b */
    private void m22370b(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("ret");
            String optString = jSONObject.optString(StringSet.name);
            m22372c(optJSONObject);
            SharedPreferences.Editor edit = this.f30176p.edit();
            edit.putString("monitor_net_config", optJSONObject.toString());
            edit.putInt("setting_version", 3);
            edit.putString("monitor_net_config_name", optString);
            edit.putLong("monitor_configure_refresh_time", this.f30169i);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static List<String> m22365a(List<String> list) {
        try {
            if (!C12585h.m22682a(list)) {
                ArrayList arrayList = new ArrayList(2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String host = new URL(list.get(i)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        arrayList.add("https://" + host + "/monitor/appmonitor/v3/settings");
                    }
                }
                return arrayList;
            }
        } catch (MalformedURLException unused) {
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    private boolean m22371b(long j) {
        long j2 = this.f30177q;
        if (j2 > 60000) {
            if (j - this.f30178r > j2) {
                return true;
            }
            return false;
        } else if (j - this.f30169i > this.f30175o * 1000) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private void m22366a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z;
        if (!C12584g.m22676b(jSONObject)) {
            JSONObject a = C12584g.m22675a(jSONObject, "general", "slardar_api_settings");
            if (a != null) {
                JSONObject optJSONObject2 = a.optJSONObject("fetch_setting");
                if (optJSONObject2 != null) {
                    this.f30175o = optJSONObject2.optLong("fetch_setting_interval", 1200);
                }
                if (this.f30175o < 600) {
                    this.f30175o = 600;
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("custom_event_settings");
            if (optJSONObject3 != null) {
                this.f30163c = optJSONObject3.optJSONObject("allow_log_type");
                this.f30164d = optJSONObject3.optJSONObject("allow_metric_type");
                this.f30174n = optJSONObject3.optJSONObject("allow_service_name");
            }
            this.f30167g = jSONObject;
            JSONObject b = mo20223b("exception_modules");
            if (!(b == null || (optJSONObject = b.optJSONObject("exception")) == null)) {
                if (optJSONObject.optInt("enable_upload") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f30162b = z;
            }
            if (mo20222a("apm_cost")) {
                C21495h.f50997c = new C21495h.AbstractC21497a() {
                    /* class com.bytedance.apm.config.C12426g.C124303 */

                    static {
                        Covode.recordClassIndex(14238);
                    }

                    @Override // com.bytedance.monitor.collector.C21495h.AbstractC21497a
                    /* renamed from: a */
                    public final void mo20230a(final long j) {
                        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                            /* class com.bytedance.apm.config.C12426g.C124303.RunnableC124311 */

                            static {
                                Covode.recordClassIndex(14239);
                            }

                            public final void run() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("looper_monitor", j);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("is_main_process", C12426g.this.f30172l);
                                    C12290b.m22066a("apm_cost", jSONObject2, jSONObject, (JSONObject) null);
                                } catch (JSONException unused) {
                                }
                            }
                        });
                    }
                };
                C21495h.f50998d = true;
            }
        }
    }

    /* renamed from: c */
    private static void m22372c(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        boolean z6 = true;
        if (optJSONObject != null) {
            C12508a.m22478a(32, !optJSONObject.optBoolean("enable_salvage_log", true));
        }
        JSONObject a = C12584g.m22675a(jSONObject, "performance_modules", "smooth");
        if (a != null) {
            if (a.optInt("block_enable_upload", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            C12508a.m22478a(1, z3);
            if (a.optInt("enable_trace", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            C12508a.m22478a(2, z4);
            if (a.optInt("enable_stack_sampling", 0) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            C12508a.m22478a(64, z5);
            C12508a.f30377e = a.optLong("atrace_tag", 0);
            C12508a.m22477a(C12388f.m22256a(jSONObject) << 29);
        }
        JSONObject a2 = C12584g.m22675a(jSONObject, "performance_modules", "start_trace");
        if (a2 != null) {
            if (a2.optInt("enable_perf_data_collect", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            C12508a.m22478a(4, z);
            if (a2.optInt("enable_lock_data_collect", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C12508a.m22478a(8, z2);
            if (a2.optInt("enable_long_sleep_data_collect", 0) != 1) {
                z6 = false;
            }
            C12508a.m22478a(16, z6);
        }
        if (a != null || a2 != null) {
            C12508a.m22476a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final JSONObject mo20223b(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.f30167g) == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: a */
    private boolean m22368a(C22710c cVar) {
        byte[] bArr;
        if (cVar == null || cVar.f53672a != 200 || (bArr = cVar.f53674c) == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(new String(bArr));
        JSONObject optJSONObject = jSONObject.optJSONObject("ret");
        this.f30168h = false;
        m22366a(optJSONObject);
        m22367a(optJSONObject, false);
        m22374f();
        this.f30169i = System.currentTimeMillis();
        C12397c.m22283a("config_time", new StringBuilder().append(this.f30169i).toString());
        C13037a.f31822d = this.f30169i;
        m22370b(jSONObject);
        m22373e();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20220a(boolean z) {
        AbstractC12437c cVar;
        if (!mo20225c()) {
            return;
        }
        if ((z || m22371b(System.currentTimeMillis())) && C12588j.m22688a(C12397c.f29931a) && (cVar = this.f30166f) != null && cVar.mo20253a() != null && !this.f30166f.mo20253a().isEmpty()) {
            this.f30178r = System.currentTimeMillis();
            for (String str : this.f30165e) {
                try {
                    C12493a a = new C12432a(str).mo20232a(this.f30166f.mo20253a());
                    if (m22368a(C12397c.m22277a(a.f30328a, a.f30329b))) {
                        this.f30177q = 60000;
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
            this.f30177q = Math.min(this.f30177q * 2, 600000L);
        }
    }

    /* renamed from: a */
    private void m22367a(JSONObject jSONObject, boolean z) {
        List<AbstractC22715a> list = this.f30173m;
        if (list != null) {
            for (AbstractC22715a aVar : list) {
                try {
                    aVar.mo20180a(jSONObject, z);
                } catch (Throwable th) {
                    C22708a.m42802a(th);
                }
            }
        }
    }

    /* renamed from: b */
    private static Intent m22369b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m22364a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m22369b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.config.C12426g.m22364a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
