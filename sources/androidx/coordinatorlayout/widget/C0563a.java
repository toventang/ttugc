package androidx.coordinatorlayout.widget;

import androidx.core.p036g.C0693f;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0563a<T> {

    /* renamed from: a */
    final C0693f.AbstractC0694a<ArrayList<T>> f2435a = new C0693f.C0695b(10);

    /* renamed from: b */
    final C0497g<T, ArrayList<T>> f2436b = new C0497g<>();

    /* renamed from: c */
    private final ArrayList<T> f2437c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2438d = new HashSet<>();

    static {
        Covode.recordClassIndex(638);
    }

    /* renamed from: a */
    public final ArrayList<T> mo2542a() {
        this.f2437c.clear();
        this.f2438d.clear();
        int size = this.f2436b.size();
        for (int i = 0; i < size; i++) {
            m2168a(this.f2436b.mo2162b(i), this.f2437c, this.f2438d);
        }
        return this.f2437c;
    }

    /* renamed from: a */
    public final void mo2543a(T t) {
        if (!this.f2436b.containsKey(t)) {
            this.f2436b.put(t, null);
        }
    }

    /* renamed from: b */
    public final List mo2544b(T t) {
        return this.f2436b.get(t);
    }

    /* renamed from: a */
    private void m2168a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f2436b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2168a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
