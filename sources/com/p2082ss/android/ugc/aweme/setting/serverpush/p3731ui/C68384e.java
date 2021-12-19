package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.EnumC68374l;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68378a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.e */
final /* synthetic */ class C68384e implements AbstractC1214u {

    /* renamed from: a */
    private final C68378a f153068a;

    static {
        Covode.recordClassIndex(80613);
    }

    C68384e(C68378a aVar) {
        this.f153068a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C68378a aVar = this.f153068a;
        if (C68378a.C683802.f153064a[((EnumC68374l) obj).ordinal()] != 1) {
            aVar.f153045j.mo70127a(false);
            aVar.f153059y.mo70127a(false);
            aVar.f153060z.mo70127a(true);
            return;
        }
        aVar.f153045j.mo70127a(true);
        aVar.f153059y.mo70127a(true);
        aVar.f153060z.mo70127a(false);
        aVar.f153045j.mo108843b(aVar.getString(R.string.fom));
    }
}
