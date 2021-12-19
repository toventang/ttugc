package com.bytedance.android.livesdkapi.depend.model.report;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.report.a */
public final class C11747a implements AbstractC2724b<ReportCommitData> {
    static {
        Covode.recordClassIndex(13437);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ ReportCommitData mo7304a(C2730f fVar) {
        ReportCommitData reportCommitData = new ReportCommitData();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return reportCommitData;
            } else if (b == 1) {
                reportCommitData.status = fVar.mo7314f();
            } else if (b == 2) {
                reportCommitData.desc = fVar.mo7312d();
            } else if (b == 3) {
                reportCommitData.reportId = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                reportCommitData.recordId = fVar.mo7314f();
            }
        }
    }
}
