package com.p2082ss.android.ugc.aweme.comment.barrage.p2487b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36305b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.b.e */
public final class C36311e extends C36315i {

    /* renamed from: a */
    public final User f85835a;

    /* renamed from: b */
    public final C36305b f85836b;

    /* renamed from: c */
    public final Set<String> f85837c;

    static {
        Covode.recordClassIndex(43588);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a, com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36315i
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        return aVar instanceof C36311e;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a, com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36315i
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar instanceof C36311e) {
            return C89219l.m154714a((Object) ((C36311e) aVar).f85835a.getUid(), (Object) this.f85835a.getUid());
        }
        return super.mo28109a(aVar);
    }

    public C36311e(User user, C36305b bVar, Set<String> set) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(set, "");
        this.f85835a = user;
        this.f85836b = bVar;
        this.f85837c = set;
    }
}
