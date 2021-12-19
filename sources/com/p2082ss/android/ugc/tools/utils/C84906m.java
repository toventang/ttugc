package com.p2082ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.m */
public final class C84906m {
    static {
        Covode.recordClassIndex(98900);
    }

    /* renamed from: a */
    public static final C89378p<Integer, Integer> m145912a(VideoPublishEditModel videoPublishEditModel) {
        int i;
        C89219l.m154721d(videoPublishEditModel, "");
        int i2 = 0;
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i2 = videoPublishEditModel.videoCount;
            i = videoPublishEditModel.photoCount;
        } else {
            if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.getFrameSize() > 0) {
                i2 = videoPublishEditModel.extractFramesModel.getFrameSize();
            } else if (!(videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null)) {
                i = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
            }
            i = 0;
        }
        return new C89378p<>(Integer.valueOf(i2), Integer.valueOf(i));
    }
}
