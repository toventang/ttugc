package com.p2082ss.android.ugc.aweme.feed.p2957n;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.login.p3423a.C58954b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.feed.n.i */
public final class C49753i implements IAccountService.AbstractC31272b {
    static {
        Covode.recordClassIndex(58857);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 4 || i == 1) {
            AbstractC81915c.m141874a(new C58954b(false));
        }
    }
}
