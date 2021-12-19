package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.vesdk.VERecordData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ab */
public final class C73937ab {
    static {
        Covode.recordClassIndex(86687);
    }

    /* renamed from: a */
    public static final void m130031a(VERecordData vERecordData) {
        C89219l.m154721d(vERecordData, "");
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f190794b) {
            String str = vERecordSegmentData.f190799b;
            if (str == null || str.length() == 0) {
                String str2 = C70638dj.f158102e + System.currentTimeMillis();
                C89219l.m154716b(vERecordSegmentData, "");
                TEVideoUtils.generateMuteWav(str2, 44100, 2, ((int) (vERecordSegmentData.f190809l - vERecordSegmentData.f190808k)) / 1000);
                vERecordSegmentData.f190799b = str2;
            }
        }
    }
}
