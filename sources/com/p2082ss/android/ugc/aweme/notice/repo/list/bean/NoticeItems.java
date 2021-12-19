package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems */
public final class NoticeItems {
    @AbstractC27891c(mo46611a = "group")
    private final int group;
    @AbstractC27891c(mo46611a = "has_more")
    private boolean hasMore;
    @AbstractC27891c(mo46611a = "notice_list")
    private List<? extends MusNotice> items;
    @AbstractC27891c(mo46611a = "last_read_time")
    private final long lastReadTime;
    @AbstractC27891c(mo46611a = "list_type")
    private final int listType;
    @AbstractC27891c(mo46611a = "max_time")
    private final long maxTime;
    @AbstractC27891c(mo46611a = "min_time")
    private final long minTime;
    @AbstractC27891c(mo46611a = "total")
    private final int total;

    static {
        Covode.recordClassIndex(72344);
    }

    public NoticeItems() {
        this(null, false, 0, 0, 0, 0, 0, 0, 255, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111642x3cdbfbd5(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111643x3cdbfbd5(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeItems copy$default(NoticeItems noticeItems, List list, boolean z, int i, long j, long j2, long j3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = noticeItems.items;
        }
        if ((i4 & 2) != 0) {
            z = noticeItems.hasMore;
        }
        if ((i4 & 4) != 0) {
            i = noticeItems.total;
        }
        if ((i4 & 8) != 0) {
            j = noticeItems.maxTime;
        }
        if ((i4 & 16) != 0) {
            j2 = noticeItems.minTime;
        }
        if ((i4 & 32) != 0) {
            j3 = noticeItems.lastReadTime;
        }
        if ((i4 & 64) != 0) {
            i2 = noticeItems.group;
        }
        if ((i4 & 128) != 0) {
            i3 = noticeItems.listType;
        }
        return noticeItems.copy(list, z, i, j, j2, j3, i2, i3);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
    public final List<MusNotice> component1() {
        return this.items;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final int component3() {
        return this.total;
    }

    public final long component4() {
        return this.maxTime;
    }

    public final long component5() {
        return this.minTime;
    }

    public final long component6() {
        return this.lastReadTime;
    }

    public final int component7() {
        return this.group;
    }

    public final int component8() {
        return this.listType;
    }

    public final NoticeItems copy(List<? extends MusNotice> list, boolean z, int i, long j, long j2, long j3, int i2, int i3) {
        return new NoticeItems(list, z, i, j, j2, j3, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeItems)) {
            return false;
        }
        NoticeItems noticeItems = (NoticeItems) obj;
        return C89219l.m154714a(this.items, noticeItems.items) && this.hasMore == noticeItems.hasMore && this.total == noticeItems.total && this.maxTime == noticeItems.maxTime && this.minTime == noticeItems.minTime && this.lastReadTime == noticeItems.lastReadTime && this.group == noticeItems.group && this.listType == noticeItems.listType;
    }

    public final int hashCode() {
        List<? extends MusNotice> list = this.items;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((((((((((((hashCode + i) * 31) + m111642x3cdbfbd5(this.total)) * 31) + m111643x3cdbfbd5(this.maxTime)) * 31) + m111643x3cdbfbd5(this.minTime)) * 31) + m111643x3cdbfbd5(this.lastReadTime)) * 31) + m111642x3cdbfbd5(this.group)) * 31) + m111642x3cdbfbd5(this.listType);
    }

    public final String toString() {
        return "NoticeItems(items=" + this.items + ", hasMore=" + this.hasMore + ", total=" + this.total + ", maxTime=" + this.maxTime + ", minTime=" + this.minTime + ", lastReadTime=" + this.lastReadTime + ", group=" + this.group + ", listType=" + this.listType + ")";
    }

    public final int getGroup() {
        return this.group;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
    public final List<MusNotice> getItems() {
        return this.items;
    }

    public final long getLastReadTime() {
        return this.lastReadTime;
    }

    public final int getListType() {
        return this.listType;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setItems(List<? extends MusNotice> list) {
        this.items = list;
    }

    public NoticeItems(List<? extends MusNotice> list, boolean z, int i, long j, long j2, long j3, int i2, int i3) {
        this.items = list;
        this.hasMore = z;
        this.total = i;
        this.maxTime = j;
        this.minTime = j2;
        this.lastReadTime = j3;
        this.group = i2;
        this.listType = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeItems(List list, boolean z, int i, long j, long j2, long j3, int i2, int i3, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : j, (i4 & 16) != 0 ? 0 : j2, (i4 & 32) == 0 ? j3 : 0, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) == 0 ? i3 : 0);
    }
}
