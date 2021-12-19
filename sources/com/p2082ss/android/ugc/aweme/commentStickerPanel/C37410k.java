package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.k */
public final class C37410k {

    /* renamed from: a */
    public final ShortVideoContext f88281a;

    /* renamed from: b */
    public final VideoPublishEditModel f88282b;

    /* renamed from: c */
    public final boolean f88283c;

    static {
        Covode.recordClassIndex(44791);
    }

    /* renamed from: a */
    public final C84425b mo65055a() {
        if (this.f88283c) {
            ShortVideoContext shortVideoContext = this.f88281a;
            if (shortVideoContext != null) {
                return new C84425b().mo129406a("shoot_way", shortVideoContext.f155831p).mo129406a("enter_from", "video_shoot_page").mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("user_id", C63244g.m114602a().mo73255A().mo93904c()).mo129406a("content_source", "shoot").mo129406a("content_type", "video");
            }
            return null;
        }
        VideoPublishEditModel videoPublishEditModel = this.f88282b;
        if (videoPublishEditModel != null) {
            return new C84425b().mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("enter_from", "video_edit_page").mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("user_id", C63244g.m114602a().mo73255A().mo93904c()).mo129406a("content_source", C71817eu.m126790a(videoPublishEditModel)).mo129406a("content_type", C71817eu.m126792c(videoPublishEditModel));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo65056a(int i) {
        VideoPublishEditModel videoPublishEditModel = this.f88282b;
        if (videoPublishEditModel != null) {
            C80322d.m139251a("replace_question_show", new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129403a(StringSet.type, i).f188764a);
        }
    }

    /* renamed from: a */
    public final void mo65057a(String str, int i) {
        C89219l.m154721d(str, "");
        VideoPublishEditModel videoPublishEditModel = this.f88282b;
        if (videoPublishEditModel != null) {
            C80322d.m139251a("replace_question_confirm", new C84425b().mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", videoPublishEditModel.mShootWay).mo129406a("target", str).mo129403a(StringSet.type, i).f188764a);
        }
    }

    private C37410k(ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, boolean z) {
        this.f88281a = shortVideoContext;
        this.f88282b = videoPublishEditModel;
        this.f88283c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37410k(ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        this((i & 1) != 0 ? null : shortVideoContext, (i & 2) != 0 ? null : videoPublishEditModel, z);
    }
}
