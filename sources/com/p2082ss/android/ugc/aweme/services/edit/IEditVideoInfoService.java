package com.p2082ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService */
public interface IEditVideoInfoService {
    static {
        Covode.recordClassIndex(79768);
    }

    VideoInfoData getVideoInfoData(String str);

    Long getVideoLength(String str);

    void setVideoInfoData(String str, VideoInfoData videoInfoData);

    void setVideoLength(String str, long j);
}
