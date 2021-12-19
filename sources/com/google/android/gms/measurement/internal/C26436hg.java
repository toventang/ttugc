package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.hg */
public final class C26436hg implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C26413gk f62174a;

    static {
        Covode.recordClassIndex(31858);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    private C26436hg(C26413gk gkVar) {
        this.f62174a = gkVar;
    }

    public final void onActivityDestroyed(Activity activity) {
        MethodCollector.m26663i(4507);
        C26446hq h = this.f62174a.mo43007h();
        synchronized (h.f62207j) {
            try {
                if (activity == h.f62202e) {
                    h.f62202e = null;
                }
            } finally {
                MethodCollector.m26664o(4507);
            }
        }
        if (h.mo43018s().mo43647h().booleanValue()) {
            h.f62201d.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        MethodCollector.m26663i(4524);
        C26446hq h = this.f62174a.mo43007h();
        if (h.mo43018s().mo43641d(null, C26530p.f62492aD)) {
            synchronized (h.f62207j) {
                try {
                    h.f62206i = false;
                    h.f62203f = true;
                } catch (Throwable th) {
                    MethodCollector.m26664o(4524);
                    throw th;
                }
            }
        }
        long b = h.mo43011l().mo41858b();
        if (!h.mo43018s().mo43641d(null, C26530p.f62491aC) || h.mo43018s().mo43647h().booleanValue()) {
            C26443hn a = h.mo43370a(activity);
            h.f62199b = h.f62198a;
            h.f62198a = null;
            h.mo43015p().mo43220a(new RunnableC26449ht(h, a, b));
        } else {
            h.f62198a = null;
            h.mo43015p().mo43220a(new RunnableC26450hu(h, b));
        }
        C26482iz j = this.f62174a.mo43009j();
        j.mo43015p().mo43220a(new RunnableC26485jb(j, j.mo43011l().mo41858b()));
        MethodCollector.m26664o(4524);
    }

    public final void onActivityResumed(Activity activity) {
        MethodCollector.m26663i(4549);
        C26482iz j = this.f62174a.mo43009j();
        j.mo43015p().mo43220a(new RunnableC26486jc(j, j.mo43011l().mo41858b()));
        C26446hq h = this.f62174a.mo43007h();
        if (h.mo43018s().mo43641d(null, C26530p.f62492aD)) {
            synchronized (h.f62207j) {
                try {
                    h.f62206i = true;
                    if (activity != h.f62202e) {
                        synchronized (h.f62207j) {
                            try {
                                h.f62202e = activity;
                                h.f62203f = false;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (h.mo43018s().mo43641d(null, C26530p.f62491aC) && h.mo43018s().mo43647h().booleanValue()) {
                            h.f62204g = null;
                            h.mo43015p().mo43220a(new RunnableC26452hw(h));
                        }
                    }
                } finally {
                    MethodCollector.m26664o(4549);
                }
            }
        }
        if (!h.mo43018s().mo43641d(null, C26530p.f62491aC) || h.mo43018s().mo43647h().booleanValue()) {
            h.mo43373a(activity, h.mo43370a(activity), false);
            C26240a d = h.mo43003d();
            d.mo43015p().mo43220a(new RunnableC26324dc(d, d.mo43011l().mo41858b()));
            MethodCollector.m26664o(4549);
            return;
        }
        h.f62198a = h.f62204g;
        h.mo43015p().mo43220a(new RunnableC26447hr(h));
        MethodCollector.m26664o(4549);
    }

    /* synthetic */ C26436hg(C26413gk gkVar, byte b) {
        this(gkVar);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C26443hn hnVar;
        C26446hq h = this.f62174a.mo43007h();
        if (h.mo43018s().mo43647h().booleanValue() && bundle != null && (hnVar = h.f62201d.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", hnVar.f62189c);
            bundle2.putString(StringSet.name, hnVar.f62187a);
            bundle2.putString("referrer_name", hnVar.f62188b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        try {
            this.f62174a.mo43016q().f61835k.mo43169a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    this.f62174a.mo43007h().mo43372a(activity, bundle);
                    return;
                }
                this.f62174a.mo43014o();
                String a = C26510jz.m52387a(intent, "android.intent.extra.REFERRER_NAME");
                boolean z = true;
                if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(a) || "https://www.google.com".equals(a) || "android-app://com.google.appcrawler".equals(a)) {
                    str = "gs";
                } else {
                    str = "auto";
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (bundle != null) {
                    z = false;
                }
                this.f62174a.mo43015p().mo43220a(new RunnableC26435hf(this, z, data, str, queryParameter));
                this.f62174a.mo43007h().mo43372a(activity, bundle);
            }
        } catch (Exception e) {
            this.f62174a.mo43016q().f61827c.mo43170a("Throwable caught in onActivityCreated", e);
        } finally {
            this.f62174a.mo43007h().mo43372a(activity, bundle);
        }
    }
}
