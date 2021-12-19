package com.p2082ss.android.ugc.aweme.journey.flow;

import android.content.Context;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.journey.C56840aa;
import com.p2082ss.android.ugc.aweme.journey.p3291a.C56837c;
import com.p2082ss.android.ugc.aweme.journey.step.C56888b;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import java.lang.ref.WeakReference;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.flow.NewUserJourneyFlowDependencies */
public final class NewUserJourneyFlowDependencies extends AbstractC1174ac {

    /* renamed from: a */
    public final C56888b f129466a = new C56888b();

    /* renamed from: b */
    public AbstractC89171a<? extends WeakReference<Context>> f129467b = C56856a.f129473a;

    /* renamed from: c */
    private C1213t<C56840aa> f129468c;

    /* renamed from: d */
    private ComponentDependencies f129469d;

    /* renamed from: e */
    private C1213t<Boolean> f129470e;

    /* renamed from: f */
    private AbstractC89171a<C89391z> f129471f;

    /* renamed from: g */
    private C56837c f129472g;

    static {
        Covode.recordClassIndex(66741);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.flow.NewUserJourneyFlowDependencies$a */
    static final class C56856a extends AbstractC89220m implements AbstractC89171a<WeakReference<Context>> {

        /* renamed from: a */
        public static final C56856a f129473a = new C56856a();

        static {
            Covode.recordClassIndex(66742);
        }

        C56856a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakReference<Context> invoke() {
            return new WeakReference(null);
        }
    }

    /* renamed from: a */
    public final ComponentDependencies mo94020a() {
        ComponentDependencies componentDependencies = this.f129469d;
        if (componentDependencies == null) {
            C89219l.m154710a("componentDependencies");
        }
        return componentDependencies;
    }

    /* renamed from: b */
    public final C1213t<Boolean> mo94025b() {
        C1213t<Boolean> tVar = this.f129470e;
        if (tVar == null) {
            C89219l.m154710a("needRefreshLiveData");
        }
        return tVar;
    }

    /* renamed from: d */
    public final AbstractC89171a<C89391z> mo94029d() {
        AbstractC89171a<C89391z> aVar = this.f129471f;
        if (aVar == null) {
            C89219l.m154710a("onFinishRunnable");
        }
        return aVar;
    }

    /* renamed from: c */
    public final C56837c mo94028c() {
        if (this.f129472g == null) {
            this.f129472g = new C56837c();
        }
        C56837c cVar = this.f129472g;
        if (cVar == null) {
            C89219l.m154715b();
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo94021a(C1213t<C56840aa> tVar) {
        C89219l.m154721d(tVar, "");
        this.f129468c = tVar;
    }

    /* renamed from: b */
    public final void mo94026b(C1213t<Boolean> tVar) {
        C89219l.m154721d(tVar, "");
        this.f129470e = tVar;
    }

    /* renamed from: a */
    public final void mo94022a(C56837c cVar) {
        C89219l.m154721d(cVar, "");
        this.f129472g = cVar;
    }

    /* renamed from: b */
    public final void mo94027b(AbstractC89171a<? extends WeakReference<Context>> aVar) {
        C89219l.m154721d(aVar, "");
        this.f129467b = aVar;
    }

    /* renamed from: a */
    public final void mo94023a(ComponentDependencies componentDependencies) {
        C89219l.m154721d(componentDependencies, "");
        this.f129469d = componentDependencies;
    }

    /* renamed from: a */
    public final void mo94024a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f129471f = aVar;
    }
}
