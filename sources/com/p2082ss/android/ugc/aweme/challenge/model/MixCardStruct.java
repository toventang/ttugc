package com.p2082ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.MixCardStruct */
public final class MixCardStruct implements Serializable {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "aweme_info")
    private Aweme aweme;
    @AbstractC27891c(mo46611a = "room_info")
    private RoomStructV2 roomInfo;
    @AbstractC27891c(mo46611a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(42742);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.model.MixCardStruct$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(42743);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final RoomStructV2 getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isLive() {
        if (this.roomInfo != null) {
            return true;
        }
        return false;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setRoomInfo(RoomStructV2 roomStructV2) {
        this.roomInfo = roomStructV2;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
