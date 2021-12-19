package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1835g.AbstractC24107d;
import com.facebook.common.p1835g.AbstractC24109f;
import com.facebook.common.p1835g.EnumC24105b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.a */
public abstract class AbstractC24472a<V> implements AbstractC24109f<V> {

    /* renamed from: a */
    final AbstractC24107d f58126a;

    /* renamed from: b */
    final C24480ad f58127b;

    /* renamed from: c */
    final SparseArray<C24487f<V>> f58128c;

    /* renamed from: d */
    final Set<V> f58129d;

    /* renamed from: e */
    final C24473a f58130e;

    /* renamed from: f */
    final C24473a f58131f;

    /* renamed from: g */
    private final Class<?> f58132g = getClass();

    /* renamed from: h */
    private boolean f58133h;

    /* renamed from: i */
    private final AbstractC24481ae f58134i;

    static {
        Covode.recordClassIndex(28616);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract V mo40339b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo40340b(V v);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo40341c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo40342c(V v);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo40343d(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.a$a */
    public static class C24473a {

        /* renamed from: a */
        int f58135a;

        /* renamed from: b */
        int f58136b;

        static {
            Covode.recordClassIndex(28617);
        }

        C24473a() {
        }

        /* renamed from: a */
        public final void mo40346a(int i) {
            this.f58135a++;
            this.f58136b += i;
        }

        /* renamed from: b */
        public final void mo40347b(int i) {
            int i2;
            int i3 = this.f58136b;
            if (i3 < i || (i2 = this.f58135a) <= 0) {
                C24099a.m45660d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f58136b), Integer.valueOf(this.f58135a));
                return;
            }
            this.f58135a = i2 - 1;
            this.f58136b = i3 - i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40338a() {
        this.f58126a.mo34255a(this);
    }

    /* renamed from: b */
    private synchronized void m46721b() {
        boolean z;
        if (m46724e()) {
            if (this.f58131f.f58136b != 0) {
                z = false;
                C24091i.m45622b(z);
            }
        }
        z = true;
        C24091i.m45622b(z);
    }

    /* renamed from: d */
    private synchronized void m46723d() {
        if (m46724e()) {
            mo40373f(this.f58127b.f58168b);
        }
    }

    /* renamed from: e */
    private synchronized boolean m46724e() {
        if (this.f58130e.f58136b + this.f58131f.f58136b > this.f58127b.f58168b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private synchronized void m46722c() {
        SparseIntArray sparseIntArray = this.f58127b.f58169c;
        if (sparseIntArray != null) {
            this.f58128c.clear();
            for (int i = 0; i < sparseIntArray.size(); i++) {
                int keyAt = sparseIntArray.keyAt(i);
                this.f58128c.put(keyAt, new C24487f<>(mo40343d(keyAt), sparseIntArray.valueAt(i), 0, this.f58127b.f58172f));
            }
            this.f58133h = false;
            return;
        }
        this.f58133h = true;
    }

    /* renamed from: f */
    private void m46725f() {
        if (C24099a.m45645a(2)) {
            C24099a.m45638a(this.f58132g, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f58130e.f58135a), Integer.valueOf(this.f58130e.f58136b), Integer.valueOf(this.f58131f.f58135a), Integer.valueOf(this.f58131f.f58136b));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo40344d(V v) {
        C24091i.m45617a(v);
        return true;
    }

    /* renamed from: g */
    private synchronized C24487f<V> m46727g(int i) {
        return this.f58128c.get(i);
    }

    /* renamed from: com.facebook.imagepipeline.memory.a$b */
    public static class C24474b extends RuntimeException {
        static {
            Covode.recordClassIndex(28618);
        }

        public C24474b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized V mo40337a(C24487f<V> fVar) {
        V b;
        b = fVar.mo40367b();
        if (b != null) {
            fVar.f58188e++;
        }
        return b;
    }

    /* renamed from: h */
    private synchronized C24487f<V> m46728h(int i) {
        C24487f<V> fVar = this.f58128c.get(i);
        if (fVar == null) {
            if (this.f58133h) {
                if (C24099a.m45645a(2)) {
                    C24099a.m45635a(this.f58132g, "creating new bucket %s", Integer.valueOf(i));
                }
                C24487f<V> e = mo40345e(i);
                this.f58128c.put(i, e);
                return e;
            }
        }
        return fVar;
    }

    /* renamed from: i */
    private synchronized boolean m46729i(int i) {
        int i2 = this.f58127b.f58167a;
        if (i > i2 - this.f58130e.f58136b) {
            return false;
        }
        int i3 = this.f58127b.f58168b;
        if (i > i3 - (this.f58130e.f58136b + this.f58131f.f58136b)) {
            mo40373f(i3 - i);
        }
        if (i > i2 - (this.f58130e.f58136b + this.f58131f.f58136b)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C24487f<V> mo40345e(int i) {
        return new C24487f<>(mo40343d(i), Integer.MAX_VALUE, 0, this.f58127b.f58172f);
    }

    /* renamed from: a */
    private synchronized void m46720a(SparseIntArray sparseIntArray) {
        C24091i.m45617a(sparseIntArray);
        this.f58128c.clear();
        SparseIntArray sparseIntArray2 = this.f58127b.f58169c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f58128c.put(keyAt, new C24487f<>(mo40343d(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f58127b.f58172f));
            }
            this.f58133h = false;
            return;
        }
        this.f58133h = true;
    }

    /* renamed from: f */
    private synchronized void mo40373f(int i) {
        int min = Math.min((this.f58130e.f58136b + this.f58131f.f58136b) - i, this.f58131f.f58136b);
        if (min > 0) {
            if (C24099a.m45645a(2)) {
                C24099a.m45637a(this.f58132g, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f58130e.f58136b + this.f58131f.f58136b), Integer.valueOf(min));
            }
            m46725f();
            for (int i2 = 0; i2 < this.f58128c.size() && min > 0; i2++) {
                C24487f<V> valueAt = this.f58128c.valueAt(i2);
                do {
                    V b = valueAt.mo40367b();
                    if (b == null) {
                        break;
                    }
                    mo40340b(b);
                    min -= valueAt.f58184a;
                    this.f58131f.mo40347b(valueAt.f58184a);
                } while (min > 0);
            }
            m46725f();
            if (C24099a.m45645a(2)) {
                C24099a.m45636a(this.f58132g, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f58130e.f58136b + this.f58131f.f58136b));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4 = mo40339b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7.f58130e.mo40347b(r6);
        r0 = m46728h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r0 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0.mo40368c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        com.facebook.common.p1832d.C24098m.m45630a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        com.facebook.common.p1832d.C24091i.m45622b(r7.f58129d.add(r4));
        m46723d();
        m46725f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (com.facebook.common.p1833e.C24099a.m45645a(2) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        com.facebook.common.p1833e.C24099a.m45636a(r7.f58132g, "get (alloc) (object, size) = (%x, %s)", java.lang.Integer.valueOf(java.lang.System.identityHashCode(r4)), java.lang.Integer.valueOf(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        return r4;
     */
    @Override // com.facebook.common.p1835g.AbstractC24109f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo39664a(int r8) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.AbstractC24472a.mo39664a(int):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.facebook.imagepipeline.memory.a<V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.common.p1835g.AbstractC24106c
    /* renamed from: a */
    public final void mo39663a(EnumC24105b bVar) {
        int i;
        ArrayList arrayList;
        synchronized (this) {
            if (this.f58127b.f58172f) {
                arrayList = new ArrayList(this.f58128c.size());
                int size = this.f58128c.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C24487f<V> valueAt = this.f58128c.valueAt(i2);
                    int i3 = valueAt.f58184a;
                    int i4 = valueAt.f58185b;
                    int i5 = valueAt.f58188e;
                    if (valueAt.mo40365a() > 0) {
                        arrayList.add(valueAt);
                    }
                    this.f58128c.setValueAt(i2, new C24487f<>(mo40343d(i3), i4, i5, this.f58127b.f58172f));
                }
            } else {
                arrayList = new ArrayList(this.f58128c.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i6 = 0; i6 < this.f58128c.size(); i6++) {
                    C24487f<V> valueAt2 = this.f58128c.valueAt(i6);
                    if (valueAt2.mo40365a() > 0) {
                        arrayList.add(valueAt2);
                    }
                    sparseIntArray.put(this.f58128c.keyAt(i6), valueAt2.f58188e);
                }
                m46720a(sparseIntArray);
            }
            C24473a aVar = this.f58131f;
            aVar.f58135a = 0;
            aVar.f58136b = 0;
            m46725f();
        }
        for (i = 0; i < arrayList.size(); i++) {
            C24487f fVar = (C24487f) arrayList.get(i);
            while (true) {
                Object b = fVar.mo40367b();
                if (b == null) {
                    break;
                }
                mo40340b(b);
            }
        }
    }

    @Override // com.facebook.common.p1836h.AbstractC24120c, com.facebook.common.p1835g.AbstractC24109f
    /* renamed from: a */
    public final void mo39665a(V v) {
        C24091i.m45617a(v);
        int c = mo40342c(v);
        int d = mo40343d(c);
        synchronized (this) {
            C24487f<V> g = m46727g(c);
            boolean z = false;
            if (!this.f58129d.remove(v)) {
                C24099a.m45656c(this.f58132g, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                mo40340b(v);
            } else {
                if (g != null) {
                    if (g.f58188e + g.mo40365a() <= g.f58185b && !m46724e()) {
                        if (mo40344d(v)) {
                            C24091i.m45617a(v);
                            if (g.f58187d) {
                                if (g.f58188e > 0) {
                                    z = true;
                                }
                                C24091i.m45622b(z);
                                g.f58188e--;
                                g.mo40366a(v);
                            } else if (g.f58188e > 0) {
                                g.f58188e--;
                                g.mo40366a(v);
                            } else {
                                C24099a.m45659c("BUCKET", "Tried to release value %s from an empty bucket!", v);
                            }
                            this.f58131f.mo40346a(d);
                            this.f58130e.mo40347b(d);
                            if (C24099a.m45645a(2)) {
                                C24099a.m45636a(this.f58132g, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                            }
                        }
                    }
                    g.mo40368c();
                }
                if (C24099a.m45645a(2)) {
                    C24099a.m45636a(this.f58132g, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                }
                mo40340b(v);
                this.f58130e.mo40347b(d);
            }
            m46725f();
        }
    }

    public AbstractC24472a(AbstractC24107d dVar, C24480ad adVar, AbstractC24481ae aeVar) {
        this.f58126a = (AbstractC24107d) C24091i.m45617a(dVar);
        C24480ad adVar2 = (C24480ad) C24091i.m45617a(adVar);
        this.f58127b = adVar2;
        this.f58134i = (AbstractC24481ae) C24091i.m45617a(aeVar);
        this.f58128c = new SparseArray<>();
        if (adVar2.f58172f) {
            m46722c();
        } else {
            m46720a(new SparseIntArray(0));
        }
        this.f58129d = Collections.newSetFromMap(new IdentityHashMap());
        this.f58131f = new C24473a();
        this.f58130e = new C24473a();
    }

    /* renamed from: com.facebook.imagepipeline.memory.a$c */
    public static class C24475c extends RuntimeException {
        static {
            Covode.recordClassIndex(28619);
        }

        public C24475c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }
}
