package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.c */
public final class C76593c implements AbstractC76591a {

    /* renamed from: a */
    public final Aweme f171910a;

    static {
        Covode.recordClassIndex(89578);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C76593c) && C89219l.m154714a(this.f171910a, ((C76593c) obj).f171910a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f171910a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryAwemeParam(aweme=" + this.f171910a + ")";
    }

    public C76593c(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f171910a = aweme;
    }
}
