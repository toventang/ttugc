package com.p2082ss.android.ugc.aweme.qainvitation.p3640e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.e.c */
public final class C65846c extends BaseResponse {
    @AbstractC27891c(mo46611a = "invitees")

    /* renamed from: a */
    public final List<User> f148390a;

    static {
        Covode.recordClassIndex(77347);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C65846c) && C89219l.m154714a(this.f148390a, ((C65846c) obj).f148390a);
        }
        return true;
    }

    public final int hashCode() {
        List<User> list = this.f148390a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InviteeListData(inviteeList=" + this.f148390a + ")";
    }

    private C65846c() {
        this.f148390a = null;
    }

    public /* synthetic */ C65846c(byte b) {
        this();
    }
}
