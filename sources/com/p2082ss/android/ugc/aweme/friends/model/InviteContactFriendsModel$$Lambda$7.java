package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.invite.C51542e;
import com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$7 */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$7 implements Runnable {
    private final InviteContactFriendsModel.IFetchShareConfigCallback arg$1;
    private final C51542e arg$2;

    static {
        Covode.recordClassIndex(60899);
    }

    InviteContactFriendsModel$$Lambda$7(InviteContactFriendsModel.IFetchShareConfigCallback iFetchShareConfigCallback, C51542e eVar) {
        this.arg$1 = iFetchShareConfigCallback;
        this.arg$2 = eVar;
    }

    public final void run() {
        InviteContactFriendsModel.lambda$null$6$InviteContactFriendsModel(this.arg$1, this.arg$2);
    }
}
