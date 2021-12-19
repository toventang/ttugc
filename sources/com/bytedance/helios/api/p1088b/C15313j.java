package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.j */
public final class C15313j {

    /* renamed from: a */
    public final String f37339a;

    /* renamed from: b */
    public final int f37340b;

    /* renamed from: c */
    public final int f37341c;

    static {
        Covode.recordClassIndex(17543);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15313j)) {
            return false;
        }
        C15313j jVar = (C15313j) obj;
        return C89219l.m154714a(this.f37339a, jVar.f37339a) && this.f37340b == jVar.f37340b && this.f37341c == jVar.f37341c;
    }

    public final int hashCode() {
        String str = this.f37339a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f37340b) * 31) + this.f37341c;
    }

    public final String toString() {
        return "FrequencyLog(name=" + this.f37339a + ", callCount=" + this.f37340b + ", callThreshold=" + this.f37341c + ")";
    }

    public C15313j(String str, int i, int i2) {
        C89219l.m154719c(str, "");
        this.f37339a = str;
        this.f37340b = i;
        this.f37341c = i2;
    }
}
