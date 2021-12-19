package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.x */
public final /* synthetic */ class C71389x implements AbstractC0688a {

    /* renamed from: a */
    private final C71056i f159969a;

    /* renamed from: b */
    private final boolean f159970b;

    static {
        Covode.recordClassIndex(83917);
    }

    C71389x(C71056i iVar, boolean z) {
        this.f159969a = iVar;
        this.f159970b = z;
    }

    @Override // androidx.core.p036g.AbstractC0688a
    /* renamed from: a */
    public final void mo2720a(Object obj) {
        C71056i iVar = this.f159969a;
        boolean z = this.f159970b;
        boolean z2 = !z;
        iVar.f159122d.setVisibility(z2 ? 0 : 4);
        if (z2) {
            iVar.f159122d.mo112171c();
        }
        if (z) {
            iVar.f159122d.f159003l = InfoStickerEditView.f158973m;
            iVar.f159137s.mo56311a(true);
            return;
        }
        iVar.f159122d.f159003l = 0;
        iVar.f159138t.mo112195a().setValue(C88296t.m153438b(0));
        iVar.f159137s.mo56311a(true);
        iVar.f159138t.mo112195a().setValue(C88296t.m153435a());
    }
}
