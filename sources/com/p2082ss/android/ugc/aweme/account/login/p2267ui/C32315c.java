package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32311b;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.c */
final /* synthetic */ class C32315c implements C32311b.AbstractC32314b {

    /* renamed from: a */
    private final CountryListActivity f77095a;

    static {
        Covode.recordClassIndex(39083);
    }

    C32315c(CountryListActivity countryListActivity) {
        this.f77095a = countryListActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32311b.AbstractC32314b
    /* renamed from: a */
    public final void mo58391a(C31966a aVar) {
        CountryListActivity countryListActivity = this.f77095a;
        if (aVar != null) {
            C31667a.m65985a(aVar);
            countryListActivity.onBackPressed();
        }
    }
}
