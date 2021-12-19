package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.lifecycle.x */
public final class FragmentC1220x extends Fragment {

    /* renamed from: a */
    public AbstractC1221a f4018a;

    /* renamed from: androidx.lifecycle.x$a */
    interface AbstractC1221a {
        static {
            Covode.recordClassIndex(1328);
        }

        /* renamed from: a */
        void mo4032a();

        /* renamed from: b */
        void mo4033b();
    }

    static {
        Covode.recordClassIndex(1327);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.x$b */
    public static class C1222b implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(1329);
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
        }

        public final void onActivityStopped(Activity activity) {
        }

        C1222b() {
        }

        public final void onActivityPostResumed(Activity activity) {
            FragmentC1220x.m3927a(activity, AbstractC1196i.EnumC1198a.ON_RESUME);
        }

        public final void onActivityPostStarted(Activity activity) {
            FragmentC1220x.m3927a(activity, AbstractC1196i.EnumC1198a.ON_START);
        }

        public final void onActivityPreDestroyed(Activity activity) {
            FragmentC1220x.m3927a(activity, AbstractC1196i.EnumC1198a.ON_DESTROY);
        }

        public final void onActivityPrePaused(Activity activity) {
            FragmentC1220x.m3927a(activity, AbstractC1196i.EnumC1198a.ON_PAUSE);
        }

        public final void onActivityPreStopped(Activity activity) {
            FragmentC1220x.m3927a(activity, AbstractC1196i.EnumC1198a.ON_STOP);
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C1222b());
        }

        public final void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC1220x.m3927a(activity, AbstractC1196i.EnumC1198a.ON_CREATE);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        m3928a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        this.f4018a = null;
    }

    public final void onPause() {
        super.onPause();
        m3928a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        AbstractC1221a aVar = this.f4018a;
        if (aVar != null) {
            aVar.mo4033b();
        }
        m3928a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        AbstractC1221a aVar = this.f4018a;
        if (aVar != null) {
            aVar.mo4032a();
        }
        m3928a(AbstractC1196i.EnumC1198a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        m3928a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    /* renamed from: a */
    private void m3928a(AbstractC1196i.EnumC1198a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m3927a(getActivity(), aVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m3928a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    /* renamed from: a */
    public static void m3926a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1222b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC1220x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    static void m3927a(Activity activity, AbstractC1196i.EnumC1198a aVar) {
        if (activity instanceof AbstractC1207o) {
            ((AbstractC1207o) activity).mo4020a().mo4016a(aVar);
        } else if (activity instanceof AbstractC1204m) {
            AbstractC1196i lifecycle = ((AbstractC1204m) activity).getLifecycle();
            if (lifecycle instanceof C1205n) {
                ((C1205n) lifecycle).mo4016a(aVar);
            }
        }
    }
}
