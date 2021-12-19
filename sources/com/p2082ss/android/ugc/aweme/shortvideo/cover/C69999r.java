package com.p2082ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.C69980b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.r */
final /* synthetic */ class C69999r implements AbstractC89171a {

    /* renamed from: a */
    private final C69980b.C699811 f156451a;

    /* renamed from: b */
    private final EffectTextModel f156452b;

    /* renamed from: c */
    private final VideoPublishEditModel f156453c;

    static {
        Covode.recordClassIndex(82413);
    }

    C69999r(C69980b.C699811 r1, EffectTextModel effectTextModel, VideoPublishEditModel videoPublishEditModel) {
        this.f156451a = r1;
        this.f156452b = effectTextModel;
        this.f156453c = videoPublishEditModel;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        C69980b.C699811 r6 = this.f156451a;
        EffectTextModel effectTextModel = this.f156452b;
        VideoPublishEditModel videoPublishEditModel = this.f156453c;
        if (effectTextModel.getTextSticker() == null || !effectTextModel.getHasCoverText()) {
            C69980b.this.f156418p.put(0, new EffectTextModel());
        } else {
            C69980b.this.f156418p.put(0, effectTextModel);
        }
        C69980b.this.f156417o.put(0, Float.valueOf(C69980b.this.f156403a.getVideoCoverViewX()));
        for (int i = 0; i <= 0; i++) {
            C69980b bVar = C69980b.this;
            VideoPublishEditModel c = bVar.f156414l.mo110438c();
            EffectTextModel effectTextModel2 = bVar.f156418p.get(0);
            EffectTextModel effectTextModel3 = c.getCoverPublishModel().getEffectTextModel();
            C89219l.m154721d(effectTextModel3, "");
            C89219l.m154721d(effectTextModel2, "");
            effectTextModel3.setHasCoverText(effectTextModel2.getHasCoverText());
            effectTextModel3.setTextSticker(effectTextModel2.getTextSticker());
            effectTextModel3.setCreateAwemeCoverInfo(effectTextModel2.getCreateAwemeCoverInfo());
            effectTextModel3.setCoverSelectedFrom(effectTextModel2.getCoverSelectedFrom());
            effectTextModel3.setCoverFrameIndex(effectTextModel2.getCoverFrameIndex());
        }
        C69980b bVar2 = C69980b.this;
        videoPublishEditModel.getCoverPublishModel().setVideoCoverViewX(bVar2.f156403a.getVideoCoverViewX());
        videoPublishEditModel.mVideoCoverStartTm = bVar2.f156416n / 1000.0f;
        if (videoPublishEditModel.isMvThemeVideoType()) {
            videoPublishEditModel.mvCreateVideoData.videoCoverStartTime = (int) bVar2.f156416n;
            bVar2.f156420r = ProgressDialogC84958b.m146021b(bVar2.getContext(), "");
            bVar2.f156420r.setIndeterminate(true);
            new C71993c(bVar2.f156414l.mo110436a(), videoPublishEditModel.mvCreateVideoData.videoCoverImgPath, videoPublishEditModel.mvCreateVideoData.videoCoverStartTime, new C69993l(videoPublishEditModel), C69994m.f156446a, new C69995n(bVar2));
        } else if (!videoPublishEditModel.isMultiVideoEdit() || !C71817eu.m126799j(videoPublishEditModel)) {
            bVar2.mo110427a();
        } else {
            bVar2.f156420r = ProgressDialogC84958b.m146021b(bVar2.getContext(), "");
            bVar2.f156420r.setIndeterminate(true);
            new C71993c(bVar2.f156414l.mo110436a(), videoPublishEditModel.multiEditVideoRecordData.coverImagePath, (int) bVar2.f156416n, new C69996o(videoPublishEditModel), C69997p.f156449a, new C69998q(bVar2));
        }
        return C89391z.f203057a;
    }
}
