package com.bytedance.hybrid.spark.p1107a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.hybrid.spark.a.k */
public final class C15515k {

    /* renamed from: a */
    public final int f37784a;

    /* renamed from: b */
    public final int f37785b;

    static {
        Covode.recordClassIndex(17775);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15515k)) {
            return false;
        }
        C15515k kVar = (C15515k) obj;
        return this.f37784a == kVar.f37784a && this.f37785b == kVar.f37785b;
    }

    public final int hashCode() {
        return (this.f37784a * 31) + this.f37785b;
    }

    public final String toString() {
        return "PageAnimation(enterAnim=" + this.f37784a + ", exitAnim=" + this.f37785b + ")";
    }
}
