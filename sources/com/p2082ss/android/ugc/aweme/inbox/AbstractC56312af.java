package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.af */
public abstract class AbstractC56312af extends AbstractC56310ad {

    /* renamed from: a */
    public final User f128464a;

    /* renamed from: b */
    public final String f128465b;

    static {
        Covode.recordClassIndex(66130);
    }

    public int hashCode() {
        return this.f128464a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56311ae)) {
            return false;
        }
        return C89219l.m154714a((Object) this.f128464a.getUid(), (Object) ((AbstractC56312af) obj).f128464a.getUid());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC56312af(User user, String str, int i) {
        super(i);
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        this.f128464a = user;
        this.f128465b = str;
    }
}
