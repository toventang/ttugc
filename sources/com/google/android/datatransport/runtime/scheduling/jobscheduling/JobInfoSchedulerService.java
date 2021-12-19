package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.datatransport.runtime.AbstractC25162k;
import com.google.android.datatransport.runtime.C25168p;
import com.google.android.datatransport.runtime.p1928e.C25154a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

public class JobInfoSchedulerService extends JobService {
    static {
        Covode.recordClassIndex(30583);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        Context applicationContext = getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C25168p.m48273a(applicationContext);
        AbstractC25162k.AbstractC25163a a = AbstractC25162k.m48261d().mo41125a(string).mo41124a(C25154a.m48225a(i));
        if (string2 != null) {
            a.mo41126a(Base64.decode(string2, 0));
        }
        C25168p.m48272a().f59612a.mo41212a(a.mo41127a(), i2, new RunnableC25222f(this, jobParameters));
        return true;
    }
}
