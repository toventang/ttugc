package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;

/* renamed from: com.google.gson.internal.b */
public final class C27925b {

    /* renamed from: a */
    static final Type[] f65595a = new Type[0];

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.b$a */
    public static final class C27926a implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f65596a;

        static {
            Covode.recordClassIndex(33521);
        }

        public final Type getGenericComponentType() {
            return this.f65596a;
        }

        public final int hashCode() {
            return this.f65596a.hashCode();
        }

        public final String toString() {
            return C27925b.m55986d(this.f65596a) + "[]";
        }

        public C27926a(Type type) {
            this.f65596a = C27925b.m55983b(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C27925b.m55982a(this, (Type) obj)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.b$b */
    public static final class C27927b implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f65597a;

        /* renamed from: b */
        private final Type f65598b;

        /* renamed from: c */
        private final Type[] f65599c;

        static {
            Covode.recordClassIndex(33522);
        }

        public final Type getOwnerType() {
            return this.f65597a;
        }

        public final Type getRawType() {
            return this.f65598b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f65599c.clone();
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f65599c) ^ this.f65598b.hashCode();
            Type type = this.f65597a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            int length = this.f65599c.length;
            if (length == 0) {
                return C27925b.m55986d(this.f65598b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C27925b.m55986d(this.f65598b)).append("<").append(C27925b.m55986d(this.f65599c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ").append(C27925b.m55986d(this.f65599c[i]));
            }
            return sb.append(">").toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C27925b.m55982a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        public C27927b(Type type, Type type2, Type... typeArr) {
            Type b;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C27921a.m55969a(z2);
            }
            if (type == null) {
                b = null;
            } else {
                b = C27925b.m55983b(type);
            }
            this.f65597a = b;
            this.f65598b = C27925b.m55983b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f65599c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C27921a.m55968a(this.f65599c[i]);
                C27925b.m55987e(this.f65599c[i]);
                Type[] typeArr3 = this.f65599c;
                typeArr3[i] = C27925b.m55983b(typeArr3[i]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.b$c */
    public static final class C27928c implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f65600a;

        /* renamed from: b */
        private final Type f65601b;

        static {
            Covode.recordClassIndex(33523);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f65601b;
            if (type == null) {
                return C27925b.f65595a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f65600a};
        }

        public final int hashCode() {
            int i;
            Type type = this.f65601b;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f65600a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f65601b != null) {
                return "? super " + C27925b.m55986d(this.f65601b);
            }
            if (this.f65600a == Object.class) {
                return "?";
            }
            return "? extends " + C27925b.m55986d(this.f65600a);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C27925b.m55982a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        public C27928c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C27921a.m55969a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C27921a.m55969a(z2);
            if (typeArr2.length == 1) {
                C27921a.m55968a(typeArr2[0]);
                C27925b.m55987e(typeArr2[0]);
                C27921a.m55969a(typeArr[0] != Object.class ? false : z3);
                this.f65601b = C27925b.m55983b(typeArr2[0]);
                this.f65600a = Object.class;
                return;
            }
            C27921a.m55968a(typeArr[0]);
            C27925b.m55987e(typeArr[0]);
            this.f65601b = null;
            this.f65600a = C27925b.m55983b(typeArr[0]);
        }
    }

    static {
        Covode.recordClassIndex(33520);
    }

    /* renamed from: a */
    public static GenericArrayType m55976a(Type type) {
        return new C27926a(type);
    }

    /* renamed from: d */
    public static String m55986d(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: e */
    static void m55987e(Type type) {
        boolean z;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z = true;
        } else {
            z = false;
        }
        C27921a.m55969a(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.gson.internal.b$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m55983b(java.lang.reflect.Type r4) {
        /*
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.internal.b$a r1 = new com.google.gson.internal.b$a
            java.lang.Class r0 = r4.getComponentType()
            java.lang.reflect.Type r0 = m55983b(r0)
            r1.<init>(r0)
            r4 = r1
        L_0x001a:
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            return r4
        L_0x001d:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            com.google.gson.internal.b$b r3 = new com.google.gson.internal.b$b
            java.lang.reflect.Type r2 = r4.getOwnerType()
            java.lang.reflect.Type r1 = r4.getRawType()
            java.lang.reflect.Type[] r0 = r4.getActualTypeArguments()
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0035:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            com.google.gson.internal.b$a r1 = new com.google.gson.internal.b$a
            java.lang.reflect.Type r0 = r4.getGenericComponentType()
            r1.<init>(r0)
            return r1
        L_0x0045:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            com.google.gson.internal.b$c r2 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r0 = r4.getLowerBounds()
            r2.<init>(r1, r0)
            return r2
        L_0x0059:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C27925b.m55983b(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: c */
    public static Class<?> m55985c(Type type) {
        String name;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                C27921a.m55969a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m55985c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    if (type == null) {
                        name = "null";
                    } else {
                        name = type.getClass().getName();
                    }
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
                }
            }
        }
        return (Class) type;
    }

    /* renamed from: a */
    public static Type m55978a(Type type, Class<?> cls) {
        Type a = m55979a(type, cls, (Class<?>) Collection.class);
        if (a instanceof WildcardType) {
            a = ((WildcardType) a).getUpperBounds()[0];
        }
        if (a instanceof ParameterizedType) {
            return ((ParameterizedType) a).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: a */
    public static boolean m55982a(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    return true;
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                    return false;
                }
                return true;
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static ParameterizedType m55977a(Type type, Type type2, Type... typeArr) {
        return new C27927b(type, type2, typeArr);
    }

    /* renamed from: a */
    public static Type m55979a(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C27921a.m55969a(cls2.isAssignableFrom(cls));
        return m55980a(type, cls, m55984b(type, cls, cls2));
    }

    /* renamed from: a */
    public static Type m55980a(Type type, Class<?> cls, Type type2) {
        return m55981a(type, cls, type2, new HashSet());
    }

    /* renamed from: b */
    private static Type m55984b(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> cls3;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int i = 0;
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (interfaces[i] == cls2) {
                        return cls.getGenericInterfaces()[i];
                    } else {
                        if (cls2.isAssignableFrom(interfaces[i])) {
                            type = cls.getGenericInterfaces()[i];
                            cls3 = interfaces[i];
                            break;
                        }
                        i++;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    cls3 = cls.getSuperclass();
                    if (cls3 == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        type = cls.getGenericSuperclass();
                        cls = cls3;
                    } else {
                        cls = cls3;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:91:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x003d */
    /* renamed from: a */
    private static Type m55981a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        boolean z;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (collection.contains(typeVariable)) {
                    return type2;
                }
                collection.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type b = m55984b(type, cls, cls2);
                    if (b instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) b).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type a = m55981a(type, cls, componentType, collection);
                        if (componentType == a) {
                            return cls3;
                        }
                        return m55976a(a);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type a2 = m55981a(type, cls, genericComponentType, collection);
                    if (genericComponentType == a2) {
                        return genericArrayType;
                    }
                    return m55976a(a2);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type a3 = m55981a(type, cls, ownerType, collection);
                    if (a3 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type a4 = m55981a(type, cls, actualTypeArguments[i], collection);
                        if (a4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = a4;
                        }
                        i++;
                    }
                    if (z) {
                        return m55977a(a3, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z2 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type a5 = m55981a(type, cls, lowerBounds[0], collection);
                            wildcardType = wildcardType2;
                            if (a5 != lowerBounds[0]) {
                                return new C27928c(new Type[]{Object.class}, a5 instanceof WildcardType ? ((WildcardType) a5).getLowerBounds() : new Type[]{a5});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type a6 = m55981a(type, cls, upperBounds[0], collection);
                                wildcardType = wildcardType2;
                                if (a6 != upperBounds[0]) {
                                    return new C27928c(a6 instanceof WildcardType ? ((WildcardType) a6).getUpperBounds() : new Type[]{a6}, f65595a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }
}
