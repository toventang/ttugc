package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38686bl;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.h */
public final class C52928h {

    /* renamed from: i */
    public static WeakReference<Activity> f121703i = new WeakReference<>(null);

    /* renamed from: a */
    public int f121704a;

    /* renamed from: b */
    public volatile boolean f121705b = true;

    /* renamed from: c */
    public long f121706c;

    /* renamed from: d */
    public AbstractC33485al f121707d;

    /* renamed from: e */
    public AbstractC52930a f121708e;

    /* renamed from: f */
    public volatile boolean f121709f = true;

    /* renamed from: g */
    public long f121710g;

    /* renamed from: h */
    public int f121711h;

    /* renamed from: com.ss.android.ugc.aweme.h$a */
    public interface AbstractC52930a {
        static {
            Covode.recordClassIndex(62450);
        }

        /* renamed from: a */
        void mo89319a(Activity activity);

        /* renamed from: b */
        void mo89320b(Activity activity);
    }

    /* renamed from: a */
    public final boolean mo89311a() {
        if (this.f121711h > 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(62448);
    }

    public C52928h(Application application) {
        if (application == null) {
            this.f121705b = false;
            return;
        }
        application.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.p2082ss.android.ugc.aweme.C52928h.C529291 */

            static {
                Covode.recordClassIndex(62449);
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
                if (activity instanceof MainActivity) {
                    C52928h hVar = C52928h.this;
                    hVar.f121711h--;
                }
            }

            public final void onActivityPaused(Activity activity) {
                if (activity != null) {
                    C34789bd.m71024a(activity);
                }
                C52928h.this.f121709f = true;
                C52928h.this.f121710g = System.currentTimeMillis();
                C38686bl.m78501a(activity, new C38686bl.C38688b(C38686bl.ActivityC38687a.f91402a));
            }

            public final void onActivityResumed(Activity activity) {
                if (activity != null) {
                    C34789bd.m71024a(activity);
                    C34789bd.f82119a.addFirst(new WeakReference<>(activity));
                }
                C52928h.this.f121709f = false;
                C52928h.f121703i = new WeakReference<>(activity);
                C38686bl.m78501a(activity, new C38686bl.C38689c(C38686bl.ActivityC38687a.f91402a));
            }

            public final void onActivityStarted(Activity activity) {
                C38686bl.m78501a(activity, new C38686bl.C38690d(C38686bl.ActivityC38687a.f91402a));
                C52928h.this.f121704a++;
                if (C52928h.this.f121704a == 1) {
                    C52928h.this.f121705b = false;
                    if (C52928h.this.f121707d != null) {
                        C52928h.this.f121707d.mo59568a();
                    }
                    if (C52928h.this.f121708e != null) {
                        C52928h.this.f121708e.mo89319a(activity);
                    }
                }
            }

            public final void onActivityStopped(Activity activity) {
                C38686bl.m78501a(activity, new C38686bl.C38691e(C38686bl.ActivityC38687a.f91402a));
                C52928h.this.f121704a--;
                if (C52928h.this.f121704a == 0) {
                    C52928h.this.f121705b = true;
                    C52928h.this.f121706c = System.currentTimeMillis();
                    if (C52928h.this.f121707d != null) {
                        C52928h.this.f121707d.mo59569b();
                    }
                    if (C52928h.this.f121708e != null) {
                        C52928h.this.f121708e.mo89320b(activity);
                    }
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MainActivity) {
                    C52928h.this.f121711h++;
                }
            }
        });
    }
}
