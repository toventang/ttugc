package com.bytedance.ies.powerpreload;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17776a;
import com.bytedance.ies.powerpreload.p1242a.C17778a;
import com.bytedance.ies.powerpreload.p1242a.C17779b;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17789d;
import com.bytedance.ies.powerpreload.p1245d.C17808a;
import com.bytedance.ies.powerpreload.p1245d.C17811b;
import com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f;
import com.bytedance.ies.powerpreload.task.C17823b;
import com.bytedance.ies.powerpreload.task.C17834g;
import com.bytedance.ies.powerpreload.task.C17838h;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.b */
public final class C17782b {

    /* renamed from: a */
    private final AbstractC89244h f42462a = C89250i.m154773a((AbstractC89171a) C17785c.f42467a);

    /* renamed from: b */
    private final AbstractC89244h f42463b = C89250i.m154773a((AbstractC89171a) new C17784b(this));

    static {
        Covode.recordClassIndex(20346);
    }

    /* renamed from: a */
    public final C17834g mo28251a() {
        return (C17834g) this.f42462a.getValue();
    }

    /* renamed from: b */
    public final C17823b mo28253b() {
        return (C17823b) this.f42463b.getValue();
    }

    /* renamed from: com.bytedance.ies.powerpreload.b$b */
    static final class C17784b extends AbstractC89220m implements AbstractC89171a<C17823b> {

        /* renamed from: a */
        final /* synthetic */ C17782b f42466a;

        static {
            Covode.recordClassIndex(20348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17784b(C17782b bVar) {
            super(0);
            this.f42466a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17823b invoke() {
            return new C17823b(this.f42466a.mo28251a());
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.b$c */
    static final class C17785c extends AbstractC89220m implements AbstractC89171a<C17834g> {

        /* renamed from: a */
        public static final C17785c f42467a = new C17785c();

        static {
            Covode.recordClassIndex(20349);
        }

        C17785c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17834g invoke() {
            C17834g gVar = new C17834g();
            C89219l.m154719c(gVar, "");
            C17778a.f42448a = gVar;
            return gVar;
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.b$a */
    public final class C17783a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        private final /* synthetic */ Application.ActivityLifecycleCallbacks f42465b;

        static {
            Covode.recordClassIndex(20347);
        }

        public final void onActivityPaused(Activity activity) {
            C89219l.m154719c(activity, "");
            this.f42465b.onActivityPaused(activity);
        }

        public final void onActivityResumed(Activity activity) {
            C89219l.m154719c(activity, "");
            this.f42465b.onActivityResumed(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C89219l.m154719c(activity, "");
            C89219l.m154719c(bundle, "");
            this.f42465b.onActivitySaveInstanceState(activity, bundle);
        }

        public final void onActivityStarted(Activity activity) {
            C89219l.m154719c(activity, "");
            this.f42465b.onActivityStarted(activity);
        }

        public final void onActivityStopped(Activity activity) {
            C89219l.m154719c(activity, "");
            this.f42465b.onActivityStopped(activity);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C17783a() {
            C17776a.C17777a aVar = C17776a.C17777a.f42447a;
            Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, aVar);
            if (newProxyInstance != null) {
                this.f42465b = (Application.ActivityLifecycleCallbacks) newProxyInstance;
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        public final void onActivityDestroyed(Activity activity) {
            Set<C17838h> a;
            C89219l.m154719c(activity, "");
            C17823b b = C17782b.this.mo28253b();
            C89219l.m154719c(activity, "");
            Intent intent = activity.getIntent();
            C89219l.m154709a((Object) intent, "");
            String b2 = C17776a.m32981b(intent);
            if (b2 != null) {
                C17834g gVar = b.f42529a;
                String name = activity.getClass().getName();
                C89219l.m154709a((Object) name, "");
                C17807d a2 = gVar.mo28295a(name);
                if (!(a2 == null || !a2.f42493b || (a = b.f42529a.mo28296a(a2)) == null)) {
                    for (T t : a) {
                        AbstractRunnableC17828f<?> fVar = t.f42548a;
                        if (fVar != null && t.mo28301a(null, b2)) {
                            fVar.mo28286b();
                        }
                    }
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C89219l.m154719c(activity, "");
            C17823b b = C17782b.this.mo28253b();
            C89219l.m154719c(activity, "");
            C17834g gVar = b.f42529a;
            String name = activity.getClass().getName();
            C89219l.m154709a((Object) name, "");
            C17807d a = gVar.mo28295a(name);
            if (a != null) {
                if (a.f42492a && (activity instanceof ActivityC0945e)) {
                    ((ActivityC0945e) activity).getSupportFragmentManager().mo3555a((AbstractC0952i.AbstractC0954b) new C17823b.C17824a(), false);
                }
                Intent intent = activity.getIntent();
                C89219l.m154709a((Object) intent, "");
                String b2 = C17776a.m32981b(intent);
                if (b2 != null && !a.f42492a) {
                    a.f42493b = true;
                    Set<C17838h> a2 = b.f42529a.mo28296a(a);
                    if (a2 != null) {
                        for (T t : a2) {
                            AbstractRunnableC17828f<?> fVar = t.f42548a;
                            if (fVar != null && t.mo28301a(null, b2)) {
                                fVar.mo28290a(activity);
                            }
                        }
                    }
                }
            }
        }
    }

    public C17782b(C17779b bVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar, "");
        C17778a.f42449b = bVar;
        C17811b bVar2 = C17808a.C17809a.m32999a().f42501a;
        C89219l.m154719c(this, "");
        bVar2.f42504a = this;
        bVar.f42451a.registerActivityLifecycleCallbacks(new C17783a());
    }

    /* renamed from: a */
    public final void mo28252a(C17807d dVar, Bundle bundle) {
        ArrayList arrayList;
        C89219l.m154719c(dVar, "");
        if (dVar.f42498g != null) {
            dVar.f42492a = true;
        }
        List<String> list = dVar.f42495d;
        if (list.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str : list) {
                Class<?> cls = Class.forName(str);
                if (cls != null) {
                    Object newInstance = cls.newInstance();
                    C89219l.m154709a(newInstance, "");
                    arrayList.add(newInstance);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
        dVar.f42494c = arrayList;
        List<? extends AbstractC17789d> list2 = dVar.f42494c;
        if (list2 != null) {
            for (T t : list2) {
                if (t.enable(bundle)) {
                    AbstractRunnableC17828f<AbstractC17789d> a = C17778a.m32986c().mo28269a(t, dVar, bundle);
                    if (a != null) {
                        a.mo28292a((AbstractRunnableC17828f.AbstractC17829a) null);
                    }
                    C17834g a2 = mo28251a();
                    if (a == null) {
                        C89219l.m154707a();
                    }
                    a2.mo28297a(dVar, t, a, bundle != null ? C17776a.m32982b(bundle) : null);
                }
            }
        }
    }
}
