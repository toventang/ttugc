package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.b */
public final class C51597b extends BaseResponse {
    @AbstractC27891c(mo46611a = "inviter")

    /* renamed from: a */
    public final User f118903a = null;

    static {
        Covode.recordClassIndex(60872);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C51597b) && C89219l.m154714a(this.f118903a, ((C51597b) obj).f118903a);
        }
        return true;
    }

    public final int hashCode() {
        User user = this.f118903a;
        if (user != null) {
            return user.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InvitationInfo(inviter=" + this.f118903a + ")";
    }

    private C51597b() {
    }
}
