package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.common.util.C25610l;
import com.google.android.gms.internal.measurement.C26098kj;
import com.google.android.gms.internal.measurement.C26168mz;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.km */
public final class C26524km extends C26401fz {

    /* renamed from: a */
    public AbstractC26267b f62440a = C26294c.f61735a;

    /* renamed from: b */
    private Boolean f62441b;

    /* renamed from: c */
    private Boolean f62442c;

    static {
        Covode.recordClassIndex(31946);
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo42999b() {
        super.mo42999b();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43002c() {
        super.mo43002c();
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

    /* renamed from: i */
    public static long m52496i() {
        return C26530p.f62465D.mo43024a(null).longValue();
    }

    /* renamed from: j */
    public static long m52497j() {
        return C26530p.f62543d.mo43024a(null).longValue();
    }

    /* renamed from: u */
    public final String mo43648u() {
        return mo43634a("debug.firebase.analytics.app", "");
    }

    /* renamed from: f */
    public final boolean mo43644f() {
        mo43019t();
        Boolean d = mo43640d("firebase_analytics_collection_deactivated");
        if (d == null || !d.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Boolean mo43646g() {
        boolean z;
        Boolean d = mo43640d("google_analytics_adid_collection_enabled");
        if (d == null || d.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    public final int mo43639d() {
        C26098kj.m51128b();
        if (!mo43018s().mo43641d(null, C26530p.f62500aL) || mo43014o().mo43550i() < 201500) {
            return 25;
        }
        return 100;
    }

    /* renamed from: h */
    public final Boolean mo43647h() {
        C26168mz.m51276b();
        boolean z = true;
        if (!mo43641d(null, C26530p.f62491aC)) {
            return true;
        }
        Boolean d = mo43640d("google_analytics_automatic_screen_reporting_enabled");
        if (d != null && !d.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo43649v() {
        if (this.f62441b == null) {
            Boolean d = mo43640d("app_measurement_lite");
            this.f62441b = d;
            if (d == null) {
                this.f62441b = false;
            }
        }
        if (this.f62441b.booleanValue() || !this.f62077z.f62000d) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private final Bundle m52498w() {
        try {
            if (mo43012m().getPackageManager() == null) {
                mo43016q().f61827c.mo43169a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C25500c.f60481a.mo41741a(mo43012m()).mo41737a(mo43012m().getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            mo43016q().f61827c.mo43169a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            mo43016q().f61827c.mo43170a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo43643e() {
        boolean z;
        MethodCollector.m26663i(5067);
        if (this.f62442c == null) {
            synchronized (this) {
                try {
                    if (this.f62442c == null) {
                        ApplicationInfo applicationInfo = mo43012m().getApplicationInfo();
                        String a = C25610l.m49426a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            if (str == null || !str.equals(a)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            this.f62442c = Boolean.valueOf(z);
                        }
                        if (this.f62442c == null) {
                            this.f62442c = Boolean.TRUE;
                            mo43016q().f61827c.mo43169a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5067);
                    throw th;
                }
            }
        }
        boolean booleanValue = this.f62442c.booleanValue();
        MethodCollector.m26664o(5067);
        return booleanValue;
    }

    C26524km(C26381ff ffVar) {
        super(ffVar);
    }

    /* renamed from: c */
    public final int mo43638c(String str) {
        return mo43636b(str, C26530p.f62554o);
    }

    /* renamed from: a */
    public final int mo43630a(String str) {
        return mo43631a(str, C26530p.f62470I, 25, 100);
    }

    /* renamed from: f */
    public final boolean mo43645f(String str) {
        return "1".equals(this.f62440a.mo43021a(str, "gaia_collection_enabled"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo43635b(String str) {
        C26098kj.m51128b();
        if (mo43641d(null, C26530p.f62499aK)) {
            return mo43631a(str, C26530p.f62469H, 500, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        return 500;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Boolean mo43640d(String str) {
        C25565r.m49316a(str);
        Bundle w = m52498w();
        if (w == null) {
            mo43016q().f61827c.mo43169a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!w.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(w.getBoolean(str));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0018 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029 A[SYNTHETIC, Splitter:B:9:0x0029] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo43642e(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.C25565r.m49316a(r5)
            android.os.Bundle r1 = r4.m52498w()
            r3 = 0
            if (r1 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.eb r0 = r4.mo43016q()
            com.google.android.gms.measurement.internal.ee r1 = r0.f61827c
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r1.mo43169a(r0)
        L_0x0015:
            r2 = r3
        L_0x0016:
            if (r2 != 0) goto L_0x0029
            return r3
        L_0x0019:
            boolean r0 = r1.containsKey(r5)
            if (r0 != 0) goto L_0x0020
            goto L_0x0015
        L_0x0020:
            int r0 = r1.getInt(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0016
        L_0x0029:
            android.content.Context r0 = r4.mo43012m()     // Catch:{ NotFoundException -> 0x0041 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ NotFoundException -> 0x0041 }
            int r0 = r2.intValue()     // Catch:{ NotFoundException -> 0x0041 }
            java.lang.String[] r0 = r1.getStringArray(r0)     // Catch:{ NotFoundException -> 0x0041 }
            if (r0 != 0) goto L_0x003c
            return r3
        L_0x003c:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ NotFoundException -> 0x0041 }
            return r0
        L_0x0041:
            r2 = move-exception
            com.google.android.gms.measurement.internal.eb r0 = r4.mo43016q()
            com.google.android.gms.measurement.internal.ee r1 = r0.f61827c
            java.lang.String r0 = "Failed to load string array from metadata: resource not found"
            r1.mo43170a(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26524km.mo43642e(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo43633a(com.google.android.gms.measurement.internal.C26351ec r7) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26524km.mo43633a(com.google.android.gms.measurement.internal.ec):java.lang.String");
    }

    /* renamed from: a */
    public final long mo43632a(String str, C26338dq<Long> dqVar) {
        if (str == null) {
            return dqVar.mo43024a(null).longValue();
        }
        String a = this.f62440a.mo43021a(str, dqVar.f61783a);
        if (TextUtils.isEmpty(a)) {
            return dqVar.mo43024a(null).longValue();
        }
        try {
            return dqVar.mo43024a(Long.valueOf(Long.parseLong(a))).longValue();
        } catch (NumberFormatException unused) {
            return dqVar.mo43024a(null).longValue();
        }
    }

    /* renamed from: b */
    public final int mo43636b(String str, C26338dq<Integer> dqVar) {
        if (str == null) {
            return dqVar.mo43024a(null).intValue();
        }
        String a = this.f62440a.mo43021a(str, dqVar.f61783a);
        if (TextUtils.isEmpty(a)) {
            return dqVar.mo43024a(null).intValue();
        }
        try {
            return dqVar.mo43024a(Integer.valueOf(Integer.parseInt(a))).intValue();
        } catch (NumberFormatException unused) {
            return dqVar.mo43024a(null).intValue();
        }
    }

    /* renamed from: c */
    public final double mo43637c(String str, C26338dq<Double> dqVar) {
        if (str == null) {
            return dqVar.mo43024a(null).doubleValue();
        }
        String a = this.f62440a.mo43021a(str, dqVar.f61783a);
        if (TextUtils.isEmpty(a)) {
            return dqVar.mo43024a(null).doubleValue();
        }
        try {
            return dqVar.mo43024a(Double.valueOf(Double.parseDouble(a))).doubleValue();
        } catch (NumberFormatException unused) {
            return dqVar.mo43024a(null).doubleValue();
        }
    }

    /* renamed from: d */
    public final boolean mo43641d(String str, C26338dq<Boolean> dqVar) {
        if (str == null) {
            return dqVar.mo43024a(null).booleanValue();
        }
        String a = this.f62440a.mo43021a(str, dqVar.f61783a);
        if (TextUtils.isEmpty(a)) {
            return dqVar.mo43024a(null).booleanValue();
        }
        return dqVar.mo43024a(Boolean.valueOf(Boolean.parseBoolean(a))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo43634a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            mo43016q().f61827c.mo43170a("Could not find SystemProperties class", e);
            return str2;
        } catch (NoSuchMethodException e2) {
            mo43016q().f61827c.mo43170a("Could not find SystemProperties.get() method", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            mo43016q().f61827c.mo43170a("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            mo43016q().f61827c.mo43170a("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo43631a(String str, C26338dq<Integer> dqVar, int i, int i2) {
        return Math.max(Math.min(mo43636b(str, dqVar), i2), i);
    }
}
