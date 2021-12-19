package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct */
public class RoomFeedCellStruct implements Serializable {
    @AbstractC27891c(mo46611a = "deduplication_type")
    public int deduplicationType;
    @AbstractC27891c(mo46611a = "distance")
    public String distance;
    @AbstractC27891c(mo46611a = "icon")
    public UrlModel icon;
    @AbstractC27891c(mo46611a = "fans_struct")
    public FansStruct mFansStruct;
    @AbstractC27890b(mo46609a = StringJsonAdapterFactory.class)
    @AbstractC27891c(mo46611a = "rawdata")
    public NewLiveRoomStruct newLiveRoomData;
    @AbstractC27891c(mo46611a = "room")
    public LiveRoomStruct room;
    @AbstractC27891c(mo46611a = "tag")
    public String tag;
    @AbstractC27891c(mo46611a = "tag_id")
    public long tagId;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(58814);
    }

    public LiveRoomStruct getNewLiveRoomData() {
        try {
            if (LiveRoomStruct.isValid(this.room)) {
                return this.room;
            }
            NewLiveRoomStruct newLiveRoomStruct = this.newLiveRoomData;
            if (newLiveRoomStruct == null) {
                return null;
            }
            newLiveRoomStruct.init();
            LiveRoomStruct roomStructConstructor = this.newLiveRoomData.roomStructConstructor();
            this.room = roomStructConstructor;
            return roomStructConstructor;
        } catch (Exception unused) {
            return null;
        }
    }
}
