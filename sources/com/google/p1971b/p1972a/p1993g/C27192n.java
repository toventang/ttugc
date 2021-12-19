package com.google.p1971b.p1972a.p1993g;

import com.bytedance.covode.number.Covode;
import com.google.p1971b.p1972a.p1988f.p1989a.p1990a.p1991a.p1992a.C27159b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.b.a.g.n */
public final class C27192n {
    static {
        Covode.recordClassIndex(32772);
    }

    /* renamed from: a */
    public static Type m54042a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    /* renamed from: a */
    public static Type m54043a(List<Type> list, TypeVariable<?> typeVariable) {
        ParameterizedType a;
        Type a2;
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            do {
                size--;
                if (size >= 0) {
                    a = m54040a(list.get(size), cls);
                }
            } while (a == null);
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            int i = 0;
            while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                i++;
            }
            Type type = a.getActualTypeArguments()[i];
            return (!(type instanceof TypeVariable) || (a2 = m54043a(list, (TypeVariable) type)) == null) ? type : a2;
        }
        return null;
    }

    /* renamed from: a */
    private static Class<?> m54034a(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    /* renamed from: a */
    public static <T> T m54038a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw m54036a((Exception) e, (Class<?>) cls);
        } catch (InstantiationException e2) {
            throw m54036a((Exception) e2, (Class<?>) cls);
        }
    }

    /* renamed from: a */
    public static <T> Iterable<T> m54037a(final Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        C27159b.m53985a(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new Iterable<T>() {
            /* class com.google.p1971b.p1972a.p1993g.C27192n.C271931 */

            static {
                Covode.recordClassIndex(32773);
            }

            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                return new Iterator<T>() {
                    /* class com.google.p1971b.p1972a.p1993g.C27192n.C271931.C271941 */

                    /* renamed from: a */
                    final int f64378a;

                    /* renamed from: b */
                    int f64379b = 0;

                    static {
                        Covode.recordClassIndex(32774);
                    }

                    public final void remove() {
                        throw new UnsupportedOperationException();
                    }

                    public final boolean hasNext() {
                        if (this.f64379b < this.f64378a) {
                            return true;
                        }
                        return false;
                    }

                    @Override // java.util.Iterator
                    public final T next() {
                        if (hasNext()) {
                            Object obj = obj;
                            int i = this.f64379b;
                            this.f64379b = i + 1;
                            return (T) Array.get(obj, i);
                        }
                        throw new NoSuchElementException();
                    }

                    {
                        this.f64378a = Array.getLength(obj);
                    }
                };
            }
        };
    }

    /* renamed from: a */
    public static Type m54041a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: a */
    public static Class<?> m54035a(List<Type> list, Type type) {
        boolean z;
        if (type instanceof TypeVariable) {
            type = m54043a(list, (TypeVariable<?>) ((TypeVariable) type));
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m54035a(list, m54041a(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m54034a((ParameterizedType) type);
        }
        if (type == null) {
            z = true;
        } else {
            z = false;
        }
        C27159b.m53985a(z, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    /* renamed from: a */
    private static IllegalArgumentException m54036a(Exception exc, Class<?> cls) {
        StringBuilder append = new StringBuilder("unable to create new instance of class ").append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                append.append(" and");
            } else {
                z = true;
            }
            append.append(" ").append(str);
        }
        return new IllegalArgumentException(append.toString(), exc);
    }

    /* renamed from: a */
    public static Object m54039a(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            Array.set(newInstance, i, it.next());
            i++;
        }
        return newInstance;
    }

    /* renamed from: a */
    public static ParameterizedType m54040a(Type type, Class<?> cls) {
        Class<?> cls2;
        Class<?> a;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> a2 = m54034a(parameterizedType);
                if (a2 == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    Type[] genericInterfaces = a2.getGenericInterfaces();
                    int length = genericInterfaces.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        type = genericInterfaces[i];
                        if (type instanceof Class) {
                            a = (Class) type;
                        } else {
                            a = m54034a((ParameterizedType) type);
                        }
                        if (cls.isAssignableFrom(a)) {
                            break;
                        }
                        i++;
                    }
                }
                cls2 = a2;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }
}
