package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.HandlerC26206oj;

/* renamed from: com.google.android.gms.measurement.internal.iz */
public final class C26482iz extends AbstractC26377fb {

    /* renamed from: a */
    Handler f62317a;

    /* renamed from: b */
    protected final C26492ji f62318b = new C26492ji(this);

    /* renamed from: c */
    protected final C26490jg f62319c = new C26490jg(this);

    /* renamed from: d */
    private final C26489jf f62320d = new C26489jf(this);

    static {
        Covode.recordClassIndex(31904);
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

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo43440w() {
        mo43002c();
        if (this.f62317a == null) {
            this.f62317a = new HandlerC26206oj(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo43438a(long j) {
        return this.f62319c.mo43454b(j);
    }

    C26482iz(C26381ff ffVar) {
        super(ffVar);
    }

    /* renamed from: b */
    static /* synthetic */ void m52180b(C26482iz izVar, long j) {
        izVar.mo43002c();
        izVar.mo43440w();
        izVar.mo43016q().f61835k.mo43170a("Activity paused, time", Long.valueOf(j));
        C26489jf jfVar = izVar.f62320d;
        if (jfVar.f62337b.mo43018s().mo43641d(null, C26530p.f62530ap)) {
            jfVar.f62336a = new RunnableC26488je(jfVar, jfVar.f62337b.mo43011l().mo41857a(), j);
            jfVar.f62337b.f62317a.postDelayed(jfVar.f62336a, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
        if (izVar.mo43018s().mo43647h().booleanValue()) {
            izVar.f62319c.f62340c.mo43338c();
        }
        C26492ji jiVar = izVar.f62318b;
        if (!jiVar.f62343a.mo43018s().mo43641d(null, C26530p.f62492aD)) {
            jiVar.f62343a.mo43017r().f61919s.mo43205a(true);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m52179a(C26482iz izVar, long j) {
        izVar.mo43002c();
        izVar.mo43440w();
        izVar.mo43016q().f61835k.mo43170a("Activity resumed, time", Long.valueOf(j));
        if (izVar.mo43018s().mo43641d(null, C26530p.f62492aD)) {
            if (izVar.mo43018s().mo43647h().booleanValue() || izVar.mo43017r().f61919s.mo43206a()) {
                izVar.f62319c.mo43452a(j);
            }
            izVar.f62320d.mo43450a();
        } else {
            izVar.f62320d.mo43450a();
            if (izVar.mo43018s().mo43647h().booleanValue()) {
                izVar.f62319c.mo43452a(j);
            }
        }
        C26492ji jiVar = izVar.f62318b;
        jiVar.f62343a.mo43002c();
        if (jiVar.f62343a.f62077z.mo43265r()) {
            if (!jiVar.f62343a.mo43018s().mo43641d(null, C26530p.f62492aD)) {
                jiVar.f62343a.mo43017r().f61919s.mo43205a(false);
            }
            jiVar.mo43457a(jiVar.f62343a.mo43011l().mo41857a(), false);
        }
    }

    /* renamed from: a */
    public final boolean mo43439a(boolean z, boolean z2, long j) {
        return this.f62319c.mo43453a(z, z2, j);
    }
}
