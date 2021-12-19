package com.p2082ss.android.ugc.aweme.follow.widet;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.follow.widet.h */
final /* synthetic */ class C51101h implements AbstractC34543f {

    /* renamed from: a */
    private final C51086a f117903a;

    /* renamed from: b */
    private final User f117904b;

    static {
        Covode.recordClassIndex(60298);
    }

    C51101h(C51086a aVar, User user) {
        this.f117903a = aVar;
        this.f117904b = user;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: b */
    public final void mo57674b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
    /* renamed from: a */
    public final void mo57673a() {
        C51086a aVar = this.f117903a;
        User user = this.f117904b;
        if (C31575b.m65865g().isLogin()) {
            aVar.mo86510b(user);
        }
    }
}
