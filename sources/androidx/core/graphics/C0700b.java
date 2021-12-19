package androidx.core.graphics;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.graphics.b */
public final class C0700b {

    /* renamed from: a */
    public static final C0700b f2758a = new C0700b(0, 0, 0, 0);

    /* renamed from: b */
    public final int f2759b;

    /* renamed from: c */
    public final int f2760c;

    /* renamed from: d */
    public final int f2761d;

    /* renamed from: e */
    public final int f2762e;

    static {
        Covode.recordClassIndex(779);
    }

    public final int hashCode() {
        return (((((this.f2759b * 31) + this.f2760c) * 31) + this.f2761d) * 31) + this.f2762e;
    }

    public final String toString() {
        return "Insets{left=" + this.f2759b + ", top=" + this.f2760c + ", right=" + this.f2761d + ", bottom=" + this.f2762e + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0700b bVar = (C0700b) obj;
        if (this.f2762e == bVar.f2762e && this.f2759b == bVar.f2759b && this.f2761d == bVar.f2761d && this.f2760c == bVar.f2760c) {
            return true;
        }
        return false;
    }

    private C0700b(int i, int i2, int i3, int i4) {
        this.f2759b = i;
        this.f2760c = i2;
        this.f2761d = i3;
        this.f2762e = i4;
    }

    /* renamed from: a */
    public static C0700b m2468a(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f2758a;
        }
        return new C0700b(i, i2, i3, i4);
    }
}
