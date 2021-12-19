package com.p2082ss.android.ugc.aweme.comment.p2497k;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.k.d */
public final class C36530d {

    /* renamed from: a */
    public final String f86487a;

    /* renamed from: b */
    public final int f86488b;

    /* renamed from: c */
    public final String f86489c;

    static {
        Covode.recordClassIndex(43833);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36530d)) {
            return false;
        }
        C36530d dVar = (C36530d) obj;
        return C89219l.m154714a(this.f86487a, dVar.f86487a) && this.f86488b == dVar.f86488b && C89219l.m154714a(this.f86489c, dVar.f86489c);
    }

    public final int hashCode() {
        String str = this.f86487a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f86488b) * 31;
        String str2 = this.f86489c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "GifEmojiListRequestParam(keyword=" + this.f86487a + ", cursor=" + this.f86488b + ", awemeId=" + this.f86489c + ")";
    }

    public C36530d(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f86487a = str;
        this.f86488b = i;
        this.f86489c = str2;
    }
}
