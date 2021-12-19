package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.n */
final /* synthetic */ class C32328n implements Comparator {

    /* renamed from: a */
    private final MusCountryListActivity f77116a;

    static {
        Covode.recordClassIndex(39096);
    }

    C32328n(MusCountryListActivity musCountryListActivity) {
        this.f77116a = musCountryListActivity;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MusCountryListActivity musCountryListActivity = this.f77116a;
        return musCountryListActivity.getResources().getString(((C31966a) obj).f76332a).compareTo(musCountryListActivity.getResources().getString(((C31966a) obj2).f76332a));
    }
}
