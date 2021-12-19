package com.p2082ss.android.ugc.aweme.discover.alading;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42312e;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42314a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2790c.C42322a;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2817e.AbstractC43302a;
import com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.g */
public final class C41835g implements AbstractC43302a, AbstractC43303b {

    /* renamed from: a */
    public SearchUser f97581a;

    /* renamed from: b */
    public C42314a f97582b;

    /* renamed from: c */
    public C67568r f97583c;

    /* renamed from: d */
    private View f97584d;

    /* renamed from: e */
    private RecyclerView f97585e;

    /* renamed from: f */
    private View f97586f;

    /* renamed from: g */
    private C42322a f97587g;

    static {
        Covode.recordClassIndex(49751);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b
    public final void aV_() {
        this.f97584d.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.g$a */
    static final class CallableC41837a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C41835g f97589a;

        /* renamed from: b */
        final /* synthetic */ User f97590b;

        static {
            Covode.recordClassIndex(49753);
        }

        CallableC41837a(C41835g gVar, User user) {
            this.f97589a = gVar;
            this.f97590b = user;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            C67568r rVar = this.f97589a.f97583c;
            if (rVar == null) {
                rVar = C67568r.C67569a.m119673a();
            }
            C67496as b = C42317b.m84680b(rVar);
            User user = this.f97590b;
            Integer num = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            C67542d dVar = (C67542d) b.mo106487g(str);
            User user2 = this.f97590b;
            if (user2 != null) {
                str2 = user2.getUniqueId();
            } else {
                str2 = null;
            }
            C67542d dVar2 = (C67542d) dVar.mo106494u(str2);
            User user3 = this.f97590b;
            if (user3 != null) {
                str3 = C42312e.m84674a(user3);
            } else {
                str3 = null;
            }
            C67542d dVar3 = (C67542d) ((C67542d) ((C67542d) dVar2.mo106493t(str3)).mo106491r("user")).mo106490d((Integer) 0);
            User user4 = this.f97590b;
            if (user4 != null) {
                str4 = user4.getUid();
            } else {
                str4 = null;
            }
            C67542d dVar4 = (C67542d) dVar3.mo106495v(str4);
            User user5 = this.f97590b;
            if (user5 != null) {
                str5 = user5.getSearchUserName();
            } else {
                str5 = null;
            }
            C67540c s = dVar4.mo106492s(str5);
            C67568r rVar2 = this.f97589a.f97583c;
            if (rVar2 != null) {
                str6 = rVar2.f151323r;
            } else {
                str6 = null;
            }
            C67496as B = ((C67496as) ((C67542d) s.mo106456l(str6)).mo106497x("musician").mo106459o("general_search")).mo106440B("click_all_song");
            C67568r rVar3 = this.f97589a.f97583c;
            if (rVar3 != null) {
                num = Integer.valueOf(rVar3.f151318m);
            }
            B.mo106479a(num).mo96792f();
            return C89391z.f203057a;
        }
    }

    public C41835g(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        MethodCollector.m26663i(8753);
        viewStub.setLayoutResource(R.layout.aw2);
        View inflate = viewStub.inflate();
        C89219l.m154716b(inflate, "");
        this.f97584d = inflate;
        View findViewById = inflate.findViewById(R.id.cng);
        C89219l.m154716b(findViewById, "");
        this.f97585e = (RecyclerView) findViewById;
        View findViewById2 = this.f97584d.findViewById(R.id.fem);
        C89219l.m154716b(findViewById2, "");
        this.f97586f = findViewById2;
        RecyclerView recyclerView = this.f97585e;
        this.f97584d.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        C42322a aVar = new C42322a();
        this.f97587g = aVar;
        this.f97585e.setAdapter(aVar);
        this.f97586f.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.alading.C41835g.View$OnClickListenerC418361 */

            /* renamed from: a */
            final /* synthetic */ C41835g f97588a;

            static {
                Covode.recordClassIndex(49752);
            }

            {
                this.f97588a = r1;
            }

            public final void onClick(View view) {
                SearchUser searchUser;
                User user;
                User user2;
                ClickAgent.onClick(view);
                if (view != null && !C58001a.m104815a(view, 1200) && (searchUser = this.f97588a.f97581a) != null && (user = searchUser.user) != null) {
                    SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head").withParam("enter_method", "click_search_result").withParam("general_search_card_type", 2).open();
                    C41835g gVar = this.f97588a;
                    SearchUser searchUser2 = gVar.f97581a;
                    if (searchUser2 != null) {
                        user2 = searchUser2.user;
                    } else {
                        user2 = null;
                    }
                    C1731i.m5640b(new CallableC41837a(gVar, user2), C40780g.m82246c());
                }
            }
        });
        MethodCollector.m26664o(8753);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b
    /* renamed from: a */
    public final void mo70992a(SearchUser searchUser) {
        this.f97581a = searchUser;
        if (searchUser != null) {
            List<Music> list = searchUser.musicCards;
            int i = 0;
            if (!(list == null || list.isEmpty())) {
                C42314a aVar = this.f97582b;
                if (aVar != null) {
                    aVar.setUser(searchUser.user);
                }
                this.f97587g.mo70994a(this.f97582b, this.f97583c);
                this.f97584d.setVisibility(0);
                ArrayList arrayList = new ArrayList();
                List<Music> list2 = searchUser.musicCards;
                C89219l.m154716b(list2, "");
                for (T t : list2) {
                    if (i >= 3) {
                        break;
                    }
                    C89219l.m154716b(t, "");
                    arrayList.add(t);
                    i++;
                }
                C42322a aVar2 = this.f97587g;
                aVar2.f98570a.clear();
                if (!arrayList.isEmpty()) {
                    aVar2.f98570a.addAll(arrayList);
                }
                aVar2.notifyDataSetChanged();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2817e.AbstractC43302a
    /* renamed from: a */
    public final void mo70994a(C42314a aVar, C67568r rVar) {
        this.f97582b = aVar;
        this.f97583c = rVar;
    }
}
