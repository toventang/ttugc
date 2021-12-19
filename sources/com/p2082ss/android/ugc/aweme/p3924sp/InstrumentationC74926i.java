package com.p2082ss.android.ugc.aweme.p3924sp;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.sp.i */
public final class InstrumentationC74926i extends Instrumentation {

    /* renamed from: a */
    private Instrumentation f168447a;

    static {
        Covode.recordClassIndex(87791);
    }

    public InstrumentationC74926i(Instrumentation instrumentation) {
        this.f168447a = instrumentation;
    }

    public final void callActivityOnDestroy(Activity activity) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnDestroy(activity);
        } else {
            super.callActivityOnDestroy(activity);
        }
    }

    public final void callActivityOnPause(Activity activity) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnPause(activity);
        } else {
            super.callActivityOnPause(activity);
        }
    }

    public final void callActivityOnRestart(Activity activity) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestart(activity);
        } else {
            super.callActivityOnRestart(activity);
        }
    }

    public final void callActivityOnResume(Activity activity) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnResume(activity);
        } else {
            super.callActivityOnResume(activity);
        }
    }

    public final void callActivityOnStart(Activity activity) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnStart(activity);
        } else {
            super.callActivityOnStart(activity);
        }
    }

    public final void callActivityOnStop(Activity activity) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnStop(activity);
        } else {
            super.callActivityOnStop(activity);
        }
    }

    public final void callActivityOnUserLeaving(Activity activity) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnUserLeaving(activity);
        } else {
            super.callActivityOnUserLeaving(activity);
        }
    }

    public final void callApplicationOnCreate(Application application) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callApplicationOnCreate(application);
        } else {
            super.callApplicationOnCreate(application);
        }
    }

    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnNewIntent(activity, intent);
        } else {
            super.callActivityOnNewIntent(activity, intent);
        }
    }

    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestoreInstanceState(activity, bundle);
        } else {
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnSaveInstanceState(activity, bundle);
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    public final boolean onException(Object obj, Throwable th) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            return instrumentation.onException(obj, th);
        }
        return super.onException(obj, th);
    }

    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        try {
            if (C74915e.f168405a != null) {
                if (!(((Context) C74915e.f168405a.get(activity)) instanceof C74925h)) {
                    C74915e.f168405a.set(activity, new C74925h(activity.getBaseContext()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            instrumentation.callActivityOnCreate(activity, bundle);
        } else {
            super.callActivityOnCreate(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation == null) {
            return super.newActivity(classLoader, str, intent);
        }
        return instrumentation.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public final Application newApplication(ClassLoader classLoader, String str, Context context) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            return instrumentation.newApplication(classLoader, str, context);
        }
        return super.newApplication(classLoader, str, context);
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        Instrumentation instrumentation = this.f168447a;
        if (instrumentation != null) {
            return instrumentation.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }
}
