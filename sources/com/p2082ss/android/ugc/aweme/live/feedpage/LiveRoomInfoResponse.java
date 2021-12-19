package com.p2082ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.LiveRoomInfoResponse */
public final class LiveRoomInfoResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")
    private NewLiveRoomStruct roomStruct;

    static {
        Covode.recordClassIndex(68915);
    }

    public final NewLiveRoomStruct getRoomStruct() {
        return this.roomStruct;
    }

    public final void setRoomStruct(NewLiveRoomStruct newLiveRoomStruct) {
        this.roomStruct = newLiveRoomStruct;
    }
}
