package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$fetchResourcesWithModelNames$1 */
public final class AlgorithmModelManager$fetchResourcesWithModelNames$1 implements AbstractC86796e<String[]> {
    final /* synthetic */ FetchResourcesListener $listener;

    static {
        Covode.recordClassIndex(95382);
    }

    AlgorithmModelManager$fetchResourcesWithModelNames$1(FetchResourcesListener fetchResourcesListener) {
        this.$listener = fetchResourcesListener;
    }

    public final void onSuccess(String[] strArr) {
        C89219l.m154719c(strArr, "");
        FetchResourcesListener fetchResourcesListener = this.$listener;
        if (fetchResourcesListener != null) {
            fetchResourcesListener.onSuccess();
        }
    }

    public final void onFail(String[] strArr, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        FetchResourcesListener fetchResourcesListener = this.$listener;
        if (fetchResourcesListener != null) {
            fetchResourcesListener.onFailed(eVar.f195758c);
        }
    }
}
