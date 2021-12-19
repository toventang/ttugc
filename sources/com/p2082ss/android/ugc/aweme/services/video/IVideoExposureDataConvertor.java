package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.video.IVideoExposureDataConvertor */
public interface IVideoExposureDataConvertor {
    static {
        Covode.recordClassIndex(80016);
    }

    VideoExposureData converToExposureData(Object obj);
}
