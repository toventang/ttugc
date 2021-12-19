package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31373a;

/* renamed from: com.ss.android.ugc.aweme.p */
final /* synthetic */ class C62751p implements IAccountService.AbstractC31277g {

    /* renamed from: a */
    private final Bundle f142237a;

    static {
        Covode.recordClassIndex(73573);
    }

    C62751p(Bundle bundle) {
        this.f142237a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        C31373a.C31374a.m65591a(this.f142237a);
    }
}
