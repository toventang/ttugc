package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.g */
final /* synthetic */ class RunnableC71054g implements Runnable {

    /* renamed from: a */
    private final InfoStickerEditView f159092a;

    static {
        Covode.recordClassIndex(83552);
    }

    RunnableC71054g(InfoStickerEditView infoStickerEditView) {
        this.f159092a = infoStickerEditView;
    }

    public final void run() {
        InfoStickerEditView infoStickerEditView = this.f159092a;
        if (infoStickerEditView.f159004n != null && infoStickerEditView.f159004n.f159024a != null && infoStickerEditView.f159005o != -1 && infoStickerEditView.f159005o == 2) {
            C84425b a = new C84425b().mo129406a("creation_id", infoStickerEditView.f158999h.creationId).mo129406a("enter_from", infoStickerEditView.f159016z ? "edit_post_page" : "video_edit_page").mo129406a("prop_id", infoStickerEditView.f159004n.f159024a.f159054c.stickerId).mo129406a("shoot_way", infoStickerEditView.f158999h.mShootWay).mo129406a("enter_method", infoStickerEditView.f159004n.f159025b == 0 ? "finger_gesture" : "click_button");
            if (infoStickerEditView.f158999h.draftId != 0) {
                a.mo129403a("draft_id", infoStickerEditView.f158999h.draftId);
            }
            if (!TextUtils.isEmpty(infoStickerEditView.f158999h.newDraftId)) {
                a.mo129406a("new_draft_id", infoStickerEditView.f158999h.newDraftId);
            }
            C80322d.m139251a("prop_adjust", a.f188764a);
        }
    }
}
