package com.p2082ss.android.ugc.aweme.notification.redpoint;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.redpoint.e */
public final class C62220e extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: a */
    public List<NoticeList> f141236a = null;

    static {
        Covode.recordClassIndex(72987);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C62220e) && C89219l.m154714a(this.f141236a, ((C62220e) obj).f141236a);
        }
        return true;
    }

    public final int hashCode() {
        List<NoticeList> list = this.f141236a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MultiUserNoticeCountResponse(noticeLists=" + this.f141236a + ")";
    }

    private C62220e() {
    }
}
