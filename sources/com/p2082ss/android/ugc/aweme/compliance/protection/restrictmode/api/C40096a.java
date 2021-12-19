package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.a */
public final class C40096a extends BaseResponse {
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: a */
    public final LogPbBean f94165a;

    static {
        Covode.recordClassIndex(47873);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C40096a) && C89219l.m154714a(this.f94165a, ((C40096a) obj).f94165a);
        }
        return true;
    }

    public final int hashCode() {
        LogPbBean logPbBean = this.f94165a;
        if (logPbBean != null) {
            return logPbBean.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "MinorSettingResp(logPb=" + this.f94165a + ")";
    }
}
