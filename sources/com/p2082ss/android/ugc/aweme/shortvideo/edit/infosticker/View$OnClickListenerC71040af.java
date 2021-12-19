package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3811d.C70985a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.af */
public final /* synthetic */ class View$OnClickListenerC71040af implements View.OnClickListener {

    /* renamed from: a */
    private final C71056i f159043a;

    static {
        Covode.recordClassIndex(83538);
    }

    View$OnClickListenerC71040af(C71056i iVar) {
        this.f159043a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C71056i iVar = this.f159043a;
        iVar.f159122d.mo112170b();
        iVar.f159105L.clear();
        C71044aj ajVar = (iVar.f159104K == null || !(iVar.f159104K instanceof C71044aj)) ? null : (C71044aj) iVar.f159104K;
        boolean z = false;
        if (ajVar != null) {
            C70985a aVar = iVar.f159108O;
            C89219l.m154721d(ajVar, "");
            aVar.f158888a = ajVar.f159054c.path;
            StickerItemModel stickerItemModel = ajVar.f159054c;
            C89219l.m154716b(stickerItemModel, "");
            aVar.f158889b = stickerItemModel.getId();
            aVar.f158891d = ajVar;
            aVar.f158897j.mo56311a(false);
            aVar.f158897j.mo56344c(aVar.f158896i);
            C70985a.AbstractC70986a aVar2 = aVar.f158892e;
            if (aVar2 != null) {
                aVar2.mo112118a();
            }
            z = ajVar.f159064m;
        }
        C84425b a = new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", iVar.f159139u.mShootWay).mo129406a("creation_id", iVar.f159139u.creationId).mo129406a("content_type", iVar.f159139u.getAvetParameter().getContentType()).mo129406a("content_source", iVar.f159139u.getAvetParameter().getContentSource()).mo129406a("prop_id", C71056i.m125479a(iVar.f159104K));
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        C80322d.m139251a("prop_pin_confirm", a.mo129403a("is_diy_prop", i).f188764a);
    }
}
