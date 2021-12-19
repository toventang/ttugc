package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.common.utility.collection.C13605d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.applog.AppLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack */
public final class ActivityStack {
    public static Application.ActivityLifecycleCallbacks lifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        /* class com.p2082ss.android.ugc.aweme.utils.ActivityStack.C801681 */

        static {
            Covode.recordClassIndex(93413);
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            MethodCollector.m26663i(13319);
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sActivityStack.remove(activity);
                } finally {
                    MethodCollector.m26664o(13319);
                }
            }
        }

        public final void onActivityStarted(Activity activity) {
            MethodCollector.m26663i(13451);
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sStartedActivities.mo21864a(activity);
                } finally {
                    MethodCollector.m26664o(13451);
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
            MethodCollector.m26663i(13376);
            synchronized (ActivityStack.class) {
                try {
                    if (ActivityStack.sAppBackGround) {
                        ActivityStack.sAppBackGround = false;
                        if (!ActivityStack.sAppBackgroundListeners.f33081a.isEmpty()) {
                            Iterator<AbstractC80170b> it = ActivityStack.sAppBackgroundListeners.iterator();
                            while (it.hasNext()) {
                                AbstractC80170b next = it.next();
                                if (next != null) {
                                    next.mo69457b();
                                }
                            }
                        }
                    }
                } finally {
                    MethodCollector.m26664o(13376);
                }
            }
        }

        public final void onActivityStopped(Activity activity) {
            MethodCollector.m26663i(13452);
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sStartedActivities.mo21865b(activity);
                    if (!ActivityStack.sAppBackGround && ActivityStack.sStartedActivities.f33081a.isEmpty()) {
                        ActivityStack.sAppBackGround = true;
                        if (!ActivityStack.sAppBackgroundListeners.f33081a.isEmpty()) {
                            Iterator<AbstractC80170b> it = ActivityStack.sAppBackgroundListeners.iterator();
                            while (it.hasNext()) {
                                AbstractC80170b next = it.next();
                                if (next != null) {
                                    next.mo69456a();
                                }
                            }
                        }
                    }
                } finally {
                    MethodCollector.m26664o(13452);
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            MethodCollector.m26663i(13318);
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sActivityStack.remove(activity);
                    ActivityStack.sActivityStack.add(activity);
                } catch (Throwable th) {
                    MethodCollector.m26664o(13318);
                    throw th;
                }
            }
            AppLog.onActivityCreate(activity);
            MethodCollector.m26664o(13318);
        }
    };
    static LinkedList<Activity> sActivityStack = new LinkedList<>();
    static boolean sAppBackGround = true;
    static C13605d<AbstractC80170b> sAppBackgroundListeners = new C13605d<>();
    static C13605d<Activity> sStartedActivities = new C13605d<>();

    /* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack$a */
    public interface AbstractC80169a {
        static {
            Covode.recordClassIndex(93414);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ActivityStack$b */
    public interface AbstractC80170b {
        static {
            Covode.recordClassIndex(93415);
        }

        /* renamed from: a */
        void mo69456a();

        /* renamed from: b */
        void mo69457b();
    }

    public static boolean isAppBackGround() {
        return sAppBackGround;
    }

    public static synchronized Activity[] getActivityStack() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            MethodCollector.m26663i(13618);
            activityArr = (Activity[]) sActivityStack.toArray(new Activity[sActivityStack.size()]);
            MethodCollector.m26664o(13618);
        }
        return activityArr;
    }

    static {
        Covode.recordClassIndex(93412);
    }

    public static synchronized Activity getPreviousActivity() {
        synchronized (ActivityStack.class) {
            MethodCollector.m26663i(13616);
            if (sActivityStack.size() >= 2) {
                LinkedList<Activity> linkedList = sActivityStack;
                Activity activity = linkedList.get(linkedList.size() - 2);
                MethodCollector.m26664o(13616);
                return activity;
            }
            MethodCollector.m26664o(13616);
            return null;
        }
    }

    public static synchronized Activity[] getStartedActivitys() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            MethodCollector.m26663i(13619);
            ArrayList arrayList = new ArrayList();
            Iterator<Activity> it = sStartedActivities.iterator();
            while (it != null && it.hasNext()) {
                Activity next = it.next();
                if (next != null) {
                    arrayList.add(next);
                }
            }
            activityArr = (Activity[]) arrayList.toArray(new Activity[arrayList.size()]);
            MethodCollector.m26664o(13619);
        }
        return activityArr;
    }

    public static synchronized Activity getTopActivity() {
        synchronized (ActivityStack.class) {
            MethodCollector.m26663i(13564);
            if (sActivityStack.isEmpty()) {
                MethodCollector.m26664o(13564);
                return null;
            }
            Activity last = sActivityStack.getLast();
            MethodCollector.m26664o(13564);
            return last;
        }
    }

    public static synchronized Activity getValidTopActivity() {
        Activity topActivity;
        synchronized (ActivityStack.class) {
            MethodCollector.m26663i(13617);
            topActivity = getTopActivity();
            if (topActivity != null && topActivity.isFinishing()) {
                sActivityStack.removeLast();
                topActivity = getValidTopActivity();
            }
            MethodCollector.m26664o(13617);
        }
        return topActivity;
    }

    public static synchronized void removeAppBackGroundListener(AbstractC80170b bVar) {
        synchronized (ActivityStack.class) {
            MethodCollector.m26663i(13621);
            if (bVar != null) {
                sAppBackgroundListeners.mo21865b(bVar);
            }
            MethodCollector.m26664o(13621);
        }
    }

    public static synchronized void addAppBackGroundListener(AbstractC80170b bVar) {
        synchronized (ActivityStack.class) {
            MethodCollector.m26663i(13620);
            if (bVar != null && !sAppBackgroundListeners.f33081a.containsKey(bVar)) {
                sAppBackgroundListeners.mo21864a(bVar);
            }
            MethodCollector.m26664o(13620);
        }
    }

    public static void finishAllFlipChatActivity(Class<?> cls) {
        Iterator<Activity> it = sActivityStack.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (cls.isInstance(next) && !(next instanceof AbstractC80169a)) {
                next.finish();
            }
        }
    }

    public static synchronized Activity getPreviousActivity(Activity activity) {
        Activity activity2;
        int i;
        synchronized (ActivityStack.class) {
            MethodCollector.m26663i(13501);
            LinkedList<Activity> linkedList = sActivityStack;
            activity2 = null;
            int size = linkedList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Activity activity3 = linkedList.get(size);
                if ((activity3 == activity || activity3.getTaskId() != activity.getTaskId()) && size - 1 >= 0) {
                    activity2 = linkedList.get(i);
                    break;
                }
                size--;
            }
            MethodCollector.m26664o(13501);
        }
        return activity2;
    }
}
