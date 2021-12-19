package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.k */
public final class C76601k implements AbstractC76591a {

    /* renamed from: a */
    public final String f171925a;

    static {
        Covode.recordClassIndex(89586);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C76601k) && C89219l.m154714a(this.f171925a, ((C76601k) obj).f171925a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f171925a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryPlayCompletedParam(sourceId=" + this.f171925a + ")";
    }

    public C76601k(String str) {
        this.f171925a = str;
    }
}
