package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.f */
public final class C1425f {

    /* renamed from: a */
    final AbstractC1427b f4688a;

    /* renamed from: b */
    final C1426a f4689b = new C1426a();

    /* renamed from: c */
    final List<View> f4690c = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.f$b */
    public interface AbstractC1427b {
        static {
            Covode.recordClassIndex(1565);
        }

        /* renamed from: a */
        int mo4538a();

        /* renamed from: a */
        int mo4539a(View view);

        /* renamed from: a */
        void mo4540a(int i);

        /* renamed from: a */
        void mo4541a(View view, int i);

        /* renamed from: a */
        void mo4542a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        View mo4543b(int i);

        /* renamed from: b */
        RecyclerView.ViewHolder mo4544b(View view);

        /* renamed from: b */
        void mo4545b();

        /* renamed from: c */
        void mo4546c(int i);

        /* renamed from: c */
        void mo4547c(View view);

        /* renamed from: d */
        void mo4548d(View view);
    }

    static {
        Covode.recordClassIndex(1563);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.f$a */
    public static class C1426a {

        /* renamed from: a */
        long f4691a;

        /* renamed from: b */
        C1426a f4692b;

        static {
            Covode.recordClassIndex(1564);
        }

        C1426a() {
        }

        /* renamed from: a */
        private void m4868a() {
            if (this.f4692b == null) {
                this.f4692b = new C1426a();
            }
        }

        public final String toString() {
            if (this.f4692b == null) {
                return Long.toBinaryString(this.f4691a);
            }
            return this.f4692b.toString() + "xx" + Long.toBinaryString(this.f4691a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4907a(int i) {
            C1426a aVar = this;
            while (i >= 64) {
                aVar.m4868a();
                aVar = aVar.f4692b;
                i -= 64;
            }
            aVar.f4691a |= 1 << i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4909b(int i) {
            C1426a aVar = this;
            while (i >= 64) {
                aVar = aVar.f4692b;
                if (aVar != null) {
                    i -= 64;
                } else {
                    return;
                }
            }
            aVar.f4691a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo4910c(int i) {
            C1426a aVar = this;
            while (i >= 64) {
                aVar.m4868a();
                aVar = aVar.f4692b;
                i -= 64;
            }
            if ((aVar.f4691a & (1 << i)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final int mo4912e(int i) {
            C1426a aVar = this.f4692b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f4691a);
                }
                return Long.bitCount(this.f4691a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f4691a & ((1 << i) - 1));
            } else {
                return aVar.mo4912e(i - 64) + Long.bitCount(this.f4691a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo4911d(int i) {
            boolean z;
            int i2 = i;
            C1426a aVar = this;
            while (i2 >= 64) {
                aVar.m4868a();
                aVar = aVar.f4692b;
                i2 -= 64;
            }
            long j = 1 << i2;
            long j2 = aVar.f4691a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (j ^ -1);
            aVar.f4691a = j3;
            long j4 = j - 1;
            aVar.f4691a = (j3 & j4) | Long.rotateRight((j4 ^ -1) & j3, 1);
            C1426a aVar2 = aVar.f4692b;
            if (aVar2 != null) {
                if (aVar2.mo4910c(0)) {
                    aVar.mo4907a(63);
                }
                aVar.f4692b.mo4911d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4908a(int i, boolean z) {
            boolean z2;
            C1426a aVar = this;
            while (i >= 64) {
                aVar.m4868a();
                aVar = aVar.f4692b;
                i -= 64;
            }
            while (true) {
                long j = aVar.f4691a;
                if ((Long.MIN_VALUE & j) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j2 = (1 << i) - 1;
                aVar.f4691a = ((j & (j2 ^ -1)) << 1) | (j & j2);
                if (z) {
                    aVar.mo4907a(i);
                } else {
                    aVar.mo4909b(i);
                }
                if (z2 || aVar.f4692b != null) {
                    aVar.m4868a();
                    aVar = aVar.f4692b;
                    z = z2;
                    i = 0;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo4899b() {
        return this.f4688a.mo4538a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo4894a() {
        return this.f4688a.mo4538a() - this.f4690c.size();
    }

    public final String toString() {
        return this.f4689b.toString() + ", hidden list:" + this.f4690c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final View mo4903c(int i) {
        return this.f4688a.mo4543b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo4905d(View view) {
        return this.f4690c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final View mo4900b(int i) {
        return this.f4688a.mo4543b(m4855e(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4904d(int i) {
        int e = m4855e(i);
        this.f4689b.mo4911d(e);
        this.f4688a.mo4546c(e);
    }

    C1425f(AbstractC1427b bVar) {
        this.f4688a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4895a(int i) {
        int e = m4855e(i);
        View b = this.f4688a.mo4543b(e);
        if (b != null) {
            if (this.f4689b.mo4911d(e)) {
                mo4901b(b);
            }
            this.f4688a.mo4540a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo4901b(View view) {
        if (!this.f4690c.remove(view)) {
            return false;
        }
        this.f4688a.mo4548d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo4902c(View view) {
        int a = this.f4688a.mo4539a(view);
        if (a != -1 && !this.f4689b.mo4910c(a)) {
            return a - this.f4689b.mo4912e(a);
        }
        return -1;
    }

    /* renamed from: e */
    private int m4855e(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f4688a.mo4538a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f4689b.mo4912e(i2));
            if (e == 0) {
                while (this.f4689b.mo4910c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4896a(View view) {
        this.f4690c.add(view);
        this.f4688a.mo4547c(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4898a(View view, int i, boolean z) {
        int e;
        if (i < 0) {
            e = this.f4688a.mo4538a();
        } else {
            e = m4855e(i);
        }
        this.f4689b.mo4908a(e, z);
        if (z) {
            mo4896a(view);
        }
        this.f4688a.mo4541a(view, e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4897a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int e;
        if (i < 0) {
            e = this.f4688a.mo4538a();
        } else {
            e = m4855e(i);
        }
        this.f4689b.mo4908a(e, z);
        if (z) {
            mo4896a(view);
        }
        this.f4688a.mo4542a(view, e, layoutParams);
    }
}
