package com.bytedance.jedi.p1445a.p1463m;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.jedi.a.m.e */
public final class C20336e {

    /* renamed from: e */
    static Class<?> f48188e;

    /* renamed from: f */
    static Class<?> f48189f;

    /* renamed from: g */
    static Class<?> f48190g;

    /* renamed from: h */
    static Method f48191h;

    /* renamed from: i */
    static Method f48192i;

    /* renamed from: j */
    static Method f48193j;

    /* renamed from: a */
    public final int f48194a;

    /* renamed from: b */
    public final int f48195b;

    /* renamed from: c */
    public final int f48196c;

    /* renamed from: d */
    public final int f48197d;

    /* renamed from: k */
    private final int f48198k;

    /* renamed from: l */
    private final Map<Class<?>, C20340b> f48199l = new IdentityHashMap();

    /* renamed from: m */
    private final Map<Object, Object> f48200m = new IdentityHashMap();

    /* renamed from: n */
    private final Map<Class<?>, C20328a> f48201n = new IdentityHashMap();

    /* renamed from: o */
    private final Deque<Object> f48202o = new ArrayDeque(16384);

    /* renamed from: p */
    private long f48203p;

    /* renamed from: q */
    private long f48204q;

    /* renamed from: com.bytedance.jedi.a.m.e$d */
    public interface AbstractC20342d {
        static {
            Covode.recordClassIndex(23850);
        }

        /* renamed from: a */
        int mo33669a();

        /* renamed from: b */
        int mo33670b();

        /* renamed from: c */
        int mo33671c();

        /* renamed from: d */
        int mo33672d();

        /* renamed from: e */
        int mo33673e();
    }

    /* renamed from: com.bytedance.jedi.a.m.e$c */
    public static class C20341c {

        /* renamed from: a */
        public static final AbstractC20342d f48210a = new AbstractC20342d() {
            /* class com.bytedance.jedi.p1445a.p1463m.C20336e.C203382 */

            static {
                Covode.recordClassIndex(23846);
            }

            @Override // com.bytedance.jedi.p1445a.p1463m.C20336e.AbstractC20342d
            /* renamed from: a */
            public final int mo33669a() {
                return 40;
            }

            @Override // com.bytedance.jedi.p1445a.p1463m.C20336e.AbstractC20342d
            /* renamed from: b */
            public final int mo33670b() {
                return 24;
            }

            @Override // com.bytedance.jedi.p1445a.p1463m.C20336e.AbstractC20342d
            /* renamed from: c */
            public final int mo33671c() {
                return 8;
            }

            @Override // com.bytedance.jedi.p1445a.p1463m.C20336e.AbstractC20342d
            /* renamed from: d */
            public final int mo33672d() {
                return 8;
            }

            @Override // com.bytedance.jedi.p1445a.p1463m.C20336e.AbstractC20342d
            /* renamed from: e */
            public final int mo33673e() {
                return 8;
            }
        };

        static {
            Covode.recordClassIndex(23849);
        }
    }

    static {
        Covode.recordClassIndex(23844);
        try {
            f48188e = Class.forName("java.lang.management.ManagementFactory");
            f48189f = Class.forName("java.lang.management.MemoryPoolMXBean");
            f48190g = Class.forName("java.lang.management.MemoryUsage");
            f48191h = f48188e.getMethod("getMemoryPoolMXBeans", new Class[0]);
            f48192i = f48189f.getMethod("getUsage", new Class[0]);
            f48193j = f48190g.getMethod("getMax", new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.m.e$a */
    public static class C20339a {

        /* renamed from: a */
        private final Object[] f48205a;

        static {
            Covode.recordClassIndex(23847);
        }

        C20339a(Object[] objArr) {
            this.f48205a = objArr;
        }

        /* renamed from: a */
        public final void mo33674a(C20336e eVar) {
            Object[] objArr = this.f48205a;
            for (Object obj : objArr) {
                if (obj != null) {
                    eVar.mo33667b(obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33668c(Object obj) {
        if (obj != null) {
            this.f48202o.addLast(obj);
        }
    }

    /* renamed from: a */
    public final C20340b mo33664a(Class<?> cls) {
        C20340b bVar = this.f48199l.get(cls);
        if (bVar != null) {
            return bVar;
        }
        C20340b bVar2 = new C20340b(cls);
        this.f48199l.put(cls, bVar2);
        return bVar2;
    }

    /* renamed from: d */
    private void m38522d(Object obj) {
        Class<?> cls = obj.getClass();
        Class<?> componentType = cls.getComponentType();
        int length = Array.getLength(obj);
        if (componentType.isPrimitive()) {
            m38520a(cls, length, m38521b(componentType));
            return;
        }
        m38520a(cls, length, (long) this.f48196c);
        if (length == 0) {
            return;
        }
        if (length != 1) {
            mo33668c(new C20339a((Object[]) obj));
        } else {
            mo33668c(Array.get(obj, 0));
        }
    }

    /* renamed from: b */
    public final void mo33667b(Object obj) {
        if (!this.f48200m.containsKey(obj)) {
            Class<?> cls = obj.getClass();
            if (cls == C20339a.class) {
                ((C20339a) obj).mo33674a(this);
                return;
            }
            this.f48200m.put(obj, obj);
            if (cls.isArray()) {
                m38522d(obj);
            } else {
                mo33664a(cls).mo33675a(obj, this);
            }
        }
    }

    public C20336e(AbstractC20342d dVar) {
        Objects.requireNonNull(dVar);
        this.f48198k = dVar.mo33669a();
        this.f48194a = dVar.mo33670b();
        this.f48195b = dVar.mo33671c();
        this.f48196c = dVar.mo33672d();
        this.f48197d = dVar.mo33673e();
    }

    /* renamed from: b */
    public static long m38521b(Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Byte.TYPE) {
            return 1;
        }
        if (cls == Character.TYPE || cls == Short.TYPE) {
            return 2;
        }
        if (cls == Integer.TYPE || cls == Float.TYPE) {
            return 4;
        }
        if (cls == Long.TYPE || cls == Double.TYPE) {
            return 8;
        }
        throw new AssertionError("Encountered unexpected primitive type " + cls.getName());
    }

    /* renamed from: a */
    public final synchronized long[] mo33666a(Object obj) {
        MethodCollector.m26663i(9550);
        this.f48201n.clear();
        while (true) {
            try {
                mo33667b(obj);
                if (this.f48202o.isEmpty()) {
                } else {
                    if (this.f48204q == 0) {
                        this.f48204q = this.f48203p;
                    }
                    obj = this.f48202o.removeFirst();
                }
            } finally {
                this.f48200m.clear();
                this.f48202o.clear();
                this.f48203p = 0;
                this.f48204q = 0;
                MethodCollector.m26664o(9550);
            }
        }
        return new long[]{this.f48203p, this.f48204q};
    }

    /* renamed from: a */
    static long m38519a(long j, int i) {
        long j2 = (long) i;
        return (((j + j2) - 1) / j2) * j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.m.e$b */
    public class C20340b {

        /* renamed from: b */
        private final long f48207b;

        /* renamed from: c */
        private final long f48208c;

        /* renamed from: d */
        private final Field[] f48209d;

        static {
            Covode.recordClassIndex(23848);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo33675a(Object obj, C20336e eVar) {
            eVar.mo33665a(obj.getClass(), this.f48207b);
            m38539b(obj, eVar);
        }

        /* renamed from: b */
        private void m38539b(Object obj, C20336e eVar) {
            Field[] fieldArr = this.f48209d;
            for (Field field : fieldArr) {
                try {
                    eVar.mo33668c(field.get(obj));
                } catch (IllegalAccessException e) {
                    AssertionError assertionError = new AssertionError("Unexpected denial of access to ".concat(String.valueOf(field)));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
        }

        public C20340b(Class<?> cls) {
            long j;
            LinkedList linkedList = new LinkedList();
            Field[] declaredFields = cls.getDeclaredFields();
            long j2 = 0;
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    Class<?> type = field.getType();
                    if (type.isPrimitive()) {
                        j = C20336e.m38521b(type);
                    } else {
                        field.setAccessible(true);
                        linkedList.add(field);
                        j = (long) C20336e.this.f48196c;
                    }
                    j2 += j;
                }
            }
            Class<? super Object> superclass = cls.getSuperclass();
            if (!(superclass == null || superclass == Object.class)) {
                C20340b a = C20336e.this.mo33664a((Class<?>) superclass);
                j2 += C20336e.m38519a(a.f48208c, C20336e.this.f48197d);
                linkedList.addAll(Arrays.asList(a.f48209d));
            }
            this.f48208c = j2;
            this.f48207b = C20336e.m38519a(((long) C20336e.this.f48194a) + j2, C20336e.this.f48195b);
            this.f48209d = (Field[]) linkedList.toArray(new Field[linkedList.size()]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33665a(Class<?> cls, long j) {
        C20328a aVar = this.f48201n.get(cls);
        if (aVar == null) {
            aVar = new C20328a(cls);
            this.f48201n.put(cls, aVar);
        }
        aVar.mo33659a(j);
        this.f48203p += j;
    }

    /* renamed from: a */
    private void m38520a(Class<?> cls, int i, long j) {
        mo33665a(cls, m38519a(((long) this.f48198k) + (((long) i) * j), this.f48195b));
    }
}
