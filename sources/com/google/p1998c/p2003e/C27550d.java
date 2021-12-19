package com.google.p1998c.p2003e;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p1999a.C27258s;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* renamed from: com.google.c.e.d */
public final class C27550d implements Closeable {

    /* renamed from: a */
    static final AbstractC27553c f64916a;

    /* renamed from: b */
    final AbstractC27553c f64917b;

    /* renamed from: c */
    Throwable f64918c;

    /* renamed from: d */
    private final Deque<Closeable> f64919d = new ArrayDeque(4);

    /* renamed from: com.google.c.e.d$c */
    interface AbstractC27553c {
        static {
            Covode.recordClassIndex(33133);
        }

        /* renamed from: a */
        void mo46115a(Closeable closeable, Throwable th, Throwable th2);
    }

    /* renamed from: com.google.c.e.d$a */
    static final class C27551a implements AbstractC27553c {

        /* renamed from: a */
        static final C27551a f64920a = new C27551a();

        C27551a() {
        }

        static {
            Covode.recordClassIndex(33131);
        }

        @Override // com.google.p1998c.p2003e.C27550d.AbstractC27553c
        /* renamed from: a */
        public final void mo46115a(Closeable closeable, Throwable th, Throwable th2) {
            C27549c.f64915a.log(Level.WARNING, "Suppressing exception thrown when closing ".concat(String.valueOf(closeable)), th2);
        }
    }

    /* renamed from: com.google.c.e.d$b */
    static final class C27552b implements AbstractC27553c {

        /* renamed from: a */
        static final C27552b f64921a = new C27552b();

        /* renamed from: b */
        static final Method f64922b = m55093a();

        C27552b() {
        }

        static {
            Covode.recordClassIndex(33132);
        }

        /* renamed from: a */
        private static Method m55093a() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.google.p1998c.p2003e.C27550d.AbstractC27553c
        /* renamed from: a */
        public final void mo46115a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    Method method = f64922b;
                    Object[] objArr = {th2};
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{th, objArr}, 110000, "java.lang.Object", true, "com_google_common_io_Closer$SuppressingSuppressor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        Object obj = a.second;
                        return;
                    }
                    C15346a.m28242a(method.invoke(th, objArr), method, new Object[]{th, objArr}, "com_google_common_io_Closer$SuppressingSuppressor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                } catch (Throwable unused) {
                    C27551a.f64920a.mo46115a(closeable, th, th2);
                }
            }
        }
    }

    static {
        AbstractC27553c cVar;
        Covode.recordClassIndex(33130);
        if (C27552b.f64922b != null) {
            cVar = C27552b.f64921a;
        } else {
            cVar = C27551a.f64920a;
        }
        f64916a = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.f64918c;
        while (!this.f64919d.isEmpty()) {
            Closeable removeFirst = this.f64919d.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f64917b.mo46115a(removeFirst, th, th2);
                }
            }
        }
        if (this.f64918c == null && th != null) {
            C27258s.m54267a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    public final <C extends Closeable> C mo46113a(C c) {
        if (c != null) {
            this.f64919d.addFirst(c);
        }
        return c;
    }

    C27550d(AbstractC27553c cVar) {
        this.f64917b = (AbstractC27553c) C27245k.m54229a(cVar);
    }
}
