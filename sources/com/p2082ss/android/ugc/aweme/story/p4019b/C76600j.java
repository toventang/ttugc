package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.j */
public final class C76600j implements AbstractC76591a {

    /* renamed from: a */
    public final Aweme f171919a;

    /* renamed from: b */
    public final int f171920b;

    /* renamed from: c */
    public final int f171921c;

    /* renamed from: d */
    public final int f171922d;

    /* renamed from: e */
    public final boolean f171923e;

    /* renamed from: f */
    public final boolean f171924f;

    static {
        Covode.recordClassIndex(89585);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76600j)) {
            return false;
        }
        C76600j jVar = (C76600j) obj;
        return C89219l.m154714a(this.f171919a, jVar.f171919a) && this.f171920b == jVar.f171920b && this.f171921c == jVar.f171921c && this.f171922d == jVar.f171922d && this.f171923e == jVar.f171923e && this.f171924f == jVar.f171924f;
    }

    public final int hashCode() {
        Aweme aweme = this.f171919a;
        int hashCode = (((((((aweme != null ? aweme.hashCode() : 0) * 31) + this.f171920b) * 31) + this.f171921c) * 31) + this.f171922d) * 31;
        boolean z = this.f171923e;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        if (!this.f171924f) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "StoryPageSelectParam(aweme=" + this.f171919a + ", storyListPosition=" + this.f171920b + ", storyPosition=" + this.f171921c + ", totalCount=" + this.f171922d + ", isSlideToSelect=" + this.f171923e + ", shouldPlay=" + this.f171924f + ")";
    }

    public /* synthetic */ C76600j(Aweme aweme, int i, int i2, int i3, boolean z) {
        this(aweme, i, i2, i3, z, true);
    }

    public C76600j(Aweme aweme, int i, int i2, int i3, boolean z, boolean z2) {
        C89219l.m154721d(aweme, "");
        this.f171919a = aweme;
        this.f171920b = i;
        this.f171921c = i2;
        this.f171922d = i3;
        this.f171923e = z;
        this.f171924f = z2;
    }
}
