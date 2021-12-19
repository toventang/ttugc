package androidx.p053i;

import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.i.k */
public final class C1046k<T> extends AbstractList<T> {

    /* renamed from: a */
    static final List f3670a = new ArrayList();

    /* renamed from: b */
    public int f3671b;

    /* renamed from: c */
    final ArrayList<List<T>> f3672c;

    /* renamed from: d */
    public int f3673d;

    /* renamed from: e */
    public int f3674e;

    /* renamed from: f */
    public int f3675f;

    /* renamed from: g */
    int f3676g;

    /* renamed from: h */
    public int f3677h;

    /* renamed from: i */
    public int f3678i;

    /* renamed from: androidx.i.k$a */
    interface AbstractC1047a {
        static {
            Covode.recordClassIndex(1140);
        }

        /* renamed from: a */
        void mo3707a(int i, int i2, int i3);

        /* renamed from: b */
        void mo3711b(int i);

        /* renamed from: b */
        void mo3712b(int i, int i2, int i3);
    }

    static {
        Covode.recordClassIndex(1139);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final T mo3763c() {
        return this.f3672c.get(0).get(0);
    }

    public final int size() {
        return this.f3671b + this.f3675f + this.f3673d;
    }

    C1046k() {
        this.f3672c = new ArrayList<>();
        this.f3673d = 0;
        this.f3674e = 0;
        this.f3675f = 0;
        this.f3676g = 1;
        this.f3677h = 0;
        this.f3678i = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3761a() {
        int i = this.f3671b;
        int size = this.f3672c.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<T> list = this.f3672c.get(i2);
            if (!(list == null || list == f3670a)) {
                break;
            }
            i += this.f3676g;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo3762b() {
        int i = this.f3673d;
        for (int size = this.f3672c.size() - 1; size >= 0; size--) {
            List<T> list = this.f3672c.get(size);
            if (!(list == null || list == f3670a)) {
                break;
            }
            i += this.f3676g;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final T mo3764d() {
        ArrayList<List<T>> arrayList = this.f3672c;
        List<T> list = arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("leading " + this.f3671b + ", storage " + this.f3675f + ", trailing " + this.f3673d);
        for (int i = 0; i < this.f3672c.size(); i++) {
            sb.append(" ").append(this.f3672c.get(i));
        }
        return sb.toString();
    }

    C1046k(C1046k<T> kVar) {
        this.f3671b = kVar.f3671b;
        this.f3672c = new ArrayList<>(kVar.f3672c);
        this.f3673d = kVar.f3673d;
        this.f3674e = kVar.f3674e;
        this.f3675f = kVar.f3675f;
        this.f3676g = kVar.f3676g;
        this.f3677h = kVar.f3677h;
        this.f3678i = kVar.f3678i;
    }

    @Override // java.util.List, java.util.AbstractList
    public final T get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
        }
        int i2 = i - this.f3671b;
        if (i2 >= 0 && i2 < this.f3675f) {
            int i3 = this.f3676g;
            int i4 = 0;
            if (i3 <= 0) {
                int size = this.f3672c.size();
                while (i4 < size) {
                    int size2 = this.f3672c.get(i4).size();
                    if (size2 > i2) {
                        break;
                    }
                    i2 -= size2;
                    i4++;
                }
            } else {
                i4 = i2 / i3;
                i2 %= i3;
            }
            List<T> list = this.f3672c.get(i4);
            if (!(list == null || list.size() == 0)) {
                return list.get(i2);
            }
        }
        return null;
    }
}
