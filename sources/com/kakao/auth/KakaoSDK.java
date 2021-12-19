package com.kakao.auth;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.common.KakaoContextService;
import com.kakao.common.PhaseInfo;
import com.kakao.util.exception.KakaoException;

public class KakaoSDK {
    private static volatile KakaoAdapter adapter;
    public static volatile Activity currentActivity;

    public static class AlreadyInitializedException extends RuntimeException {
        private static final long serialVersionUID = 1;

        static {
            Covode.recordClassIndex(33823);
        }
    }

    static {
        Covode.recordClassIndex(33821);
    }

    public static KakaoAdapter getAdapter() {
        return adapter;
    }

    public static Activity getCurrentActivity() {
        return currentActivity;
    }

    public static synchronized void init(KakaoAdapter kakaoAdapter) {
        synchronized (KakaoSDK.class) {
            MethodCollector.m26663i(9030);
            if (adapter != null) {
                AlreadyInitializedException alreadyInitializedException = new AlreadyInitializedException();
                MethodCollector.m26664o(9030);
                throw alreadyInitializedException;
            } else if (kakaoAdapter != null) {
                adapter = kakaoAdapter;
                Context applicationContext = kakaoAdapter.getApplicationConfig().getApplicationContext();
                Application application = (Application) applicationContext;
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.kakao.auth.KakaoSDK.C280681 */
                    private int numActivities;

                    static {
                        Covode.recordClassIndex(33822);
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
                        this.numActivities--;
                    }

                    public final void onActivityPaused(Activity activity) {
                        if (activity != null && activity.equals(KakaoSDK.currentActivity)) {
                            KakaoSDK.currentActivity = null;
                        }
                    }

                    public final void onActivityResumed(Activity activity) {
                        KakaoSDK.currentActivity = activity;
                        if (this.numActivities == 0 && KakaoSDK.needsToResetSession(activity, Session.getCurrentSession())) {
                            Session.getCurrentSession().internalClose(new KakaoException(KakaoException.ErrorType.CANCELED_OPERATION, "App restarted during Kakao login procedure. Restarting from the start."));
                        }
                        this.numActivities++;
                    }
                });
                ApprovalType approvalType = kakaoAdapter.getSessionConfig().getApprovalType();
                if (approvalType == null) {
                    approvalType = ApprovalType.INDIVIDUAL;
                }
                KakaoContextService.getInstance().initialize(applicationContext);
                Session.initialize(application, approvalType);
                MethodCollector.m26664o(9030);
            } else {
                KakaoException kakaoException = new KakaoException(KakaoException.ErrorType.MISS_CONFIGURATION, "adapter is null");
                MethodCollector.m26664o(9030);
                throw kakaoException;
            }
        }
    }

    public static synchronized void init(KakaoAdapter kakaoAdapter, PhaseInfo phaseInfo) {
        synchronized (KakaoSDK.class) {
            MethodCollector.m26663i(9184);
            KakaoContextService.getInstance().setPhaseInfo(phaseInfo);
            init(kakaoAdapter);
            MethodCollector.m26664o(9184);
        }
    }

    public static boolean needsToResetSession(Activity activity, Session session) {
        if ((activity.getIntent() == null || "android.intent.action.MAIN".equals(activity.getIntent().getAction())) && session.isClosed() && session.getRequestType() != null) {
            return true;
        }
        return false;
    }
}
