package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22266r;
import com.bytedance.scene.C22268t;
import com.bytedance.scene.p1622d.C22171k;

/* renamed from: com.bytedance.scene.q */
public final class C22264q<T extends AbstractC22219j & AbstractC22266r> {

    /* renamed from: a */
    T f52665a;

    /* renamed from: b */
    EnumC22265a f52666b = EnumC22265a.NONE;

    /* renamed from: c */
    boolean f52667c;

    static {
        Covode.recordClassIndex(26076);
    }

    /* renamed from: a */
    public final void mo36573a() {
        if (this.f52666b == EnumC22265a.ACTIVITY_CREATED || this.f52666b == EnumC22265a.STOP) {
            this.f52666b = EnumC22265a.START;
            this.f52665a.cs_();
            return;
        }
        throw new IllegalStateException("invoke onActivityCreated() or onStop() first, current state " + this.f52666b.toString());
    }

    /* renamed from: b */
    public final void mo36575b() {
        if (this.f52666b == EnumC22265a.START || this.f52666b == EnumC22265a.PAUSE) {
            this.f52666b = EnumC22265a.RESUME;
            this.f52665a.ct_();
            return;
        }
        throw new IllegalStateException("invoke onStart() or onPause() first, current state " + this.f52666b.toString());
    }

    /* renamed from: c */
    public final void mo36576c() {
        if (this.f52666b == EnumC22265a.RESUME) {
            this.f52666b = EnumC22265a.PAUSE;
            this.f52665a.cu_();
            return;
        }
        throw new IllegalStateException("invoke onResume() first, current state " + this.f52666b.toString());
    }

    /* renamed from: d */
    public final void mo36577d() {
        if (this.f52666b == EnumC22265a.PAUSE || this.f52666b == EnumC22265a.START) {
            this.f52666b = EnumC22265a.STOP;
            this.f52665a.cv_();
            return;
        }
        throw new IllegalStateException("invoke onPause() or onStart() first, current state " + this.f52666b.toString());
    }

    /* renamed from: com.bytedance.scene.q$a */
    enum EnumC22265a {
        NONE,
        ACTIVITY_CREATED,
        START,
        RESUME,
        PAUSE,
        STOP;

        static {
            Covode.recordClassIndex(26077);
        }
    }

    /* renamed from: e */
    public final void mo36578e() {
        if (this.f52666b == EnumC22265a.STOP || this.f52666b == EnumC22265a.ACTIVITY_CREATED) {
            this.f52666b = EnumC22265a.NONE;
            this.f52665a.cw_();
            this.f52665a.mo36423k();
            this.f52665a.mo36424l();
            this.f52665a.mo36425m();
            this.f52665a.f52552p = null;
            this.f52665a = null;
            return;
        }
        throw new IllegalStateException("invoke onStop() or onActivityCreated() first, current state " + this.f52666b.toString());
    }

    /* renamed from: a */
    public final void mo36574a(Activity activity, ViewGroup viewGroup, T t, C22268t.AbstractC22270a aVar, boolean z, Bundle bundle) {
        MethodCollector.m26663i(8473);
        if (this.f52666b == EnumC22265a.NONE) {
            C22171k.m41656a(activity, "activity can't be null");
            C22171k.m41656a(viewGroup, "viewGroup can't be null");
            C22171k.m41656a(t, "scene can't be null");
            C22171k.m41656a(aVar, "rootScopeFactory can't be null");
            if (t.f52553q == EnumC22282w.NONE) {
                this.f52667c = z;
                if (z || bundle == null) {
                    this.f52666b = EnumC22265a.ACTIVITY_CREATED;
                    this.f52665a = t;
                    if (!this.f52667c) {
                        t.cq_();
                    }
                    this.f52665a.f52552p = aVar;
                    this.f52665a.mo36388a(activity);
                    this.f52665a.mo36390a(null);
                    this.f52665a.mo36396b(bundle);
                    this.f52665a.mo36389a(bundle, viewGroup);
                    viewGroup.addView(this.f52665a.mo36482p(), new ViewGroup.LayoutParams(-1, -1));
                    this.f52665a.mo36399c(bundle);
                    MethodCollector.m26664o(8473);
                    return;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("savedInstanceState should be null when not support restore");
                MethodCollector.m26664o(8473);
                throw illegalArgumentException;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Scene state must be " + EnumC22282w.NONE.name);
            MethodCollector.m26664o(8473);
            throw illegalStateException;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("invoke onDestroyView() first, current state " + this.f52666b.toString());
        MethodCollector.m26664o(8473);
        throw illegalStateException2;
    }
}
