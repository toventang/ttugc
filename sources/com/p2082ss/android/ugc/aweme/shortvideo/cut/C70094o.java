package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.o */
public final class C70094o {

    /* renamed from: a */
    public static final C70094o f156764a = new C70094o();

    private C70094o() {
    }

    static {
        Covode.recordClassIndex(82517);
    }

    /* renamed from: a */
    public static boolean m123774a(VideoSegment videoSegment) {
        if (videoSegment == null) {
            return false;
        }
        int i = videoSegment.f156714f;
        int i2 = videoSegment.f156715g;
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        if (i < 1080 && i2 < 1920) {
            return true;
        }
        if (i > 1080 || i2 > 1920 || videoSegment.mo110570a() >= 35) {
            return false;
        }
        return true;
    }
}
