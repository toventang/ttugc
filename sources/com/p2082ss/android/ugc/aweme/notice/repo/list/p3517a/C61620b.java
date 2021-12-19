package com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.a.b */
public final class C61620b {
    @AbstractC27891c(mo46611a = "view_type")

    /* renamed from: a */
    public final int f139835a;
    @AbstractC27891c(mo46611a = "text_content")

    /* renamed from: b */
    public final String f139836b;
    @AbstractC27891c(mo46611a = "action_type")

    /* renamed from: c */
    public final int f139837c;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: d */
    public final String f139838d;
    @AbstractC27891c(mo46611a = "matched_friend")

    /* renamed from: e */
    public final MatchedFriendStruct f139839e;

    static {
        Covode.recordClassIndex(72316);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61620b)) {
            return false;
        }
        C61620b bVar = (C61620b) obj;
        return this.f139835a == bVar.f139835a && C89219l.m154714a(this.f139836b, bVar.f139836b) && this.f139837c == bVar.f139837c && C89219l.m154714a(this.f139838d, bVar.f139838d) && C89219l.m154714a(this.f139839e, bVar.f139839e);
    }

    public final int hashCode() {
        int i = this.f139835a * 31;
        String str = this.f139836b;
        int i2 = 0;
        int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.f139837c) * 31;
        String str2 = this.f139838d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        MatchedFriendStruct matchedFriendStruct = this.f139839e;
        if (matchedFriendStruct != null) {
            i2 = matchedFriendStruct.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LabelInfoTemplate(viewType=" + this.f139835a + ", content=" + this.f139836b + ", actionType=" + this.f139837c + ", schema=" + this.f139838d + ", matchedFriendStruct=" + this.f139839e + ")";
    }
}
