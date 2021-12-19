package com.p2082ss.android.ugc.aweme.detail.operators;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.ext.list.AbstractC20427a;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.C20442b;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.widget.C23669c;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.music.p3481ui.viewmodel.MusicAwemeListState;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.b */
public final class C41271b implements AbstractC41262aa {

    /* renamed from: a */
    public boolean f96358a;

    /* renamed from: b */
    public final CommonListViewModel<Object, MusicAwemeListState> f96359b;

    /* renamed from: c */
    private AbstractC20527q f96360c;

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$a */
    public static final class C41272a extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {
        public static final C41272a INSTANCE = new C41272a();

        static {
            Covode.recordClassIndex(49160);
        }

        public C41272a() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final void invoke(AbstractC20477i iVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$b */
    public static final class C41273b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {
        public static final C41273b INSTANCE = new C41273b();

        static {
            Covode.recordClassIndex(49161);
        }

        public C41273b() {
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
        Covode.recordClassIndex(49159);
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
        return 4000;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$c */
    public static final class C41274c implements AbstractC20443c<Object, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f96361a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f96362b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f96363c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f96364d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f96365e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> f96366f;

        static {
            Covode.recordClassIndex(49162);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f96364d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f96365e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> mo33775c() {
            return this.f96366f;
        }

        public C41274c(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f96361a = bVar;
            this.f96362b = mVar;
            this.f96363c = mVar2;
            this.f96364d = bVar;
            this.f96365e = mVar;
            this.f96366f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$d */
    public static final class C41275d implements AbstractC20443c<Object, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f96367a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f96368b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f96369c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f96370d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f96371e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> f96372f;

        static {
            Covode.recordClassIndex(49163);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f96370d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f96371e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> mo33775c() {
            return this.f96372f;
        }

        public C41275d(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f96367a = bVar;
            this.f96368b = mVar;
            this.f96369c = mVar2;
            this.f96370d = bVar;
            this.f96371e = mVar;
            this.f96372f = mVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final /* bridge */ /* synthetic */ Object getViewModel() {
        return this.f96359b;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        return this.f96358a;
    }

    public C41271b(CommonListViewModel<Object, MusicAwemeListState> commonListViewModel) {
        this.f96359b = commonListViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$f */
    static final class C41278f extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41271b f96376a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f96377b;

        static {
            Covode.recordClassIndex(49166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41278f(C41271b bVar, AbstractC39102c cVar) {
            super(1);
            this.f96376a = bVar;
            this.f96377b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f96376a.f96359b, new AbstractC89172b<MusicAwemeListState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.detail.operators.C41271b.C41278f.C412791 */

                /* renamed from: a */
                final /* synthetic */ C41278f f96378a;

                static {
                    Covode.recordClassIndex(49167);
                }

                {
                    this.f96378a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(MusicAwemeListState musicAwemeListState) {
                    C89219l.m154721d(musicAwemeListState, "");
                    this.f96378a.f96377b.aW_();
                    this.f96378a.f96376a.f96358a = true;
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        CommonListViewModel<Object, MusicAwemeListState> commonListViewModel = this.f96359b;
        if (commonListViewModel != null) {
            AbstractC20527q qVar = this.f96360c;
            if (qVar == null) {
                C89219l.m154710a("jediView");
            }
            ListViewModel.m38623a(commonListViewModel, qVar, (AbstractC20427a) null, new C41274c(C41272a.INSTANCE, C41273b.INSTANCE, new C41276e(this, adVar)), new C41275d(new C41278f(this, adVar), new C41282h(this, adVar), new C41280g(this, adVar)), 242);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.f96359b == null) {
            return false;
        }
        this.f96360c = new JediWidget();
        View view = fragment.getView();
        if (view == null) {
            C89219l.m154715b();
        }
        C23669c a = C23669c.C23671a.m44763a(fragment, view);
        AbstractC20527q qVar = this.f96360c;
        if (qVar == null) {
            C89219l.m154710a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a.mo39102a((Widget) qVar);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$e */
    static final class C41276e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41271b f96373a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f96374b;

        static {
            Covode.recordClassIndex(49164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41276e(C41271b bVar, AbstractC39102c cVar) {
            super(2);
            this.f96373a = bVar;
            this.f96374b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f96373a.f96359b, new AbstractC89172b<MusicAwemeListState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.detail.operators.C41271b.C41276e.C412771 */

                /* renamed from: a */
                final /* synthetic */ C41276e f96375a;

                static {
                    Covode.recordClassIndex(49165);
                }

                {
                    this.f96375a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(MusicAwemeListState musicAwemeListState) {
                    MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                    C89219l.m154721d(musicAwemeListState2, "");
                    C20442b bVar = musicAwemeListState2.getSubstate().getPayload().f48406a;
                    List<Object> list = musicAwemeListState2.getSubstate().getList();
                    Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                    this.f96375a.f96374b.mo59512a(list, bVar.f48382a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$g */
    static final class C41280g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41271b f96379a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f96380b;

        static {
            Covode.recordClassIndex(49168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41280g(C41271b bVar, AbstractC39102c cVar) {
            super(2);
            this.f96379a = bVar;
            this.f96380b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f96379a.f96359b, new AbstractC89172b<MusicAwemeListState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.detail.operators.C41271b.C41280g.C412811 */

                /* renamed from: a */
                final /* synthetic */ C41280g f96381a;

                static {
                    Covode.recordClassIndex(49169);
                }

                {
                    this.f96381a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(MusicAwemeListState musicAwemeListState) {
                    MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                    C89219l.m154721d(musicAwemeListState2, "");
                    C20442b bVar = musicAwemeListState2.getSubstate().getPayload().f48406a;
                    List<Object> list = musicAwemeListState2.getSubstate().getList();
                    Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                    this.f96381a.f96380b.mo59517b(list, bVar.f48382a);
                    return C89391z.f203057a;
                }
            });
            this.f96379a.f96358a = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$h */
    static final class C41282h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41271b f96382a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39102c f96383b;

        static {
            Covode.recordClassIndex(49170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41282h(C41271b bVar, AbstractC39102c cVar) {
            super(2);
            this.f96382a = bVar;
            this.f96383b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            this.f96383b.mo59522c(new Exception(th2));
            this.f96382a.f96358a = false;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        CommonListViewModel<Object, MusicAwemeListState> commonListViewModel;
        C89219l.m154721d(bVar, "");
        if (i == 1) {
            CommonListViewModel<Object, MusicAwemeListState> commonListViewModel2 = this.f96359b;
            if (commonListViewModel2 != null) {
                commonListViewModel2.mo33757k();
            }
        } else if (i == 4 && (commonListViewModel = this.f96359b) != null) {
            commonListViewModel.mo33758l();
        }
    }
}
