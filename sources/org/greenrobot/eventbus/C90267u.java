package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.p4665b.AbstractC90244a;
import org.greenrobot.eventbus.p4665b.AbstractC90245b;

/* access modifiers changed from: package-private */
/* renamed from: org.greenrobot.eventbus.u */
public class C90267u {

    /* renamed from: a */
    static final Map<Class<?>, List<C90266t>> f205043a = new ConcurrentHashMap();

    /* renamed from: f */
    private static final C90268a[] f205044f = new C90268a[4];

    /* renamed from: b */
    final boolean f205045b;

    /* renamed from: c */
    final EventBus f205046c;

    /* renamed from: d */
    private List<AbstractC90245b> f205047d;

    /* renamed from: e */
    private final boolean f205048e;

    static {
        Covode.recordClassIndex(106538);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.greenrobot.eventbus.u$a */
    public static class C90268a {

        /* renamed from: a */
        final List<C90266t> f205049a = new ArrayList();

        /* renamed from: b */
        final Map<Class, Object> f205050b = new HashMap();

        /* renamed from: c */
        final Map<String, Class> f205051c = new HashMap();

        /* renamed from: d */
        final StringBuilder f205052d = new StringBuilder(128);

        /* renamed from: e */
        Class<?> f205053e;

        /* renamed from: f */
        Class<?> f205054f;

        /* renamed from: g */
        boolean f205055g;

        /* renamed from: h */
        AbstractC90244a f205056h;

        static {
            Covode.recordClassIndex(106539);
        }

        C90268a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo145428a() {
            if (!this.f205055g) {
                Class<? super Object> superclass = this.f205054f.getSuperclass();
                this.f205054f = superclass;
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.") && !name.startsWith("androidx.")) {
                    return;
                }
            }
            this.f205054f = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo145429a(Class<?> cls) {
            this.f205054f = cls;
            this.f205053e = cls;
            this.f205055g = false;
            this.f205056h = null;
        }

        /* renamed from: b */
        private boolean m157024b(Method method, Class<?> cls) {
            this.f205052d.setLength(0);
            this.f205052d.append(method.getName());
            this.f205052d.append('>').append(cls.getName());
            String sb = this.f205052d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f205051c.put(sb, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f205051c.put(sb, put);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo145430a(Method method, Class<?> cls) {
            Object put = this.f205050b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m157024b((Method) put, cls)) {
                    this.f205050b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m157024b(method, cls);
        }
    }

    /* renamed from: a */
    private static C90268a m157020a() {
        MethodCollector.m26663i(13662);
        synchronized (f205044f) {
            int i = 0;
            while (true) {
                try {
                    C90268a[] aVarArr = f205044f;
                    C90268a aVar = aVarArr[i];
                    if (aVar != null) {
                        aVarArr[i] = null;
                        return aVar;
                    }
                    i++;
                    if (i >= 4) {
                        C90268a aVar2 = new C90268a();
                        MethodCollector.m26664o(13662);
                        return aVar2;
                    }
                } finally {
                    MethodCollector.m26664o(13662);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List<C90266t> mo145427b(Class<?> cls) {
        C90268a a = m157020a();
        a.mo145429a(cls);
        while (a.f205054f != null) {
            m157021b(a);
            a.mo145428a();
        }
        return m157019a(a);
    }

    /* renamed from: a */
    private static List<C90266t> m157019a(C90268a aVar) {
        MethodCollector.m26663i(13661);
        ArrayList arrayList = new ArrayList(aVar.f205049a);
        aVar.f205049a.clear();
        aVar.f205050b.clear();
        aVar.f205051c.clear();
        int i = 0;
        aVar.f205052d.setLength(0);
        aVar.f205053e = null;
        aVar.f205054f = null;
        aVar.f205055g = false;
        aVar.f205056h = null;
        synchronized (f205044f) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                try {
                    C90268a[] aVarArr = f205044f;
                    if (aVarArr[i] == null) {
                        aVarArr[i] = aVar;
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    MethodCollector.m26664o(13661);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(13661);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r6.f205054f == r0.mo145408a()) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<org.greenrobot.eventbus.C90266t> mo145426a(java.lang.Class<?> r8) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.C90267u.mo145426a(java.lang.Class):java.util.List");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m157021b(org.greenrobot.eventbus.C90267u.C90268a r15) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.C90267u.m157021b(org.greenrobot.eventbus.u$a):void");
    }

    C90267u(EventBus eventBus, List<AbstractC90245b> list, boolean z, boolean z2) {
        this.f205047d = list;
        this.f205048e = z;
        this.f205045b = z2;
        this.f205046c = eventBus;
    }
}
