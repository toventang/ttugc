package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C26141lz;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gr */
final class RunnableC26420gr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f62128a;

    /* renamed from: b */
    private final /* synthetic */ C26413gk f62129b;

    static {
        Covode.recordClassIndex(31842);
    }

    public final void run() {
        C26413gk gkVar = this.f62129b;
        long j = this.f62128a;
        gkVar.mo43002c();
        gkVar.mo43243D();
        gkVar.mo43016q().f61834j.mo43169a("Resetting analytics data (FE)");
        C26482iz j2 = gkVar.mo43009j();
        j2.mo43002c();
        C26490jg jgVar = j2.f62319c;
        jgVar.f62340c.mo43338c();
        jgVar.f62338a = 0;
        jgVar.f62339b = jgVar.f62338a;
        boolean r = gkVar.f62077z.mo43265r();
        C26361em r2 = gkVar.mo43017r();
        r2.f61909i.mo43210a(j);
        if (!TextUtils.isEmpty(r2.mo43017r().f61922v.mo43213a())) {
            r2.f61922v.mo43214a(null);
        }
        C26141lz.m51231b();
        if (r2.mo43018s().mo43641d(null, C26530p.f62537aw)) {
            r2.f61917q.mo43210a(0);
        }
        if (!r2.mo43018s().mo43644f()) {
            r2.mo43194c(!r);
        }
        r2.f61923w.mo43214a(null);
        r2.f61924x.mo43210a(0);
        r2.f61925y.mo43204a(null);
        gkVar.mo43006g().mo43403y();
        C26141lz.m51231b();
        if (gkVar.mo43018s().mo43641d(null, C26530p.f62537aw)) {
            gkVar.mo43009j().f62318b.mo43456a();
        }
        gkVar.f62102c = !r;
        this.f62129b.mo43006g().mo43398a(new AtomicReference<>());
    }

    RunnableC26420gr(C26413gk gkVar, long j) {
        this.f62129b = gkVar;
        this.f62128a = j;
    }
}
