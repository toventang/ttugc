package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.f */
public final class C78500f implements AbstractC78498e {
    static {
        Covode.recordClassIndex(91632);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.p4116a.AbstractC78498e
    /* renamed from: a */
    public final C89378p<Integer, String> mo122413a(VideoPublishEditModel videoPublishEditModel, int i) {
        C89219l.m154721d(videoPublishEditModel, "");
        int size = videoPublishEditModel.mvCreateVideoData.srcSelectMediaList.size();
        if (size == 0) {
            return C89387v.m154943a(12, "");
        }
        if (i == size) {
            return C89387v.m154943a(-1, "");
        }
        return C89387v.m154943a(12, "frame count:" + i + ", select size:" + size);
    }
}
