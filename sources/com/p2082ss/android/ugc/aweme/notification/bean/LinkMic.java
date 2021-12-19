package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.LinkMic */
public final class LinkMic {
    @AbstractC27891c(mo46611a = "audience_id_list")
    public final List<Long> audienceIdList;
    @AbstractC27891c(mo46611a = "followed_count")
    public final int followedCount;
    @AbstractC27891c(mo46611a = "show_user_list")
    public final List<LiveUser> followedList;

    static {
        Covode.recordClassIndex(72607);
    }

    public LinkMic() {
        this(null, null, 0, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notification_bean_LinkMic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m112003x1f9b5013(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notification.bean.LinkMic */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkMic copy$default(LinkMic linkMic, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = linkMic.followedList;
        }
        if ((i2 & 2) != 0) {
            list2 = linkMic.audienceIdList;
        }
        if ((i2 & 4) != 0) {
            i = linkMic.followedCount;
        }
        return linkMic.copy(list, list2, i);
    }

    public final LinkMic copy(List<LiveUser> list, List<Long> list2, int i) {
        return new LinkMic(list, list2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkMic)) {
            return false;
        }
        LinkMic linkMic = (LinkMic) obj;
        return C89219l.m154714a(this.followedList, linkMic.followedList) && C89219l.m154714a(this.audienceIdList, linkMic.audienceIdList) && this.followedCount == linkMic.followedCount;
    }

    public final int hashCode() {
        List<LiveUser> list = this.followedList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Long> list2 = this.audienceIdList;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((hashCode + i) * 31) + m112003x1f9b5013(this.followedCount);
    }

    public final String toString() {
        return "LinkMic(followedList=" + this.followedList + ", audienceIdList=" + this.audienceIdList + ", followedCount=" + this.followedCount + ")";
    }

    public LinkMic(List<LiveUser> list, List<Long> list2, int i) {
        this.followedList = list;
        this.audienceIdList = list2;
        this.followedCount = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkMic(List list, List list2, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? 0 : i);
    }
}
