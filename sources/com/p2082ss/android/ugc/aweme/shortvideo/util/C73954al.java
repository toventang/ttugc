package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.al */
public final class C73954al {
    static {
        Covode.recordClassIndex(86704);
    }

    /* renamed from: a */
    public static final boolean m130048a(VideoSegment videoSegment) {
        C89219l.m154721d(videoSegment, "");
        try {
            if (C73950ak.m130042a(Math.min(videoSegment.f156714f, videoSegment.f156715g), Math.max(videoSegment.f156714f, videoSegment.f156715g), videoSegment.mo110570a()).getFirst().intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C73991bj.m130131b(e.getMessage());
            return false;
        }
    }
}
