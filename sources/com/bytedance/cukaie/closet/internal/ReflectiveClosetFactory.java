package com.bytedance.cukaie.closet.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.C14406b;
import com.bytedance.cukaie.closet.p950a.AbstractC14403a;
import com.bytedance.cukaie.closet.p950a.AbstractC14404b;
import com.bytedance.cukaie.closet.p950a.AbstractC14405c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;
import p4600h.C89388w;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

public final class ReflectiveClosetFactory implements AbstractC14413b {
    private final Class<?> clazz;
    private final AbstractC14403a closetAnnotation;

    static {
        Covode.recordClassIndex(16488);
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final String closetName() {
        return this.closetAnnotation.mo23216a();
    }

    @Override // com.bytedance.cukaie.closet.internal.AbstractC14413b
    public final Object createCloset(AbstractC14409e eVar) {
        C89219l.m154719c(eVar, "");
        Object newProxyInstance = Proxy.newProxyInstance(this.clazz.getClassLoader(), new Class[]{this.clazz}, new C14411a(eVar));
        C89219l.m154709a(newProxyInstance, "");
        return newProxyInstance;
    }

    public ReflectiveClosetFactory(Class<?> cls) {
        C89219l.m154719c(cls, "");
        this.clazz = cls;
        AbstractC14403a aVar = (AbstractC14403a) cls.getAnnotation(AbstractC14403a.class);
        if (aVar != null) {
            this.closetAnnotation = aVar;
            return;
        }
        throw new C14406b("Couldn't find @Closet annotation on class " + cls.getCanonicalName());
    }

    /* renamed from: com.bytedance.cukaie.closet.internal.ReflectiveClosetFactory$a */
    static final class C14411a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ AbstractC14409e f34872a;

        static {
            Covode.recordClassIndex(16489);
        }

        C14411a(AbstractC14409e eVar) {
            this.f34872a = eVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            Object obj3;
            AbstractC14404b bVar = (AbstractC14404b) method.getAnnotation(AbstractC14404b.class);
            AbstractC14405c cVar = (AbstractC14405c) method.getAnnotation(AbstractC14405c.class);
            if (bVar != null) {
                AbstractC14409e eVar = this.f34872a;
                C89219l.m154709a((Object) method, "");
                if (objArr == null || objArr.length != 1) {
                    throw new C14406b("Method " + method.getName() + " with @In annotation should have at least and only One parameter.");
                }
                Class<?> cls = method.getParameterTypes()[0];
                String a = bVar.mo23217a();
                Object obj4 = objArr[0];
                C89219l.m154709a((Object) cls, "");
                if (obj4 == null && (cls.isAssignableFrom(Integer.TYPE) || cls.isAssignableFrom(Float.TYPE) || cls.isAssignableFrom(Boolean.TYPE) || cls.isAssignableFrom(Long.TYPE) || cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Integer.class) || cls.isAssignableFrom(Float.class) || cls.isAssignableFrom(Boolean.class) || cls.isAssignableFrom(Long.class))) {
                    eVar.mo23226a(a);
                } else if (cls.isAssignableFrom(Integer.TYPE) || cls.isAssignableFrom(Integer.class)) {
                    if (obj4 != null) {
                        eVar.mo23228b(a, ((Integer) obj4).intValue());
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (cls.isAssignableFrom(Float.TYPE) || cls.isAssignableFrom(Float.class)) {
                    if (obj4 != null) {
                        eVar.mo23227b(a, ((Float) obj4).floatValue());
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (cls.isAssignableFrom(Boolean.TYPE) || cls.isAssignableFrom(Boolean.class)) {
                    if (obj4 != null) {
                        eVar.mo23232b(a, ((Boolean) obj4).booleanValue());
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (cls.isAssignableFrom(Long.TYPE) || cls.isAssignableFrom(Long.class)) {
                    if (obj4 != null) {
                        eVar.mo23229b(a, ((Long) obj4).longValue());
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (cls.isAssignableFrom(String.class)) {
                    if (!(obj4 instanceof String)) {
                        obj4 = null;
                    }
                    eVar.mo23230b(a, (String) obj4);
                } else if (cls.isAssignableFrom(byte[].class)) {
                    if (!(obj4 instanceof byte[])) {
                        obj4 = null;
                    }
                    eVar.mo23233b(a, (byte[]) obj4);
                } else if (cls.isAssignableFrom(Set.class)) {
                    if (!(obj4 instanceof Set)) {
                        obj4 = null;
                    }
                    eVar.mo23231b(a, (Set) obj4);
                } else {
                    throw new C14406b("Method " + method.getName() + " with @In annotation has incompatible parameter type " + cls.getCanonicalName() + '.');
                }
                return null;
            } else if (cVar == null) {
                return null;
            } else {
                AbstractC14409e eVar2 = this.f34872a;
                C89219l.m154709a((Object) method, "");
                if (objArr == null) {
                    obj2 = null;
                } else if (objArr.length == 0 || objArr.length == 1) {
                    obj2 = C89064i.m154495b(objArr, 0);
                } else {
                    throw new C14406b("Method " + method.getName() + " with @Out annotation should have One or Zero parameter.");
                }
                Class<?> returnType = method.getReturnType();
                if (returnType.isAssignableFrom(Integer.TYPE) || returnType.isAssignableFrom(Integer.class)) {
                    if (obj2 != null) {
                        return Integer.valueOf(eVar2.mo23220a(cVar.mo23218a(), ((Integer) obj2).intValue()));
                    }
                    return Integer.valueOf(eVar2.mo23220a(cVar.mo23218a(), 0));
                } else if (returnType.isAssignableFrom(Float.TYPE) || returnType.isAssignableFrom(Float.class)) {
                    if (obj2 != null) {
                        return Float.valueOf(eVar2.mo23219a(cVar.mo23218a(), ((Float) obj2).floatValue()));
                    }
                    return Float.valueOf(eVar2.mo23219a(cVar.mo23218a(), 0.0f));
                } else if (returnType.isAssignableFrom(Boolean.TYPE) || returnType.isAssignableFrom(Boolean.class)) {
                    if (obj2 != null) {
                        return Boolean.valueOf(eVar2.mo23224a(cVar.mo23218a(), ((Boolean) obj2).booleanValue()));
                    }
                    return Boolean.valueOf(eVar2.mo23224a(cVar.mo23218a(), false));
                } else if (!returnType.isAssignableFrom(Long.TYPE) && !returnType.isAssignableFrom(Long.class)) {
                    if (returnType.isAssignableFrom(String.class)) {
                        if (obj2 == null || (obj3 = eVar2.mo23222a(cVar.mo23218a(), (String) obj2)) == null) {
                            return eVar2.mo23222a(cVar.mo23218a(), (String) null);
                        }
                    } else if (returnType.isAssignableFrom(byte[].class)) {
                        if (obj2 == null || (obj3 = eVar2.mo23225a(cVar.mo23218a(), (byte[]) obj2)) == null) {
                            return eVar2.mo23225a(cVar.mo23218a(), (byte[]) null);
                        }
                    } else if (!returnType.isAssignableFrom(Set.class)) {
                        StringBuilder append = new StringBuilder("Method ").append(method.getName()).append(" with @Out annotation has incompatible return type ");
                        C89219l.m154709a((Object) returnType, "");
                        throw new C14406b(append.append(returnType.getCanonicalName()).append('.').toString());
                    } else if (obj2 == null || (obj3 = eVar2.mo23223a(cVar.mo23218a(), (Set) obj2)) == null) {
                        return eVar2.mo23223a(cVar.mo23218a(), (Set<String>) null);
                    }
                    return obj3;
                } else if (obj2 != null) {
                    return Long.valueOf(eVar2.mo23221a(cVar.mo23218a(), ((Long) obj2).longValue()));
                } else {
                    return Long.valueOf(eVar2.mo23221a(cVar.mo23218a(), 0L));
                }
            }
        }
    }
}
