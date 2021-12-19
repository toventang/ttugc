package com.p2082ss.android.ugc.aweme.discover.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42173e;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchMusicViewModel_MiddlewareBinding;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel */
public final class SearchMusicViewModel extends JediViewModel<SearchMusicListState> {

    /* renamed from: b */
    public static final C43002a f100256b = new C43002a((byte) 0);

    /* renamed from: a */
    public final ListMiddleware<SearchMusicListState, SearchMusic, C42173e> f100257a = new ListMiddleware<>(new C43005b(this), new C43007c(this), null, null, 12);

    static {
        Covode.recordClassIndex(51139);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$a */
    public static final class C43002a {
        static {
            Covode.recordClassIndex(51140);
        }

        private C43002a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$a$b */
        public static final class C43004b extends AbstractC89220m implements AbstractC89172b<SearchMusicListState, SearchMusicListState> {

            /* renamed from: a */
            public static final C43004b f100258a = new C43004b();

            static {
                Covode.recordClassIndex(51142);
            }

            C43004b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ SearchMusicListState invoke(SearchMusicListState searchMusicListState) {
                C89219l.m154721d(searchMusicListState, "");
                return searchMusicListState;
            }
        }

        public /* synthetic */ C43002a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$a$a */
        public static final class C43003a implements C1175ad.AbstractC1177b {
            static {
                Covode.recordClassIndex(51141);
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                return new SearchMusicViewModel();
            }
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ SearchMusicListState mo23027d() {
        return new SearchMusicListState(null, null, 3, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        new SearchMusicViewModel_MiddlewareBinding().binding(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$d */
    public static final class C43009d extends AbstractC89220m implements AbstractC89172b<SearchMusicListState, SearchMusicListState> {

        /* renamed from: a */
        final /* synthetic */ C42174f f100263a;

        static {
            Covode.recordClassIndex(51147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43009d(C42174f fVar) {
            super(1);
            this.f100263a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SearchMusicListState invoke(SearchMusicListState searchMusicListState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            C89219l.m154721d(searchMusicListState2, "");
            return SearchMusicListState.copy$default(searchMusicListState2, null, this.f100263a, 1, null);
        }
    }

    /* renamed from: a */
    public final void mo73194a(C42174f fVar) {
        C89219l.m154721d(fVar, "");
        mo33689c(new C43009d(fVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$b */
    static final class C43005b extends AbstractC89220m implements AbstractC89172b<SearchMusicListState, AbstractC88979t<C89378p<? extends List<? extends SearchMusic>, ? extends C42173e>>> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicViewModel f100259a;

        static {
            Covode.recordClassIndex(51143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43005b(SearchMusicViewModel searchMusicViewModel) {
            super(1);
            this.f100259a = searchMusicViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends SearchMusic>, ? extends C42173e>> invoke(SearchMusicListState searchMusicListState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            C89219l.m154721d(searchMusicListState2, "");
            AbstractC88979t<R> d = SearchMusicViewModel.m85833a(searchMusicListState2.getSearchParam(), searchMusicListState2.getListState().getPayload().f98282c, 0).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.C43005b.C430061 */

                /* renamed from: a */
                final /* synthetic */ C43005b f100260a;

                static {
                    Covode.recordClassIndex(51144);
                }

                {
                    this.f100260a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    String imprId;
                    SearchMusicList searchMusicList = (SearchMusicList) obj;
                    String str = "";
                    C89219l.m154721d(searchMusicList, str);
                    SearchMusicViewModel.m85834a(searchMusicList);
                    List<SearchMusic> list = searchMusicList.searchMusicList;
                    LogPbBean logPbBean = searchMusicList.logPb;
                    if (!(logPbBean == null || (imprId = logPbBean.getImprId()) == null)) {
                        str = imprId;
                    }
                    return C89387v.m154943a(list, new C42173e(str, searchMusicList.hasMore, searchMusicList.cursor, searchMusicList));
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel$c */
    static final class C43007c extends AbstractC89220m implements AbstractC89172b<SearchMusicListState, AbstractC88979t<C89378p<? extends List<? extends SearchMusic>, ? extends C42173e>>> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicViewModel f100261a;

        static {
            Covode.recordClassIndex(51145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43007c(SearchMusicViewModel searchMusicViewModel) {
            super(1);
            this.f100261a = searchMusicViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends SearchMusic>, ? extends C42173e>> invoke(SearchMusicListState searchMusicListState) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            C89219l.m154721d(searchMusicListState2, "");
            AbstractC88979t<R> d = SearchMusicViewModel.m85833a(searchMusicListState2.getSearchParam(), searchMusicListState2.getListState().getPayload().f98282c, searchMusicListState2.getListState().getPayload().f48407b).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel.C43007c.C430081 */

                /* renamed from: a */
                final /* synthetic */ C43007c f100262a;

                static {
                    Covode.recordClassIndex(51146);
                }

                {
                    this.f100262a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    String imprId;
                    SearchMusicList searchMusicList = (SearchMusicList) obj;
                    String str = "";
                    C89219l.m154721d(searchMusicList, str);
                    SearchMusicViewModel.m85834a(searchMusicList);
                    List<SearchMusic> list = searchMusicList.searchMusicList;
                    LogPbBean logPbBean = searchMusicList.logPb;
                    if (!(logPbBean == null || (imprId = logPbBean.getImprId()) == null)) {
                        str = imprId;
                    }
                    return C89387v.m154943a(list, new C42173e(str, searchMusicList.hasMore, searchMusicList.cursor, searchMusicList));
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: a */
    public static void m85834a(SearchMusicList searchMusicList) {
        List<SearchMusic> list;
        String str;
        if (!(searchMusicList == null || (list = searchMusicList.searchMusicList) == null)) {
            for (T t : list) {
                if (!TextUtils.isEmpty(searchMusicList.getRequestId())) {
                    str = searchMusicList.getRequestId();
                } else {
                    LogPbBean logPbBean = searchMusicList.logPb;
                    if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                        str = "";
                    }
                }
                t.setRequestId(str);
            }
        }
    }

    /* renamed from: a */
    public static AbstractC88979t<SearchMusicList> m85833a(C42174f fVar, String str, int i) {
        AbstractC88979t<SearchMusicList> b = SearchApiNew.m83826a(new C42174f(fVar.f98284a, 0, null, null, fVar.f98288e, fVar.f98289f, str, null, (long) i, 20, null, fVar.f98295l, null, null, null, null, SearchApiNew.f97600c, null, null, 980110)).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }
}
