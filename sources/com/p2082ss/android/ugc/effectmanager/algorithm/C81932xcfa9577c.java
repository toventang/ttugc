package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1 */
public final class C81932xcfa9577c implements AbstractC86796e<ModelInfo> {
    final /* synthetic */ boolean $downloadModelAfterFetch;
    final /* synthetic */ AbstractC86796e $listener;
    final /* synthetic */ String $modelName;
    final /* synthetic */ ModelFetcher this$0;

    static {
        Covode.recordClassIndex(95405);
    }

    public final void onSuccess(ModelInfo modelInfo) {
        C89219l.m154719c(modelInfo, "");
        if (this.$downloadModelAfterFetch) {
            EPLog.m141898d("ModelFetcher", "fetch model: " + this.$modelName + " info success!");
            C1731i.m5640b(new CallableC81933xf460cb89(this, modelInfo), C1731i.f5562a).mo5534a(new C81934xf460cb8a(this, modelInfo), C1731i.f5564c, null);
            return;
        }
        AbstractC86796e eVar = this.$listener;
        if (eVar != null) {
            eVar.onSuccess(modelInfo);
        }
    }

    public final void onFail(ModelInfo modelInfo, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        AbstractC86796e eVar2 = this.$listener;
        if (eVar2 != null) {
            eVar2.onFail(modelInfo, eVar);
        }
    }

    C81932xcfa9577c(ModelFetcher modelFetcher, AbstractC86796e eVar, boolean z, String str) {
        this.this$0 = modelFetcher;
        this.$listener = eVar;
        this.$downloadModelAfterFetch = z;
        this.$modelName = str;
    }
}
