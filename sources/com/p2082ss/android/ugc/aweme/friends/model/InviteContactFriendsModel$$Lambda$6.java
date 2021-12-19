package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$6 */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$6 implements Callable {
    private final InviteContactFriendsModel arg$1;
    private final InviteContactFriendsModel.IFetchShareConfigCallback arg$2;

    static {
        Covode.recordClassIndex(60898);
    }

    InviteContactFriendsModel$$Lambda$6(InviteContactFriendsModel inviteContactFriendsModel, InviteContactFriendsModel.IFetchShareConfigCallback iFetchShareConfigCallback) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = iFetchShareConfigCallback;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.arg$1.lambda$fetchShareConfig$7$InviteContactFriendsModel(this.arg$2);
    }
}
