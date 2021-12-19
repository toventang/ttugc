package com.p2082ss.android.ugc.aweme.follow.widet;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.follow.widet.c */
public final /* synthetic */ class C51096c implements AbstractC89172b {

    /* renamed from: a */
    private final C51086a f117890a;

    /* renamed from: b */
    private final User f117891b;

    /* renamed from: c */
    private final int f117892c;

    static {
        Covode.recordClassIndex(60293);
    }

    C51096c(C51086a aVar, User user, int i) {
        this.f117890a = aVar;
        this.f117891b = user;
        this.f117892c = i;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C51086a aVar = this.f117890a;
        User user = this.f117891b;
        C51086a.AbstractC51088a aVar2 = aVar.f117881g;
        user.getFollowStatus();
        aVar2.mo70872c();
        aVar.mo86511c(user);
        return C89391z.f203057a;
    }
}
