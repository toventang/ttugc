package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.iy */
public final /* synthetic */ class RunnableC26481iy implements Runnable {

    /* renamed from: a */
    private final C26479iw f62314a;

    /* renamed from: b */
    private final C26350eb f62315b;

    /* renamed from: c */
    private final JobParameters f62316c;

    static {
        Covode.recordClassIndex(31903);
    }

    public RunnableC26481iy(C26479iw iwVar, C26350eb ebVar, JobParameters jobParameters) {
        this.f62314a = iwVar;
        this.f62315b = ebVar;
        this.f62316c = jobParameters;
    }

    public final void run() {
        C26479iw iwVar = this.f62314a;
        C26350eb ebVar = this.f62315b;
        JobParameters jobParameters = this.f62316c;
        ebVar.f61835k.mo43169a("AppMeasurementJobService processed last upload request.");
        iwVar.f62311a.mo42974a(jobParameters);
    }
}
