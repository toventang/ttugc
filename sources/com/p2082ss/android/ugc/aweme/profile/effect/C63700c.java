package com.p2082ss.android.ugc.aweme.profile.effect;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.ext.list.AbstractC20427a;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.C20442b;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.widget.C23669c;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.effect.c */
public final class C63700c implements AbstractC41262aa {

    /* renamed from: a */
    public boolean f144418a;

    /* renamed from: b */
    public final EffectProfileListViewModel f144419b;

    /* renamed from: c */
    private AbstractC20527q f144420c;

    /* renamed from: d */
    private ActivityC0945e f144421d;

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$a */
    public static final class C63701a extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {
        public static final C63701a INSTANCE = new C63701a();

        static {
            Covode.recordClassIndex(75028);
        }

        public C63701a() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final void invoke(AbstractC20477i iVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$b */
    public static final class C63702b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {
        public static final C63702b INSTANCE = new C63702b();

        static {
            Covode.recordClassIndex(75029);
        }

        public C63702b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* bridge */ /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            invoke(iVar, th);
            return C89391z.f203057a;
        }

        public final void invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154719c(th, "");
        }
    }

    static {
        Covode.recordClassIndex(75027);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        C89219l.m154721d(str, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return i + 10000;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$c */
    public static final class C63703c implements AbstractC20443c<C75445g, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f144422a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f144423b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f144424c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f144425d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f144426e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> f144427f;

        static {
            Covode.recordClassIndex(75030);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f144425d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f144426e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> mo33775c() {
            return this.f144427f;
        }

        public C63703c(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f144422a = bVar;
            this.f144423b = mVar;
            this.f144424c = mVar2;
            this.f144425d = bVar;
            this.f144426e = mVar;
            this.f144427f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$d */
    public static final class C63704d implements AbstractC20443c<C75445g, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f144428a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f144429b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f144430c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f144431d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f144432e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> f144433f;

        static {
            Covode.recordClassIndex(75031);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f144431d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f144432e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> mo33775c() {
            return this.f144433f;
        }

        public C63704d(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f144428a = bVar;
            this.f144429b = mVar;
            this.f144430c = mVar2;
            this.f144431d = bVar;
            this.f144432e = mVar;
            this.f144433f = mVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final /* bridge */ /* synthetic */ Object getViewModel() {
        return this.f144419b;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return this.f144418a;
    }

    public C63700c(EffectProfileListViewModel effectProfileListViewModel) {
        this.f144419b = effectProfileListViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$f */
    static final class C63707f extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63700c f144437a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f144438b;

        static {
            Covode.recordClassIndex(75034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63707f(C63700c cVar, AbstractC39102c cVar2) {
            super(1);
            this.f144437a = cVar;
            this.f144438b = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f144437a.f144419b, new AbstractC89172b<EffectProfileState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.effect.C63700c.C63707f.C637081 */

                /* renamed from: a */
                final /* synthetic */ C63707f f144439a;

                static {
                    Covode.recordClassIndex(75035);
                }

                {
                    this.f144439a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(EffectProfileState effectProfileState) {
                    C89219l.m154721d(effectProfileState, "");
                    this.f144439a.f144438b.aW_();
                    this.f144439a.f144437a.f144418a = true;
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        EffectProfileListViewModel effectProfileListViewModel = this.f144419b;
        if (effectProfileListViewModel != null) {
            AbstractC20527q qVar = this.f144420c;
            if (qVar == null) {
                C89219l.m154710a("jediView");
            }
            ListViewModel.m38623a(effectProfileListViewModel, qVar, (AbstractC20427a) null, new C63703c(C63701a.INSTANCE, C63702b.INSTANCE, new C63705e(this, adVar)), new C63704d(new C63707f(this, adVar), new C63711h(this, adVar), new C63709g(this, adVar)), 242);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.f144419b == null) {
            return false;
        }
        ActivityC0945e activity = fragment.getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        this.f144421d = activity;
        this.f144420c = new EffectProfileDetailJediWidget();
        C23669c a = C23669c.C23671a.m44763a(fragment, fragment.getView());
        AbstractC20527q qVar = this.f144420c;
        if (qVar == null) {
            C89219l.m154710a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a.mo39102a((Widget) qVar);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$e */
    static final class C63705e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63700c f144434a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f144435b;

        static {
            Covode.recordClassIndex(75032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63705e(C63700c cVar, AbstractC39102c cVar2) {
            super(2);
            this.f144434a = cVar;
            this.f144435b = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C75445g> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f144434a.f144419b, new AbstractC89172b<EffectProfileState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.effect.C63700c.C63705e.C637061 */

                /* renamed from: a */
                final /* synthetic */ C63705e f144436a;

                static {
                    Covode.recordClassIndex(75033);
                }

                {
                    this.f144436a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(EffectProfileState effectProfileState) {
                    EffectProfileState effectProfileState2 = effectProfileState;
                    C89219l.m154721d(effectProfileState2, "");
                    C20442b bVar = effectProfileState2.getSubstate().getPayload().f48406a;
                    List<C75445g> list = effectProfileState2.getSubstate().getList();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Aweme aweme = it.next().relatedAweme;
                        if (aweme != null) {
                            arrayList.add(aweme);
                        }
                    }
                    this.f144436a.f144435b.mo59512a(arrayList, bVar.f48382a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$g */
    static final class C63709g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C75445g>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63700c f144440a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f144441b;

        static {
            Covode.recordClassIndex(75036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63709g(C63700c cVar, AbstractC39102c cVar2) {
            super(2);
            this.f144440a = cVar;
            this.f144441b = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C75445g> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f144440a.f144419b, new AbstractC89172b<EffectProfileState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.effect.C63700c.C63709g.C637101 */

                /* renamed from: a */
                final /* synthetic */ C63709g f144442a;

                static {
                    Covode.recordClassIndex(75037);
                }

                {
                    this.f144442a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(EffectProfileState effectProfileState) {
                    EffectProfileState effectProfileState2 = effectProfileState;
                    C89219l.m154721d(effectProfileState2, "");
                    C20442b bVar = effectProfileState2.getSubstate().getPayload().f48406a;
                    List<C75445g> list = effectProfileState2.getSubstate().getList();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Aweme aweme = it.next().relatedAweme;
                        if (aweme != null) {
                            arrayList.add(aweme);
                        }
                    }
                    this.f144442a.f144441b.mo59517b(arrayList, bVar.f48382a);
                    return C89391z.f203057a;
                }
            });
            this.f144440a.f144418a = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.effect.c$h */
    static final class C63711h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63700c f144443a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f144444b;

        static {
            Covode.recordClassIndex(75038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63711h(C63700c cVar, AbstractC39102c cVar2) {
            super(2);
            this.f144443a = cVar;
            this.f144444b = cVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            this.f144444b.mo59522c(new Exception(th2));
            this.f144443a.f144418a = false;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        EffectProfileListViewModel effectProfileListViewModel;
        C89219l.m154721d(bVar, "");
        if (i == 1) {
            EffectProfileListViewModel effectProfileListViewModel2 = this.f144419b;
            if (effectProfileListViewModel2 != null) {
                effectProfileListViewModel2.mo33757k();
            }
        } else if (i == 4 && (effectProfileListViewModel = this.f144419b) != null) {
            effectProfileListViewModel.mo33758l();
        }
    }
}
