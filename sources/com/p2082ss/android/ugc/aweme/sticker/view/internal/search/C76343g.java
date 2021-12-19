package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.g */
public final class C76343g {

    /* renamed from: a */
    public final boolean f171489a;

    /* renamed from: b */
    public final boolean f171490b;

    /* renamed from: c */
    public final boolean f171491c;

    /* renamed from: d */
    public final int f171492d;

    static {
        Covode.recordClassIndex(89298);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76343g)) {
            return false;
        }
        C76343g gVar = (C76343g) obj;
        return this.f171489a == gVar.f171489a && this.f171490b == gVar.f171490b && this.f171491c == gVar.f171491c && this.f171492d == gVar.f171492d;
    }

    public final int hashCode() {
        boolean z = this.f171489a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f171490b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f171491c) {
            i = 0;
        }
        return ((i9 + i) * 31) + this.f171492d;
    }

    public final String toString() {
        return "SearchShowHideEvent(showSearchPanel=" + this.f171489a + ", usingSameEffect=" + this.f171490b + ", clickCancel=" + this.f171491c + ", panelHeight=" + this.f171492d + ")";
    }

    public C76343g(boolean z, boolean z2, boolean z3, int i) {
        this.f171489a = z;
        this.f171490b = z2;
        this.f171491c = z3;
        this.f171492d = i;
    }
}
