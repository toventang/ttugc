package com.p2082ss.android.ugc.aweme.effect;

import android.app.job.JobParameters;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34506c;
import com.p2082ss.android.ugc.aweme.main.AbstractC59040ay;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.effect.f */
final /* synthetic */ class C46356f implements AbstractC1729g {

    /* renamed from: a */
    private final EffectCompatJobService f108051a;

    /* renamed from: b */
    private final JobParameters f108052b;

    static {
        Covode.recordClassIndex(54933);
    }

    C46356f(EffectCompatJobService effectCompatJobService, JobParameters jobParameters) {
        this.f108051a = effectCompatJobService;
        this.f108052b = jobParameters;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        EffectCompatJobService effectCompatJobService = this.f108051a;
        JobParameters jobParameters = this.f108052b;
        AbstractC59040ay ayVar = (AbstractC59040ay) C34506c.m70491a(effectCompatJobService, AbstractC59040ay.class);
        ayVar.mo60971a(System.currentTimeMillis());
        ayVar.mo60974b();
        effectCompatJobService.jobFinished(jobParameters, false);
        EffectCompatJobService.f107803b = false;
        return null;
    }
}
