package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.BindService$$Lambda$1 */
public final /* synthetic */ class BindService$$Lambda$1 implements IAccountService.AbstractC31277g {
    private final IAccountService.AbstractC31277g arg$1;

    static {
        Covode.recordClassIndex(79599);
    }

    BindService$$Lambda$1(IAccountService.AbstractC31277g gVar) {
        this.arg$1 = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        BindService.lambda$null$0$BindService(this.arg$1, i, i2, obj);
    }
}
