package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C26130lo;
import com.google.android.gms.internal.measurement.C26141lz;
import com.google.android.gms.internal.measurement.C26143ma;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.jg */
public final class C26490jg {

    /* renamed from: a */
    long f62338a;

    /* renamed from: b */
    long f62339b;

    /* renamed from: c */
    final AbstractC26429h f62340c;

    /* renamed from: d */
    private final /* synthetic */ C26482iz f62341d;

    static {
        Covode.recordClassIndex(31912);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo43451a() {
        long b = this.f62341d.mo43011l().mo41858b();
        long j = b - this.f62339b;
        this.f62339b = b;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo43454b(long j) {
        long j2 = j - this.f62339b;
        this.f62339b = j;
        return j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43452a(long j) {
        this.f62341d.mo43002c();
        this.f62340c.mo43338c();
        this.f62338a = j;
        this.f62339b = j;
    }

    public C26490jg(C26482iz izVar) {
        this.f62341d = izVar;
        this.f62340c = new C26493jj(this, izVar.f62077z);
        long b = izVar.mo43011l().mo41858b();
        this.f62338a = b;
        this.f62339b = b;
    }

    /* renamed from: a */
    static /* synthetic */ void m52229a(C26490jg jgVar) {
        jgVar.f62341d.mo43002c();
        jgVar.mo43453a(false, false, jgVar.f62341d.mo43011l().mo41858b());
        jgVar.f62341d.mo43003d().mo42995a(jgVar.f62341d.mo43011l().mo41858b());
    }

    /* renamed from: a */
    public final boolean mo43453a(boolean z, boolean z2, long j) {
        this.f62341d.mo43002c();
        this.f62341d.mo43243D();
        C26130lo.m51217b();
        if (!this.f62341d.mo43018s().mo43641d(null, C26530p.f62489aA)) {
            j = this.f62341d.mo43011l().mo41858b();
        }
        C26141lz.m51231b();
        if (!this.f62341d.mo43018s().mo43641d(null, C26530p.f62537aw) || this.f62341d.f62077z.mo43265r()) {
            this.f62341d.mo43017r().f61917q.mo43210a(this.f62341d.mo43011l().mo41857a());
        }
        long j2 = j - this.f62338a;
        if (z || j2 >= 1000) {
            if (this.f62341d.mo43018s().mo43641d(null, C26530p.f62482U) && !z2) {
                C26143ma.m51234b();
                if (this.f62341d.mo43018s().mo43641d(null, C26530p.f62484W)) {
                    C26130lo.m51217b();
                    if (this.f62341d.mo43018s().mo43641d(null, C26530p.f62489aA)) {
                        j2 = mo43454b(j);
                    }
                }
                j2 = mo43451a();
            }
            this.f62341d.mo43016q().f61835k.mo43170a("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C26446hq.m52084a(this.f62341d.mo43007h().mo43371a(!this.f62341d.mo43018s().mo43647h().booleanValue()), bundle, true);
            if (this.f62341d.mo43018s().mo43641d(null, C26530p.f62482U) && !this.f62341d.mo43018s().mo43641d(null, C26530p.f62483V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f62341d.mo43018s().mo43641d(null, C26530p.f62483V) || !z2) {
                this.f62341d.mo43004e().mo43305a("auto", "_e", bundle);
            }
            this.f62338a = j;
            this.f62340c.mo43338c();
            this.f62340c.mo43336a(3600000);
            return true;
        }
        this.f62341d.mo43016q().f61835k.mo43170a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
