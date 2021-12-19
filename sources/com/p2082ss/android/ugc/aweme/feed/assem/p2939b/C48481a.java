package com.p2082ss.android.ugc.aweme.feed.assem.p2939b;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.b.a */
public final class C48481a implements AbstractC12779c {

    /* renamed from: a */
    public final String f112218a;

    static {
        Covode.recordClassIndex(57255);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C48481a) && C89219l.m154714a(this.f112218a, ((C48481a) obj).f112218a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f112218a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UpvoteParam(upvoteId=" + this.f112218a + ")";
    }

    private /* synthetic */ C48481a() {
        this(null);
    }

    public C48481a(String str) {
        this.f112218a = str;
    }
}
