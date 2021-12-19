package com.p2082ss.android.ugc.aweme.follow.widet;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.follow.widet.g */
public final /* synthetic */ class C51100g implements AbstractC89172b {

    /* renamed from: a */
    private final C51086a f117901a;

    /* renamed from: b */
    private final User f117902b;

    static {
        Covode.recordClassIndex(60297);
    }

    C51100g(C51086a aVar, User user) {
        this.f117901a = aVar;
        this.f117902b = user;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C51086a aVar = this.f117901a;
        User user = this.f117902b;
        aVar.f117883i = false;
        C51086a.AbstractC51088a aVar2 = aVar.f117881g;
        user.getFollowStatus();
        aVar2.mo70871b();
        return C89391z.f203057a;
    }
}
