package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.extract.C78519b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.r */
public final class C78559r {

    /* renamed from: a */
    public static final C78559r f176551a = new C78559r();

    private C78559r() {
    }

    static {
        Covode.recordClassIndex(91691);
    }

    /* renamed from: a */
    public static final C78519b m137157a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C78519b.C78520a aVar = new C78519b.C78520a();
        if (videoPublishEditModel.hasOriginalSound()) {
            aVar.mo122453a(EnumC78525c.RECORD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.hasRecord()) {
            aVar.mo122453a(EnumC78525c.EDIT_RECORD_SOUND);
        }
        String str = videoPublishEditModel.mMusicPath;
        if (!(str == null || str.length() == 0)) {
            aVar.mo122453a(EnumC78525c.MUSIC);
        }
        if (videoPublishEditModel.mOrigin == 0) {
            aVar.mo122453a(EnumC78525c.UPLOAD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.voiceVolume > 0.0f) {
            aVar.mo122453a(EnumC78525c.VOLUME_NOT_MUTE);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            aVar.mo122453a(EnumC78525c.EDIT_AUDIO_EFFECT);
        }
        return aVar.mo122454a();
    }
}
