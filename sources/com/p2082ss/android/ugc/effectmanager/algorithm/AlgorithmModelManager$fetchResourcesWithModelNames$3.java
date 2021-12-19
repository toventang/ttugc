package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$fetchResourcesWithModelNames$3 */
public final class AlgorithmModelManager$fetchResourcesWithModelNames$3<TTaskResult, TContinuationResult> implements AbstractC1729g<TResult, TContinuationResult> {
    final /* synthetic */ FetchResourcesListener $listener;

    static {
        Covode.recordClassIndex(95384);
    }

    AlgorithmModelManager$fetchResourcesWithModelNames$3(FetchResourcesListener fetchResourcesListener) {
        this.$listener = fetchResourcesListener;
    }

    @Override // p077b.AbstractC1729g
    public final Void then(C1731i<Void> iVar) {
        C89219l.m154709a((Object) iVar, "");
        if (iVar.mo5544c()) {
            FetchResourcesListener fetchResourcesListener = this.$listener;
            if (fetchResourcesListener == null) {
                return null;
            }
            fetchResourcesListener.onFailed(iVar.mo5546e());
            return null;
        }
        FetchResourcesListener fetchResourcesListener2 = this.$listener;
        if (fetchResourcesListener2 == null) {
            return null;
        }
        fetchResourcesListener2.onSuccess();
        return null;
    }
}
