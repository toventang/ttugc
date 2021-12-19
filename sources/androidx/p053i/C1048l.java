package androidx.p053i;

import androidx.recyclerview.widget.AbstractC1485u;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.i.l */
final class C1048l {
    static {
        Covode.recordClassIndex(1141);
    }

    /* renamed from: androidx.i.l$a */
    static class C1050a implements AbstractC1485u {

        /* renamed from: a */
        private final int f3685a;

        /* renamed from: b */
        private final AbstractC1485u f3686b;

        static {
            Covode.recordClassIndex(1143);
        }

        C1050a(int i, AbstractC1485u uVar) {
            this.f3685a = i;
            this.f3686b = uVar;
        }

        @Override // androidx.recyclerview.widget.AbstractC1485u
        /* renamed from: a */
        public final void mo3773a(int i, int i2) {
            this.f3686b.mo3773a(i + this.f3685a, i2);
        }

        @Override // androidx.recyclerview.widget.AbstractC1485u
        /* renamed from: b */
        public final void mo3775b(int i, int i2) {
            this.f3686b.mo3775b(i + this.f3685a, i2);
        }

        @Override // androidx.recyclerview.widget.AbstractC1485u
        /* renamed from: c */
        public final void mo3776c(int i, int i2) {
            AbstractC1485u uVar = this.f3686b;
            int i3 = this.f3685a;
            uVar.mo3776c(i + i3, i2 + i3);
        }

        @Override // androidx.recyclerview.widget.AbstractC1485u
        /* renamed from: a */
        public final void mo3774a(int i, int i2, Object obj) {
            this.f3686b.mo3774a(i + this.f3685a, i2, obj);
        }
    }

    /* renamed from: a */
    static int m3545a(C1445j.C1450d dVar, C1046k kVar, C1046k kVar2, int i) {
        int i2;
        int i3;
        int a = kVar.mo3761a();
        int i4 = i - a;
        int size = (kVar.size() - a) - kVar.mo3762b();
        if (i4 < 0 || i4 >= size) {
            return Math.max(0, Math.min(i, kVar2.size() - 1));
        }
        int i5 = 0;
        do {
            int i6 = i5 / 2;
            if (i5 % 2 == 1) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            int i7 = (i6 * i2) + i4;
            if (i7 >= 0 && i7 < kVar.f3675f) {
                if (i7 < dVar.f4769b) {
                    int i8 = dVar.f4768a[i7];
                    if (!((i8 & 15) == 0 || (i3 = i8 >> 4) == -1)) {
                        return i3 + kVar2.f3671b;
                    }
                } else {
                    throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i7 + ", old list size = " + dVar.f4769b);
                }
            }
            i5++;
        } while (i5 < 30);
        return Math.max(0, Math.min(i, kVar2.size() - 1));
    }
}
