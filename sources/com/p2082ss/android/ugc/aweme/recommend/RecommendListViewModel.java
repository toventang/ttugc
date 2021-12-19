package com.p2082ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.p2351av.C34261a;
import com.p2082ss.android.ugc.aweme.p3382l.C58000a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.utils.permission.C80619d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel */
public final class RecommendListViewModel extends CommonListViewModel<User, RecommendUserListState> {

    /* renamed from: b */
    public static final C66592a f149711b = new C66592a((byte) 0);

    /* renamed from: a */
    public final AbstractC51500a f149712a = C66652b.f149825a.mo105653a();

    /* renamed from: c */
    private final AbstractC89244h f149713c = C89250i.m154773a((AbstractC89171a) C66595d.f149717a);

    /* renamed from: d */
    private final AbstractC89244h f149714d = C89250i.m154773a((AbstractC89171a) C66596e.f149718a);

    static {
        Covode.recordClassIndex(78144);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$a */
    public static final class C66592a {
        static {
            Covode.recordClassIndex(78145);
        }

        private C66592a() {
        }

        public /* synthetic */ C66592a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    /* renamed from: j */
    public final AbstractC89183m<List<? extends User>, List<? extends User>, List<User>> mo33756j() {
        return C66599g.f149721a;
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: a */
    public final AbstractC89172b<RecommendUserListState, AbstractC88979t<C89378p<List<User>, C20465o>>> mo33725a() {
        return new C66603i(this);
    }

    @Override // com.bytedance.jedi.arch.ext.list.CommonListViewModel
    /* renamed from: b */
    public final AbstractC89172b<RecommendUserListState, AbstractC88979t<C89378p<List<User>, C20465o>>> mo33726b() {
        return new C66597f(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$d */
    static final class C66595d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C66595d f149717a = new C66595d();

        static {
            Covode.recordClassIndex(78148);
        }

        C66595d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C34261a.m70045a(EnumC66622f.CONTACT));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$e */
    static final class C66596e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C66596e f149718a = new C66596e();

        static {
            Covode.recordClassIndex(78149);
        }

        C66596e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C34261a.m70045a(EnumC66622f.FACEBOOK));
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        mo33687b_(new C66600h(this));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new RecommendUserListState(null, null, false, 0, null, null, null, 127, null);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f149712a.f48131a.bt_();
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$c */
    static final class C66594c extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f149716a;

        static {
            Covode.recordClassIndex(78147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66594c(C89233z.C89234a aVar) {
            super(1);
            this.f149716a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            if (((ListState) recommendUserListState2.getSubstate()).getList().isEmpty()) {
                this.f149716a.element = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$h */
    static final class C66600h extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendListViewModel f149722a;

        static {
            Covode.recordClassIndex(78153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66600h(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.f149722a = recommendListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            this.f149722a.f149712a.mo87015a(recommendUserListState2.getRecommendUserType()).mo143289d(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.recommend.RecommendListViewModel.C66600h.C666011 */

                /* renamed from: a */
                final /* synthetic */ C66600h f149723a;

                static {
                    Covode.recordClassIndex(78154);
                }

                {
                    this.f149723a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$h$1$a */
                static final class C66602a extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, RecommendUserListState> {

                    /* renamed from: a */
                    final /* synthetic */ List f149724a;

                    /* renamed from: b */
                    final /* synthetic */ C666011 f149725b;

                    static {
                        Covode.recordClassIndex(78155);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C66602a(List list, C666011 r3) {
                        super(1);
                        this.f149724a = list;
                        this.f149725b = r3;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
                        List list;
                        RecommendUserListState recommendUserListState2 = recommendUserListState;
                        C89219l.m154721d(recommendUserListState2, "");
                        ListState<User, C20465o> substate = recommendUserListState2.getSubstate();
                        List list2 = this.f149724a;
                        if (list2 != null) {
                            list = C89070n.m154585g((Collection) list2);
                        } else {
                            list = C89086z.INSTANCE;
                        }
                        return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, null, ListState.copy$default(substate, null, list, null, null, null, 29, null), 63, null);
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
                        this.f149723a.f149722a.mo33689c(new C66602a(arrayList, this));
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$j */
    public static final class C66605j extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C66625h f149728a;

        static {
            Covode.recordClassIndex(78158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66605j(C66625h hVar) {
            super(1);
            this.f149728a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, this.f149728a, null, 95, null);
        }
    }

    /* renamed from: a */
    public final boolean mo105599a(User user) {
        C89219l.m154721d(user, "");
        AbstractC51500a aVar = this.f149712a;
        String uid = user.getUid();
        C89219l.m154716b(uid, "");
        aVar.mo87014a(uid, user.getSecUid()).mo142926c();
        mo33689c(new C66593b(user));
        C89233z.C89234a aVar2 = new C89233z.C89234a();
        aVar2.element = false;
        mo33687b_(new C66594c(aVar2));
        return aVar2.element;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$b */
    static final class C66593b extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ User f149715a;

        static {
            Covode.recordClassIndex(78146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66593b(User user) {
            super(1);
            this.f149715a = user;
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
                if (!C89219l.m154714a((Object) t.getUid(), (Object) this.f149715a.getUid())) {
                    arrayList.add(t);
                }
            }
            return RecommendUserListState.copy$default(recommendUserListState2, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState2.getSubstate(), null, arrayList, null, null, null, 29, null), 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$f */
    static final class C66597f extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, AbstractC88979t<C89378p<? extends List<? extends User>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendListViewModel f149719a;

        static {
            Covode.recordClassIndex(78150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66597f(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.f149719a = recommendListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends User>, ? extends C20465o>> invoke(RecommendUserListState recommendUserListState) {
            String userId;
            String secUserId;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            AbstractC51500a aVar = this.f149719a.f149712a;
            Integer valueOf = Integer.valueOf(recommendUserListState2.getSubstate().getPayload().f48407b);
            if (recommendUserListState2.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState2.getUserId();
            }
            int recommendUserType = recommendUserListState2.getRecommendUserType();
            Integer valueOf2 = Integer.valueOf(C80619d.m139776a());
            C61504e eVar = C61504e.C61505a.f139616a;
            C89219l.m154716b(eVar, "");
            String a = eVar.mo99159a();
            if (recommendUserListState2.isMySelf()) {
                secUserId = "0";
            } else {
                secUserId = recommendUserListState2.getSecUserId();
            }
            AbstractC88979t<R> d = aVar.mo87018b(20, valueOf, userId, recommendUserType, 0, valueOf2, a, 2, secUserId).mo143292d(C665981.f149720a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$i */
    static final class C66603i extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, AbstractC88979t<C89378p<? extends List<? extends User>, ? extends C20465o>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendListViewModel f149726a;

        static {
            Covode.recordClassIndex(78156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66603i(RecommendListViewModel recommendListViewModel) {
            super(1);
            this.f149726a = recommendListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends User>, ? extends C20465o>> invoke(RecommendUserListState recommendUserListState) {
            String userId;
            String secUserId;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            C89219l.m154721d(recommendUserListState2, "");
            AbstractC51500a aVar = this.f149726a.f149712a;
            if (recommendUserListState2.isMySelf()) {
                userId = null;
            } else {
                userId = recommendUserListState2.getUserId();
            }
            int recommendUserType = recommendUserListState2.getRecommendUserType();
            Integer valueOf = Integer.valueOf(C80619d.m139776a());
            C61504e eVar = C61504e.C61505a.f139616a;
            C89219l.m154716b(eVar, "");
            String a = eVar.mo99159a();
            if (recommendUserListState2.isMySelf()) {
                secUserId = "0";
            } else {
                secUserId = recommendUserListState2.getSecUserId();
            }
            AbstractC88979t<R> d = aVar.mo87018b(20, 0, userId, recommendUserType, 0, valueOf, a, 2, secUserId).mo143292d(C666041.f149727a);
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendListViewModel$g */
    static final class C66599g extends AbstractC89220m implements AbstractC89183m<List<? extends User>, List<? extends User>, List<User>> {

        /* renamed from: a */
        public static final C66599g f149721a = new C66599g();

        static {
            Covode.recordClassIndex(78152);
        }

        C66599g() {
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
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            C58000a.m104814a(arrayList, list3);
            return arrayList;
        }
    }
}
