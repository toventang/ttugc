package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32295x;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.services.TwoStepVerificationService$getSafeInfo$1 */
final class TwoStepVerificationService$getSafeInfo$1<TTaskResult, TContinuationResult> implements AbstractC1729g {
    public static final TwoStepVerificationService$getSafeInfo$1 INSTANCE = new TwoStepVerificationService$getSafeInfo$1();

    static {
        Covode.recordClassIndex(79736);
    }

    TwoStepVerificationService$getSafeInfo$1() {
    }

    @Override // p077b.AbstractC1729g
    public final C1731i<Boolean> then(C1731i<C32295x> iVar) {
        C32295x.C32296a data;
        boolean z = false;
        if (!C80214ai.m139043a(iVar)) {
            return C1731i.m5633a((Object) false);
        }
        C89219l.m154716b(iVar, "");
        C32295x d = iVar.mo5545d();
        if (!C89361p.m154872a("success", d.getMessage(), true) || (data = d.getData()) == null || data.getNew_notice() == null) {
            return C1731i.m5633a((Object) false);
        }
        if (d.getData().getNew_notice().intValue() > 0) {
            z = true;
        }
        return C1731i.m5633a(Boolean.valueOf(z));
    }
}
