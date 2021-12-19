package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41727i;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42455g;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.e */
public final class C42392e extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: n */
    public static final C42393a f98751n = new C42393a((byte) 0);

    /* renamed from: a */
    public TextView f98752a;

    /* renamed from: b */
    public TextView f98753b;

    /* renamed from: c */
    public RecyclerView f98754c;

    /* renamed from: d */
    public C41727i f98755d = new C41727i();

    /* renamed from: e */
    public C67678d f98756e;

    /* renamed from: f */
    public String f98757f = "12";

    /* renamed from: g */
    public int f98758g;

    /* renamed from: h */
    public String f98759h = "";

    /* renamed from: i */
    public C42410g f98760i;

    /* renamed from: m */
    public View f98761m;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.e$c */
    static final class C42395c extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        public static final C42396a f98763a = new C42396a((byte) 0);

        static {
            Covode.recordClassIndex(50340);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.e$c$a */
        public static final class C42396a {
            static {
                Covode.recordClassIndex(50341);
            }

            private C42396a() {
            }

            public /* synthetic */ C42396a(byte b) {
                this();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            int d = RecyclerView.m4277d(view);
            if (d == 0) {
                rect.left = C34728n.m70946a(16.0d);
                rect.right = C34728n.m70946a(4.0d);
            } else if (d == sVar.mo4782a() - 1) {
                rect.left = C34728n.m70946a(4.0d);
                rect.right = C34728n.m70946a(16.0d);
            } else {
                rect.left = C34728n.m70946a(4.0d);
                rect.right = C34728n.m70946a(4.0d);
            }
        }
    }

    static {
        Covode.recordClassIndex(50337);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.e$a */
    public static final class C42393a {
        static {
            Covode.recordClassIndex(50338);
        }

        private C42393a() {
        }

        public /* synthetic */ C42393a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.e$d */
    public static final class RunnableC42397d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42392e f98764a;

        static {
            Covode.recordClassIndex(50342);
        }

        public RunnableC42397d(C42392e eVar) {
            this.f98764a = eVar;
        }

        public final void run() {
            C42392e eVar = this.f98764a;
            ((C67540c) C42317b.m84679a(eVar.mo70877F()).mo106497x(eVar.f98759h).mo106487g(eVar.f98757f).mo106459o("general_search")).mo106479a(Integer.valueOf(eVar.f98758g)).mo96792f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.e$b */
    final class C42394b implements AbstractC51187d {
        static {
            Covode.recordClassIndex(50339);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C42394b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d
        /* renamed from: a */
        public final boolean mo71326a(User user) {
            String str;
            int i;
            C89219l.m154721d(user, "");
            MobClick obtain = MobClick.obtain();
            String str2 = "follow";
            if (user.getFollowStatus() == 0) {
                str = str2;
            } else {
                str = "follow_cancel";
            }
            C39162r.onEvent(obtain.setEventName(str).setLabelName("general_search").setValue(user.getUid()));
            if (user.getFollowStatus() != 0) {
                str2 = "follow_cancel";
            }
            C59260v a = new C59260v(str2).mo96847a("general_search");
            a.f135409s = "follow_button";
            a.f135403c = "follow_button";
            a.f135402b = "general_search";
            a.f135405e = user.getUid();
            C59260v o = a.mo96849o(String.valueOf(C42392e.this.f98758g));
            o.f135407q = C42392e.this.mo70877F().f151314i;
            o.f135376aa = user.isSecret() ? 1 : 0;
            int followStatus = user.getFollowStatus();
            if (followStatus == 0) {
                i = -1;
            } else if (followStatus != 4) {
                i = 1;
            } else {
                i = 0;
            }
            o.f135377ab = i;
            o.mo96786a("impr_id", C42392e.this.mo70877F().f151314i).mo96786a("search_result_id", C42392e.this.f98757f).mo96786a("list_item_id", user.getUid()).mo96792f();
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d
        /* renamed from: a */
        public final void mo71325a(View view, User user, int i, String str, String str2) {
            String str3;
            C89219l.m154721d(view, "");
            C89219l.m154721d(user, "");
            C89219l.m154721d(str, "");
            C67678d dVar = C42392e.this.f98756e;
            if (dVar != null) {
                str3 = dVar.getKeyword();
            } else {
                str3 = null;
            }
            String str4 = C42392e.this.mo70877F().f151314i;
            String uid = user.getUid();
            String a = C42467o.m84876a(str3);
            int i2 = C42392e.this.f98758g;
            String str5 = C42392e.this.f98757f;
            String uid2 = user.getUid();
            C42452d.m84858a(view, uid, i2);
            C59252q qVar = (C59252q) new C59252q().mo96742b();
            qVar.f135289ac = str;
            C59252q o = qVar.mo96825o(C42467o.m84875a(3));
            o.f135315r = str4;
            C59252q qVar2 = (C59252q) o.mo96744c().mo96743b(String.valueOf(i2));
            qVar2.f135314q = uid;
            new C42455g().setOrder(i).setSearchKeyword(str3).setRid(str4).setEnterFrom(C42467o.m84875a(3)).setEnterMethod(a).setSearchResultId(str5).setListItemId(uid2).installToMetrics(qVar2);
            qVar2.mo96792f();
            C42467o.m84877a(3, str4, uid);
            SmartRouter.buildRoute(C42392e.this.mo70878G(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_uid", user.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "card_head").withParam("enter_method", C42467o.m84876a(str3)).withParam("extra_from_pre_page", "general_search").withParam("search_request_id", user.getRequestId()).open();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42392e(View view, View view2) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        this.f98761m = view2;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.azo);
        C89219l.m154716b(tuxTextView, "");
        this.f98752a = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.azn);
        C89219l.m154716b(tuxTextView2, "");
        this.f98753b = tuxTextView2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.azm);
        C89219l.m154716b(recyclerView, "");
        this.f98754c = recyclerView;
        RecyclerView recyclerView2 = this.f98754c;
        view.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView2.mo4402a(new C42395c());
        this.f98755d.f97350e = new C42394b();
    }
}
