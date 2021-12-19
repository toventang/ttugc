package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.j */
public final class C1445j {

    /* renamed from: a */
    private static final Comparator<C1449c> f4762a = new Comparator<C1449c>() {
        /* class androidx.recyclerview.widget.C1445j.C14461 */

        static {
            Covode.recordClassIndex(1584);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C1449c cVar, C1449c cVar2) {
            return cVar.f4765a - cVar2.f4765a;
        }
    };

    /* renamed from: androidx.recyclerview.widget.j$a */
    public static abstract class AbstractC1447a {
        static {
            Covode.recordClassIndex(1585);
        }

        /* renamed from: a */
        public abstract int mo3768a();

        /* renamed from: a */
        public Object mo3769a(int i, int i2) {
            return null;
        }

        /* renamed from: b */
        public abstract int mo3770b();

        /* renamed from: b */
        public abstract boolean mo3771b(int i, int i2);

        /* renamed from: c */
        public abstract boolean mo3772c(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.j$e */
    public static abstract class AbstractC1451e<T> {
        static {
            Covode.recordClassIndex(1589);
        }

        /* renamed from: a */
        public abstract boolean mo4953a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo4954b(T t, T t2);

        /* renamed from: c */
        public Object mo4955c(T t, T t2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$g */
    public static class C1453g {

        /* renamed from: a */
        int f4778a;

        /* renamed from: b */
        int f4779b;

        /* renamed from: c */
        int f4780c;

        /* renamed from: d */
        int f4781d;

        static {
            Covode.recordClassIndex(1591);
        }

        public C1453g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo4956a() {
            return this.f4779b - this.f4778a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo4957b() {
            return this.f4781d - this.f4780c;
        }

        public C1453g(int i, int i2) {
            this.f4778a = 0;
            this.f4779b = i;
            this.f4780c = 0;
            this.f4781d = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$h */
    public static class C1454h {

        /* renamed from: a */
        public int f4782a;

        /* renamed from: b */
        public int f4783b;

        /* renamed from: c */
        public int f4784c;

        /* renamed from: d */
        public int f4785d;

        /* renamed from: e */
        public boolean f4786e;

        static {
            Covode.recordClassIndex(1592);
        }

        C1454h() {
        }

        /* renamed from: c */
        private boolean m4942c() {
            if (this.f4785d - this.f4783b != this.f4784c - this.f4782a) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private boolean m4943d() {
            if (this.f4785d - this.f4783b > this.f4784c - this.f4782a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo4958a() {
            return Math.min(this.f4784c - this.f4782a, this.f4785d - this.f4783b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C1449c mo4959b() {
            if (!m4942c()) {
                int i = this.f4782a;
                return new C1449c(i, this.f4783b, this.f4784c - i);
            } else if (this.f4786e) {
                return new C1449c(this.f4782a, this.f4783b, mo4958a());
            } else {
                if (m4943d()) {
                    return new C1449c(this.f4782a, this.f4783b + 1, mo4958a());
                }
                return new C1449c(this.f4782a + 1, this.f4783b, mo4958a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$c */
    public static class C1449c {

        /* renamed from: a */
        public final int f4765a;

        /* renamed from: b */
        public final int f4766b;

        /* renamed from: c */
        public final int f4767c;

        static {
            Covode.recordClassIndex(1587);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo4949a() {
            return this.f4765a + this.f4767c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo4950b() {
            return this.f4766b + this.f4767c;
        }

        C1449c(int i, int i2, int i3) {
            this.f4765a = i;
            this.f4766b = i2;
            this.f4767c = i3;
        }
    }

    static {
        Covode.recordClassIndex(1583);
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    public static class C1450d {

        /* renamed from: a */
        public final int[] f4768a;

        /* renamed from: b */
        public final int f4769b;

        /* renamed from: c */
        private final List<C1449c> f4770c;

        /* renamed from: d */
        private final int[] f4771d;

        /* renamed from: e */
        private final AbstractC1447a f4772e;

        /* renamed from: f */
        private final int f4773f;

        /* renamed from: g */
        private final boolean f4774g;

        static {
            Covode.recordClassIndex(1588);
        }

        /* renamed from: a */
        private void m4934a() {
            int i;
            int i2;
            Iterator<C1449c> it = this.f4770c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1449c next = it.next();
                for (int i3 = 0; i3 < next.f4767c; i3++) {
                    int i4 = next.f4765a + i3;
                    int i5 = next.f4766b + i3;
                    if (this.f4772e.mo3772c(i4, i5)) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    this.f4768a[i4] = (i5 << 4) | i2;
                    this.f4771d[i5] = (i4 << 4) | i2;
                }
            }
            if (this.f4774g) {
                int i6 = 0;
                for (C1449c cVar : this.f4770c) {
                    while (i6 < cVar.f4765a) {
                        if (this.f4768a[i6] == 0) {
                            int size = this.f4770c.size();
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                if (i7 >= size) {
                                    break;
                                }
                                C1449c cVar2 = this.f4770c.get(i7);
                                while (i8 < cVar2.f4766b) {
                                    if (this.f4771d[i8] != 0 || !this.f4772e.mo3771b(i6, i8)) {
                                        i8++;
                                    } else {
                                        if (this.f4772e.mo3772c(i6, i8)) {
                                            i = 8;
                                        } else {
                                            i = 4;
                                        }
                                        this.f4768a[i6] = (i8 << 4) | i;
                                        this.f4771d[i8] = i | (i6 << 4);
                                    }
                                }
                                i8 = cVar2.mo4950b();
                                i7++;
                            }
                        }
                        i6++;
                    }
                    i6 = cVar.mo4949a();
                }
            }
        }

        /* renamed from: a */
        public final void mo4951a(RecyclerView.AbstractC1350a aVar) {
            mo4952a(new C1415b(aVar));
        }

        /* renamed from: a */
        public final void mo4952a(AbstractC1485u uVar) {
            C1424e eVar;
            int i;
            if (uVar instanceof C1424e) {
                eVar = (C1424e) uVar;
            } else {
                eVar = new C1424e(uVar);
            }
            int i2 = this.f4769b;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f4769b;
            int i4 = this.f4773f;
            for (int size = this.f4770c.size() - 1; size >= 0; size--) {
                C1449c cVar = this.f4770c.get(size);
                int a = cVar.mo4949a();
                int b = cVar.mo4950b();
                while (true) {
                    if (i3 <= a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f4768a[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C1452f a2 = m4933a(arrayDeque, i6, false);
                        if (a2 != null) {
                            int i7 = (i2 - a2.f4776b) - 1;
                            eVar.mo3776c(i3, i7);
                            if ((i5 & 4) != 0) {
                                eVar.mo3774a(i7, 1, this.f4772e.mo3769a(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C1452f(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        eVar.mo3775b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > b) {
                    i4--;
                    int i8 = this.f4771d[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C1452f a3 = m4933a(arrayDeque, i9, true);
                        if (a3 == null) {
                            arrayDeque.add(new C1452f(i4, i2 - i3, false));
                        } else {
                            eVar.mo3776c((i2 - a3.f4776b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                eVar.mo3774a(i3, 1, this.f4772e.mo3769a(i9, i4));
                            }
                        }
                    } else {
                        eVar.mo3773a(i3, 1);
                        i2++;
                    }
                }
                int i10 = cVar.f4765a;
                int i11 = cVar.f4766b;
                for (i = 0; i < cVar.f4767c; i++) {
                    if ((this.f4768a[i10] & 15) == 2) {
                        eVar.mo3774a(i10, 1, this.f4772e.mo3769a(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = cVar.f4765a;
                i4 = cVar.f4766b;
            }
            eVar.mo4893a();
        }

        /* renamed from: a */
        private static C1452f m4933a(Collection<C1452f> collection, int i, boolean z) {
            C1452f fVar;
            Iterator<C1452f> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = it.next();
                if (fVar.f4775a == i && fVar.f4777c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C1452f next = it.next();
                if (z) {
                    next.f4776b--;
                } else {
                    next.f4776b++;
                }
            }
            return fVar;
        }

        C1450d(AbstractC1447a aVar, List<C1449c> list, int[] iArr, int[] iArr2, boolean z) {
            C1449c cVar;
            this.f4770c = list;
            this.f4768a = iArr;
            this.f4771d = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4772e = aVar;
            int a = aVar.mo3768a();
            this.f4769b = a;
            int b = aVar.mo3770b();
            this.f4773f = b;
            this.f4774g = z;
            if (list.isEmpty() || (cVar = list.get(0)) == null || cVar.f4765a != 0 || cVar.f4766b != 0) {
                list.add(0, new C1449c(0, 0, 0));
            }
            list.add(new C1449c(a, b, 0));
            m4934a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$b */
    public static class C1448b {

        /* renamed from: a */
        public final int[] f4763a;

        /* renamed from: b */
        private final int f4764b;

        static {
            Covode.recordClassIndex(1586);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo4947a(int i) {
            return this.f4763a[i + this.f4764b];
        }

        C1448b(int i) {
            int[] iArr = new int[i];
            this.f4763a = iArr;
            this.f4764b = iArr.length / 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4948a(int i, int i2) {
            this.f4763a[i + this.f4764b] = i2;
        }
    }

    /* renamed from: a */
    public static C1450d m4921a(AbstractC1447a aVar) {
        return m4922a(aVar, true);
    }

    /* renamed from: a */
    public static C1450d m4922a(AbstractC1447a aVar, boolean z) {
        C1453g gVar;
        int a = aVar.mo3768a();
        int b = aVar.mo3770b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1453g(a, b));
        int i = ((((a + b) + 1) / 2) * 2) + 1;
        C1448b bVar = new C1448b(i);
        C1448b bVar2 = new C1448b(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1453g gVar2 = (C1453g) arrayList2.remove(arrayList2.size() - 1);
            C1454h a2 = m4923a(gVar2, aVar, bVar, bVar2);
            if (a2 != null) {
                if (a2.mo4958a() > 0) {
                    arrayList.add(a2.mo4959b());
                }
                if (arrayList3.isEmpty()) {
                    gVar = new C1453g();
                } else {
                    gVar = (C1453g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.f4778a = gVar2.f4778a;
                gVar.f4780c = gVar2.f4780c;
                gVar.f4779b = a2.f4782a;
                gVar.f4781d = a2.f4783b;
                arrayList2.add(gVar);
                gVar2.f4779b = gVar2.f4779b;
                gVar2.f4781d = gVar2.f4781d;
                gVar2.f4778a = a2.f4784c;
                gVar2.f4780c = a2.f4785d;
                arrayList2.add(gVar2);
            } else {
                arrayList3.add(gVar2);
            }
        }
        Collections.sort(arrayList, f4762a);
        return new C1450d(aVar, arrayList, bVar.f4763a, bVar2.f4763a, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$f */
    public static class C1452f {

        /* renamed from: a */
        int f4775a;

        /* renamed from: b */
        int f4776b;

        /* renamed from: c */
        boolean f4777c;

        static {
            Covode.recordClassIndex(1590);
        }

        C1452f(int i, int i2, boolean z) {
            this.f4775a = i;
            this.f4776b = i2;
            this.f4777c = z;
        }
    }

    /* renamed from: a */
    private static C1454h m4923a(C1453g gVar, AbstractC1447a aVar, C1448b bVar, C1448b bVar2) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (gVar.mo4956a() <= 0 || gVar.mo4957b() <= 0) {
            return null;
        }
        int i8 = 1;
        int a = ((gVar.mo4956a() + gVar.mo4957b()) + 1) / 2;
        bVar.mo4948a(1, gVar.f4778a);
        bVar2.mo4948a(1, gVar.f4779b);
        int i9 = 0;
        while (i9 < a) {
            if (Math.abs(gVar.mo4956a() - gVar.mo4957b()) % 2 == i8) {
                z = true;
            } else {
                z = false;
            }
            int a2 = gVar.mo4956a() - gVar.mo4957b();
            int i10 = -i9;
            for (int i11 = i10; i11 <= i9; i11 += 2) {
                if (i11 == i10 || (i11 != i9 && bVar.mo4947a(i11 + 1) > bVar.mo4947a(i11 - 1))) {
                    i5 = bVar.mo4947a(i11 + 1);
                    i6 = i5;
                } else {
                    i5 = bVar.mo4947a(i11 - 1);
                    i6 = i5 + 1;
                }
                int i12 = (gVar.f4780c + (i6 - gVar.f4778a)) - i11;
                int i13 = (i9 == 0 || i6 != i5) ? i12 : i12 - 1;
                while (i6 < gVar.f4779b && i12 < gVar.f4781d && aVar.mo3771b(i6, i12)) {
                    i6++;
                    i12++;
                }
                bVar.mo4948a(i11, i6);
                if (z && (i7 = a2 - i11) >= i10 + 1 && i7 <= i9 - 1 && bVar2.mo4947a(i7) <= i6) {
                    C1454h hVar = new C1454h();
                    hVar.f4782a = i5;
                    hVar.f4783b = i13;
                    hVar.f4784c = i6;
                    hVar.f4785d = i12;
                    hVar.f4786e = false;
                    return hVar;
                }
            }
            if ((gVar.mo4956a() - gVar.mo4957b()) % 2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int a3 = gVar.mo4956a() - gVar.mo4957b();
            for (int i14 = i10; i14 <= i9; i14 += 2) {
                if (i14 == i10 || (i14 != i9 && bVar2.mo4947a(i14 + 1) < bVar2.mo4947a(i14 - 1))) {
                    i = bVar2.mo4947a(i14 + 1);
                    i2 = i;
                } else {
                    i = bVar2.mo4947a(i14 - 1);
                    i2 = i - 1;
                }
                int i15 = gVar.f4781d - ((gVar.f4779b - i2) - i14);
                if (i9 == 0 || i2 != i) {
                    i3 = i15;
                } else {
                    i3 = i15 + 1;
                }
                while (i2 > gVar.f4778a && i15 > gVar.f4780c && aVar.mo3771b(i2 - 1, i15 - 1)) {
                    i2--;
                    i15--;
                }
                bVar2.mo4948a(i14, i2);
                if (z2 && (i4 = a3 - i14) >= i10 && i4 <= i9 && bVar.mo4947a(i4) >= i2) {
                    C1454h hVar2 = new C1454h();
                    hVar2.f4782a = i2;
                    hVar2.f4783b = i15;
                    hVar2.f4784c = i;
                    hVar2.f4785d = i3;
                    hVar2.f4786e = true;
                    return hVar2;
                }
            }
            i9++;
            i8 = 1;
        }
        return null;
    }
}
