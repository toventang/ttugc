package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$searchUserService$2 */
public final class AtFriendsViewModel$searchUserService$2 extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {
    public static final AtFriendsViewModel$searchUserService$2 INSTANCE = new AtFriendsViewModel$searchUserService$2();

    static {
        Covode.recordClassIndex(60881);
    }

    AtFriendsViewModel$searchUserService$2() {
        super(0);
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final ISearchUserService invoke() {
        return SearchUserService.m119898b();
    }
}
