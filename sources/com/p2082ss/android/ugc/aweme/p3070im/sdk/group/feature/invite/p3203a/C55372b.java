package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.b */
public final class C55372b extends BaseResponse {
    @AbstractC27891c(mo46611a = "invite_id")

    /* renamed from: a */
    public String f126603a = null;
    @AbstractC27891c(mo46611a = "invite_url")

    /* renamed from: b */
    public String f126604b = null;
    @AbstractC27891c(mo46611a = "expired_at")

    /* renamed from: c */
    public Long f126605c = null;
    @AbstractC27891c(mo46611a = "group")

    /* renamed from: d */
    public C55371a f126606d = null;
    @AbstractC27891c(mo46611a = "error")

    /* renamed from: e */
    public C55373c f126607e = null;

    static {
        Covode.recordClassIndex(65137);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55372b)) {
            return false;
        }
        C55372b bVar = (C55372b) obj;
        return C89219l.m154714a(this.f126603a, bVar.f126603a) && C89219l.m154714a(this.f126604b, bVar.f126604b) && C89219l.m154714a(this.f126605c, bVar.f126605c) && C89219l.m154714a(this.f126606d, bVar.f126606d) && C89219l.m154714a(this.f126607e, bVar.f126607e);
    }

    public final int hashCode() {
        String str = this.f126603a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f126604b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.f126605c;
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        C55371a aVar = this.f126606d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C55373c cVar = this.f126607e;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "GroupInviteInfoModel(inviteId=" + this.f126603a + ", inviteUrl=" + this.f126604b + ", expiredAt=" + this.f126605c + ", groupInfo=" + this.f126606d + ", inviteError=" + this.f126607e + ")";
    }

    private C55372b() {
    }
}
