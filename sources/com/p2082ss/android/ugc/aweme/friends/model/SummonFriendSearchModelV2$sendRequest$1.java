package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendSearchModelV2$sendRequest$1 */
final class SummonFriendSearchModelV2$sendRequest$1<V> implements Callable {
    final /* synthetic */ C67681g $request;
    final /* synthetic */ SummonFriendSearchModelV2 this$0;

    static {
        Covode.recordClassIndex(60926);
    }

    SummonFriendSearchModelV2$sendRequest$1(SummonFriendSearchModelV2 summonFriendSearchModelV2, C67681g gVar) {
        this.this$0 = summonFriendSearchModelV2;
        this.$request = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.this$0.getSearchUserService().mo106818b(this.$request);
    }
}
