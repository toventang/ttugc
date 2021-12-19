package com.p2082ss.android.ugc.aweme.upvote.event;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.upvote.event.a */
public final class C79898a {

    /* renamed from: a */
    public final boolean f179142a;

    /* renamed from: b */
    public final int f179143b;

    /* renamed from: c */
    public final boolean f179144c;

    static {
        Covode.recordClassIndex(93124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79898a)) {
            return false;
        }
        C79898a aVar = (C79898a) obj;
        return this.f179142a == aVar.f179142a && this.f179143b == aVar.f179143b && this.f179144c == aVar.f179144c;
    }

    public final int hashCode() {
        boolean z = this.f179142a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = ((i2 * 31) + this.f179143b) * 31;
        if (!this.f179144c) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "UpvoteCommonMobParam(isRecommend=" + this.f179142a + ", recommendCount=" + this.f179143b + ", isSelf=" + this.f179144c + ")";
    }

    public /* synthetic */ C79898a() {
        this(false, 0, false);
    }

    public C79898a(boolean z, int i, boolean z2) {
        this.f179142a = z;
        this.f179143b = i;
        this.f179144c = z2;
    }
}
