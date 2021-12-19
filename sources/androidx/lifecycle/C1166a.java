package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
final class C1166a {

    /* renamed from: a */
    static C1166a f3951a = new C1166a();

    /* renamed from: b */
    private final Map<Class<?>, C1167a> f3952b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, Boolean> f3953c = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$b */
    public static final class C1168b {

        /* renamed from: a */
        final int f3956a;

        /* renamed from: b */
        final Method f3957b;

        static {
            Covode.recordClassIndex(1275);
        }

        public final int hashCode() {
            return (this.f3956a * 31) + this.f3957b.getName().hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1168b)) {
                return false;
            }
            C1168b bVar = (C1168b) obj;
            if (this.f3956a != bVar.f3956a || !this.f3957b.getName().equals(bVar.f3957b.getName())) {
                return false;
            }
            return true;
        }

        C1168b(int i, Method method) {
            this.f3956a = i;
            this.f3957b = method;
            method.setAccessible(true);
        }
    }

    static {
        Covode.recordClassIndex(1273);
    }

    C1166a() {
    }

    /* renamed from: c */
    private static Method[] m3865c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1167a mo3986b(Class<?> cls) {
        C1167a aVar = this.f3952b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m3863a(cls, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3985a(Class<?> cls) {
        Boolean bool = this.f3953c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c = m3865c(cls);
        for (Method method : c) {
            if (method.getAnnotation(AbstractC1215v.class) != null) {
                m3863a(cls, c);
                return true;
            }
        }
        this.f3953c.put(cls, false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a */
    public static class C1167a {

        /* renamed from: a */
        final Map<AbstractC1196i.EnumC1198a, List<C1168b>> f3954a = new HashMap();

        /* renamed from: b */
        final Map<C1168b, AbstractC1196i.EnumC1198a> f3955b;

        static {
            Covode.recordClassIndex(1274);
        }

        C1167a(Map<C1168b, AbstractC1196i.EnumC1198a> map) {
            this.f3955b = map;
            for (Map.Entry<C1168b, AbstractC1196i.EnumC1198a> entry : map.entrySet()) {
                AbstractC1196i.EnumC1198a value = entry.getValue();
                List<C1168b> list = this.f3954a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3954a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        static void m3868a(List<C1168b> list, AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1168b bVar = list.get(size);
                    try {
                        int i = bVar.f3956a;
                        if (i == 0) {
                            bVar.f3957b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f3957b.invoke(obj, mVar);
                        } else if (i == 2) {
                            bVar.f3957b.invoke(obj, mVar, aVar);
                        }
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private C1167a m3863a(Class<?> cls, Method[] methodArr) {
        int i;
        C1167a b;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo3986b(superclass)) == null)) {
            hashMap.putAll(b.f3955b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C1168b, AbstractC1196i.EnumC1198a> entry : mo3986b(cls2).f3955b.entrySet()) {
                m3864a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m3865c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            AbstractC1215v vVar = (AbstractC1215v) method.getAnnotation(AbstractC1215v.class);
            if (vVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(AbstractC1204m.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                AbstractC1196i.EnumC1198a a = vVar.mo4029a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC1196i.EnumC1198a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == AbstractC1196i.EnumC1198a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m3864a(hashMap, new C1168b(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1167a aVar = new C1167a(hashMap);
        this.f3952b.put(cls, aVar);
        this.f3953c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private static void m3864a(Map<C1168b, AbstractC1196i.EnumC1198a> map, C1168b bVar, AbstractC1196i.EnumC1198a aVar, Class<?> cls) {
        AbstractC1196i.EnumC1198a aVar2 = map.get(bVar);
        if (aVar2 == null) {
            map.put(bVar, aVar);
        } else if (aVar != aVar2) {
            throw new IllegalArgumentException("Method " + bVar.f3957b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        }
    }
}
