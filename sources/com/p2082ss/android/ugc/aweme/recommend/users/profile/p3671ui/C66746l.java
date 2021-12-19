package com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.l */
public final class C66746l implements AbstractC12779c {

    /* renamed from: a */
    public final User f149939a;

    static {
        Covode.recordClassIndex(78315);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C66746l) && C89219l.m154714a(this.f149939a, ((C66746l) obj).f149939a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f149939a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "VerticalRecommendListInitData(user=" + this.f149939a + ")";
    }

    private /* synthetic */ C66746l() {
        this(null);
    }

    public C66746l(User user) {
        this.f149939a = user;
    }
}
