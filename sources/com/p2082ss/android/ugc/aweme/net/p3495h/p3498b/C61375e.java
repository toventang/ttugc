package com.p2082ss.android.ugc.aweme.net.p3495h.p3498b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46803ct;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.p3495h.C61363a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90057i;
import okhttp3.AbstractC90191p;
import okhttp3.C90029ac;
import okhttp3.C90197r;
import okhttp3.EnumC90211z;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.h.b.e */
public final class C61375e extends AbstractC90191p {
    static {
        Covode.recordClassIndex(72008);
    }

    @Override // okhttp3.AbstractC90191p
    public final void callEnd(AbstractC90049e eVar) {
        super.callEnd(eVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void requestBodyStart(AbstractC90049e eVar) {
        super.requestBodyStart(eVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void requestHeadersStart(AbstractC90049e eVar) {
        super.requestHeadersStart(eVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void responseBodyStart(AbstractC90049e eVar) {
        super.responseBodyStart(eVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void responseHeadersStart(AbstractC90049e eVar) {
        super.responseHeadersStart(eVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void callStart(AbstractC90049e eVar) {
        super.callStart(eVar);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96425a("feed_ok_precon_to_dns", false);
    }

    @Override // okhttp3.AbstractC90191p
    public final void secureConnectStart(AbstractC90049e eVar) {
        super.secureConnectStart(eVar);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("feed_ok_precon_connect_to_ssl", false);
        C58945a.C58947b.f134185a.mo96425a("feed_ok_precon_ssl_duration", false);
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectionReleased(AbstractC90049e eVar, AbstractC90057i iVar) {
        super.connectionReleased(eVar, iVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void requestBodyEnd(AbstractC90049e eVar, long j) {
        super.requestBodyEnd(eVar, j);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void requestHeadersEnd(AbstractC90049e eVar, Request request) {
        super.requestHeadersEnd(eVar, request);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void responseBodyEnd(AbstractC90049e eVar, long j) {
        super.responseBodyEnd(eVar, j);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void responseHeadersEnd(AbstractC90049e eVar, C90029ac acVar) {
        super.responseHeadersEnd(eVar, acVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectionAcquired(AbstractC90049e eVar, AbstractC90057i iVar) {
        super.connectionAcquired(eVar, iVar);
        System.currentTimeMillis();
        C61363a.f139359b = true;
    }

    @Override // okhttp3.AbstractC90191p
    public final void callFailed(AbstractC90049e eVar, IOException iOException) {
        super.callFailed(eVar, iOException);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96423a("feed_ok_pre_connection_result", -2);
        C46803ct.f109040a = true;
    }

    @Override // okhttp3.AbstractC90191p
    public final void dnsStart(AbstractC90049e eVar, String str) {
        super.dnsStart(eVar, str);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("feed_ok_precon_to_dns", false);
        C58945a.C58947b.f134185a.mo96425a("feed_ok_precon_dns_duration", false);
    }

    @Override // okhttp3.AbstractC90191p
    public final void secureConnectEnd(AbstractC90049e eVar, C90197r rVar) {
        super.secureConnectEnd(eVar, rVar);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("feed_ok_precon_ssl_duration", false);
        C58945a.C58947b.f134185a.mo96425a("feed_ok_precon_ssl_to_connect_end", false);
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectStart(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(eVar, inetSocketAddress, proxy);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("feed_ok_precon_dns_to_connect", false);
        C58945a.C58947b.f134185a.mo96425a("feed_ok_precon_connect_to_ssl", false);
    }

    @Override // okhttp3.AbstractC90191p
    public final void dnsEnd(AbstractC90049e eVar, String str, List<InetAddress> list) {
        super.dnsEnd(eVar, str, list);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("feed_ok_precon_dns_duration", false);
        C58945a.C58947b.f134185a.mo96425a("feed_ok_precon_dns_to_connect", false);
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectEnd(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar) {
        super.connectEnd(eVar, inetSocketAddress, proxy, zVar);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("feed_ok_precon_ssl_to_connect_end", false);
        C58945a.C58947b.f134185a.mo96423a("feed_ok_pre_connection_result", 1);
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectFailed(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar, IOException iOException) {
        super.connectFailed(eVar, inetSocketAddress, proxy, zVar, iOException);
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96423a("feed_ok_pre_connection_result", -1);
    }
}
