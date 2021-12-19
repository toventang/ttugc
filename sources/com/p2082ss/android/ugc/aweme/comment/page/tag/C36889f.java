package com.p2082ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.f */
public final class C36889f {

    /* renamed from: a */
    public final Aweme f86882a;

    /* renamed from: b */
    public final String f86883b;

    static {
        Covode.recordClassIndex(44227);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36889f)) {
            return false;
        }
        C36889f fVar = (C36889f) obj;
        return C89219l.m154714a(this.f86882a, fVar.f86882a) && C89219l.m154714a(this.f86883b, fVar.f86883b);
    }

    public final int hashCode() {
        Aweme aweme = this.f86882a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f86883b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FeedTaggedParam(aweme=" + this.f86882a + ", enterFrom=" + this.f86883b + ")";
    }

    private /* synthetic */ C36889f() {
        this(null, "");
    }

    public C36889f(Aweme aweme, String str) {
        this.f86882a = aweme;
        this.f86883b = str;
    }
}
