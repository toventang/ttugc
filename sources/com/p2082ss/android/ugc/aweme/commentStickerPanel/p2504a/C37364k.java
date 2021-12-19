package com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a.k */
public final class C37364k {
    @AbstractC27891c(mo46611a = "uid")

    /* renamed from: a */
    public final String f88161a = null;
    @AbstractC27891c(mo46611a = "unique_id")

    /* renamed from: b */
    public final String f88162b = null;
    @AbstractC27891c(mo46611a = "avatar_thumb")

    /* renamed from: c */
    public final UrlModel f88163c = null;

    static {
        Covode.recordClassIndex(44744);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37364k)) {
            return false;
        }
        C37364k kVar = (C37364k) obj;
        return C89219l.m154714a(this.f88161a, kVar.f88161a) && C89219l.m154714a(this.f88162b, kVar.f88162b) && C89219l.m154714a(this.f88163c, kVar.f88163c);
    }

    public final int hashCode() {
        String str = this.f88161a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f88162b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f88163c;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "UserForPanel(commentUserId=" + this.f88161a + ", userName=" + this.f88162b + ", avatarThumb=" + this.f88163c + ")";
    }

    private C37364k() {
    }
}
