package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.f */
public final class C73211f {

    /* renamed from: a */
    public static final C73211f f164424a = new C73211f();

    private C73211f() {
    }

    static {
        Covode.recordClassIndex(85929);
    }

    /* renamed from: a */
    public static final boolean m129264a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (!C70976bp.m125315k(videoPublishEditModel)) {
            return false;
        }
        if ((!videoPublishEditModel.hasOriginalAudio() || videoPublishEditModel.voiceVolume <= 0.0f) && !videoPublishEditModel.hasRecord()) {
            return false;
        }
        return true;
    }
}
