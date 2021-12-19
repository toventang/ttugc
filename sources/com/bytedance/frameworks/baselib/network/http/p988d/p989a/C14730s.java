package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.s */
public final class C14730s extends SSLSocketFactory {

    /* renamed from: b */
    private static final String[] f35910b = {"TLSv1.2"};

    /* renamed from: a */
    final SSLSocketFactory f35911a;

    public final String[] getDefaultCipherSuites() {
        return this.f35911a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f35911a.getSupportedCipherSuites();
    }

    static {
        Covode.recordClassIndex(16827);
    }

    public C14730s(SSLSocketFactory sSLSocketFactory) {
        this.f35911a = sSLSocketFactory;
    }

    /* renamed from: a */
    private static Socket m26981a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f35910b);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return m26981a(this.f35911a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m26981a(this.f35911a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m26981a(this.f35911a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m26981a(this.f35911a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m26981a(this.f35911a.createSocket(socket, str, i, z));
    }
}
