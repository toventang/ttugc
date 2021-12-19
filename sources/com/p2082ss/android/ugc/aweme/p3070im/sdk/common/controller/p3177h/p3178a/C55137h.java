package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56225a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.h */
public final class C55137h extends AbstractC56225a {

    /* renamed from: a */
    public final int f126172a;

    /* renamed from: b */
    public final boolean f126173b;

    /* renamed from: c */
    public final boolean f126174c;

    static {
        Covode.recordClassIndex(64865);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55137h)) {
            return false;
        }
        C55137h hVar = (C55137h) obj;
        return this.f126172a == hVar.f126172a && this.f126173b == hVar.f126173b && this.f126174c == hVar.f126174c;
    }

    public final int hashCode() {
        int i = this.f126172a * 31;
        boolean z = this.f126173b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        if (!this.f126174c) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "LoadConversationsEventBody(conversationCount=" + this.f126172a + ", hasSorted=" + this.f126173b + ", isFaulted=" + this.f126174c + ")";
    }

    public C55137h(int i, boolean z, boolean z2) {
        super(C89041ag.m154421a(C89387v.m154943a("has_sorted", Boolean.valueOf(z)), C89387v.m154943a("is_faulted", Boolean.valueOf(z2))), C89041ag.m154421a(C89387v.m154943a("conversation_count", Integer.valueOf(i)), C89387v.m154943a("is_faulted", Boolean.valueOf(z2))), null, 4);
        this.f126172a = i;
        this.f126173b = z;
        this.f126174c = z2;
    }
}
