package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$fetchResourcesWithModelNames$2 */
public final class AlgorithmModelManager$fetchResourcesWithModelNames$2<V> implements Callable<Void> {
    final /* synthetic */ int $businessId;
    final /* synthetic */ String[] $modelNames;
    final /* synthetic */ AlgorithmModelManager this$0;

    static {
        Covode.recordClassIndex(95383);
    }

    AlgorithmModelManager$fetchResourcesWithModelNames$2(AlgorithmModelManager algorithmModelManager, int i, String[] strArr) {
        this.this$0 = algorithmModelManager;
        this.$businessId = i;
        this.$modelNames = strArr;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.this$0.modelFetcher.fetchModels(this.$businessId, this.$modelNames);
        return null;
    }
}
