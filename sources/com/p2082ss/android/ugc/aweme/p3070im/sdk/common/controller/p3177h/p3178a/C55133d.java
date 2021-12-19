package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56225a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.d */
public final class C55133d extends AbstractC56225a {

    /* renamed from: a */
    public final boolean f126164a;

    static {
        Covode.recordClassIndex(64861);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55133d) && this.f126164a == ((C55133d) obj).f126164a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f126164a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "FirstInitEventBody(isSuccess=" + this.f126164a + ")";
    }

    public C55133d(boolean z) {
        super(C89041ag.m154412a(C89387v.m154943a("is_success", Boolean.valueOf(z))), null, null, 6);
        this.f126164a = z;
    }
}
