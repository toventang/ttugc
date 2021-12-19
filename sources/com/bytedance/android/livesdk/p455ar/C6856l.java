package com.bytedance.android.livesdk.p455ar;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.bytedance.android.livesdk.ar.l */
public final class C6856l {

    /* renamed from: a */
    static final Type[] f17197a = new Type[0];

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.ar.l$a */
    public static final class C6857a implements GenericArrayType {

        /* renamed from: a */
        private final Type f17198a;

        static {
            Covode.recordClassIndex(7595);
        }

        public final Type getGenericComponentType() {
            return this.f17198a;
        }

        public final int hashCode() {
            return this.f17198a.hashCode();
        }

        public final String toString() {
            return C6856l.m14671b(this.f17198a) + "[]";
        }

        public C6857a(Type type) {
            this.f17198a = type;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C6856l.m14670a(this, (Type) obj)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.ar.l$b */
    public static final class C6858b implements ParameterizedType {

        /* renamed from: a */
        private final Type f17199a;

        /* renamed from: b */
        private final Type f17200b;

        /* renamed from: c */
        private final Type[] f17201c;

        static {
            Covode.recordClassIndex(7596);
        }

        public final Type getOwnerType() {
            return this.f17199a;
        }

        public final Type getRawType() {
            return this.f17200b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f17201c.clone();
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f17201c) ^ this.f17200b.hashCode();
            Type type = this.f17199a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f17201c.length + 1) * 30);
            sb.append(C6856l.m14671b(this.f17200b));
            if (this.f17201c.length == 0) {
                return sb.toString();
            }
            sb.append("<").append(C6856l.m14671b(this.f17201c[0]));
            for (int i = 1; i < this.f17201c.length; i++) {
                sb.append(", ").append(C6856l.m14671b(this.f17201c[i]));
            }
            return sb.append(">").toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C6856l.m14670a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        public C6858b(Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                boolean z2 = true;
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != (((Class) type2).getEnclosingClass() != null ? false : z2)) {
                    throw new IllegalArgumentException();
                }
            }
            this.f17199a = type;
            this.f17200b = type2;
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f17201c = typeArr2;
            for (Type type3 : typeArr2) {
                Objects.requireNonNull(type3);
                C6856l.m14673c(type3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.ar.l$c */
    public static final class C6859c implements WildcardType {

        /* renamed from: a */
        private final Type f17202a;

        /* renamed from: b */
        private final Type f17203b;

        static {
            Covode.recordClassIndex(7597);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f17203b;
            if (type == null) {
                return C6856l.f17197a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f17202a};
        }

        public final int hashCode() {
            int i;
            Type type = this.f17203b;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f17202a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f17203b != null) {
                return "? super " + C6856l.m14671b(this.f17203b);
            }
            if (this.f17202a == Object.class) {
                return "?";
            }
            return "? extends " + C6856l.m14671b(this.f17202a);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C6856l.m14670a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        public C6859c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C6856l.m14673c(typeArr2[0]);
                if (typeArr[0] == Object.class) {
                    this.f17203b = typeArr2[0];
                    this.f17202a = Object.class;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Objects.requireNonNull(typeArr[0]);
                C6856l.m14673c(typeArr[0]);
                this.f17203b = null;
                this.f17202a = typeArr[0];
            }
        }
    }

    static {
        Covode.recordClassIndex(7594);
    }

    /* renamed from: b */
    static String m14671b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: c */
    static void m14673c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    static Class<?> m14665a(Type type) {
        while (true) {
            Objects.requireNonNull(type, "type == null");
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m14665a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
                }
            }
        }
    }

    /* renamed from: d */
    static boolean m14674d(Type type) {
        String name;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (m14674d(type2)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            } else {
                if (type == null) {
                    name = "null";
                } else {
                    name = type.getClass().getName();
                }
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
            }
        }
        return false;
    }

    /* renamed from: a */
    static <T> T m14666a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    static Type m14667a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getUpperBounds()[0];
        }
        return type;
    }

    /* renamed from: a */
    static boolean m14670a(Type type, Type type2) {
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
    static Type m14668a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m14669a(type, cls, m14672b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    private static Type m14672b(Type type, Class<?> cls, Class<?> cls2) {
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

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:? */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[LOOP:0: B:0:0x0000->B:16:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0034 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m14669a(java.lang.reflect.Type r7, java.lang.Class<?> r8, java.lang.reflect.Type r9) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p455ar.C6856l.m14669a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }
}
