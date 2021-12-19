package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoMaskUtil */
public final class VideoMaskUtil {
    public static final VideoMaskUtil INSTANCE = new VideoMaskUtil();

    private VideoMaskUtil() {
    }

    static {
        Covode.recordClassIndex(58775);
    }

    public final VideoMaskInfo getMaskInfo(List<VideoMaskInfo> list, int i) {
        C89219l.m154721d(list, "");
        for (VideoMaskInfo videoMaskInfo : list) {
            Integer maskType = videoMaskInfo.getMaskType();
            if (maskType != null && maskType.intValue() == i) {
                return videoMaskInfo;
            }
        }
        return new VideoMaskInfo(null, null, null, null, null, null, 63, null);
    }
}
