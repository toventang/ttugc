package com.p2082ss.android.ugc.gamora.editor.p4279f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.f.a */
public final class C82185a {

    /* renamed from: a */
    public static final C82185a f183867a = new C82185a();

    private C82185a() {
    }

    static {
        Covode.recordClassIndex(96013);
    }

    /* renamed from: a */
    public static final void m142209a(float f, float f2, VideoPublishEditModel videoPublishEditModel, AbstractC72510a aVar) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar, "");
        StitchParams stitchParams = videoPublishEditModel.stitchParams;
        if (stitchParams == null) {
            return;
        }
        if (!stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            int duration = (int) stitchParams.getDuration();
            int videoLength = videoPublishEditModel.getVideoLength();
            if (f2 != -1.0f) {
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f2, 0, duration, 1);
                C89219l.m154716b(ofVoice, "");
                aVar.mo114800a(ofVoice);
            }
            int i = duration + 100;
            VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(0.0f, duration, i, 3);
            C89219l.m154716b(ofVoice2, "");
            aVar.mo114800a(ofVoice2);
            if (f != -1.0f) {
                VEVolumeChangeOp ofVoice3 = VEVolumeChangeOp.ofVoice(f, i, videoLength, 2);
                C89219l.m154716b(ofVoice3, "");
                aVar.mo114800a(ofVoice3);
                return;
            }
            return;
        }
        if (f != -1.0f) {
            VEVolumeChangeOp ofVoice4 = VEVolumeChangeOp.ofVoice(f);
            C89219l.m154716b(ofVoice4, "");
            aVar.mo114800a(ofVoice4);
        }
        if (f2 != -1.0f) {
            VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f2);
            C89219l.m154716b(ofMusic, "");
            aVar.mo114800a(ofMusic);
        }
    }
}
