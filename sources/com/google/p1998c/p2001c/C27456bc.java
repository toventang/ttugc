package com.google.p1998c.p2001c;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.util.AbstractMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.c.c.bc */
public final class C27456bc<K, V> extends AbstractC27349ab<K, V> {

    /* renamed from: b */
    static final AbstractC27349ab<Object, Object> f64769b = new C27456bc(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    final transient Object[] f64770c;

    /* renamed from: d */
    private final transient int[] f64771d;

    /* renamed from: e */
    private final transient int f64772e;

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27349ab
    /* renamed from: d */
    public final boolean mo45549d() {
        return false;
    }

    /* renamed from: com.google.c.c.bc$a */
    static class C27457a<K, V> extends AbstractC27381ai<Map.Entry<K, V>> {

        /* renamed from: a */
        public final transient Object[] f64773a;

        /* renamed from: b */
        public final transient int f64774b = 0;

        /* renamed from: c */
        public final transient int f64775c;

        /* renamed from: d */
        private final transient AbstractC27349ab<K, V> f64776d;

        static {
            Covode.recordClassIndex(33037);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return true;
        }

        public final int size() {
            return this.f64775c;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27381ai
        /* renamed from: d */
        public final AbstractC27540z<Map.Entry<K, V>> mo45656d() {
            return new AbstractC27540z<Map.Entry<K, V>>() {
                /* class com.google.p1998c.p2001c.C27456bc.C27457a.C274581 */

                static {
                    Covode.recordClassIndex(33038);
                }

                @Override // com.google.p1998c.p2001c.AbstractC27536x
                /* renamed from: a */
                public final boolean mo45578a() {
                    return true;
                }

                public final int size() {
                    return C27457a.this.f64775c;
                }

                @Override // java.util.List
                public final /* synthetic */ Object get(int i) {
                    C27245k.m54228a(i, C27457a.this.f64775c);
                    int i2 = i * 2;
                    return new AbstractMap.SimpleImmutableEntry(C27457a.this.f64773a[C27457a.this.f64774b + i2], C27457a.this.f64773a[i2 + (C27457a.this.f64774b ^ 1)]);
                }
            };
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
        public final AbstractC27479br<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || !value.equals(this.f64776d.get(key))) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final int mo45633a(Object[] objArr, int i) {
            return asList().mo45633a(objArr, i);
        }

        C27457a(AbstractC27349ab<K, V> abVar, Object[] objArr, int i) {
            this.f64776d = abVar;
            this.f64773a = objArr;
            this.f64775c = i;
        }
    }

    /* renamed from: com.google.c.c.bc$b */
    static final class C27459b<K> extends AbstractC27381ai<K> {

        /* renamed from: a */
        private final transient AbstractC27349ab<K, ?> f64778a;

        /* renamed from: b */
        private final transient AbstractC27540z<K> f64779b;

        static {
            Covode.recordClassIndex(33039);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return true;
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27536x
        public final AbstractC27540z<K> asList() {
            return this.f64779b;
        }

        public final int size() {
            return this.f64778a.size();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27381ai, com.google.p1998c.p2001c.AbstractC27381ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.p1998c.p2001c.AbstractC27536x, com.google.p1998c.p2001c.AbstractC27536x, java.lang.Iterable
        public final AbstractC27479br<K> iterator() {
            return asList().iterator();
        }

        @Override // com.google.p1998c.p2001c.AbstractC27536x
        public final boolean contains(Object obj) {
            if (this.f64778a.get(obj) != null) {
                return true;
            }
            return false;
        }

        C27459b(AbstractC27349ab<K, ?> abVar, AbstractC27540z<K> zVar) {
            this.f64778a = abVar;
            this.f64779b = zVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final int mo45633a(Object[] objArr, int i) {
            return asList().mo45633a(objArr, i);
        }
    }

    /* renamed from: com.google.c.c.bc$c */
    static final class C27460c extends AbstractC27540z<Object> {

        /* renamed from: a */
        private final transient Object[] f64780a;

        /* renamed from: b */
        private final transient int f64781b;

        /* renamed from: c */
        private final transient int f64782c;

        static {
            Covode.recordClassIndex(33040);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2001c.AbstractC27536x
        /* renamed from: a */
        public final boolean mo45578a() {
            return true;
        }

        public final int size() {
            return this.f64782c;
        }

        @Override // java.util.List
        public final Object get(int i) {
            C27245k.m54228a(i, this.f64782c);
            return this.f64780a[(i * 2) + this.f64781b];
        }

        C27460c(Object[] objArr, int i, int i2) {
            this.f64780a = objArr;
            this.f64781b = i;
            this.f64782c = i2;
        }
    }

    public final int size() {
        return this.f64772e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27349ab
    /* renamed from: a */
    public final AbstractC27381ai<Map.Entry<K, V>> mo45542a() {
        return new C27457a(this, this.f64770c, this.f64772e);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27349ab
    /* renamed from: b */
    public final AbstractC27381ai<K> mo45544b() {
        return new C27459b(this, new C27460c(this.f64770c, 0, this.f64772e));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.p1998c.p2001c.AbstractC27349ab
    /* renamed from: c */
    public final AbstractC27536x<V> mo45545c() {
        return new C27460c(this.f64770c, 1, this.f64772e);
    }

    static {
        Covode.recordClassIndex(33036);
    }

    @Override // java.util.Map, com.google.p1998c.p2001c.AbstractC27349ab
    public final V get(Object obj) {
        int[] iArr = this.f64771d;
        Object[] objArr = this.f64770c;
        int i = this.f64772e;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a = C27535w.m55046a(obj.hashCode());
            while (true) {
                int i2 = a & length;
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return (V) objArr[i3 ^ 1];
                }
                a = i2 + 1;
            }
        }
    }

    /* renamed from: a */
    static <K, V> C27456bc<K, V> m54892a(int i, Object[] objArr) {
        if (i == 0) {
            return (C27456bc) f64769b;
        }
        if (i == 1) {
            C27511k.m54994a(objArr[0], objArr[1]);
            return new C27456bc<>(null, objArr, 1);
        }
        C27245k.m54242b(i, objArr.length >> 1);
        return new C27456bc<>(m54893a(objArr, i, AbstractC27381ai.m54717b(i)), objArr, i);
    }

    private C27456bc(int[] iArr, Object[] objArr, int i) {
        this.f64771d = iArr;
        this.f64770c = objArr;
        this.f64772e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r7[r1] = r3;
        r9 = r9 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] m54893a(java.lang.Object[] r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2001c.C27456bc.m54893a(java.lang.Object[], int, int):int[]");
    }
}
