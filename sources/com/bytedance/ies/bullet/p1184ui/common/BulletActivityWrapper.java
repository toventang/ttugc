package com.bytedance.ies.bullet.p1184ui.common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.BulletActivityWrapper */
public class BulletActivityWrapper implements AbstractC17045g {

    /* renamed from: a */
    private final WeakReference<Activity> f40451a;

    /* renamed from: b */
    private final List<AbstractC17017a> f40452b = new ArrayList();

    static {
        Covode.recordClassIndex(19432);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: a */
    public final boolean mo26064a(Activity activity) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                return it.next().mo26064a(activity);
            } catch (C16614as unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    private List<AbstractC17017a> m31306c() {
        return C89070n.m154590j(this.f40452b);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g
    /* renamed from: a */
    public final Activity mo26816a() {
        return this.f40451a.get();
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g
    /* renamed from: b */
    public final void mo26825b() {
        Activity activity = this.f40451a.get();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletActivityWrapper$BulletLifecycleObserver */
    static final class BulletLifecycleObserver implements AbstractC33974au {

        /* renamed from: a */
        public final WeakReference<BulletActivityWrapper> f40453a;

        /* renamed from: b */
        public final WeakReference<AbstractC1204m> f40454b;

        static {
            Covode.recordClassIndex(19433);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
                onCreate();
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
                onStart();
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                onResume();
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
                onPause();
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                onStop();
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                onDestroy();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
        public final void onCreate() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a;
            if (this.f40453a.get() != null && (bulletActivityWrapper = this.f40453a.get()) != null && (a = bulletActivityWrapper.mo26816a()) != null) {
                bulletActivityWrapper.mo26820a(a, (Bundle) null);
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
        public final void onPause() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a;
            if (this.f40453a.get() != null && (bulletActivityWrapper = this.f40453a.get()) != null && (a = bulletActivityWrapper.mo26816a()) != null) {
                bulletActivityWrapper.mo26223c(a);
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
        public final void onResume() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a;
            if (this.f40453a.get() != null && (bulletActivityWrapper = this.f40453a.get()) != null && (a = bulletActivityWrapper.mo26816a()) != null) {
                bulletActivityWrapper.mo26222b(a);
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
        public final void onStart() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a;
            if (this.f40453a.get() != null && (bulletActivityWrapper = this.f40453a.get()) != null && (a = bulletActivityWrapper.mo26816a()) != null) {
                bulletActivityWrapper.mo26829e(a);
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
        public final void onStop() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a;
            if (this.f40453a.get() != null && (bulletActivityWrapper = this.f40453a.get()) != null && (a = bulletActivityWrapper.mo26816a()) != null) {
                bulletActivityWrapper.mo26830f(a);
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
        public final void onDestroy() {
            BulletActivityWrapper bulletActivityWrapper;
            Activity a;
            AbstractC1196i lifecycle;
            if (this.f40453a.get() != null && (bulletActivityWrapper = this.f40453a.get()) != null && (a = bulletActivityWrapper.mo26816a()) != null) {
                bulletActivityWrapper.mo26224d(a);
                AbstractC1204m mVar = this.f40454b.get();
                if (mVar != null && (lifecycle = mVar.getLifecycle()) != null) {
                    lifecycle.mo4013b(this);
                }
            }
        }

        public BulletLifecycleObserver(WeakReference<BulletActivityWrapper> weakReference, WeakReference<AbstractC1204m> weakReference2) {
            C89219l.m154719c(weakReference, "");
            C89219l.m154719c(weakReference2, "");
            this.f40453a = weakReference;
            this.f40454b = weakReference2;
        }
    }

    public BulletActivityWrapper(Activity activity) {
        C89219l.m154719c(activity, "");
        this.f40451a = new WeakReference<>(activity);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: b */
    public final void mo26222b(Activity activity) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26222b(activity);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: c */
    public final void mo26223c(Activity activity) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26223c(activity);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: d */
    public final void mo26224d(Activity activity) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26224d(activity);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: e */
    public final void mo26829e(Activity activity) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26829e(activity);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: f */
    public final void mo26830f(Activity activity) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26830f(activity);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g
    /* renamed from: b */
    public final void mo26827b(AbstractC17017a aVar) {
        C89219l.m154719c(aVar, "");
        this.f40452b.remove(aVar);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g
    /* renamed from: a */
    public final void mo26822a(Intent intent) {
        C89219l.m154719c(intent, "");
        Activity activity = this.f40451a.get();
        if (activity != null) {
            activity.setResult(50000, intent);
        }
    }

    /* renamed from: a */
    public final void mo26823a(AbstractC1204m mVar) {
        C89219l.m154719c(mVar, "");
        mVar.getLifecycle().mo4012a(new BulletLifecycleObserver(new WeakReference(this), new WeakReference(mVar)));
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g
    /* renamed from: a */
    public final void mo26824a(AbstractC17017a aVar) {
        C89219l.m154719c(aVar, "");
        this.f40452b.add(aVar);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: b */
    public final void mo26826b(Activity activity, Bundle bundle) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26826b(activity, bundle);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: c */
    public final void mo26828c(Activity activity, Bundle bundle) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26828c(activity, bundle);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: a */
    public final void mo26819a(Activity activity, Configuration configuration) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26819a(activity, configuration);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: a */
    public final void mo26820a(Activity activity, Bundle bundle) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26820a(activity, bundle);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: a */
    public final void mo26821a(Activity activity, boolean z) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26821a(activity, z);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: a */
    public final void mo26817a(Activity activity, int i, int i2, Intent intent) {
        C89219l.m154719c(activity, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26817a(activity, i, i2, intent);
            } catch (C16614as unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a
    /* renamed from: a */
    public final void mo26818a(Activity activity, int i, String[] strArr, int[] iArr) {
        C89219l.m154719c(activity, "");
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        Iterator<T> it = m31306c().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo26818a(activity, i, strArr, iArr);
            } catch (C16614as unused) {
            }
        }
    }
}
