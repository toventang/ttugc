package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.AbstractC25603e;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.hq */
public final class C26446hq extends AbstractC26377fb {

    /* renamed from: a */
    volatile C26443hn f62198a;

    /* renamed from: b */
    C26443hn f62199b;

    /* renamed from: c */
    protected C26443hn f62200c;

    /* renamed from: d */
    final Map<Activity, C26443hn> f62201d = new ConcurrentHashMap();

    /* renamed from: e */
    Activity f62202e;

    /* renamed from: f */
    volatile boolean f62203f;

    /* renamed from: g */
    volatile C26443hn f62204g;

    /* renamed from: h */
    C26443hn f62205h;

    /* renamed from: i */
    boolean f62206i;

    /* renamed from: j */
    final Object f62207j = new Object();

    /* renamed from: k */
    private C26443hn f62208k;

    /* renamed from: l */
    private String f62209l;

    static {
        Covode.recordClassIndex(31868);
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
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43375a(com.google.android.gms.measurement.internal.C26443hn r14, com.google.android.gms.measurement.internal.C26443hn r15, long r16, boolean r18, android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26446hq.mo43375a(com.google.android.gms.measurement.internal.hn, com.google.android.gms.measurement.internal.hn, long, boolean, android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43376a(C26443hn hnVar, boolean z, long j) {
        mo43003d().mo42995a(mo43011l().mo41858b());
        if (mo43009j().mo43439a(hnVar != null && hnVar.f62190d, z, j) && hnVar != null) {
            hnVar.f62190d = false;
        }
    }

    /* renamed from: a */
    public final void mo43377a(String str, C26443hn hnVar) {
        MethodCollector.m26663i(6356);
        mo43002c();
        synchronized (this) {
            try {
                String str2 = this.f62209l;
                if (str2 == null || str2.equals(str) || hnVar != null) {
                    this.f62209l = str;
                    this.f62208k = hnVar;
                }
            } finally {
                MethodCollector.m26664o(6356);
            }
        }
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

    public C26446hq(C26381ff ffVar) {
        super(ffVar);
    }

    /* renamed from: a */
    static String m52083a(String str) {
        String str2;
        String[] split = str.split("\\.");
        if (split.length > 0) {
            str2 = split[split.length - 1];
        } else {
            str2 = "";
        }
        if (str2.length() > 100) {
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26443hn mo43370a(Activity activity) {
        C25565r.m49314a(activity);
        C26443hn hnVar = this.f62201d.get(activity);
        if (hnVar == null) {
            hnVar = new C26443hn(null, m52083a(activity.getClass().getCanonicalName()), mo43014o().mo43547f());
            this.f62201d.put(activity, hnVar);
        }
        if (mo43018s().mo43641d(null, C26530p.f62492aD) && this.f62204g != null) {
            return this.f62204g;
        }
        return hnVar;
    }

    /* renamed from: a */
    public final C26443hn mo43371a(boolean z) {
        mo43243D();
        mo43002c();
        if (!mo43018s().mo43641d(null, C26530p.f62492aD) || !z) {
            return this.f62200c;
        }
        C26443hn hnVar = this.f62200c;
        if (hnVar != null) {
            return hnVar;
        }
        return this.f62205h;
    }

    /* renamed from: a */
    public final void mo43372a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (mo43018s().mo43647h().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f62201d.put(activity, new C26443hn(bundle2.getString(StringSet.name), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        if (r8 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
        r3 = mo43016q().f61835k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        if (r7 != null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        if (r8 != null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ec, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ee, code lost:
        r3.mo43171a("Logging screen view with name, class", r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
        if (r19.f62198a != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
        r1 = r19.f62199b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        r6 = new com.google.android.gms.measurement.internal.C26443hn(r7, r8, mo43014o().mo43547f(), true, r21);
        r19.f62198a = r6;
        r19.f62199b = r1;
        r19.f62204g = r6;
        mo43015p().mo43220a(new com.google.android.gms.measurement.internal.RunnableC26445hp(r19, r20, r6, r1, mo43011l().mo41858b()));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6348);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0129, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012a, code lost:
        r1 = r19.f62198a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012d, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012f, code lost:
        r1 = r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43374a(android.os.Bundle r20, long r21) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26446hq.mo43374a(android.os.Bundle, long):void");
    }

    /* renamed from: a */
    public static void m52084a(C26443hn hnVar, Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        if (hnVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                if (hnVar.f62187a != null) {
                    bundle.putString("_sn", hnVar.f62187a);
                } else {
                    bundle.remove("_sn");
                }
                if (hnVar.f62188b != null) {
                    bundle.putString("_sc", hnVar.f62188b);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", hnVar.f62189c);
            }
        } else if (z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43373a(Activity activity, C26443hn hnVar, boolean z) {
        C26443hn hnVar2;
        C26443hn hnVar3;
        String str;
        if (this.f62198a == null) {
            hnVar2 = this.f62199b;
        } else {
            hnVar2 = this.f62198a;
        }
        if (hnVar.f62188b == null) {
            if (activity != null) {
                str = m52083a(activity.getClass().getCanonicalName());
            } else {
                str = null;
            }
            hnVar3 = new C26443hn(hnVar.f62187a, str, hnVar.f62189c, hnVar.f62191e, hnVar.f62192f);
        } else {
            hnVar3 = hnVar;
        }
        this.f62199b = this.f62198a;
        this.f62198a = hnVar3;
        mo43015p().mo43220a(new RunnableC26448hs(this, hnVar3, hnVar2, mo43011l().mo41858b(), z));
    }
}
