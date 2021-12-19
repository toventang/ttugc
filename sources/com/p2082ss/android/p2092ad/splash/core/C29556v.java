package com.p2082ss.android.p2092ad.splash.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29462f;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29474p;
import com.p2082ss.android.p2092ad.splash.p2109f.C29638a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29639b;
import com.p2082ss.android.p2092ad.splash.p2109f.C29641d;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Calendar;

/* renamed from: com.ss.android.ad.splash.core.v */
public class C29556v {

    /* renamed from: a */
    static final String f70430a;

    /* renamed from: c */
    static Calendar f70431c = Calendar.getInstance();

    /* renamed from: d */
    private static volatile C29556v f70432d;

    /* renamed from: b */
    public SharedPreferences f70433b = C34822d.m71158a(C29495h.f70242r, "splash_ad_sp", 0);

    /* renamed from: e */
    private long f70434e;

    /* renamed from: f */
    private long f70435f;

    /* renamed from: g */
    private SharedPreferences.Editor f70436g;

    /* renamed from: h */
    public final void mo51750h() {
        this.f70436g.apply();
    }

    private C29556v() {
    }

    /* renamed from: B */
    private String m59361B() {
        return this.f70433b.getString("key_last_show_sequence_day", "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C29556v mo51745f() {
        mo51764u().putInt("key_splash_ad_show_sequence", mo51759p() + 1);
        return this;
    }

    /* renamed from: j */
    public final long mo51753j() {
        return this.f70433b.getLong("splash_ad_leave_interval", 0);
    }

    /* renamed from: k */
    public final long mo51754k() {
        return this.f70433b.getLong("splash_ad_splash_interval", 0);
    }

    /* renamed from: l */
    public final int mo51755l() {
        return this.f70433b.getInt("show_splash_ad_day", 0);
    }

    /* renamed from: m */
    public final int mo51756m() {
        return this.f70433b.getInt("splash_ad_show_limit", 0);
    }

    /* renamed from: n */
    public final boolean mo51757n() {
        return this.f70433b.getBoolean("key_splash_ad_need_ack", false);
    }

    /* renamed from: q */
    public final boolean mo51760q() {
        return this.f70433b.getBoolean("key_splash_ad_empty", false);
    }

    /* renamed from: r */
    public final String mo51761r() {
        return this.f70433b.getString("key_splash_ad_rt_necessary_device_params", "");
    }

    /* renamed from: s */
    public final String mo51762s() {
        return this.f70433b.getString("key_splash_ad_penalty_period", "");
    }

    /* renamed from: t */
    public final String mo51763t() {
        return this.f70433b.getString("key_empty_log_extra_substitute", "");
    }

    /* renamed from: u */
    public final SharedPreferences.Editor mo51764u() {
        if (this.f70436g == null) {
            this.f70436g = this.f70433b.edit();
        }
        return this.f70436g;
    }

    /* renamed from: v */
    public final long mo51765v() {
        return this.f70433b.getLong("key_splash_ad_showed_time", -1);
    }

    /* renamed from: w */
    public final C29556v mo51766w() {
        mo51764u().remove("key_splash_show_times_map");
        return this;
    }

    /* renamed from: x */
    public final int mo51767x() {
        return this.f70433b.getInt("key_exception_time", 0);
    }

    /* renamed from: A */
    private void m59360A() {
        mo51764u().putString("key_last_show_sequence_day", m59362C()).apply();
    }

    /* renamed from: z */
    private void m59366z() {
        mo51764u().putInt("splash_ad_show_count", 0);
        mo51734b(false).mo51750h();
    }

    /* renamed from: b */
    public final long mo51731b() {
        if (this.f70435f == 0) {
            this.f70435f = this.f70433b.getLong("key_pre_remote_time", 0);
        }
        return this.f70435f;
    }

    /* renamed from: c */
    public final long mo51735c() {
        if (this.f70434e == 0) {
            this.f70434e = this.f70433b.getLong("key_pre_launch_time", 0);
        }
        return this.f70434e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C29556v mo51742e() {
        int o = mo51758o() + 1;
        C29638a.m59659a(0, "show count: ".concat(String.valueOf(o)));
        mo51764u().putInt("splash_ad_show_count", o);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo51748g() {
        return this.f70433b.getString("splash_ad_local_cache_data", "");
    }

    /* renamed from: i */
    public final String mo51752i() {
        return this.f70433b.getString("splash_ad_full_data", "");
    }

    static {
        Covode.recordClassIndex(35950);
        StringBuilder sb = new StringBuilder();
        Context context = C29495h.f70242r;
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = context.getFilesDir();
        }
        f70430a = sb.append(C58016d.f132222c).append("/SplashData/").toString();
    }

    /* renamed from: C */
    private static String m59362C() {
        f70431c.setTimeInMillis(System.currentTimeMillis());
        return f70431c.get(1) + "/" + f70431c.get(2) + "/" + f70431c.get(5);
    }

    /* renamed from: a */
    public static C29556v m59363a() {
        MethodCollector.m26663i(8736);
        if (f70432d == null) {
            synchronized (C29556v.class) {
                try {
                    if (f70432d == null) {
                        f70432d = new C29556v();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8736);
                    throw th;
                }
            }
        }
        C29556v vVar = f70432d;
        MethodCollector.m26664o(8736);
        return vVar;
    }

    /* renamed from: y */
    private void m59365y() {
        f70431c.setTimeInMillis(System.currentTimeMillis());
        mo51764u().putInt("show_splash_ad_day", f70431c.get(5) + f70431c.get(2) + f70431c.get(1)).apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo51741d() {
        f70431c.setTimeInMillis(System.currentTimeMillis());
        if (f70431c.get(5) + f70431c.get(2) + f70431c.get(1) == mo51755l()) {
            return this.f70433b.getBoolean("splash_ad_has_first_refresh", false);
        }
        m59365y();
        m59366z();
        return false;
    }

    /* renamed from: o */
    public final int mo51758o() {
        f70431c.setTimeInMillis(System.currentTimeMillis());
        if (f70431c.get(5) + f70431c.get(2) + f70431c.get(1) == mo51755l()) {
            return this.f70433b.getInt("splash_ad_show_count", 0);
        }
        m59366z();
        m59365y();
        return 0;
    }

    /* renamed from: p */
    public final int mo51759p() {
        if (m59362C().equals(m59361B())) {
            return this.f70433b.getInt("key_splash_ad_show_sequence", 0);
        }
        mo51764u().putInt("key_splash_ad_show_sequence", 0).apply();
        m59360A();
        return 0;
    }

    /* renamed from: a */
    public final C29556v mo51725a(int i) {
        mo51764u().putInt("splash_ad_show_limit", i);
        return this;
    }

    /* renamed from: b */
    public final C29556v mo51732b(long j) {
        mo51764u().putLong("splash_ad_splash_interval", j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C29556v mo51736c(long j) {
        mo51764u().putLong("splash_ad_cold_launch_interval", j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C29556v mo51739d(long j) {
        mo51764u().putLong("splash_ad_last_show_time", j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C29556v mo51747g(String str) {
        mo51764u().putString("splash_ad_local_cache_data", str);
        return this;
    }

    /* renamed from: h */
    public final C29556v mo51749h(String str) {
        mo51764u().putString("key_splash_ad_penalty_period", str);
        return this;
    }

    /* renamed from: i */
    public final C29556v mo51751i(String str) {
        mo51764u().putString("key_empty_log_extra_substitute", str);
        return this;
    }

    /* renamed from: a */
    public final C29556v mo51726a(long j) {
        mo51764u().putLong("splash_ad_leave_interval", j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C29556v mo51740d(String str) {
        mo51764u().putString("splash_ad_first_show_data", str);
        return this;
    }

    /* renamed from: j */
    private synchronized void m59364j(String str) {
        MethodCollector.m26663i(8750);
        if (C29657l.m59760a(str)) {
            MethodCollector.m26664o(8750);
            return;
        }
        mo51764u().putBoolean("splash_ad_url_has_download_" + C29639b.m59664a(str), true).apply();
        MethodCollector.m26664o(8750);
    }

    /* renamed from: b */
    public final C29556v mo51733b(String str) {
        mo51764u().putString("splash_ad_did", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C29556v mo51737c(String str) {
        mo51764u().putString("key_splash_ad_time_period_map", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C29556v mo51743e(long j) {
        this.f70434e = SystemClock.elapsedRealtime();
        this.f70435f = j;
        mo51764u().putLong("key_pre_remote_time", j).putLong("key_pre_launch_time", this.f70434e).apply();
        return this;
    }

    /* renamed from: f */
    public final synchronized boolean mo51746f(String str) {
        MethodCollector.m26663i(8762);
        if (C29657l.m59760a(str)) {
            MethodCollector.m26664o(8762);
            return false;
        }
        boolean z = this.f70433b.getBoolean("splash_ad_url_has_download_" + C29639b.m59664a(str), false);
        MethodCollector.m26664o(8762);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C29556v mo51727a(String str) {
        if (C29495h.f70210ag) {
            C29641d.m59680a(str, f70430a, "splash_ad_ordered_data");
        } else {
            mo51764u().putString("splash_ad_data", str);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C29556v mo51734b(boolean z) {
        mo51764u().putBoolean("splash_ad_has_first_refresh", z);
        return this;
    }

    /* renamed from: c */
    public final C29556v mo51738c(boolean z) {
        mo51764u().putBoolean("key_splash_ad_need_ack", z);
        return this;
    }

    /* renamed from: e */
    public final synchronized void mo51744e(String str) {
        MethodCollector.m26663i(8752);
        if (C29657l.m59760a(str)) {
            MethodCollector.m26664o(8752);
            return;
        }
        mo51764u().remove("splash_ad_url_has_download_" + C29639b.m59664a(str)).apply();
        MethodCollector.m26664o(8752);
    }

    /* renamed from: a */
    public final C29556v mo51728a(boolean z) {
        mo51764u().putBoolean("key_splash_ad_empty", z);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51729a(C29462f fVar) {
        if (fVar != null && !C29657l.m59760a(fVar.f70078d)) {
            m59364j(fVar.f70078d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51730a(C29474p pVar) {
        if (pVar != null && !C29657l.m59760a(pVar.f70124d)) {
            m59364j(pVar.f70124d);
        }
    }
}
