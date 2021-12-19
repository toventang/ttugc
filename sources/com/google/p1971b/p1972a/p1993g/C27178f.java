package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.b.a.g.f */
public final class C27178f {

    /* renamed from: a */
    public static final Boolean f64333a;

    /* renamed from: b */
    public static final String f64334b;

    /* renamed from: c */
    public static final Character f64335c;

    /* renamed from: d */
    public static final Byte f64336d;

    /* renamed from: e */
    public static final Short f64337e;

    /* renamed from: f */
    public static final Integer f64338f;

    /* renamed from: g */
    public static final Float f64339g;

    /* renamed from: h */
    public static final Long f64340h;

    /* renamed from: i */
    public static final Double f64341i;

    /* renamed from: j */
    public static final BigInteger f64342j;

    /* renamed from: k */
    public static final BigDecimal f64343k;

    /* renamed from: l */
    public static final C27183h f64344l;

    /* renamed from: m */
    private static final ConcurrentHashMap<Class<?>, Object> f64345m;

    static {
        Covode.recordClassIndex(32758);
        Boolean bool = new Boolean(true);
        f64333a = bool;
        String str = new String();
        f64334b = str;
        Character ch = new Character(0);
        f64335c = ch;
        Byte b = new Byte((byte) 0);
        f64336d = b;
        Short sh = new Short((short) 0);
        f64337e = sh;
        Integer num = new Integer(0);
        f64338f = num;
        Float f = new Float(0.0f);
        f64339g = f;
        Long l = new Long(0);
        f64340h = l;
        Double d = new Double(0.0d);
        f64341i = d;
        BigInteger bigInteger = new BigInteger("0");
        f64342j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        f64343k = bigDecimal;
        C27183h hVar = new C27183h(0);
        f64344l = hVar;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        f64345m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(C27183h.class, hVar);
    }

    /* renamed from: a */
    public static boolean m54015a(Object obj) {
        if (obj == null || obj != f64345m.get(obj.getClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> T m54011a(Class<?> cls) {
        MethodCollector.m26663i(11000);
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = f64345m;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (concurrentHashMap) {
                try {
                    t = concurrentHashMap.get(cls);
                    if (t == null) {
                        int i = 0;
                        if (cls.isArray()) {
                            Class<?> cls2 = cls;
                            do {
                                cls2 = cls2.getComponentType();
                                i++;
                            } while (cls2.isArray());
                            t = (T) Array.newInstance(cls2, new int[i]);
                        } else if (cls.isEnum()) {
                            C27184i a = C27174d.m54007a(cls, false).mo45245a(null);
                            Object[] objArr = {cls};
                            if (a != null) {
                                t = (T) a.mo45276b();
                            } else {
                                NullPointerException nullPointerException = new NullPointerException(C27159b.m53982a("enum missing constant with @NullValue annotation: %s", objArr));
                                MethodCollector.m26664o(11000);
                                throw nullPointerException;
                            }
                        } else {
                            t = (T) C27192n.m54038a((Class) cls);
                        }
                        f64345m.put(cls, t);
                    }
                } finally {
                    MethodCollector.m26664o(11000);
                }
            }
        }
        return t;
    }

    /* renamed from: b */
    public static <T> T m54017b(T t) {
        T t2;
        if (t == null || m54016a((Type) t.getClass())) {
            return t;
        }
        if (t instanceof C27185j) {
            return (T) t.clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof C27161a) {
            t2 = (T) t.clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = t.toArray();
            m54014a(array, array);
            return (T) Arrays.asList(array);
        } else {
            t2 = (T) C27192n.m54038a((Class) cls);
        }
        m54014a((Object) t, (Object) t2);
        return t2;
    }

    /* renamed from: a */
    public static boolean m54016a(Type type) {
        if (!(type instanceof Class)) {
            return false;
        }
        Class cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == C27183h.class || cls == Boolean.class) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Type m54013a(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C27192n.m54042a((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type a = C27192n.m54043a(list, (TypeVariable<?>) ((TypeVariable) type));
            if (a != null) {
                type = a;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }

    /* renamed from: a */
    public static Object m54012a(Type type, String str) {
        Class cls;
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            cls = null;
        }
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(String.valueOf(cls));
                throw new IllegalArgumentException(new StringBuilder(valueOf.length() + 37).append("expected type Character/char but got ").append(valueOf).toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == C27183h.class) {
                    return C27183h.parseRfc3339(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    return C27174d.m54007a(cls, false).mo45245a(str).mo45276b();
                }
            }
        }
        String valueOf2 = String.valueOf(String.valueOf(type));
        throw new IllegalArgumentException(new StringBuilder(valueOf2.length() + 35).append("expected primitive class, but got: ").append(valueOf2).toString());
    }

    /* renamed from: a */
    public static void m54014a(Object obj, Object obj2) {
        boolean z;
        C27174d dVar;
        Object a;
        Class<?> cls = obj.getClass();
        boolean z2 = true;
        int i = 0;
        if (cls == obj2.getClass()) {
            z = true;
        } else {
            z = false;
        }
        C27159b.m53983a(z);
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z2 = false;
            }
            C27159b.m53983a(z2);
            for (Object obj3 : C27192n.m54037a(obj)) {
                Array.set(obj2, i, m54017b(obj3));
                i++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object obj4 : collection) {
                collection2.add(m54017b(obj4));
            }
        } else {
            boolean isAssignableFrom = C27185j.class.isAssignableFrom(cls);
            if (isAssignableFrom) {
                dVar = ((C27185j) obj).f64369i;
            } else if (!Map.class.isAssignableFrom(cls)) {
                dVar = C27174d.m54007a(cls, false);
            } else if (C27161a.class.isAssignableFrom(cls)) {
                C27161a aVar = (C27161a) obj2;
                C27161a aVar2 = (C27161a) obj;
                int size = aVar2.size();
                while (i < size) {
                    aVar.mo45217a(i, m54017b(aVar2.mo45216a(i)));
                    i++;
                }
                return;
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), m54017b(entry.getValue()));
                }
                return;
            }
            for (String str : dVar.f64329c) {
                C27184i a2 = dVar.mo45245a(str);
                if (!a2.mo45275a() && ((!isAssignableFrom || !a2.f64365a) && (a = a2.mo45273a(obj)) != null)) {
                    a2.mo45274a(obj2, m54017b(a));
                }
            }
        }
    }
}
