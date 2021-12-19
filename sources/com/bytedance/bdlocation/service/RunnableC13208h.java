package com.bytedance.bdlocation.service;

import com.bytedance.bdlocation.AbstractC13148a;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.bdlocation.service.h */
public final /* synthetic */ class RunnableC13208h implements Runnable {

    /* renamed from: a */
    private final C13205f f32277a;

    /* renamed from: b */
    private final boolean f32278b;

    static {
        Covode.recordClassIndex(15157);
    }

    RunnableC13208h(C13205f fVar, boolean z) {
        this.f32277a = fVar;
        this.f32278b = z;
    }

    public final void run() {
        C13205f fVar = this.f32277a;
        boolean z = this.f32278b;
        C13162b.m23690d("BDLocation", "StopLocation");
        C13210j jVar = fVar.f32271d;
        if (jVar.f32283c != null) {
            if (z) {
                ((AbstractC13148a) jVar.f32283c).onLocateError(jVar.f32283c.getLocateName(), new C13154c("Timeout.", jVar.f32283c.getLocateName(), "0"));
            }
            jVar.f32283c.stopLocation();
        }
        fVar.f32269b = null;
    }
}
