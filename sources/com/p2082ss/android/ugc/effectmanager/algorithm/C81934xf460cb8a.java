package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.algorithm.ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$2 */
public final class C81934xf460cb8a<TTaskResult, TContinuationResult> implements AbstractC1729g<Boolean, Void> {
    final /* synthetic */ ModelInfo $response;
    final /* synthetic */ C81932xcfa9577c this$0;

    static {
        Covode.recordClassIndex(95407);
    }

    C81934xf460cb8a(C81932xcfa9577c modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1, ModelInfo modelInfo) {
        this.this$0 = modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1;
        this.$response = modelInfo;
    }

    @Override // p077b.AbstractC1729g
    public final Void then(C1731i<Boolean> iVar) {
        C89219l.m154709a((Object) iVar, "");
        if (iVar.mo5544c()) {
            EPLog.m141900e("ModelFetcher", "download model: " + this.this$0.$modelName + " failed!", iVar.mo5546e());
            AbstractC86796e eVar = this.this$0.$listener;
            if (eVar == null) {
                return null;
            }
            eVar.onFail(this.$response, new C86840e(iVar.mo5546e()));
            return null;
        } else if (C89219l.m154714a((Object) iVar.mo5545d(), (Object) true)) {
            AbstractC86796e eVar2 = this.this$0.$listener;
            if (eVar2 == null) {
                return null;
            }
            eVar2.onSuccess(this.$response);
            return null;
        } else {
            EPLog.m141899e("ModelFetcher", "download model: " + this.this$0.$modelName + " failed with null!");
            AbstractC86796e eVar3 = this.this$0.$listener;
            if (eVar3 == null) {
                return null;
            }
            eVar3.onFail(this.$response, new C86840e(10002));
            return null;
        }
    }
}
