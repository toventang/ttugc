package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.cd */
public final class C80295cd {

    /* renamed from: a */
    public static final C80295cd f179816a = new C80295cd();

    private C80295cd() {
    }

    static {
        Covode.recordClassIndex(93563);
    }

    /* renamed from: a */
    public static final boolean m139202a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        ArrayList<TimeSpeedModelExtension> a = CameraComponentModel.m123137a(videoPublishEditModel.mVideoSegmentsDesc);
        if (a.isEmpty()) {
            return false;
        }
        C89219l.m154716b(a, "");
        for (T t : a) {
            C89219l.m154716b(t, "");
            if (t.isUploadTypeSticker()) {
                return true;
            }
        }
        return false;
    }
}
