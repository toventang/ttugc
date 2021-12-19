package com.p2082ss.android.ugc.aweme.story.avatar.entry;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.k */
public final class C76545k {

    /* renamed from: a */
    public final boolean f171858a;

    /* renamed from: b */
    public final EnumC79475a f171859b;

    /* renamed from: c */
    public final float f171860c;

    static {
        Covode.recordClassIndex(89530);
    }

    public C76545k() {
        this(false, (EnumC79475a) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76545k)) {
            return false;
        }
        C76545k kVar = (C76545k) obj;
        return this.f171858a == kVar.f171858a && C89219l.m154714a(this.f171859b, kVar.f171859b) && Float.compare(this.f171860c, kVar.f171860c) == 0;
    }

    public final String toString() {
        return "StoryRingState(isShow=" + this.f171858a + ", mode=" + this.f171859b + ", progress=" + this.f171860c + ")";
    }

    public final int hashCode() {
        int i;
        boolean z = this.f171858a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        EnumC79475a aVar = this.f171859b;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        return ((i5 + i) * 31) + Float.floatToIntBits(this.f171860c);
    }

    public C76545k(boolean z, EnumC79475a aVar, float f) {
        C89219l.m154721d(aVar, "");
        this.f171858a = z;
        this.f171859b = aVar;
        this.f171860c = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C76545k(boolean z, EnumC79475a aVar, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? EnumC79475a.BRAND_RING : aVar, 0.0f);
    }
}
