package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C89527ar;

/* renamed from: kotlinx.coroutines.internal.n */
public final class C89649n<E> {

    /* renamed from: a */
    public static final C89659v f203390a = new C89659v("REMOVE_FROZEN");

    /* renamed from: b */
    public static final C89650a f203391b = new C89650a((byte) 0);

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater f203392d = AtomicReferenceFieldUpdater.newUpdater(C89649n.class, Object.class, "_next");

    /* renamed from: e */
    private static final AtomicLongFieldUpdater f203393e = AtomicLongFieldUpdater.newUpdater(C89649n.class, "_state");
    private volatile Object _next;
    volatile long _state;

    /* renamed from: c */
    private final int f203394c;

    /* renamed from: f */
    private AtomicReferenceArray f203395f;

    /* renamed from: g */
    private final int f203396g;

    /* renamed from: h */
    private final boolean f203397h;

    /* renamed from: kotlinx.coroutines.internal.n$a */
    public static final class C89650a {
        static {
            Covode.recordClassIndex(105743);
        }

        /* renamed from: a */
        public static int m155612a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: a */
        public static long m155613a(long j, int i) {
            return (j & -1073741824) | (((long) i) << 0);
        }

        /* renamed from: b */
        public static long m155614b(long j, int i) {
            return (j & -1152921503533105153L) | (((long) i) << 30);
        }

        private C89650a() {
        }

        public /* synthetic */ C89650a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    public final C89649n<E> mo144204d() {
        return m155604a(m155606e());
    }

    /* renamed from: e */
    private final long m155606e() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f203393e.compareAndSet(this, j, j2));
        return j2;
    }

    static {
        Covode.recordClassIndex(105742);
    }

    /* renamed from: b */
    public final boolean mo144202b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f203393e.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: c */
    public final Object mo144203c() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f203390a;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.f203394c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f203395f.get(i2 & i);
            if (obj == null) {
                if (this.f203397h) {
                    return null;
                }
            } else if (obj instanceof C89651b) {
                return null;
            } else {
                int i3 = (i + 1) & 1073741823;
                if (f203393e.compareAndSet(this, j, C89650a.m155613a(j, i3))) {
                    this.f203395f.set(this.f203394c & i, null);
                    return obj;
                } else if (this.f203397h) {
                    C89649n<E> nVar = this;
                    do {
                        nVar = nVar.m155602a(i, i3);
                    } while (nVar != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo144201a() {
        long j = this._state;
        if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    /* renamed from: kotlinx.coroutines.internal.n$b */
    public static final class C89651b {

        /* renamed from: a */
        public final int f203398a;

        static {
            Covode.recordClassIndex(105744);
        }

        public C89651b(int i) {
            this.f203398a = i;
        }
    }

    /* renamed from: a */
    private final C89649n<E> m155604a(long j) {
        while (true) {
            C89649n<E> nVar = (C89649n) this._next;
            if (nVar != null) {
                return nVar;
            }
            f203392d.compareAndSet(this, null, m155605b(j));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: java.util.concurrent.atomic.AtomicReferenceArray */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final C89649n<E> m155605b(long j) {
        C89649n<E> nVar = new C89649n<>(this.f203396g * 2, this.f203397h);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f203394c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f203395f.get(i3 & i);
                if (obj == null) {
                    obj = new C89651b(i);
                }
                nVar.f203395f.set(nVar.f203394c & i, obj);
                i++;
            } else {
                nVar._state = j & -1152921504606846977L;
                return nVar;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo144200a(E r18) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C89649n.mo144200a(java.lang.Object):int");
    }

    /* renamed from: a */
    private final C89649n<E> m155603a(int i, E e) {
        Object obj = this.f203395f.get(this.f203394c & i);
        if (!(obj instanceof C89651b) || ((C89651b) obj).f203398a != i) {
            return null;
        }
        this.f203395f.set(i & this.f203394c, e);
        return this;
    }

    public C89649n(int i, boolean z) {
        boolean z2;
        this.f203396g = i;
        this.f203397h = z;
        int i2 = i - 1;
        this.f203394c = i2;
        this.f203395f = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalStateException("Check failed.".toString());
        } else if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: a */
    private final C89649n<E> m155602a(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C89527ar.f203243a && i3 != i) {
                throw new AssertionError();
            } else if ((1152921504606846976L & j) != 0) {
                return mo144204d();
            }
        } while (!f203393e.compareAndSet(this, j, C89650a.m155613a(j, i2)));
        this.f203395f.set(this.f203394c & i3, null);
        return null;
    }
}
