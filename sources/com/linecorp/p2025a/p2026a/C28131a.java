package com.linecorp.p2025a.p2026a;

import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.linecorp.a.a.a */
public final class C28131a extends SSLSocketFactory {

    /* renamed from: a */
    private static final String[] f65828a = {"RC4", "DES", "PSK", "_DHE_"};

    /* renamed from: b */
    private final SSLSocketFactory f65829b;

    /* renamed from: c */
    private boolean f65830c;

    /* renamed from: d */
    private Class<?> f65831d;

    /* renamed from: e */
    private Method f65832e;

    /* renamed from: com.linecorp.a.a.a$a */
    static class C28132a extends SSLSocket {

        /* renamed from: a */
        protected final SSLSocket f65833a;

        static {
            Covode.recordClassIndex(34069);
        }

        public SocketChannel getChannel() {
            return this.f65833a.getChannel();
        }

        public boolean getEnableSessionCreation() {
            return this.f65833a.getEnableSessionCreation();
        }

        public String[] getEnabledCipherSuites() {
            return this.f65833a.getEnabledCipherSuites();
        }

        public String[] getEnabledProtocols() {
            return this.f65833a.getEnabledProtocols();
        }

        public InetAddress getInetAddress() {
            return this.f65833a.getInetAddress();
        }

        @Override // java.net.Socket
        public InputStream getInputStream() {
            return this.f65833a.getInputStream();
        }

        @Override // java.net.Socket
        public boolean getKeepAlive() {
            return this.f65833a.getKeepAlive();
        }

        public InetAddress getLocalAddress() {
            return this.f65833a.getLocalAddress();
        }

        public int getLocalPort() {
            return this.f65833a.getLocalPort();
        }

        public SocketAddress getLocalSocketAddress() {
            return this.f65833a.getLocalSocketAddress();
        }

        public boolean getNeedClientAuth() {
            return this.f65833a.getNeedClientAuth();
        }

        @Override // java.net.Socket
        public boolean getOOBInline() {
            return this.f65833a.getOOBInline();
        }

        @Override // java.net.Socket
        public OutputStream getOutputStream() {
            return this.f65833a.getOutputStream();
        }

        public int getPort() {
            return this.f65833a.getPort();
        }

        public SocketAddress getRemoteSocketAddress() {
            return this.f65833a.getRemoteSocketAddress();
        }

        @Override // java.net.Socket
        public boolean getReuseAddress() {
            return this.f65833a.getReuseAddress();
        }

        public SSLSession getSession() {
            return this.f65833a.getSession();
        }

        @Override // java.net.Socket
        public int getSoLinger() {
            return this.f65833a.getSoLinger();
        }

        public String[] getSupportedCipherSuites() {
            return this.f65833a.getSupportedCipherSuites();
        }

        public String[] getSupportedProtocols() {
            return this.f65833a.getSupportedProtocols();
        }

        @Override // java.net.Socket
        public boolean getTcpNoDelay() {
            return this.f65833a.getTcpNoDelay();
        }

        @Override // java.net.Socket
        public int getTrafficClass() {
            return this.f65833a.getTrafficClass();
        }

        public boolean getUseClientMode() {
            return this.f65833a.getUseClientMode();
        }

        public boolean getWantClientAuth() {
            return this.f65833a.getWantClientAuth();
        }

        public boolean isBound() {
            return this.f65833a.isBound();
        }

        public boolean isClosed() {
            return this.f65833a.isClosed();
        }

        public boolean isConnected() {
            return this.f65833a.isConnected();
        }

        public boolean isInputShutdown() {
            return this.f65833a.isInputShutdown();
        }

        public boolean isOutputShutdown() {
            return this.f65833a.isOutputShutdown();
        }

        @Override // java.net.Socket
        public void shutdownInput() {
            this.f65833a.shutdownInput();
        }

        @Override // java.net.Socket
        public void shutdownOutput() {
            this.f65833a.shutdownOutput();
        }

        @Override // javax.net.ssl.SSLSocket
        public void startHandshake() {
            this.f65833a.startHandshake();
        }

        public String toString() {
            return this.f65833a.toString();
        }

        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            MethodCollector.m26663i(3564);
            this.f65833a.close();
            MethodCollector.m26664o(3564);
        }

        @Override // java.net.Socket
        public synchronized int getReceiveBufferSize() {
            int receiveBufferSize;
            MethodCollector.m26663i(3584);
            receiveBufferSize = this.f65833a.getReceiveBufferSize();
            MethodCollector.m26664o(3584);
            return receiveBufferSize;
        }

        @Override // java.net.Socket
        public synchronized int getSendBufferSize() {
            int sendBufferSize;
            MethodCollector.m26663i(3616);
            sendBufferSize = this.f65833a.getSendBufferSize();
            MethodCollector.m26664o(3616);
            return sendBufferSize;
        }

        @Override // java.net.Socket
        public synchronized int getSoTimeout() {
            int soTimeout;
            MethodCollector.m26663i(3617);
            soTimeout = this.f65833a.getSoTimeout();
            MethodCollector.m26664o(3617);
            return soTimeout;
        }

        C28132a(SSLSocket sSLSocket) {
            this.f65833a = sSLSocket;
        }

        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f65833a.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) {
            this.f65833a.bind(socketAddress);
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress) {
            this.f65833a.connect(socketAddress);
        }

        public boolean equals(Object obj) {
            return this.f65833a.equals(obj);
        }

        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f65833a.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void sendUrgentData(int i) {
            this.f65833a.sendUrgentData(i);
        }

        public void setEnableSessionCreation(boolean z) {
            this.f65833a.setEnableSessionCreation(z);
        }

        public void setEnabledCipherSuites(String[] strArr) {
            this.f65833a.setEnabledCipherSuites(strArr);
        }

        public void setEnabledProtocols(String[] strArr) {
            this.f65833a.setEnabledProtocols(strArr);
        }

        @Override // java.net.Socket
        public void setKeepAlive(boolean z) {
            this.f65833a.setKeepAlive(z);
        }

        public void setNeedClientAuth(boolean z) {
            this.f65833a.setNeedClientAuth(z);
        }

        @Override // java.net.Socket
        public void setOOBInline(boolean z) {
            this.f65833a.setOOBInline(z);
        }

        @Override // java.net.Socket
        public void setReuseAddress(boolean z) {
            this.f65833a.setReuseAddress(z);
        }

        @Override // java.net.Socket
        public void setTcpNoDelay(boolean z) {
            this.f65833a.setTcpNoDelay(z);
        }

        @Override // java.net.Socket
        public void setTrafficClass(int i) {
            this.f65833a.setTrafficClass(i);
        }

        public void setUseClientMode(boolean z) {
            this.f65833a.setUseClientMode(z);
        }

        public void setWantClientAuth(boolean z) {
            this.f65833a.setWantClientAuth(z);
        }

        @Override // java.net.Socket
        public synchronized void setReceiveBufferSize(int i) {
            MethodCollector.m26663i(3630);
            this.f65833a.setReceiveBufferSize(i);
            MethodCollector.m26664o(3630);
        }

        @Override // java.net.Socket
        public synchronized void setSendBufferSize(int i) {
            MethodCollector.m26663i(3632);
            this.f65833a.setSendBufferSize(i);
            MethodCollector.m26664o(3632);
        }

        @Override // java.net.Socket
        public synchronized void setSoTimeout(int i) {
            MethodCollector.m26663i(3639);
            this.f65833a.setSoTimeout(i);
            MethodCollector.m26664o(3639);
        }

        @Override // java.net.Socket
        public void setSoLinger(boolean z, int i) {
            this.f65833a.setSoLinger(z, i);
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i) {
            this.f65833a.connect(socketAddress, i);
        }

        public void setPerformancePreferences(int i, int i2, int i3) {
            this.f65833a.setPerformancePreferences(i, i2, i3);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return m56235a(this.f65829b.createSocket());
    }

    static {
        Covode.recordClassIndex(34068);
    }

    public final String[] getDefaultCipherSuites() {
        if (this.f65830c) {
            return m56237a(this.f65829b.getDefaultCipherSuites());
        }
        return this.f65829b.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        if (this.f65830c) {
            return m56237a(this.f65829b.getSupportedCipherSuites());
        }
        return this.f65829b.getSupportedCipherSuites();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.linecorp.a.a.a$b */
    public static class C28133b extends C28132a {
        static {
            Covode.recordClassIndex(34070);
        }

        private C28133b(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        @Override // com.linecorp.p2025a.p2026a.C28131a.C28132a
        public final void setEnabledProtocols(String[] strArr) {
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f65833a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            super.setEnabledProtocols(strArr);
        }

        /* synthetic */ C28133b(SSLSocket sSLSocket, byte b) {
            this(sSLSocket);
        }
    }

    public C28131a(SSLSocketFactory sSLSocketFactory) {
        this(sSLSocketFactory, (byte) 0);
    }

    /* renamed from: a */
    private Socket m56235a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        int i = Build.VERSION.SDK_INT;
        sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
        if (this.f65830c) {
            sSLSocket.setEnabledCipherSuites(m56237a(sSLSocket.getEnabledCipherSuites()));
        }
        return new C28133b(sSLSocket, (byte) 0);
    }

    /* renamed from: a */
    private static String[] m56237a(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        for (String str : strArr) {
            for (String str2 : f65828a) {
                if (str.contains(str2)) {
                    arrayList.remove(str);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f65829b.createSocket(str, i);
        m56236a(createSocket, str);
        return m56235a(createSocket);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:5:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C28131a(javax.net.ssl.SSLSocketFactory r6, byte r7) {
        /*
            r5 = this;
            r5.<init>()
            r1 = 1
            r5.f65830c = r1
            r5.f65829b = r6
            r5.f65830c = r1
            java.lang.String r0 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0013 }
            r5.f65831d = r0     // Catch:{ ClassNotFoundException -> 0x0013 }
            goto L_0x001b
        L_0x0013:
            java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            r5.f65831d = r0     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
        L_0x001b:
            java.lang.Class<?> r4 = r5.f65831d     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            java.lang.String r3 = "setHostname"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            r1 = 0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            java.lang.reflect.Method r0 = r4.getMethod(r3, r2)     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            r5.f65832e = r0     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.p2025a.p2026a.C28131a.<init>(javax.net.ssl.SSLSocketFactory, byte):void");
    }

    /* renamed from: a */
    private void m56236a(Socket socket, String str) {
        Method method;
        if (this.f65831d.isInstance(socket) && (method = this.f65832e) != null) {
            try {
                Object[] objArr = {str};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{socket, objArr}, 110000, "java.lang.Object", true, "com_linecorp_a_a_a_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    Object obj = a.second;
                } else {
                    C15346a.m28242a(method.invoke(socket, objArr), method, new Object[]{socket, objArr}, "com_linecorp_a_a_a_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m56235a(this.f65829b.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f65829b.createSocket(str, i, inetAddress, i2);
        m56236a(createSocket, str);
        return m56235a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m56235a(this.f65829b.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f65829b.createSocket(socket, str, i, z);
        m56236a(createSocket, str);
        return m56235a(createSocket);
    }
}
