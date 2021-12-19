package androidx.p053i;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.i.i */
public abstract class AbstractC1036i<T> extends AbstractList<T> {

    /* renamed from: a */
    private final AtomicBoolean f3633a = new AtomicBoolean(false);

    /* renamed from: b */
    private final ArrayList<WeakReference<AbstractC1041c>> f3634b = new ArrayList<>();

    /* renamed from: c */
    final Executor f3635c;

    /* renamed from: d */
    final Executor f3636d;

    /* renamed from: e */
    final AbstractC1039a<T> f3637e;

    /* renamed from: f */
    public final C1042d f3638f;

    /* renamed from: g */
    final C1046k<T> f3639g;

    /* renamed from: h */
    int f3640h;

    /* renamed from: i */
    T f3641i;

    /* renamed from: j */
    public boolean f3642j;

    /* renamed from: k */
    public boolean f3643k;

    /* renamed from: l */
    int f3644l = Integer.MAX_VALUE;

    /* renamed from: m */
    int f3645m = Integer.MIN_VALUE;

    /* renamed from: androidx.i.i$a */
    public static abstract class AbstractC1039a<T> {
        static {
            Covode.recordClassIndex(1132);
        }

        /* renamed from: a */
        public void mo3753a() {
        }

        /* renamed from: a */
        public void mo3754a(T t) {
        }
    }

    /* renamed from: androidx.i.i$c */
    public static abstract class AbstractC1041c {
        static {
            Covode.recordClassIndex(1134);
        }

        /* renamed from: a */
        public abstract void mo3698a(int i, int i2);

        /* renamed from: b */
        public abstract void mo3699b(int i, int i2);
    }

    static {
        Covode.recordClassIndex(1129);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo3706a(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo3708a(AbstractC1036i<T> iVar, AbstractC1041c cVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo3709a();

    /* renamed from: b */
    public abstract AbstractC1012d<?, T> mo3710b();

    /* renamed from: c */
    public abstract Object mo3713c();

    /* renamed from: d */
    public boolean mo3745d() {
        return mo3747f();
    }

    /* renamed from: f */
    public boolean mo3747f() {
        return this.f3633a.get();
    }

    /* renamed from: g */
    public final void mo3748g() {
        this.f3633a.set(true);
    }

    public int size() {
        return this.f3639g.size();
    }

    /* renamed from: e */
    public final List<T> mo3746e() {
        if (mo3745d()) {
            return this;
        }
        return new C1051m(this);
    }

    /* renamed from: androidx.i.i$d */
    public static class C1042d {

        /* renamed from: a */
        public final int f3659a;

        /* renamed from: b */
        public final int f3660b;

        /* renamed from: c */
        public final boolean f3661c;

        /* renamed from: d */
        public final int f3662d;

        static {
            Covode.recordClassIndex(1135);
        }

        /* renamed from: androidx.i.i$d$a */
        public static final class C1043a {

            /* renamed from: a */
            public int f3663a = -1;

            /* renamed from: b */
            public int f3664b = -1;

            /* renamed from: c */
            public int f3665c = -1;

            /* renamed from: d */
            public boolean f3666d = true;

            static {
                Covode.recordClassIndex(1136);
            }

            /* renamed from: a */
            public final C1042d mo3756a() {
                int i = this.f3663a;
                if (i > 0) {
                    if (this.f3664b < 0) {
                        this.f3664b = i;
                    }
                    if (this.f3665c < 0) {
                        this.f3665c = i * 3;
                    }
                    if (this.f3666d || this.f3664b != 0) {
                        return new C1042d(this.f3663a, this.f3664b, this.f3666d, this.f3665c, (byte) 0);
                    }
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                throw new IllegalArgumentException("Page size must be a positive number");
            }
        }

        private C1042d(int i, int i2, boolean z, int i3) {
            this.f3659a = i;
            this.f3660b = i2;
            this.f3661c = z;
            this.f3662d = i3;
        }

        /* synthetic */ C1042d(int i, int i2, boolean z, int i3, byte b) {
            this(i, i2, z, i3);
        }
    }

    /* renamed from: androidx.i.i$b */
    public static final class C1040b<Key, Value> {

        /* renamed from: a */
        public Executor f3653a;

        /* renamed from: b */
        public Executor f3654b;

        /* renamed from: c */
        AbstractC1039a f3655c;

        /* renamed from: d */
        Key f3656d;

        /* renamed from: e */
        private final AbstractC1012d<Key, Value> f3657e;

        /* renamed from: f */
        private final C1042d f3658f;

        static {
            Covode.recordClassIndex(1133);
        }

        /* renamed from: a */
        public final AbstractC1036i<Value> mo3755a() {
            Executor executor = this.f3653a;
            if (executor != null) {
                Executor executor2 = this.f3654b;
                if (executor2 != null) {
                    return AbstractC1036i.m3513a(this.f3657e, executor, executor2, this.f3655c, this.f3658f, this.f3656d);
                }
                throw new IllegalArgumentException("BackgroundThreadExecutor required");
            }
            throw new IllegalArgumentException("MainThreadExecutor required");
        }

        public C1040b(AbstractC1012d<Key, Value> dVar, C1042d dVar2) {
            if (dVar == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            } else if (dVar2 != null) {
                this.f3657e = dVar;
                this.f3658f = dVar2;
            } else {
                throw new IllegalArgumentException("Config may not be null");
            }
        }
    }

    @Override // java.util.List, java.util.AbstractList
    public T get(int i) {
        T t = this.f3639g.get(i);
        if (t != null) {
            this.f3641i = t;
        }
        return t;
    }

    /* renamed from: a */
    public final void mo3740a(AbstractC1041c cVar) {
        for (int size = this.f3634b.size() - 1; size >= 0; size--) {
            AbstractC1041c cVar2 = this.f3634b.get(size).get();
            if (cVar2 == null || cVar2 == cVar) {
                this.f3634b.remove(size);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r5 != false) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3742a(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.f3642j
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0028
            int r1 = r6.f3644l
            androidx.i.i$d r0 = r6.f3638f
            int r0 = r0.f3660b
            if (r1 > r0) goto L_0x0028
            r3 = 1
        L_0x000f:
            boolean r0 = r6.f3643k
            if (r0 == 0) goto L_0x0026
            int r2 = r6.f3645m
            int r1 = r6.size()
            int r1 = r1 - r5
            androidx.i.i$d r0 = r6.f3638f
            int r0 = r0.f3660b
            int r1 = r1 - r0
            if (r2 < r1) goto L_0x0026
        L_0x0021:
            if (r3 != 0) goto L_0x002a
            if (r5 != 0) goto L_0x002e
            return
        L_0x0026:
            r5 = 0
            goto L_0x0021
        L_0x0028:
            r3 = 0
            goto L_0x000f
        L_0x002a:
            r6.f3642j = r4
            if (r5 == 0) goto L_0x0030
        L_0x002e:
            r6.f3643k = r4
        L_0x0030:
            if (r7 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.f3635c
            androidx.i.i$2 r0 = new androidx.i.i$2
            r0.<init>(r3, r5)
            r1.execute(r0)
            return
        L_0x003d:
            r6.mo3743a(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p053i.AbstractC1036i.mo3742a(boolean):void");
    }

    /* renamed from: a */
    public final void mo3743a(boolean z, boolean z2) {
        if (z) {
            this.f3639g.mo3763c();
        }
        if (z2) {
            this.f3637e.mo3754a(this.f3639g.mo3764d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3739a(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f3634b.size() - 1; size >= 0; size--) {
                AbstractC1041c cVar = this.f3634b.get(size).get();
                if (cVar != null) {
                    cVar.mo3698a(i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3744b(int i, int i2) {
        if (i2 != 0) {
            for (int size = this.f3634b.size() - 1; size >= 0; size--) {
                AbstractC1041c cVar = this.f3634b.get(size).get();
                if (cVar != null) {
                    cVar.mo3699b(i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo3741a(List<T> list, AbstractC1041c cVar) {
        if (!(list == null || list == this)) {
            if (!list.isEmpty()) {
                mo3708a((AbstractC1036i) ((AbstractC1036i) list), cVar);
            } else if (!this.f3639g.isEmpty()) {
                cVar.mo3698a(0, this.f3639g.size());
            }
        }
        for (int size = this.f3634b.size() - 1; size >= 0; size--) {
            if (this.f3634b.get(size).get() == null) {
                this.f3634b.remove(size);
            }
        }
        this.f3634b.add(new WeakReference<>(cVar));
    }

    AbstractC1036i(C1046k<T> kVar, Executor executor, Executor executor2, AbstractC1039a<T> aVar, C1042d dVar) {
        this.f3639g = kVar;
        this.f3635c = executor;
        this.f3636d = executor2;
        this.f3637e = aVar;
        this.f3638f = dVar;
    }

    /* renamed from: a */
    public static <K, T> AbstractC1036i<T> m3513a(AbstractC1012d<K, T> dVar, Executor executor, Executor executor2, AbstractC1039a<T> aVar, C1042d dVar2, K k) {
        return new C1008c((AbstractC1007b) dVar, executor, executor2, aVar, dVar2, k, -1);
    }
}
