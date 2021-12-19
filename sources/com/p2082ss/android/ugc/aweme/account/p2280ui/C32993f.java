package com.p2082ss.android.ugc.aweme.account.p2280ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;

/* renamed from: com.ss.android.ugc.aweme.account.ui.f */
final /* synthetic */ class C32993f implements IAccountService.AbstractC31272b {

    /* renamed from: a */
    private final RecoverDeletedAccountActivity f78521a;

    static {
        Covode.recordClassIndex(39797);
    }

    C32993f(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f78521a = recoverDeletedAccountActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        RecoverDeletedAccountActivity recoverDeletedAccountActivity = this.f78521a;
        recoverDeletedAccountActivity.f78508i = false;
        C80273bt.m139146b(recoverDeletedAccountActivity.f78507h);
    }
}
