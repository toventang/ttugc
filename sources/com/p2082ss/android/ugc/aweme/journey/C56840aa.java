package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.aa */
public final class C56840aa {
    @AbstractC27891c(mo46611a = "page_id")

    /* renamed from: a */
    public final int f129431a;
    @AbstractC27891c(mo46611a = "interest_step")

    /* renamed from: b */
    public final C57053v f129432b = null;
    @AbstractC27891c(mo46611a = "content_language_step")

    /* renamed from: c */
    public final C56864k f129433c = null;
    @AbstractC27891c(mo46611a = "new_user_add_fb_friends_step")

    /* renamed from: d */
    public final C57046u f129434d = null;

    static {
        Covode.recordClassIndex(66725);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56840aa)) {
            return false;
        }
        C56840aa aaVar = (C56840aa) obj;
        return this.f129431a == aaVar.f129431a && C89219l.m154714a(this.f129432b, aaVar.f129432b) && C89219l.m154714a(this.f129433c, aaVar.f129433c) && C89219l.m154714a(this.f129434d, aaVar.f129434d);
    }

    public final int hashCode() {
        int i = this.f129431a * 31;
        C57053v vVar = this.f129432b;
        int i2 = 0;
        int hashCode = (i + (vVar != null ? vVar.hashCode() : 0)) * 31;
        C56864k kVar = this.f129433c;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C57046u uVar = this.f129434d;
        if (uVar != null) {
            i2 = uVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "NewUserJourneyStep(id=" + this.f129431a + ", new_user_interest_page=" + this.f129432b + ", new_user_content_language_page=" + this.f129433c + ", new_user_add_fb_friends_step=" + this.f129434d + ")";
    }

    public C56840aa(int i) {
        this.f129431a = i;
    }
}
