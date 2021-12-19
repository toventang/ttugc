package com.p2082ss.android.ugc.playerkit.simapicommon;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.p2082ss.android.ugc.playerkit.p4322b.C84181a;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a */
public final class C84231a {

    /* renamed from: a */
    public static Application f188309a;

    /* renamed from: b */
    public static ExecutorService f188310b = Executors.newCachedThreadPool();

    /* renamed from: c */
    public static Handler f188311c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public static IAppConfig f188312d;

    /* renamed from: e */
    public static IMonitor f188313e;

    /* renamed from: f */
    public static IEvent f188314f;

    /* renamed from: g */
    public static IALog f188315g;

    /* renamed from: a */
    public static IAppConfig m144834a() {
        IAppConfig iAppConfig = f188312d;
        if (iAppConfig == null) {
            return (IAppConfig) InjectedConfigManager.getConfig(IAppConfig.class);
        }
        return iAppConfig;
    }

    /* renamed from: b */
    public static IMonitor m144836b() {
        IMonitor iMonitor = f188313e;
        if (iMonitor == null) {
            return (IMonitor) InjectedConfigManager.getConfig(IMonitor.class);
        }
        return iMonitor;
    }

    /* renamed from: c */
    public static IEvent m144837c() {
        IEvent iEvent = f188314f;
        if (iEvent == null) {
            return (IEvent) InjectedConfigManager.getConfig(IEvent.class);
        }
        return iEvent;
    }

    /* renamed from: d */
    public static IALog m144838d() {
        IALog iALog = f188315g;
        if (iALog == null) {
            return (IALog) InjectedConfigManager.getConfig(IALog.class);
        }
        return iALog;
    }

    static {
        Covode.recordClassIndex(98140);
    }

    /* renamed from: a */
    public static void m144835a(Application application) {
        if (f188309a == null) {
            C84181a.f187860a = application;
            f188309a = application;
        }
    }
}
