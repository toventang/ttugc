package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* renamed from: com.ss.android.ugc.aweme.services.PasswordService$$Lambda$1 */
final /* synthetic */ class PasswordService$$Lambda$1 implements IAccountService.AbstractC31277g {
    private final PasswordService arg$1;
    private final Bundle arg$2;
    private final Activity arg$3;
    private final String arg$4;
    private final String arg$5;
    private final IAccountService.AbstractC31277g arg$6;

    static {
        Covode.recordClassIndex(79698);
    }

    PasswordService$$Lambda$1(PasswordService passwordService, Bundle bundle, Activity activity, String str, String str2, IAccountService.AbstractC31277g gVar) {
        this.arg$1 = passwordService;
        this.arg$2 = bundle;
        this.arg$3 = activity;
        this.arg$4 = str;
        this.arg$5 = str2;
        this.arg$6 = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        this.arg$1.lambda$changePassword$1$PasswordService(this.arg$2, this.arg$3, this.arg$4, this.arg$5, this.arg$6, i, i2, obj);
    }
}
