package com.p2082ss.android.ugc.aweme.discover.viewmodel;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p2082ss.android.ugc.aweme.discover.repo.C42499a;
import com.p2082ss.android.ugc.aweme.discover.repo.fetcher.C42516c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel */
public final class TrendsTabViewModel extends CommonListViewModel<DiscoverSectionItem, TrendsTabState> {

    /* renamed from: e */
    public static final C43013a f100270e = new C43013a((byte) 0);

    /* renamed from: a */
    public final LiveData<SuggestWordResponse> f100271a = m85842n();

    /* renamed from: b */
    public final C42499a f100272b = new C42499a();

    /* renamed from: c */
    final List<Aweme> f100273c = new ArrayList();

    /* renamed from: d */
    public final Map<String, Aweme> f100274d = new LinkedHashMap();

    /* renamed from: f */
    private final AbstractC89244h f100275f = C89250i.m154774a(EnumC89331m.NONE, C43014b.f100276a);

    static {
        Covode.recordClassIndex(51154);
    }

    /* renamed from: n */
    private final C1213t<SuggestWordResponse> m85842n() {
        return (C1213t) this.f100275f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel$a */
    public static final class C43013a {
        static {
            Covode.recordClassIndex(51155);
        }

        private C43013a() {
        }

        public /* synthetic */ C43013a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel$b */
    static final class C43014b extends AbstractC89220m implements AbstractC89171a<C1213t<SuggestWordResponse>> {

        /* renamed from: a */
        public static final C43014b f100276a = new C43014b();

        static {
            Covode.recordClassIndex(51156);
        }

        C43014b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<SuggestWordResponse> invoke() {
            return new C1213t();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: a */
    public final AbstractC89172b<TrendsTabState, AbstractC88979t<C89378p<List<DiscoverSectionItem>, C20465o>>> mo33725a() {
        return new C43021g(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: b */
    public final AbstractC89172b<TrendsTabState, AbstractC88979t<C89378p<List<DiscoverSectionItem>, C20465o>>> mo33726b() {
        return new C43015c(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new TrendsTabState(false, null, false, null, false, false, 63, null);
    }

    /* renamed from: m */
    public final void mo73216m() {
        if (C67446h.f151111a.mo106228q()) {
            m85841a(false, true);
        }
    }

    /* renamed from: b */
    public final void mo73215b(boolean z) {
        mo33689c(new C43017d(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel$d */
    static final class C43017d extends AbstractC89220m implements AbstractC89172b<TrendsTabState, TrendsTabState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100279a;

        static {
            Covode.recordClassIndex(51159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43017d(boolean z) {
            super(1);
            this.f100279a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TrendsTabState invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            return TrendsTabState.copy$default(trendsTabState2, false, null, this.f100279a, null, false, false, 59, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel$e */
    public static final class C43018e extends AbstractC89220m implements AbstractC89172b<TrendsTabState, TrendsTabState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100280a;

        static {
            Covode.recordClassIndex(51160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43018e(boolean z) {
            super(1);
            this.f100280a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TrendsTabState invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            return TrendsTabState.copy$default(trendsTabState2, false, null, false, null, this.f100280a, false, 47, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel$h */
    public static final class C43023h extends AbstractC89220m implements AbstractC89172b<TrendsTabState, TrendsTabState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100287a;

        /* renamed from: b */
        final /* synthetic */ boolean f100288b;

        static {
            Covode.recordClassIndex(51165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43023h(boolean z, boolean z2) {
            super(1);
            this.f100287a = z;
            this.f100288b = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ TrendsTabState invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            return TrendsTabState.copy$default(trendsTabState2, this.f100287a, null, false, null, false, this.f100288b, 30, null);
        }
    }

    /* renamed from: a */
    public final void mo73214a(boolean z) {
        m85841a(z, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel$c */
    static final class C43015c extends AbstractC89220m implements AbstractC89172b<TrendsTabState, AbstractC88979t<C89378p<? extends List<? extends DiscoverSectionItem>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ TrendsTabViewModel f100277a;

        static {
            Covode.recordClassIndex(51157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43015c(TrendsTabViewModel trendsTabViewModel) {
            super(1);
            this.f100277a = trendsTabViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends DiscoverSectionItem>, ? extends C20465o>> invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            AbstractC88979t<R> d = this.f100277a.f100272b.mo72653a(new C42516c(((ListState) trendsTabState2.getSubstate()).getPayload().f48407b), false).mo143292d(C430161.f100278a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel$f */
    public static final class C43019f extends AbstractC89220m implements AbstractC89172b<TrendsTabState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TrendsTabViewModel f100281a;

        /* renamed from: b */
        final /* synthetic */ Aweme f100282b;

        static {
            Covode.recordClassIndex(51161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43019f(TrendsTabViewModel trendsTabViewModel, Aweme aweme) {
            super(1);
            this.f100281a = trendsTabViewModel;
            this.f100282b = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            Map<String, Aweme> map = this.f100281a.f100274d;
            String categoryIdBeingViewed = trendsTabState2.getCategoryIdBeingViewed();
            TrendsTabViewModel trendsTabViewModel = this.f100281a;
            Aweme aweme = this.f100282b;
            List<Aweme> list = trendsTabViewModel.f100273c;
            int indexOf = trendsTabViewModel.f100273c.indexOf(aweme) + 1;
            if (indexOf >= 0 && indexOf <= C89070n.m154517a((List) list)) {
                aweme = list.get(indexOf);
            }
            map.put(categoryIdBeingViewed, aweme);
            TrendsTabViewModel trendsTabViewModel2 = this.f100281a;
            C430201 r1 = C430201.f100283a;
            C89219l.m154719c(r1, "");
            trendsTabViewModel2.mo33689c(new ListViewModel.C20426f(trendsTabViewModel2, r1));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel$g */
    static final class C43021g extends AbstractC89220m implements AbstractC89172b<TrendsTabState, AbstractC88979t<C89378p<? extends List<? extends DiscoverSectionItem>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ TrendsTabViewModel f100284a;

        static {
            Covode.recordClassIndex(51163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43021g(TrendsTabViewModel trendsTabViewModel) {
            super(1);
            this.f100284a = trendsTabViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends DiscoverSectionItem>, ? extends C20465o>> invoke(TrendsTabState trendsTabState) {
            final TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            C42516c cVar = new C42516c(-1);
            cVar.setFromSuggestSearch(trendsTabState2.isFromSuggestSearch());
            AbstractC88979t<R> d = this.f100284a.f100272b.mo72653a(cVar, trendsTabState2.getCacheThenFetch()).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel.C43021g.C430221 */

                /* renamed from: a */
                final /* synthetic */ C43021g f100285a;

                static {
                    Covode.recordClassIndex(51164);
                }

                {
                    this.f100285a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    DiscoverSectionList discoverSectionList = (DiscoverSectionList) obj;
                    C89219l.m154721d(discoverSectionList, "");
                    if (!C67446h.f151111a.mo106228q()) {
                        return C89387v.m154943a(discoverSectionList.getSections(), new C20465o(discoverSectionList.getHasMore(), discoverSectionList.getCursor()));
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(discoverSectionList.getSections());
                    if (trendsTabState2.isFromSuggestSearch()) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(trendsTabState2.getSubstate().getList());
                        arrayList2.remove(0);
                        arrayList.addAll(arrayList2);
                    }
                    this.f100285a.f100284a.mo73213a(arrayList);
                    return C89387v.m154943a(arrayList, new C20465o(discoverSectionList.getHasMore(), discoverSectionList.getCursor()));
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r0 == null) goto L_0x006f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73213a(java.util.List<com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem> r6) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel.mo73213a(java.util.List):void");
    }

    /* renamed from: a */
    private final void m85841a(boolean z, boolean z2) {
        mo33689c(new C43023h(z, z2));
        super.mo33757k();
    }
}
