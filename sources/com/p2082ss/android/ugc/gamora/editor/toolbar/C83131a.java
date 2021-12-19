package com.p2082ss.android.ugc.gamora.editor.toolbar;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.toolbar.a */
public final class C83131a {

    /* renamed from: a */
    public final Drawable f185758a;

    /* renamed from: b */
    public final boolean f185759b;

    /* renamed from: c */
    public final boolean f185760c;

    static {
        Covode.recordClassIndex(97015);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83131a)) {
            return false;
        }
        C83131a aVar = (C83131a) obj;
        return C89219l.m154714a(this.f185758a, aVar.f185758a) && this.f185759b == aVar.f185759b && this.f185760c == aVar.f185760c;
    }

    public final int hashCode() {
        Drawable drawable = this.f185758a;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        boolean z = this.f185759b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        if (!this.f185760c) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "AutoEnhanceStatus(drawable=" + this.f185758a + ", on=" + this.f185759b + ", showToast=" + this.f185760c + ")";
    }

    public C83131a(Drawable drawable, boolean z, boolean z2) {
        C89219l.m154721d(drawable, "");
        this.f185758a = drawable;
        this.f185759b = z;
        this.f185760c = z2;
    }
}
