package com.p2082ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.d */
public final class C36957d {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public final User f87034a;
    @AbstractC27891c(mo46611a = "comment_id")

    /* renamed from: b */
    public final Long f87035b;
    @AbstractC27891c(mo46611a = "comment_text")

    /* renamed from: c */
    public final String f87036c;

    static {
        Covode.recordClassIndex(44305);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36957d)) {
            return false;
        }
        C36957d dVar = (C36957d) obj;
        return C89219l.m154714a(this.f87034a, dVar.f87034a) && C89219l.m154714a(this.f87035b, dVar.f87035b) && C89219l.m154714a(this.f87036c, dVar.f87036c);
    }

    public final int hashCode() {
        User user = this.f87034a;
        int i = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        Long l = this.f87035b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str = this.f87036c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "GiftSender(user=" + this.f87034a + ", commentID=" + this.f87035b + ", commentText=" + this.f87036c + ")";
    }
}
