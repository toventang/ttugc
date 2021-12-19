package androidx.recyclerview.widget;

import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.e */
public final class C1424e implements AbstractC1485u {

    /* renamed from: a */
    final AbstractC1485u f4683a;

    /* renamed from: b */
    int f4684b;

    /* renamed from: c */
    int f4685c = -1;

    /* renamed from: d */
    int f4686d = -1;

    /* renamed from: e */
    Object f4687e;

    static {
        Covode.recordClassIndex(1562);
    }

    /* renamed from: a */
    public final void mo4893a() {
        int i = this.f4684b;
        if (i != 0) {
            if (i == 1) {
                this.f4683a.mo3773a(this.f4685c, this.f4686d);
            } else if (i == 2) {
                this.f4683a.mo3775b(this.f4685c, this.f4686d);
            } else if (i == 3) {
                this.f4683a.mo3774a(this.f4685c, this.f4686d, this.f4687e);
            }
            this.f4687e = null;
            this.f4684b = 0;
        }
    }

    public C1424e(AbstractC1485u uVar) {
        this.f4683a = uVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: c */
    public final void mo3776c(int i, int i2) {
        mo4893a();
        this.f4683a.mo3776c(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: b */
    public final void mo3775b(int i, int i2) {
        int i3;
        if (this.f4684b != 2 || (i3 = this.f4685c) < i || i3 > i + i2) {
            mo4893a();
            this.f4685c = i;
            this.f4686d = i2;
            this.f4684b = 2;
            return;
        }
        this.f4686d += i2;
        this.f4685c = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3773a(int i, int i2) {
        int i3;
        if (this.f4684b == 1 && i >= (i3 = this.f4685c)) {
            int i4 = this.f4686d;
            if (i <= i3 + i4) {
                this.f4686d = i4 + i2;
                this.f4685c = Math.min(i, i3);
                return;
            }
        }
        mo4893a();
        this.f4685c = i;
        this.f4686d = i2;
        this.f4684b = 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3774a(int i, int i2, Object obj) {
        int i3;
        if (this.f4684b == 3) {
            int i4 = this.f4685c;
            int i5 = this.f4686d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f4687e == obj) {
                this.f4685c = Math.min(i, i4);
                this.f4686d = Math.max(i5 + i4, i3) - this.f4685c;
                return;
            }
        }
        mo4893a();
        this.f4685c = i;
        this.f4686d = i2;
        this.f4687e = obj;
        this.f4684b = 3;
    }
}
