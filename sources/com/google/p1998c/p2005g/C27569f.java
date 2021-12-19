package com.google.p1998c.p2005g;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27236g;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27349ab;
import com.google.p1998c.p2005g.C27597i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.c.g.f */
public final class C27569f {

    /* renamed from: a */
    private final C27572b f64936a;

    static {
        Covode.recordClassIndex(33149);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.f$c */
    public static final class C27574c {

        /* renamed from: a */
        private final TypeVariable<?> f64945a;

        static {
            Covode.recordClassIndex(33154);
        }

        public final String toString() {
            return this.f64945a.toString();
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f64945a.getGenericDeclaration(), this.f64945a.getName()});
        }

        C27574c(TypeVariable<?> typeVariable) {
            this.f64945a = (TypeVariable) C27245k.m54229a(typeVariable);
        }

        /* renamed from: a */
        static C27574c m55124a(Type type) {
            if (type instanceof TypeVariable) {
                return new C27574c((TypeVariable) type);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo46150b(Type type) {
            if (type instanceof TypeVariable) {
                return m55125a((TypeVariable) type);
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C27574c) {
                return m55125a(((C27574c) obj).f64945a);
            }
            return false;
        }

        /* renamed from: a */
        private boolean m55125a(TypeVariable<?> typeVariable) {
            if (!this.f64945a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) || !this.f64945a.getName().equals(typeVariable.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.c.g.f$d */
    static class C27575d {

        /* renamed from: a */
        private final AtomicInteger f64946a;

        static {
            Covode.recordClassIndex(33155);
        }

        /* renamed from: a */
        private C27575d m55127a() {
            return new C27575d(this.f64946a);
        }

        C27575d() {
            this(new AtomicInteger());
        }

        private C27575d(AtomicInteger atomicInteger) {
            this.f64946a = atomicInteger;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public TypeVariable<?> mo46155a(Type[] typeArr) {
            return C27597i.m55193a(C27575d.class, "capture#" + this.f64946a.incrementAndGet() + "-of ? extends " + new C27236g("&").mo45323a((Object[]) typeArr), typeArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Type mo46154a(Type type) {
            Type a;
            C27245k.m54229a(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return C27597i.m55191a(m55127a().mo46154a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    final TypeVariable typeVariable = typeParameters[i];
                    actualTypeArguments[i] = new C27575d(this.f64946a) {
                        /* class com.google.p1998c.p2005g.C27569f.C27575d.C275761 */

                        static {
                            Covode.recordClassIndex(33156);
                        }

                        /* access modifiers changed from: package-private */
                        @Override // com.google.p1998c.p2005g.C27569f.C27575d
                        /* renamed from: a */
                        public final TypeVariable<?> mo46155a(Type[] typeArr) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                            linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                            if (linkedHashSet.size() > 1) {
                                linkedHashSet.remove(Object.class);
                            }
                            return super.mo46155a((Type[]) linkedHashSet.toArray(new Type[0]));
                        }
                    }.mo46154a(actualTypeArguments[i]);
                }
                C27575d a2 = m55127a();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType == null) {
                    a = null;
                } else {
                    a = a2.mo46154a(ownerType);
                }
                return C27597i.m55190a(a, cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length == 0) {
                    return mo46155a(wildcardType.getUpperBounds());
                }
                return type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        /* synthetic */ C27575d(AtomicInteger atomicInteger, byte b) {
            this(atomicInteger);
        }
    }

    /* renamed from: com.google.c.g.f$a */
    static final class C27571a extends AbstractC27596h {

        /* renamed from: a */
        static final C27575d f64939a = new C27575d();

        /* renamed from: b */
        final Map<C27574c, Type> f64940b = new HashMap();

        static {
            Covode.recordClassIndex(33151);
        }

        C27571a() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2005g.AbstractC27596h
        /* renamed from: a */
        public final void mo46146a(TypeVariable<?> typeVariable) {
            mo46193a(typeVariable.getBounds());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2005g.AbstractC27596h
        /* renamed from: a */
        public final void mo46147a(WildcardType wildcardType) {
            mo46193a(wildcardType.getUpperBounds());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2005g.AbstractC27596h
        /* renamed from: a */
        public final void mo46143a(Class<?> cls) {
            mo46193a(cls.getGenericSuperclass());
            mo46193a(cls.getGenericInterfaces());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.p1998c.p2005g.AbstractC27596h
        /* renamed from: a */
        public final void mo46145a(ParameterizedType parameterizedType) {
            boolean z;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (typeParameters.length == actualTypeArguments.length) {
                z = true;
            } else {
                z = false;
            }
            C27245k.m54243b(z);
            for (int i = 0; i < typeParameters.length; i++) {
                C27574c cVar = new C27574c(typeParameters[i]);
                Type type = actualTypeArguments[i];
                if (!this.f64940b.containsKey(cVar)) {
                    Type type2 = type;
                    while (true) {
                        if (type2 == null) {
                            this.f64940b.put(cVar, type);
                            break;
                        } else if (cVar.mo46150b(type2)) {
                            while (type != null) {
                                type = this.f64940b.remove(C27574c.m55124a(type));
                            }
                        } else {
                            type2 = this.f64940b.get(C27574c.m55124a(type2));
                        }
                    }
                }
            }
            mo46193a(cls);
            mo46193a(parameterizedType.getOwnerType());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.f$b */
    public static class C27572b {

        /* renamed from: a */
        private final AbstractC27349ab<C27574c, Type> f64941a;

        static {
            Covode.recordClassIndex(33152);
        }

        C27572b() {
            this.f64941a = AbstractC27349ab.m54638of();
        }

        private C27572b(AbstractC27349ab<C27574c, Type> abVar) {
            this.f64941a = abVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C27572b mo46148a(Map<C27574c, ? extends Type> map) {
            AbstractC27349ab.C27351a builder = AbstractC27349ab.builder();
            builder.mo45566a(this.f64941a.entrySet());
            for (Map.Entry<C27574c, ? extends Type> entry : map.entrySet()) {
                C27574c key = entry.getKey();
                Type type = (Type) entry.getValue();
                C27245k.m54240a(!key.mo46150b(type), "Type variable %s bound to itself", key);
                builder.mo45567a(key, type);
            }
            return new C27572b(builder.mo45568a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Type mo46149a(TypeVariable<?> typeVariable, C27572b bVar) {
            Type type = this.f64941a.get(new C27574c(typeVariable));
            if (type != null) {
                return new C27569f(bVar, (byte) 0).mo46141a(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] a = new C27569f(bVar, (byte) 0).mo46142a(bounds);
            if (!C27597i.C27613d.f64988a || !Arrays.equals(bounds, a)) {
                return C27597i.m55193a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
            }
            return typeVariable;
        }
    }

    public C27569f() {
        this.f64936a = new C27572b();
    }

    private C27569f(C27572b bVar) {
        this.f64936a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C27569f mo46140a(Map<C27574c, ? extends Type> map) {
        return new C27569f(this.f64936a.mo46148a(map));
    }

    /* renamed from: a */
    public final Type mo46141a(Type type) {
        Type a;
        C27245k.m54229a(type);
        if (type instanceof TypeVariable) {
            C27572b bVar = this.f64936a;
            TypeVariable<?> typeVariable = (TypeVariable) type;
            return bVar.mo46149a(typeVariable, new C27572b(typeVariable, bVar) {
                /* class com.google.p1998c.p2005g.C27569f.C27572b.C275731 */

                /* renamed from: a */
                final /* synthetic */ TypeVariable f64942a;

                /* renamed from: b */
                final /* synthetic */ C27572b f64943b;

                static {
                    Covode.recordClassIndex(33153);
                }

                @Override // com.google.p1998c.p2005g.C27569f.C27572b
                /* renamed from: a */
                public final Type mo46149a(TypeVariable<?> typeVariable, C27572b bVar) {
                    if (typeVariable.getGenericDeclaration().equals(this.f64942a.getGenericDeclaration())) {
                        return typeVariable;
                    }
                    return this.f64943b.mo46149a(typeVariable, bVar);
                }

                {
                    this.f64942a = r2;
                    this.f64943b = r3;
                }
            });
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                a = null;
            } else {
                a = mo46141a(ownerType);
            }
            return C27597i.m55190a(a, (Class) mo46141a(parameterizedType.getRawType()), mo46142a(parameterizedType.getActualTypeArguments()));
        } else if (type instanceof GenericArrayType) {
            return C27597i.m55191a(mo46141a(((GenericArrayType) type).getGenericComponentType()));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C27597i.C27617h(mo46142a(wildcardType.getLowerBounds()), mo46142a(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: a */
    public final Type[] mo46142a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo46141a(typeArr[i]);
        }
        return typeArr2;
    }

    /* synthetic */ C27569f(C27572b bVar, byte b) {
        this(bVar);
    }

    /* renamed from: a */
    public static <T> T m55107a(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    /* renamed from: a */
    public static void m55108a(final Map<C27574c, Type> map, Type type, final Type type2) {
        if (!type.equals(type2)) {
            new AbstractC27596h() {
                /* class com.google.p1998c.p2005g.C27569f.C275701 */

                static {
                    Covode.recordClassIndex(33150);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2005g.AbstractC27596h
                /* renamed from: a */
                public final void mo46146a(TypeVariable<?> typeVariable) {
                    map.put(new C27574c(typeVariable), type2);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2005g.AbstractC27596h
                /* renamed from: a */
                public final void mo46143a(Class<?> cls) {
                    if (!(type2 instanceof WildcardType)) {
                        throw new IllegalArgumentException("No type mapping from " + cls + " to " + type2);
                    }
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2005g.AbstractC27596h
                /* renamed from: a */
                public final void mo46144a(GenericArrayType genericArrayType) {
                    boolean z;
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        Type c = C27597i.m55198c(type);
                        if (c != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C27245k.m54240a(z, "%s is not an array type.", type2);
                        C27569f.m55108a(map, genericArrayType.getGenericComponentType(), c);
                    }
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2005g.AbstractC27596h
                /* renamed from: a */
                public final void mo46145a(ParameterizedType parameterizedType) {
                    boolean z;
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) C27569f.m55107a(ParameterizedType.class, type);
                        if (!(parameterizedType.getOwnerType() == null || parameterizedType2.getOwnerType() == null)) {
                            C27569f.m55108a(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                        }
                        C27245k.m54241a(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type2);
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                        if (actualTypeArguments.length == actualTypeArguments2.length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C27245k.m54241a(z, "%s not compatible with %s", parameterizedType, parameterizedType2);
                        for (int i = 0; i < actualTypeArguments.length; i++) {
                            C27569f.m55108a(map, actualTypeArguments[i], actualTypeArguments2[i]);
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2005g.AbstractC27596h
                /* renamed from: a */
                public final void mo46147a(WildcardType wildcardType) {
                    boolean z;
                    Type type = type2;
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType2 = (WildcardType) type;
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Type[] upperBounds2 = wildcardType2.getUpperBounds();
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                        if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C27245k.m54241a(z, "Incompatible type: %s vs. %s", wildcardType, type2);
                        for (int i = 0; i < upperBounds.length; i++) {
                            C27569f.m55108a(map, upperBounds[i], upperBounds2[i]);
                        }
                        for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                            C27569f.m55108a(map, lowerBounds[i2], lowerBounds2[i2]);
                        }
                    }
                }
            }.mo46193a(type);
        }
    }
}
