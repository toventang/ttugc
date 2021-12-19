package com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.b */
public final class C69743b {

    /* renamed from: a */
    public static final C69743b f155868a = new C69743b();

    private C69743b() {
    }

    static {
        Covode.recordClassIndex(82149);
    }

    /* renamed from: a */
    public static Workspace m123265a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.isFastImport) {
            return C69744c.m123268a(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
        }
        if (C71413b.m126126c(videoPublishEditModel)) {
            return C69744c.m123268a(null, null, videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
        }
        return C69744c.m123268a(videoPublishEditModel.getContactVideoPathAsKey(), videoPublishEditModel.getContactAudioPathAsKey(), videoPublishEditModel.mMusicPath, videoPublishEditModel.reverseVideoPath());
    }
}
