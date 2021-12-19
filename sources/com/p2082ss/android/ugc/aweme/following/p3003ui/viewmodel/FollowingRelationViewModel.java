package com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46958fw;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51104c;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51106e;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.repository.C51120c;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
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
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel */
public final class FollowingRelationViewModel extends JediViewModel<FollowingRelationState> {

    /* renamed from: f */
    public static final C51375a f118416f = new C51375a((byte) 0);

    /* renamed from: a */
    public final C51120c f118417a = new C51120c();

    /* renamed from: b */
    public boolean f118418b;

    /* renamed from: c */
    public int f118419c;

    /* renamed from: d */
    public final int f118420d;

    /* renamed from: e */
    public final ListMiddleware<FollowingRelationState, Object, C51133f> f118421e;

    static {
        Covode.recordClassIndex(60589);
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$a */
    public static final class C51375a {
        static {
            Covode.recordClassIndex(60590);
        }

        private C51375a() {
        }

        public /* synthetic */ C51375a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        ListMiddleware<FollowingRelationState, Object, C51133f> listMiddleware = this.f118421e;
        listMiddleware.mo33809a(C51392b.f118453a, C51376b.f118422a);
        mo33684a(listMiddleware);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ FollowingRelationState mo23027d() {
        return new FollowingRelationState(null, null, false, null, null, false, 0, null, null, null, 1023, null);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        mo33689c(C51388l.f118442a);
        super.onCleared();
        AbstractC88412b bVar = this.f118417a.f117957d;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f118417a.f48131a.bt_();
    }

    public FollowingRelationViewModel() {
        int i = 1;
        this.f118418b = true;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        this.f118420d = !g.isUidContactPermisioned() ? 2 : i;
        this.f118421e = new ListMiddleware<>(new C51383i(this), new C51385j(this), C51382h.f118434a, C51387k.f118441a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$d */
    public static final class C51378d extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f118426a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f118427b;

        static {
            Covode.recordClassIndex(60593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51378d(C89233z.C89234a aVar, C89233z.C89238e eVar) {
            super(1);
            this.f118426a = aVar;
            this.f118427b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            this.f118426a.element = followingRelationState2.isHotsoonHasMore();
            this.f118427b.element = (T) followingRelationState2.getHotsoonText();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$g */
    public static final class C51381g extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f118432a;

        /* renamed from: b */
        final /* synthetic */ String f118433b;

        static {
            Covode.recordClassIndex(60596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51381g(FollowingRelationViewModel followingRelationViewModel, String str) {
            super(1);
            this.f118432a = followingRelationViewModel;
            this.f118433b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            this.f118432a.f118421e.mo33730a(0, new C51106e(7, followingRelationState2.isSelf(), this.f118433b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$m */
    static final class C51389m extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ List f118443a;

        static {
            Covode.recordClassIndex(60604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51389m(List list) {
            super(1);
            this.f118443a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, this.f118443a, null, false, 0, null, null, null, 1015, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$f */
    public static final class C51380f extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f118431a;

        static {
            Covode.recordClassIndex(60595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51380f(FollowingRelationViewModel followingRelationViewModel) {
            super(1);
            this.f118431a = followingRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            this.f118431a.f118421e.mo33730a(followingRelationState2.getListState().getList().size(), new C51106e(9, followingRelationState2.isSelf()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$i */
    static final class C51383i extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>>> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f118435a;

        static {
            Covode.recordClassIndex(60598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51383i(FollowingRelationViewModel followingRelationViewModel) {
            super(1);
            this.f118435a = followingRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>> invoke(FollowingRelationState followingRelationState) {
            final FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            this.f118435a.f118418b = true;
            C51120c cVar = this.f118435a.f118417a;
            String userId = followingRelationState2.getUserId();
            String secUserId = followingRelationState2.getSecUserId();
            followingRelationState2.isSelf();
            AbstractC88979t<R> d = cVar.mo86538a(userId, secUserId, 0, 0, FollowingRelationViewModel.m95739a(true, true), this.f118435a.f118420d, 0, this.f118435a.f118419c).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowingRelationViewModel.C51383i.C513841 */

                /* renamed from: a */
                final /* synthetic */ C51383i f118436a;

                static {
                    Covode.recordClassIndex(60599);
                }

                {
                    this.f118436a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    C51104c cVar = (C51104c) obj;
                    C89219l.m154721d(cVar, "");
                    this.f118436a.f118435a.mo86784a(cVar, true);
                    this.f118436a.f118435a.mo86783a(cVar);
                    List<User> list = cVar.f117918a;
                    C89219l.m154716b(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        C89219l.m154716b(t, "");
                        t.setRequestId(cVar.extra.logid);
                        arrayList.add(new C51108g(0, t));
                    }
                    boolean z = cVar.f117920c;
                    int i3 = cVar.f117923f;
                    long j = cVar.f117922e;
                    boolean z2 = cVar.f117924g;
                    if (this.f118436a.f118435a.f118418b) {
                        i = 1;
                    } else {
                        i = 1 + followingRelationState2.getListState().getPayload().f117970e;
                    }
                    List<User> list2 = cVar.f117918a;
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

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$l */
    static final class C51388l extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a */
        public static final C51388l f118442a = new C51388l();

        static {
            Covode.recordClassIndex(60603);
        }

        C51388l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, null, ListState.copy$default(followingRelationState2.getListState(), null, null, new C20372aj(C89086z.INSTANCE), new C20372aj(C89086z.INSTANCE), null, 19, null), false, 0, null, null, null, 1007, null);
        }
    }

    /* renamed from: a */
    public final void mo86783a(C51104c cVar) {
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        mo33687b_(new C51378d(aVar, eVar));
        mo33689c(new C51379e(aVar, cVar, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$e */
    public static final class C51379e extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f118428a;

        /* renamed from: b */
        final /* synthetic */ C51104c f118429b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f118430c;

        static {
            Covode.recordClassIndex(60594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51379e(C89233z.C89234a aVar, C51104c cVar, C89233z.C89238e eVar) {
            super(1);
            this.f118428a = aVar;
            this.f118429b = cVar;
            this.f118430c = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            boolean z;
            T t;
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            if (this.f118428a.element || this.f118429b.mo86513a()) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f118429b.f117925h;
            String str = this.f118429b.f117926i;
            if (str == null || str.length() == 0) {
                t = this.f118430c.element;
            } else {
                t = this.f118429b.f117926i;
            }
            C89219l.m154716b(t, "");
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, null, null, z, i, t, null, null, 799, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$j */
    static final class C51385j extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>>> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f118438a;

        static {
            Covode.recordClassIndex(60600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51385j(FollowingRelationViewModel followingRelationViewModel) {
            super(1);
            this.f118438a = followingRelationViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>> invoke(FollowingRelationState followingRelationState) {
            final FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            this.f118438a.f118418b = false;
            C51120c cVar = this.f118438a.f118417a;
            String userId = followingRelationState2.getUserId();
            String secUserId = followingRelationState2.getSecUserId();
            long j = followingRelationState2.getListState().getPayload().f117968c;
            int i = followingRelationState2.getListState().getPayload().f48407b;
            followingRelationState2.isSelf();
            AbstractC88979t<R> d = cVar.mo86538a(userId, secUserId, j, i, FollowingRelationViewModel.m95739a(false, followingRelationState2.getListState().getPayload().f117969d), this.f118438a.f118420d, followingRelationState2.getVcdCount(), this.f118438a.f118419c).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowingRelationViewModel.C51385j.C513861 */

                /* renamed from: a */
                final /* synthetic */ C51385j f118439a;

                static {
                    Covode.recordClassIndex(60601);
                }

                {
                    this.f118439a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    C51104c cVar = (C51104c) obj;
                    C89219l.m154721d(cVar, "");
                    this.f118439a.f118438a.mo86783a(cVar);
                    this.f118439a.f118438a.mo86784a(cVar, false);
                    List<User> list = cVar.f117918a;
                    C89219l.m154716b(list, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        C89219l.m154716b(t, "");
                        arrayList.add(new C51108g(0, t));
                    }
                    boolean z = cVar.f117920c;
                    int i3 = cVar.f117923f;
                    long j = cVar.f117922e;
                    boolean z2 = cVar.f117924g;
                    if (this.f118439a.f118438a.f118418b) {
                        i = 1;
                    } else {
                        i = followingRelationState2.getListState().getPayload().f117970e + 1;
                    }
                    List<User> list2 = cVar.f117918a;
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
    public final void mo86785a(List<? extends Object> list) {
        C89219l.m154721d(list, "");
        mo33689c(new C51389m(list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$c */
    public static final class C51377c extends AbstractC89220m implements AbstractC89172b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ C51104c f118423a;

        /* renamed from: b */
        final /* synthetic */ FollowingRelationViewModel f118424b;

        /* renamed from: c */
        final /* synthetic */ boolean f118425c;

        static {
            Covode.recordClassIndex(60592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51377c(C51104c cVar, FollowingRelationViewModel followingRelationViewModel, boolean z) {
            super(1);
            this.f118423a = cVar;
            this.f118424b = followingRelationViewModel;
            this.f118425c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            List<User> f;
            FollowingRelationState followingRelationState2 = followingRelationState;
            C89219l.m154721d(followingRelationState2, "");
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (!this.f118425c) {
                hashMap.putAll(followingRelationState2.getUnreadCountMap());
                arrayList.addAll(followingRelationState2.getUnreadUidList());
            }
            List<User> list = this.f118423a.f117918a;
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
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, null, null, false, 0, null, hashMap, arrayList, 255, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$h */
    static final class C51382h extends AbstractC89220m implements AbstractC89183m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C51382h f118434a = new C51382h();

        static {
            Covode.recordClassIndex(60597);
        }

        C51382h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ List<? extends Object> invoke(List<? extends Object> list, List<? extends Object> list2) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            return list2;
        }
    }

    /* renamed from: a */
    public static int m95739a(boolean z, boolean z2) {
        if (z) {
            if (C46958fw.m90244a()) {
                return 2;
            }
            return 1;
        } else if (z2) {
            return 2;
        } else {
            return 1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$b */
    static final class C51376b extends AbstractC89220m implements AbstractC89183m<FollowingRelationState, ListState<Object, C51133f>, FollowingRelationState> {

        /* renamed from: a */
        public static final C51376b f118422a = new C51376b();

        static {
            Covode.recordClassIndex(60591);
        }

        C51376b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ FollowingRelationState invoke(FollowingRelationState followingRelationState, ListState<Object, C51133f> listState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            ListState<Object, C51133f> listState2 = listState;
            C89219l.m154721d(followingRelationState2, "");
            C89219l.m154721d(listState2, "");
            return FollowingRelationState.copy$default(followingRelationState2, null, null, false, null, listState2, false, 0, null, null, null, 1007, null);
        }
    }

    /* renamed from: a */
    public final void mo86784a(C51104c cVar, boolean z) {
        if (cVar != null) {
            mo33689c(new C51377c(cVar, this, z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$k */
    static final class C51387k extends AbstractC89220m implements AbstractC89183m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C51387k f118441a = new C51387k();

        static {
            Covode.recordClassIndex(60602);
        }

        C51387k() {
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
    public final boolean mo86786a(boolean z, int i, int i2) {
        if (!z || (i != 1 ? i != 2 || i2 >= 5 : i2 >= 15)) {
            return false;
        }
        this.f118421e.loadMore();
        return true;
    }
}
