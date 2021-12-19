package com.p2082ss.android.ugc.aweme.trending.viewmodel;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.ext.list.AbstractC20427a;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.widget.C23669c;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.search.ISearchService;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b */
public final class C79142b implements AbstractC41262aa {

    /* renamed from: e */
    public static final C79143a f177867e = new C79143a((byte) 0);

    /* renamed from: a */
    public int f177868a;

    /* renamed from: b */
    public boolean f177869b = true;

    /* renamed from: c */
    public boolean f177870c;

    /* renamed from: d */
    public final TrendingMainViewModel f177871d;

    /* renamed from: f */
    private AbstractC20527q f177872f;

    /* renamed from: g */
    private final AbstractC89244h f177873g = C89250i.m154773a((AbstractC89171a) C79155j.f177901a);

    static {
        Covode.recordClassIndex(92328);
    }

    /* renamed from: a */
    public final ISearchService mo122948a() {
        return (ISearchService) this.f177873g.getValue();
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
        return 30;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$a */
    static final class C79143a {
        static {
            Covode.recordClassIndex(92329);
        }

        private C79143a() {
        }

        public /* synthetic */ C79143a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$b */
    public static final class C79144b implements AbstractC20443c<Aweme, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f177874a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f177875b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f177876c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f177877d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f177878e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Aweme>, C89391z> f177879f;

        static {
            Covode.recordClassIndex(92330);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f177877d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f177878e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Aweme>, C89391z> mo33775c() {
            return this.f177879f;
        }

        public C79144b(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f177874a = bVar;
            this.f177875b = mVar;
            this.f177876c = mVar2;
            this.f177877d = bVar;
            this.f177878e = mVar;
            this.f177879f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$c */
    public static final class C79145c implements AbstractC20443c<Aweme, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f177880a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f177881b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f177882c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f177883d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f177884e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Aweme>, C89391z> f177885f;

        static {
            Covode.recordClassIndex(92331);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f177883d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f177884e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Aweme>, C89391z> mo33775c() {
            return this.f177885f;
        }

        public C79145c(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f177880a = bVar;
            this.f177881b = mVar;
            this.f177882c = mVar2;
            this.f177883d = bVar;
            this.f177884e = mVar;
            this.f177885f = mVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        return this.f177871d;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return this.f177870c;
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$j */
    static final class C79155j extends AbstractC89220m implements AbstractC89171a<ISearchService> {

        /* renamed from: a */
        public static final C79155j f177901a = new C79155j();

        static {
            Covode.recordClassIndex(92341);
        }

        C79155j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchService invoke() {
            return SearchServiceImpl.m119336t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$d */
    static final class C79146d extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79142b f177886a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f177887b;

        static {
            Covode.recordClassIndex(92332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79146d(C79142b bVar, AbstractC39102c cVar) {
            super(1);
            this.f177886a = bVar;
            this.f177887b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f177886a.f177871d, new AbstractC89172b<TrendingMainState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.viewmodel.C79142b.C79146d.C791471 */

                /* renamed from: a */
                final /* synthetic */ C79146d f177888a;

                static {
                    Covode.recordClassIndex(92333);
                }

                {
                    this.f177888a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TrendingMainState trendingMainState) {
                    TrendingMainState trendingMainState2 = trendingMainState;
                    C89219l.m154721d(trendingMainState2, "");
                    if (trendingMainState2.getInitAwemeList().isEmpty() || !this.f177888a.f177886a.f177869b) {
                        this.f177888a.f177887b.mo59515b();
                    }
                    return C89391z.f203057a;
                }
            });
            this.f177886a.f177870c = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$g */
    static final class C79151g extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79142b f177894a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f177895b;

        static {
            Covode.recordClassIndex(92337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79151g(C79142b bVar, AbstractC39102c cVar) {
            super(1);
            this.f177894a = bVar;
            this.f177895b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            this.f177895b.aW_();
            this.f177894a.f177870c = true;
            return C89391z.f203057a;
        }
    }

    public C79142b(TrendingMainViewModel trendingMainViewModel) {
        this.f177871d = trendingMainViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.f177871d == null) {
            return false;
        }
        this.f177872f = new JediWidget();
        C23669c a = C23669c.C23671a.m44763a(fragment, fragment.getView());
        AbstractC20527q qVar = this.f177872f;
        if (qVar == null) {
            C89219l.m154710a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a.mo39102a((Widget) qVar);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        adVar.aH_();
        TrendingMainViewModel trendingMainViewModel = this.f177871d;
        if (trendingMainViewModel != null) {
            AbstractC20527q qVar = this.f177872f;
            if (qVar == null) {
                C89219l.m154710a("jediView");
            }
            ListViewModel.m38623a(trendingMainViewModel, qVar, (AbstractC20427a) null, new C79144b(new C79146d(this, adVar), new C79150f(this, adVar), new C79148e(this, adVar)), new C79145c(new C79151g(this, adVar), new C79154i(this, adVar), new C79152h(this, adVar)), 242);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$e */
    static final class C79148e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79142b f177889a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f177890b;

        static {
            Covode.recordClassIndex(92334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79148e(C79142b bVar, AbstractC39102c cVar) {
            super(2);
            this.f177889a = bVar;
            this.f177890b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Aweme> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f177889a.f177871d, new AbstractC89172b<TrendingMainState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.viewmodel.C79142b.C79148e.C791491 */

                /* renamed from: a */
                final /* synthetic */ C79148e f177891a;

                static {
                    Covode.recordClassIndex(92335);
                }

                {
                    this.f177891a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TrendingMainState trendingMainState) {
                    TrendingMainState trendingMainState2 = trendingMainState;
                    C89219l.m154721d(trendingMainState2, "");
                    this.f177891a.f177889a.f177870c = false;
                    List<Aweme> list = trendingMainState2.getSubstate().getList();
                    list.size();
                    ArrayList arrayList = new ArrayList();
                    if (this.f177891a.f177889a.f177869b) {
                        arrayList.addAll(trendingMainState2.getInitAwemeList());
                        this.f177891a.f177889a.f177868a = trendingMainState2.getInitAwemeList().size();
                        this.f177891a.f177889a.mo122948a().mo106206a(false, (List<? extends Aweme>) list, this.f177891a.f177889a.f177868a);
                        for (T t : list) {
                            if (!C79158e.m137990a(t, trendingMainState2.getInitAwemeList())) {
                                arrayList.add(t);
                            }
                        }
                    } else {
                        this.f177891a.f177889a.f177868a = 0;
                        arrayList.addAll(list);
                        this.f177891a.f177889a.mo122948a().mo106206a(true, (List<? extends Aweme>) list, this.f177891a.f177889a.f177868a);
                    }
                    arrayList.size();
                    if (!this.f177891a.f177889a.f177869b) {
                        this.f177891a.f177889a.f177871d.f177846e.setValue(false);
                    }
                    this.f177891a.f177890b.mo59512a(arrayList, trendingMainState2.getSubstate().getHasMore().f48382a);
                    this.f177891a.f177889a.f177869b = false;
                    this.f177891a.f177889a.f177871d.f177849k = false;
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$h */
    static final class C79152h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79142b f177896a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f177897b;

        static {
            Covode.recordClassIndex(92338);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79152h(C79142b bVar, AbstractC39102c cVar) {
            super(2);
            this.f177896a = bVar;
            this.f177897b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Aweme> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f177896a.f177871d, new AbstractC89172b<TrendingMainState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.viewmodel.C79142b.C79152h.C791531 */

                /* renamed from: a */
                final /* synthetic */ C79152h f177898a;

                static {
                    Covode.recordClassIndex(92339);
                }

                {
                    this.f177898a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TrendingMainState trendingMainState) {
                    TrendingMainState trendingMainState2 = trendingMainState;
                    C89219l.m154721d(trendingMainState2, "");
                    this.f177898a.f177896a.f177870c = false;
                    trendingMainState2.getSubstate().getList().size();
                    List<Aweme> list = trendingMainState2.getSubstate().getList();
                    this.f177898a.f177896a.mo122948a().mo106206a(false, (List<? extends Aweme>) list, this.f177898a.f177896a.f177868a);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(list);
                    arrayList.size();
                    this.f177898a.f177897b.mo59517b(arrayList, trendingMainState2.getSubstate().getHasMore().f48382a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$i */
    static final class C79154i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79142b f177899a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f177900b;

        static {
            Covode.recordClassIndex(92340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79154i(C79142b bVar, AbstractC39102c cVar) {
            super(2);
            this.f177899a = bVar;
            this.f177900b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            AbstractC39102c cVar = this.f177900b;
            if (!(th2 instanceof Exception)) {
                th2 = null;
            }
            cVar.mo59522c((Exception) th2);
            this.f177899a.f177870c = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.viewmodel.b$f */
    static final class C79150f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79142b f177892a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f177893b;

        static {
            Covode.recordClassIndex(92336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79150f(C79142b bVar, AbstractC39102c cVar) {
            super(2);
            this.f177892a = bVar;
            this.f177893b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            this.f177892a.f177871d.f177846e.setValue(false);
            AbstractC39102c cVar = this.f177893b;
            if (!(th2 instanceof Exception)) {
                th2 = null;
            }
            cVar.mo59516b((Exception) th2);
            this.f177892a.f177870c = false;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        TrendingMainViewModel trendingMainViewModel;
        C89219l.m154721d(bVar, "");
        if (i == 1) {
            TrendingMainViewModel trendingMainViewModel2 = this.f177871d;
            if (trendingMainViewModel2 != null) {
                trendingMainViewModel2.mo33757k();
            }
        } else if (i == 4 && (trendingMainViewModel = this.f177871d) != null) {
            trendingMainViewModel.mo33758l();
        }
    }
}
