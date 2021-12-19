package com.p2082ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.q */
public final class C75657q {

    /* renamed from: a */
    public final String f170069a;

    /* renamed from: b */
    public final boolean f170070b;

    /* renamed from: c */
    public final boolean f170071c;

    /* renamed from: d */
    public final boolean f170072d;

    static {
        Covode.recordClassIndex(88588);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75657q)) {
            return false;
        }
        C75657q qVar = (C75657q) obj;
        return C89219l.m154714a(this.f170069a, qVar.f170069a) && this.f170070b == qVar.f170070b && this.f170071c == qVar.f170071c && this.f170072d == qVar.f170072d;
    }

    public final int hashCode() {
        String str = this.f170069a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f170070b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.f170071c;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f170072d) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "StickerManagerConfigure(panel=" + this.f170069a + ", lazyLoad=" + this.f170070b + ", shouldPrefetch=" + this.f170071c + ", isFavoriteEnable=" + this.f170072d + ")";
    }

    public /* synthetic */ C75657q(String str) {
        this(str, true, true);
    }

    public C75657q(String str, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        this.f170069a = str;
        this.f170070b = true;
        this.f170071c = z;
        this.f170072d = z2;
    }
}
