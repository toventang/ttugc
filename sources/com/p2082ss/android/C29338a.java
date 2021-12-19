package com.p2082ss.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.a */
public final class C29338a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static int f69613a;

    static {
        Covode.recordClassIndex(35724);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        f69613a++;
    }

    public final void onActivityStopped(Activity activity) {
        f69613a--;
    }
}
