package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.C26129ln;
import com.google.android.gms.internal.measurement.C26141lz;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gk */
public final class C26413gk extends AbstractC26377fb {

    /* renamed from: a */
    protected C26436hg f62100a;

    /* renamed from: b */
    final C26516ke f62101b;

    /* renamed from: c */
    protected boolean f62102c = true;

    /* renamed from: d */
    private AbstractC26408gf f62103d;

    /* renamed from: e */
    private final Set<AbstractC26411gi> f62104e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f62105f;

    /* renamed from: g */
    private final AtomicReference<String> f62106g = new AtomicReference<>();

    static {
        Covode.recordClassIndex(31835);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26377fb
    /* renamed from: u */
    public final boolean mo43045u() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo42999b() {
        super.mo42999b();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43002c() {
        super.mo43002c();
    }

    /* renamed from: a */
    public final void mo43311a(boolean z) {
        mo43243D();
        mo43015p().mo43220a(new RunnableC26431hb(this, z));
    }

    /* renamed from: a */
    public final void mo43305a(String str, String str2, Bundle bundle) {
        mo43306a(str, str2, bundle, true, true, mo43011l().mo41857a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43303a(String str, String str2, long j, Bundle bundle) {
        mo43002c();
        mo43304a(str, str2, j, bundle, true, this.f62103d == null || C26510jz.m52406e(str2), false, null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0159, code lost:
        if (r11.mo43535a("event", 40, r34) == false) goto L_0x011e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43304a(java.lang.String r33, java.lang.String r34, long r35, android.os.Bundle r37, boolean r38, boolean r39, boolean r40, java.lang.String r41) {
        /*
        // Method dump skipped, instructions count: 1275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26413gk.mo43304a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo43306a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str;
        Bundle bundle2 = bundle;
        if (str3 == null) {
            str3 = "app";
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!mo43018s().mo43641d(null, C26530p.f62492aD) || !C26510jz.m52405c(str2, "screen_view")) {
            m51991a(str3, str2, j, bundle2, z2, !z2 || this.f62103d == null || C26510jz.m52406e(str2), !z);
        } else {
            mo43007h().mo43374a(bundle2, j);
        }
    }

    /* renamed from: a */
    public final void mo43307a(String str, String str2, Object obj) {
        mo43309a(str, str2, obj, true, mo43011l().mo41857a());
    }

    /* renamed from: a */
    public final void mo43309a(String str, String str2, Object obj, boolean z, long j) {
        String str3 = str;
        if (str3 == null) {
            str3 = "app";
        }
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo43014o().mo43544c(str2);
        } else {
            C26510jz o = mo43014o();
            if (o.mo43536a("user property", str2)) {
                if (!o.mo43539a("user property", C26409gg.f62087a, str2)) {
                    i = 15;
                } else if (o.mo43535a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            mo43014o();
            String a = C26510jz.m52388a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f62077z.mo43256e().mo43522a(i, "_ev", a, i2);
        } else if (obj != null) {
            int b = mo43014o().mo43541b(str2, obj);
            if (b != 0) {
                mo43014o();
                String a2 = C26510jz.m52388a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f62077z.mo43256e().mo43522a(b, "_ev", a2, i2);
                return;
            }
            Object c = mo43014o().mo43545c(str2, obj);
            if (c != null) {
                m51992a(str3, str2, j, c);
            }
        } else {
            m51992a(str3, str2, j, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43308a(java.lang.String r13, java.lang.String r14, java.lang.Object r15, long r16) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26413gk.mo43308a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43302a(String str) {
        this.f62106g.set(str);
    }

    /* renamed from: a */
    public final void mo43300a(AbstractC26408gf gfVar) {
        AbstractC26408gf gfVar2;
        mo43002c();
        mo43243D();
        if (!(gfVar == null || gfVar == (gfVar2 = this.f62103d))) {
            C25565r.m49321a(gfVar2 == null, "EventInterceptor already set.");
        }
        this.f62103d = gfVar;
    }

    /* renamed from: a */
    public final void mo43301a(AbstractC26411gi giVar) {
        mo43243D();
        C25565r.m49314a(giVar);
        if (!this.f62104e.add(giVar)) {
            mo43016q().f61830f.mo43169a("OnEventListener already registered");
        }
    }

    /* renamed from: a */
    public final void mo43299a(Bundle bundle, long j) {
        C25565r.m49314a(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            mo43016q().f61830f.mo43169a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        mo43312b(bundle2, j);
    }

    /* renamed from: a */
    public final void mo43310a(String str, String str2, String str3, Bundle bundle) {
        long a = mo43011l().mo41857a();
        C25565r.m49316a(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString(StringSet.name, str2);
        bundle2.putLong("creation_timestamp", a);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo43015p().mo43220a(new RunnableC26421gs(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C26240a mo43003d() {
        return super.mo43003d();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C26413gk mo43004e() {
        return super.mo43004e();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C26342du mo43005f() {
        return super.mo43005f();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C26451hv mo43006g() {
        return super.mo43006g();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C26446hq mo43007h() {
        return super.mo43007h();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C26345dx mo43008i() {
        return super.mo43008i();
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C26482iz mo43009j() {
        return super.mo43009j();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C26483j mo43010k() {
        return super.mo43010k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC25603e mo43011l() {
        return super.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43012m() {
        return super.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C26347dz mo43013n() {
        return super.mo43013n();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C26510jz mo43014o() {
        return super.mo43014o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C26372ex mo43015p() {
        return super.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26350eb mo43016q() {
        return super.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C26361em mo43017r() {
        return super.mo43017r();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C26524km mo43018s() {
        return super.mo43018s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C26523kl mo43019t() {
        return super.mo43019t();
    }

    /* renamed from: A */
    public final String mo43295A() {
        C26443hn hnVar = this.f62077z.mo43259h().f62198a;
        if (hnVar != null) {
            return hnVar.f62188b;
        }
        return null;
    }

    /* renamed from: x */
    public final String mo43317x() {
        return this.f62106g.get();
    }

    /* renamed from: z */
    public final String mo43319z() {
        C26443hn hnVar = this.f62077z.mo43259h().f62198a;
        if (hnVar != null) {
            return hnVar.f62187a;
        }
        return null;
    }

    /* renamed from: w */
    public final void mo43316w() {
        if (m51986a(mo43012m()) instanceof Application) {
            ((Application) m51986a(mo43012m())).unregisterActivityLifecycleCallbacks(this.f62100a);
        }
    }

    /* renamed from: B */
    public final String mo43296B() {
        if (this.f62077z.f61997a != null) {
            return this.f62077z.f61997a;
        }
        try {
            return C26444ho.m52081a(mo43012m(), "google_app_id");
        } catch (IllegalStateException e) {
            this.f62077z.mo43016q().f61827c.mo43170a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m51985G() {
        long j;
        mo43002c();
        String a = mo43017r().f61915o.mo43213a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo43308a("app", "_npa", (Object) null, mo43011l().mo41857a());
            } else {
                if ("true".equals(a)) {
                    j = 1;
                } else {
                    j = 0;
                }
                mo43308a("app", "_npa", Long.valueOf(j), mo43011l().mo41857a());
            }
        }
        if (!this.f62077z.mo43265r() || !this.f62102c) {
            mo43016q().f61834j.mo43169a("Updating Scion state (FE)");
            mo43006g().mo43402x();
            return;
        }
        mo43016q().f61834j.mo43169a("Recording app launch after enabling measurement for the first time (FE)");
        mo43318y();
        C26141lz.m51231b();
        if (mo43018s().mo43641d(null, C26530p.f62537aw)) {
            mo43009j().f62318b.mo43456a();
        }
        C26129ln.m51215b();
        if (mo43018s().mo43641d(null, C26530p.f62490aB) && this.f62077z.f62005i.f61946a.mo43253b().f61910j.mo43209a() <= 0) {
            C26366er erVar = this.f62077z.f62005i;
            erVar.mo43212a(erVar.f61946a.mo43012m().getPackageName());
        }
        if (mo43018s().mo43641d(null, C26530p.f62506aR)) {
            mo43015p().mo43220a(new RunnableC26434he(this));
        }
    }

    /* renamed from: y */
    public final void mo43318y() {
        mo43002c();
        mo43243D();
        if (this.f62077z.mo43268w()) {
            if (mo43018s().mo43641d(null, C26530p.f62522ah)) {
                C26524km s = mo43018s();
                s.mo43019t();
                Boolean d = s.mo43640d("google_analytics_deferred_deep_link_enabled");
                if (d != null && d.booleanValue()) {
                    mo43016q().f61834j.mo43169a("Deferred Deep Link feature enabled.");
                    mo43015p().mo43220a(new RunnableC26415gm(this));
                }
            }
            mo43006g().mo43404z();
            this.f62102c = false;
            String v = mo43017r().mo43202v();
            if (!TextUtils.isEmpty(v)) {
                mo43010k().mo43288x();
                if (!v.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", v);
                    mo43305a("auto", "_ou", bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    /* renamed from: a */
    private static Context m51986a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    protected C26413gk(C26381ff ffVar) {
        super(ffVar);
        this.f62101b = new C26516ke(ffVar);
    }

    /* renamed from: b */
    public final void mo43313b(AbstractC26411gi giVar) {
        mo43243D();
        C25565r.m49314a(giVar);
        if (!this.f62104e.remove(giVar)) {
            mo43016q().f61830f.mo43169a("OnEventListener had not been registered");
        }
    }

    /* renamed from: a */
    private static Object m51987a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m51990a(C26413gk gkVar, boolean z) {
        gkVar.mo43002c();
        gkVar.mo43243D();
        gkVar.mo43016q().f61834j.mo43170a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        gkVar.mo43017r().mo43192b(z);
        gkVar.m51985G();
    }

    /* renamed from: a */
    static /* synthetic */ void m51989a(C26413gk gkVar, Bundle bundle) {
        gkVar.mo43002c();
        gkVar.mo43243D();
        C25565r.m49314a(bundle);
        C25565r.m49316a(bundle.getString(StringSet.name));
        C25565r.m49316a(bundle.getString("origin"));
        C25565r.m49314a(m51987a(bundle, "value"));
        if (!gkVar.f62077z.mo43265r()) {
            gkVar.mo43016q().f61835k.mo43169a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkr zzkr = new zzkr(bundle.getString(StringSet.name), bundle.getLong("triggered_timestamp"), m51987a(bundle, "value"), bundle.getString("origin"));
        try {
            zzao a = gkVar.mo43014o().mo43519a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0);
            gkVar.mo43006g().mo43397a(new zzw(bundle.getString("app_id"), bundle.getString("origin"), zzkr, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), gkVar.mo43014o().mo43519a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0), bundle.getLong("trigger_timeout"), a, bundle.getLong("time_to_live"), gkVar.mo43014o().mo43519a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m51993b(C26413gk gkVar, Bundle bundle) {
        gkVar.mo43002c();
        gkVar.mo43243D();
        C25565r.m49314a(bundle);
        C25565r.m49316a(bundle.getString(StringSet.name));
        if (!gkVar.f62077z.mo43265r()) {
            gkVar.mo43016q().f61835k.mo43169a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            gkVar.mo43006g().mo43397a(new zzw(bundle.getString("app_id"), bundle.getString("origin"), new zzkr(bundle.getString(StringSet.name), 0, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), gkVar.mo43014o().mo43519a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"))));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo43312b(Bundle bundle, long j) {
        C25565r.m49314a(bundle);
        C26403ga.m51974a(bundle, "app_id", String.class, null);
        C26403ga.m51974a(bundle, "origin", String.class, null);
        C26403ga.m51974a(bundle, StringSet.name, String.class, null);
        C26403ga.m51974a(bundle, "value", Object.class, null);
        C26403ga.m51974a(bundle, "trigger_event_name", String.class, null);
        C26403ga.m51974a(bundle, "trigger_timeout", Long.class, 0L);
        C26403ga.m51974a(bundle, "timed_out_event_name", String.class, null);
        C26403ga.m51974a(bundle, "timed_out_event_params", Bundle.class, null);
        C26403ga.m51974a(bundle, "triggered_event_name", String.class, null);
        C26403ga.m51974a(bundle, "triggered_event_params", Bundle.class, null);
        C26403ga.m51974a(bundle, "time_to_live", Long.class, 0L);
        C26403ga.m51974a(bundle, "expired_event_name", String.class, null);
        C26403ga.m51974a(bundle, "expired_event_params", Bundle.class, null);
        C25565r.m49316a(bundle.getString(StringSet.name));
        C25565r.m49316a(bundle.getString("origin"));
        C25565r.m49314a(m51987a(bundle, "value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString(StringSet.name);
        Object a = m51987a(bundle, "value");
        if (mo43014o().mo43544c(string) != 0) {
            mo43016q().f61827c.mo43170a("Invalid conditional user property name", mo43013n().mo43064c(string));
        } else if (mo43014o().mo43541b(string, a) != 0) {
            mo43016q().f61827c.mo43171a("Invalid conditional user property value", mo43013n().mo43064c(string), a);
        } else {
            Object c = mo43014o().mo43545c(string, a);
            if (c == null) {
                mo43016q().f61827c.mo43171a("Unable to normalize conditional user property value", mo43013n().mo43064c(string), a);
                return;
            }
            C26403ga.m51975a(bundle, c);
            long j2 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong("time_to_live");
                if (j3 > 15552000000L || j3 < 1) {
                    mo43016q().f61827c.mo43171a("Invalid conditional user property time to live", mo43013n().mo43064c(string), Long.valueOf(j3));
                } else {
                    mo43015p().mo43220a(new RunnableC26422gt(this, bundle));
                }
            } else {
                mo43016q().f61827c.mo43171a("Invalid conditional user property timeout", mo43013n().mo43064c(string), Long.valueOf(j2));
            }
        }
    }

    /* renamed from: c */
    public final void mo43315c(String str, String str2, Bundle bundle) {
        mo43310a((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43314b(String str, String str2, Bundle bundle) {
        mo43002c();
        mo43303a(str, str2, mo43011l().mo41857a(), bundle);
    }

    /* renamed from: a */
    public final ArrayList<Bundle> mo43297a(String str, String str2, String str3) {
        if (mo43015p().mo43223f()) {
            mo43016q().f61827c.mo43169a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C26523kl.m52495a()) {
            mo43016q().f61827c.mo43169a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f62077z.mo43015p().mo43218a(atomicReference, 5000, "get conditional user properties", new RunnableC26423gu(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return C26510jz.m52399b((List<zzw>) list);
            }
            mo43016q().f61827c.mo43170a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    /* renamed from: a */
    private final void m51992a(String str, String str2, long j, Object obj) {
        mo43015p().mo43220a(new RunnableC26418gp(this, str, str2, obj, j));
    }

    /* renamed from: a */
    public final Map<String, Object> mo43298a(String str, String str2, String str3, boolean z) {
        if (mo43015p().mo43223f()) {
            mo43016q().f61827c.mo43169a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C26523kl.m52495a()) {
            mo43016q().f61827c.mo43169a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f62077z.mo43015p().mo43218a(atomicReference, 5000, "get user properties", new RunnableC26426gx(this, atomicReference, str, str2, str3, z));
            List<zzkr> list = (List) atomicReference.get();
            if (list == null) {
                mo43016q().f61827c.mo43170a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            C0484a aVar = new C0484a(list.size());
            for (zzkr zzkr : list) {
                aVar.put(zzkr.f62582a, zzkr.mo43675a());
            }
            return aVar;
        }
    }

    /* renamed from: a */
    private final void m51991a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        mo43015p().mo43220a(new RunnableC26416gn(this, str, str2, j, C26510jz.m52398b(bundle), z, z2, z3));
    }
}
