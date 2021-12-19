package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Foreground {
    public static long CHECK_DELAY = 500;
    public static Listener listener;

    public interface Listener {
        static {
            Covode.recordClassIndex(2531);
        }

        void onBecameBackground(Context context);

        void onBecameForeground(Activity activity);
    }

    static {
        Covode.recordClassIndex(2525);
    }

    /* renamed from: com_appsflyer_Foreground_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m7032xb12db53e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: ɩ */
    static void m7033(Context context, final Listener listener2) {
        listener = listener2;
        C22884 r1 = new Application.ActivityLifecycleCallbacks() {
            /* class com.appsflyer.Foreground.C22884 */

            /* renamed from: ǃ */
            private Executor f6940 = m7034xa1a9744e();

            /* renamed from: ɩ */
            boolean f6941 = true;

            /* renamed from: Ι */
            boolean f6942;

            static {
                Covode.recordClassIndex(2526);
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            /* renamed from: com_appsflyer_Foreground$4_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
            public static ExecutorService m7034xa1a9744e() {
                C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
                a.f95505c = 1;
                return C40780g.m82242a(a.mo70028a());
            }

            public final void onActivityPaused(final Activity activity) {
                this.f6940.execute(new Runnable() {
                    /* class com.appsflyer.Foreground.C22884.RunnableC22893 */

                    static {
                        Covode.recordClassIndex(2527);
                    }

                    public final void run() {
                        C22884.this.f6941 = true;
                        final Context com_appsflyer_Foreground$4$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m7035x25ae181d(activity);
                        try {
                            new Timer().schedule(new TimerTask() {
                                /* class com.appsflyer.Foreground.C22884.RunnableC22893.C22903 */

                                static {
                                    Covode.recordClassIndex(2528);
                                }

                                public final void run() {
                                    if (C22884.this.f6942 && C22884.this.f6941) {
                                        C22884.this.f6942 = false;
                                        try {
                                            listener2.onBecameBackground(com_appsflyer_Foreground$4$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
                                        } catch (Exception e) {
                                            AFLogger.afErrorLog("Listener threw exception! ", e);
                                        }
                                    }
                                }
                            }, Foreground.CHECK_DELAY);
                        } catch (Throwable th) {
                            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
                        }
                    }

                    /* renamed from: com_appsflyer_Foreground$4$3_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
                    public static Context m7035x25ae181d(Context context) {
                        Context applicationContext = context.getApplicationContext();
                        if (C58003a.f132201c && applicationContext == null) {
                            return C58003a.f132199a;
                        }
                        return applicationContext;
                    }
                });
            }

            public final void onActivityResumed(final Activity activity) {
                this.f6940.execute(new Runnable() {
                    /* class com.appsflyer.Foreground.C22884.RunnableC22925 */

                    static {
                        Covode.recordClassIndex(2530);
                    }

                    public final void run() {
                        if (!C22884.this.f6942) {
                            try {
                                listener2.onBecameForeground(activity);
                            } catch (Exception e) {
                                AFLogger.afErrorLog("Listener thrown an exception: ", e);
                            }
                        }
                        C22884.this.f6941 = false;
                        C22884.this.f6942 = true;
                    }
                });
            }

            public final void onActivityCreated(final Activity activity, Bundle bundle) {
                this.f6940.execute(new Runnable() {
                    /* class com.appsflyer.Foreground.C22884.RunnableC22914 */

                    static {
                        Covode.recordClassIndex(2529);
                    }

                    public final void run() {
                        AFDeepLinkManager.getInstance().collectIntentsFromActivities(activity.getIntent());
                    }
                });
            }
        };
        if (context instanceof Activity) {
            r1.onActivityResumed((Activity) context);
        }
        ((Application) m7032xb12db53e(context)).registerActivityLifecycleCallbacks(r1);
    }
}
