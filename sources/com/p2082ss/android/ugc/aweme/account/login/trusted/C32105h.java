package com.p2082ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.h */
public final class C32105h {
    @AbstractC27891c(mo46611a = "cached_at")

    /* renamed from: a */
    public long f76601a;
    @AbstractC27891c(mo46611a = "sec_user_id")

    /* renamed from: b */
    public final String f76602b = null;
    @AbstractC27891c(mo46611a = "last_login_time")

    /* renamed from: c */
    public final Long f76603c = null;
    @AbstractC27891c(mo46611a = "screen_name")

    /* renamed from: d */
    public final String f76604d = null;
    @AbstractC27891c(mo46611a = "nick_name")

    /* renamed from: e */
    public final String f76605e = null;
    @AbstractC27891c(mo46611a = "login_info")

    /* renamed from: f */
    public final C32095c f76606f = null;
    @AbstractC27891c(mo46611a = "avatar_url")

    /* renamed from: g */
    public final String f76607g = null;

    static {
        Covode.recordClassIndex(38864);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32105h)) {
            return false;
        }
        C32105h hVar = (C32105h) obj;
        return C89219l.m154714a(this.f76602b, hVar.f76602b) && C89219l.m154714a(this.f76603c, hVar.f76603c) && C89219l.m154714a(this.f76604d, hVar.f76604d) && C89219l.m154714a(this.f76605e, hVar.f76605e) && C89219l.m154714a(this.f76606f, hVar.f76606f) && C89219l.m154714a(this.f76607g, hVar.f76607g);
    }

    public final int hashCode() {
        String str = this.f76602b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.f76603c;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.f76604d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76605e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C32095c cVar = this.f76606f;
        int hashCode5 = (hashCode4 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str4 = this.f76607g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "TrustedEnvUser(secUid=" + this.f76602b + ", lastLoginTimeInSeconds=" + this.f76603c + ", screenName=" + this.f76604d + ", nickname=" + this.f76605e + ", login_info=" + this.f76606f + ", avatarUrl=" + this.f76607g + ")";
    }

    private C32105h() {
    }
}
