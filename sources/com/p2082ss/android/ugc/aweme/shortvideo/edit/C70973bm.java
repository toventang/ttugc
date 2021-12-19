package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bm */
public final class C70973bm {
    static {
        Covode.recordClassIndex(83467);
    }

    /* renamed from: b */
    public static final boolean m125286b(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mVideoCanvasWidth == videoPublishEditModel.mOutVideoWidth && videoPublishEditModel.mVideoCanvasHeight == videoPublishEditModel.mOutVideoHeight) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m125284a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.mVideoCanvasWidth <= 0 || videoPublishEditModel.mVideoCanvasHeight <= 0) {
            return false;
        }
        if (videoPublishEditModel.mVideoCanvasWidth >= videoPublishEditModel.videoWidth() || videoPublishEditModel.mVideoCanvasHeight >= videoPublishEditModel.videoHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final float[] m125285a(float f, float f2, int i, int i2, int i3, int i4) {
        float f3 = (float) i3;
        float f4 = (float) i;
        float f5 = (f3 * 1.0f) / f4;
        float f6 = (float) i4;
        float f7 = (float) i2;
        float f8 = (1.0f * f6) / f7;
        if (f5 == f8) {
            return new float[]{f, f2};
        }
        float max = Math.max(f5, f8);
        if (max == f5) {
            f2 = (((f2 * f7) * max) - (((f7 * max) - f6) / 2.0f)) / f6;
        } else {
            f = (((f * f4) * max) - (((f4 * max) - f3) / 2.0f)) / f3;
        }
        return new float[]{f, f2};
    }
}
