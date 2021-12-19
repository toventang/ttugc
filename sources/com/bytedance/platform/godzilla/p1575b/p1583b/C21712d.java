package com.bytedance.platform.godzilla.p1575b.p1583b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21685c;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1586d.C21722a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.platform.godzilla.b.b.d */
public final class C21712d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Field f51482a;

    /* renamed from: b */
    public Field f51483b;

    static {
        Covode.recordClassIndex(25353);
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

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: com.bytedance.platform.godzilla.b.b.d$a */
    static class C21714a implements Handler.Callback {

        /* renamed from: a */
        private Handler f51486a;

        static {
            Covode.recordClassIndex(25355);
        }

        C21714a(Handler handler) {
            this.f51486a = handler;
        }

        public boolean handleMessage(Message message) {
            try {
                "Handle message ".concat(String.valueOf(message));
                C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                this.f51486a.handleMessage(message);
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public final void mo35362a(Application application) {
        try {
            Field a = C21685c.m40631a(View.class, "mAttachInfo");
            this.f51482a = a;
            if (a != null) {
                a.setAccessible(true);
                application.registerActivityLifecycleCallbacks(this);
                C21689g.m40635a(C21689g.EnumC21691a.ERROR);
            }
        } catch (Throwable unused) {
        }
    }

    public final void onActivityStarted(Activity activity) {
        C21689g.m40635a(C21689g.EnumC21691a.ERROR);
        if (this.f51482a != null) {
            try {
                final View decorView = activity.getWindow().getDecorView();
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    /* class com.bytedance.platform.godzilla.p1575b.p1583b.C21712d.View$OnAttachStateChangeListenerC217131 */

                    static {
                        Covode.recordClassIndex(25354);
                    }

                    public final void onViewDetachedFromWindow(View view) {
                    }

                    public final void onViewAttachedToWindow(View view) {
                        try {
                            Object obj = C21712d.this.f51482a.get(decorView);
                            if (C21712d.this.f51483b == null) {
                                C21712d.this.f51483b = C21722a.m40681a(obj.getClass(), "mHandler");
                            }
                            Handler handler = (Handler) C21712d.this.f51483b.get(obj);
                            Field a = C21722a.m40681a((Class<?>) Handler.class, "mCallback");
                            Handler.Callback callback = (Handler.Callback) a.get(handler);
                            if (callback == null || !callback.getClass().getName().equals(C21714a.class.getName())) {
                                a.set(handler, new C21714a(handler));
                                C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                                return;
                            }
                            C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
