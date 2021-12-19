package com.google.android.play.core.p1963b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.b.k */
final class ServiceConnectionC26951k implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C26952l f63825a;

    static {
        Covode.recordClassIndex(32426);
    }

    /* synthetic */ ServiceConnectionC26951k(C26952l lVar) {
        this.f63825a = lVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f63825a.f63828b.mo44598d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f63825a.mo44653b(new C26949i(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f63825a.f63828b.mo44598d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f63825a.mo44653b(new C26950j(this));
    }
}
