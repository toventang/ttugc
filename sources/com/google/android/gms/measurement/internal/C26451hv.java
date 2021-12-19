package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.C25588a;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.AbstractC26221oy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.hv */
public final class C26451hv extends AbstractC26377fb {

    /* renamed from: a */
    final ServiceConnectionC26473iq f62221a;

    /* renamed from: b */
    AbstractC26341dt f62222b;

    /* renamed from: c */
    public volatile Boolean f62223c;

    /* renamed from: d */
    private final AbstractC26429h f62224d;

    /* renamed from: e */
    private final C26495jl f62225e;

    /* renamed from: f */
    private final List<Runnable> f62226f = new ArrayList();

    /* renamed from: g */
    private final AbstractC26429h f62227g;

    static {
        Covode.recordClassIndex(31873);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26377fb
    /* renamed from: u */
    public final boolean mo43045u() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26296cb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43393a(AbstractC26341dt dtVar, AbstractSafeParcelable abstractSafeParcelable, zzn zzn) {
        int i;
        mo43002c();
        mo43243D();
        int i2 = 0;
        do {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> x = mo43008i().mo43058x();
            if (x != null) {
                arrayList.addAll(x);
                i = x.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzao) {
                    try {
                        dtVar.mo43032a((zzao) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e) {
                        mo43016q().f61827c.mo43170a("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkr) {
                    try {
                        dtVar.mo43034a((zzkr) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e2) {
                        mo43016q().f61827c.mo43170a("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzw) {
                    try {
                        dtVar.mo43037a((zzw) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e3) {
                        mo43016q().f61827c.mo43170a("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    mo43016q().f61827c.mo43169a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            if (i2 >= 1001) {
                return;
            }
        } while (i == 100);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43395a(zzao zzao, String str) {
        boolean a;
        C25565r.m49314a(zzao);
        mo43002c();
        mo43243D();
        C26345dx i = mo43008i();
        Parcel obtain = Parcel.obtain();
        zzao.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i.mo43016q().f61828d.mo43169a("Event is too long for local database. Sending event directly to service");
            a = false;
        } else {
            a = i.mo43056a(0, marshall);
        }
        m52119a(new RunnableC26467ik(this, a, zzao, m52116a(true), str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43397a(zzw zzw) {
        boolean a;
        C25565r.m49314a(zzw);
        mo43002c();
        mo43243D();
        mo43019t();
        C26345dx i = mo43008i();
        i.mo43014o();
        byte[] a2 = C26510jz.m52397a((Parcelable) zzw);
        if (a2.length > 131072) {
            i.mo43016q().f61828d.mo43169a("Conditional user property too long for local database. Sending directly to service");
            a = false;
        } else {
            a = i.mo43056a(2, a2);
        }
        m52119a(new RunnableC26466ij(this, a, new zzw(zzw), m52116a(true), zzw));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43399a(AtomicReference<List<zzw>> atomicReference, String str, String str2, String str3) {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26469im(this, atomicReference, str, str2, str3, m52116a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43390a(AbstractC26221oy oyVar, String str, String str2) {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26468il(this, str, str2, m52116a(false), oyVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43400a(AtomicReference<List<zzkr>> atomicReference, String str, String str2, String str3, boolean z) {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26471io(this, atomicReference, str, str2, str3, z, m52116a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43391a(AbstractC26221oy oyVar, String str, String str2, boolean z) {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26470in(this, str, str2, z, m52116a(false), oyVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43396a(zzkr zzkr) {
        mo43002c();
        mo43243D();
        C26345dx i = mo43008i();
        Parcel obtain = Parcel.obtain();
        boolean z = false;
        zzkr.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i.mo43016q().f61828d.mo43169a("User property too long for local database. Sending directly to service");
        } else {
            z = i.mo43056a(1, marshall);
        }
        m52119a(new RunnableC26453hx(this, z, zzkr, m52116a(true)));
    }

    /* renamed from: a */
    public final void mo43398a(AtomicReference<String> atomicReference) {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26458ib(this, atomicReference, m52116a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43394a(C26443hn hnVar) {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26460id(this, hnVar));
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

    /* renamed from: w */
    public final boolean mo43401w() {
        mo43002c();
        mo43243D();
        if (this.f62222b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo43382A() {
        mo43002c();
        this.f62225e.mo43460a();
        this.f62224d.mo43336a(C26530p.f62471J.mo43024a(null).longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean mo43386I() {
        mo43002c();
        mo43243D();
        if (m52115J() && mo43014o().mo43550i() < 200900) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo43402x() {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26464ih(this, m52116a(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo43403y() {
        mo43002c();
        mo43243D();
        zzn a = m52116a(false);
        mo43008i().mo43057w();
        m52119a(new RunnableC26455hz(this, a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo43404z() {
        mo43002c();
        mo43243D();
        zzn a = m52116a(true);
        mo43008i().mo43056a(3, new byte[0]);
        m52119a(new RunnableC26461ie(this, a));
    }

    /* renamed from: G */
    public final void mo43384G() {
        mo43002c();
        mo43243D();
        ServiceConnectionC26473iq iqVar = this.f62221a;
        if (iqVar.f62299b != null && (iqVar.f62299b.mo41785g() || iqVar.f62299b.mo41786h())) {
            iqVar.f62299b.mo41784f();
        }
        iqVar.f62299b = null;
        try {
            C25588a.m49390a();
            mo43012m().unbindService(this.f62221a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f62222b = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo43385H() {
        mo43002c();
        mo43016q().f61835k.mo43170a("Processing queued up service tasks", Integer.valueOf(this.f62226f.size()));
        for (Runnable runnable : this.f62226f) {
            try {
                runnable.run();
            } catch (Exception e) {
                mo43016q().f61827c.mo43170a("Task exception while flushing queue", e);
            }
        }
        this.f62226f.clear();
        this.f62227g.mo43338c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (0 == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r1 != false) goto L_0x003c;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m52115J() {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26451hv.m52115J():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo43383B() {
        MethodCollector.m26663i(4233);
        mo43002c();
        mo43243D();
        if (mo43401w()) {
            MethodCollector.m26664o(4233);
        } else if (m52115J()) {
            ServiceConnectionC26473iq iqVar = this.f62221a;
            iqVar.f62300c.mo43002c();
            Context m = iqVar.f62300c.mo43012m();
            synchronized (iqVar) {
                try {
                    if (iqVar.f62298a) {
                        iqVar.f62300c.mo43016q().f61835k.mo43169a("Connection attempt already in progress");
                    } else if (iqVar.f62299b == null || (!iqVar.f62299b.mo41786h() && !iqVar.f62299b.mo41785g())) {
                        iqVar.f62299b = new C26346dy(m, Looper.getMainLooper(), iqVar, iqVar);
                        iqVar.f62300c.mo43016q().f61835k.mo43169a("Connecting to remote service");
                        iqVar.f62298a = true;
                        iqVar.f62299b.mo41790m();
                        MethodCollector.m26664o(4233);
                    } else {
                        iqVar.f62300c.mo43016q().f61835k.mo43169a("Already awaiting connection attempt");
                        MethodCollector.m26664o(4233);
                    }
                } finally {
                    MethodCollector.m26664o(4233);
                }
            }
        } else {
            if (!mo43018s().mo43649v()) {
                mo43019t();
                List<ResolveInfo> queryIntentServices = mo43012m().getPackageManager().queryIntentServices(new Intent().setClassName(mo43012m(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    mo43016q().f61827c.mo43169a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                } else {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context m2 = mo43012m();
                    mo43019t();
                    intent.setComponent(new ComponentName(m2, "com.google.android.gms.measurement.AppMeasurementService"));
                    ServiceConnectionC26473iq iqVar2 = this.f62221a;
                    iqVar2.f62300c.mo43002c();
                    Context m3 = iqVar2.f62300c.mo43012m();
                    C25588a.m49390a();
                    synchronized (iqVar2) {
                        try {
                            if (iqVar2.f62298a) {
                                iqVar2.f62300c.mo43016q().f61835k.mo43169a("Connection attempt already in progress");
                                return;
                            }
                            iqVar2.f62300c.mo43016q().f61835k.mo43169a("Using local app measurement service");
                            iqVar2.f62298a = true;
                            C25588a.m49392b(m3, intent, iqVar2.f62300c.f62221a, 129);
                            MethodCollector.m26664o(4233);
                            return;
                        } finally {
                            MethodCollector.m26664o(4233);
                        }
                    }
                }
            }
            MethodCollector.m26664o(4233);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43392a(AbstractC26341dt dtVar) {
        mo43002c();
        C25565r.m49314a(dtVar);
        this.f62222b = dtVar;
        mo43382A();
        mo43385H();
    }

    /* renamed from: a */
    private final zzn m52116a(boolean z) {
        String str;
        mo43019t();
        C26342du f = mo43005f();
        if (z) {
            str = mo43016q().mo43118e();
        } else {
            str = null;
        }
        return f.mo43044a(str);
    }

    protected C26451hv(C26381ff ffVar) {
        super(ffVar);
        this.f62225e = new C26495jl(ffVar.mo43011l());
        this.f62221a = new ServiceConnectionC26473iq(this);
        this.f62224d = new C26454hy(this, ffVar);
        this.f62227g = new C26465ii(this, ffVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m52117a(C26451hv hvVar) {
        hvVar.mo43002c();
        if (hvVar.mo43401w()) {
            hvVar.mo43016q().f61835k.mo43169a("Inactivity, disconnecting from the service");
            hvVar.mo43384G();
        }
    }

    /* renamed from: a */
    private final void m52119a(Runnable runnable) {
        mo43002c();
        if (mo43401w()) {
            runnable.run();
        } else if (((long) this.f62226f.size()) >= 1000) {
            mo43016q().f61827c.mo43169a("Discarding data. Max runnable queue size reached");
        } else {
            this.f62226f.add(runnable);
            this.f62227g.mo43336a(60000);
            mo43383B();
        }
    }

    /* renamed from: a */
    public final void mo43387a(Bundle bundle) {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26463ig(this, bundle, m52116a(false)));
    }

    /* renamed from: a */
    public final void mo43388a(AbstractC26221oy oyVar) {
        mo43002c();
        mo43243D();
        m52119a(new RunnableC26457ia(this, m52116a(false), oyVar));
    }

    /* renamed from: a */
    static /* synthetic */ void m52118a(C26451hv hvVar, ComponentName componentName) {
        hvVar.mo43002c();
        if (hvVar.f62222b != null) {
            hvVar.f62222b = null;
            hvVar.mo43016q().f61835k.mo43170a("Disconnected from device MeasurementService", componentName);
            hvVar.mo43002c();
            hvVar.mo43383B();
        }
    }

    /* renamed from: a */
    public final void mo43389a(AbstractC26221oy oyVar, zzao zzao, String str) {
        mo43002c();
        mo43243D();
        if (mo43014o().mo43551j() != 0) {
            mo43016q().f61830f.mo43169a("Not bundling data. Service unavailable or out of date");
            mo43014o().mo43532a(oyVar, new byte[0]);
            return;
        }
        m52119a(new RunnableC26462if(this, zzao, str, oyVar));
    }
}
