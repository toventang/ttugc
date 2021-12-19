package com.p2082ss.android.ugc.aweme.notificationlive.p3537ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51104c;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51107f;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import com.p2082ss.android.ugc.aweme.notificationlive.repository.C62567d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
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

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel */
public final class PushSettingNotificationChoiceViewModel extends JediViewModel<NotificationChoiceState> {

    /* renamed from: g */
    public static final C62592a f141934g = new C62592a((byte) 0);

    /* renamed from: a */
    public final C62567d f141935a = new C62567d();

    /* renamed from: b */
    public boolean f141936b;

    /* renamed from: c */
    public final int f141937c;

    /* renamed from: d */
    public final int f141938d;

    /* renamed from: e */
    public boolean f141939e;

    /* renamed from: f */
    public final ListMiddleware<NotificationChoiceState, Object, C51133f> f141940f;

    static {
        Covode.recordClassIndex(73390);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$a */
    public static final class C62592a {
        static {
            Covode.recordClassIndex(73391);
        }

        private C62592a() {
        }

        public /* synthetic */ C62592a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        ListMiddleware<NotificationChoiceState, Object, C51133f> listMiddleware = this.f141940f;
        listMiddleware.mo33809a(C62681j.f142109a, C62593b.f141941a);
        mo33684a(listMiddleware);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        mo33689c(C62603j.f141958a);
        super.onCleared();
        this.f141935a.f48131a.bt_();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ NotificationChoiceState mo23027d() {
        return new NotificationChoiceState(null, null, false, null, false, 0, null, false, null, null, 1023, null);
    }

    public PushSettingNotificationChoiceViewModel() {
        int i = 1;
        this.f141936b = true;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        this.f141938d = !g.isUidContactPermisioned() ? 2 : i;
        this.f141940f = new ListMiddleware<>(new C62598g(this), new C62600h(this), C62597f.f141950a, C62602i.f141957a);
    }

    /* renamed from: a */
    public final boolean mo100555a(boolean z) {
        if (z) {
            this.f141940f.loadMore();
        }
        return z;
    }

    /* renamed from: b */
    public final void mo100556b(boolean z) {
        mo33689c(new C62604k(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$d */
    public static final class C62595d extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f141945a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f141946b;

        static {
            Covode.recordClassIndex(73394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62595d(C89233z.C89234a aVar, C89233z.C89238e eVar) {
            super(1);
            this.f141945a = aVar;
            this.f141946b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(NotificationChoiceState notificationChoiceState) {
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            C89219l.m154721d(notificationChoiceState2, "");
            this.f141945a.element = notificationChoiceState2.isHotsoonHasMore();
            this.f141946b.element = (T) notificationChoiceState2.getHotsoonText();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$k */
    static final class C62604k extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, NotificationChoiceState> {

        /* renamed from: a */
        final /* synthetic */ boolean f141959a;

        static {
            Covode.recordClassIndex(73403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62604k(boolean z) {
            super(1);
            this.f141959a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            C89219l.m154721d(notificationChoiceState2, "");
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, null, false, 0, null, this.f141959a, null, null, 895, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$g */
    static final class C62598g extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>>> {

        /* renamed from: a */
        final /* synthetic */ PushSettingNotificationChoiceViewModel f141951a;

        static {
            Covode.recordClassIndex(73397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62598g(PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel) {
            super(1);
            this.f141951a = pushSettingNotificationChoiceViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>> invoke(NotificationChoiceState notificationChoiceState) {
            final NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            C89219l.m154721d(notificationChoiceState2, "");
            this.f141951a.f141936b = true;
            AbstractC88979t<R> d = this.f141951a.f141935a.mo100518a(notificationChoiceState2.getUserId(), notificationChoiceState2.getSecUserId(), 0, 0, this.f141951a.f141938d, 0, this.f141951a.f141937c).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.PushSettingNotificationChoiceViewModel.C62598g.C625991 */

                /* renamed from: a */
                final /* synthetic */ C62598g f141952a;

                static {
                    Covode.recordClassIndex(73398);
                }

                {
                    this.f141952a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    C51104c cVar = (C51104c) obj;
                    C89219l.m154721d(cVar, "");
                    this.f141952a.f141951a.mo100554a(cVar, true);
                    this.f141952a.f141951a.mo100553a(cVar);
                    boolean z = cVar.f117920c;
                    int i3 = cVar.f117923f;
                    long j = cVar.f117922e;
                    boolean z2 = cVar.f117924g;
                    if (this.f141952a.f141951a.f141936b) {
                        i = 1;
                    } else {
                        i = notificationChoiceState2.getListState().getPayload().f117970e + 1;
                    }
                    List<User> list = cVar.f117918a;
                    if (list != null) {
                        i2 = list.size();
                    } else {
                        i2 = 0;
                    }
                    C51133f fVar = new C51133f(z, i3, j, z2, i, i2);
                    List<User> list2 = cVar.f117918a;
                    C89219l.m154716b(list2, "");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                    for (T t : list2) {
                        C89219l.m154716b(t, "");
                        arrayList.add(new C51108g(0, t));
                    }
                    List g = C89070n.m154585g((Collection) arrayList);
                    if (!g.isEmpty()) {
                        g.add(0, new C51107f(18, null, 2));
                        g.add(1, new C51107f(17, null, 2));
                    } else {
                        g.add(0, new C51107f(18, null, 2));
                    }
                    return C89387v.m154943a(g, fVar);
                }
            });
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$j */
    static final class C62603j extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, NotificationChoiceState> {

        /* renamed from: a */
        public static final C62603j f141958a = new C62603j();

        static {
            Covode.recordClassIndex(73402);
        }

        C62603j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            C89219l.m154721d(notificationChoiceState2, "");
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, ListState.copy$default(notificationChoiceState2.getListState(), null, null, new C20372aj(C89086z.INSTANCE), new C20372aj(C89086z.INSTANCE), null, 19, null), false, 0, null, false, null, null, 1015, null);
        }
    }

    /* renamed from: a */
    public final void mo100553a(C51104c cVar) {
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "";
        mo33687b_(new C62595d(aVar, eVar));
        mo33689c(new C62596e(aVar, cVar, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$e */
    public static final class C62596e extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, NotificationChoiceState> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f141947a;

        /* renamed from: b */
        final /* synthetic */ C51104c f141948b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f141949c;

        static {
            Covode.recordClassIndex(73395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62596e(C89233z.C89234a aVar, C51104c cVar, C89233z.C89238e eVar) {
            super(1);
            this.f141947a = aVar;
            this.f141948b = cVar;
            this.f141949c = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
            boolean z;
            T t;
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            C89219l.m154721d(notificationChoiceState2, "");
            if (this.f141947a.element || this.f141948b.mo86513a()) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f141948b.f117925h;
            String str = this.f141948b.f117926i;
            if (str == null || str.length() == 0) {
                t = this.f141949c.element;
            } else {
                t = this.f141948b.f117926i;
            }
            C89219l.m154716b(t, "");
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, null, z, i, t, false, null, null, 911, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$h */
    static final class C62600h extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>>> {

        /* renamed from: a */
        final /* synthetic */ PushSettingNotificationChoiceViewModel f141954a;

        static {
            Covode.recordClassIndex(73399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62600h(PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel) {
            super(1);
            this.f141954a = pushSettingNotificationChoiceViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC88979t<C89378p<? extends List<? extends Object>, ? extends C51133f>> invoke(NotificationChoiceState notificationChoiceState) {
            final NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            C89219l.m154721d(notificationChoiceState2, "");
            this.f141954a.f141936b = false;
            AbstractC88979t<R> d = this.f141954a.f141935a.mo100518a(notificationChoiceState2.getUserId(), notificationChoiceState2.getSecUserId(), notificationChoiceState2.getListState().getPayload().f117968c, notificationChoiceState2.getListState().getPayload().f48407b, this.f141954a.f141938d, notificationChoiceState2.getVcdCount(), this.f141954a.f141937c).mo143292d(new AbstractC88434g(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.PushSettingNotificationChoiceViewModel.C62600h.C626011 */

                /* renamed from: a */
                final /* synthetic */ C62600h f141955a;

                static {
                    Covode.recordClassIndex(73400);
                }

                {
                    this.f141955a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88434g
                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    C51104c cVar = (C51104c) obj;
                    C89219l.m154721d(cVar, "");
                    this.f141955a.f141954a.mo100553a(cVar);
                    this.f141955a.f141954a.mo100554a(cVar, false);
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
                    if (this.f141955a.f141954a.f141936b) {
                        i = 1;
                    } else {
                        i = notificationChoiceState2.getListState().getPayload().f117970e + 1;
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$c */
    public static final class C62594c extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, NotificationChoiceState> {

        /* renamed from: a */
        final /* synthetic */ C51104c f141942a;

        /* renamed from: b */
        final /* synthetic */ PushSettingNotificationChoiceViewModel f141943b;

        /* renamed from: c */
        final /* synthetic */ boolean f141944c;

        static {
            Covode.recordClassIndex(73393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62594c(C51104c cVar, PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel, boolean z) {
            super(1);
            this.f141942a = cVar;
            this.f141943b = pushSettingNotificationChoiceViewModel;
            this.f141944c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState) {
            List<User> f;
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            C89219l.m154721d(notificationChoiceState2, "");
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            if (!this.f141944c) {
                hashMap.putAll(notificationChoiceState2.getUnreadCountMap());
                arrayList.addAll(notificationChoiceState2.getUnreadUidList());
            }
            List<User> list = this.f141942a.f117918a;
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
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, null, false, 0, null, false, hashMap, arrayList, 255, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$f */
    static final class C62597f extends AbstractC89220m implements AbstractC89183m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C62597f f141950a = new C62597f();

        static {
            Covode.recordClassIndex(73396);
        }

        C62597f() {
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
    public final void mo100554a(C51104c cVar, boolean z) {
        if (cVar != null) {
            mo33689c(new C62594c(cVar, this, z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$b */
    static final class C62593b extends AbstractC89220m implements AbstractC89183m<NotificationChoiceState, ListState<Object, C51133f>, NotificationChoiceState> {

        /* renamed from: a */
        public static final C62593b f141941a = new C62593b();

        static {
            Covode.recordClassIndex(73392);
        }

        C62593b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState, ListState<Object, C51133f> listState) {
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            ListState<Object, C51133f> listState2 = listState;
            C89219l.m154721d(notificationChoiceState2, "");
            C89219l.m154721d(listState2, "");
            return NotificationChoiceState.copy$default(notificationChoiceState2, null, null, false, listState2, false, 0, null, false, null, null, 1015, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel$i */
    static final class C62602i extends AbstractC89220m implements AbstractC89183m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C62602i f141957a = new C62602i();

        static {
            Covode.recordClassIndex(73401);
        }

        C62602i() {
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
}
