package p4640l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p4640l.AbstractC89741c;

/* access modifiers changed from: package-private */
/* renamed from: l.j */
public class C89775j {

    /* renamed from: a */
    static final C89775j f203545a = m155834b();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Executor mo144308a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo144310a(Method method) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.j$a */
    public static class C89776a extends C89775j {
        static {
            Covode.recordClassIndex(105870);
        }

        C89776a() {
        }

        @Override // p4640l.C89775j
        /* renamed from: a */
        public final Executor mo144308a() {
            return new ExecutorC89777a();
        }

        /* renamed from: l.j$a$a */
        static class ExecutorC89777a implements Executor {

            /* renamed from: a */
            private final Handler f203546a = new Handler(Looper.getMainLooper());

            static {
                Covode.recordClassIndex(105871);
            }

            ExecutorC89777a() {
            }

            public final void execute(Runnable runnable) {
                this.f203546a.post(runnable);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.C89775j
        /* renamed from: a */
        public final AbstractC89741c.AbstractC89742a mo144309a(Executor executor) {
            if (executor != null) {
                return new C89748g(executor);
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.j$b */
    public static class C89778b extends C89775j {
        static {
            Covode.recordClassIndex(105872);
        }

        C89778b() {
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.C89775j
        /* renamed from: a */
        public final boolean mo144310a(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: package-private */
        @Override // p4640l.C89775j
        /* renamed from: a */
        public final Object mo144307a(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    C89775j() {
    }

    static {
        Covode.recordClassIndex(105869);
    }

    /* renamed from: b */
    private static C89775j m155834b() {
        try {
            Class.forName("android.os.Build");
            int i = Build.VERSION.SDK_INT;
            return new C89776a();
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("java.util.Optional");
                return new C89778b();
            } catch (ClassNotFoundException unused2) {
                return new C89775j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC89741c.AbstractC89742a mo144309a(Executor executor) {
        if (executor != null) {
            return new C89748g(executor);
        }
        return C89746f.f203492a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo144307a(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }
}
