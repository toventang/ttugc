package com.bytedance.apm.trace;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.trace.p792c.C12632a;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.AbstractC22711d;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.apm.trace.c */
public final class C12629c implements AbstractC22711d {

    /* renamed from: a */
    public long f30739a = -1;

    /* renamed from: b */
    public String f30740b;

    /* renamed from: c */
    public ViewTreeObserver.OnGlobalLayoutListener f30741c;

    /* renamed from: d */
    public Runnable f30742d;

    /* renamed from: e */
    public Handler f30743e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public long f30744f;

    /* renamed from: g */
    private boolean f30745g;

    static {
        Covode.recordClassIndex(14446);
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public final void mo20033a(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: b */
    public final void mo20035b(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: l_ */
    public final void mo20110l_() {
    }

    /* renamed from: a */
    public final void mo20441a(long j) {
        this.f30744f = j;
        this.f30745g = true;
        ActivityLifeObserver.getInstance().register(this);
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: c */
    public final void mo20109c(Activity activity) {
        this.f30739a = 0;
        try {
            if (this.f30741c != null) {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f30741c);
                this.f30741c = null;
            }
            Runnable runnable = this.f30742d;
            if (runnable != null) {
                this.f30743e.removeCallbacks(runnable);
                this.f30742d = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC22711d
    /* renamed from: a */
    public final void mo20108a(Activity activity, Bundle bundle) {
        if (!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activity)) {
            int i = Build.VERSION.SDK_INT;
            if (this.f30745g) {
                try {
                    this.f30739a = System.currentTimeMillis();
                    String canonicalName = activity.getClass().getCanonicalName();
                    this.f30740b = canonicalName;
                    final Integer a = C12632a.m22760a(canonicalName);
                    if (a != null) {
                        final WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
                        this.f30741c = new ViewTreeObserver.OnGlobalLayoutListener() {
                            /* class com.bytedance.apm.trace.C12629c.ViewTreeObserver$OnGlobalLayoutListenerC126301 */

                            static {
                                Covode.recordClassIndex(14447);
                            }

                            public final void onGlobalLayout() {
                                View findViewById;
                                if (weakReference.get() != null && (findViewById = ((View) weakReference.get()).findViewById(a.intValue())) != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                                    ViewTreeObserver viewTreeObserver = ((View) weakReference.get()).getViewTreeObserver();
                                    if (viewTreeObserver.isAlive() && C12629c.this.f30741c != null) {
                                        viewTreeObserver.removeOnGlobalLayoutListener(C12629c.this.f30741c);
                                    }
                                    if (C12629c.this.f30742d != null) {
                                        C12629c.this.f30743e.removeCallbacks(C12629c.this.f30742d);
                                        C12629c.this.f30742d = null;
                                    }
                                    C12629c.this.f30741c = null;
                                    if (C12629c.this.f30739a > 0) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        long j = currentTimeMillis - C12629c.this.f30739a;
                                        C12629c.this.f30739a = 0;
                                        if (j < C12629c.this.f30744f && j > 0) {
                                            AutoPageTraceHelper.reportViewIdStats(currentTimeMillis, C12629c.this.f30740b);
                                            MonitorTool.reportTraceTime(C12629c.this.f30740b, "activityOnCreateToViewShow", j);
                                        }
                                    }
                                }
                            }
                        };
                        ((View) weakReference.get()).getViewTreeObserver().addOnGlobalLayoutListener(this.f30741c);
                        RunnableC126312 r3 = new Runnable() {
                            /* class com.bytedance.apm.trace.C12629c.RunnableC126312 */

                            static {
                                Covode.recordClassIndex(14448);
                            }

                            public final void run() {
                                if (C12629c.this.f30741c != null && weakReference.get() != null) {
                                    ((View) weakReference.get()).getViewTreeObserver().removeOnGlobalLayoutListener(C12629c.this.f30741c);
                                }
                            }
                        };
                        this.f30742d = r3;
                        this.f30743e.postDelayed(r3, this.f30744f);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
