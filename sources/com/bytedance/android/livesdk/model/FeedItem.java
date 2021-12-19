package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public class FeedItem {
    public transient JSONObject adJSONObject;
    @AbstractC27891c(mo46611a = "banner")
    public C9897n bannerContainer;
    public transient List<C9594m> banners;
    @AbstractC27891c(mo46611a = "data")
    C28022o data;
    @AbstractC27891c(mo46611a = "debug_info")
    public String debugInfo;
    @AbstractC27891c(mo46611a = "is_recommend_card")
    public boolean isRecommendCard;
    public transient AbstractC9519af item;
    @AbstractC27891c(mo46611a = "live_reason")
    public String liveReason;
    public transient String logPb;
    public transient Object object;
    public transient boolean repeatDisable;
    @AbstractC27891c(mo46611a = "rid")
    public String resId;
    transient Room room;
    public transient String searchId = "";
    public transient String searchReqId = "";
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(11033);
    }

    public AbstractC9519af item() {
        return this.item;
    }

    public String logPb() {
        return this.logPb;
    }

    public String requestId() {
        return this.resId;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.item});
    }

    public String toString() {
        AbstractC9519af afVar = this.item;
        if (afVar == null) {
            return "null";
        }
        return afVar.toString();
    }

    public Room getRoom() {
        Room room2 = this.room;
        if (room2 != null) {
            return room2;
        }
        Room room3 = (Room) C4139e.C4140a.f11575b.mo46667a((AbstractC28019l) this.data, Room.class);
        this.room = room3;
        return room3;
    }

    public void init() {
        int i = this.type;
        if (i == 1 || i == 2 || i == 4 || i == 5) {
            this.item = getRoom();
        }
    }

    public void setRoom(Room room2) {
        this.room = room2;
    }

    public void setRoomFrom(FeedItem feedItem) {
        this.data = feedItem.data;
        this.room = feedItem.room;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC9519af afVar = this.item;
        AbstractC9519af afVar2 = ((FeedItem) obj).item;
        if (afVar == afVar2 || (afVar != null && afVar.equals(afVar2))) {
            return true;
        }
        return false;
    }

    public static FeedItem create(int i, AbstractC9519af afVar) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = afVar;
        return feedItem;
    }

    public static FeedItem create(int i, AbstractC9519af afVar, String str, String str2) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = afVar;
        feedItem.logPb = str;
        feedItem.resId = str2;
        return feedItem;
    }
}
