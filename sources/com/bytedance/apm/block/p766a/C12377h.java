package com.bytedance.apm.block.p766a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.block.a.h */
public final class C12377h {

    /* renamed from: a */
    public int f29847a;

    /* renamed from: b */
    public int f29848b;

    /* renamed from: c */
    public long f29849c;

    /* renamed from: d */
    public int f29850d;

    /* renamed from: e */
    public int f29851e = 1;

    /* renamed from: f */
    public int f29852f;

    static {
        Covode.recordClassIndex(14183);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return this.f29850d + "," + this.f29847a + "," + this.f29851e + "," + this.f29848b + "," + this.f29849c;
    }

    /* renamed from: a */
    public final void mo20136a(long j) {
        this.f29851e++;
        this.f29848b = (int) (((long) this.f29848b) + j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12377h)) {
            return false;
        }
        C12377h hVar = (C12377h) obj;
        if (hVar.f29847a == this.f29847a && hVar.f29850d == this.f29850d) {
            return true;
        }
        return false;
    }

    public C12377h(int i, int i2, long j, int i3) {
        this.f29847a = i;
        this.f29848b = i2;
        this.f29850d = i3;
        this.f29849c = j;
    }
}
