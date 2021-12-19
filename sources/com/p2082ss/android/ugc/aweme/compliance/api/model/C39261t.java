package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.t */
public final class C39261t {
    @AbstractC27891c(mo46611a = "to_contacts")

    /* renamed from: a */
    public int f92752a;
    @AbstractC27891c(mo46611a = "to_fb_friends")

    /* renamed from: b */
    public int f92753b;
    @AbstractC27891c(mo46611a = "to_mutual_connections")

    /* renamed from: c */
    public int f92754c;
    @AbstractC27891c(mo46611a = "to_who_share_link")

    /* renamed from: d */
    public int f92755d;
    @AbstractC27891c(mo46611a = "to_interested_users")

    /* renamed from: e */
    public int f92756e;

    static {
        Covode.recordClassIndex(46919);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39261t)) {
            return false;
        }
        C39261t tVar = (C39261t) obj;
        return this.f92752a == tVar.f92752a && this.f92753b == tVar.f92753b && this.f92754c == tVar.f92754c && this.f92755d == tVar.f92755d && this.f92756e == tVar.f92756e;
    }

    public final int hashCode() {
        return (((((((this.f92752a * 31) + this.f92753b) * 31) + this.f92754c) * 31) + this.f92755d) * 31) + this.f92756e;
    }

    public final String toString() {
        return "SuggestSettings(sugToContacts=" + this.f92752a + ", sugToFbFriends=" + this.f92753b + ", sugToMutualConnections=" + this.f92754c + ", sugToWhoShareLink=" + this.f92755d + ", sugToInterestedUsers=" + this.f92756e + ")";
    }

    public C39261t(int i, int i2, int i3, int i4, int i5) {
        this.f92752a = i;
        this.f92753b = i2;
        this.f92754c = i3;
        this.f92755d = i4;
        this.f92756e = i5;
    }
}
