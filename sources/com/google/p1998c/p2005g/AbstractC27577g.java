package com.google.p1998c.p2005g;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27246l;
import com.google.p1998c.p1999a.C27236g;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27349ab;
import com.google.p1998c.p2001c.AbstractC27381ai;
import com.google.p1998c.p2001c.AbstractC27450az;
import com.google.p1998c.p2001c.AbstractC27479br;
import com.google.p1998c.p2001c.AbstractC27530s;
import com.google.p1998c.p2001c.AbstractC27534v;
import com.google.p1998c.p2001c.AbstractC27540z;
import com.google.p1998c.p2001c.C27446aw;
import com.google.p1998c.p2004f.C27561b;
import com.google.p1998c.p2005g.AbstractC27563b;
import com.google.p1998c.p2005g.C27569f;
import com.google.p1998c.p2005g.C27597i;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.c.g.g */
public abstract class AbstractC27577g<T> extends AbstractC27567d<T> implements Serializable {

    /* renamed from: a */
    private transient C27569f f64949a;
    public final Type runtimeType;

    static {
        Covode.recordClassIndex(33157);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.g$e */
    public static abstract class AbstractC27586e<K> {

        /* renamed from: a */
        static final AbstractC27586e<AbstractC27577g<?>> f64962a = new AbstractC27586e<AbstractC27577g<?>>() {
            /* class com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e.C275871 */

            static {
                Covode.recordClassIndex(33167);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: b */
            public final /* synthetic */ Class mo46190b(AbstractC27577g<?> gVar) {
                return gVar.getRawType();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: d */
            public final /* synthetic */ AbstractC27577g<?> mo46192d(AbstractC27577g<?> gVar) {
                AbstractC27577g<?> gVar2 = gVar;
                if (gVar2.runtimeType instanceof TypeVariable) {
                    return AbstractC27577g.m55136b(((TypeVariable) gVar2.runtimeType).getBounds()[0]);
                }
                if (gVar2.runtimeType instanceof WildcardType) {
                    return AbstractC27577g.m55136b(((WildcardType) gVar2.runtimeType).getUpperBounds()[0]);
                }
                Type genericSuperclass = gVar2.getRawType().getGenericSuperclass();
                if (genericSuperclass == null) {
                    return null;
                }
                return gVar2.mo46156a(genericSuperclass);
            }

            /* Return type fixed from 'java.lang.Iterable' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: c */
            public final /* synthetic */ Iterable<? extends AbstractC27577g<?>> mo46191c(AbstractC27577g<?> gVar) {
                AbstractC27577g<?> gVar2 = gVar;
                if (gVar2.runtimeType instanceof TypeVariable) {
                    return AbstractC27577g.m55131a(((TypeVariable) gVar2.runtimeType).getBounds());
                }
                if (gVar2.runtimeType instanceof WildcardType) {
                    return AbstractC27577g.m55131a(((WildcardType) gVar2.runtimeType).getUpperBounds());
                }
                AbstractC27540z.C27541a builder = AbstractC27540z.builder();
                for (Type type : gVar2.getRawType().getGenericInterfaces()) {
                    builder.mo46104c(gVar2.mo46156a(type));
                }
                return builder.mo46102a();
            }
        };

        /* renamed from: b */
        static final AbstractC27586e<Class<?>> f64963b = new AbstractC27586e<Class<?>>() {
            /* class com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e.C275882 */

            static {
                Covode.recordClassIndex(33168);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Class mo46190b(Class<?> cls) {
                return cls;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: d */
            public final /* synthetic */ Class<?> mo46192d(Class<?> cls) {
                return cls.getSuperclass();
            }

            /* Return type fixed from 'java.lang.Iterable' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: c */
            public final /* synthetic */ Iterable<? extends Class<?>> mo46191c(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Class<?> mo46190b(K k);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Iterable<? extends K> mo46191c(K k);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract K mo46192d(K k);

        private AbstractC27586e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC27586e<K> mo46189a() {
            return new C27591a<K>(this) {
                /* class com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e.C275893 */

                static {
                    Covode.recordClassIndex(33169);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e, com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e.C27591a
                /* renamed from: c */
                public final Iterable<? extends K> mo46191c(K k) {
                    return AbstractC27381ai.m54718of();
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.g.g$e$3 */
                /* JADX WARN: Multi-variable type inference failed */
                /* access modifiers changed from: package-private */
                @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
                /* renamed from: a */
                public final AbstractC27540z<K> mo46187a(Iterable<? extends K> iterable) {
                    AbstractC27540z.C27541a builder = AbstractC27540z.builder();
                    for (Object obj : iterable) {
                        if (!mo46190b(obj).isInterface()) {
                            builder.mo46104c(obj);
                        }
                    }
                    return super.mo46187a((Iterable) builder.mo46102a());
                }
            };
        }

        static {
            Covode.recordClassIndex(33166);
        }

        /* renamed from: com.google.c.g.g$e$a */
        static class C27591a<K> extends AbstractC27586e<K> {

            /* renamed from: c */
            private final AbstractC27586e<K> f64967c;

            static {
                Covode.recordClassIndex(33171);
            }

            C27591a(AbstractC27586e<K> eVar) {
                super((byte) 0);
                this.f64967c = eVar;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: b */
            public final Class<?> mo46190b(K k) {
                return this.f64967c.mo46190b(k);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: c */
            public Iterable<? extends K> mo46191c(K k) {
                return this.f64967c.mo46191c(k);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e
            /* renamed from: d */
            public final K mo46192d(K k) {
                return this.f64967c.mo46192d(k);
            }
        }

        /* synthetic */ AbstractC27586e(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final AbstractC27540z<K> mo46188a(K k) {
            return mo46187a((Iterable) AbstractC27540z.m55063of(k));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.g.g$e<K> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC27540z<K> mo46187a(Iterable<? extends K> iterable) {
            final HashMap hashMap = new HashMap();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                m55159a(it.next(), hashMap);
            }
            final AbstractC27450az a = C27446aw.f64746a.mo45799a();
            return AbstractC27540z.sortedCopyOf(new AbstractC27450az<K>() {
                /* class com.google.p1998c.p2005g.AbstractC27577g.AbstractC27586e.C275904 */

                static {
                    Covode.recordClassIndex(33170);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Comparator */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.p1998c.p2001c.AbstractC27450az, java.util.Comparator
                public final int compare(K k, K k2) {
                    return a.compare(hashMap.get(k), hashMap.get(k2));
                }
            }, hashMap.keySet());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        private int m55159a(K k, Map<? super K, Integer> map) {
            Integer num = map.get(k);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = mo46190b(k).isInterface();
            Iterator<? extends K> it = mo46191c(k).iterator();
            int i = isInterface;
            while (it.hasNext()) {
                i = Math.max(i, m55159a(it.next(), map));
            }
            K d = mo46192d(k);
            int i2 = i;
            if (d != null) {
                i2 = Math.max(i, m55159a(d, map));
            }
            int i3 = (i2 == 1 ? 1 : 0) + 1;
            map.put(k, Integer.valueOf(i3));
            return i3;
        }
    }

    public final Type getType() {
        return this.runtimeType;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.g$b */
    public final class C27582b extends AbstractC27577g<T>.C27595g {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        private transient AbstractC27381ai<AbstractC27577g<? super T>> f64957c;

        static {
            Covode.recordClassIndex(33162);
        }

        @Override // com.google.p1998c.p2005g.AbstractC27577g.C27595g
        public final AbstractC27577g<T>.C27595g classes() {
            return this;
        }

        @Override // com.google.p1998c.p2005g.AbstractC27577g.C27595g
        public final AbstractC27577g<T>.C27595g interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        private Object readResolve() {
            return AbstractC27577g.this.getTypes().classes();
        }

        @Override // com.google.p1998c.p2005g.AbstractC27577g.C27595g
        public final Set<Class<? super T>> rawTypes() {
            return AbstractC27381ai.copyOf((Collection) AbstractC27586e.f64963b.mo46189a().mo46187a(AbstractC27577g.this.getRawTypes()));
        }

        @Override // com.google.p1998c.p2005g.AbstractC27577g.C27595g, com.google.p1998c.p2001c.AbstractC27534v
        /* renamed from: b */
        public final Set<AbstractC27577g<? super T>> mo45371c() {
            AbstractC27381ai<AbstractC27577g<? super T>> aiVar = this.f64957c;
            if (aiVar != null) {
                return aiVar;
            }
            AbstractC27381ai<AbstractC27577g<? super T>> copyOf = AbstractC27381ai.copyOf(AbstractC27530s.m55037a(AbstractC27586e.f64962a.mo46189a().mo46188a(AbstractC27577g.this)).mo46060a(EnumC27592f.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo46061a());
            this.f64957c = copyOf;
            return copyOf;
        }

        private C27582b() {
            super();
        }

        /* synthetic */ C27582b(AbstractC27577g gVar, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.g$c */
    public final class C27583c extends AbstractC27577g<T>.C27595g {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        private final transient AbstractC27577g<T>.C27595g f64959c;

        /* renamed from: d */
        private transient AbstractC27381ai<AbstractC27577g<? super T>> f64960d;

        static {
            Covode.recordClassIndex(33163);
        }

        @Override // com.google.p1998c.p2005g.AbstractC27577g.C27595g
        public final AbstractC27577g<T>.C27595g interfaces() {
            return this;
        }

        @Override // com.google.p1998c.p2005g.AbstractC27577g.C27595g
        public final AbstractC27577g<T>.C27595g classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        private Object readResolve() {
            return AbstractC27577g.this.getTypes().interfaces();
        }

        @Override // com.google.p1998c.p2005g.AbstractC27577g.C27595g, com.google.p1998c.p2001c.AbstractC27534v
        /* renamed from: b */
        public final Set<AbstractC27577g<? super T>> mo45371c() {
            AbstractC27381ai<AbstractC27577g<? super T>> aiVar = this.f64960d;
            if (aiVar != null) {
                return aiVar;
            }
            AbstractC27381ai<AbstractC27577g<? super T>> copyOf = AbstractC27381ai.copyOf(AbstractC27530s.m55037a(this.f64959c).mo46060a(EnumC27592f.INTERFACE_ONLY).mo46061a());
            this.f64960d = copyOf;
            return copyOf;
        }

        @Override // com.google.p1998c.p2005g.AbstractC27577g.C27595g
        public final Set<Class<? super T>> rawTypes() {
            return AbstractC27381ai.copyOf(AbstractC27530s.m55037a(AbstractC27586e.f64963b.mo46187a(AbstractC27577g.this.getRawTypes())).mo46060a(new AbstractC27246l<Class<?>>() {
                /* class com.google.p1998c.p2005g.AbstractC27577g.C27583c.C275841 */

                static {
                    Covode.recordClassIndex(33164);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p1999a.AbstractC27246l
                /* renamed from: a */
                public final /* synthetic */ boolean mo45331a(Class<?> cls) {
                    return cls.isInterface();
                }
            }).mo46061a());
        }

        C27583c(AbstractC27577g<T>.C27595g gVar) {
            super();
            this.f64959c = gVar;
        }
    }

    /* renamed from: com.google.c.g.g$g */
    public class C27595g extends AbstractC27534v<AbstractC27577g<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private transient AbstractC27381ai<AbstractC27577g<? super T>> f64971a;

        static {
            Covode.recordClassIndex(33175);
        }

        public AbstractC27577g<T>.C27595g interfaces() {
            return new C27583c(this);
        }

        public AbstractC27577g<T>.C27595g classes() {
            return new C27582b(AbstractC27577g.this, (byte) 0);
        }

        public Set<Class<? super T>> rawTypes() {
            return AbstractC27381ai.copyOf((Collection) AbstractC27586e.f64963b.mo46187a(AbstractC27577g.this.getRawTypes()));
        }

        @Override // com.google.p1998c.p2001c.AbstractC27534v
        /* renamed from: b */
        public Set<AbstractC27577g<? super T>> mo45371c() {
            AbstractC27381ai<AbstractC27577g<? super T>> aiVar = this.f64971a;
            if (aiVar != null) {
                return aiVar;
            }
            AbstractC27381ai<AbstractC27577g<? super T>> copyOf = AbstractC27381ai.copyOf(AbstractC27530s.m55037a(AbstractC27586e.f64962a.mo46188a(AbstractC27577g.this)).mo46060a(EnumC27592f.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo46061a());
            this.f64971a = copyOf;
            return copyOf;
        }

        C27595g() {
        }
    }

    public final AbstractC27577g<T>.C27595g getTypes() {
        return new C27595g();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public String toString() {
        return C27597i.m55196b(this.runtimeType);
    }

    public final AbstractC27577g<?> getComponentType() {
        Type c = C27597i.m55198c(this.runtimeType);
        if (c == null) {
            return null;
        }
        return m55139of(c);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final boolean isArray() {
        if (getComponentType() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return m55139of(new C27569f().mo46141a(this.runtimeType));
    }

    public AbstractC27577g() {
        Type a = mo46136a();
        this.runtimeType = a;
        C27245k.m54245b(!(a instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", a);
    }

    public AbstractC27381ai<Class<? super T>> getRawTypes() {
        final AbstractC27381ai.C27382a builder = AbstractC27381ai.builder();
        new AbstractC27596h() {
            /* class com.google.p1998c.p2005g.AbstractC27577g.C275803 */

            static {
                Covode.recordClassIndex(33160);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27596h
            /* renamed from: a */
            public final void mo46143a(Class<?> cls) {
                builder.mo45653b(cls);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27596h
            /* renamed from: a */
            public final void mo46145a(ParameterizedType parameterizedType) {
                builder.mo45653b(parameterizedType.getRawType());
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27596h
            /* renamed from: a */
            public final void mo46144a(GenericArrayType genericArrayType) {
                builder.mo45653b(C27597i.m55188a((Class<?>) AbstractC27577g.m55139of(genericArrayType.getGenericComponentType()).getRawType()));
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
        }.mo46193a(this.runtimeType);
        return builder.mo45658a();
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return false;
        }
        return true;
    }

    public final AbstractC27577g<T> wrap() {
        if (!isPrimitive()) {
            return this;
        }
        Class<?> cls = (Class) this.runtimeType;
        C27245k.m54229a(cls);
        Class<?> cls2 = C27561b.f64929a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return m55138of((Class) cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.g$f */
    public enum EnumC27592f implements AbstractC27246l<AbstractC27577g<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p1999a.AbstractC27246l
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo45331a(AbstractC27577g<?> gVar) {
                AbstractC27577g<?> gVar2 = gVar;
                if ((gVar2.runtimeType instanceof TypeVariable) || (gVar2.runtimeType instanceof WildcardType)) {
                    return false;
                }
                return true;
            }
        },
        INTERFACE_ONLY {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p1999a.AbstractC27246l
            /* renamed from: a */
            public final /* synthetic */ boolean mo45331a(AbstractC27577g<?> gVar) {
                return gVar.getRawType().isInterface();
            }
        };

        static {
            Covode.recordClassIndex(33172);
        }

        /* synthetic */ EnumC27592f(byte b) {
            this();
        }
    }

    public final AbstractC27577g<T> unwrap() {
        if (!C27561b.f64930b.keySet().contains(this.runtimeType)) {
            return this;
        }
        Class<?> cls = (Class) this.runtimeType;
        C27245k.m54229a(cls);
        Class<?> cls2 = C27561b.f64930b.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return m55138of((Class) cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.g$d */
    public static final class C27585d<T> extends AbstractC27577g<T> {
        private static final long serialVersionUID = 0;

        static {
            Covode.recordClassIndex(33165);
        }

        C27585d(Type type) {
            super(type, (byte) 0);
        }
    }

    /* renamed from: b */
    private static C27581a m55134b(Type[] typeArr) {
        return new C27581a(typeArr, false);
    }

    /* renamed from: c */
    private static C27581a m55137c(Type[] typeArr) {
        return new C27581a(typeArr, true);
    }

    /* renamed from: of */
    public static <T> AbstractC27577g<T> m55138of(Class<T> cls) {
        return new C27585d(cls);
    }

    private AbstractC27577g(Type type) {
        this.runtimeType = (Type) C27245k.m54229a(type);
    }

    /* renamed from: b */
    static AbstractC27577g<? super T> m55136b(Type type) {
        AbstractC27577g<? super T> gVar = (AbstractC27577g<? super T>) m55139of(type);
        if (gVar.getRawType().isInterface()) {
            return null;
        }
        return gVar;
    }

    /* renamed from: of */
    public static AbstractC27577g<?> m55139of(Type type) {
        return new C27585d(type);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC27577g<?> mo46156a(Type type) {
        AbstractC27577g<?> resolveType = resolveType(type);
        resolveType.f64949a = this.f64949a;
        return resolveType;
    }

    public final boolean isSubtypeOf(AbstractC27577g<?> gVar) {
        return isSubtypeOf(gVar.getType());
    }

    public final boolean isSupertypeOf(AbstractC27577g<?> gVar) {
        return gVar.isSubtypeOf(getType());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.c.g.g$a */
    public static class C27581a {

        /* renamed from: a */
        private final Type[] f64954a;

        /* renamed from: b */
        private final boolean f64955b;

        static {
            Covode.recordClassIndex(33161);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo46182a(Type type) {
            for (Type type2 : this.f64954a) {
                boolean isSubtypeOf = AbstractC27577g.m55139of(type2).isSubtypeOf(type);
                boolean z = this.f64955b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            if (!this.f64955b) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo46183b(Type type) {
            AbstractC27577g<?> of = AbstractC27577g.m55139of(type);
            for (Type type2 : this.f64954a) {
                boolean isSubtypeOf = of.isSubtypeOf(type2);
                boolean z = this.f64955b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            if (!this.f64955b) {
                return true;
            }
            return false;
        }

        C27581a(Type[] typeArr, boolean z) {
            this.f64954a = typeArr;
            this.f64955b = z;
        }
    }

    /* renamed from: a */
    private boolean m55133a(Class<?> cls) {
        AbstractC27479br<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC27563b<T, T> constructor(Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == getRawType()) {
            z = true;
        } else {
            z = false;
        }
        C27245k.m54241a(z, "%s not declared by %s", constructor, getRawType());
        return new AbstractC27563b.C27564a<T>(constructor) {
            /* class com.google.p1998c.p2005g.AbstractC27577g.C275792 */

            static {
                Covode.recordClassIndex(33159);
            }

            @Override // com.google.p1998c.p2005g.C27562a, com.google.p1998c.p2005g.AbstractC27563b
            /* renamed from: a */
            public final AbstractC27577g<T> mo46119a() {
                return AbstractC27577g.this;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27563b.C27564a, com.google.p1998c.p2005g.AbstractC27563b
            /* renamed from: b */
            public final Type[] mo46133b() {
                return AbstractC27577g.this.resolveInPlace(super.mo46133b());
            }

            @Override // com.google.p1998c.p2005g.C27562a, com.google.p1998c.p2005g.AbstractC27563b
            public final String toString() {
                return AbstractC27577g.this + "(" + C27236g.m54207a(", ").mo45323a((Object[]) mo46133b()) + ")";
            }
        };
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC27577g) {
            return this.runtimeType.equals(((AbstractC27577g) obj).runtimeType);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return m55139of(type).isSubtypeOf(getType());
    }

    public final AbstractC27563b<T, Object> method(Method method) {
        C27245k.m54241a(m55133a(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new AbstractC27563b.C27565b<T>(method) {
            /* class com.google.p1998c.p2005g.AbstractC27577g.C275781 */

            static {
                Covode.recordClassIndex(33158);
            }

            @Override // com.google.p1998c.p2005g.C27562a, com.google.p1998c.p2005g.AbstractC27563b
            /* renamed from: a */
            public final AbstractC27577g<T> mo46119a() {
                return AbstractC27577g.this;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.p1998c.p2005g.AbstractC27563b.C27565b, com.google.p1998c.p2005g.AbstractC27563b
            /* renamed from: b */
            public final Type[] mo46133b() {
                return AbstractC27577g.this.resolveInPlace(super.mo46133b());
            }

            @Override // com.google.p1998c.p2005g.C27562a, com.google.p1998c.p2005g.AbstractC27563b
            public final String toString() {
                return AbstractC27577g.this + "." + super.toString();
            }
        };
    }

    public Type[] resolveInPlace(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = resolveType(typeArr[i]).getType();
        }
        return typeArr;
    }

    /* renamed from: a */
    static AbstractC27540z<AbstractC27577g<? super T>> m55131a(Type[] typeArr) {
        AbstractC27540z.C27541a builder = AbstractC27540z.builder();
        for (Type type : typeArr) {
            AbstractC27577g<?> of = m55139of(type);
            if (of.getRawType().isInterface()) {
                builder.mo46104c(of);
            }
        }
        return builder.mo46102a();
    }

    public final AbstractC27577g<?> resolveType(Type type) {
        C27245k.m54229a(type);
        C27569f fVar = this.f64949a;
        if (fVar == null) {
            Type type2 = this.runtimeType;
            C27569f fVar2 = new C27569f();
            C27569f.C27571a aVar = new C27569f.C27571a();
            aVar.mo46193a(C27569f.C27571a.f64939a.mo46154a(type2));
            fVar = fVar2.mo46140a(AbstractC27349ab.copyOf(aVar.f64940b));
            this.f64949a = fVar;
        }
        return m55139of(fVar.mo46141a(type));
    }

    /* renamed from: b */
    private static <T> AbstractC27577g<? extends T> m55135b(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return (AbstractC27577g<? extends T>) m55139of(C27597i.m55191a(m55135b((Class) cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            type = null;
        } else {
            type = m55135b((Class) cls.getEnclosingClass()).runtimeType;
        }
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (AbstractC27577g<? extends T>) m55139of(C27597i.m55190a(type, (Class<?>) cls, (Type[]) typeParameters)) : m55138of((Class) cls);
    }

    /* JADX DEBUG: Type inference failed for r0v12. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? super ?> */
    public final AbstractC27577g<? super T> getSupertype(Class<? super T> cls) {
        C27245k.m54241a(m55133a((Class<?>) cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return m55132a(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return m55132a(cls, ((WildcardType) type).getUpperBounds());
        }
        if (!cls.isArray()) {
            return (AbstractC27577g<? super T>) mo46156a(m55135b((Class) cls).runtimeType);
        }
        AbstractC27577g<?> componentType = getComponentType();
        if (componentType != null) {
            return (AbstractC27577g<? super T>) m55139of(C27597i.EnumC27606c.JAVA7.mo46200a(componentType.getSupertype(cls.getComponentType()).runtimeType));
        }
        throw new NullPointerException(C27245k.m54233a("%s isn't a super type of %s", cls, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (r2.getRawType().getTypeParameters().length != 0) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p1998c.p2005g.AbstractC27577g<? extends T> getSubtype(java.lang.Class<?> r6) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1998c.p2005g.AbstractC27577g.getSubtype(java.lang.Class):com.google.c.g.g");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x0001 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v4. Raw type applied. Possible types: com.google.c.g.g<?>, com.google.c.g.g */
    public final boolean isSubtypeOf(Type type) {
        Type enclosingClass;
        AbstractC27577g gVar = this;
        while (true) {
            C27245k.m54229a(type);
            if (!(type instanceof WildcardType)) {
                Type type2 = gVar.runtimeType;
                if (!(type2 instanceof WildcardType)) {
                    if (!(type2 instanceof TypeVariable)) {
                        if (!(type2 instanceof GenericArrayType)) {
                            if (!(type instanceof Class)) {
                                if (!(type instanceof ParameterizedType)) {
                                    if (!(type instanceof GenericArrayType)) {
                                        break;
                                    }
                                    GenericArrayType genericArrayType = (GenericArrayType) type;
                                    if (!(type2 instanceof Class)) {
                                        if (!(type2 instanceof GenericArrayType)) {
                                            break;
                                        }
                                        gVar = m55139of(((GenericArrayType) type2).getGenericComponentType());
                                        type = genericArrayType.getGenericComponentType();
                                    } else {
                                        Class cls = (Class) type2;
                                        if (!cls.isArray()) {
                                            break;
                                        }
                                        gVar = m55138of((Class) cls.getComponentType());
                                        type = genericArrayType.getGenericComponentType();
                                    }
                                } else {
                                    ParameterizedType parameterizedType = (ParameterizedType) type;
                                    Class<?> rawType = m55139of(parameterizedType).getRawType();
                                    if (gVar.m55133a(rawType)) {
                                        TypeVariable<Class<?>>[] typeParameters = rawType.getTypeParameters();
                                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                        int i = 0;
                                        while (true) {
                                            if (i < typeParameters.length) {
                                                AbstractC27577g<?> resolveType = gVar.resolveType(typeParameters[i]);
                                                Type type3 = actualTypeArguments[i];
                                                if (!resolveType.runtimeType.equals(type3)) {
                                                    if (!(type3 instanceof WildcardType)) {
                                                        break;
                                                    }
                                                    WildcardType wildcardType = (WildcardType) type3;
                                                    if (!m55134b(wildcardType.getUpperBounds()).mo46183b(resolveType.runtimeType) || !m55134b(wildcardType.getLowerBounds()).mo46182a(resolveType.runtimeType)) {
                                                        break;
                                                    }
                                                }
                                                i++;
                                            } else {
                                                if (!Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) && parameterizedType.getOwnerType() != null) {
                                                    Type ownerType = parameterizedType.getOwnerType();
                                                    Iterator it = gVar.getTypes().iterator();
                                                    while (it.hasNext()) {
                                                        Type type4 = ((AbstractC27577g) it.next()).runtimeType;
                                                        if (type4 instanceof ParameterizedType) {
                                                            enclosingClass = ((ParameterizedType) type4).getOwnerType();
                                                        } else if (type4 instanceof Class) {
                                                            enclosingClass = ((Class) type4).getEnclosingClass();
                                                        } else {
                                                            continue;
                                                        }
                                                        if (enclosingClass != null && m55139of(enclosingClass).isSubtypeOf(ownerType)) {
                                                        }
                                                    }
                                                }
                                                return true;
                                            }
                                        }
                                    }
                                    return false;
                                }
                            } else {
                                return gVar.m55133a((Class) type);
                            }
                        } else {
                            AbstractC27577g<?> of = m55139of(type);
                            GenericArrayType genericArrayType2 = (GenericArrayType) gVar.runtimeType;
                            Type type5 = of.runtimeType;
                            if (type5 instanceof Class) {
                                Class cls2 = (Class) type5;
                                if (!cls2.isArray()) {
                                    return cls2.isAssignableFrom(Object[].class);
                                }
                                gVar = m55139of(genericArrayType2.getGenericComponentType());
                                type = cls2.getComponentType();
                            } else if (!(type5 instanceof GenericArrayType)) {
                                return false;
                            } else {
                                gVar = m55139of(genericArrayType2.getGenericComponentType());
                                type = ((GenericArrayType) of.runtimeType).getGenericComponentType();
                            }
                        }
                    } else if (type2.equals(type) || m55137c(((TypeVariable) gVar.runtimeType).getBounds()).mo46182a(type)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return m55137c(((WildcardType) type2).getUpperBounds()).mo46182a(type);
                }
            } else {
                return m55137c(((WildcardType) type).getLowerBounds()).mo46183b(gVar.runtimeType);
            }
        }
        return false;
    }

    /* synthetic */ AbstractC27577g(Type type, byte b) {
        this(type);
    }

    public final <X> AbstractC27577g<T> where(AbstractC27568e<X> eVar, Class<X> cls) {
        return where(eVar, m55138of((Class) cls));
    }

    public final <X> AbstractC27577g<T> where(AbstractC27568e<X> eVar, AbstractC27577g<X> gVar) {
        return new C27585d(new C27569f().mo46140a(AbstractC27349ab.m54639of(new C27569f.C27574c(eVar.f64935a), gVar.runtimeType)).mo46141a(this.runtimeType));
    }

    /* renamed from: a */
    private AbstractC27577g<? super T> m55132a(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            AbstractC27577g<?> of = m55139of(type);
            if (of.isSubtypeOf(cls)) {
                return (AbstractC27577g<? super T>) of.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }
}
