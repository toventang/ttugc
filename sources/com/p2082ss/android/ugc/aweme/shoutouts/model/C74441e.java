package com.p2082ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.model.e */
public final class C74441e {
    @AbstractC27891c(mo46611a = "rating_id")

    /* renamed from: a */
    public final String f167407a;
    @AbstractC27891c(mo46611a = "rating_value")

    /* renamed from: b */
    public final int f167408b;
    @AbstractC27891c(mo46611a = "rating_text")

    /* renamed from: c */
    public final String f167409c;
    @AbstractC27891c(mo46611a = "uid")

    /* renamed from: d */
    public final String f167410d;
    @AbstractC27891c(mo46611a = "user_avatar")

    /* renamed from: e */
    public final String f167411e;
    @AbstractC27891c(mo46611a = "user_name")

    /* renamed from: f */
    public final String f167412f;
    @AbstractC27891c(mo46611a = "created_time")

    /* renamed from: g */
    public final String f167413g;
    @AbstractC27891c(mo46611a = "user_verified")

    /* renamed from: h */
    public final boolean f167414h;
    @AbstractC27891c(mo46611a = "user_secuid")

    /* renamed from: i */
    public final String f167415i;

    static {
        Covode.recordClassIndex(87231);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74441e)) {
            return false;
        }
        C74441e eVar = (C74441e) obj;
        return C89219l.m154714a(this.f167407a, eVar.f167407a) && this.f167408b == eVar.f167408b && C89219l.m154714a(this.f167409c, eVar.f167409c) && C89219l.m154714a(this.f167410d, eVar.f167410d) && C89219l.m154714a(this.f167411e, eVar.f167411e) && C89219l.m154714a(this.f167412f, eVar.f167412f) && C89219l.m154714a(this.f167413g, eVar.f167413g) && this.f167414h == eVar.f167414h && C89219l.m154714a(this.f167415i, eVar.f167415i);
    }

    public final int hashCode() {
        String str = this.f167407a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f167408b) * 31;
        String str2 = this.f167409c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f167410d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f167411e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f167412f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f167413g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.f167414h;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode6 + i2) * 31;
        String str7 = this.f167415i;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "ShoutoutsProductRating(ratingId=" + this.f167407a + ", ratingValue=" + this.f167408b + ", ratingText=" + this.f167409c + ", uid=" + this.f167410d + ", userAvatar=" + this.f167411e + ", userName=" + this.f167412f + ", createdTime=" + this.f167413g + ", userVerified=" + this.f167414h + ", userSecUid=" + this.f167415i + ")";
    }
}
