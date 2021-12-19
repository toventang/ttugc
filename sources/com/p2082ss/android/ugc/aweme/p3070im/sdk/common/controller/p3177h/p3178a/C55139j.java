package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55050c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56225a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.j */
public final class C55139j extends AbstractC56225a {

    /* renamed from: a */
    public final boolean f126176a;

    static {
        Covode.recordClassIndex(64867);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55139j) && this.f126176a == ((C55139j) obj).f126176a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f126176a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "StickerShowEventBody(isPreload=" + this.f126176a + ")";
    }

    public /* synthetic */ C55139j() {
        this(C55050c.m100668a());
    }

    private C55139j(boolean z) {
        super(C89041ag.m154412a(C89387v.m154943a("is_preload", Boolean.valueOf(z))), null, null, 6);
        this.f126176a = z;
    }
}
