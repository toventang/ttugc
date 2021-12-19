package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas */
public final class NoticeCombineDatas {
    @AbstractC27891c(mo46611a = "follow_request")
    private final FollowRequest followRequest;
    @AbstractC27891c(mo46611a = "live_message")
    private List<CombineLiveNotice> liveNotices;
    @AbstractC27891c(mo46611a = "top_live")
    private C61637k recommendAvatars;
    @AbstractC27891c(mo46611a = "report_inbox")
    private final List<NoticeItems> reportNotice;
    @AbstractC27891c(mo46611a = "tiktok_shop_inbox")
    private final List<NoticeItems> shopNotice;

    static {
        Covode.recordClassIndex(72342);
    }

    public NoticeCombineDatas() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeCombineDatas copy$default(NoticeCombineDatas noticeCombineDatas, C61637k kVar, FollowRequest followRequest2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = noticeCombineDatas.recommendAvatars;
        }
        if ((i & 2) != 0) {
            followRequest2 = noticeCombineDatas.followRequest;
        }
        if ((i & 4) != 0) {
            list = noticeCombineDatas.liveNotices;
        }
        if ((i & 8) != 0) {
            list2 = noticeCombineDatas.shopNotice;
        }
        if ((i & 16) != 0) {
            list3 = noticeCombineDatas.reportNotice;
        }
        return noticeCombineDatas.copy(kVar, followRequest2, list, list2, list3);
    }

    public final C61637k component1() {
        return this.recommendAvatars;
    }

    public final FollowRequest component2() {
        return this.followRequest;
    }

    public final List<CombineLiveNotice> component3() {
        return this.liveNotices;
    }

    public final List<NoticeItems> component4() {
        return this.shopNotice;
    }

    public final List<NoticeItems> component5() {
        return this.reportNotice;
    }

    public final NoticeCombineDatas copy(C61637k kVar, FollowRequest followRequest2, List<CombineLiveNotice> list, List<NoticeItems> list2, List<NoticeItems> list3) {
        return new NoticeCombineDatas(kVar, followRequest2, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeCombineDatas)) {
            return false;
        }
        NoticeCombineDatas noticeCombineDatas = (NoticeCombineDatas) obj;
        return C89219l.m154714a(this.recommendAvatars, noticeCombineDatas.recommendAvatars) && C89219l.m154714a(this.followRequest, noticeCombineDatas.followRequest) && C89219l.m154714a(this.liveNotices, noticeCombineDatas.liveNotices) && C89219l.m154714a(this.shopNotice, noticeCombineDatas.shopNotice) && C89219l.m154714a(this.reportNotice, noticeCombineDatas.reportNotice);
    }

    public final int hashCode() {
        C61637k kVar = this.recommendAvatars;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        FollowRequest followRequest2 = this.followRequest;
        int hashCode2 = (hashCode + (followRequest2 != null ? followRequest2.hashCode() : 0)) * 31;
        List<CombineLiveNotice> list = this.liveNotices;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<NoticeItems> list2 = this.shopNotice;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<NoticeItems> list3 = this.reportNotice;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "NoticeCombineDatas(recommendAvatars=" + this.recommendAvatars + ", followRequest=" + this.followRequest + ", liveNotices=" + this.liveNotices + ", shopNotice=" + this.shopNotice + ", reportNotice=" + this.reportNotice + ")";
    }

    public final FollowRequest getFollowRequest() {
        return this.followRequest;
    }

    public final List<CombineLiveNotice> getLiveNotices() {
        return this.liveNotices;
    }

    public final C61637k getRecommendAvatars() {
        return this.recommendAvatars;
    }

    public final List<NoticeItems> getReportNotice() {
        return this.reportNotice;
    }

    public final List<NoticeItems> getShopNotice() {
        return this.shopNotice;
    }

    public final void setLiveNotices(List<CombineLiveNotice> list) {
        this.liveNotices = list;
    }

    public final void setRecommendAvatars(C61637k kVar) {
        this.recommendAvatars = kVar;
    }

    public NoticeCombineDatas(C61637k kVar, FollowRequest followRequest2, List<CombineLiveNotice> list, List<NoticeItems> list2, List<NoticeItems> list3) {
        this.recommendAvatars = kVar;
        this.followRequest = followRequest2;
        this.liveNotices = list;
        this.shopNotice = list2;
        this.reportNotice = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeCombineDatas(C61637k kVar, FollowRequest followRequest2, List list, List list2, List list3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : kVar, (i & 2) != 0 ? null : followRequest2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) == 0 ? list3 : null);
    }
}
