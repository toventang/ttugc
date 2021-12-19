package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.WaveSideBar;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.k */
final /* synthetic */ class C32325k implements WaveSideBar.AbstractC32307a {

    /* renamed from: a */
    private final MusCountryListActivity f77112a;

    static {
        Covode.recordClassIndex(39093);
    }

    C32325k(MusCountryListActivity musCountryListActivity) {
        this.f77112a = musCountryListActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.WaveSideBar.AbstractC32307a
    /* renamed from: a */
    public final void mo58383a(String str) {
        MusCountryListActivity musCountryListActivity = this.f77112a;
        for (int i = 0; i < musCountryListActivity.f77052b.size(); i++) {
            if (TextUtils.equals(musCountryListActivity.f77052b.get(i).f76333b, str)) {
                ((LinearLayoutManager) musCountryListActivity.f77051a.getLayoutManager()).mo4347a(i, 0);
                return;
            }
        }
    }
}
