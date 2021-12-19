package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.AbstractC25603e;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a */
public final class C26240a extends C26296cb {

    /* renamed from: a */
    final Map<String, Long> f61678a = new C0484a();

    /* renamed from: b */
    final Map<String, Integer> f61679b = new C0484a();

    /* renamed from: c */
    long f61680c;

    static {
        Covode.recordClassIndex(31662);
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

    public C26240a(C26381ff ffVar) {
        super(ffVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43000b(long j) {
        for (String str : this.f61678a.keySet()) {
            this.f61678a.put(str, Long.valueOf(j));
        }
        if (!this.f61678a.isEmpty()) {
            this.f61680c = j;
        }
    }

    /* renamed from: a */
    public final void mo42995a(long j) {
        C26443hn a = mo43007h().mo43371a(false);
        for (String str : this.f61678a.keySet()) {
            mo42998a(str, j - this.f61678a.get(str).longValue(), a);
        }
        if (!this.f61678a.isEmpty()) {
            mo42996a(j - this.f61680c, a);
        }
        mo43000b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42996a(long j, C26443hn hnVar) {
        if (hnVar == null) {
            mo43016q().f61835k.mo43169a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            mo43016q().f61835k.mo43170a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C26446hq.m52084a(hnVar, bundle, true);
            mo43004e().mo43305a("am", "_xa", bundle);
        }
    }

    /* renamed from: b */
    public final void mo43001b(String str, long j) {
        if (str == null || str.length() == 0) {
            mo43016q().f61827c.mo43169a("Ad unit id must be a non-empty string");
        } else {
            mo43015p().mo43220a(new RunnableC26540z(this, str, j));
        }
    }

    /* renamed from: a */
    public final void mo42997a(String str, long j) {
        if (str == null || str.length() == 0) {
            mo43016q().f61827c.mo43169a("Ad unit id must be a non-empty string");
        } else {
            mo43015p().mo43220a(new RunnableC26268ba(this, str, j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42998a(String str, long j, C26443hn hnVar) {
        if (hnVar == null) {
            mo43016q().f61835k.mo43169a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            mo43016q().f61835k.mo43170a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C26446hq.m52084a(hnVar, bundle, true);
            mo43004e().mo43305a("am", "_xu", bundle);
        }
    }
}
