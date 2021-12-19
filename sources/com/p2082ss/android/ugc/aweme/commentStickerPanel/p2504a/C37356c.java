package com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a.c */
public final class C37356c {
    @AbstractC27891c(mo46611a = "comment_list")

    /* renamed from: a */
    public final List<C37355b> f88139a = null;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: b */
    public final Integer f88140b = null;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public final Integer f88141c = null;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: d */
    public final Integer f88142d = null;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: e */
    public final Integer f88143e = null;

    static {
        Covode.recordClassIndex(44736);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37356c)) {
            return false;
        }
        C37356c cVar = (C37356c) obj;
        return C89219l.m154714a(this.f88139a, cVar.f88139a) && C89219l.m154714a(this.f88140b, cVar.f88140b) && C89219l.m154714a(this.f88141c, cVar.f88141c) && C89219l.m154714a(this.f88142d, cVar.f88142d) && C89219l.m154714a(this.f88143e, cVar.f88143e);
    }

    public final int hashCode() {
        List<C37355b> list = this.f88139a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f88140b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f88141c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f88142d;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f88143e;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CommentStickerPanelData(commentStickerPanelList=" + this.f88139a + ", cursor=" + this.f88140b + ", hasMore=" + this.f88141c + ", count=" + this.f88142d + ", tabType=" + this.f88143e + ")";
    }

    private C37356c() {
    }
}
