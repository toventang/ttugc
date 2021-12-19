package com.p2082ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.e */
final /* synthetic */ class C31544e implements AbstractC1729g {

    /* renamed from: a */
    private final C31541b f75443a;

    static {
        Covode.recordClassIndex(38262);
    }

    C31544e(C31541b bVar) {
        this.f75443a = bVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C31541b bVar = this.f75443a;
        if (!C80214ai.m139043a(iVar)) {
            return null;
        }
        C36085cj.f85262b.mo57069e().updateCurUser((User) iVar.mo5545d());
        return bVar.mData;
    }
}
