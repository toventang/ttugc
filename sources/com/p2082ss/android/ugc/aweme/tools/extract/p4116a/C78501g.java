package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.AbstractC78498e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.g */
public final class C78501g implements AbstractC78498e {
    static {
        Covode.recordClassIndex(91633);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.p4116a.AbstractC78498e
    /* renamed from: a */
    public final C89378p<Integer, String> mo122413a(VideoPublishEditModel videoPublishEditModel, int i) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (C78507ab.f176423a == null) {
            return C89387v.m154943a(1, "");
        }
        C78505j jVar = C78507ab.f176423a;
        if (jVar != null && !jVar.getCheckAudioFrame()) {
            return C89387v.m154943a(2, "");
        }
        C89219l.m154721d(videoPublishEditModel, "");
        if (!AbstractC78498e.C78499a.m137060a(videoPublishEditModel)) {
            return C89387v.m154943a(3, "output file:" + videoPublishEditModel.mOutputFile);
        }
        if (!C84902i.m145892a(videoPublishEditModel.mEncodedAudioOutputFile)) {
            return C89387v.m154943a(4, "auido file:" + videoPublishEditModel.mEncodedAudioOutputFile);
        }
        return C89387v.m154943a(-2, "");
    }
}
