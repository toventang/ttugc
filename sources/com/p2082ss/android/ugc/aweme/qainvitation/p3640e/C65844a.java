package com.p2082ss.android.ugc.aweme.qainvitation.p3640e;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.e.a */
public final class C65844a extends BaseResponse {
    @AbstractC27891c(mo46611a = "invite_id")

    /* renamed from: a */
    public final Integer f148385a;

    static {
        Covode.recordClassIndex(77345);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C65844a) && C89219l.m154714a(this.f148385a, ((C65844a) obj).f148385a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f148385a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InviteUsersData(uid=" + this.f148385a + ")";
    }

    private C65844a() {
        this.f148385a = null;
    }

    public /* synthetic */ C65844a(byte b) {
        this();
    }
}
