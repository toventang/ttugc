package com.squareup.p2075a.p2076a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.squareup.p2075a.EnumC29245u;
import com.squareup.p2075a.p2076a.p2080d.AbstractC29196f;
import com.squareup.p2075a.p2076a.p2080d.C29191a;
import com.squareup.p2075a.p2076a.p2080d.C29195e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p4632k.C89420f;

/* renamed from: com.squareup.a.a.h */
public class C29200h {

    /* renamed from: a */
    public static final C29200h f69158a = m58410a();

    /* renamed from: a */
    public X509TrustManager mo50933a(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    /* renamed from: a */
    public void mo50935a(SSLSocket sSLSocket) {
    }

    /* renamed from: a */
    public void mo50936a(SSLSocket sSLSocket, String str, List<EnumC29245u> list) {
    }

    /* renamed from: b */
    public String mo50937b(SSLSocket sSLSocket) {
        return null;
    }

    static {
        Covode.recordClassIndex(35549);
    }

    /* renamed from: a */
    private static C29200h m58410a() {
        Class<?> cls;
        C29199g gVar;
        Method method;
        Method method2;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                try {
                    Class<?> cls2 = Class.forName("sun.security.ssl.SSLContextImpl");
                    try {
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
                        return new C29203c(cls2, cls3.getMethod("put", SSLSocket.class, cls4), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        return new C29202b(cls2);
                    }
                } catch (ClassNotFoundException unused4) {
                    return new C29200h();
                }
            }
        }
        C29199g gVar2 = null;
        C29199g gVar3 = new C29199g(null, "setUseSessionTickets", Boolean.TYPE);
        C29199g gVar4 = new C29199g(null, "setHostname", String.class);
        try {
            Class<?> cls5 = Class.forName("android.net.TrafficStats");
            method2 = cls5.getMethod("tagSocket", Socket.class);
            try {
                method = cls5.getMethod("untagSocket", Socket.class);
                try {
                    Class.forName("android.net.Network");
                    gVar = new C29199g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                    try {
                        gVar2 = new C29199g(null, "setAlpnProtocols", byte[].class);
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused6) {
                    gVar = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                method = null;
                gVar = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused8) {
            method = null;
            method2 = null;
            gVar = null;
        }
        return new C29201a(cls, gVar3, gVar4, method2, method, gVar, gVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.h$b */
    public static class C29202b extends C29200h {

        /* renamed from: b */
        private final Class<?> f69166b;

        static {
            Covode.recordClassIndex(35551);
        }

        public C29202b(Class<?> cls) {
            this.f69166b = cls;
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: a */
        public final X509TrustManager mo50933a(SSLSocketFactory sSLSocketFactory) {
            Object a = m58411a(sSLSocketFactory, this.f69166b, "context");
            if (a == null) {
                return null;
            }
            return (X509TrustManager) m58411a(a, X509TrustManager.class, "trustManager");
        }
    }

    /* renamed from: com.squareup.a.a.h$d */
    static class C29204d implements InvocationHandler {

        /* renamed from: a */
        public boolean f69172a;

        /* renamed from: b */
        public String f69173b;

        /* renamed from: c */
        private final List<String> f69174c;

        static {
            Covode.recordClassIndex(35553);
        }

        public C29204d(List<String> list) {
            this.f69174c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C29206j.f69177b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f69172a = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f69174c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f69174c.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f69173b = str;
                            return str;
                        }
                    }
                    String str2 = this.f69174c.get(0);
                    this.f69173b = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.f69173b = (String) objArr[0];
                    return null;
                } else {
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{this, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_Platform$JettyNegoProvider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        return a.second;
                    }
                    Object invoke = method.invoke(this, objArr);
                    C15346a.m28242a(invoke, method, new Object[]{this, objArr}, "com_squareup_okhttp_internal_Platform$JettyNegoProvider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.h$a */
    public static class C29201a extends C29200h {

        /* renamed from: b */
        private final Class<?> f69159b;

        /* renamed from: c */
        private final C29199g<Socket> f69160c;

        /* renamed from: d */
        private final C29199g<Socket> f69161d;

        /* renamed from: e */
        private final Method f69162e;

        /* renamed from: f */
        private final Method f69163f;

        /* renamed from: g */
        private final C29199g<Socket> f69164g;

        /* renamed from: h */
        private final C29199g<Socket> f69165h;

        static {
            Covode.recordClassIndex(35550);
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: a */
        public final AbstractC29196f mo50932a(X509TrustManager x509TrustManager) {
            AbstractC29196f a = C29191a.m58381a(x509TrustManager);
            if (a != null) {
                return a;
            }
            return C29200h.super.mo50932a(x509TrustManager);
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: a */
        public final X509TrustManager mo50933a(SSLSocketFactory sSLSocketFactory) {
            Object a = m58411a(sSLSocketFactory, this.f69159b, "sslParameters");
            if (a == null) {
                try {
                    a = m58411a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            }
            X509TrustManager x509TrustManager = (X509TrustManager) m58411a(a, X509TrustManager.class, "x509TrustManager");
            if (x509TrustManager != null) {
                return x509TrustManager;
            }
            return (X509TrustManager) m58411a(a, X509TrustManager.class, "trustManager");
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: b */
        public final String mo50937b(SSLSocket sSLSocket) {
            byte[] bArr;
            C29199g<Socket> gVar = this.f69164g;
            if (gVar == null || !gVar.mo50930a(sSLSocket) || (bArr = (byte[]) this.f69164g.mo50931b(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, C29206j.f69178c);
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: a */
        public final void mo50934a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (AssertionError e) {
                if (C29206j.m58440a(e)) {
                    throw new IOException(e);
                }
                throw e;
            } catch (SecurityException e2) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: a */
        public final void mo50936a(SSLSocket sSLSocket, String str, List<EnumC29245u> list) {
            if (str != null) {
                this.f69160c.mo50929a(sSLSocket, true);
                this.f69161d.mo50929a(sSLSocket, str);
            }
            C29199g<Socket> gVar = this.f69165h;
            if (gVar != null && gVar.mo50930a(sSLSocket)) {
                Object[] objArr = new Object[1];
                C89420f fVar = new C89420f();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    EnumC29245u uVar = list.get(i);
                    if (uVar != EnumC29245u.HTTP_1_0) {
                        fVar.mo68847a(uVar.toString().length());
                        fVar.mo68849a(uVar.toString());
                    }
                }
                objArr[0] = fVar.mo143853u();
                this.f69165h.mo50931b(sSLSocket, objArr);
            }
        }

        public C29201a(Class<?> cls, C29199g<Socket> gVar, C29199g<Socket> gVar2, Method method, Method method2, C29199g<Socket> gVar3, C29199g<Socket> gVar4) {
            this.f69159b = cls;
            this.f69160c = gVar;
            this.f69161d = gVar2;
            this.f69162e = method;
            this.f69163f = method2;
            this.f69164g = gVar3;
            this.f69165h = gVar4;
        }
    }

    /* renamed from: a */
    public AbstractC29196f mo50932a(X509TrustManager x509TrustManager) {
        return new C29195e(x509TrustManager.getAcceptedIssuers());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.h$c */
    public static class C29203c extends C29202b {

        /* renamed from: b */
        private final Method f69167b;

        /* renamed from: c */
        private final Method f69168c;

        /* renamed from: d */
        private final Method f69169d;

        /* renamed from: e */
        private final Class<?> f69170e;

        /* renamed from: f */
        private final Class<?> f69171f;

        static {
            Covode.recordClassIndex(35552);
        }

        /* renamed from: a */
        private static Object m58424a(Method method, Object[] objArr) {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_Platform$JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(null, objArr);
            C15346a.m28242a(invoke, method, new Object[]{null, objArr}, "com_squareup_okhttp_internal_Platform$JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: a */
        public final void mo50935a(SSLSocket sSLSocket) {
            try {
                m58424a(this.f69169d, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: b */
        public final String mo50937b(SSLSocket sSLSocket) {
            try {
                C29204d dVar = (C29204d) Proxy.getInvocationHandler(m58424a(this.f69168c, new Object[]{sSLSocket}));
                if (!dVar.f69172a && dVar.f69173b == null) {
                    AbstractC29190d.f69139a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (dVar.f69172a) {
                    return null;
                } else {
                    return dVar.f69173b;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // com.squareup.p2075a.p2076a.C29200h
        /* renamed from: a */
        public final void mo50936a(SSLSocket sSLSocket, String str, List<EnumC29245u> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC29245u uVar = list.get(i);
                if (uVar != EnumC29245u.HTTP_1_0) {
                    arrayList.add(uVar.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(C29200h.class.getClassLoader(), new Class[]{this.f69170e, this.f69171f}, new C29204d(arrayList));
                m58424a(this.f69167b, new Object[]{sSLSocket, newProxyInstance});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        public C29203c(Class<?> cls, Method method, Method method2, Method method3, Class<?> cls2, Class<?> cls3) {
            super(cls);
            this.f69167b = method;
            this.f69168c = method2;
            this.f69169d = method3;
            this.f69170e = cls2;
            this.f69171f = cls3;
        }
    }

    /* renamed from: a */
    public void mo50934a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    static <T> T m58411a(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        if (cls.isInstance(obj2)) {
                            return cls.cast(obj2);
                        }
                    }
                    return null;
                } catch (NoSuchFieldException unused) {
                } catch (IllegalAccessException unused2) {
                    throw new AssertionError();
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = m58411a(obj, Object.class, "delegate");
        } while (obj != null);
        return null;
    }
}
