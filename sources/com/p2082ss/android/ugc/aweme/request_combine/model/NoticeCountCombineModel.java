package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.NoticeCountCombineModel */
public final class NoticeCountCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private NoticeList noticeList;

    static {
        Covode.recordClassIndex(78723);
    }

    public static /* synthetic */ NoticeCountCombineModel copy$default(NoticeCountCombineModel noticeCountCombineModel, NoticeList noticeList2, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeList2 = noticeCountCombineModel.noticeList;
        }
        return noticeCountCombineModel.copy(noticeList2);
    }

    public final NoticeList component1() {
        return this.noticeList;
    }

    public final NoticeCountCombineModel copy(NoticeList noticeList2) {
        C89219l.m154721d(noticeList2, "");
        return new NoticeCountCombineModel(noticeList2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NoticeCountCombineModel) && C89219l.m154714a(this.noticeList, ((NoticeCountCombineModel) obj).noticeList);
        }
        return true;
    }

    public final int hashCode() {
        NoticeList noticeList2 = this.noticeList;
        if (noticeList2 != null) {
            return noticeList2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "NoticeCountCombineModel(noticeList=" + this.noticeList + ")";
    }

    public final NoticeList getNoticeList() {
        return this.noticeList;
    }

    public final void setNoticeList(NoticeList noticeList2) {
        C89219l.m154721d(noticeList2, "");
        this.noticeList = noticeList2;
    }

    public NoticeCountCombineModel(NoticeList noticeList2) {
        C89219l.m154721d(noticeList2, "");
        this.noticeList = noticeList2;
    }
}
