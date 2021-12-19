package com.p2082ss.android.ugc.aweme.services;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32176a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.util.HashMap;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.services.TwoStepVerificationService$getTwoStepVerificationStatusFromNetwork$1 */
final class C67877xa85d9220<TTaskResult, TContinuationResult> implements AbstractC1729g {
    final /* synthetic */ TwoStepVerificationService this$0;

    static {
        Covode.recordClassIndex(79737);
    }

    C67877xa85d9220(TwoStepVerificationService twoStepVerificationService) {
        this.this$0 = twoStepVerificationService;
    }

    @Override // p077b.AbstractC1729g
    public final C1731i<Boolean> then(C1731i<C32176a> iVar) {
        if (!C80214ai.m139043a(iVar)) {
            if (this.this$0.getResponse().get(C36085cj.m73548b()) != null) {
                this.this$0.getResponse().remove(C36085cj.m73548b());
            }
            return C1731i.m5633a((Object) null);
        }
        C89219l.m154716b(iVar, "");
        C32176a d = iVar.mo5545d();
        if (!C89361p.m154872a("success", d.getMessage(), true) || d.getData() == null) {
            if (this.this$0.getResponse().get(C36085cj.m73548b()) != null) {
                this.this$0.getResponse().remove(C36085cj.m73548b());
            }
            return C1731i.m5633a((Object) null);
        }
        HashMap<String, C32176a> response = this.this$0.getResponse();
        String b = C36085cj.m73548b();
        C89219l.m154716b(b, "");
        C89219l.m154716b(d, "");
        response.put(b, d);
        this.this$0.setTwoStepVerificationResponseToCache(d);
        return C1731i.m5633a(Boolean.valueOf(!TextUtils.isEmpty(d.getData().getDefault_verify_way())));
    }
}
