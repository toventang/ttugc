package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse */
public final class VideoResponse extends BaseNetResponse {
    private VideoItemInfo data;

    static {
        Covode.recordClassIndex(92132);
    }

    public final VideoItemInfo getData() {
        return this.data;
    }

    public final void setData(VideoItemInfo videoItemInfo) {
        this.data = videoItemInfo;
    }
}
