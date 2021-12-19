package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.RoomInfo */
public final class RoomInfo {
    @AbstractC27891c(mo46611a = "link_mic")
    public final LinkMic linkMic;
    @AbstractC27891c(mo46611a = "live_type_screenshot")
    public final Boolean liveTypeScreenshot;
    @AbstractC27891c(mo46611a = "live_type_social_live")
    public final Boolean liveTypeSocialLive;
    @AbstractC27891c(mo46611a = "owner_user_id")
    public final Long ownerUserId;
    @AbstractC27891c(mo46611a = "room_id")
    public final long roomId;
    @AbstractC27891c(mo46611a = "title")
    public final String title;
    @AbstractC27891c(mo46611a = StringSet.type)
    public final Integer type;

    static {
        Covode.recordClassIndex(72613);
    }

    public RoomInfo() {
        this(0, null, null, null, null, null, null, 127, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notification_bean_RoomInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m112006x1e9ff073(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ RoomInfo copy$default(RoomInfo roomInfo, long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = roomInfo.roomId;
        }
        if ((i & 2) != 0) {
            str = roomInfo.title;
        }
        if ((i & 4) != 0) {
            num = roomInfo.type;
        }
        if ((i & 8) != 0) {
            bool = roomInfo.liveTypeSocialLive;
        }
        if ((i & 16) != 0) {
            bool2 = roomInfo.liveTypeScreenshot;
        }
        if ((i & 32) != 0) {
            linkMic2 = roomInfo.linkMic;
        }
        if ((i & 64) != 0) {
            l = roomInfo.ownerUserId;
        }
        return roomInfo.copy(j, str, num, bool, bool2, linkMic2, l);
    }

    public final RoomInfo copy(long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic2, Long l) {
        return new RoomInfo(j, str, num, bool, bool2, linkMic2, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomInfo)) {
            return false;
        }
        RoomInfo roomInfo = (RoomInfo) obj;
        return this.roomId == roomInfo.roomId && C89219l.m154714a(this.title, roomInfo.title) && C89219l.m154714a(this.type, roomInfo.type) && C89219l.m154714a(this.liveTypeSocialLive, roomInfo.liveTypeSocialLive) && C89219l.m154714a(this.liveTypeScreenshot, roomInfo.liveTypeScreenshot) && C89219l.m154714a(this.linkMic, roomInfo.linkMic) && C89219l.m154714a(this.ownerUserId, roomInfo.ownerUserId);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notification_bean_RoomInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m112006x1e9ff073(this.roomId) * 31;
        String str = this.title;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_notification_bean_RoomInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.type;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.liveTypeSocialLive;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.liveTypeScreenshot;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LinkMic linkMic2 = this.linkMic;
        int hashCode5 = (hashCode4 + (linkMic2 != null ? linkMic2.hashCode() : 0)) * 31;
        Long l = this.ownerUserId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "RoomInfo(roomId=" + this.roomId + ", title=" + this.title + ", type=" + this.type + ", liveTypeSocialLive=" + this.liveTypeSocialLive + ", liveTypeScreenshot=" + this.liveTypeScreenshot + ", linkMic=" + this.linkMic + ", ownerUserId=" + this.ownerUserId + ")";
    }

    public RoomInfo(long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic2, Long l) {
        this.roomId = j;
        this.title = str;
        this.type = num;
        this.liveTypeSocialLive = bool;
        this.liveTypeScreenshot = bool2;
        this.linkMic = linkMic2;
        this.ownerUserId = l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomInfo(long j, String str, Integer num, Boolean bool, Boolean bool2, LinkMic linkMic2, Long l, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : bool, (i & 16) != 0 ? false : bool2, (i & 32) == 0 ? linkMic2 : null, (i & 64) != 0 ? 0L : l);
    }
}
