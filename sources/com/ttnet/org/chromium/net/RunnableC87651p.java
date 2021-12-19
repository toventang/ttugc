package com.ttnet.org.chromium.net;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.ProxyChangeListener;

/* renamed from: com.ttnet.org.chromium.net.p */
final /* synthetic */ class RunnableC87651p implements Runnable {

    /* renamed from: a */
    private final ProxyChangeListener.ProxyReceiver f199097a;

    /* renamed from: b */
    private final Intent f199098b;

    static {
        Covode.recordClassIndex(103633);
    }

    RunnableC87651p(ProxyChangeListener.ProxyReceiver proxyReceiver, Intent intent) {
        this.f199097a = proxyReceiver;
        this.f199098b = intent;
    }

    public final void run() {
        ProxyChangeListener.this.mo141641a(ProxyChangeListener.ProxyReceiver.m151926a(this.f199098b));
    }
}
