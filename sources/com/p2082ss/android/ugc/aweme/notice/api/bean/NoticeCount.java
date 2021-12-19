package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.NoticeCount */
public final class NoticeCount {
    @AbstractC27891c(mo46611a = "clear_occasion")
    private Integer clearOccasion;
    @AbstractC27891c(mo46611a = "count")
    private int count;
    @AbstractC27891c(mo46611a = "extra")
    private C61555g extra;
    @AbstractC27891c(mo46611a = "group")
    private int group;
    @AbstractC27891c(mo46611a = "show_type")
    private Integer showType;

    static {
        Covode.recordClassIndex(72220);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_api_bean_NoticeCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111471x3ab71c35(int i) {
        return i;
    }

    public static /* synthetic */ NoticeCount copy$default(NoticeCount noticeCount, int i, int i2, Integer num, Integer num2, C61555g gVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = noticeCount.count;
        }
        if ((i3 & 2) != 0) {
            i2 = noticeCount.group;
        }
        if ((i3 & 4) != 0) {
            num = noticeCount.showType;
        }
        if ((i3 & 8) != 0) {
            num2 = noticeCount.clearOccasion;
        }
        if ((i3 & 16) != 0) {
            gVar = noticeCount.extra;
        }
        return noticeCount.copy(i, i2, num, num2, gVar);
    }

    public final int component1() {
        return this.count;
    }

    public final int component2() {
        return this.group;
    }

    public final Integer component3() {
        return this.showType;
    }

    public final Integer component4() {
        return this.clearOccasion;
    }

    public final C61555g component5() {
        return this.extra;
    }

    public final NoticeCount copy(int i, int i2, Integer num, Integer num2, C61555g gVar) {
        return new NoticeCount(i, i2, num, num2, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeCount)) {
            return false;
        }
        NoticeCount noticeCount = (NoticeCount) obj;
        return this.count == noticeCount.count && this.group == noticeCount.group && C89219l.m154714a(this.showType, noticeCount.showType) && C89219l.m154714a(this.clearOccasion, noticeCount.clearOccasion) && C89219l.m154714a(this.extra, noticeCount.extra);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notice_api_bean_NoticeCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m111471x3ab71c35(this.count) * 31) + m111471x3ab71c35(this.group)) * 31;
        Integer num = this.showType;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_notice_api_bean_NoticeCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.clearOccasion;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        C61555g gVar = this.extra;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "NoticeCount(count=" + this.count + ", group=" + this.group + ", showType=" + this.showType + ", clearOccasion=" + this.clearOccasion + ", extra=" + this.extra + ")";
    }

    public final Integer getClearOccasion() {
        return this.clearOccasion;
    }

    public final int getCount() {
        return this.count;
    }

    public final C61555g getExtra() {
        return this.extra;
    }

    public final int getGroup() {
        return this.group;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final void setClearOccasion(Integer num) {
        this.clearOccasion = num;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setExtra(C61555g gVar) {
        this.extra = gVar;
    }

    public final void setGroup(int i) {
        this.group = i;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public NoticeCount(int i, int i2, Integer num, Integer num2, C61555g gVar) {
        this.count = i;
        this.group = i2;
        this.showType = num;
        this.clearOccasion = num2;
        this.extra = gVar;
    }
}
