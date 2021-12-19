package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ae */
public final /* synthetic */ class View$OnClickListenerC71039ae implements View.OnClickListener {

    /* renamed from: a */
    private final C71056i f159042a;

    static {
        Covode.recordClassIndex(83537);
    }

    View$OnClickListenerC71039ae(C71056i iVar) {
        this.f159042a = iVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C71056i iVar = this.f159042a;
        iVar.f159122d.mo112170b();
        iVar.mo112250a(false, (AbstractC45904h) null, false);
        C80322d.m139251a("prop_pin_cancel", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", iVar.f159139u.mShootWay).mo129406a("creation_id", iVar.f159139u.creationId).mo129406a("content_type", iVar.f159139u.getAvetParameter().getContentType()).mo129406a("content_source", iVar.f159139u.getAvetParameter().getContentSource()).mo129406a("prop_id", C71056i.m125479a(iVar.f159104K)).f188764a);
    }
}
