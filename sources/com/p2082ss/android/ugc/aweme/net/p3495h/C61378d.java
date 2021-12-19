package com.p2082ss.android.ugc.aweme.net.p3495h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.api.C48331e;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
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

/* renamed from: com.ss.android.ugc.aweme.net.h.d */
public final class C61378d extends AbstractC90191p {
    static {
        Covode.recordClassIndex(72011);
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
    public final void secureConnectStart(AbstractC90049e eVar) {
        super.secureConnectStart(eVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void callEnd(AbstractC90049e eVar) {
        super.callEnd(eVar);
        if (m111112a(eVar)) {
            C58945a.C58947b.f134185a.mo96429b("feed_ok_connection_to_end", false);
        }
        System.currentTimeMillis();
    }

    /* renamed from: a */
    private static boolean m111112a(AbstractC90049e eVar) {
        if (eVar == null || eVar.mo144707a() == null || eVar.mo144707a().url() == null || !C48331e.m91791a(eVar.mo144707a().url().toString())) {
            return false;
        }
        return true;
    }

    @Override // okhttp3.AbstractC90191p
    public final void callStart(AbstractC90049e eVar) {
        super.callStart(eVar);
        if (m111112a(eVar)) {
            C58945a.C58947b.f134185a.mo96423a("feed_boot_to_ok_start", System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h);
            C58945a.C58947b.f134185a.mo96425a("feed_ok_start_to_security_interceptor", false);
            C58945a.C58947b.f134185a.mo96425a("feed_ok_start_to_connection", false);
        }
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void callFailed(AbstractC90049e eVar, IOException iOException) {
        super.callFailed(eVar, iOException);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectionReleased(AbstractC90049e eVar, AbstractC90057i iVar) {
        super.connectionReleased(eVar, iVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void dnsStart(AbstractC90049e eVar, String str) {
        super.dnsStart(eVar, str);
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
    public final void secureConnectEnd(AbstractC90049e eVar, C90197r rVar) {
        super.secureConnectEnd(eVar, rVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectionAcquired(AbstractC90049e eVar, AbstractC90057i iVar) {
        super.connectionAcquired(eVar, iVar);
        if (m111112a(eVar)) {
            C58945a.C58947b.f134185a.mo96429b("feed_ok_start_to_connection", false);
            C58945a.C58947b.f134185a.mo96425a("feed_ok_connection_to_end", false);
            C58945a.C58947b.f134185a.mo96429b("feed_ok_security_interceptor_to_connection", false);
        }
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectStart(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(eVar, inetSocketAddress, proxy);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void dnsEnd(AbstractC90049e eVar, String str, List<InetAddress> list) {
        super.dnsEnd(eVar, str, list);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectEnd(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar) {
        super.connectEnd(eVar, inetSocketAddress, proxy, zVar);
        System.currentTimeMillis();
    }

    @Override // okhttp3.AbstractC90191p
    public final void connectFailed(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar, IOException iOException) {
        super.connectFailed(eVar, inetSocketAddress, proxy, zVar, iOException);
        System.currentTimeMillis();
    }
}
