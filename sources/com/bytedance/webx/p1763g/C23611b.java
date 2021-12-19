package com.bytedance.webx.p1763g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.AbstractC23605f;
import com.bytedance.webx.C23609g;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1751b.p1752a.C23556a;
import com.bytedance.webx.p1756e.AbstractC23595b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.bytedance.webx.g.b */
public final class C23611b implements AbstractC23610a {

    /* renamed from: a */
    private static String f55871a = "WebXImpl";

    /* renamed from: b */
    private String f55872b;

    /* renamed from: c */
    private HashMap<Class<? extends AbstractC23605f>, AbstractC23605f> f55873c = new HashMap<>();

    static {
        Covode.recordClassIndex(27710);
    }

    public C23611b(String str) {
        this.f55872b = str;
    }

    /* renamed from: b */
    public static <T> T m44646b(Class<? extends T> cls) {
        Constructor<?> constructor;
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = declaredConstructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i++;
            }
            if (constructor != null) {
                try {
                    constructor.setAccessible(true);
                    return (T) constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (Throwable unused) {
            C23556a.m44304a(f55871a);
            return null;
        }
    }

    @Override // com.bytedance.webx.p1763g.AbstractC23610a
    /* renamed from: a */
    public final <T extends AbstractC23605f> T mo39035a(Class<T> cls) {
        MethodCollector.m26663i(4863);
        AbstractC23605f fVar = (T) this.f55873c.get(cls);
        if (fVar == null) {
            synchronized (C23609g.class) {
                try {
                    fVar = this.f55873c.get(cls);
                    if (fVar == null) {
                        C23612h a = C23612h.m44648a(this.f55872b, cls);
                        if (a != null) {
                            fVar = (AbstractC23605f) m44646b(a.f55879c);
                            if (!(fVar instanceof AbstractC23595b)) {
                                fVar = (T) null;
                            } else {
                                ((AbstractC23595b) fVar).mo38728a(a);
                                ((AbstractC23595b) fVar).getExtendableContext().mo38643a(a.f55880d);
                            }
                            HashMap<Class<? extends AbstractC23605f>, AbstractC23605f> hashMap = new HashMap<>(this.f55873c);
                            hashMap.put(cls, fVar);
                            this.f55873c = hashMap;
                        } else {
                            Error error = new Error("nameSpace " + this.f55872b + "& class " + cls.getCanonicalName() + " 's env is null");
                            MethodCollector.m26664o(4863);
                            throw error;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(4863);
                }
            }
        }
        return fVar;
    }
}
