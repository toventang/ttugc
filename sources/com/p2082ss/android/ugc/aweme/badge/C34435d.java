package com.p2082ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.d */
public final class C34435d implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    private final String f81377a;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: b */
    private final String f81378b;

    static {
        Covode.recordClassIndex(41383);
    }

    public static /* synthetic */ C34435d copy$default(C34435d dVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f81377a;
        }
        if ((i & 2) != 0) {
            str2 = dVar.f81378b;
        }
        return dVar.copy(str, str2);
    }

    public final String component1() {
        return this.f81377a;
    }

    public final String component2() {
        return this.f81378b;
    }

    public final C34435d copy(String str, String str2) {
        return new C34435d(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34435d)) {
            return false;
        }
        C34435d dVar = (C34435d) obj;
        return C89219l.m154714a(this.f81377a, dVar.f81377a) && C89219l.m154714a(this.f81378b, dVar.f81378b);
    }

    public final int hashCode() {
        String str = this.f81377a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81378b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditProfileBadgeCampaignModel(name=" + this.f81377a + ", description=" + this.f81378b + ")";
    }

    public final String getDescription() {
        return this.f81378b;
    }

    public final String getName() {
        return this.f81377a;
    }

    public C34435d(String str, String str2) {
        this.f81377a = str;
        this.f81378b = str2;
    }
}
