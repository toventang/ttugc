package com.bytedance.apm.battery.p760b;

import android.os.IBinder;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.apm.battery.b.c */
public final class C12321c implements InvocationHandler {

    /* renamed from: a */
    IBinder f29662a;

    /* renamed from: b */
    public IBinder f29663b;

    /* renamed from: c */
    AbstractC12322d f29664c;

    /* renamed from: d */
    Class<?> f29665d;

    /* renamed from: e */
    Class<?> f29666e;

    static {
        Covode.recordClassIndex(14126);
    }

    public C12321c(IBinder iBinder, AbstractC12322d dVar) {
        this.f29662a = iBinder;
        this.f29664c = dVar;
        try {
            String a = dVar.mo20049a();
            this.f29665d = Class.forName(a + "$Stub");
            this.f29666e = Class.forName(a);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if ("queryLocalInterface".equals(method.getName())) {
            return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{this.f29666e}, new C12319a(this.f29662a, this.f29665d, this.f29664c, this.f29663b));
        }
        IBinder iBinder = this.f29662a;
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{iBinder, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_battery_hook_BinderProxyHookHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(iBinder, objArr);
        C15346a.m28242a(invoke, method, new Object[]{iBinder, objArr}, "com_bytedance_apm_battery_hook_BinderProxyHookHandler_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }
}
