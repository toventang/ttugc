package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserInDMBean;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.p3155a.C54916a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3156b.p3157a.C54919a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3156b.p3158b.C54921a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55056h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55057i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel */
public final class RecommendFriendInDMViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public final C54916a f125755a;

    /* renamed from: b */
    public final C88411a f125756b;

    /* renamed from: c */
    public final C1213t<List<C54919a>> f125757c;

    /* renamed from: d */
    public final C1213t<Boolean> f125758d;

    /* renamed from: e */
    private final C54921a f125759e = new C54921a();

    static {
        Covode.recordClassIndex(64656);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f125756b.mo142944a();
    }

    public RecommendFriendInDMViewModel() {
        C54916a aVar = new C54916a();
        this.f125755a = aVar;
        C55057i a = C55056h.m100680a();
        if (a != null) {
            boolean z = false;
            if (a.f126002a == 0) {
                aVar.f125724a = false;
            } else if (System.currentTimeMillis() < C54914a.C54915a.m100539a().f125718a.getLong("next_session_time_ms", -1)) {
                aVar.f125724a = false;
            } else {
                aVar.f125724a = true;
                aVar.f125725b = a.f126003b == 1 ? true : z;
            }
        }
        this.f125756b = new C88411a();
        this.f125757c = new C1213t<>();
        this.f125758d = new C1213t<>();
    }

    /* renamed from: a */
    public final void mo91929a() {
        if (this.f125755a.f125724a) {
            AbstractC88412b a = C54921a.m100544a().mo143285c(new C54935b(this)).mo143267a((AbstractC88434g<? super RecommendUserInDMBean, ? extends AbstractC88984x<? extends R>>) new C54936c(this), false).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C54937d(this), new C54938e(this));
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, this.f125756b);
        }
    }

    /* renamed from: b */
    public final void mo91930b() {
        List<C54919a> value = this.f125757c.getValue();
        T t = null;
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.f125729c == 2) {
                    t = next;
                    break;
                }
            }
        }
        List<C54919a> value2 = this.f125757c.getValue();
        if (value2 != null) {
            Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            C89206ad.m154680b(value2).remove(t);
        }
        C1213t<List<C54919a>> tVar = this.f125757c;
        tVar.setValue(tVar.getValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel$b */
    public static final class C54935b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendInDMViewModel f125761a;

        static {
            Covode.recordClassIndex(64658);
        }

        C54935b(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
            this.f125761a = recommendFriendInDMViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f125761a.f125758d.postValue(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel$e */
    public static final class C54938e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendInDMViewModel f125764a;

        static {
            Covode.recordClassIndex(64661);
        }

        C54938e(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
            this.f125764a = recommendFriendInDMViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f125764a.f125758d.postValue(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel$a */
    public static final class C54934a extends AbstractC89220m implements AbstractC89172b<C54919a, Boolean> {

        /* renamed from: a */
        final /* synthetic */ User f125760a;

        static {
            Covode.recordClassIndex(64657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54934a(User user) {
            super(1);
            this.f125760a = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C54919a aVar) {
            String str;
            C54919a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            String uid = this.f125760a.getUid();
            User user = aVar2.f125728b;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            return Boolean.valueOf(C89219l.m154714a((Object) uid, (Object) str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel$d */
    public static final class C54937d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendInDMViewModel f125763a;

        static {
            Covode.recordClassIndex(64660);
        }

        C54937d(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
            this.f125763a = recommendFriendInDMViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f125763a.f125757c.postValue(obj);
            this.f125763a.f125758d.postValue(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel$c */
    public static final class C54936c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendInDMViewModel f125762a;

        static {
            Covode.recordClassIndex(64659);
        }

        C54936c(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
            this.f125762a = recommendFriendInDMViewModel;
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel.C54936c.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static void m100556a(RecommendUserInDMBean recommendUserInDMBean, ArrayList<C54919a> arrayList) {
        List<User> users = recommendUserInDMBean.getUsers();
        if (users != null) {
            Iterator<T> it = users.iterator();
            while (it.hasNext()) {
                arrayList.add(new C54919a(3, it.next(), 0, 4));
            }
        }
    }
}
