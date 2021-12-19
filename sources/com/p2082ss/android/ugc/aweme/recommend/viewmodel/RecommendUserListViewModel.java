package com.p2082ss.android.ugc.aweme.recommend.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a;
import com.p2082ss.android.ugc.aweme.p3382l.C58000a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.utils.permission.C80619d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel */
public final class RecommendUserListViewModel extends CommonListViewModel<User, RecommendUserListState> {

    /* renamed from: b */
    public static final C66747a f149940b = new C66747a((byte) 0);

    /* renamed from: a */
    public final AbstractC51500a f149941a = C66652b.f149825a.mo105653a();

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$c */
    public static final class C66749c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C66749c f149943a = new C66749c();

        static {
            Covode.recordClassIndex(78320);
        }

        C66749c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(78317);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$a */
    public static final class C66747a {
        static {
            Covode.recordClassIndex(78318);
        }

        private C66747a() {
        }

        public /* synthetic */ C66747a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    /* renamed from: j */
    public final AbstractC89183m<List<? extends User>, List<? extends User>, List<User>> mo33756j() {
        return C66753f.f149947a;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: a */
    public final AbstractC89172b<RecommendUserListState, AbstractC88979t<C89378p<List<User>, C20465o>>> mo33725a() {
        return new C66757h(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: b */
    public final AbstractC89172b<RecommendUserListState, AbstractC88979t<C89378p<List<User>, C20465o>>> mo33726b() {
        return new C66751e(this);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        mo33687b_(new C66754g(this));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new RecommendUserListState(null, null, false, 0, null, null, null, 127, null);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f149941a.f48131a.bt_();
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$d */
    public static final class C66750d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C66750d f149944a = new C66750d();

        static {
            Covode.recordClassIndex(78321);
        }

        C66750d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static List<User> m118533a(List<? extends User> list) {
        if (list != null) {
            return C89070n.m154585g((Collection) list);
        }
        return C89086z.INSTANCE;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$g */
    static final class C66754g extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f149948a;

        static {
            Covode.recordClassIndex(78325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66754g(RecommendUserListViewModel recommendUserListViewModel) {
            super(1);
            this.f149948a = recommendUserListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            this.f149948a.f149941a.mo87015a(recommendUserListState2.getRecommendUserType()).mo143289d(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel.C66754g.C667551 */

                /* renamed from: a */
                final /* synthetic */ C66754g f149949a;

                static {
                    Covode.recordClassIndex(78326);
                }

                {
                    this.f149949a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$g$1$a */
                static final class C66756a extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, RecommendUserListState> {

                    /* renamed from: a */
                    final /* synthetic */ List f149950a;

                    /* renamed from: b */
                    final /* synthetic */ C667551 f149951b;

                    static {
                        Covode.recordClassIndex(78327);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C66756a(List list, C667551 r3) {
                        super(1);
                        this.f149950a = list;
                        this.f149951b = r3;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
                        RecommendUserListState recommendUserListState2 = recommendUserListState;
                        C89219l.m154721d(recommendUserListState2, "");
                        return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState2.getSubstate(), null, RecommendUserListViewModel.m118533a(this.f149950a), null, null, null, 29, null), 63, null);
                    }
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    List<T> list = (List) ((C20169f) obj).mo33486a();
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                        for (T t : list) {
                            arrayList.add(t.f179474a);
                        }
                        this.f149949a.f149948a.mo33689c(new C66756a(arrayList, this));
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$i */
    public static final class C66759i extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C66760a f149954a;

        static {
            Covode.recordClassIndex(78330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66759i(C66760a aVar) {
            super(1);
            this.f149954a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, this.f149954a, null, 95, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$b */
    public static final class C66748b extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        public static final C66748b f149942a = new C66748b();

        static {
            Covode.recordClassIndex(78319);
        }

        C66748b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            List<User> list = recommendUserListState2.getSubstate().getList();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!(t instanceof RecommendContact)) {
                    arrayList.add(t);
                }
            }
            return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState2.getSubstate(), null, arrayList, null, null, null, 29, null), 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$e */
    static final class C66751e extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, AbstractC88979t<C89378p<? extends List<? extends User>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f149945a;

        static {
            Covode.recordClassIndex(78322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66751e(RecommendUserListViewModel recommendUserListViewModel) {
            super(1);
            this.f149945a = recommendUserListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends User>, ? extends C20465o>> invoke(RecommendUserListState recommendUserListState) {
            String userId;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            AbstractC51500a aVar = this.f149945a.f149941a;
            Integer valueOf = Integer.valueOf(recommendUserListState2.getSubstate().getPayload().f48407b);
            String str = null;
            if (recommendUserListState2.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState2.getUserId();
            }
            int recommendUserType = recommendUserListState2.getRecommendUserType();
            Integer valueOf2 = Integer.valueOf(C80619d.m139776a());
            String reportId = recommendUserListState2.getReportId();
            if (!recommendUserListState2.isMySelf()) {
                str = recommendUserListState2.getSecUserId();
            }
            AbstractC88979t<R> d = aVar.mo87017a(30, valueOf, userId, recommendUserType, 0, valueOf2, reportId, 2, str).mo143292d(C667521.f149946a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$h */
    static final class C66757h extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, AbstractC88979t<C89378p<? extends List<? extends User>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f149952a;

        static {
            Covode.recordClassIndex(78328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66757h(RecommendUserListViewModel recommendUserListViewModel) {
            super(1);
            this.f149952a = recommendUserListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends User>, ? extends C20465o>> invoke(RecommendUserListState recommendUserListState) {
            String userId;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            AbstractC51500a aVar = this.f149952a.f149941a;
            String str = null;
            if (recommendUserListState2.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState2.getUserId();
            }
            int recommendUserType = recommendUserListState2.getRecommendUserType();
            Integer valueOf = Integer.valueOf(C80619d.m139776a());
            String reportId = recommendUserListState2.getReportId();
            if (!recommendUserListState2.isMySelf()) {
                str = recommendUserListState2.getSecUserId();
            }
            AbstractC88979t<R> d = aVar.mo87017a(30, 0, userId, recommendUserType, 0, valueOf, reportId, 2, str).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel.C66757h.C667581 */

                /* renamed from: a */
                final /* synthetic */ C66757h f149953a;

                static {
                    Covode.recordClassIndex(78329);
                }

                {
                    this.f149953a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    RecommendList recommendList = (RecommendList) obj;
                    C89219l.m154721d(recommendList, "");
                    return C89387v.m154943a(RecommendUserListViewModel.m118533a(recommendList.getUserList()), new C20465o(recommendList.hasMore(), recommendList.getCursor()));
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$f */
    static final class C66753f extends AbstractC89220m implements AbstractC89183m<List<? extends User>, List<? extends User>, List<User>> {

        /* renamed from: a */
        public static final C66753f f149947a = new C66753f();

        static {
            Covode.recordClassIndex(78324);
        }

        C66753f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<User> invoke(List<? extends User> list, List<? extends User> list2) {
            List<? extends User> list3 = list;
            List<? extends User> list4 = list2;
            C89219l.m154721d(list3, "");
            C89219l.m154721d(list4, "");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list3);
            C58000a.m104814a(arrayList, list4);
            return arrayList;
        }
    }
}
