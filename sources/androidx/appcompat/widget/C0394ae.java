package androidx.appcompat.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.ae */
public class C0394ae {

    /* renamed from: a */
    public int f1520a;

    /* renamed from: b */
    public int f1521b;

    /* renamed from: c */
    int f1522c = Integer.MIN_VALUE;

    /* renamed from: d */
    int f1523d = Integer.MIN_VALUE;

    /* renamed from: e */
    int f1524e;

    /* renamed from: f */
    int f1525f;

    /* renamed from: g */
    boolean f1526g;

    /* renamed from: h */
    boolean f1527h;

    static {
        Covode.recordClassIndex(459);
    }

    C0394ae() {
    }

    /* renamed from: a */
    public final void mo1786a(int i, int i2) {
        this.f1522c = i;
        this.f1523d = i2;
        this.f1527h = true;
        if (this.f1526g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1520a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1521b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1520a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1521b = i2;
        }
    }

    /* renamed from: b */
    public final void mo1787b(int i, int i2) {
        this.f1527h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1524e = i;
            this.f1520a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1525f = i2;
            this.f1521b = i2;
        }
    }
}
