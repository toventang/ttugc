package com.p2082ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;

/* renamed from: com.ss.android.ugc.aweme.app.accountsdk.k */
public class C33586k implements IAccountService.AbstractC31277g {

    /* renamed from: a */
    private AbstractC34543f f79757a;

    static {
        Covode.recordClassIndex(40476);
    }

    public C33586k(AbstractC34543f fVar) {
        this.f79757a = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public void onResult(int i, int i2, Object obj) {
        AbstractC34543f fVar = this.f79757a;
        if (fVar != null && i == 1) {
            if (i2 == 1) {
                fVar.mo57673a();
            } else {
                fVar.mo57674b();
            }
        }
    }
}
