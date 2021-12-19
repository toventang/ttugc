package com.p2082ss.android.ugc.aweme.qainvitation.p3640e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.e.b */
public final class C65845b extends BaseResponse {
    @AbstractC27891c(mo46611a = "inviters")

    /* renamed from: a */
    public final List<User> f148386a;
    @AbstractC27891c(mo46611a = "total_count")

    /* renamed from: b */
    public final Integer f148387b;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: c */
    public final Integer f148388c;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: d */
    public final Integer f148389d;

    static {
        Covode.recordClassIndex(77346);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65845b)) {
            return false;
        }
        C65845b bVar = (C65845b) obj;
        return C89219l.m154714a(this.f148386a, bVar.f148386a) && C89219l.m154714a(this.f148387b, bVar.f148387b) && C89219l.m154714a(this.f148388c, bVar.f148388c) && C89219l.m154714a(this.f148389d, bVar.f148389d);
    }

    public final int hashCode() {
        List<User> list = this.f148386a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f148387b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f148388c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f148389d;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InvitedYouUserListData(inviterList=" + this.f148386a + ", totalCount=" + this.f148387b + ", cursor=" + this.f148388c + ", hasMore=" + this.f148389d + ")";
    }

    private C65845b() {
        this.f148386a = null;
        this.f148387b = null;
        this.f148388c = null;
        this.f148389d = null;
    }

    public /* synthetic */ C65845b(byte b) {
        this();
    }
}
