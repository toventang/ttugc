package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* renamed from: com.ss.android.ugc.aweme.services.PasswordService$$Lambda$0 */
final /* synthetic */ class PasswordService$$Lambda$0 implements IAccountService.AbstractC31277g {
    private final Bundle arg$1;
    private final Activity arg$2;
    private final IAccountService.AbstractC31277g arg$3;

    static {
        Covode.recordClassIndex(79697);
    }

    PasswordService$$Lambda$0(Bundle bundle, Activity activity, IAccountService.AbstractC31277g gVar) {
        this.arg$1 = bundle;
        this.arg$2 = activity;
        this.arg$3 = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        PasswordService.lambda$changePassword$0$PasswordService(this.arg$1, this.arg$2, this.arg$3, i, i2, obj);
    }
}
