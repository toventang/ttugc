package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import java.util.concurrent.atomic.AtomicReference;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$2 */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$2 implements AbstractC1729g {
    private final InviteContactFriendsModel arg$1;
    private final AbstractC74739d arg$2;
    private final AtomicReference arg$3;

    static {
        Covode.recordClassIndex(60894);
    }

    InviteContactFriendsModel$$Lambda$2(InviteContactFriendsModel inviteContactFriendsModel, AbstractC74739d dVar, AtomicReference atomicReference) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = dVar;
        this.arg$3 = atomicReference;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        return this.arg$1.lambda$uploadContacts$2$InviteContactFriendsModel(this.arg$2, this.arg$3, iVar);
    }
}
