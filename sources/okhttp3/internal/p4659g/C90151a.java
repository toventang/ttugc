package okhttp3.internal.p4659g;

import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC90211z;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4661i.AbstractC90164c;
import okhttp3.internal.p4661i.AbstractC90166e;
import p4632k.C89420f;

/* renamed from: okhttp3.internal.g.a */
final class C90151a extends C90160f {

    /* renamed from: a */
    private final Class<?> f204693a;

    /* renamed from: b */
    private final C90159e<Socket> f204694b;

    /* renamed from: d */
    private final C90159e<Socket> f204695d;

    /* renamed from: e */
    private final C90159e<Socket> f204696e;

    /* renamed from: f */
    private final C90159e<Socket> f204697f;

    /* renamed from: g */
    private final C90154c f204698g = C90154c.m156647a();

    static {
        Covode.recordClassIndex(106323);
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final void mo144948a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C90084c.m156417a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final void mo144949a(SSLSocket sSLSocket, String str, List<EnumC90211z> list) {
        if (str != null) {
            this.f204694b.mo144964a(sSLSocket, true);
            this.f204695d.mo144964a(sSLSocket, str);
        }
        C90159e<Socket> eVar = this.f204697f;
        if (eVar != null && eVar.mo144965a(sSLSocket)) {
            Object[] objArr = new Object[1];
            C89420f fVar = new C89420f();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC90211z zVar = list.get(i);
                if (zVar != EnumC90211z.HTTP_1_0) {
                    fVar.mo68847a(zVar.toString().length());
                    fVar.mo68849a(zVar.toString());
                }
            }
            objArr[0] = fVar.mo143853u();
            this.f204697f.mo144966b(sSLSocket, objArr);
        }
    }

    /* renamed from: okhttp3.internal.g.a$b */
    static final class C90153b implements AbstractC90166e {

        /* renamed from: a */
        private final X509TrustManager f204701a;

        /* renamed from: b */
        private final Method f204702b;

        static {
            Covode.recordClassIndex(106325);
        }

        public final int hashCode() {
            return this.f204701a.hashCode() + (this.f204702b.hashCode() * 31);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C90153b)) {
                return false;
            }
            C90153b bVar = (C90153b) obj;
            if (!this.f204701a.equals(bVar.f204701a) || !this.f204702b.equals(bVar.f204702b)) {
                return false;
            }
            return true;
        }

        @Override // okhttp3.internal.p4661i.AbstractC90166e
        /* renamed from: a */
        public final X509Certificate mo144956a(X509Certificate x509Certificate) {
            Object invoke;
            try {
                Method method = this.f204702b;
                X509TrustManager x509TrustManager = this.f204701a;
                Object[] objArr = {x509Certificate};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{x509TrustManager, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_AndroidPlatform$AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    invoke = a.second;
                } else {
                    invoke = method.invoke(x509TrustManager, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{x509TrustManager, objArr}, "okhttp3_internal_platform_AndroidPlatform$AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                TrustAnchor trustAnchor = (TrustAnchor) invoke;
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw C90084c.m156405a("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        C90153b(X509TrustManager x509TrustManager, Method method) {
            this.f204702b = method;
            this.f204701a = x509TrustManager;
        }
    }

    /* renamed from: d */
    private static boolean m156632d() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: b */
    public final SSLContext mo144950b() {
        boolean z = true;
        try {
            int i = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: okhttp3.internal.g.a$c */
    static final class C90154c {

        /* renamed from: a */
        private final Method f204703a;

        /* renamed from: b */
        private final Method f204704b;

        /* renamed from: c */
        private final Method f204705c;

        static {
            Covode.recordClassIndex(106326);
        }

        /* renamed from: a */
        private static Object m156646a(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        /* renamed from: a */
        static C90154c m156647a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = method3;
                method = method2;
            }
            return new C90154c(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo144960a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                m156646a(this.f204705c, obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Object mo144959a(String str) {
            Method method = this.f204703a;
            if (method != null) {
                try {
                    Object a = m156646a(method, null, new Object[0]);
                    m156646a(this.f204704b, a, new Object[]{str});
                    return a;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        private C90154c(Method method, Method method2, Method method3) {
            this.f204703a = method;
            this.f204704b = method2;
            this.f204705c = method3;
        }
    }

    /* renamed from: a */
    public static C90160f m156629a() {
        Class<?> cls;
        C90159e eVar;
        C90159e eVar2;
        if (!C90160f.m156677c()) {
            return null;
        }
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        C90159e eVar3 = new C90159e(null, "setUseSessionTickets", Boolean.TYPE);
        C90159e eVar4 = new C90159e(null, "setHostname", String.class);
        if (m156632d()) {
            eVar = new C90159e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            eVar2 = new C90159e(null, "setAlpnProtocols", byte[].class);
        } else {
            eVar = null;
            eVar2 = null;
        }
        return new C90151a(cls, eVar3, eVar4, eVar, eVar2);
    }

    /* renamed from: okhttp3.internal.g.a$a */
    static final class C90152a extends AbstractC90164c {

        /* renamed from: a */
        private final Object f204699a;

        /* renamed from: b */
        private final Method f204700b;

        static {
            Covode.recordClassIndex(106324);
        }

        public final int hashCode() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return obj instanceof C90152a;
        }

        C90152a(Object obj, Method method) {
            this.f204699a = obj;
            this.f204700b = method;
        }

        @Override // okhttp3.internal.p4661i.AbstractC90164c
        /* renamed from: a */
        public final List<Certificate> mo144953a(List<Certificate> list, String str) {
            Object invoke;
            try {
                Object[] array = list.toArray(new X509Certificate[list.size()]);
                Method method = this.f204700b;
                Object obj = this.f204699a;
                Object[] objArr = {array, "RSA", str};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_AndroidPlatform$AndroidCertificateChainCleaner_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    invoke = a.second;
                } else {
                    invoke = method.invoke(obj, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_AndroidPlatform$AndroidCertificateChainCleaner_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                return (List) invoke;
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final Object mo144942a(String str) {
        return this.f204698g.mo144959a(str);
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: b */
    public final AbstractC90166e mo144951b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C90153b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo144951b(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final String mo144943a(SSLSocket sSLSocket) {
        byte[] bArr;
        C90159e<Socket> eVar = this.f204696e;
        if (eVar == null || !eVar.mo144965a(sSLSocket) || (bArr = (byte[]) this.f204696e.mo144966b(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, C90084c.f204450e);
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: b */
    public final boolean mo144952b(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return super.mo144952b(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m156630a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo144952b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw C90084c.m156405a("unable to determine cleartext support", e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final X509TrustManager mo144944a(SSLSocketFactory sSLSocketFactory) {
        Object a = m156675a(sSLSocketFactory, this.f204693a, "sslParameters");
        if (a == null) {
            try {
                a = m156675a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.mo144944a(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) m156675a(a, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) m156675a(a, X509TrustManager.class, "trustManager");
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final AbstractC90164c mo144945a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C90152a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo144945a(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final void mo144947a(String str, Object obj) {
        if (!this.f204698g.mo144960a(obj)) {
            mo144946a(5, str, (Throwable) null);
        }
    }

    /* renamed from: b */
    private boolean m156631b(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo144952b(str);
        }
    }

    /* renamed from: a */
    private boolean m156630a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m156631b(str, cls, obj);
        }
    }

    @Override // okhttp3.internal.p4659g.C90160f
    /* renamed from: a */
    public final void mo144946a(int i, String str, Throwable th) {
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i2 = 0;
        int length = str.length();
        while (i2 < length) {
            int indexOf = str.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            do {
                i2 = Math.min(indexOf, i2 + 4000);
            } while (i2 < indexOf);
            i2++;
        }
    }

    private C90151a(Class<?> cls, C90159e<Socket> eVar, C90159e<Socket> eVar2, C90159e<Socket> eVar3, C90159e<Socket> eVar4) {
        this.f204693a = cls;
        this.f204694b = eVar;
        this.f204695d = eVar2;
        this.f204696e = eVar3;
        this.f204697f = eVar4;
    }
}
