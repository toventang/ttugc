package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel$$Lambda$2 */
public final /* synthetic */ class ThirdPartyFriendModel$$Lambda$2 implements Callable {
    private final ThirdPartyFriendModel arg$1;
    private final AbstractC74739d arg$2;

    static {
        Covode.recordClassIndex(60932);
    }

    ThirdPartyFriendModel$$Lambda$2(ThirdPartyFriendModel thirdPartyFriendModel, AbstractC74739d dVar) {
        this.arg$1 = thirdPartyFriendModel;
        this.arg$2 = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.arg$1.lambda$uploadContacts$2$ThirdPartyFriendModel(this.arg$2);
    }
}
