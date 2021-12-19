package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53635b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55050c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56225a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.f */
public final class C55135f extends AbstractC56225a {

    /* renamed from: a */
    public final boolean f126166a;

    /* renamed from: b */
    public final int f126167b;

    /* renamed from: c */
    public final int f126168c;

    /* renamed from: d */
    public final boolean f126169d;

    /* renamed from: e */
    public final boolean f126170e;

    static {
        Covode.recordClassIndex(64863);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55135f)) {
            return false;
        }
        C55135f fVar = (C55135f) obj;
        return this.f126166a == fVar.f126166a && this.f126167b == fVar.f126167b && this.f126168c == fVar.f126168c && this.f126169d == fVar.f126169d && this.f126170e == fVar.f126170e;
    }

    public final int hashCode() {
        boolean z = this.f126166a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = ((((i2 * 31) + this.f126167b) * 31) + this.f126168c) * 31;
        boolean z2 = this.f126169d;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f126170e) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "ImageShowEventBody(animated=" + this.f126166a + ", width=" + this.f126167b + ", height=" + this.f126168c + ", isPreload=" + this.f126169d + ", isPreloadFromScroll=" + this.f126170e + ")";
    }

    public /* synthetic */ C55135f(boolean z, int i, int i2) {
        this(z, i, i2, C55050c.m100668a(), C53635b.m98893a());
    }

    private C55135f(boolean z, int i, int i2, boolean z2, boolean z3) {
        super(C89041ag.m154421a(C89387v.m154943a("is_preload", Boolean.valueOf(z2)), C89387v.m154943a("preload_from_scroll", Boolean.valueOf(z3)), C89387v.m154943a("animate", Boolean.valueOf(z))), null, C89041ag.m154421a(C89387v.m154943a("width", Integer.valueOf(i)), C89387v.m154943a("height", Integer.valueOf(i2))), 2);
        this.f126166a = z;
        this.f126167b = i;
        this.f126168c = i2;
        this.f126169d = z2;
        this.f126170e = z3;
    }
}
