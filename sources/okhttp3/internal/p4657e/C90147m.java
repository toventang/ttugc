package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;

/* renamed from: okhttp3.internal.e.m */
public final class C90147m {

    /* renamed from: a */
    int f204690a;

    /* renamed from: b */
    final int[] f204691b = new int[10];

    static {
        Covode.recordClassIndex(106319);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo144930a() {
        if ((this.f204690a & 2) != 0) {
            return this.f204691b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo144933b() {
        if ((this.f204690a & 128) != 0) {
            return this.f204691b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo144932a(int i) {
        if (((1 << i) & this.f204690a) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C90147m mo144931a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f204691b;
            if (i < iArr.length) {
                this.f204690a = (1 << i) | this.f204690a;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
