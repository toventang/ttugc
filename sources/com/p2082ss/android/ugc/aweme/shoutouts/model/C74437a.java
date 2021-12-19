package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.a */
public final class C74437a {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f167397a = -1;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f167398b = null;
    @AbstractC27891c(mo46611a = "rating_id")

    /* renamed from: c */
    public final String f167399c = null;

    static {
        Covode.recordClassIndex(87227);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74437a)) {
            return false;
        }
        C74437a aVar = (C74437a) obj;
        return this.f167397a == aVar.f167397a && C89219l.m154714a(this.f167398b, aVar.f167398b) && C89219l.m154714a(this.f167399c, aVar.f167399c);
    }

    public final int hashCode() {
        int i = this.f167397a * 31;
        String str = this.f167398b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f167399c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShoutoutsCreatePermissionCheckResp(statusCode=" + this.f167397a + ", statusMsg=" + this.f167398b + ", ratingId=" + this.f167399c + ")";
    }

    private C74437a() {
    }
}
