package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.d */
public final class C76594d implements AbstractC81914b {

    /* renamed from: a */
    public final String f171911a;

    static {
        Covode.recordClassIndex(89579);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C76594d) && C89219l.m154714a(this.f171911a, ((C76594d) obj).f171911a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f171911a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryCommentBubbleClickEvent(commentId=" + this.f171911a + ")";
    }

    public C76594d(String str) {
        C89219l.m154721d(str, "");
        this.f171911a = str;
    }
}
