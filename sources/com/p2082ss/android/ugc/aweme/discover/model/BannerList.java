package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.BannerList */
public final class BannerList extends BaseResponse implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "banner")
    public final List<Banner> items;
    @AbstractC27891c(mo46611a = "log_pb")
    public final LogPbBean logPb;
    public String requestId;

    static {
        Covode.recordClassIndex(50425);
    }

    public BannerList() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.BannerList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerList copy$default(BannerList bannerList, List list, LogPbBean logPbBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bannerList.items;
        }
        if ((i & 2) != 0) {
            logPbBean = bannerList.logPb;
        }
        if ((i & 4) != 0) {
            str = bannerList.requestId;
        }
        return bannerList.copy(list, logPbBean, str);
    }

    public final BannerList copy(List<? extends Banner> list, LogPbBean logPbBean, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        return new BannerList(list, logPbBean, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerList)) {
            return false;
        }
        BannerList bannerList = (BannerList) obj;
        return C89219l.m154714a(this.items, bannerList.items) && C89219l.m154714a(this.logPb, bannerList.logPb) && C89219l.m154714a(this.requestId, bannerList.requestId);
    }

    public final int hashCode() {
        List<Banner> list = this.items;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode2 = (hashCode + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31;
        String str = this.requestId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "BannerList(items=" + this.items + ", logPb=" + this.logPb + ", requestId=" + this.requestId + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final String getRequestId() {
        return this.requestId;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final void setRequestId(String str) {
        C89219l.m154721d(str, "");
        this.requestId = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerList(List<? extends Banner> list, LogPbBean logPbBean, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        this.items = list;
        this.logPb = logPbBean;
        this.requestId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BannerList(List list, LogPbBean logPbBean, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? C89086z.INSTANCE : list, (i & 2) != 0 ? null : logPbBean, (i & 4) != 0 ? "" : str);
    }
}
