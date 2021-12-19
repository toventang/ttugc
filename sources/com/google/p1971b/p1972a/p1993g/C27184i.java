package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.b.a.g.i */
public final class C27184i {

    /* renamed from: d */
    private static final Map<Field, C27184i> f64364d = new WeakHashMap();

    /* renamed from: a */
    public final boolean f64365a;

    /* renamed from: b */
    public final Field f64366b;

    /* renamed from: c */
    public final String f64367c;

    static {
        Covode.recordClassIndex(32764);
    }

    /* renamed from: b */
    public final <T extends Enum<T>> T mo45276b() {
        return (T) Enum.valueOf(this.f64366b.getDeclaringClass(), this.f64366b.getName());
    }

    /* renamed from: a */
    public final boolean mo45275a() {
        return Modifier.isFinal(this.f64366b.getModifiers());
    }

    /* renamed from: a */
    public final Object mo45273a(Object obj) {
        return m54024a(this.f64366b, obj);
    }

    /* renamed from: a */
    public static C27184i m54022a(Enum<?> r5) {
        boolean z;
        try {
            C27184i a = m54023a(r5.getClass().getField(r5.name()));
            if (a != null) {
                z = true;
            } else {
                z = false;
            }
            C27159b.m53985a(z, "enum constant missing @Value or @NullValue annotation: %s", r5);
            return a;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C27184i m54023a(Field field) {
        MethodCollector.m26663i(11786);
        String str = null;
        if (field == null) {
            MethodCollector.m26664o(11786);
            return null;
        }
        Map<Field, C27184i> map = f64364d;
        synchronized (map) {
            try {
                C27184i iVar = map.get(field);
                boolean isEnumConstant = field.isEnumConstant();
                if (iVar == null) {
                    if (isEnumConstant) {
                        AbstractC27195o oVar = (AbstractC27195o) field.getAnnotation(AbstractC27195o.class);
                        if (oVar != null) {
                            str = oVar.mo45293a();
                        } else if (((AbstractC27190l) field.getAnnotation(AbstractC27190l.class)) == null) {
                            MethodCollector.m26664o(11786);
                            return null;
                        }
                    } else if (!Modifier.isStatic(field.getModifiers())) {
                        AbstractC27189k kVar = (AbstractC27189k) field.getAnnotation(AbstractC27189k.class);
                        if (kVar == null) {
                            return null;
                        }
                        str = kVar.mo45288a();
                        field.setAccessible(true);
                    }
                    if ("##default".equals(str)) {
                        str = field.getName();
                    }
                    iVar = new C27184i(field, str);
                    map.put(field, iVar);
                }
                MethodCollector.m26664o(11786);
                return iVar;
            } finally {
                MethodCollector.m26664o(11786);
            }
        }
    }

    /* renamed from: a */
    private static Object m54024a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private C27184i(Field field, String str) {
        String intern;
        this.f64366b = field;
        if (str == null) {
            intern = null;
        } else {
            intern = str.intern();
        }
        this.f64367c = intern;
        this.f64365a = C27178f.m54016a((Type) field.getType());
    }

    /* renamed from: a */
    public final void mo45274a(Object obj, Object obj2) {
        m54025a(this.f64366b, obj, obj2);
    }

    /* renamed from: a */
    public static void m54025a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a = m54024a(field, obj);
            if (obj2 == null) {
                if (a == null) {
                    return;
                }
            } else if (obj2.equals(a)) {
                return;
            }
            String valueOf = String.valueOf(String.valueOf(a));
            String valueOf2 = String.valueOf(String.valueOf(obj2));
            String valueOf3 = String.valueOf(String.valueOf(field.getName()));
            String valueOf4 = String.valueOf(String.valueOf(obj.getClass().getName()));
            throw new IllegalArgumentException(new StringBuilder(valueOf.length() + 48 + valueOf2.length() + valueOf3.length() + valueOf4.length()).append("expected final value <").append(valueOf).append("> but was <").append(valueOf2).append("> on ").append(valueOf3).append(" field in ").append(valueOf4).toString());
        }
        try {
            field.set(obj, obj2);
        } catch (SecurityException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
