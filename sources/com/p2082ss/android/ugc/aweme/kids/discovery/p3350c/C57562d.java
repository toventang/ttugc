package com.p2082ss.android.ugc.aweme.kids.discovery.p3350c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.c.d */
public final class C57562d extends BaseResponse {
    @AbstractC27891c(mo46611a = "aweme_details")

    /* renamed from: a */
    public List<? extends Aweme> f131406a = null;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public int f131407b = 0;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public int f131408c = 0;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: d */
    public LogPbBean f131409d = null;

    static {
        Covode.recordClassIndex(67516);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57562d)) {
            return false;
        }
        C57562d dVar = (C57562d) obj;
        return C89219l.m154714a(this.f131406a, dVar.f131406a) && this.f131407b == dVar.f131407b && this.f131408c == dVar.f131408c && C89219l.m154714a(this.f131409d, dVar.f131409d);
    }

    public final int hashCode() {
        List<? extends Aweme> list = this.f131406a;
        int i = 0;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.f131407b) * 31) + this.f131408c) * 31;
        LogPbBean logPbBean = this.f131409d;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "KDisocverDetailList(items=" + this.f131406a + ", cursor=" + this.f131407b + ", hasMore=" + this.f131408c + ", logPbBean=" + this.f131409d + ")";
    }

    private C57562d() {
    }
}
