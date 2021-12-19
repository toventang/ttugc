package p4640l;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.AbstractC90031ad;
import p4632k.C89420f;

/* access modifiers changed from: package-private */
/* renamed from: l.o */
public final class C89787o {

    /* renamed from: a */
    static final Type[] f203617a = new Type[0];

    /* access modifiers changed from: package-private */
    /* renamed from: l.o$a */
    public static final class C89788a implements GenericArrayType {

        /* renamed from: a */
        private final Type f203618a;

        static {
            Covode.recordClassIndex(105882);
        }

        public final Type getGenericComponentType() {
            return this.f203618a;
        }

        public final int hashCode() {
            return this.f203618a.hashCode();
        }

        public final String toString() {
            return C89787o.m155880b(this.f203618a) + "[]";
        }

        C89788a(Type type) {
            this.f203618a = type;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !C89787o.m155879a(this, (Type) obj)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.o$b */
    public static final class C89789b implements ParameterizedType {

        /* renamed from: a */
        private final Type f203619a;

        /* renamed from: b */
        private final Type f203620b;

        /* renamed from: c */
        private final Type[] f203621c;

        static {
            Covode.recordClassIndex(105883);
        }

        public final Type getOwnerType() {
            return this.f203619a;
        }

        public final Type getRawType() {
            return this.f203620b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f203621c.clone();
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.f203621c) ^ this.f203620b.hashCode();
            Type type = this.f203619a;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            if (this.f203621c.length == 0) {
                return C89787o.m155880b(this.f203620b);
            }
            StringBuilder sb = new StringBuilder((this.f203621c.length + 1) * 30);
            sb.append(C89787o.m155880b(this.f203620b));
            sb.append("<").append(C89787o.m155880b(this.f203621c[0]));
            for (int i = 1; i < this.f203621c.length; i++) {
                sb.append(", ").append(C89787o.m155880b(this.f203621c[i]));
            }
            return sb.append(">").toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !C89787o.m155879a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        C89789b(Type type, Type type2, Type... typeArr) {
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
            for (Type type3 : typeArr) {
                C89787o.m155873a(type3, "typeArgument == null");
                C89787o.m155882c(type3);
            }
            this.f203619a = type;
            this.f203620b = type2;
            this.f203621c = (Type[]) typeArr.clone();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l.o$c */
    public static final class C89790c implements WildcardType {

        /* renamed from: a */
        private final Type f203622a;

        /* renamed from: b */
        private final Type f203623b;

        static {
            Covode.recordClassIndex(105884);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f203623b;
            if (type == null) {
                return C89787o.f203617a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f203622a};
        }

        public final int hashCode() {
            int i;
            Type type = this.f203623b;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f203622a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f203623b != null) {
                return "? super " + C89787o.m155880b(this.f203623b);
            }
            if (this.f203622a == Object.class) {
                return "?";
            }
            return "? extends " + C89787o.m155880b(this.f203622a);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !C89787o.m155879a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        C89790c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C89787o.m155882c(typeArr2[0]);
                if (typeArr[0] == Object.class) {
                    this.f203623b = typeArr2[0];
                    this.f203622a = Object.class;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Objects.requireNonNull(typeArr[0]);
                C89787o.m155882c(typeArr[0]);
                this.f203623b = null;
                this.f203622a = typeArr[0];
            }
        }
    }

    static {
        Covode.recordClassIndex(105881);
    }

    /* renamed from: b */
    static String m155880b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    /* renamed from: c */
    static void m155882c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    static Type m155884e(Type type) {
        if (type instanceof ParameterizedType) {
            return m155874a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: a */
    static AbstractC90031ad m155877a(AbstractC90031ad adVar) {
        C89420f fVar = new C89420f();
        adVar.source().mo143798a(fVar);
        return AbstractC90031ad.create(adVar.contentType(), adVar.contentLength(), fVar);
    }

    /* renamed from: a */
    static Class<?> m155872a(Type type) {
        while (true) {
            m155873a(type, "type == null");
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
                return Array.newInstance(m155872a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
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
    static boolean m155883d(Type type) {
        String name;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (m155883d(type2)) {
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
    static <T> void m155878a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: a */
    static <T> T m155873a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    static Type m155874a(int i, ParameterizedType parameterizedType) {
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
    static boolean m155879a(Type type, Type type2) {
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
    static Type m155875a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m155876a(type, cls, m155881b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    private static Type m155881b(Type type, Class<?> cls, Class<?> cls2) {
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
    private static java.lang.reflect.Type m155876a(java.lang.reflect.Type r7, java.lang.Class<?> r8, java.lang.reflect.Type r9) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: p4640l.C89787o.m155876a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }
}
