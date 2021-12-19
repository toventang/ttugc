package com.bytedance.cukaie.closet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.internal.AbstractC14413b;
import com.bytedance.cukaie.closet.internal.C14419f;
import com.bytedance.cukaie.closet.internal.ReflectiveClosetFactory;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.cukaie.closet.a */
public final class C14401a {

    /* renamed from: a */
    public static final C14402a f34869a = new C14402a((byte) 0);

    /* renamed from: c */
    private static final Map<Class<?>, AbstractC14413b> f34870c = new LinkedHashMap();

    /* renamed from: b */
    private final AbstractC14410f f34871b;

    public C14401a(byte b) {
        this();
    }

    /* renamed from: com.bytedance.cukaie.closet.a$a */
    public static final class C14402a {
        static {
            Covode.recordClassIndex(16479);
        }

        private C14402a() {
        }

        public /* synthetic */ C14402a(byte b) {
            this();
        }
    }

    public /* synthetic */ C14401a() {
        this(new C14419f());
    }

    static {
        Covode.recordClassIndex(16478);
    }

    public C14401a(AbstractC14410f fVar) {
        C89219l.m154719c(fVar, "");
        this.f34871b = fVar;
    }

    /* renamed from: a */
    private static AbstractC14413b m26274a(Class<?> cls) {
        T t;
        AbstractC14413b bVar;
        MethodCollector.m26663i(8995);
        Map<Class<?>, AbstractC14413b> map = f34870c;
        synchronized (map) {
            try {
                t = map.get(cls);
            } finally {
                MethodCollector.m26664o(8995);
            }
        }
        if (t == null) {
            Constructor<? extends AbstractC14413b> b = m26275b(cls);
            if (b != null) {
                try {
                    bVar = (AbstractC14413b) b.newInstance(new Object[0]);
                    C89219l.m154709a((Object) bVar, "");
                } catch (NoSuchMethodException e) {
                    C14407c cVar = new C14407c(e);
                    MethodCollector.m26664o(8995);
                    throw cVar;
                } catch (InstantiationException e2) {
                    C14407c cVar2 = new C14407c(e2);
                    MethodCollector.m26664o(8995);
                    throw cVar2;
                } catch (IllegalAccessException e3) {
                    C14407c cVar3 = new C14407c(e3);
                    MethodCollector.m26664o(8995);
                    throw cVar3;
                } catch (InvocationTargetException e4) {
                    C14407c cVar4 = new C14407c(e4);
                    MethodCollector.m26664o(8995);
                    throw cVar4;
                }
            } else {
                bVar = new ReflectiveClosetFactory(cls);
            }
            C89233z.C89238e eVar = new C89233z.C89238e();
            synchronized (map) {
                try {
                    AbstractC14413b bVar2 = map.get(cls);
                    if (bVar2 == null) {
                        map.put(cls, bVar);
                    } else {
                        bVar = bVar2;
                    }
                    eVar.element = (T) bVar;
                } finally {
                    MethodCollector.m26664o(8995);
                }
            }
            t = eVar.element;
        }
        return t;
    }

    /* renamed from: b */
    private static Constructor<? extends AbstractC14413b> m26275b(Class<?> cls) {
        String str;
        boolean z;
        boolean z2;
        try {
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null) {
                return null;
            }
            Package r0 = cls.getPackage();
            if (r0 == null || (str = r0.getName()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                canonicalName = canonicalName.substring(str.length() + 1);
                C89219l.m154709a((Object) canonicalName, "");
            }
            C89219l.m154719c(canonicalName, "");
            String str2 = C89361p.m154868a(canonicalName, ".", "_") + "_CukaieClosetFactory";
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str2 = str + '.' + str2;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            if (cls2 != null) {
                Constructor declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                C89219l.m154709a((Object) declaredConstructor, "");
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final <T> T mo23215a(Context context, Class<T> cls) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cls, "");
        AbstractC14413b a = m26274a(cls);
        return (T) a.createCloset(this.f34871b.mo23234a(context, a.closetName()));
    }
}
