package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$4 */
public final /* synthetic */ class InviteContactFriendsModel$$Lambda$4 implements Comparator {
    static final Comparator $instance = new InviteContactFriendsModel$$Lambda$4();

    static {
        Covode.recordClassIndex(60896);
    }

    private InviteContactFriendsModel$$Lambda$4() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return InviteContactFriendsModel.lambda$sortWithContactIndex$4$InviteContactFriendsModel((InviteContactFriendsModel.ContactFriend) obj, (InviteContactFriendsModel.ContactFriend) obj2);
    }
}
