package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.j */
public final class C46607j extends BaseResponse {
    @AbstractC27891c(mo46611a = "is_update")

    /* renamed from: a */
    public final int f108672a;
    @AbstractC27891c(mo46611a = "system_emoji_resource")

    /* renamed from: b */
    public final C46609l f108673b;

    static {
        Covode.recordClassIndex(55197);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46607j)) {
            return false;
        }
        C46607j jVar = (C46607j) obj;
        return this.f108672a == jVar.f108672a && C89219l.m154714a(this.f108673b, jVar.f108673b);
    }

    public final int hashCode() {
        int i = this.f108672a * 31;
        C46609l lVar = this.f108673b;
        return i + (lVar != null ? lVar.hashCode() : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "ImSysEmojiResponse(isUpdate=" + this.f108672a + ", systemEmojiResource=" + this.f108673b + ")";
    }
}
