package com.p2082ss.android.ugc.aweme.discover.p2770e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.e.m */
public final class C41934m implements AbstractC81914b {

    /* renamed from: a */
    public final GlobalDoodleConfig f97813a;

    /* renamed from: b */
    public final LogPbBean f97814b;

    static {
        Covode.recordClassIndex(49860);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41934m)) {
            return false;
        }
        C41934m mVar = (C41934m) obj;
        return C89219l.m154714a(this.f97813a, mVar.f97813a) && C89219l.m154714a(this.f97814b, mVar.f97814b);
    }

    public final int hashCode() {
        GlobalDoodleConfig globalDoodleConfig = this.f97813a;
        int i = 0;
        int hashCode = (globalDoodleConfig != null ? globalDoodleConfig.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.f97814b;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchRequestSuccessConfigEvent(globalDoodleConfig=" + this.f97813a + ", logPb=" + this.f97814b + ")";
    }

    public C41934m(GlobalDoodleConfig globalDoodleConfig, LogPbBean logPbBean) {
        this.f97813a = globalDoodleConfig;
        this.f97814b = logPbBean;
    }
}
