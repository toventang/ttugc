package com.bytedance.ugc.glue.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.UGCViewUtils;
import com.bytedance.ugc.ugcwidget.UGCSafeList;
import com.bytedance.ugc.ugcwidget.UGCServiceManager;
import java.util.HashMap;
import java.util.Iterator;

public class UGCLifecycleManager {
    public final HashMap<Activity, UGCSafeList<UGCLifecycle>> map;

    /* renamed from: com.bytedance.ugc.glue.app.UGCLifecycleManager$1 */
    static /* synthetic */ class C235101 {
        static {
            Covode.recordClassIndex(27518);
        }
    }

    public static abstract class CallbacksStub implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(27519);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static abstract class UGCForegroundListener {
        static {
            Covode.recordClassIndex(27520);
        }

        public abstract void onChanged(boolean z);
    }

    /* renamed from: com.bytedance.ugc.glue.app.UGCLifecycleManager$b */
    public static class C23512b {
        static {
            Covode.recordClassIndex(27524);
        }
    }

    static {
        Covode.recordClassIndex(27517);
    }

    public static boolean isBackground() {
        UGCServiceManager.getService(C23512b.class);
        return false;
    }

    public static abstract class UGCLifecycle extends CallbacksStub {
        public static final UGCLifecycleManager singleton = new UGCLifecycleManager(null);

        static {
            Covode.recordClassIndex(27521);
        }

        @Override // com.bytedance.ugc.glue.app.UGCLifecycleManager.CallbacksStub
        public void onActivityDestroyed(Activity activity) {
            UGCLifecycleManager.removeLifecycle(activity, this);
        }
    }

    public static abstract class UGCLifecycle4ViewHolder extends UGCLifecycle implements View.OnAttachStateChangeListener {
        private Activity activity;
        private boolean hasRegister;
        private View view;

        static {
            Covode.recordClassIndex(27522);
        }

        /* access modifiers changed from: protected */
        public Activity getActivity() {
            if (this.activity == null) {
                this.activity = UGCViewUtils.getActivity(this.view);
            }
            return this.activity;
        }

        public void register() {
            if (!this.hasRegister) {
                this.hasRegister = true;
                UGCLifecycleManager.addLifecycle(getActivity(), this);
            }
        }

        public void onViewAttachedToWindow(View view2) {
            register();
        }

        public UGCLifecycle4ViewHolder(View view2) {
            this.view = view2;
            view2.addOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view2) {
            UGCLifecycleManager.removeLifecycle(this.activity, this);
            this.hasRegister = false;
        }
    }

    private UGCLifecycleManager() {
        this.map = new HashMap<>();
        new C23511a(this, (byte) 0);
        throw new NullPointerException("registerActivityLifecycleCallbacks");
    }

    /* synthetic */ UGCLifecycleManager(C235101 r1) {
        this();
    }

    /* renamed from: com.bytedance.ugc.glue.app.UGCLifecycleManager$a */
    class C23511a implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(27523);
        }

        private C23511a() {
        }

        public final void onActivityDestroyed(Activity activity) {
            UGCSafeList<UGCLifecycle> uGCSafeList = UGCLifecycleManager.this.map.get(activity);
            if (uGCSafeList != null) {
                Iterator<UGCLifecycle> it = uGCSafeList.iterator();
                while (it.hasNext()) {
                    it.next().onActivityDestroyed(activity);
                }
            }
        }

        public final void onActivityPaused(Activity activity) {
            UGCSafeList<UGCLifecycle> uGCSafeList = UGCLifecycleManager.this.map.get(activity);
            if (uGCSafeList != null) {
                Iterator<UGCLifecycle> it = uGCSafeList.iterator();
                while (it.hasNext()) {
                    it.next().onActivityPaused(activity);
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
            UGCSafeList<UGCLifecycle> uGCSafeList = UGCLifecycleManager.this.map.get(activity);
            if (uGCSafeList != null) {
                Iterator<UGCLifecycle> it = uGCSafeList.iterator();
                while (it.hasNext()) {
                    it.next().onActivityResumed(activity);
                }
            }
        }

        public final void onActivityStarted(Activity activity) {
            UGCSafeList<UGCLifecycle> uGCSafeList = UGCLifecycleManager.this.map.get(activity);
            if (uGCSafeList != null) {
                Iterator<UGCLifecycle> it = uGCSafeList.iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
            }
        }

        public final void onActivityStopped(Activity activity) {
            UGCSafeList<UGCLifecycle> uGCSafeList = UGCLifecycleManager.this.map.get(activity);
            if (uGCSafeList != null) {
                Iterator<UGCLifecycle> it = uGCSafeList.iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
            }
        }

        /* synthetic */ C23511a(UGCLifecycleManager uGCLifecycleManager, byte b) {
            this();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            UGCSafeList<UGCLifecycle> uGCSafeList = UGCLifecycleManager.this.map.get(activity);
            if (uGCSafeList != null) {
                Iterator<UGCLifecycle> it = uGCSafeList.iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            }
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            UGCSafeList<UGCLifecycle> uGCSafeList = UGCLifecycleManager.this.map.get(activity);
            if (uGCSafeList != null) {
                Iterator<UGCLifecycle> it = uGCSafeList.iterator();
                while (it.hasNext()) {
                    it.next().onActivitySaveInstanceState(activity, bundle);
                }
            }
        }
    }

    public static void addForegroundListener(UGCForegroundListener uGCForegroundListener) {
        UGCServiceManager.getService(C23512b.class);
    }

    public static void removeForegroundListener(UGCForegroundListener uGCForegroundListener) {
        UGCServiceManager.getService(C23512b.class);
    }

    public static void addLifecycle(Activity activity, UGCLifecycle uGCLifecycle) {
        if (activity != null && uGCLifecycle != null && !activity.isFinishing()) {
            UGCSafeList<UGCLifecycle> uGCSafeList = UGCLifecycle.singleton.map.get(activity);
            if (uGCSafeList == null) {
                uGCSafeList = new UGCSafeList<>();
                UGCLifecycle.singleton.map.put(activity, uGCSafeList);
            }
            uGCSafeList.add(uGCLifecycle);
        }
    }

    public static void removeLifecycle(Activity activity, UGCLifecycle uGCLifecycle) {
        UGCSafeList<UGCLifecycle> uGCSafeList;
        if (activity != null && uGCLifecycle != null && (uGCSafeList = UGCLifecycle.singleton.map.get(activity)) != null) {
            uGCSafeList.remove(uGCLifecycle);
            if (uGCSafeList.size() == 0) {
                UGCLifecycle.singleton.map.remove(activity);
            }
        }
    }
}
