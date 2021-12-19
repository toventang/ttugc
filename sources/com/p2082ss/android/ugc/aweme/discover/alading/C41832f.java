package com.p2082ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e;
import com.p2082ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.p2082ss.android.ugc.aweme.discover.helper.C42058x;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42312e;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67498at;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.f */
public final class C41832f extends C41817e implements C42058x.AbstractC42060b, AbstractC43303b {

    /* renamed from: a */
    public SearchUser f97576a;

    /* renamed from: b */
    private final AbstractC89244h f97577b = C89250i.m154773a((AbstractC89171a) new C41833a(this));

    static {
        Covode.recordClassIndex(49748);
    }

    /* renamed from: f */
    private final C42058x m83806f() {
        return (C42058x) this.f97577b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b
    public final void aV_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: c */
    public final int mo70976c() {
        return 65458;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: d */
    public final String mo70977d() {
        return "video";
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
    public final Object aR_() {
        return this.f97576a;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.f$a */
    static final class C41833a extends AbstractC89220m implements AbstractC89171a<C42058x> {

        /* renamed from: a */
        final /* synthetic */ C41832f f97578a;

        static {
            Covode.recordClassIndex(49749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41833a(C41832f fVar) {
            super(0);
            this.f97578a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42058x invoke() {
            return C42058x.C42059a.m84178a(this.f97578a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: b */
    public final String mo70975b() {
        List<Music> list;
        SearchUser searchUser = this.f97576a;
        if (searchUser == null || (list = searchUser.musicCards) == null || list.isEmpty()) {
            return "hot_user";
        }
        return "musician";
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: e */
    public final String mo70978e() {
        String str;
        User user;
        SearchUser searchUser = this.f97576a;
        if (searchUser == null || (user = searchUser.user) == null) {
            str = null;
        } else {
            str = user.getUid();
        }
        return String.valueOf(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
    public final List<Aweme> aS_() {
        List<Aweme> list;
        SearchUser searchUser = this.f97576a;
        if (!(searchUser == null || (list = searchUser.awemeCards) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (!t2.isLive()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return C89070n.m154585g((Collection) arrayList2);
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
    public final List<Aweme> aT_() {
        List<Aweme> list;
        SearchUser searchUser = this.f97576a;
        if (!(searchUser == null || (list = searchUser.awemeCards) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (t2.isLive()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return C89070n.m154585g((Collection) arrayList2);
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
    public final int aU_() {
        int i;
        List<Aweme> list;
        SearchUser searchUser = this.f97576a;
        if (!(searchUser == null || (list = searchUser.awemeCards) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (t2.isLive()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                i = arrayList2.size();
                return 10 - i;
            }
        }
        i = 0;
        return 10 - i;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final void mo70970a() {
        User user;
        SearchUser searchUser = this.f97576a;
        if (searchUser != null && (user = searchUser.user) != null) {
            View view = this.f97564j.itemView;
            C89219l.m154716b(view, "");
            SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head").withParam("enter_method", "click_search_result").withParam("general_search_card_type", 1).open();
            View view2 = this.f97564j.itemView;
            C89219l.m154716b(view2, "");
            ((C67496as) ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67542d) C42317b.m84680b(C42460j.C42461a.m84864a(view2)).mo106497x(mo70975b()).mo106456l(this.f97563i.f151323r)).mo106491r("user")).mo106492s(user.getSearchUserName())).mo106495v(user.getUid()).mo106487g(mo70978e())).mo106493t(C42312e.m84674a(user))).mo106496w("1")).mo106440B("click_see_all").mo106494u(user.getUniqueId()).mo96792f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41832f(C41827d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b
    /* renamed from: a */
    public final void mo70992a(SearchUser searchUser) {
        C89219l.m154721d(searchUser, "");
        this.f97576a = searchUser;
        if (searchUser == null) {
            C89219l.m154715b();
        }
        List<Aweme> list = searchUser.awemeCards;
        if (list == null) {
            list = Collections.emptyList();
            C89219l.m154716b(list, "");
        }
        mo70973a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42058x.AbstractC42060b
    /* renamed from: a */
    public final boolean mo70987a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        List<Aweme> aS_ = aS_();
        if (aS_ == null) {
            return false;
        }
        Iterator<T> it = aS_.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().getAid(), aweme.getAid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.f$b */
    static final class C41834b extends AbstractC89220m implements AbstractC89183m<Aweme, List<Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41832f f97579a;

        /* renamed from: b */
        final /* synthetic */ C49672ag f97580b;

        static {
            Covode.recordClassIndex(49750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41834b(C41832f fVar, C49672ag agVar) {
            super(2);
            this.f97579a = fVar;
            this.f97580b = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Aweme aweme, List<Aweme> list) {
            Aweme aweme2 = aweme;
            List<Aweme> list2 = list;
            C89219l.m154721d(aweme2, "");
            SearchUser searchUser = this.f97579a.f97576a;
            if (searchUser != null) {
                if (list2 != null) {
                    searchUser.awemeCards = list2;
                    this.f97579a.mo70973a(list2);
                }
                C41832f.super.mo70971a((C41832f) this.f97580b, (C49672ag) aweme2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final C67498at mo70968a(Aweme aweme, Integer num) {
        String str;
        User user;
        User user2;
        C67498at a = super.mo70968a(aweme, num);
        SearchUser searchUser = this.f97576a;
        String str2 = null;
        if (searchUser == null || (user2 = searchUser.user) == null) {
            str = null;
        } else {
            str = user2.getUniqueId();
        }
        C67542d dVar = (C67542d) a.mo106452c("user_name", String.valueOf(str));
        SearchUser searchUser2 = this.f97576a;
        if (!(searchUser2 == null || (user = searchUser2.user) == null)) {
            str2 = C42312e.m84674a(user);
        }
        return (C67498at) dVar.mo106493t(str2).mo106456l(this.f97563i.f151323r);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final void mo70971a(C49672ag agVar, Aweme aweme) {
        C89219l.m154721d(agVar, "");
        C89219l.m154721d(aweme, "");
        C42058x f = m83806f();
        if (f != null) {
            f.mo71225a(agVar, aweme, new C41834b(this, agVar));
        } else {
            super.mo70971a(agVar, aweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final C67496as mo70967a(Aweme aweme, Integer num, String str) {
        String str2;
        User user;
        User user2;
        C89219l.m154721d(str, "");
        C67496as a = super.mo70967a(aweme, num, str);
        SearchUser searchUser = this.f97576a;
        String str3 = null;
        if (searchUser == null || (user2 = searchUser.user) == null) {
            str2 = null;
        } else {
            str2 = user2.getUniqueId();
        }
        C67542d dVar = (C67542d) a.mo106452c("user_name", String.valueOf(str2));
        SearchUser searchUser2 = this.f97576a;
        if (!(searchUser2 == null || (user = searchUser2.user) == null)) {
            str3 = C42312e.m84674a(user);
        }
        return (C67496as) dVar.mo106493t(str3).mo106456l(this.f97563i.f151323r);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e
    /* renamed from: a */
    public final void mo70972a(Aweme aweme, View view, List<? extends Aweme> list) {
        User user;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(list, "");
        C42058x f = m83806f();
        if (f != null) {
            C67568r a = C42460j.C42461a.m84864a(view);
            String str = null;
            C42452d.m84859a(view, mo70978e(), a.f151318m, null);
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            Bundle b = mo70974b(aweme, view);
            SearchContinuousLoadingApi.C41847b bVar = new SearchContinuousLoadingApi.C41847b();
            bVar.f97616a = a.f151311f;
            bVar.f97617b = 4;
            SearchUser searchUser = this.f97576a;
            if (!(searchUser == null || (user = searchUser.user) == null)) {
                str = user.getUid();
            }
            bVar.f97618c = str;
            f.mo71224a(context, b, bVar);
            return;
        }
        super.mo70972a(aweme, view, list);
    }
}
