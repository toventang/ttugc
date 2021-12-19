package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.jh */
final /* synthetic */ class RunnableC26491jh implements Runnable {

    /* renamed from: a */
    private final RunnableC26488je f62342a;

    static {
        Covode.recordClassIndex(31913);
    }

    RunnableC26491jh(RunnableC26488je jeVar) {
        this.f62342a = jeVar;
    }

    public final void run() {
        RunnableC26488je jeVar = this.f62342a;
        C26489jf jfVar = jeVar.f62335c;
        long j = jeVar.f62333a;
        long j2 = jeVar.f62334b;
        jfVar.f62337b.mo43002c();
        jfVar.f62337b.mo43016q().f61834j.mo43169a("Application going to the background");
        boolean z = true;
        if (jfVar.f62337b.mo43018s().mo43641d(null, C26530p.f62492aD)) {
            jfVar.f62337b.mo43017r().f61919s.mo43205a(true);
        }
        Bundle bundle = new Bundle();
        if (!jfVar.f62337b.mo43018s().mo43647h().booleanValue()) {
            jfVar.f62337b.f62319c.f62340c.mo43338c();
            if (jfVar.f62337b.mo43018s().mo43641d(null, C26530p.f62533as)) {
                bundle.putLong("_et", jfVar.f62337b.mo43438a(j2));
                C26446hq.m52084a(jfVar.f62337b.mo43007h().mo43371a(true), bundle, true);
            } else {
                z = false;
            }
            jfVar.f62337b.mo43439a(false, z, j2);
        }
        jfVar.f62337b.mo43004e().mo43303a("auto", "_ab", j, bundle);
    }
}
