package com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46958fw;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51103b;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51106e;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.repository.C51111b;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.permission.C80619d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel */
public final class FollowerRelationViewModel extends JediViewModel<FollowerRelationState> {

    /* renamed from: d */
    public static final C51358a f118385d = new C51358a((byte) 0);

    /* renamed from: a */
    public final C51111b f118386a = new C51111b();

    /* renamed from: b */
    public boolean f118387b = true;

    /* renamed from: c */
    public final ListMiddleware<FollowerRelationState, Object, C51133f> f118388c = new ListMiddleware<>(new C51368j(this), new C51370k(this), null, C51372l.f118412a, 4);

    static {
        Covode.recordClassIndex(60570);
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$a */
    public static final class C51358a {
        static {
            Covode.recordClassIndex(60571);
        }

        private C51358a() {
        }

        public /* synthetic */ C51358a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        ListMiddleware<FollowerRelationState, Object, C51133f> listMiddleware = this.f118388c;
        listMiddleware.mo33809a(C51391a.f118452a, C51359b.f118389a);
        mo33684a(listMiddleware);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f118386a.f48131a.bt_();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ FollowerRelationState mo23027d() {
        return new FollowerRelationState(null, null, null, null, false, 0, null, null, null, 511, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$d */
    public static final class C51361d extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f118393a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f118394b;

        static {
            Covode.recordClassIndex(60574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51361d(C89233z.C89234a aVar, C89233z.C89238e eVar) {
            super(1);
            this.f118393a = aVar;
            this.f118394b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            this.f118393a.element = followerRelationState2.isHotsoonHasMore();
            this.f118394b.element = (T) followerRelationState2.getHotsoonText();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$n */
    public static final class C51374n extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ List f118415a;

        static {
            Covode.recordClassIndex(60587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51374n(List list) {
            super(1);
            this.f118415a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            return FollowerRelationState.copy$default(followerRelationState2, null, null, this.f118415a, null, false, 0, null, null, null, 507, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$f */
    public static final class C51363f extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f118398a;

        /* renamed from: b */
        final /* synthetic */ String f118399b;

        static {
            Covode.recordClassIndex(60576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51363f(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.f118398a = followerRelationViewModel;
            this.f118399b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            final ArrayList arrayList = new ArrayList();
            String userId = followerRelationState2.getUserId();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            arrayList.add(new C51106e(8, TextUtils.equals(userId, g.getCurUserId()), this.f118399b));
            this.f118398a.mo33689c(new AbstractC89172b<FollowerRelationState, FollowerRelationState>() {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationViewModel.C51363f.C513641 */

                static {
                    Covode.recordClassIndex(60577);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    C89219l.m154721d(followerRelationState2, "");
                    return FollowerRelationState.copy$default(followerRelationState2, null, null, null, ListState.copy$default(followerRelationState2.getListState(), null, arrayList, null, null, null, 29, null), false, 0, null, null, null, 503, null);
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$h */
    static final class C51366h extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f118403a;

        /* renamed from: b */
        final /* synthetic */ String f118404b;

        static {
            Covode.recordClassIndex(60579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51366h(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.f118403a = followerRelationViewModel;
            this.f118404b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            ListMiddleware<FollowerRelationState, Object, C51133f> listMiddleware = this.f118403a.f118388c;
            int size = followerRelationState2.getListState().getList().size();
            String userId = followerRelationState2.getUserId();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            listMiddleware.mo33730a(size, new C51106e(11, TextUtils.equals(userId, g.getCurUserId()), this.f118404b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$i */
    public static final class C51367i extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f118405a;

        static {
            Covode.recordClassIndex(60580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51367i(FollowerRelationViewModel followerRelationViewModel) {
            super(1);
            this.f118405a = followerRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            ListMiddleware<FollowerRelationState, Object, C51133f> listMiddleware = this.f118405a.f118388c;
            int size = followerRelationState2.getListState().getList().size();
            String userId = followerRelationState2.getUserId();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            listMiddleware.mo33730a(size, new C51106e(10, TextUtils.equals(userId, g.getCurUserId())));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$j */
    static final class C51368j extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>>> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f118406a;

        static {
            Covode.recordClassIndex(60581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51368j(FollowerRelationViewModel followerRelationViewModel) {
            super(1);
            this.f118406a = followerRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>> invoke(FollowerRelationState followerRelationState) {
            final FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            this.f118406a.f118387b = true;
            AbstractC88979t<R> d = this.f118406a.f118386a.mo86529a(followerRelationState2.getUserId(), followerRelationState2.getSecUserId(), 0, 0, FollowerRelationViewModel.m95732a(true, true), C80619d.m139776a(), 0).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationViewModel.C51368j.C513691 */

                /* renamed from: a */
                final /* synthetic */ C51368j f118407a;

                static {
                    Covode.recordClassIndex(60582);
                }

                {
                    this.f118407a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    C51103b bVar = (C51103b) obj;
                    C89219l.m154721d(bVar, "");
                    this.f118407a.f118406a.mo86755a(bVar);
                    this.f118407a.f118406a.mo86756a(bVar, true);
                    List<User> list = bVar.f117906a;
                    C89219l.m154716b(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        C89219l.m154716b(t, "");
                        t.setRequestId(bVar.extra.logid);
                        arrayList.add(new C51108g(1, t));
                    }
                    boolean z = bVar.f117908c;
                    int i3 = bVar.f117912g;
                    long j = bVar.f117910e;
                    boolean z2 = bVar.f117913h;
                    if (this.f118407a.f118406a.f118387b) {
                        i = 1;
                    } else {
                        i = 1 + followerRelationState2.getListState().getPayload().f117970e;
                    }
                    List<User> list2 = bVar.f117906a;
                    if (list2 != null) {
                        i2 = list2.size();
                    } else {
                        i2 = 0;
                    }
                    return C89387v.m154943a(arrayList, new C51133f(z, i3, j, z2, i, i2));
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: a */
    public final void mo86755a(C51103b bVar) {
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        mo33687b_(new C51361d(aVar, eVar));
        mo33689c(new C51362e(aVar, bVar, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$e */
    public static final class C51362e extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f118395a;

        /* renamed from: b */
        final /* synthetic */ C51103b f118396b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f118397c;

        static {
            Covode.recordClassIndex(60575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51362e(C89233z.C89234a aVar, C51103b bVar, C89233z.C89238e eVar) {
            super(1);
            this.f118395a = aVar;
            this.f118396b = bVar;
            this.f118397c = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState) {
            boolean z;
            T t;
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            if (this.f118395a.element || this.f118396b.f117915j == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f118396b.f117917l;
            String str = this.f118396b.f117916k;
            if (str == null || str.length() == 0) {
                t = this.f118397c.element;
            } else {
                t = this.f118396b.f117916k;
            }
            C89219l.m154716b(t, "");
            return FollowerRelationState.copy$default(followerRelationState2, null, null, null, null, z, i, t, null, null, 399, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$g */
    public static final class C51365g extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f118401a;

        /* renamed from: b */
        final /* synthetic */ String f118402b;

        static {
            Covode.recordClassIndex(60578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51365g(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.f118401a = followerRelationViewModel;
            this.f118402b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            ListMiddleware<FollowerRelationState, Object, C51133f> listMiddleware = this.f118401a.f118388c;
            int size = followerRelationState2.getListState().getList().size();
            String userId = followerRelationState2.getUserId();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String userId2 = followerRelationState2.getUserId();
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            List b = C89070n.m154522b(new C51106e(11, TextUtils.equals(userId, g.getCurUserId()), this.f118402b), new C51106e(10, TextUtils.equals(userId2, g2.getCurUserId())));
            C89219l.m154719c(b, "");
            listMiddleware.mo33807a(new ListMiddleware.C20401d(listMiddleware, size, b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$k */
    static final class C51370k extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>>> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f118409a;

        static {
            Covode.recordClassIndex(60583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51370k(FollowerRelationViewModel followerRelationViewModel) {
            super(1);
            this.f118409a = followerRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>> invoke(FollowerRelationState followerRelationState) {
            final FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            this.f118409a.f118387b = false;
            AbstractC88979t<R> d = this.f118409a.f118386a.mo86529a(followerRelationState2.getUserId(), followerRelationState2.getSecUserId(), followerRelationState2.getListState().getPayload().f117968c, followerRelationState2.getListState().getPayload().f48407b, FollowerRelationViewModel.m95732a(false, followerRelationState2.getListState().getPayload().f117969d), C80619d.m139776a(), followerRelationState2.getVcdCount()).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationViewModel.C51370k.C513711 */

                /* renamed from: a */
                final /* synthetic */ C51370k f118410a;

                static {
                    Covode.recordClassIndex(60584);
                }

                {
                    this.f118410a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    C51103b bVar = (C51103b) obj;
                    C89219l.m154721d(bVar, "");
                    this.f118410a.f118409a.mo86755a(bVar);
                    this.f118410a.f118409a.mo86756a(bVar, false);
                    List<User> list = bVar.f117906a;
                    C89219l.m154716b(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        C89219l.m154716b(t, "");
                        arrayList.add(new C51108g(1, t));
                    }
                    boolean z = bVar.f117908c;
                    int i3 = bVar.f117912g;
                    long j = bVar.f117910e;
                    boolean z2 = bVar.f117913h;
                    if (this.f118410a.f118409a.f118387b) {
                        i = 1;
                    } else {
                        i = 1 + followerRelationState2.getListState().getPayload().f117970e;
                    }
                    List<User> list2 = bVar.f117906a;
                    if (list2 != null) {
                        i2 = list2.size();
                    } else {
                        i2 = 0;
                    }
                    return C89387v.m154943a(arrayList, new C51133f(z, i3, j, z2, i, i2));
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$m */
    public static final class C51373m extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f118413a;

        /* renamed from: b */
        final /* synthetic */ String f118414b;

        static {
            Covode.recordClassIndex(60586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51373m(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.f118413a = followerRelationViewModel;
            this.f118414b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            Iterator<Object> it = followerRelationState2.getListState().getList().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(next instanceof C51108g) || !C89219l.m154714a((Object) ((C51108g) next).f117934b.getUid(), (Object) this.f118414b)) {
                    i++;
                } else if (i != -1) {
                    List<? extends Object> g = C89070n.m154585g((Collection) followerRelationState2.getListState().getList());
                    g.remove(i);
                    this.f118413a.f118388c.mo33732a(g);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo86757a(String str) {
        C89219l.m154721d(str, "");
        mo33687b_(new C51366h(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$c */
    public static final class C51360c extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ C51103b f118390a;

        /* renamed from: b */
        final /* synthetic */ FollowerRelationViewModel f118391b;

        /* renamed from: c */
        final /* synthetic */ boolean f118392c;

        static {
            Covode.recordClassIndex(60573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51360c(C51103b bVar, FollowerRelationViewModel followerRelationViewModel, boolean z) {
            super(1);
            this.f118390a = bVar;
            this.f118391b = followerRelationViewModel;
            this.f118392c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState) {
            List<User> f;
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (!this.f118392c) {
                hashMap.putAll(followerRelationState2.getUnreadCountMap());
                arrayList.addAll(followerRelationState2.getUnreadUidList());
            }
            List<User> list = this.f118390a.f117906a;
            if (!(list == null || (f = C89070n.m154580f((Iterable) list)) == null)) {
                for (User user : f) {
                    if (user.getUnReadVideoInfo() != null) {
                        user.getUid();
                        user.getUnReadVideoCount();
                        if (user.getUnReadVideoCount() > 0) {
                            String uid = user.getUid();
                            C89219l.m154716b(uid, "");
                            hashMap.put(uid, Integer.valueOf(user.getUnReadVideoCount()));
                            String uid2 = user.getUid();
                            C89219l.m154716b(uid2, "");
                            arrayList.add(uid2);
                        }
                    }
                }
            }
            return FollowerRelationState.copy$default(followerRelationState2, null, null, null, null, false, 0, null, hashMap, arrayList, 127, null);
        }
    }

    /* renamed from: a */
    public final void mo86756a(C51103b bVar, boolean z) {
        if (bVar != null) {
            mo33689c(new C51360c(bVar, this, z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$b */
    static final class C51359b extends AbstractC89220m implements AbstractC89183m<FollowerRelationState, ListState<Object, C51133f>, FollowerRelationState> {

        /* renamed from: a */
        public static final C51359b f118389a = new C51359b();

        static {
            Covode.recordClassIndex(60572);
        }

        C51359b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState, ListState<Object, C51133f> listState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            ListState<Object, C51133f> listState2 = listState;
            C89219l.m154721d(followerRelationState2, "");
            C89219l.m154721d(listState2, "");
            return FollowerRelationState.copy$default(followerRelationState2, null, null, null, listState2, false, 0, null, null, null, 503, null);
        }
    }

    /* renamed from: a */
    public static int m95732a(boolean z, boolean z2) {
        if (C46958fw.m90244a()) {
            if (z) {
                return 2;
            }
        } else if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        return 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$l */
    static final class C51372l extends AbstractC89220m implements AbstractC89183m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C51372l f118412a = new C51372l();

        static {
            Covode.recordClassIndex(60585);
        }

        C51372l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<? extends Object> invoke(List<? extends Object> list, List<? extends Object> list2) {
            List<? extends Object> list3 = list;
            List<? extends Object> list4 = list2;
            C89219l.m154721d(list3, "");
            C89219l.m154721d(list4, "");
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (T t : list3) {
                if (t instanceof C51108g) {
                    T t2 = t;
                    if (hashSet.add(t2.f117934b.getUid())) {
                        arrayList.add(C51108g.m95538a(t2, i));
                        i++;
                    }
                }
                arrayList.add(t);
            }
            for (T t3 : list4) {
                Objects.requireNonNull(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.following.model.RelationUser");
                T t4 = t3;
                if (hashSet.add(t4.f117934b.getUid())) {
                    arrayList.add(C51108g.m95538a(t4, i));
                    i++;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final boolean mo86758a(boolean z, int i, int i2) {
        if (!z || (i != 1 ? i != 2 || i2 >= 5 : i2 >= 15)) {
            return false;
        }
        this.f118388c.loadMore();
        return true;
    }
}
