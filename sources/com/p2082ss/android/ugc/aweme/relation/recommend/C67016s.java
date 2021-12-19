package com.p2082ss.android.ugc.aweme.relation.recommend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.s */
final /* synthetic */ class C67016s extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f150345a = new C67016s();

    static {
        Covode.recordClassIndex(78593);
    }

    C67016s() {
        super(SocialRecRequestState.class, "friends", "getFriends()Lcom/ss/android/ugc/aweme/friends/model/FriendList;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((SocialRecRequestState) obj).getFriends();
    }
}
