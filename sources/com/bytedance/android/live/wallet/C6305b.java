package com.bytedance.android.live.wallet;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.b */
public final class C6305b {

    /* renamed from: a */
    public int f15767a;

    /* renamed from: b */
    public String f15768b;

    /* renamed from: c */
    public int f15769c;

    /* renamed from: d */
    public int f15770d;

    /* renamed from: e */
    public int f15771e;

    /* renamed from: f */
    public boolean f15772f;

    static {
        Covode.recordClassIndex(7021);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6305b)) {
            return false;
        }
        C6305b bVar = (C6305b) obj;
        return this.f15767a == bVar.f15767a && C89219l.m154714a(this.f15768b, bVar.f15768b) && this.f15769c == bVar.f15769c && this.f15770d == bVar.f15770d && this.f15771e == bVar.f15771e && this.f15772f == bVar.f15772f;
    }

    public final int hashCode() {
        int i = this.f15767a * 31;
        String str = this.f15768b;
        int hashCode = (((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f15769c) * 31) + this.f15770d) * 31) + this.f15771e) * 31;
        boolean z = this.f15772f;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "ExchangeDialogParams(title=" + this.f15767a + ", message=" + this.f15768b + ", cancel=" + this.f15769c + ", confirm=" + this.f15770d + ", checkBoxText=" + this.f15771e + ", showCheckBox=" + this.f15772f + ")";
    }

    private /* synthetic */ C6305b() {
        this(0, "", 0, 0, 0, false);
    }

    public C6305b(int i, String str, int i2, int i3, int i4, boolean z) {
        C89219l.m154721d(str, "");
        this.f15767a = i;
        this.f15768b = str;
        this.f15769c = i2;
        this.f15770d = i3;
        this.f15771e = i4;
        this.f15772f = z;
    }
}
