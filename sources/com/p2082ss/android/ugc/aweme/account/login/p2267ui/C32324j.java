package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32319g;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.j */
final /* synthetic */ class C32324j implements C32319g.AbstractC32321b {

    /* renamed from: a */
    private final MusCountryListActivity f77111a;

    static {
        Covode.recordClassIndex(39092);
    }

    C32324j(MusCountryListActivity musCountryListActivity) {
        this.f77111a = musCountryListActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32319g.AbstractC32321b
    /* renamed from: a */
    public final void mo58394a(C31966a aVar) {
        MusCountryListActivity musCountryListActivity = this.f77111a;
        if (aVar != null) {
            C31667a.m65985a(aVar);
            if (MusCountryListActivity.f77050g != null) {
                MusCountryListActivity.f77050g.onChanged(aVar.f76335d, aVar.f76334c);
            }
            musCountryListActivity.onBackPressed();
        }
    }
}
