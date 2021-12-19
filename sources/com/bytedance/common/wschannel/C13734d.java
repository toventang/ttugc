package com.bytedance.common.wschannel;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.d */
final class C13734d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static boolean f33374a;

    /* renamed from: c */
    private static WeakHandler f33375c = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        /* class com.bytedance.common.wschannel.C13734d.C137351 */

        static {
            Covode.recordClassIndex(15770);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: b */
    public AbstractC13737a f33376b;

    /* renamed from: d */
    private Runnable f33377d = new Runnable() {
        /* class com.bytedance.common.wschannel.C13734d.RunnableC137362 */

        static {
            Covode.recordClassIndex(15771);
        }

        public final void run() {
            Logger.debug();
            if (C13734d.f33374a) {
                C13734d.f33374a = false;
                if (C13734d.this.f33376b != null) {
                    C13734d.this.f33376b.mo22102b();
                }
            }
        }
    };

    /* renamed from: com.bytedance.common.wschannel.d$a */
    public interface AbstractC13737a {
        static {
            Covode.recordClassIndex(15772);
        }

        /* renamed from: a */
        void mo22101a();

        /* renamed from: b */
        void mo22102b();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    C13734d() {
    }

    static {
        Covode.recordClassIndex(15769);
    }

    public final void onActivityPaused(Activity activity) {
        if (f33374a) {
            f33375c.postDelayed(this.f33377d, 3000);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!f33374a) {
            f33374a = true;
            AbstractC13737a aVar = this.f33376b;
            if (aVar != null) {
                aVar.mo22101a();
            }
        }
        Logger.debug();
        f33375c.removeCallbacks(this.f33377d);
    }
}
