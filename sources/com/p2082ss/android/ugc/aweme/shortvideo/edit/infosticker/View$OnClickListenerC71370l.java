package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.l */
public final /* synthetic */ class View$OnClickListenerC71370l implements View.OnClickListener {

    /* renamed from: a */
    private final C71056i f159948a;

    static {
        Covode.recordClassIndex(83895);
    }

    View$OnClickListenerC71370l(C71056i iVar) {
        this.f159948a = iVar;
    }

    public final void onClick(View view) {
        boolean z;
        ClickAgent.onClick(view);
        C71056i iVar = this.f159948a;
        iVar.f159122d.mo112170b();
        iVar.f159105L.clear();
        if (iVar.mo112258h()) {
            if (iVar.f159104K instanceof C71044aj) {
                z = ((C71044aj) iVar.f159104K).f159064m;
            } else {
                z = false;
            }
            C84425b a = new C84425b().mo129406a("prop_id", C71056i.m125479a(iVar.f159104K)).mo129406a("creation_id", iVar.f159139u.creationId).mo129406a("content_source", iVar.f159139u.getAvetParameter().getContentSource()).mo129406a("shoot_entrance", iVar.f159139u.mShootWay).mo129406a("enter_from", iVar.f159119a ? "edit_post_page" : "video_edit_page");
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            C84425b a2 = a.mo129403a("is_diy_prop", i);
            if (iVar.f159139u.draftId != 0) {
                a2.mo129403a("draft_id", iVar.f159139u.draftId);
            }
            if (!TextUtils.isEmpty(iVar.f159139u.newDraftId)) {
                a2.mo129406a("new_draft_id", iVar.f159139u.newDraftId);
            }
            C80322d.m139251a("prop_timeset_confirm", a2.f188764a);
        } else if (iVar.f159104K instanceof C46239q) {
            TextStickerData data = ((C46239q) iVar.f159104K).getData();
            boolean z2 = data != null && data.getHasReadTextAudio();
            VideoPublishEditModel videoPublishEditModel = iVar.f159139u;
            C89219l.m154721d(videoPublishEditModel, "");
            C39162r.m79460a("text_timeset_confirm", C70968bl.m125247a(videoPublishEditModel, false, z2, 2).f188764a);
        }
        iVar.mo112249a(false, (AbstractC45904h) null);
    }
}
