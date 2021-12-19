package com.p2082ss.android.ugc.aweme.logger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.logger.a */
public final class C58945a {

    /* renamed from: a */
    public Map<String, Long> f134174a;

    /* renamed from: b */
    public Map<String, Long> f134175b;

    /* renamed from: c */
    public boolean f134176c;

    /* renamed from: d */
    public boolean f134177d;

    /* renamed from: e */
    public boolean f134178e;

    /* renamed from: f */
    public volatile int f134179f;

    /* renamed from: g */
    public boolean f134180g;

    /* renamed from: h */
    public long f134181h;

    /* renamed from: i */
    public long f134182i;

    /* renamed from: j */
    public HashMap<String, Long> f134183j;

    /* renamed from: k */
    private Map<String, Long> f134184k;

    /* renamed from: com.ss.android.ugc.aweme.logger.a$a */
    public static class C58946a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(69270);
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    static {
        Covode.recordClassIndex(69269);
    }

    /* renamed from: c */
    public static C58945a m108291c() {
        return C58947b.f134185a;
    }

    /* renamed from: com.ss.android.ugc.aweme.logger.a$b */
    public static class C58947b {

        /* renamed from: a */
        public static final C58945a f134185a = new C58945a((byte) 0);

        static {
            Covode.recordClassIndex(69271);
        }
    }

    /* renamed from: b */
    public static boolean m108290b() {
        return C36145b.m73641b().mo63260a(C17867d.m33078a(), "log_release_build_version_v4").isEmpty();
    }

    /* renamed from: d */
    private boolean m108293d() {
        if (this.f134175b.isEmpty() || this.f134177d) {
            return m108294e();
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m108295f() {
        Context a = C17867d.m33078a();
        String c = C17867d.m33082c();
        String a2 = C36145b.m73641b().mo63260a(a, "log_release_build_version_v4");
        if (c.isEmpty()) {
            c = "default_version";
        }
        if (a2.equals(c)) {
            return false;
        }
        C36145b.m73641b().mo63265a(a, "log_release_build_version_v4", c);
        return true;
    }

    /* renamed from: g */
    private void m108296g() {
        HashMap<String, Long> hashMap = this.f134183j;
        if (!(hashMap == null || hashMap.isEmpty())) {
            long j = 0;
            for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
                j += entry.getValue().longValue();
            }
            this.f134184k.put("load_sp_total", Long.valueOf(j));
        }
    }

    private C58945a() {
        this.f134174a = new ConcurrentHashMap();
        this.f134175b = new ConcurrentHashMap();
        this.f134184k = new ConcurrentHashMap();
        this.f134176c = true;
        this.f134177d = false;
        this.f134178e = false;
        this.f134179f = -1;
        this.f134180g = true;
        this.f134183j = new HashMap<>();
        if (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 21) {
            this.f134174a = Collections.synchronizedMap(this.f134174a);
            this.f134175b = Collections.synchronizedMap(this.f134175b);
            this.f134184k = Collections.synchronizedMap(this.f134184k);
        }
    }

    /* renamed from: e */
    private boolean m108294e() {
        Long l = this.f134184k.get("cold_boot_application_to_main");
        if (l != null && l.longValue() > 1000) {
            return false;
        }
        Long l2 = this.f134184k.get("cold_boot_application_to_splash");
        if (l2 != null && l2.longValue() > 1000) {
            return false;
        }
        Long l3 = this.f134184k.get("cold_boot_splash_to_main");
        if (l3 != null && l3.longValue() > 1000) {
            return false;
        }
        Long l4 = this.f134184k.get("cold_boot_main_create_to_resume");
        if (l4 == null || l4.longValue() <= 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo96422a() {
        if (m108290b()) {
            if (this.f134178e) {
                m108292c("first_feed_show_time_new_user_v4");
            } else {
                m108292c("first_feed_show_time_new_user");
            }
            m108295f();
        } else if (!this.f134176c || !m108293d() || m108295f()) {
            return;
        } else {
            if (this.f134177d) {
                m108292c("first_feed_show_time_v3_cache");
            } else {
                m108292c("first_feed_show_time_v3");
            }
        }
        this.f134176c = false;
        this.f134180g = false;
        this.f134174a.clear();
        this.f134175b.clear();
        this.f134184k.clear();
    }

    /* synthetic */ C58945a(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo96426a(String str) {
        if (this.f134174a.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo96430b(String str) {
        if (this.f134184k.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m108292c(String str) {
        int i;
        boolean b = m108290b();
        m108296g();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        int i2 = 1;
        try {
            jSONObject.put("app2main5s", 1);
            if (!str.equals("first_feed_show_time_new_user") || (this.f134180g && m108294e())) {
                for (Map.Entry<String, Long> entry : this.f134184k.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            } else {
                jSONObject2.put("new_user_report_bad_case", 1);
            }
            if (this.f134177d) {
                i = 1;
            } else {
                i = 2;
            }
            jSONObject2.put("cold_boot_use_cache", i);
            if (str.equals("first_feed_show_time_new_user_v4")) {
                i2 = 3;
            } else if (!b) {
                i2 = 2;
            }
            jSONObject2.put("is_new_user", i2);
            jSONObject2.put("convert_type", this.f134179f);
            jSONObject3.put("category", jSONObject);
            jSONObject3.put("metric", jSONObject2);
            jSONObject4.put("placeHolder", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C12290b.m22065a(str, jSONObject4, jSONObject3);
        if (!b) {
            C12290b.m22065a("first_feed_show_time_v3_all", jSONObject4, jSONObject3);
        }
        C1731i.m5640b(new CallableC58948b(jSONObject2), C1731i.f5562a);
    }

    /* renamed from: a */
    public final void mo96425a(String str, boolean z) {
        mo96424a(str, SystemClock.uptimeMillis(), z);
    }

    /* renamed from: b */
    public final void mo96429b(String str, boolean z) {
        mo96428b(str, SystemClock.uptimeMillis(), z);
    }

    /* renamed from: a */
    public final void mo96423a(String str, long j) {
        if (this.f134184k.get(str) == null) {
            this.f134184k.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo96427b(String str, long j) {
        Long l = this.f134184k.get(str);
        if (l != null) {
            j += l.longValue();
        }
        this.f134184k.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo96424a(String str, long j, boolean z) {
        if (this.f134174a.get(str) == null) {
            this.f134174a.put(str, Long.valueOf(j));
            if (z) {
                this.f134175b.put(str, Long.valueOf(j));
            }
        } else if (z) {
            this.f134176c = false;
        }
    }

    /* renamed from: b */
    public final void mo96428b(String str, long j, boolean z) {
        Long l = this.f134174a.get(str);
        if (l != null) {
            if (this.f134184k.get(str) == null) {
                this.f134184k.put(str, Long.valueOf(j - l.longValue()));
                l.longValue();
            }
            if (z) {
                this.f134175b.remove(str);
            }
        } else if (z) {
            this.f134176c = false;
        } else {
            this.f134184k.put(str, 0L);
        }
    }
}
