package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bo */
public final class C70975bo {
    static {
        Covode.recordClassIndex(83469);
    }

    /* renamed from: a */
    public static final PublishOutput m125296a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        return new PublishOutput(videoPublishEditModel.creationId, videoPublishEditModel.getContactVideoPathAsKey(), videoPublishEditModel.musicId, videoPublishEditModel.isCommercialMusic(), videoPublishEditModel.isOriginalSound());
    }

    /* renamed from: a */
    public static final boolean m125297a(BaseShortVideoContext baseShortVideoContext) {
        C89219l.m154721d(baseShortVideoContext, "");
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || ((long) baseShortVideoContext.getVideoLength()) <= 61000) {
            return false;
        }
        return true;
    }
}
