package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55050c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56225a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.b */
public final class C55131b extends AbstractC56225a {

    /* renamed from: a */
    public final int f126161a;

    /* renamed from: b */
    public final boolean f126162b;

    static {
        Covode.recordClassIndex(64859);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55131b)) {
            return false;
        }
        C55131b bVar = (C55131b) obj;
        return this.f126161a == bVar.f126161a && this.f126162b == bVar.f126162b;
    }

    public final int hashCode() {
        int i = this.f126161a * 31;
        boolean z = this.f126162b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public final String toString() {
        return "EnterChatEventBody(messageCount=" + this.f126161a + ", isPreload=" + this.f126162b + ")";
    }

    public /* synthetic */ C55131b(int i) {
        this(i, C55050c.m100668a());
    }

    private C55131b(int i, boolean z) {
        super(C89041ag.m154412a(C89387v.m154943a("is_preload", Boolean.valueOf(z))), C89041ag.m154412a(C89387v.m154943a("init_size", Integer.valueOf(i))), null, 4);
        this.f126161a = i;
        this.f126162b = z;
    }
}
