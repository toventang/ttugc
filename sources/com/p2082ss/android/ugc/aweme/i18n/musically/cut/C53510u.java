package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53497n;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import p078c.p083d.C1762a;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.u */
final /* synthetic */ class C53510u implements C53497n.AbstractC53499a {

    /* renamed from: a */
    private final C53506t f122855a;

    static {
        Covode.recordClassIndex(63083);
    }

    C53510u(C53506t tVar) {
        this.f122855a = tVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53497n.AbstractC53499a
    /* renamed from: a */
    public final void mo90086a(MediaModel mediaModel) {
        C53506t tVar = this.f122855a;
        if (tVar.f122840i == null) {
            return;
        }
        if (!C84896h.f189732b || !C84896h.m145869b(mediaModel.f134662b)) {
            tVar.f122840i.onData(mediaModel.f134662b);
        } else {
            tVar.f122840i.onData(C1762a.m5918a(tVar.getContext(), C84896h.m145871d(mediaModel.f134662b)));
        }
    }
}
