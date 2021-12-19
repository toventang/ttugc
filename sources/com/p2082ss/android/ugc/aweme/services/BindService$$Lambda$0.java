package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* renamed from: com.ss.android.ugc.aweme.services.BindService$$Lambda$0 */
final /* synthetic */ class BindService$$Lambda$0 implements IAccountService.AbstractC31277g {
    private final IAccountService.AbstractC31277g arg$1;
    private final Activity arg$2;
    private final String arg$3;
    private final String arg$4;

    static {
        Covode.recordClassIndex(79598);
    }

    BindService$$Lambda$0(IAccountService.AbstractC31277g gVar, Activity activity, String str, String str2) {
        this.arg$1 = gVar;
        this.arg$2 = activity;
        this.arg$3 = str;
        this.arg$4 = str2;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        BindService.lambda$bindMobileOrEmailAndSetPwd$1$BindService(this.arg$1, this.arg$2, this.arg$3, this.arg$4, i, i2, obj);
    }
}
