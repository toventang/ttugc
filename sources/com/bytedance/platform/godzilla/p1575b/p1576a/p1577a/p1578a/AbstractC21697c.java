package com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.godzilla.b.a.a.a.c */
public abstract class AbstractC21697c extends AbstractC21696b implements InvocationHandler {

    /* renamed from: a */
    protected static final Map<Class<?>, Class<?>> f51469a;

    /* renamed from: e */
    private static final Map<String, AbstractC21696b> f51470e = new HashMap();

    /* renamed from: b */
    protected HashMap<String, AbstractC21696b> f51471b = new HashMap<>();

    /* renamed from: c */
    public Object f51472c;

    /* renamed from: d */
    public boolean f51473d = true;

    /* renamed from: f */
    private boolean f51474f;

    static {
        Covode.recordClassIndex(25338);
        HashMap hashMap = new HashMap();
        f51469a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(Float.class, Float.TYPE);
    }

    /* renamed from: a */
    public final void mo35354a(Object obj) {
        this.f51474f = true;
        this.f51472c = obj;
    }

    /* renamed from: a */
    private AbstractC21696b m40641a(String str) {
        AbstractC21696b bVar = f51470e.get(str);
        if (bVar == null) {
            return this.f51471b.get(str);
        }
        return bVar;
    }

    /* renamed from: a */
    public static void m40642a(String str, AbstractC21696b bVar) {
        f51470e.put(str, bVar);
    }

    @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b
    /* renamed from: a */
    public final Object mo35352a(Object obj, Method method, Object[] objArr) {
        AbstractC21696b a = m40641a(method.getName());
        if (a != null) {
            return a.mo35352a(obj, method, objArr);
        }
        return super.mo35352a(obj, method, objArr);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (this.f51474f) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            if (!this.f51473d) {
                return method.invoke(this.f51472c, objArr);
            }
            try {
                obj2 = mo35352a(this.f51472c, method, objArr);
            } catch (Throwable unused) {
                C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                obj2 = null;
            }
            if (obj2 == null) {
                try {
                    obj2 = method.invoke(this.f51472c, objArr);
                } catch (Throwable unused2) {
                    C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                }
            }
            try {
                obj2 = mo35353a(this.f51472c, method, objArr, obj2);
            } catch (Throwable unused3) {
                C21689g.m40635a(C21689g.EnumC21691a.ERROR);
            }
            if (obj2 != null) {
                return obj2;
            }
            Class<?> returnType = method.getReturnType();
            if (returnType == null) {
                return null;
            }
            if (!returnType.isPrimitive() && (returnType = f51469a.get(returnType)) == null) {
                return null;
            }
            if (returnType == Boolean.TYPE) {
                return false;
            }
            if (returnType == Void.TYPE) {
                return new Object();
            }
            return 0;
        }
        throw new IllegalStateException("setTarget must be invoked before this invoke");
    }

    @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b
    /* renamed from: a */
    public final Object mo35353a(Object obj, Method method, Object[] objArr, Object obj2) {
        AbstractC21696b a = m40641a(method.getName());
        if (a != null) {
            return a.mo35353a(obj, method, objArr, obj2);
        }
        return super.mo35353a(obj, method, objArr, obj2);
    }
}
