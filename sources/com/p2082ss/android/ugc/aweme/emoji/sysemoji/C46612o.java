package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.o */
public final class C46612o {
    @AbstractC27891c(mo46611a = "enable_business")

    /* renamed from: a */
    public final int f108684a = -1;
    @AbstractC27891c(mo46611a = "res_version")

    /* renamed from: b */
    public final String f108685b;
    @AbstractC27891c(mo46611a = "mt_enable_big_text_emoji")

    /* renamed from: c */
    public final int f108686c;

    static {
        Covode.recordClassIndex(55202);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46612o)) {
            return false;
        }
        C46612o oVar = (C46612o) obj;
        return this.f108684a == oVar.f108684a && C89219l.m154714a(this.f108685b, oVar.f108685b) && this.f108686c == oVar.f108686c;
    }

    public final int hashCode() {
        int i = this.f108684a * 31;
        String str = this.f108685b;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f108686c;
    }

    public final String toString() {
        return "SystemEmojiVersionId(bussinessCode=" + this.f108684a + ", versionId=" + this.f108685b + ", bigTextEmojiEnable=" + this.f108686c + ")";
    }

    public C46612o(String str) {
        C89219l.m154721d(str, "");
        this.f108685b = str;
        this.f108686c = 1;
    }
}
