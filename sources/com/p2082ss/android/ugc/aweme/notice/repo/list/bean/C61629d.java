package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.d */
public final class C61629d {
    @AbstractC27891c(mo46611a = "aweme")

    /* renamed from: a */
    public final Aweme f139883a;
    @AbstractC27891c(mo46611a = "from_user")

    /* renamed from: b */
    public final User f139884b;

    static {
        Covode.recordClassIndex(72356);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61629d)) {
            return false;
        }
        C61629d dVar = (C61629d) obj;
        return C89219l.m154714a(this.f139883a, dVar.f139883a) && C89219l.m154714a(this.f139884b, dVar.f139884b);
    }

    public final int hashCode() {
        Aweme aweme = this.f139883a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        User user = this.f139884b;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DonationNotice(aweme=" + this.f139883a + ", user=" + this.f139884b + ")";
    }
}
