package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55654e;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.a */
public final class C55075a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final C55075a f126045a = new C55075a();

    /* renamed from: b */
    private static WeakReference<Activity> f126046b;

    /* renamed from: c */
    private static WeakReference<Activity> f126047c;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
    }

    public final void onActivityDestroyed(Activity activity) {
        C89219l.m154721d(activity, "");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
    }

    public final void onActivityStarted(Activity activity) {
        C89219l.m154721d(activity, "");
    }

    public final void onActivityStopped(Activity activity) {
        C89219l.m154721d(activity, "");
    }

    private C55075a() {
    }

    static {
        Covode.recordClassIndex(64803);
    }

    /* renamed from: a */
    public static Activity m100721a() {
        WeakReference<Activity> weakReference = f126046b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void onActivityPaused(Activity activity) {
        C89219l.m154721d(activity, "");
        f126047c = null;
    }

    public final void onActivityResumed(Activity activity) {
        C89219l.m154721d(activity, "");
        f126047c = new WeakReference<>(activity);
        f126046b = new WeakReference<>(activity);
        C55654e eVar = C55654e.f126932b;
        eVar.f126934a = false;
        String name = eVar.getClass().getName();
        C89219l.m154716b(name, "");
        eVar.mo92544a(name, 0, false);
    }
}
