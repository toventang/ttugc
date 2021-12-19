package com.bytedance.bdlocation.service;

import android.os.Looper;
import com.bytedance.bdlocation.AbstractC13148a;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.service.C13205f;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.bdlocation.service.g */
public final /* synthetic */ class RunnableC13207g implements Runnable {

    /* renamed from: a */
    private final C13205f f32275a;

    /* renamed from: b */
    private final C13156e f32276b;

    static {
        Covode.recordClassIndex(15156);
    }

    RunnableC13207g(C13205f fVar, C13156e eVar) {
        this.f32275a = fVar;
        this.f32276b = eVar;
    }

    public final void run() {
        C13205f fVar = this.f32275a;
        C13156e eVar = this.f32276b;
        C13162b.m23687b("LocationScheduler:StartLocation: " + eVar.toString());
        if (fVar.f32269b == null) {
            C13162b.m23687b("LocationScheduler:StartLocation: state is ready------------------");
            fVar.f32269b = new C13205f.C13206a(eVar, System.currentTimeMillis());
        } else {
            C13162b.m23687b("LocationScheduler:StartLocation: state is runding,newOption start---------------");
            fVar.f32269b = new C13205f.C13206a(eVar, fVar.f32269b.f32274b);
            C13210j jVar = fVar.f32271d;
            if (jVar.f32283c != null) {
                jVar.f32283c.stopLocation();
            }
        }
        C13210j jVar2 = fVar.f32271d;
        Looper looper = fVar.f32270c.getLooper();
        jVar2.f32284d = eVar;
        jVar2.f32283c = jVar2.f32281a;
        try {
            ((AbstractC13148a) jVar2.f32283c).mLocateCb = eVar.f32083e;
            jVar2.f32283c.startLocation(jVar2, eVar, looper);
        } catch (Exception e) {
            C13154c cVar = new C13154c(e, jVar2.f32283c.getLocateName(), "28");
            jVar2.mo21247a(cVar);
            ((AbstractC13148a) jVar2.f32283c).onLocateError(jVar2.f32283c.getLocateName(), cVar);
            jVar2.f32282b.mo21332a(false);
        }
    }
}
