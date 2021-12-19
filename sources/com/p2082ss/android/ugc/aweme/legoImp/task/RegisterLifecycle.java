package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.uikit.p1279a.AbstractActivityC18232a;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.p2082ss.android.ugc.aweme.base.component.C34539b;
import com.p2082ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p2082ss.android.ugc.aweme.experiment.C46724b;
import com.p2082ss.android.ugc.aweme.experiment.C46800cq;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.journey.C57058z;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.p3070im.C53603g;
import com.p2082ss.android.ugc.aweme.splash.SplashActivity;
import com.p2082ss.android.ugc.aweme.util.C80123b;
import com.p2082ss.android.ugc.aweme.utils.C80320cy;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle */
public class RegisterLifecycle implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68581);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public static String m106431a(Activity activity) {
        Fragment a = C80320cy.m139242a(activity);
        if (a != null) {
            return a.toString();
        }
        return activity.toString();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.p2082ss.android.ugc.aweme.legoImp.task.RegisterLifecycle.C583811 */

            static {
                Covode.recordClassIndex(68582);
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivityPaused(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityStarted(Activity activity) {
            }

            public final void onActivityStopped(Activity activity) {
            }

            /* renamed from: a */
            private static void m106440a(ActivityC0945e eVar) {
                eVar.getLifecycle().mo4012a(new AnalysisActivityComponent(eVar));
                eVar.getLifecycle().mo4012a(new EventActivityComponent(eVar));
            }

            public final void onActivityResumed(Activity activity) {
                if (!C49907s.m93685a().booleanValue()) {
                    C53603g.C53604a.m98850a();
                    C53603g.m98842a().mo90137b(activity);
                }
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (C46724b.f108900a && !(activity instanceof MainActivity) && !(activity instanceof SplashActivity)) {
                    C80446fr.m139456a((long) (C46724b.f108904e * 1000));
                }
                if (C46800cq.f109028a && !(activity instanceof MainActivity) && !(activity instanceof SplashActivity)) {
                    C80446fr.m139459b(5000);
                }
                if (activity instanceof AbstractActivityC18232a) {
                    m106440a((ActivityC0945e) activity);
                }
                if (activity instanceof ActivityC17312a) {
                    m106440a((ActivityC0945e) activity);
                }
                if (activity instanceof ActivityC0945e) {
                    ((ActivityC0945e) activity).getSupportFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) new C34539b(), true);
                }
                C57058z.f129923a.mo57268b();
            }
        });
        application.registerActivityLifecycleCallbacks(new C58945a.C58946a());
        application.registerActivityLifecycleCallbacks(new PreventServerSideCrashes.C80176a());
        application.registerActivityLifecycleCallbacks(new C80123b());
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            /* class com.p2082ss.android.ugc.aweme.legoImp.task.RegisterLifecycle.C583822 */

            static {
                Covode.recordClassIndex(68583);
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
                ALog.m59869i("ActivityLifeCycleLog", activity + " onDestroyed");
            }

            public final void onActivityPaused(Activity activity) {
                ALog.m59869i("ActivityLifeCycleLog", RegisterLifecycle.m106431a(activity) + " onPaused");
            }

            public final void onActivityResumed(Activity activity) {
                ALog.m59869i("ActivityLifeCycleLog", RegisterLifecycle.m106431a(activity) + " onResumed");
            }

            public final void onActivityStarted(Activity activity) {
                ALog.m59869i("ActivityLifeCycleLog", RegisterLifecycle.m106431a(activity) + " onStarted");
            }

            public final void onActivityStopped(Activity activity) {
                ALog.m59869i("ActivityLifeCycleLog", RegisterLifecycle.m106431a(activity) + " onStopped");
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ALog.m59869i("ActivityLifeCycleLog", RegisterLifecycle.m106431a(activity) + " onCreated");
            }
        });
    }
}
