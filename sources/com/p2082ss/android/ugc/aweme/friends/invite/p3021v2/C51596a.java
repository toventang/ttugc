package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.a */
public final class C51596a extends BaseResponse {
    @AbstractC27891c(mo46611a = "invitation_code")

    /* renamed from: a */
    public final String f118900a = null;
    @AbstractC27891c(mo46611a = "invitation_template")

    /* renamed from: b */
    public final String f118901b = null;
    @AbstractC27891c(mo46611a = "invitation_url")

    /* renamed from: c */
    public final String f118902c = null;

    static {
        Covode.recordClassIndex(60871);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51596a)) {
            return false;
        }
        C51596a aVar = (C51596a) obj;
        return C89219l.m154714a(this.f118900a, aVar.f118900a) && C89219l.m154714a(this.f118901b, aVar.f118901b) && C89219l.m154714a(this.f118902c, aVar.f118902c);
    }

    public final int hashCode() {
        String str = this.f118900a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f118901b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f118902c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InvitationConfig(code=" + this.f118900a + ", template=" + this.f118901b + ", invitationUrl=" + this.f118902c + ")";
    }

    private C51596a() {
    }

    /* renamed from: a */
    public final boolean mo87103a() {
        if (!C80538hl.m139614a(this.f118900a) || !C80538hl.m139614a(this.f118901b) || !C80538hl.m139614a(this.f118902c)) {
            return false;
        }
        return true;
    }
}
