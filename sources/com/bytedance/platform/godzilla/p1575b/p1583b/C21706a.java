package com.bytedance.platform.godzilla.p1575b.p1583b;

import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21697c;
import com.bytedance.platform.godzilla.p1586d.C21722a;
import com.bytedance.platform.godzilla.p1586d.C21725d;
import com.bytedance.platform.godzilla.p1586d.C21728g;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.bytedance.platform.godzilla.b.b.a */
public final class C21706a extends AbstractC21697c {
    /* renamed from: a */
    private static Object m40656a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_godzilla_crash_deadsystemexception_IActivityTaskManagerProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_platform_godzilla_crash_deadsystemexception_IActivityTaskManagerProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: com.bytedance.platform.godzilla.b.b.a$a */
    static class C21707a extends AbstractC21696b {
        static {
            Covode.recordClassIndex(25348);
        }

        private C21707a() {
        }

        /* synthetic */ C21707a(byte b) {
            this();
        }

        @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b
        /* renamed from: a */
        public final Object mo35352a(Object obj, Method method, Object[] objArr) {
            method.getName();
            C21689g.m40635a(C21689g.EnumC21691a.ERROR);
            return super.mo35352a(obj, method, objArr);
        }
    }

    static {
        Covode.recordClassIndex(25347);
        m40642a("activityDestroyed", new C21707a((byte) 0));
        m40642a("activitySlept", new C21707a((byte) 0));
    }

    /* renamed from: a */
    public final void mo35360a() {
        if (Build.VERSION.SDK_INT < 29) {
            C21689g.m40635a(C21689g.EnumC21691a.ERROR);
            return;
        }
        try {
            Object b = C21722a.m40684b(Class.forName("android.app.ActivityTaskManager"), "IActivityTaskManagerSingleton");
            if (Class.forName("android.util.Singleton").isInstance(b)) {
                Object a = C21722a.m40678a(b, "mInstance");
                if (!(a == null && (a = m40656a(C21725d.m40689a(b.getClass(), "get", new Class[0]), b, new Object[0])) == null) && !Proxy.isProxyClass(a.getClass())) {
                    mo35354a(a);
                    C21722a.m40682a(b, "mInstance", C21728g.m40693a(a, this));
                    C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                }
            }
        } catch (Throwable unused) {
            C21689g.m40635a(C21689g.EnumC21691a.ERROR);
        }
    }
}
