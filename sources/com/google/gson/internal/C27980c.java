package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC27918h;
import com.google.gson.C28020m;
import com.google.gson.internal.p2021a.AbstractC27923b;
import com.google.gson.p2019b.C27895a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.internal.c */
public final class C27980c {

    /* renamed from: a */
    private final Map<Type, AbstractC27918h<?>> f65740a;

    /* renamed from: b */
    private final AbstractC27923b f65741b = AbstractC27923b.f65591a;

    static {
        Covode.recordClassIndex(33593);
    }

    public final String toString() {
        return this.f65740a.toString();
    }

    public C27980c(Map<Type, AbstractC27918h<?>> map) {
        this.f65740a = map;
    }

    /* renamed from: a */
    private <T> AbstractC28006h<T> m56063a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f65741b.mo46705a(declaredConstructor);
            }
            return new AbstractC28006h<T>() {
                /* class com.google.gson.internal.C27980c.C279938 */

                static {
                    Covode.recordClassIndex(33606);
                }

                @Override // com.google.gson.internal.AbstractC28006h
                /* renamed from: a */
                public final T mo46740a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (InstantiationException e) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <T> AbstractC28006h<T> mo46738a(C27895a<T> aVar) {
        final Type type = aVar.type;
        final Class<? super T> cls = aVar.rawType;
        final AbstractC27918h<?> hVar = this.f65740a.get(type);
        if (hVar != null) {
            return new AbstractC28006h<T>() {
                /* class com.google.gson.internal.C27980c.C279811 */

                static {
                    Covode.recordClassIndex(33594);
                }

                @Override // com.google.gson.internal.AbstractC28006h
                /* renamed from: a */
                public final T mo46740a() {
                    return (T) hVar.mo46683a();
                }
            };
        }
        final AbstractC27918h<?> hVar2 = this.f65740a.get(cls);
        if (hVar2 != null) {
            return new AbstractC28006h<T>() {
                /* class com.google.gson.internal.C27980c.C279927 */

                static {
                    Covode.recordClassIndex(33605);
                }

                @Override // com.google.gson.internal.AbstractC28006h
                /* renamed from: a */
                public final T mo46740a() {
                    return (T) hVar2.mo46683a();
                }
            };
        }
        AbstractC28006h<T> a = m56063a(cls);
        if (a != null) {
            return a;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new AbstractC28006h<T>() {
                    /* class com.google.gson.internal.C27980c.C279949 */

                    static {
                        Covode.recordClassIndex(33607);
                    }

                    @Override // com.google.gson.internal.AbstractC28006h
                    /* renamed from: a */
                    public final T mo46740a() {
                        return (T) new TreeSet();
                    }
                };
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new AbstractC28006h<T>() {
                    /* class com.google.gson.internal.C27980c.C2798210 */

                    static {
                        Covode.recordClassIndex(33595);
                    }

                    @Override // com.google.gson.internal.AbstractC28006h
                    /* renamed from: a */
                    public final T mo46740a() {
                        Type type = type;
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2 instanceof Class) {
                                return (T) EnumSet.noneOf((Class) type2);
                            }
                            throw new C28020m("Invalid EnumSet type: " + type.toString());
                        }
                        throw new C28020m("Invalid EnumSet type: " + type.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new AbstractC28006h<T>() {
                    /* class com.google.gson.internal.C27980c.C2798311 */

                    static {
                        Covode.recordClassIndex(33596);
                    }

                    @Override // com.google.gson.internal.AbstractC28006h
                    /* renamed from: a */
                    public final T mo46740a() {
                        return (T) new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new AbstractC28006h<T>() {
                    /* class com.google.gson.internal.C27980c.C2798412 */

                    static {
                        Covode.recordClassIndex(33597);
                    }

                    @Override // com.google.gson.internal.AbstractC28006h
                    /* renamed from: a */
                    public final T mo46740a() {
                        return (T) new ArrayDeque();
                    }
                };
            }
            return new AbstractC28006h<T>() {
                /* class com.google.gson.internal.C27980c.C2798513 */

                static {
                    Covode.recordClassIndex(33598);
                }

                @Override // com.google.gson.internal.AbstractC28006h
                /* renamed from: a */
                public final T mo46740a() {
                    return (T) new ArrayList();
                }
            };
        } else if (!Map.class.isAssignableFrom(cls)) {
            return new AbstractC28006h<T>() {
                /* class com.google.gson.internal.C27980c.C279916 */

                /* renamed from: d */
                private final AbstractC28012l f65758d = AbstractC28012l.m56102a();

                static {
                    Covode.recordClassIndex(33604);
                }

                @Override // com.google.gson.internal.AbstractC28006h
                /* renamed from: a */
                public final T mo46740a() {
                    try {
                        return (T) this.f65758d.mo46788a(cls);
                    } catch (Exception e) {
                        throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                    }
                }
            };
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new AbstractC28006h<T>() {
                    /* class com.google.gson.internal.C27980c.C2798614 */

                    static {
                        Covode.recordClassIndex(33599);
                    }

                    @Override // com.google.gson.internal.AbstractC28006h
                    /* renamed from: a */
                    public final T mo46740a() {
                        return (T) new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new AbstractC28006h<T>() {
                    /* class com.google.gson.internal.C27980c.C279872 */

                    static {
                        Covode.recordClassIndex(33600);
                    }

                    @Override // com.google.gson.internal.AbstractC28006h
                    /* renamed from: a */
                    public final T mo46740a() {
                        return (T) new ConcurrentHashMap();
                    }
                };
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new AbstractC28006h<T>() {
                    /* class com.google.gson.internal.C27980c.C279883 */

                    static {
                        Covode.recordClassIndex(33601);
                    }

                    @Override // com.google.gson.internal.AbstractC28006h
                    /* renamed from: a */
                    public final T mo46740a() {
                        return (T) new TreeMap();
                    }
                };
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C27895a.get(((ParameterizedType) type).getActualTypeArguments()[0]).rawType)) {
                return new AbstractC28006h<T>() {
                    /* class com.google.gson.internal.C27980c.C279905 */

                    static {
                        Covode.recordClassIndex(33603);
                    }

                    @Override // com.google.gson.internal.AbstractC28006h
                    /* renamed from: a */
                    public final T mo46740a() {
                        return (T) new C27998g();
                    }
                };
            }
            return new AbstractC28006h<T>() {
                /* class com.google.gson.internal.C27980c.C279894 */

                static {
                    Covode.recordClassIndex(33602);
                }

                @Override // com.google.gson.internal.AbstractC28006h
                /* renamed from: a */
                public final T mo46740a() {
                    return (T) new LinkedHashMap();
                }
            };
        }
    }
}
