package com.bytedance.android.livesdkapi.p699l;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.l.a */
public final class C11825a {

    /* renamed from: a */
    public final boolean f28180a;

    /* renamed from: b */
    public final boolean f28181b;

    /* renamed from: c */
    public final boolean f28182c;

    static {
        Covode.recordClassIndex(13523);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11825a)) {
            return false;
        }
        C11825a aVar = (C11825a) obj;
        return this.f28180a == aVar.f28180a && this.f28181b == aVar.f28181b && this.f28182c == aVar.f28182c;
    }

    public final int hashCode() {
        boolean z = this.f28180a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f28181b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        if (!this.f28182c) {
            i = 0;
        }
        return i9 + i;
    }

    public final String toString() {
        return "ApplyLivePermission(videoApplyPermission=" + this.f28180a + ", screenApplyPermission=" + this.f28181b + ", obsApplyPermission=" + this.f28182c + ")";
    }

    private /* synthetic */ C11825a() {
        this(false, false, false);
    }

    public C11825a(boolean z, boolean z2, boolean z3) {
        this.f28180a = z;
        this.f28181b = z2;
        this.f28182c = z3;
    }
}
