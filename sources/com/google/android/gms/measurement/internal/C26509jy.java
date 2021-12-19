package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.jy */
final class C26509jy extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f62396a;

    static {
        Covode.recordClassIndex(31931);
    }

    C26509jy() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    public final String[] getDefaultCipherSuites() {
        return this.f62396a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f62396a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return m52379a((SSLSocket) this.f62396a.createSocket());
    }

    /* renamed from: a */
    private static SSLSocket m52379a(SSLSocket sSLSocket) {
        return new C26512ka(sSLSocket);
    }

    private C26509jy(SSLSocketFactory sSLSocketFactory) {
        this.f62396a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return m52379a((SSLSocket) this.f62396a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m52379a((SSLSocket) this.f62396a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m52379a((SSLSocket) this.f62396a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m52379a((SSLSocket) this.f62396a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m52379a((SSLSocket) this.f62396a.createSocket(socket, str, i, z));
    }
}
