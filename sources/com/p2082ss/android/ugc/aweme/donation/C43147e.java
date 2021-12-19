package com.p2082ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.e */
public final class C43147e {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public final User f100541a;
    @AbstractC27891c(mo46611a = "timestamp")

    /* renamed from: b */
    public final Long f100542b;
    @AbstractC27891c(mo46611a = "user_amount")

    /* renamed from: c */
    public final String f100543c;
    @AbstractC27891c(mo46611a = "tiktok_amount")

    /* renamed from: d */
    public final String f100544d;
    @AbstractC27891c(mo46611a = "anonymous")

    /* renamed from: e */
    public final Boolean f100545e;
    @AbstractC27891c(mo46611a = "is_top_donor")

    /* renamed from: f */
    public final boolean f100546f;

    static {
        Covode.recordClassIndex(51319);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43147e)) {
            return false;
        }
        C43147e eVar = (C43147e) obj;
        return C89219l.m154714a(this.f100541a, eVar.f100541a) && C89219l.m154714a(this.f100542b, eVar.f100542b) && C89219l.m154714a(this.f100543c, eVar.f100543c) && C89219l.m154714a(this.f100544d, eVar.f100544d) && C89219l.m154714a(this.f100545e, eVar.f100545e) && this.f100546f == eVar.f100546f;
    }

    public final int hashCode() {
        User user = this.f100541a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        Long l = this.f100542b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f100543c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f100544d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f100545e;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.f100546f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "DonorStruct(user=" + this.f100541a + ", timestamp=" + this.f100542b + ", amount=" + this.f100543c + ", tiktokAmount=" + this.f100544d + ", anonymous=" + this.f100545e + ", isTopDonor=" + this.f100546f + ")";
    }
}
