package com.p2082ss.android.ugc.aweme.base.component;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.metrics.C59218am;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.base.component.a */
final /* synthetic */ class CallableC34538a implements Callable {

    /* renamed from: a */
    private final AnalysisActivityComponent f81552a;

    /* renamed from: b */
    private final long f81553b;

    static {
        Covode.recordClassIndex(41500);
    }

    CallableC34538a(AnalysisActivityComponent analysisActivityComponent, long j) {
        this.f81552a = analysisActivityComponent;
        this.f81553b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AbstractC33501c cVar;
        Analysis F;
        String str;
        AnalysisActivityComponent analysisActivityComponent = this.f81552a;
        long j = this.f81553b;
        if (!(analysisActivityComponent.f81536b == null || (cVar = analysisActivityComponent.f81536b.get()) == null || (F = cVar.mo59595F()) == null || TextUtils.isEmpty(F.getLabelName()))) {
            C29823c.m60081a(analysisActivityComponent.f81537c, "stay_time", F.getLabelName(), j, F.getExt_value());
            String str2 = "";
            if (F.getExt_json() != null) {
                str2 = F.getExt_json().getString("process_id");
                str = F.getExt_json().getString("challenge_id");
            } else {
                str = str2;
            }
            C59218am amVar = new C59218am();
            amVar.f134899a = String.valueOf(j);
            C59218am a = amVar.mo96758a(F.getLabelName());
            a.f134904p = str2;
            a.f134905q = str;
            a.mo96749g(AwemeService.m70060b().mo60684b(String.valueOf(F.getValue()))).mo96792f();
        }
        return null;
    }
}
