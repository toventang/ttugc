package com.p2082ss.android.ugc.aweme.relation.viewholder;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.user.repository.UserState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.relation.viewholder.b */
final /* synthetic */ class C67037b extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f150385a = new C67037b();

    static {
        Covode.recordClassIndex(78615);
    }

    C67037b() {
        super(UserState.class, "followStatus", "getFollowStatus()Lcom/bytedance/jedi/arch/Async;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((UserState) obj).getFollowStatus();
    }
}
