package com.google.android.play.core.p1966e;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1964c.AbstractC26969c;

/* renamed from: com.google.android.play.core.e.ap */
public final class C27010ap extends AbstractC26969c<AbstractC27034f> {

    /* renamed from: a */
    private static C27010ap f63918a;

    /* renamed from: b */
    private final Handler f63919b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final AbstractC26995aa f63920c;

    static {
        Covode.recordClassIndex(32486);
    }

    private C27010ap(Context context, AbstractC26995aa aaVar) {
        super(new C26909b("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f63920c = aaVar;
    }

    /* renamed from: a */
    public static synchronized C27010ap m53667a(Context context) {
        C27010ap apVar;
        synchronized (C27010ap.class) {
            MethodCollector.m26663i(12191);
            if (f63918a == null) {
                f63918a = new C27010ap(context, EnumC27002ah.f63903a);
            }
            apVar = f63918a;
            MethodCollector.m26664o(12191);
        }
        return apVar;
    }

    @Override // com.google.android.play.core.p1964c.AbstractC26969c
    /* renamed from: a */
    public final void mo44410a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        Context context2 = BadParcelableCrashOptimizer.getContext();
        if (bundleExtra != null) {
            if (context2 != null) {
                bundleExtra.setClassLoader(context2.getClassLoader());
            }
            AbstractC27034f a = AbstractC27034f.m53722a(bundleExtra);
            this.f63854d.mo44595a("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
            AbstractC26996ab a2 = this.f63920c.mo44700a();
            if (a.mo44735b() != 3 || a2 == null) {
                mo44661a(a);
            } else {
                a2.mo44656a(a.mo44744k(), new C27008an(this, a, intent, context));
            }
        }
    }
}
