package com.p2082ss.android.ugc.aweme.account.p2251j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.account.j.c */
public final /* synthetic */ class C31703c implements AbstractC1729g {

    /* renamed from: a */
    private final boolean f75835a;

    /* renamed from: b */
    private final User f75836b;

    /* renamed from: c */
    private final long f75837c;

    /* renamed from: d */
    private final AbstractC34892bo.AbstractC34893a f75838d;

    static {
        Covode.recordClassIndex(38437);
    }

    public C31703c(boolean z, User user, long j, AbstractC34892bo.AbstractC34893a aVar) {
        this.f75835a = z;
        this.f75836b = user;
        this.f75837c = j;
        this.f75838d = aVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        boolean z = this.f75835a;
        User user = this.f75836b;
        long j = this.f75837c;
        AbstractC34892bo.AbstractC34893a aVar = this.f75838d;
        if (z || user.isUserCancelled()) {
            C31975q.m66348a(user.getUid(), 2592000000L + j, true);
        } else {
            C31975q.m66348a(user.getUid(), j, false);
        }
        C31975q.m66355b(user.getUid(), j);
        C31975q.m66344a(user);
        if (aVar != null) {
            aVar.mo61796a();
        }
        return iVar.mo5545d();
    }
}
