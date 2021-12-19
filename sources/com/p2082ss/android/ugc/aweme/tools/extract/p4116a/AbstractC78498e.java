package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.e */
public interface AbstractC78498e {
    static {
        Covode.recordClassIndex(91630);
    }

    /* renamed from: a */
    C89378p<Integer, String> mo122413a(VideoPublishEditModel videoPublishEditModel, int i);

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.e$a */
    public static final class C78499a {
        static {
            Covode.recordClassIndex(91631);
        }

        /* renamed from: a */
        public static boolean m137060a(VideoPublishEditModel videoPublishEditModel) {
            C89219l.m154721d(videoPublishEditModel, "");
            boolean a = C84902i.m145892a(videoPublishEditModel.getOutputFile());
            boolean a2 = C84902i.m145892a(videoPublishEditModel.mParallelUploadOutputFile);
            videoPublishEditModel.getOutputFile();
            if (a || a2) {
                return true;
            }
            return false;
        }
    }
}
