package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.measurement.internal.AbstractC26484ja;

/* renamed from: com.google.android.gms.measurement.internal.iw */
public final class C26479iw<T extends Context & AbstractC26484ja> {

    /* renamed from: a */
    public final T f62311a;

    static {
        Covode.recordClassIndex(31901);
    }

    /* renamed from: c */
    public final C26350eb mo43435c() {
        return C26381ff.m51900a(this.f62311a, null, null).mo43016q();
    }

    /* renamed from: a */
    public final void mo43430a() {
        C26381ff a = C26381ff.m51900a(this.f62311a, null, null);
        C26350eb q = a.mo43016q();
        a.mo43019t();
        q.f61835k.mo43169a("Local AppMeasurementService is starting up");
    }

    /* renamed from: b */
    public final void mo43433b() {
        C26381ff a = C26381ff.m51900a(this.f62311a, null, null);
        C26350eb q = a.mo43016q();
        a.mo43019t();
        q.f61835k.mo43169a("Local AppMeasurementService is shutting down");
    }

    public C26479iw(T t) {
        C25565r.m49314a(t);
        this.f62311a = t;
    }

    /* renamed from: a */
    public final void mo43431a(Runnable runnable) {
        C26498jo a = C26498jo.m52270a(this.f62311a);
        a.mo43015p().mo43220a(new RunnableC26480ix(a, runnable));
    }

    /* renamed from: b */
    public final void mo43434b(Intent intent) {
        if (intent == null) {
            mo43435c().f61827c.mo43169a("onRebind called with null intent");
            return;
        }
        mo43435c().f61835k.mo43170a("onRebind called. action", intent.getAction());
    }

    /* renamed from: a */
    public final boolean mo43432a(Intent intent) {
        if (intent == null) {
            mo43435c().f61827c.mo43169a("onUnbind called with null intent");
            return true;
        }
        mo43435c().f61835k.mo43170a("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
