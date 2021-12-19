package androidx.recyclerview.widget;

import androidx.core.p036g.C0693f;
import androidx.recyclerview.widget.C1489w;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
public final class C1387a implements C1489w.AbstractC1490a {

    /* renamed from: a */
    final ArrayList<C1389b> f4609a;

    /* renamed from: b */
    final ArrayList<C1389b> f4610b;

    /* renamed from: c */
    final AbstractC1388a f4611c;

    /* renamed from: d */
    Runnable f4612d;

    /* renamed from: e */
    final boolean f4613e;

    /* renamed from: f */
    final C1489w f4614f;

    /* renamed from: g */
    int f4615g;

    /* renamed from: h */
    private C0693f.AbstractC0694a<C1389b> f4616h;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface AbstractC1388a {
        static {
            Covode.recordClassIndex(1526);
        }

        /* renamed from: a */
        RecyclerView.ViewHolder mo4549a(int i);

        /* renamed from: a */
        void mo4550a(int i, int i2);

        /* renamed from: a */
        void mo4551a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo4552a(C1389b bVar);

        /* renamed from: b */
        void mo4553b(int i, int i2);

        /* renamed from: b */
        void mo4554b(C1389b bVar);

        /* renamed from: c */
        void mo4555c(int i, int i2);

        /* renamed from: d */
        void mo4556d(int i, int i2);
    }

    static {
        Covode.recordClassIndex(1525);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class C1389b {

        /* renamed from: a */
        int f4617a;

        /* renamed from: b */
        int f4618b;

        /* renamed from: c */
        Object f4619c;

        /* renamed from: d */
        int f4620d;

        static {
            Covode.recordClassIndex(1527);
        }

        public final int hashCode() {
            return (((this.f4617a * 31) + this.f4618b) * 31) + this.f4620d;
        }

        public final String toString() {
            String str;
            StringBuilder append = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
            int i = this.f4617a;
            if (i == 1) {
                str = "add";
            } else if (i == 2) {
                str = "rm";
            } else if (i == 4) {
                str = "up";
            } else if (i != 8) {
                str = "??";
            } else {
                str = "mv";
            }
            return append.append(str).append(",s:").append(this.f4618b).append("c:").append(this.f4620d).append(",p:").append(this.f4619c).append("]").toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1389b)) {
                return false;
            }
            C1389b bVar = (C1389b) obj;
            int i = this.f4617a;
            if (i != bVar.f4617a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4620d - this.f4618b) == 1 && this.f4620d == bVar.f4618b && this.f4618b == bVar.f4620d) {
                return true;
            }
            if (this.f4620d != bVar.f4620d || this.f4618b != bVar.f4618b) {
                return false;
            }
            Object obj2 = this.f4619c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4619c)) {
                    return false;
                }
            } else if (bVar.f4619c != null) {
                return false;
            }
            return true;
        }

        C1389b(int i, int i2, int i3, Object obj) {
            this.f4617a = i;
            this.f4618b = i2;
            this.f4620d = i3;
            this.f4619c = obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4837a() {
        m4738a(this.f4609a);
        m4738a(this.f4610b);
        this.f4615g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo4844d() {
        if (this.f4609a.size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo4846f() {
        if (this.f4610b.isEmpty() || this.f4609a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4843c() {
        int size = this.f4610b.size();
        for (int i = 0; i < size; i++) {
            this.f4611c.mo4554b(this.f4610b.get(i));
        }
        m4738a(this.f4610b);
        this.f4615g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo4845e() {
        mo4843c();
        int size = this.f4609a.size();
        for (int i = 0; i < size; i++) {
            C1389b bVar = this.f4609a.get(i);
            int i2 = bVar.f4617a;
            if (i2 == 1) {
                this.f4611c.mo4554b(bVar);
                this.f4611c.mo4555c(bVar.f4618b, bVar.f4620d);
            } else if (i2 == 2) {
                this.f4611c.mo4554b(bVar);
                this.f4611c.mo4550a(bVar.f4618b, bVar.f4620d);
            } else if (i2 == 4) {
                this.f4611c.mo4554b(bVar);
                this.f4611c.mo4551a(bVar.f4618b, bVar.f4620d, bVar.f4619c);
            } else if (i2 == 8) {
                this.f4611c.mo4554b(bVar);
                this.f4611c.mo4556d(bVar.f4618b, bVar.f4620d);
            }
            Runnable runnable = this.f4612d;
            if (runnable != null) {
                runnable.run();
            }
        }
        m4738a(this.f4609a);
        this.f4615g = 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0005 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4841b() {
        /*
        // Method dump skipped, instructions count: 738
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1387a.mo4841b():void");
    }

    C1387a(AbstractC1388a aVar) {
        this(aVar, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo4840b(int i) {
        return mo4835a(i, 0);
    }

    /* renamed from: a */
    private void m4738a(List<C1389b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4838a(list.get(i));
        }
        list.clear();
    }

    /* renamed from: c */
    private void m4741c(C1389b bVar) {
        this.f4610b.add(bVar);
        int i = bVar.f4617a;
        if (i == 1) {
            this.f4611c.mo4555c(bVar.f4618b, bVar.f4620d);
        } else if (i == 2) {
            this.f4611c.mo4553b(bVar.f4618b, bVar.f4620d);
        } else if (i == 4) {
            this.f4611c.mo4551a(bVar.f4618b, bVar.f4620d, bVar.f4619c);
        } else if (i == 8) {
            this.f4611c.mo4556d(bVar.f4618b, bVar.f4620d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(bVar)));
        }
    }

    /* renamed from: d */
    private boolean m4742d(int i) {
        int size = this.f4610b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1389b bVar = this.f4610b.get(i2);
            if (bVar.f4617a == 8) {
                if (mo4835a(bVar.f4620d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f4617a == 1) {
                int i3 = bVar.f4618b + bVar.f4620d;
                for (int i4 = bVar.f4618b; i4 < i3; i4++) {
                    if (mo4835a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final int mo4842c(int i) {
        int size = this.f4609a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1389b bVar = this.f4609a.get(i2);
            int i3 = bVar.f4617a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (bVar.f4618b == i) {
                            i = bVar.f4620d;
                        } else {
                            if (bVar.f4618b < i) {
                                i--;
                            }
                            if (bVar.f4620d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (bVar.f4618b > i) {
                    continue;
                } else if (bVar.f4618b + bVar.f4620d > i) {
                    return -1;
                } else {
                    i -= bVar.f4620d;
                }
            } else if (bVar.f4618b <= i) {
                i += bVar.f4620d;
            }
        }
        return i;
    }

    /* renamed from: b */
    private void m4740b(C1389b bVar) {
        int i;
        if (bVar.f4617a == 1 || bVar.f4617a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = m4739b(bVar.f4618b, bVar.f4617a);
        int i2 = bVar.f4618b;
        int i3 = bVar.f4617a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(bVar)));
        }
        int i4 = 1;
        for (int i5 = 1; i5 < bVar.f4620d; i5++) {
            int b2 = m4739b(bVar.f4618b + (i * i5), bVar.f4617a);
            int i6 = bVar.f4617a;
            if (i6 == 2 ? b2 != b : !(i6 == 4 && b2 == b + 1)) {
                C1389b a = mo4836a(bVar.f4617a, b, i4, bVar.f4619c);
                m4737a(a, i2);
                mo4838a(a);
                if (bVar.f4617a == 4) {
                    i2 += i4;
                }
                b = b2;
                i4 = 1;
            } else {
                i4++;
            }
        }
        Object obj = bVar.f4619c;
        mo4838a(bVar);
        if (i4 > 0) {
            C1389b a2 = mo4836a(bVar.f4617a, b, i4, obj);
            m4737a(a2, i2);
            mo4838a(a2);
        }
    }

    @Override // androidx.recyclerview.widget.C1489w.AbstractC1490a
    /* renamed from: a */
    public final void mo4838a(C1389b bVar) {
        if (!this.f4613e) {
            bVar.f4619c = null;
            this.f4616h.release(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4839a(int i) {
        if ((i & this.f4615g) != 0) {
            return true;
        }
        return false;
    }

    private C1387a(AbstractC1388a aVar, byte b) {
        this.f4616h = new C0693f.C0695b(30);
        this.f4609a = new ArrayList<>();
        this.f4610b = new ArrayList<>();
        this.f4615g = 0;
        this.f4611c = aVar;
        this.f4613e = false;
        this.f4614f = new C1489w(this);
    }

    /* renamed from: a */
    private void m4737a(C1389b bVar, int i) {
        this.f4611c.mo4552a(bVar);
        int i2 = bVar.f4617a;
        if (i2 == 2) {
            this.f4611c.mo4550a(i, bVar.f4620d);
        } else if (i2 == 4) {
            this.f4611c.mo4551a(i, bVar.f4620d, bVar.f4619c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo4835a(int i, int i2) {
        int size = this.f4610b.size();
        while (i2 < size) {
            C1389b bVar = this.f4610b.get(i2);
            if (bVar.f4617a == 8) {
                if (bVar.f4618b == i) {
                    i = bVar.f4620d;
                } else {
                    if (bVar.f4618b < i) {
                        i--;
                    }
                    if (bVar.f4620d <= i) {
                        i++;
                    }
                }
            } else if (bVar.f4618b > i) {
                continue;
            } else if (bVar.f4617a == 2) {
                if (i < bVar.f4618b + bVar.f4620d) {
                    return -1;
                }
                i -= bVar.f4620d;
            } else if (bVar.f4617a == 1) {
                i += bVar.f4620d;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: b */
    private int m4739b(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f4610b.size() - 1; size >= 0; size--) {
            C1389b bVar = this.f4610b.get(size);
            if (bVar.f4617a == 8) {
                if (bVar.f4618b < bVar.f4620d) {
                    i3 = bVar.f4618b;
                    i4 = bVar.f4620d;
                } else {
                    i3 = bVar.f4620d;
                    i4 = bVar.f4618b;
                }
                if (i < i3 || i > i4) {
                    if (i < bVar.f4618b) {
                        if (i2 == 1) {
                            bVar.f4618b++;
                            bVar.f4620d++;
                        } else if (i2 == 2) {
                            bVar.f4618b--;
                            bVar.f4620d--;
                        }
                    }
                } else if (i3 == bVar.f4618b) {
                    if (i2 == 1) {
                        bVar.f4620d++;
                    } else if (i2 == 2) {
                        bVar.f4620d--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f4618b++;
                    } else if (i2 == 2) {
                        bVar.f4618b--;
                    }
                    i--;
                }
            } else if (bVar.f4618b <= i) {
                if (bVar.f4617a == 1) {
                    i -= bVar.f4620d;
                } else if (bVar.f4617a == 2) {
                    i += bVar.f4620d;
                }
            } else if (i2 == 1) {
                bVar.f4618b++;
            } else if (i2 == 2) {
                bVar.f4618b--;
            }
        }
        for (int size2 = this.f4610b.size() - 1; size2 >= 0; size2--) {
            C1389b bVar2 = this.f4610b.get(size2);
            if (bVar2.f4617a == 8) {
                if (bVar2.f4620d == bVar2.f4618b || bVar2.f4620d < 0) {
                    this.f4610b.remove(size2);
                    mo4838a(bVar2);
                }
            } else if (bVar2.f4620d <= 0) {
                this.f4610b.remove(size2);
                mo4838a(bVar2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C1489w.AbstractC1490a
    /* renamed from: a */
    public final C1389b mo4836a(int i, int i2, int i3, Object obj) {
        C1389b acquire = this.f4616h.acquire();
        if (acquire == null) {
            return new C1389b(i, i2, i3, obj);
        }
        acquire.f4617a = i;
        acquire.f4618b = i2;
        acquire.f4620d = i3;
        acquire.f4619c = obj;
        return acquire;
    }
}
