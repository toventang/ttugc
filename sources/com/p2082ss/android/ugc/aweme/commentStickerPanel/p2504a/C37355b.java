package com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a.b */
public final class C37355b {
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: a */
    public final C37364k f88132a = null;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: b */
    public final String f88133b = null;
    @AbstractC27891c(mo46611a = "cid")

    /* renamed from: c */
    public final String f88134c = null;
    @AbstractC27891c(mo46611a = "aweme_id")

    /* renamed from: d */
    public final String f88135d = null;
    @AbstractC27891c(mo46611a = "reply_id")

    /* renamed from: e */
    public final String f88136e = null;
    @AbstractC27891c(mo46611a = "reply_to_reply_id")

    /* renamed from: f */
    public final String f88137f = null;
    @AbstractC27891c(mo46611a = "aweme_uid")

    /* renamed from: g */
    public final String f88138g = null;

    static {
        Covode.recordClassIndex(44735);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37355b)) {
            return false;
        }
        C37355b bVar = (C37355b) obj;
        return C89219l.m154714a(this.f88132a, bVar.f88132a) && C89219l.m154714a(this.f88133b, bVar.f88133b) && C89219l.m154714a(this.f88134c, bVar.f88134c) && C89219l.m154714a(this.f88135d, bVar.f88135d) && C89219l.m154714a(this.f88136e, bVar.f88136e) && C89219l.m154714a(this.f88137f, bVar.f88137f) && C89219l.m154714a(this.f88138g, bVar.f88138g);
    }

    public final int hashCode() {
        C37364k kVar = this.f88132a;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        String str = this.f88133b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f88134c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f88135d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f88136e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f88137f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f88138g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "CommentStickerForPanel(user=" + this.f88132a + ", text=" + this.f88133b + ", cid=" + this.f88134c + ", awemeId=" + this.f88135d + ", replyId=" + this.f88136e + ", replyToReplyId=" + this.f88137f + ", awemeUserId=" + this.f88138g + ")";
    }

    private C37355b() {
    }
}
