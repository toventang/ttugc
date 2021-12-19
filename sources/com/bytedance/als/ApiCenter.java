package com.bytedance.als;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

public final class ApiCenter {

    /* renamed from: a */
    public static final C2545a f7703a = new C2545a((byte) 0);

    /* renamed from: b */
    private final Map<Class<?>, Object> f7704b;

    /* renamed from: c */
    private boolean f7705c;

    /* renamed from: d */
    private ApiCenter f7706d;

    public static final class ApiCenterCompatViewModel extends AbstractC1174ac {

        /* renamed from: a */
        public final ApiCenter f7707a = new ApiCenter((byte) 0);

        static {
            Covode.recordClassIndex(2926);
        }
    }

    static {
        Covode.recordClassIndex(2925);
    }

    /* renamed from: com.bytedance.als.ApiCenter$a */
    public static final class C2545a {
        static {
            Covode.recordClassIndex(2927);
        }

        private C2545a() {
        }

        public /* synthetic */ C2545a(byte b) {
            this();
        }

        /* renamed from: a */
        public static ApiCenter m7450a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            return ((ApiCenterCompatViewModel) C1181ae.m3880a(eVar).mo3983a(ApiCenterCompatViewModel.class)).f7707a;
        }
    }

    private ApiCenter() {
        this.f7706d = null;
        this.f7704b = new HashMap();
    }

    public /* synthetic */ ApiCenter(byte b) {
        this();
    }

    /* renamed from: b */
    public final <T extends AbstractC2547b> void mo7016b(T t) {
        C89219l.m154721d(t, "");
        if (!this.f7705c) {
            this.f7704b.remove(t.getClass());
        }
    }

    /* renamed from: b */
    public final synchronized <T extends AbstractC2547b> T mo7015b(Class<T> cls) {
        T t;
        MethodCollector.m26663i(8795);
        C89219l.m154721d(cls, "");
        Object obj = this.f7704b.get(cls);
        if (obj != null) {
            T t2 = (T) ((AbstractC2547b) obj);
            MethodCollector.m26664o(8795);
            return t2;
        }
        Iterator<T> it = this.f7704b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (m7445a(cls, t)) {
                break;
            }
        }
        T t3 = t;
        ApiCenter apiCenter = this.f7706d;
        if (t3 != null) {
            Object obj2 = this.f7704b.get(t3);
            if (obj2 != null) {
                T t4 = (T) ((AbstractC2547b) obj2);
                MethodCollector.m26664o(8795);
                return t4;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type T");
            MethodCollector.m26664o(8795);
            throw nullPointerException;
        } else if (apiCenter != null) {
            T t5 = (T) apiCenter.mo7015b(cls);
            MethodCollector.m26664o(8795);
            return t5;
        } else {
            MethodCollector.m26664o(8795);
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized <T extends AbstractC2547b> T mo7013a(Class<T> cls) {
        T t;
        MethodCollector.m26663i(8639);
        C89219l.m154721d(cls, "");
        Object obj = this.f7704b.get(cls);
        if (obj != null) {
            T t2 = (T) ((AbstractC2547b) obj);
            MethodCollector.m26664o(8639);
            return t2;
        }
        Iterator<T> it = this.f7704b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (m7445a(cls, t)) {
                break;
            }
        }
        T t3 = t;
        ApiCenter apiCenter = this.f7706d;
        if (t3 != null) {
            Object obj2 = this.f7704b.get(t3);
            if (obj2 != null) {
                T t4 = (T) ((AbstractC2547b) obj2);
                MethodCollector.m26664o(8639);
                return t4;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type T");
            MethodCollector.m26664o(8639);
            throw nullPointerException;
        } else if (apiCenter != null) {
            T t5 = (T) apiCenter.mo7013a(cls);
            MethodCollector.m26664o(8639);
            return t5;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("not found ".concat(String.valueOf(cls)));
            MethodCollector.m26664o(8639);
            throw illegalStateException;
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC2547b> void mo7014a(T t) {
        C89219l.m154721d(t, "");
        if (!this.f7705c) {
            Class<?> cls = t.getClass();
            if (!C89219l.m154714a(cls, AbstractC2547b.class)) {
                for (T t2 : this.f7704b.keySet()) {
                    if (C89219l.m154714a((Object) cls, (Object) t2)) {
                        throw new IllegalStateException(cls + " already register");
                    } else if (m7445a(cls, t2)) {
                        throw new IllegalStateException(cls + " child found " + ((Object) t2));
                    } else if (m7445a(t2, cls)) {
                        throw new IllegalStateException(cls + " parent found " + ((Object) t2));
                    }
                }
                this.f7704b.put(cls, t);
                return;
            }
            throw new IllegalArgumentException("ApiComponent can't register, use subclass instead");
        }
    }

    /* renamed from: a */
    private final boolean m7445a(Class<?> cls, Class<?> cls2) {
        if (cls.isInterface()) {
            Class<?>[] interfaces = cls2.getInterfaces();
            for (Class<?> cls3 : interfaces) {
                if (C89219l.m154714a(cls3, cls)) {
                    return true;
                }
                C89219l.m154716b(cls3, "");
                if (m7445a(cls, cls3)) {
                    return true;
                }
            }
            return false;
        }
        while (!C89219l.m154714a(cls2, Object.class)) {
            if (C89219l.m154714a(cls2, cls)) {
                return true;
            }
            cls2 = cls2.getSuperclass();
            Objects.requireNonNull(cls2, "null cannot be cast to non-null type java.lang.Class<*>");
        }
        return false;
    }
}
