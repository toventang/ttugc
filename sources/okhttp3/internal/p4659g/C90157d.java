package okhttp3.internal.p4659g;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.EnumC90211z;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.internal.g.d */
final class C90157d extends C90160f {

    /* renamed from: a */
    private final Method f204708a;

    /* renamed from: b */
    private final Method f204709b;

    /* renamed from: d */
    private final Method f204710d;

    /* renamed from: e */
    private final Class<?> f204711e;

    /* renamed from: f */
    private final Class<?> f204712f;

    static {
        Covode.recordClassIndex(106329);
    }

    /* renamed from: a */
    private static Object m156662a(Method method, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(null, objArr);
        C15346a.m28242a(invoke, method, new Object[]{null, objArr}, "okhttp3_internal_platform_JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    public static C90160f m156663a() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            return new C90157d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: okhttp3.internal.g.d$a */
    static class C90158a implements InvocationHandler {

        /* renamed from: a */
        boolean f204713a;

        /* renamed from: b */
        String f204714b;

        /* renamed from: c */
        private final List<String> f204715c;

        static {
            Covode.recordClassIndex(106330);
        }

        C90158a(List<String> list) {
            this.f204715c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C90084c.f204447b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f204713a = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f204715c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f204715c.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f204714b = str;
                            return str;
                        }
                    }
                    String str2 = this.f204715c.get(0);
                    this.f204714b = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.f204714b = (String) objArr[0];
                    return null;
                } else {
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{this, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_JdkWithJettyBootPlatform$JettyNegoProvider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        return a.second;
                    }
                    Object invoke = method.invoke(this, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{this, objArr}, "okhttp3_internal_platform_JdkWithJettyBootPlatform$JettyNegoProvider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }
            }
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: b */
    public final void mo144962b(SSLSocket sSLSocket) {
        try {
            m156662a(this.f204710d, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C90084c.m156405a("unable to remove alpn", (Exception) e);
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final String mo144943a(SSLSocket sSLSocket) {
        try {
            C90158a aVar = (C90158a) Proxy.getInvocationHandler(m156662a(this.f204709b, new Object[]{sSLSocket}));
            if (!aVar.f204713a && aVar.f204714b == null) {
                C90160f.f204720c.mo144946a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f204713a) {
                return null;
            } else {
                return aVar.f204714b;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C90084c.m156405a("unable to get selected protocol", (Exception) e);
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final void mo144949a(SSLSocket sSLSocket, String str, List<EnumC90211z> list) {
        List<String> a = m156676a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C90160f.class.getClassLoader(), new Class[]{this.f204711e, this.f204712f}, new C90158a(a));
            m156662a(this.f204708a, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C90084c.m156405a("unable to set alpn", (Exception) e);
        }
    }

    private C90157d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f204708a = method;
        this.f204709b = method2;
        this.f204710d = method3;
        this.f204711e = cls;
        this.f204712f = cls2;
    }
}
