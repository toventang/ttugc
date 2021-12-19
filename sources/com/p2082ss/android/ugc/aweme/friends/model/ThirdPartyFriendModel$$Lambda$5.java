package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel$$Lambda$5 */
public final /* synthetic */ class ThirdPartyFriendModel$$Lambda$5 implements Callable {
    private final C1731i arg$1;

    static {
        Covode.recordClassIndex(60935);
    }

    private ThirdPartyFriendModel$$Lambda$5(C1731i iVar) {
        this.arg$1 = iVar;
    }

    static Callable get$Lambda(C1731i iVar) {
        return new ThirdPartyFriendModel$$Lambda$5(iVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.arg$1.mo5545d();
    }
}
