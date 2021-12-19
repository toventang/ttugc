package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.f */
final /* synthetic */ class RunnableC25222f implements Runnable {

    /* renamed from: a */
    private final JobInfoSchedulerService f59721a;

    /* renamed from: b */
    private final JobParameters f59722b;

    static {
        Covode.recordClassIndex(30590);
    }

    RunnableC25222f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f59721a = jobInfoSchedulerService;
        this.f59722b = jobParameters;
    }

    public final void run() {
        this.f59721a.jobFinished(this.f59722b, false);
    }
}
