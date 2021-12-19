package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.AbstractC78498e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.h */
public final class C78502h implements AbstractC78498e {
    static {
        Covode.recordClassIndex(91634);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.p4116a.AbstractC78498e
    /* renamed from: a */
    public final C89378p<Integer, String> mo122413a(VideoPublishEditModel videoPublishEditModel, int i) {
        String str;
        C89219l.m154721d(videoPublishEditModel, "");
        if (C78507ab.f176423a == null) {
            return C89387v.m154943a(1, "");
        }
        C78505j jVar = C78507ab.f176423a;
        if (jVar != null && !jVar.getCheckVideoFrame()) {
            return C89387v.m154943a(2, "");
        }
        ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
        String str2 = null;
        if (extractFramesModel != null) {
            str = extractFramesModel.getExtractFramesDir();
        } else {
            str = null;
        }
        if (!C84902i.m145892a(str)) {
            StringBuilder sb = new StringBuilder("frame dir:");
            ExtractFramesModel extractFramesModel2 = videoPublishEditModel.extractFramesModel;
            if (extractFramesModel2 != null) {
                str2 = extractFramesModel2.getExtractFramesDir();
            }
            return C89387v.m154943a(8, sb.append(str2).toString());
        }
        C89219l.m154721d(videoPublishEditModel, "");
        if (!AbstractC78498e.C78499a.m137060a(videoPublishEditModel)) {
            return C89387v.m154943a(3, "output file:" + videoPublishEditModel.mOutputFile);
        }
        return C89387v.m154943a(-2, "");
    }
}
