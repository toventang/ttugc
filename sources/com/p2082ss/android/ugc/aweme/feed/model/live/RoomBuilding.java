package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomBuilding */
public class RoomBuilding extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "activity_h5_url")
    public String activityH5Url;
    @AbstractC27891c(mo46611a = "activity_icon_url")
    public UrlModel activityIconUrl;
    @AbstractC27891c(mo46611a = "begin_time")
    public long beginTime;
    @AbstractC27891c(mo46611a = "end_time")
    public long endTime;
    @AbstractC27891c(mo46611a = "show_h5")
    public boolean showH5;
    @AbstractC27891c(mo46611a = "show_h5_url")
    public String showH5Url;

    static {
        Covode.recordClassIndex(58810);
    }
}
