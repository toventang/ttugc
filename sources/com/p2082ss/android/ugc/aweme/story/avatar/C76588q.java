package com.p2082ss.android.ugc.aweme.story.avatar;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.q */
public final class C76588q implements AbstractC12779c {

    /* renamed from: a */
    public final String f171908a;

    static {
        Covode.recordClassIndex(89573);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C76588q) && C89219l.m154714a(this.f171908a, ((C76588q) obj).f171908a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f171908a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryRingAssemEnterParams(identifier=" + this.f171908a + ")";
    }

    public C76588q(String str) {
        C89219l.m154721d(str, "");
        this.f171908a = str;
    }
}
