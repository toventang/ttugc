package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1930a.p1931a.C25248a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.em */
public final class C26361em extends AbstractC26400fy {

    /* renamed from: a */
    static final Pair<String, Long> f61898a = new Pair<>("", 0L);

    /* renamed from: A */
    private String f61899A;

    /* renamed from: B */
    private boolean f61900B;

    /* renamed from: C */
    private long f61901C;

    /* renamed from: b */
    SharedPreferences f61902b;

    /* renamed from: c */
    public C26364ep f61903c;

    /* renamed from: d */
    public final C26365eq f61904d = new C26365eq(this, "last_upload", 0);

    /* renamed from: e */
    public final C26365eq f61905e = new C26365eq(this, "last_upload_attempt", 0);

    /* renamed from: f */
    public final C26365eq f61906f = new C26365eq(this, "backoff", 0);

    /* renamed from: g */
    public final C26365eq f61907g = new C26365eq(this, "last_delete_stale", 0);

    /* renamed from: h */
    public final C26365eq f61908h = new C26365eq(this, "midnight_offset", 0);

    /* renamed from: i */
    public final C26365eq f61909i = new C26365eq(this, "first_open_time", 0);

    /* renamed from: j */
    public final C26365eq f61910j = new C26365eq(this, "app_install_time", 0);

    /* renamed from: k */
    public final C26367es f61911k = new C26367es(this, "app_instance_id");

    /* renamed from: l */
    public final C26365eq f61912l = new C26365eq(this, "time_before_start", 10000);

    /* renamed from: m */
    public final C26365eq f61913m = new C26365eq(this, "session_timeout", 1800000);

    /* renamed from: n */
    public final C26363eo f61914n = new C26363eo(this, "start_new_session", true);

    /* renamed from: o */
    public final C26367es f61915o = new C26367es(this, "non_personalized_ads");

    /* renamed from: p */
    public final C26363eo f61916p = new C26363eo(this, "allow_remote_dynamite", false);

    /* renamed from: q */
    public final C26365eq f61917q = new C26365eq(this, "last_pause_time", 0);

    /* renamed from: r */
    public boolean f61918r;

    /* renamed from: s */
    public C26363eo f61919s = new C26363eo(this, "app_backgrounded", false);

    /* renamed from: t */
    public C26363eo f61920t = new C26363eo(this, "deep_link_retrieval_complete", false);

    /* renamed from: u */
    public C26365eq f61921u = new C26365eq(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: v */
    public final C26367es f61922v = new C26367es(this, "firebase_feature_rollouts");

    /* renamed from: w */
    public final C26367es f61923w = new C26367es(this, "deferred_attribution_cache");

    /* renamed from: x */
    public final C26365eq f61924x = new C26365eq(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: y */
    public final C26362en f61925y = new C26362en(this, "default_event_parameters");

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26400fy
    /* renamed from: d */
    public final boolean mo43065d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final SharedPreferences mo43196f() {
        mo43002c();
        mo43288x();
        return this.f61902b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo43197g() {
        mo43002c();
        return mo43196f().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo43198h() {
        mo43002c();
        return mo43196f().getString("admob_app_id", null);
    }

    static {
        Covode.recordClassIndex(31783);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Boolean mo43199i() {
        mo43002c();
        if (!mo43196f().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(mo43196f().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo43200j() {
        mo43002c();
        Boolean u = mo43201u();
        SharedPreferences.Editor edit = mo43196f().edit();
        edit.clear();
        edit.apply();
        if (u != null) {
            mo43192b(u.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final Boolean mo43201u() {
        mo43002c();
        if (mo43196f().contains("measurement_enabled")) {
            return Boolean.valueOf(mo43196f().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo43202v() {
        mo43002c();
        String string = mo43196f().getString("previous_os_version", null);
        mo43010k().mo43288x();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = mo43196f().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26400fy
    /* renamed from: M_ */
    public final void mo43187M_() {
        SharedPreferences a = C34822d.m71158a(mo43012m(), "com.google.android.gms.measurement.prefs", 0);
        this.f61902b = a;
        boolean z = a.getBoolean("has_been_opened", false);
        this.f61918r = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f61902b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f61903c = new C26364ep(this, "health_monitor", Math.max(0L, C26530p.f62542c.mo43024a(null).longValue()), (byte) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43189a(boolean z) {
        mo43002c();
        SharedPreferences.Editor edit = mo43196f().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43192b(boolean z) {
        mo43002c();
        SharedPreferences.Editor edit = mo43196f().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43193c(String str) {
        mo43002c();
        SharedPreferences.Editor edit = mo43196f().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo43195d(String str) {
        mo43002c();
        SharedPreferences.Editor edit = mo43196f().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43190a(long j) {
        if (j - this.f61913m.mo43209a() > this.f61917q.mo43209a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo43191b(String str) {
        mo43002c();
        String str2 = (String) mo43188a(str).first;
        MessageDigest h = C26510jz.m52409h();
        if (h == null) {
            return null;
        }
        return C1764a.m5929a(Locale.US, "%032X", new Object[]{new BigInteger(1, h.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43194c(boolean z) {
        mo43002c();
        mo43016q().f61835k.mo43170a("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo43196f().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pair<String, Boolean> mo43188a(String str) {
        mo43002c();
        long b = mo43011l().mo41858b();
        if (this.f61899A != null && b < this.f61901C) {
            return new Pair<>(this.f61899A, Boolean.valueOf(this.f61900B));
        }
        this.f61901C = b + mo43018s().mo43632a(str, C26530p.f62541b);
        try {
            C25248a.C25249a a = C25248a.m48579a(mo43012m());
            if (a != null) {
                this.f61899A = a.f59857a;
                this.f61900B = a.f59858b;
            }
            if (this.f61899A == null) {
                this.f61899A = "";
            }
        } catch (Exception e) {
            mo43016q().f61834j.mo43170a("Unable to get advertising id", e);
            this.f61899A = "";
        }
        return new Pair<>(this.f61899A, Boolean.valueOf(this.f61900B));
    }

    C26361em(C26381ff ffVar) {
        super(ffVar);
    }
}
