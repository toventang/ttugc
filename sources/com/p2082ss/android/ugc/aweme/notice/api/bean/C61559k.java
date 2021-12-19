package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.k */
public final class C61559k {
    @AbstractC27891c(mo46611a = "groups")

    /* renamed from: a */
    public List<Integer> f139731a;
    @AbstractC27891c(mo46611a = "filter_type")

    /* renamed from: b */
    public int f139732b;

    /* renamed from: c */
    public int f139733c;

    static {
        Covode.recordClassIndex(72234);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61559k)) {
            return false;
        }
        C61559k kVar = (C61559k) obj;
        return C89219l.m154714a(this.f139731a, kVar.f139731a) && this.f139732b == kVar.f139732b && this.f139733c == kVar.f139733c;
    }

    public final int hashCode() {
        List<Integer> list = this.f139731a;
        return ((((list != null ? list.hashCode() : 0) * 31) + this.f139732b) * 31) + this.f139733c;
    }

    public final String toString() {
        return "NoticeInboxFilterGroups(groups=" + this.f139731a + ", filterType=" + this.f139732b + ", innerFilterType=" + this.f139733c + ")";
    }
}
