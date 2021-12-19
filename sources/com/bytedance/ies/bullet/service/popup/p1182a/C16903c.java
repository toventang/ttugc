package com.bytedance.ies.bullet.service.popup.p1182a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.AbstractC16876a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.a.c */
public final class C16903c {

    /* renamed from: a */
    public final boolean f40177a;

    /* renamed from: b */
    public final int f40178b;

    /* renamed from: c */
    public final int f40179c;

    /* renamed from: d */
    public final int f40180d;

    /* renamed from: e */
    public final int f40181e;

    /* renamed from: f */
    public final int f40182f;

    /* renamed from: g */
    public final AbstractC16876a.AbstractC16878b f40183g;

    static {
        Covode.recordClassIndex(19343);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16903c)) {
            return false;
        }
        C16903c cVar = (C16903c) obj;
        return this.f40177a == cVar.f40177a && this.f40178b == cVar.f40178b && this.f40179c == cVar.f40179c && this.f40180d == cVar.f40180d && this.f40181e == cVar.f40181e && this.f40182f == cVar.f40182f && C89219l.m154714a(this.f40183g, cVar.f40183g);
    }

    public final int hashCode() {
        boolean z = this.f40177a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = ((((((((((i * 31) + this.f40178b) * 31) + this.f40179c) * 31) + this.f40180d) * 31) + this.f40181e) * 31) + this.f40182f) * 31;
        AbstractC16876a.AbstractC16878b bVar = this.f40183g;
        return i4 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "BottomUpConfig(rightIn=" + this.f40177a + ", worldHeight=" + this.f40178b + ", worldWidth=" + this.f40179c + ", peekWidth=" + this.f40180d + ", peekHeight=" + this.f40181e + ", radius=" + this.f40182f + ", cancelableProvider=" + this.f40183g + ")";
    }

    public /* synthetic */ C16903c() {
        this(false, 0, 0, 0, 0, -1, null);
    }

    public C16903c(boolean z, int i, int i2, int i3, int i4, int i5, AbstractC16876a.AbstractC16878b bVar) {
        this.f40177a = z;
        this.f40178b = i;
        this.f40179c = i2;
        this.f40180d = i3;
        this.f40181e = i4;
        this.f40182f = i5;
        this.f40183g = bVar;
    }
}
