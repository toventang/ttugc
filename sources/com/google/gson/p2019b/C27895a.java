package com.google.gson.p2019b;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.C27921a;
import com.google.gson.internal.C27925b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.b.a */
public class C27895a<T> {
    final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    static {
        Covode.recordClassIndex(33489);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return C27925b.m55986d(this.type);
    }

    public C27895a() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = (Class<? super T>) C27925b.m55985c(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    public static <T> C27895a<T> get(Class<T> cls) {
        return new C27895a<>(cls);
    }

    public boolean isAssignableFrom(C27895a<?> aVar) {
        return isAssignableFrom(aVar.type);
    }

    public static C27895a<?> get(Type type2) {
        return new C27895a<>(type2);
    }

    public static C27895a<?> getArray(Type type2) {
        return new C27895a<>(C27925b.m55976a(type2));
    }

    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C27925b.m55983b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C27895a) || !C27925b.m55982a(this.type, ((C27895a) obj).type)) {
            return false;
        }
        return true;
    }

    C27895a(Type type2) {
        Type b = C27925b.m55983b((Type) C27921a.m55968a(type2));
        this.type = b;
        this.rawType = (Class<? super T>) C27925b.m55985c(b);
        this.hashCode = b.hashCode();
    }

    public boolean isAssignableFrom(Type type2) {
        if (type2 == null) {
            return false;
        }
        if (this.type.equals(type2)) {
            return true;
        }
        Type type3 = this.type;
        if (type3 instanceof Class) {
            return this.rawType.isAssignableFrom(C27925b.m55985c(type2));
        }
        if (type3 instanceof ParameterizedType) {
            return isAssignableFrom(type2, (ParameterizedType) type3, new HashMap());
        }
        if (!(type3 instanceof GenericArrayType)) {
            throw buildUnexpectedTypeError(type3, Class.class, ParameterizedType.class, GenericArrayType.class);
        } else if (!this.rawType.isAssignableFrom(C27925b.m55985c(type2)) || !isAssignableFrom(type2, (GenericArrayType) this.type)) {
            return false;
        } else {
            return true;
        }
    }

    public static C27895a<?> getParameterized(Type type2, Type... typeArr) {
        return new C27895a<>(C27925b.m55977a((Type) null, type2, typeArr));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0012 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private static boolean isAssignableFrom(Type type2, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type2 instanceof GenericArrayType) {
            type2 = ((GenericArrayType) type2).getGenericComponentType();
        } else if (type2 instanceof Class) {
            type2 = (Class) type2;
            while (type2.isArray()) {
                type2 = type2.getComponentType();
            }
        }
        return isAssignableFrom(type2, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static AssertionError buildUnexpectedTypeError(Type type2, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName()).append(", ");
        }
        sb.append("but got: ").append(type2.getClass().getName()).append(", for type token: ").append(type2.toString()).append('.');
        return new AssertionError(sb.toString());
    }

    private static boolean matches(Type type2, Type type3, Map<String, Type> map) {
        if (type3.equals(type2)) {
            return true;
        }
        if (!(type2 instanceof TypeVariable) || !type3.equals(map.get(((TypeVariable) type2).getName()))) {
            return false;
        }
        return true;
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAssignableFrom(Type type2, ParameterizedType parameterizedType, Map<String, Type> map) {
        ParameterizedType parameterizedType2;
        while (true) {
            if (type2 == null) {
                return false;
            }
            if (parameterizedType.equals(type2)) {
                return true;
            }
            Class<?> c = C27925b.m55985c(type2);
            if ((type2 instanceof ParameterizedType) && (parameterizedType2 = (ParameterizedType) type2) != null) {
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                TypeVariable<Class<?>>[] typeParameters = c.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    Type type3 = actualTypeArguments[i];
                    TypeVariable<Class<?>> typeVariable = typeParameters[i];
                    while (type3 instanceof TypeVariable) {
                        type3 = map.get(((TypeVariable) type3).getName());
                    }
                    map.put(typeVariable.getName(), type3);
                }
                if (typeEquals(parameterizedType2, parameterizedType, map)) {
                    return true;
                }
            }
            for (Type type4 : c.getGenericInterfaces()) {
                if (isAssignableFrom(type4, parameterizedType, new HashMap(map))) {
                    return true;
                }
            }
            type2 = c.getGenericSuperclass();
            map = new HashMap(map);
        }
    }
}
