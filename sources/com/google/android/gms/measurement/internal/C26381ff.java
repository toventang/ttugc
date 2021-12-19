package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.internal.C25454g;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.C26117lb;
import com.google.android.gms.internal.measurement.C26156mn;
import com.google.android.gms.internal.measurement.zzae;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.ff */
public class C26381ff implements AbstractC26404gb {

    /* renamed from: l */
    private static volatile C26381ff f61989l;

    /* renamed from: A */
    private boolean f61990A;

    /* renamed from: B */
    private Boolean f61991B;

    /* renamed from: C */
    private long f61992C;

    /* renamed from: D */
    private volatile Boolean f61993D;

    /* renamed from: E */
    private Boolean f61994E;

    /* renamed from: F */
    private Boolean f61995F;

    /* renamed from: G */
    private AtomicInteger f61996G = new AtomicInteger(0);

    /* renamed from: a */
    public final String f61997a;

    /* renamed from: b */
    public final String f61998b;

    /* renamed from: c */
    public final String f61999c;

    /* renamed from: d */
    public final boolean f62000d;

    /* renamed from: e */
    public final C26524km f62001e;

    /* renamed from: f */
    final C26350eb f62002f;

    /* renamed from: g */
    public final C26372ex f62003g;

    /* renamed from: h */
    final C26413gk f62004h;

    /* renamed from: i */
    public C26366er f62005i;

    /* renamed from: j */
    int f62006j;

    /* renamed from: k */
    final long f62007k;

    /* renamed from: m */
    private final Context f62008m;

    /* renamed from: n */
    private final C26523kl f62009n;

    /* renamed from: o */
    private final C26361em f62010o;

    /* renamed from: p */
    private final C26482iz f62011p;

    /* renamed from: q */
    private final C26510jz f62012q;

    /* renamed from: r */
    private final C26347dz f62013r;

    /* renamed from: s */
    private final AbstractC25603e f62014s;

    /* renamed from: t */
    private final C26446hq f62015t;

    /* renamed from: u */
    private final C26240a f62016u;

    /* renamed from: v */
    private final C26437hh f62017v;

    /* renamed from: w */
    private C26345dx f62018w;

    /* renamed from: x */
    private C26451hv f62019x;

    /* renamed from: y */
    private C26483j f62020y;

    /* renamed from: z */
    private C26342du f62021z;

    static {
        Covode.recordClassIndex(31803);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: l */
    public final AbstractC25603e mo43011l() {
        return this.f62014s;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: m */
    public final Context mo43012m() {
        return this.f62008m;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: t */
    public final C26523kl mo43019t() {
        return this.f62009n;
    }

    /* renamed from: u */
    static void m51906u() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: y */
    private final C26437hh m51907y() {
        m51904a((AbstractC26400fy) this.f62017v);
        return this.f62017v;
    }

    /* renamed from: b */
    public final C26361em mo43253b() {
        m51905a((C26401fz) this.f62010o);
        return this.f62010o;
    }

    /* renamed from: c */
    public final C26482iz mo43254c() {
        m51902a((AbstractC26377fb) this.f62011p);
        return this.f62011p;
    }

    /* renamed from: d */
    public final C26413gk mo43255d() {
        m51902a((AbstractC26377fb) this.f62004h);
        return this.f62004h;
    }

    /* renamed from: e */
    public final C26510jz mo43256e() {
        m51905a((C26401fz) this.f62012q);
        return this.f62012q;
    }

    /* renamed from: f */
    public final C26347dz mo43257f() {
        m51905a((C26401fz) this.f62013r);
        return this.f62013r;
    }

    /* renamed from: g */
    public final C26345dx mo43258g() {
        m51902a((AbstractC26377fb) this.f62018w);
        return this.f62018w;
    }

    /* renamed from: h */
    public final C26446hq mo43259h() {
        m51902a((AbstractC26377fb) this.f62015t);
        return this.f62015t;
    }

    /* renamed from: i */
    public final C26451hv mo43260i() {
        m51902a((AbstractC26377fb) this.f62019x);
        return this.f62019x;
    }

    /* renamed from: j */
    public final C26483j mo43261j() {
        m51904a((AbstractC26400fy) this.f62020y);
        return this.f62020y;
    }

    /* renamed from: k */
    public final C26342du mo43262k() {
        m51902a((AbstractC26377fb) this.f62021z);
        return this.f62021z;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: p */
    public final C26372ex mo43015p() {
        m51904a((AbstractC26400fy) this.f62003g);
        return this.f62003g;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb
    /* renamed from: q */
    public final C26350eb mo43016q() {
        m51904a((AbstractC26400fy) this.f62002f);
        return this.f62002f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo43267v() {
        this.f61996G.incrementAndGet();
    }

    /* renamed from: n */
    public final C26240a mo43263n() {
        C26240a aVar = this.f62016u;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: o */
    public final boolean mo43264o() {
        if (this.f61993D == null || !this.f61993D.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo43265r() {
        if (mo43266s() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final int mo43266s() {
        mo43015p().mo43002c();
        if (this.f62001e.mo43644f()) {
            return 1;
        }
        Boolean bool = this.f61995F;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean u = mo43253b().mo43201u();
        if (u == null) {
            C26524km kmVar = this.f62001e;
            kmVar.mo43019t();
            Boolean d = kmVar.mo43640d("firebase_analytics_collection_enabled");
            if (d == null) {
                Boolean bool2 = this.f61994E;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (C25454g.m49119a()) {
                    return 6;
                } else {
                    if (!this.f62001e.mo43641d(null, C26530p.f62481T) || this.f61993D == null || this.f61993D.booleanValue()) {
                        return 0;
                    }
                    return 7;
                }
            } else if (d.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (u.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43268w() {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26381ff.mo43268w():boolean");
    }

    /* renamed from: x */
    public final void mo43269x() {
        mo43015p().mo43002c();
        m51904a((AbstractC26400fy) m51907y());
        String w = mo43262k().mo43047w();
        Pair<String, Boolean> a = mo43253b().mo43188a(w);
        if (!this.f62001e.mo43646g().booleanValue() || ((Boolean) a.second).booleanValue() || TextUtils.isEmpty((CharSequence) a.first)) {
            mo43016q().f61834j.mo43169a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!m51907y().mo43352f()) {
            mo43016q().f61830f.mo43169a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            C26510jz e = mo43256e();
            mo43262k().mo43018s();
            URL a2 = e.mo43521a(w, (String) a.first, mo43253b().f61921u.mo43209a() - 1);
            C26437hh y = m51907y();
            C26380fe feVar = new C26380fe(this);
            y.mo43002c();
            y.mo43288x();
            C25565r.m49314a(a2);
            C25565r.m49314a(feVar);
            y.mo43015p().mo43222b(new RunnableC26439hj(y, w, a2, feVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43251a() {
        mo43015p().mo43002c();
        if (mo43253b().f61904d.mo43209a() == 0) {
            mo43253b().f61904d.mo43210a(this.f62014s.mo41857a());
        }
        if (Long.valueOf(mo43253b().f61909i.mo43209a()).longValue() == 0) {
            mo43016q().f61835k.mo43170a("Persisting first open", Long.valueOf(this.f62007k));
            mo43253b().f61909i.mo43210a(this.f62007k);
        }
        if (this.f62001e.mo43641d(null, C26530p.f62506aR)) {
            C26516ke keVar = mo43255d().f62101b;
            if (keVar.mo43621b() && keVar.mo43620a()) {
                keVar.f62415a.mo43253b().f61923w.mo43214a(null);
            }
        }
        if (mo43268w()) {
            if (!TextUtils.isEmpty(mo43262k().mo43048x()) || !TextUtils.isEmpty(mo43262k().mo43049y())) {
                mo43256e();
                if (C26510jz.m52395a(mo43262k().mo43048x(), mo43253b().mo43197g(), mo43262k().mo43049y(), mo43253b().mo43198h())) {
                    mo43016q().f61833i.mo43169a("Rechecking which service to use due to a GMP App Id change");
                    mo43253b().mo43200j();
                    mo43258g().mo43057w();
                    this.f62019x.mo43384G();
                    this.f62019x.mo43383B();
                    mo43253b().f61909i.mo43210a(this.f62007k);
                    mo43253b().f61911k.mo43214a(null);
                }
                mo43253b().mo43193c(mo43262k().mo43048x());
                mo43253b().mo43195d(mo43262k().mo43049y());
            }
            mo43255d().mo43302a(mo43253b().f61911k.mo43213a());
            C26117lb.m51195b();
            if (this.f62001e.mo43641d(null, C26530p.f62536av) && !mo43256e().mo43553v() && !TextUtils.isEmpty(mo43253b().f61922v.mo43213a())) {
                mo43016q().f61830f.mo43169a("Remote config removed with active feature rollouts");
                mo43253b().f61922v.mo43214a(null);
            }
            if (!TextUtils.isEmpty(mo43262k().mo43048x()) || !TextUtils.isEmpty(mo43262k().mo43049y())) {
                boolean r = mo43265r();
                if (!mo43253b().f61902b.contains("deferred_analytics_collection") && !this.f62001e.mo43644f()) {
                    mo43253b().mo43194c(!r);
                }
                if (r) {
                    mo43255d().mo43318y();
                }
                mo43254c().f62318b.mo43456a();
                mo43260i().mo43398a(new AtomicReference<>());
                C26156mn.m51251b();
                if (this.f62001e.mo43641d(null, C26530p.f62502aN)) {
                    mo43260i().mo43387a(mo43253b().f61925y.mo43203a());
                }
            }
        } else if (mo43265r()) {
            if (!mo43256e().mo43546d("android.permission.INTERNET")) {
                mo43016q().f61827c.mo43169a("App is missing INTERNET permission");
            }
            if (!mo43256e().mo43546d("android.permission.ACCESS_NETWORK_STATE")) {
                mo43016q().f61827c.mo43169a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C25500c.f60481a.mo41741a(this.f62008m).mo41738a() && !this.f62001e.mo43649v()) {
                if (!C26371ew.m51831a(this.f62008m)) {
                    mo43016q().f61827c.mo43169a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C26510jz.m52391a(this.f62008m)) {
                    mo43016q().f61827c.mo43169a("AppMeasurementService not registered/enabled");
                }
            }
            mo43016q().f61827c.mo43169a("Uploading is not possible. App measurement disabled");
        }
        mo43253b().f61916p.mo43205a(this.f62001e.mo43641d(null, C26530p.f62515aa));
    }

    /* renamed from: a */
    private static Context m51899a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private static void m51905a(C26401fz fzVar) {
        if (fzVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: a */
    private static void m51902a(AbstractC26377fb fbVar) {
        if (fbVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!fbVar.mo43242C()) {
            String valueOf = String.valueOf(fbVar.getClass());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Component not initialized: ").append(valueOf).toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073 A[Catch:{ all -> 0x0187 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C26381ff(com.google.android.gms.measurement.internal.C26410gh r11) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26381ff.<init>(com.google.android.gms.measurement.internal.gh):void");
    }

    /* renamed from: a */
    private static void m51904a(AbstractC26400fy fyVar) {
        if (fyVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!fyVar.mo43287w()) {
            String valueOf = String.valueOf(fyVar.getClass());
            throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Component not initialized: ").append(valueOf).toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43252a(boolean z) {
        this.f61993D = Boolean.valueOf(z);
    }

    /* renamed from: a */
    private static Object m51901a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m51903a(C26381ff ffVar, C26410gh ghVar) {
        C26353ee eeVar;
        String str;
        ffVar.mo43015p().mo43002c();
        C26483j jVar = new C26483j(ffVar);
        jVar.mo43289y();
        ffVar.f62020y = jVar;
        C26342du duVar = new C26342du(ffVar, ghVar.f62094f);
        duVar.mo43244E();
        ffVar.f62021z = duVar;
        C26345dx dxVar = new C26345dx(ffVar);
        dxVar.mo43244E();
        ffVar.f62018w = dxVar;
        C26451hv hvVar = new C26451hv(ffVar);
        hvVar.mo43244E();
        ffVar.f62019x = hvVar;
        ffVar.f62012q.mo43290z();
        ffVar.f62010o.mo43290z();
        ffVar.f62005i = new C26366er(ffVar);
        ffVar.f62021z.mo43245F();
        ffVar.mo43016q().f61833i.mo43170a("App measurement initialized, version", 31000L);
        ffVar.mo43016q().f61833i.mo43169a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String w = duVar.mo43047w();
        if (TextUtils.isEmpty(ffVar.f61997a)) {
            if (ffVar.mo43256e().mo43548f(w)) {
                eeVar = ffVar.mo43016q().f61833i;
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                eeVar = ffVar.mo43016q().f61833i;
                String valueOf = String.valueOf(w);
                if (valueOf.length() != 0) {
                    str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf);
                } else {
                    str = new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                }
            }
            eeVar.mo43169a(str);
        }
        ffVar.mo43016q().f61834j.mo43169a("Debug-level message logging enabled");
        if (ffVar.f62006j != ffVar.f61996G.get()) {
            ffVar.mo43016q().f61827c.mo43171a("Not all components initialized", Integer.valueOf(ffVar.f62006j), Integer.valueOf(ffVar.f61996G.get()));
        }
        ffVar.f61990A = true;
    }

    /* renamed from: a */
    public static C26381ff m51900a(Context context, zzae zzae, Long l) {
        MethodCollector.m26663i(6007);
        if (zzae != null && (zzae.f61661e == null || zzae.f61662f == null)) {
            zzae = new zzae(zzae.f61657a, zzae.f61658b, zzae.f61659c, zzae.f61660d, null, null, zzae.f61663g);
        }
        C25565r.m49314a(context);
        C25565r.m49314a(m51899a(context));
        if (f61989l == null) {
            synchronized (C26381ff.class) {
                try {
                    if (f61989l == null) {
                        f61989l = new C26381ff(new C26410gh(context, zzae, l));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6007);
                    throw th;
                }
            }
        } else if (!(zzae == null || zzae.f61663g == null || !zzae.f61663g.containsKey("dataCollectionDefaultEnabled"))) {
            f61989l.mo43252a(zzae.f61663g.getBoolean("dataCollectionDefaultEnabled"));
        }
        C26381ff ffVar = f61989l;
        MethodCollector.m26664o(6007);
        return ffVar;
    }
}
