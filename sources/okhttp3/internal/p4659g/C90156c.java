package okhttp3.internal.p4659g;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC90211z;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.internal.g.c */
final class C90156c extends C90160f {

    /* renamed from: a */
    final Method f204706a;

    /* renamed from: b */
    final Method f204707b;

    static {
        Covode.recordClassIndex(106328);
    }

    /* renamed from: a */
    private static Object m156657a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_Jdk9Platform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_Jdk9Platform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    public static C90156c m156658a() {
        try {
            return new C90156c(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final X509TrustManager mo144944a(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final String mo144943a(SSLSocket sSLSocket) {
        try {
            String str = (String) m156657a(this.f204707b, sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw C90084c.m156405a("failed to get ALPN selected protocol", (Exception) e);
        } catch (IllegalAccessException e2) {
            throw C90084c.m156405a("failed to get ALPN selected protocol", (Exception) e2);
        }
    }

    private C90156c(Method method, Method method2) {
        this.f204706a = method;
        this.f204707b = method2;
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final void mo144949a(SSLSocket sSLSocket, String str, List<EnumC90211z> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> a = m156676a(list);
            m156657a(this.f204706a, sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C90084c.m156405a("unable to set ssl parameters", (Exception) e);
        }
    }
}
