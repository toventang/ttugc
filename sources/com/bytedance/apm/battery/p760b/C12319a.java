package com.bytedance.apm.battery.p760b;

import android.os.IBinder;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.apm.battery.b.a */
public final class C12319a implements InvocationHandler {

    /* renamed from: a */
    public IBinder f29658a;

    /* renamed from: b */
    private Object f29659b;

    /* renamed from: c */
    private AbstractC12322d f29660c;

    static {
        Covode.recordClassIndex(14124);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.f29658a != null && method.getName().equals("asBinder")) {
            return this.f29658a;
        }
        this.f29660c.mo20050a(method, objArr);
        Object obj2 = this.f29659b;
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj2, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_battery_hook_BinderHookHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj2, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj2, objArr}, "com_bytedance_apm_battery_hook_BinderHookHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    C12319a(IBinder iBinder, Class<?> cls, AbstractC12322d dVar, IBinder iBinder2) {
        try {
            this.f29659b = cls.getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder);
            this.f29660c = dVar;
            this.f29658a = iBinder2;
        } catch (Exception unused) {
        }
    }
}
