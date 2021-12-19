package com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a.e */
public final class C37358e {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final Integer f88147a = null;
    @AbstractC27891c(mo46611a = "collection")

    /* renamed from: b */
    public final List<C37356c> f88148b = null;

    static {
        Covode.recordClassIndex(44738);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37358e)) {
            return false;
        }
        C37358e eVar = (C37358e) obj;
        return C89219l.m154714a(this.f88147a, eVar.f88147a) && C89219l.m154714a(this.f88148b, eVar.f88148b);
    }

    public final int hashCode() {
        Integer num = this.f88147a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<C37356c> list = this.f88148b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CommentStickerPanelResponse(statusCode=" + this.f88147a + ", collection=" + this.f88148b + ")";
    }

    private C37358e() {
    }
}
