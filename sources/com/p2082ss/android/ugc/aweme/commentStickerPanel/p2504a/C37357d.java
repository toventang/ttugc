package com.p2082ss.android.ugc.aweme.commentStickerPanel.p2504a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.a.d */
public final class C37357d {
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: a */
    public final Integer f88144a;
    @AbstractC27891c(mo46611a = "count")

    /* renamed from: b */
    public final Integer f88145b;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: c */
    public final Integer f88146c;

    static {
        Covode.recordClassIndex(44737);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37357d)) {
            return false;
        }
        C37357d dVar = (C37357d) obj;
        return C89219l.m154714a(this.f88144a, dVar.f88144a) && C89219l.m154714a(this.f88145b, dVar.f88145b) && C89219l.m154714a(this.f88146c, dVar.f88146c);
    }

    public final int hashCode() {
        Integer num = this.f88144a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f88145b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f88146c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CommentStickerPanelRequest(cursor=" + this.f88144a + ", count=" + this.f88145b + ", type=" + this.f88146c + ")";
    }

    private /* synthetic */ C37357d() {
        this(null, null, null);
    }

    public C37357d(Integer num, Integer num2, Integer num3) {
        this.f88144a = num;
        this.f88145b = num2;
        this.f88146c = num3;
    }
}
