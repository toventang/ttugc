package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ab */
public final /* synthetic */ class C71036ab implements AbstractC78486c {

    /* renamed from: a */
    private final C71056i f159038a;

    static {
        Covode.recordClassIndex(83534);
    }

    public C71036ab(C71056i iVar) {
        this.f159038a = iVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4115e.AbstractC78486c
    /* renamed from: a */
    public final void mo87979a(Object obj) {
        C71056i iVar = this.f159038a;
        C71044aj ajVar = (C71044aj) obj;
        if ((!iVar.mo88019a() && !iVar.mo88021b()) || iVar.f159122d.f159003l != InfoStickerEditView.f158973m) {
            return;
        }
        if (iVar.mo88021b()) {
            iVar.mo112246a(ajVar, 1);
        } else {
            iVar.mo112245a((AbstractC45904h) ajVar);
        }
    }
}
