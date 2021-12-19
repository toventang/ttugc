package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.f */
public final class C76596f implements AbstractC76591a {

    /* renamed from: a */
    public final String f171914a;

    static {
        Covode.recordClassIndex(89581);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C76596f) && C89219l.m154714a(this.f171914a, ((C76596f) obj).f171914a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f171914a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryEventParam(event=" + this.f171914a + ")";
    }

    public C76596f(String str) {
        C89219l.m154721d(str, "");
        this.f171914a = str;
    }
}
