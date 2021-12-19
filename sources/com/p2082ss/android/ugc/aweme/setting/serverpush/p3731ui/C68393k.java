package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.EnumC68374l;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68386g;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.k */
final /* synthetic */ class C68393k implements AbstractC1214u {

    /* renamed from: a */
    private final C68386g f153117a;

    static {
        Covode.recordClassIndex(80622);
    }

    C68393k(C68386g gVar) {
        this.f153117a = gVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C68386g gVar = this.f153117a;
        if (C68386g.C683882.f153110a[((EnumC68374l) obj).ordinal()] != 1) {
            gVar.f153088c.mo70127a(false);
            gVar.f153104w.mo70127a(false);
            gVar.f153105y.mo70127a(true);
            return;
        }
        gVar.f153088c.mo70127a(true);
        gVar.f153104w.mo70127a(true);
        gVar.f153105y.mo70127a(false);
        gVar.f153088c.mo108843b(gVar.getString(R.string.fom));
    }
}
