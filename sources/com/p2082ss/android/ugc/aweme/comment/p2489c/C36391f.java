package com.p2082ss.android.ugc.aweme.comment.p2489c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.c.f */
public final class C36391f implements AbstractC81914b {

    /* renamed from: a */
    public final Comment f86069a;

    /* renamed from: b */
    public final String f86070b;

    static {
        Covode.recordClassIndex(43686);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36391f)) {
            return false;
        }
        C36391f fVar = (C36391f) obj;
        return C89219l.m154714a(this.f86069a, fVar.f86069a) && C89219l.m154714a(this.f86070b, fVar.f86070b);
    }

    public final int hashCode() {
        Comment comment = this.f86069a;
        int i = 0;
        int hashCode = (comment != null ? comment.hashCode() : 0) * 31;
        String str = this.f86070b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EnterTextEvent(comment=" + this.f86069a + ", enterMethod=" + this.f86070b + ")";
    }

    public C36391f(Comment comment, String str) {
        this.f86069a = comment;
        this.f86070b = str;
    }
}
