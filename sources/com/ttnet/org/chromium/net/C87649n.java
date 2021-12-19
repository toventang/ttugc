package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ttnet.org.chromium.net.n */
final class C87649n extends BroadcastReceiver {

    /* renamed from: a */
    private final ProxyChangeListener f199095a;

    static {
        Covode.recordClassIndex(103631);
    }

    C87649n(ProxyChangeListener proxyChangeListener) {
        this.f199095a = proxyChangeListener;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            ProxyChangeListener proxyChangeListener = this.f199095a;
            proxyChangeListener.mo141642a(new RunnableC87650o(proxyChangeListener));
        }
    }
}
