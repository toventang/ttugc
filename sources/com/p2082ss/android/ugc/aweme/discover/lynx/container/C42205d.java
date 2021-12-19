package com.p2082ss.android.ugc.aweme.discover.lynx.container;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.C42193a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.intermediate.C42869a;
import java.lang.ref.WeakReference;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88933j;
import p4560f.p4561a.AbstractC88945k;
import p4560f.p4561a.EnumC88388a;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88553m;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.d */
public final class C42205d {

    /* renamed from: a */
    public static boolean f98373a;

    /* renamed from: b */
    public static final C42205d f98374b = new C42205d();

    /* renamed from: c */
    private static WeakReference<C42207e> f98375c;

    private C42205d() {
    }

    static {
        Covode.recordClassIndex(50145);
    }

    /* renamed from: a */
    public static C89378p<C42207e, Boolean> m84471a() {
        boolean z;
        C42207e eVar;
        MethodCollector.m26663i(7702);
        WeakReference<C42207e> weakReference = f98375c;
        if (weakReference == null || weakReference.get() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            WeakReference<C42207e> weakReference2 = f98375c;
            if (weakReference2 == null) {
                C89219l.m154715b();
            }
            eVar = weakReference2.get();
            if (eVar == null) {
                C89219l.m154715b();
            }
        } else {
            Context context = GlobalContext.getContext();
            C89219l.m154716b(context, "");
            eVar = new C42207e(context);
        }
        ViewParent parent = eVar.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        C89219l.m154721d(eVar, "");
        f98375c = new WeakReference<>(eVar);
        C89378p<C42207e, Boolean> pVar = new C89378p<>(eVar, Boolean.valueOf(z));
        MethodCollector.m26664o(7702);
        return pVar;
    }

    /* renamed from: b */
    public static void m84473b() {
        String bulletSchema;
        for (C42201a aVar : C42869a.m85601a()) {
            if (aVar.f98364a == C42202b.f98366a && aVar.f98365b != null) {
                if (TextUtils.isEmpty(aVar.f98365b.getBulletSchema())) {
                    bulletSchema = aVar.f98365b.getSchema();
                } else {
                    bulletSchema = aVar.f98365b.getBulletSchema();
                }
                if (bulletSchema != null) {
                    C42193a aVar2 = C42193a.f98351b;
                    Context context = GlobalContext.getContext();
                    C89219l.m154716b(context, "");
                    aVar2.mo71392a(context, bulletSchema, aVar.f98365b.getRawData());
                    f98373a = true;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.container.d$a */
    static final class C42206a<T> implements AbstractC88945k {

        /* renamed from: a */
        public static final C42206a f98376a = new C42206a();

        static {
            Covode.recordClassIndex(50146);
        }

        C42206a() {
        }

        @Override // p4560f.p4561a.AbstractC88945k
        /* renamed from: a */
        public final void mo17627a(AbstractC88933j<String> jVar) {
            C89219l.m154721d(jVar, "");
            C42205d.m84473b();
            jVar.mo143023a();
        }
    }

    /* renamed from: a */
    public static void m84472a(boolean z) {
        if (z) {
            AbstractC88924h.m154134a(C42206a.f98376a, EnumC88388a.DROP).mo143204b(C88925a.m154180b(C88946a.f201991c)).mo143192a(C88446a.f200698d, C88446a.f200700f, C88446a.f200697c, C88553m.EnumC88554a.INSTANCE);
        } else {
            m84473b();
        }
    }
}
