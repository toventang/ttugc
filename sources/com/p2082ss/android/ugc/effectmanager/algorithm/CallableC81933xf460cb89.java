package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.algorithm.ModelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1$onSuccess$1 */
public final class CallableC81933xf460cb89<V> implements Callable<TResult> {
    final /* synthetic */ ModelInfo $response;
    final /* synthetic */ C81932xcfa9577c this$0;

    static {
        Covode.recordClassIndex(95406);
    }

    CallableC81933xf460cb89(C81932xcfa9577c modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1, ModelInfo modelInfo) {
        this.this$0 = modelFetcher$fetchModelByNameDirectlyFromServer$wrappedListener$1;
        this.$response = modelInfo;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.p2082ss.android.ugc.effectmanager.model.ModelInfo(this.$response));
        return this.this$0.this$0.downloadAndUpdateModelList(null, arrayList, null).get(this.$response.getName());
    }
}
