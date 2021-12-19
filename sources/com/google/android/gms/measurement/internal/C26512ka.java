package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.ka */
final class C26512ka extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f62405a;

    static {
        Covode.recordClassIndex(31934);
    }

    public final SocketChannel getChannel() {
        return this.f62405a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f62405a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f62405a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f62405a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f62405a.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return this.f62405a.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.f62405a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f62405a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f62405a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f62405a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f62405a.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.f62405a.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return this.f62405a.getOutputStream();
    }

    public final int getPort() {
        return this.f62405a.getPort();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f62405a.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.f62405a.getReuseAddress();
    }

    public final SSLSession getSession() {
        return this.f62405a.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.f62405a.getSoLinger();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f62405a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f62405a.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.f62405a.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.f62405a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f62405a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f62405a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f62405a.isBound();
    }

    public final boolean isClosed() {
        return this.f62405a.isClosed();
    }

    public final boolean isConnected() {
        return this.f62405a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f62405a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f62405a.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.f62405a.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.f62405a.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        this.f62405a.startHandshake();
    }

    public final String toString() {
        return this.f62405a.toString();
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.m26663i(5603);
        this.f62405a.close();
        MethodCollector.m26664o(5603);
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        int receiveBufferSize;
        MethodCollector.m26663i(5748);
        receiveBufferSize = this.f62405a.getReceiveBufferSize();
        MethodCollector.m26664o(5748);
        return receiveBufferSize;
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        int sendBufferSize;
        MethodCollector.m26663i(5943);
        sendBufferSize = this.f62405a.getSendBufferSize();
        MethodCollector.m26664o(5943);
        return sendBufferSize;
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        int soTimeout;
        MethodCollector.m26663i(5944);
        soTimeout = this.f62405a.getSoTimeout();
        MethodCollector.m26664o(5944);
        return soTimeout;
    }

    C26512ka(SSLSocket sSLSocket) {
        this.f62405a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f62405a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) {
        this.f62405a.bind(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) {
        this.f62405a.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.f62405a.equals(obj);
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f62405a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) {
        this.f62405a.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f62405a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f62405a.setEnabledCipherSuites(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        this.f62405a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f62405a.setNeedClientAuth(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) {
        this.f62405a.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) {
        this.f62405a.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) {
        this.f62405a.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) {
        this.f62405a.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f62405a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f62405a.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i) {
        MethodCollector.m26663i(5949);
        this.f62405a.setReceiveBufferSize(i);
        MethodCollector.m26664o(5949);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i) {
        MethodCollector.m26663i(6103);
        this.f62405a.setSendBufferSize(i);
        MethodCollector.m26664o(6103);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i) {
        MethodCollector.m26663i(6259);
        this.f62405a.setSoTimeout(i);
        MethodCollector.m26664o(6259);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f62405a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f62405a.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) {
        this.f62405a.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i) {
        this.f62405a.connect(socketAddress, i);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f62405a.setPerformancePreferences(i, i2, i3);
    }
}
