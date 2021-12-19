package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.ag */
public interface AbstractC1409ag {

    /* renamed from: androidx.recyclerview.widget.ag$c */
    public interface AbstractC1414c {
        static {
            Covode.recordClassIndex(1552);
        }

        /* renamed from: a */
        int mo4885a(int i);

        /* renamed from: b */
        int mo4886b(int i);
    }

    static {
        Covode.recordClassIndex(1547);
    }

    /* renamed from: a */
    AbstractC1414c mo4883a(C1486v vVar);

    /* renamed from: a */
    C1486v mo4884a(int i);

    /* renamed from: androidx.recyclerview.widget.ag$a */
    public static class C1410a implements AbstractC1409ag {

        /* renamed from: a */
        SparseArray<C1486v> f4648a = new SparseArray<>();

        /* renamed from: b */
        int f4649b = 0;

        static {
            Covode.recordClassIndex(1548);
        }

        @Override // androidx.recyclerview.widget.AbstractC1409ag
        /* renamed from: a */
        public final AbstractC1414c mo4883a(C1486v vVar) {
            return new C1411a(vVar);
        }

        @Override // androidx.recyclerview.widget.AbstractC1409ag
        /* renamed from: a */
        public final C1486v mo4884a(int i) {
            C1486v vVar = this.f4648a.get(i);
            if (vVar != null) {
                return vVar;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i)));
        }

        /* renamed from: androidx.recyclerview.widget.ag$a$a */
        class C1411a implements AbstractC1414c {

            /* renamed from: a */
            final C1486v f4650a;

            /* renamed from: c */
            private SparseIntArray f4652c = new SparseIntArray(1);

            /* renamed from: d */
            private SparseIntArray f4653d = new SparseIntArray(1);

            static {
                Covode.recordClassIndex(1549);
            }

            @Override // androidx.recyclerview.widget.AbstractC1409ag.AbstractC1414c
            /* renamed from: a */
            public final int mo4885a(int i) {
                int indexOfKey = this.f4652c.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f4652c.valueAt(indexOfKey);
                }
                C1410a aVar = C1410a.this;
                C1486v vVar = this.f4650a;
                int i2 = aVar.f4649b;
                aVar.f4649b = i2 + 1;
                aVar.f4648a.put(i2, vVar);
                this.f4652c.put(i, i2);
                this.f4653d.put(i2, i);
                return i2;
            }

            @Override // androidx.recyclerview.widget.AbstractC1409ag.AbstractC1414c
            /* renamed from: b */
            public final int mo4886b(int i) {
                int indexOfKey = this.f4653d.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f4653d.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.f4650a.f4926c);
            }

            C1411a(C1486v vVar) {
                this.f4650a = vVar;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ag$b */
    public static class C1412b implements AbstractC1409ag {

        /* renamed from: a */
        SparseArray<List<C1486v>> f4654a = new SparseArray<>();

        static {
            Covode.recordClassIndex(1550);
        }

        @Override // androidx.recyclerview.widget.AbstractC1409ag
        /* renamed from: a */
        public final AbstractC1414c mo4883a(C1486v vVar) {
            return new C1413a(vVar);
        }

        /* renamed from: androidx.recyclerview.widget.ag$b$a */
        class C1413a implements AbstractC1414c {

            /* renamed from: a */
            final C1486v f4655a;

            static {
                Covode.recordClassIndex(1551);
            }

            @Override // androidx.recyclerview.widget.AbstractC1409ag.AbstractC1414c
            /* renamed from: b */
            public final int mo4886b(int i) {
                return i;
            }

            @Override // androidx.recyclerview.widget.AbstractC1409ag.AbstractC1414c
            /* renamed from: a */
            public final int mo4885a(int i) {
                List<C1486v> list = C1412b.this.f4654a.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    C1412b.this.f4654a.put(i, list);
                }
                if (!list.contains(this.f4655a)) {
                    list.add(this.f4655a);
                }
                return i;
            }

            C1413a(C1486v vVar) {
                this.f4655a = vVar;
            }
        }

        @Override // androidx.recyclerview.widget.AbstractC1409ag
        /* renamed from: a */
        public final C1486v mo4884a(int i) {
            List<C1486v> list = this.f4654a.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type ".concat(String.valueOf(i)));
        }
    }
}
