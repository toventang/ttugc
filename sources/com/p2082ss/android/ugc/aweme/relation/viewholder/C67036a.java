package com.p2082ss.android.ugc.aweme.relation.viewholder;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.user.repository.UserState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.relation.viewholder.a */
final /* synthetic */ class C67036a extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f150384a = new C67036a();

    static {
        Covode.recordClassIndex(78614);
    }

    C67036a() {
        super(UserState.class, "user", "getUser()Lcom/ss/android/ugc/aweme/profile/model/User;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((UserState) obj).getUser();
    }
}
