package com.p2082ss.android.ugc.aweme.account.login.authorize;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31604d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.h */
final /* synthetic */ class C31881h implements IAccountService.AbstractC31277g {

    /* renamed from: a */
    private final AuthorizeActivity f76180a;

    static {
        Covode.recordClassIndex(38625);
    }

    C31881h(AuthorizeActivity authorizeActivity) {
        this.f76180a = authorizeActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
    public final void onResult(int i, int i2, Object obj) {
        AuthorizeActivity authorizeActivity = this.f76180a;
        if (i == 9 && i2 == 1) {
            C31604d.m65915a(obj instanceof Bundle ? (Bundle) obj : new Bundle(), authorizeActivity, new C31882i(authorizeActivity));
        } else {
            new C79459a(authorizeActivity.getBaseContext()).mo123050a(R.string.bos).mo123053a();
        }
    }
}
