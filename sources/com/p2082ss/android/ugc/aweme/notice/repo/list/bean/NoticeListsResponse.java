package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse */
public final class NoticeListsResponse extends BaseResponse {
    private transient List<NoticeItems> collapseNotices;
    @AbstractC27891c(mo46611a = "log_pb")
    private final LogPbBean lobPb;
    @AbstractC27891c(mo46611a = "notice_lists")
    private List<NoticeItems> notices;

    static {
        Covode.recordClassIndex(72345);
    }

    public NoticeListsResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeListsResponse copy$default(NoticeListsResponse noticeListsResponse, List list, List list2, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = noticeListsResponse.notices;
        }
        if ((i & 2) != 0) {
            list2 = noticeListsResponse.collapseNotices;
        }
        if ((i & 4) != 0) {
            logPbBean = noticeListsResponse.lobPb;
        }
        return noticeListsResponse.copy(list, list2, logPbBean);
    }

    public final List<NoticeItems> component1() {
        return this.notices;
    }

    public final List<NoticeItems> component2() {
        return this.collapseNotices;
    }

    public final LogPbBean component3() {
        return this.lobPb;
    }

    public final NoticeListsResponse copy(List<NoticeItems> list, List<NoticeItems> list2, LogPbBean logPbBean) {
        return new NoticeListsResponse(list, list2, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeListsResponse)) {
            return false;
        }
        NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
        return C89219l.m154714a(this.notices, noticeListsResponse.notices) && C89219l.m154714a(this.collapseNotices, noticeListsResponse.collapseNotices) && C89219l.m154714a(this.lobPb, noticeListsResponse.lobPb);
    }

    public final int hashCode() {
        List<NoticeItems> list = this.notices;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<NoticeItems> list2 = this.collapseNotices;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.lobPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NoticeListsResponse(notices=" + this.notices + ", collapseNotices=" + this.collapseNotices + ", lobPb=" + this.lobPb + ")";
    }

    public final List<NoticeItems> getCollapseNotices() {
        return this.collapseNotices;
    }

    public final LogPbBean getLobPb() {
        return this.lobPb;
    }

    public final List<NoticeItems> getNotices() {
        return this.notices;
    }

    public final void setCollapseNotices(List<NoticeItems> list) {
        this.collapseNotices = list;
    }

    public final void setNotices(List<NoticeItems> list) {
        this.notices = list;
    }

    public NoticeListsResponse(List<NoticeItems> list, List<NoticeItems> list2, LogPbBean logPbBean) {
        this.notices = list;
        this.collapseNotices = list2;
        this.lobPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeListsResponse(List list, List list2, LogPbBean logPbBean, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : logPbBean);
    }
}
