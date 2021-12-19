package com.p2082ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.share.d */
public final class C49018d {

    /* renamed from: a */
    public final boolean f112943a;

    /* renamed from: b */
    public final Float f112944b;

    /* renamed from: c */
    public final boolean f112945c;

    static {
        Covode.recordClassIndex(57809);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49018d)) {
            return false;
        }
        C49018d dVar = (C49018d) obj;
        return this.f112943a == dVar.f112943a && C89219l.m154714a(this.f112944b, dVar.f112944b) && this.f112945c == dVar.f112945c;
    }

    public final int hashCode() {
        boolean z = this.f112943a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Float f = this.f112944b;
        int hashCode = (i5 + (f != null ? f.hashCode() : 0)) * 31;
        if (!this.f112945c) {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShareContainerState(visible=" + this.f112943a + ", alpha=" + this.f112944b + ", enabled=" + this.f112945c + ")";
    }

    public /* synthetic */ C49018d() {
        this(true, null, true);
    }

    /* renamed from: a */
    public static /* synthetic */ C49018d m92183a(C49018d dVar, Float f) {
        return new C49018d(dVar.f112943a, f, dVar.f112945c);
    }

    public C49018d(boolean z, Float f, boolean z2) {
        this.f112943a = z;
        this.f112944b = f;
        this.f112945c = z2;
    }
}
