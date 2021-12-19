package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.gms.measurement.internal.AbstractC26484ja;
import com.google.android.gms.measurement.internal.C26350eb;
import com.google.android.gms.measurement.internal.C26381ff;
import com.google.android.gms.measurement.internal.C26479iw;
import com.google.android.gms.measurement.internal.RunnableC26481iy;

public final class AppMeasurementJobService extends JobService implements AbstractC26484ja {

    /* renamed from: a */
    private C26479iw<AppMeasurementJobService> f61668a;

    static {
        Covode.recordClassIndex(31655);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26484ja
    /* renamed from: a */
    public final void mo42975a(Intent intent) {
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* renamed from: a */
    private final C26479iw<AppMeasurementJobService> m51370a() {
        if (this.f61668a == null) {
            this.f61668a = new C26479iw<>(this);
        }
        return this.f61668a;
    }

    public final void onCreate() {
        super.onCreate();
        m51370a().mo43430a();
    }

    public final void onDestroy() {
        m51370a().mo43433b();
        super.onDestroy();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26484ja
    /* renamed from: a */
    public final void mo42974a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final void onRebind(Intent intent) {
        m51370a().mo43434b(intent);
    }

    public final boolean onUnbind(Intent intent) {
        return m51370a().mo43432a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26484ja
    /* renamed from: a */
    public final boolean mo42976a(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C26479iw<AppMeasurementJobService> a = m51370a();
        C26381ff a2 = C26381ff.m51900a(a.f62311a, null, null);
        C26350eb q = a2.mo43016q();
        String string = jobParameters.getExtras().getString("action");
        a2.mo43019t();
        q.f61835k.mo43170a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a.mo43431a(new RunnableC26481iy(a, q, jobParameters));
        return true;
    }
}
