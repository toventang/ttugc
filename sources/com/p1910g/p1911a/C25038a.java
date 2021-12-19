package com.p1910g.p1911a;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.g.a.a */
final class C25038a {

    /* renamed from: a */
    static C25038a f59392a = new C25038a();

    /* renamed from: b */
    private Class<?> f59393b;

    /* renamed from: c */
    private Object f59394c;

    /* renamed from: d */
    private Method f59395d;

    static {
        Covode.recordClassIndex(30401);
    }

    private C25038a() {
        try {
            Class<?> cls = Class.forName("com.vivo.gamewatch.common.GameWatchManager");
            this.f59393b = cls;
            this.f59394c = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object[] mo40938a(String str, Object... objArr) {
        Class<?> cls;
        if (this.f59394c == null || (cls = this.f59393b) == null) {
            return null;
        }
        try {
            if (this.f59395d == null) {
                this.f59395d = cls.getMethod("execute", String.class, Object[].class);
            }
            return (Object[]) this.f59395d.invoke(this.f59394c, str, objArr);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
