package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel$$Lambda$3 */
public final /* synthetic */ class ThirdPartyFriendModel$$Lambda$3 implements AbstractC1729g {
    private final ThirdPartyFriendModel arg$1;
    private final AbstractC74739d arg$2;

    static {
        Covode.recordClassIndex(60933);
    }

    ThirdPartyFriendModel$$Lambda$3(ThirdPartyFriendModel thirdPartyFriendModel, AbstractC74739d dVar) {
        this.arg$1 = thirdPartyFriendModel;
        this.arg$2 = dVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        return this.arg$1.lambda$uploadContacts$3$ThirdPartyFriendModel(this.arg$2, iVar);
    }
}
