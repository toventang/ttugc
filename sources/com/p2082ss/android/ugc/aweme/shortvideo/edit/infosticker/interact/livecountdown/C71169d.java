package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.LiveCDEditStickerLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.sticker.C71211a;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d */
public final class C71169d {

    /* renamed from: c */
    public static final C71170a f159419c = new C71170a((byte) 0);

    /* renamed from: a */
    public VideoPublishEditModel f159420a;

    /* renamed from: b */
    public LiveCDEditStickerLayout f159421b;

    static {
        Covode.recordClassIndex(83675);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.d$a */
    public static final class C71170a {
        static {
            Covode.recordClassIndex(83676);
        }

        private C71170a() {
        }

        public /* synthetic */ C71170a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo112484a(boolean z) {
        String str;
        String str2;
        C71211a liveCDStickerController;
        C84425b a = new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("enter_method", "click_main_panel").mo129406a("shoot_way", this.f159420a.mShootWay).mo129406a("creation_id", this.f159420a.creationId).mo129406a("content_source", C70968bl.m125262b(this.f159420a)).mo129406a("content_type", C70968bl.m125249a(this.f159420a));
        LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159421b;
        if (liveCDEditStickerLayout == null || (liveCDStickerController = liveCDEditStickerLayout.getLiveCDStickerController()) == null) {
            str = null;
        } else {
            str = liveCDStickerController.f159573a;
        }
        C84425b a2 = a.mo129406a("prop_id", str);
        if (z) {
            str2 = "keep";
        } else {
            str2 = "discard";
        }
        C39162r.m79460a("livesdk_cd_sticker_cancel_confirm", a2.mo129406a("action_type", str2).f188764a);
    }

    /* renamed from: b */
    public final void mo112485b(boolean z) {
        String str;
        String str2;
        C71211a liveCDStickerController;
        C84425b a = new C84425b().mo129406a("creation_id", this.f159420a.creationId).mo129406a("enter_from", "video_edit_page");
        LiveCDEditStickerLayout liveCDEditStickerLayout = this.f159421b;
        if (liveCDEditStickerLayout == null || (liveCDStickerController = liveCDEditStickerLayout.getLiveCDStickerController()) == null) {
            str = null;
        } else {
            str = liveCDStickerController.f159573a;
        }
        C84425b a2 = a.mo129406a("prop_id", str).mo129406a("shoot_way", this.f159420a.mShootWay);
        if (z) {
            str2 = "click";
        } else {
            str2 = "draw";
        }
        C84425b a3 = a2.mo129406a("action_type", str2);
        C89219l.m154716b(a3, "");
        if (this.f159420a.draftId != 0) {
            a3.mo129403a("draft_id", this.f159420a.draftId);
        }
        if (!TextUtils.isEmpty(this.f159420a.newDraftId)) {
            a3.mo129406a("new_draft_id", this.f159420a.newDraftId);
        }
        C80322d.m139251a("prop_delete", a3.f188764a);
    }

    public C71169d(VideoPublishEditModel videoPublishEditModel, LiveCDEditStickerLayout liveCDEditStickerLayout) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f159420a = videoPublishEditModel;
        this.f159421b = liveCDEditStickerLayout;
    }
}
