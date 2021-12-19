package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.WaveSideBar;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.d */
final /* synthetic */ class C32316d implements WaveSideBar.AbstractC32307a {

    /* renamed from: a */
    private final CountryListActivity f77096a;

    static {
        Covode.recordClassIndex(39084);
    }

    C32316d(CountryListActivity countryListActivity) {
        this.f77096a = countryListActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2267ui.WaveSideBar.AbstractC32307a
    /* renamed from: a */
    public final void mo58383a(String str) {
        CountryListActivity countryListActivity = this.f77096a;
        for (int i = 0; i < countryListActivity.f77044b.size(); i++) {
            if (TextUtils.equals(countryListActivity.f77044b.get(i).f76333b, str)) {
                ((LinearLayoutManager) countryListActivity.f77043a.getLayoutManager()).mo4347a(i, 0);
                return;
            }
        }
    }
}
