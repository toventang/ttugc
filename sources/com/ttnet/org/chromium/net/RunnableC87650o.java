package com.ttnet.org.chromium.net;

import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.C87445c;
import com.ttnet.org.chromium.net.ProxyChangeListener;

/* renamed from: com.ttnet.org.chromium.net.o */
final /* synthetic */ class RunnableC87650o implements Runnable {

    /* renamed from: a */
    private final ProxyChangeListener f199096a;

    static {
        Covode.recordClassIndex(103632);
    }

    RunnableC87650o(ProxyChangeListener proxyChangeListener) {
        this.f199096a = proxyChangeListener;
    }

    public final void run() {
        ProxyChangeListener proxyChangeListener = this.f199096a;
        ProxyInfo defaultProxy = ((ConnectivityManager) ProxyChangeListener.m151920a(C87445c.f198342a, "connectivity")).getDefaultProxy();
        proxyChangeListener.mo141641a(defaultProxy == null ? ProxyChangeListener.C87522a.f198564e : ProxyChangeListener.C87522a.m151929a(defaultProxy));
    }
}
