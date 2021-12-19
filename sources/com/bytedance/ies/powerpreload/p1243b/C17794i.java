package com.bytedance.ies.powerpreload.p1243b;

import com.bytedance.covode.number.Covode;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.b.i */
public final class C17794i {

    /* renamed from: a */
    public int f42470a;

    /* renamed from: b */
    public final int f42471b;

    /* renamed from: c */
    public final String f42472c;

    /* renamed from: d */
    public final boolean f42473d;

    static {
        Covode.recordClassIndex(20358);
    }

    public C17794i() {
        this(0, null, false, 7);
    }

    public final String toString() {
        return "PreloadStrategy(maxAgeMilliseconds=" + this.f42471b + ", baseUrl=" + this.f42472c + ", useOnlyOnce=" + this.f42473d + ")";
    }

    public final int hashCode() {
        return this.f42470a;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new C89388w("null cannot be cast to non-null type");
        } else if (this.f42470a != ((C17794i) obj).f42470a) {
            return false;
        } else {
            return true;
        }
    }

    public C17794i(int i, String str, boolean z) {
        this.f42471b = i;
        this.f42472c = str;
        this.f42473d = z;
        this.f42470a = 3000;
        this.f42470a = i > 300000 ? 300000 : i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17794i(int i, String str, boolean z, int i2) {
        this((i2 & 1) != 0 ? 3000 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? true : z);
    }
}
