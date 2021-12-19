package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.gms.measurement.internal.AbstractC26484ja;
import com.google.android.gms.measurement.internal.BinderC26382fg;
import com.google.android.gms.measurement.internal.C26350eb;
import com.google.android.gms.measurement.internal.C26381ff;
import com.google.android.gms.measurement.internal.C26479iw;
import com.google.android.gms.measurement.internal.C26498jo;
import com.google.android.gms.measurement.internal.RunnableC26478iv;

public final class AppMeasurementService extends Service implements AbstractC26484ja {

    /* renamed from: a */
    private C26479iw<AppMeasurementService> f61670a;

    static {
        Covode.recordClassIndex(31657);
    }

    /* renamed from: a */
    private final C26479iw<AppMeasurementService> m51375a() {
        if (this.f61670a == null) {
            this.f61670a = new C26479iw<>(this);
        }
        return this.f61670a;
    }

    public final void onCreate() {
        super.onCreate();
        m51375a().mo43430a();
    }

    public final void onDestroy() {
        m51375a().mo43433b();
        super.onDestroy();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26484ja
    /* renamed from: a */
    public final void mo42975a(Intent intent) {
        AppMeasurementReceiver.m3847a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26484ja
    /* renamed from: a */
    public final void mo42974a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final void onRebind(Intent intent) {
        m51375a().mo43434b(intent);
    }

    public final boolean onUnbind(Intent intent) {
        return m51375a().mo43432a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26484ja
    /* renamed from: a */
    public final boolean mo42976a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        C26479iw<AppMeasurementService> a = m51375a();
        if (intent == null) {
            a.mo43435c().f61827c.mo43169a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC26382fg(C26498jo.m52270a(a.f62311a));
        }
        a.mo43435c().f61830f.mo43170a("onBind received unknown action", action);
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        C26479iw<AppMeasurementService> a = m51375a();
        C26381ff a2 = C26381ff.m51900a(a.f62311a, null, null);
        C26350eb q = a2.mo43016q();
        if (intent == null) {
            q.f61830f.mo43169a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a2.mo43019t();
        q.f61835k.mo43171a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        a.mo43431a(new RunnableC26478iv(a, i2, q, intent));
        return 2;
    }
}
