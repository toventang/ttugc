package com.bytedance.p802b.p821e;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import com.bytedance.p802b.p834j.p838d.AbstractC13108c;
import com.bytedance.p802b.p841k.C13113a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.bytedance.b.e.a */
public final class C13036a implements Application.ActivityLifecycleCallbacks, AbstractC13106a {

    /* renamed from: a */
    public volatile boolean f31813a;

    /* renamed from: b */
    private final ArrayList<AbstractC13108c> f31814b = new ArrayList<>();

    /* renamed from: c */
    private WeakReference<Activity> f31815c;

    /* renamed from: d */
    private String f31816d = null;

    /* renamed from: e */
    private boolean f31817e;

    /* renamed from: f */
    private int f31818f;

    static {
        Covode.recordClassIndex(14872);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.p802b.p834j.p838d.AbstractC13106a
    /* renamed from: a */
    public final boolean mo20901a() {
        return this.f31813a;
    }

    public C13036a() {
        Application application = C13113a.f31955g;
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: c */
    private Object[] m23427c() {
        Object[] objArr;
        synchronized (this.f31814b) {
            if (this.f31814b.size() > 0) {
                objArr = this.f31814b.toArray();
            } else {
                objArr = null;
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }

    @Override // com.bytedance.p802b.p834j.p838d.AbstractC13106a
    /* renamed from: b */
    public final String mo20902b() {
        WeakReference<Activity> weakReference = this.f31815c;
        String str = "";
        if (weakReference == null) {
            return str;
        }
        Activity activity = weakReference.get();
        if (activity == null || (str = this.f31816d) != null) {
            return str;
        }
        return activity.getClass().getCanonicalName();
    }

    public final void onActivityPaused(Activity activity) {
        m23427c();
    }

    @Override // com.bytedance.p802b.p834j.p838d.AbstractC13106a
    /* renamed from: a */
    public final void mo20900a(AbstractC13108c cVar) {
        if (cVar != null) {
            synchronized (this.f31814b) {
                this.f31814b.add(cVar);
            }
        }
    }

    @Override // com.bytedance.p802b.p834j.p838d.AbstractC13106a
    /* renamed from: b */
    public final void mo20903b(AbstractC13108c cVar) {
        if (cVar != null) {
            synchronized (this.f31814b) {
                this.f31814b.remove(cVar);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f31815c = new WeakReference<>(activity);
        this.f31816d = null;
        m23427c();
    }

    public final void onActivityStarted(Activity activity) {
        m23427c();
        if (this.f31817e) {
            this.f31817e = false;
            return;
        }
        int i = this.f31818f + 1;
        this.f31818f = i;
        if (i == 1) {
            this.f31813a = true;
            for (Object obj : m23427c()) {
                ((AbstractC13108c) obj).mo20838a();
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f31817e = true;
            return;
        }
        int i = this.f31818f - 1;
        this.f31818f = i;
        if (i == 0) {
            this.f31813a = false;
            for (Object obj : m23427c()) {
                ((AbstractC13108c) obj).mo20839b();
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m23427c();
    }
}
