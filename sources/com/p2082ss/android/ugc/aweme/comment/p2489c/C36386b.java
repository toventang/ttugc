package com.p2082ss.android.ugc.aweme.comment.p2489c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.c.b */
public final class C36386b implements AbstractC81914b {

    /* renamed from: a */
    public final String f86059a;

    /* renamed from: b */
    public final boolean f86060b;

    static {
        Covode.recordClassIndex(43681);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36386b)) {
            return false;
        }
        C36386b bVar = (C36386b) obj;
        return C89219l.m154714a(this.f86059a, bVar.f86059a) && this.f86060b == bVar.f86060b;
    }

    public final int hashCode() {
        String str = this.f86059a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f86060b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "CommentBubbleClickEvent(commentId=" + this.f86059a + ", forceRefresh=" + this.f86060b + ")";
    }

    public /* synthetic */ C36386b(String str) {
        this(str, true);
    }

    public C36386b(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f86059a = str;
        this.f86060b = z;
    }
}
