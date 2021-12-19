package com.bytedance.platform.godzilla.p1575b.p1583b;

import android.os.IBinder;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21697c;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1580b.p1581a.C21700a;
import com.bytedance.platform.godzilla.p1586d.C21725d;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.godzilla.b.b.b */
public final class C21708b extends AbstractC21697c {
    /* renamed from: a */
    private static Object m40659a(Method method, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_godzilla_crash_deadsystemexception_IConnectivityManagerProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(null, objArr);
        C15346a.m28242a(invoke, method, new Object[]{null, objArr}, "com_bytedance_platform_godzilla_crash_deadsystemexception_IConnectivityManagerProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: com.bytedance.platform.godzilla.b.b.b$a */
    static class C21709a extends AbstractC21696b {
        static {
            Covode.recordClassIndex(25350);
        }

        private C21709a() {
        }

        /* synthetic */ C21709a(byte b) {
            this();
        }

        @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b
        /* renamed from: a */
        public final Object mo35352a(Object obj, Method method, Object[] objArr) {
            return super.mo35352a(obj, method, objArr);
        }
    }

    static {
        Covode.recordClassIndex(25349);
        m40642a("getNetworkCapabilities", new C21709a((byte) 0));
        m40642a("getAllNetworks", new C21709a((byte) 0));
        m40642a("getLinkProperties", new C21709a((byte) 0));
        m40642a("getActiveNetworkInfo", new C21709a((byte) 0));
    }

    /* renamed from: a */
    public final void mo35361a() {
        try {
            C21700a aVar = new C21700a("connectivity", this);
            aVar.mo35358a();
            mo35354a(m40659a(C21725d.m40689a(Class.forName("android.net.IConnectivityManager$Stub"), "asInterface", IBinder.class), new Object[]{aVar.f51472c}));
            C21689g.m40635a(C21689g.EnumC21691a.ERROR);
        } catch (Exception e) {
            C21689g.m40635a(C21689g.EnumC21691a.ERROR);
            e.printStackTrace();
        }
    }
}
