package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.internal.f */
public final class C89633f {

    /* renamed from: a */
    private static final int f203370a = m155576a(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f203371b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, AbstractC89172b<Throwable, Throwable>> f203372c = new WeakHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.internal.f$f */
    public static final class C89639f extends AbstractC89220m implements AbstractC89172b {

        /* renamed from: a */
        public static final C89639f f203377a = new C89639f();

        static {
            Covode.recordClassIndex(105732);
        }

        C89639f() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.internal.f$g */
    public static final class C89640g extends AbstractC89220m implements AbstractC89172b {

        /* renamed from: a */
        public static final C89640g f203378a = new C89640g();

        static {
            Covode.recordClassIndex(105733);
        }

        C89640g() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(105726);
    }

    /* renamed from: kotlinx.coroutines.internal.f$a */
    public static final class C89634a extends AbstractC89220m implements AbstractC89172b<Throwable, Throwable> {

        /* renamed from: a */
        final /* synthetic */ Constructor f203373a;

        static {
            Covode.recordClassIndex(105727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89634a(Constructor constructor) {
            super(1);
            this.f203373a = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                Object newInstance = this.f203373a.newInstance(th.getMessage(), th);
                if (newInstance != null) {
                    obj = C89379q.m157068constructorimpl((Throwable) newInstance);
                    if (C89379q.m157073isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Throwable th2) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$b */
    public static final class C89635b extends AbstractC89220m implements AbstractC89172b<Throwable, Throwable> {

        /* renamed from: a */
        final /* synthetic */ Constructor f203374a;

        static {
            Covode.recordClassIndex(105728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89635b(Constructor constructor) {
            super(1);
            this.f203374a = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                Object newInstance = this.f203374a.newInstance(th);
                if (newInstance != null) {
                    obj = C89379q.m157068constructorimpl((Throwable) newInstance);
                    if (C89379q.m157073isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Throwable th2) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$c */
    public static final class C89636c extends AbstractC89220m implements AbstractC89172b<Throwable, Throwable> {

        /* renamed from: a */
        final /* synthetic */ Constructor f203375a;

        static {
            Covode.recordClassIndex(105729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89636c(Constructor constructor) {
            super(1);
            this.f203375a = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                Object newInstance = this.f203375a.newInstance(th.getMessage());
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C89379q.m157068constructorimpl(th2);
                    if (C89379q.m157073isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Throwable th3) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th3));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$d */
    public static final class C89637d extends AbstractC89220m implements AbstractC89172b<Throwable, Throwable> {

        /* renamed from: a */
        final /* synthetic */ Constructor f203376a;

        static {
            Covode.recordClassIndex(105730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89637d(Constructor constructor) {
            super(1);
            this.f203376a = constructor;
        }

        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                Object newInstance = this.f203376a.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C89379q.m157068constructorimpl(th2);
                    if (C89379q.m157073isFailureimpl(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Throwable th3) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th3));
            }
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:403)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* renamed from: a */
    public static final <E extends java.lang.Throwable> E m155577a(E r9) {
        /*
        // Method dump skipped, instructions count: 351
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C89633f.m155577a(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: kotlinx.coroutines.internal.f$e */
    public static final class C89638e<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(105731);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t2.getParameterTypes().length), Integer.valueOf(t.getParameterTypes().length));
        }
    }

    /* renamed from: a */
    private static final int m155576a(Class<?> cls, int i) {
        Integer num;
        C89219l.m154721d(cls, "");
        C89204ab.m154669a(cls);
        int i2 = 0;
        do {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                num = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        } while (cls != null);
        num = C89379q.m157068constructorimpl(Integer.valueOf(i2));
        Integer valueOf = Integer.valueOf(i);
        if (C89379q.m157073isFailureimpl(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }
}
