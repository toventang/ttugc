package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.q */
public final class C1209q {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3999a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends AbstractC1191e>>> f4000b = new HashMap();

    static {
        Covode.recordClassIndex(1316);
    }

    /* renamed from: d */
    private static boolean m3918d(Class<?> cls) {
        if (cls == null || !AbstractC1203l.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static int m3916b(Class<?> cls) {
        Integer num = f3999a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int c = m3917c(cls);
        f3999a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: a */
    static AbstractC1202k m3914a(Object obj) {
        boolean z = obj instanceof AbstractC1202k;
        boolean z2 = obj instanceof AbstractC1190d;
        if (z) {
            if (z2) {
                return new FullLifecycleObserverAdapter((AbstractC1190d) obj, (AbstractC1202k) obj);
            }
        } else if (z2) {
            return new FullLifecycleObserverAdapter((AbstractC1190d) obj, null);
        } else {
            if (!z) {
                Class<?> cls = obj.getClass();
                if (m3916b(cls) != 2) {
                    return new ReflectiveGenericLifecycleObserver(obj);
                }
                List<Constructor<? extends AbstractC1191e>> list = f4000b.get(cls);
                if (list.size() == 1) {
                    return new SingleGeneratedAdapterObserver(m3913a(list.get(0), obj));
                }
                AbstractC1191e[] eVarArr = new AbstractC1191e[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    eVarArr[i] = m3913a(list.get(i), obj);
                }
                return new CompositeGeneratedAdaptersObserver(eVarArr);
            }
        }
        return (AbstractC1202k) obj;
    }

    /* renamed from: c */
    private static int m3917c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends AbstractC1191e> a = m3915a(cls);
        if (a != null) {
            f4000b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C1166a.f3951a.mo3985a(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m3918d(superclass)) {
                if (m3916b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f4000b.get(superclass));
            }
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> cls2 : interfaces) {
                if (m3918d(cls2)) {
                    if (m3916b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f4000b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f4000b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static Constructor<? extends AbstractC1191e> m3915a(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String str2 = canonicalName.replace(".", "_") + "_LifecycleAdapter";
            if (!str.isEmpty()) {
                str2 = str + "." + str2;
            }
            Constructor declaredConstructor = Class.forName(str2).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static AbstractC1191e m3913a(Constructor<? extends AbstractC1191e> constructor, Object obj) {
        try {
            return (AbstractC1191e) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
