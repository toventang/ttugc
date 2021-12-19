package com.p2082ss.android.ugc.aweme.discover.alading.p2764a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C0576b;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.discover.alading.AbstractC41825b;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41806a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42311d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41902e;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41907g;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42077d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49419b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67498at;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67558l;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.a.e */
public class C41817e extends AbstractC41825b implements AbstractC41814c, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private final AbstractC89244h f97549a;

    /* renamed from: d */
    public List<? extends Aweme> f97550d;

    /* renamed from: e */
    public C41893a f97551e;

    static {
        Covode.recordClassIndex(49733);
    }

    /* renamed from: f */
    private C41806a m83767f() {
        return (C41806a) this.f97549a.getValue();
    }

    /* renamed from: a */
    public void mo70970a() {
    }

    /* renamed from: b */
    public String mo70975b() {
        return "";
    }

    /* renamed from: c */
    public int mo70976c() {
        return -1;
    }

    /* renamed from: d */
    public String mo70977d() {
        return "";
    }

    /* renamed from: e */
    public String mo70978e() {
        return "";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C41817e.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo70973a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        super.mo70985a(list, this.f97551e);
        this.f97550d = list;
        C41806a f = m83767f();
        C89219l.m154721d(list, "");
        f.f97523a = list;
        f.notifyDataSetChanged();
        f.f97524b.mo71221a(list, new C41806a.C41808b());
        C41902e.m83943a(true, list, 0);
        View view = this.f97564j.itemView;
        C89219l.m154716b(view, "");
        C67568r a = C42460j.C42461a.m84864a(view).mo106508a(new C41821b(this));
        String d = mo70977d();
        C89219l.m154721d(d, "");
        a.f151300A = d;
        C41822c cVar = C41822c.f97557a;
        C89219l.m154721d(cVar, "");
        a.f151305F = cVar;
        C67568r b = a.mo106512b(C41823d.f97558a);
        C41806a f2 = m83767f();
        C89219l.m154721d(b, "");
        f2.f97527e = b;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.e$e */
    static final class CallableC41824e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C41817e f97559a;

        /* renamed from: b */
        final /* synthetic */ Aweme f97560b;

        /* renamed from: c */
        final /* synthetic */ int f97561c;

        static {
            Covode.recordClassIndex(49740);
        }

        CallableC41824e(C41817e eVar, Aweme aweme, int i) {
            this.f97559a = eVar;
            this.f97560b = aweme;
            this.f97561c = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f97559a.mo70968a(this.f97560b, Integer.valueOf(this.f97561c)).mo96792f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.e$a */
    static final class C41820a extends AbstractC89220m implements AbstractC89171a<C41806a> {

        /* renamed from: a */
        final /* synthetic */ C41817e f97554a;

        /* renamed from: b */
        final /* synthetic */ C41827d f97555b;

        static {
            Covode.recordClassIndex(49736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41820a(C41817e eVar, C41827d dVar) {
            super(0);
            this.f97554a = eVar;
            this.f97555b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41806a invoke() {
            View view = this.f97555b.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C41817e eVar = this.f97554a;
            View view2 = this.f97555b.itemView;
            C89219l.m154716b(view2, "");
            return new C41806a(context, eVar, C42460j.C42461a.m84864a(view2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.e$b */
    public static final class C41821b extends AbstractC89220m implements AbstractC89172b<Aweme, String> {

        /* renamed from: a */
        final /* synthetic */ C41817e f97556a;

        static {
            Covode.recordClassIndex(49737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41821b(C41817e eVar) {
            super(1);
            this.f97556a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Aweme aweme) {
            return this.f97556a.mo70978e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.e$c */
    public static final class C41822c extends AbstractC89220m implements AbstractC89172b<Aweme, String> {

        /* renamed from: a */
        public static final C41822c f97557a = new C41822c();

        static {
            Covode.recordClassIndex(49738);
        }

        C41822c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Aweme aweme) {
            String aid;
            Aweme aweme2 = aweme;
            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                return "";
            }
            return aid;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.e$d */
    public static final class C41823d extends AbstractC89220m implements AbstractC89172b<Aweme, String> {

        /* renamed from: a */
        public static final C41823d f97558a = new C41823d();

        static {
            Covode.recordClassIndex(49739);
        }

        C41823d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Aweme aweme) {
            String aid;
            Aweme aweme2 = aweme;
            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                return "";
            }
            return aid;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41817e(C41827d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
        this.f97549a = C89250i.m154773a((AbstractC89171a) new C41820a(this, dVar));
        C41806a f = m83767f();
        Objects.requireNonNull(f, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
        this.f97551e = new C41893a(f);
        View a = C67641m.m119786a(dVar.f97566a, R.layout.av_);
        C41893a aVar = this.f97551e;
        int size = aVar.f97737b.size();
        if (size >= 0 && size <= aVar.f97737b.size() && a != null) {
            int a2 = aVar.f97739d.mo71065a();
            C41907g gVar = new C41907g(a2, a);
            aVar.f97737b.add(gVar);
            aVar.f97738c.mo2186b(a2, gVar);
            aVar.notifyItemInserted((aVar.getItemCount() - aVar.f97737b.size()) + size);
        }
        a.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e.View$OnClickListenerC418181 */

            /* renamed from: a */
            final /* synthetic */ C41817e f97552a;

            static {
                Covode.recordClassIndex(49734);
            }

            {
                this.f97552a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200)) {
                    this.f97552a.mo70970a();
                }
            }
        });
        dVar.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41817e.View$OnAttachStateChangeListenerC418192 */

            /* renamed from: a */
            final /* synthetic */ C41817e f97553a;

            static {
                Covode.recordClassIndex(49735);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f97553a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                EventBus.m156966a(EventBus.m156962a(), this.f97553a);
            }

            public final void onViewDetachedFromWindow(View view) {
                EventBus.m156962a().mo145395b(this.f97553a);
            }
        });
    }

    @AbstractC90264r
    public final void onVideoEvent(C49672ag agVar) {
        String str;
        C89219l.m154721d(agVar, "");
        if (C0792v.m2791y(this.f97564j.itemView) && agVar.f114315a == 21 && agVar.f114323i != 65280) {
            String str2 = this.f97563i.f151309d;
            Bundle bundle = agVar.f114317c;
            if (bundle != null) {
                str = bundle.getString("key_search_type");
            } else {
                str = null;
            }
            if (TextUtils.equals(str2, str)) {
                Object obj = agVar.f114316b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                Aweme aweme = (Aweme) obj;
                if (aweme != null && !TextUtils.equals(C41806a.f97519f, aweme.getAid())) {
                    mo70971a(agVar, aweme);
                }
            }
        }
    }

    /* renamed from: a */
    public C67558l mo70969a(Aweme aweme, View view) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(view, "");
        C67568r a = C42460j.C42461a.m84864a(view);
        String str = "general_search";
        if (!TextUtils.equals(a.f151312g, str)) {
            str = "search_result";
        }
        return (C67558l) ((C67542d) ((C67540c) ((C67540c) new C67558l(a).mo106503f(aweme).mo106459o(str)).mo106482b(a.f151311f).mo106460p("aladdin_card").mo106452c("video_tag", C42311d.m84672a(aweme))).mo106480a(C59208ac.m108763b(aweme)).mo106483c(a.f151317l).mo106487g(aweme.getAuthorUid())).mo106495v(aweme.getAid()).mo106486f(a.f151309d);
    }

    /* renamed from: b */
    public Bundle mo70974b(Aweme aweme, View view) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(view, "");
        C67568r a = C42460j.C42461a.m84864a(view);
        String str = "general_search";
        if (!TextUtils.equals(a.f151312g, str)) {
            str = "search_result";
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("video_from", "from_no_request");
        bundle.putString("enter_from", str);
        bundle.putString("search_keyword", a.f151311f);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", mo70976c());
        bundle.putString("search_id", a.f151314i);
        bundle.putString("list_item_id", aweme.getAid());
        bundle.putString("search_result_id", aweme.getAuthorUid());
        bundle.putString("playlist_search_id", a.f151314i);
        bundle.putString("key_search_type", a.f151309d);
        bundle.putInt("is_from_video", 2);
        return bundle;
    }

    /* renamed from: a */
    public C67498at mo70968a(Aweme aweme, Integer num) {
        String str;
        String str2;
        User author;
        View view = this.f97564j.itemView;
        C89219l.m154716b(view, "");
        C67542d dVar = (C67542d) ((C67542d) C42317b.m84679a(C42460j.C42461a.m84864a(view)).mo106497x(mo70975b())).mo106491r(mo70977d()).mo106487g(mo70978e());
        Long l = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C67542d dVar2 = (C67542d) ((C67542d) dVar.mo106495v(str)).mo106490d(num);
        if (aweme != null) {
            str2 = aweme.getDesc();
        } else {
            str2 = null;
        }
        C67498at atVar = (C67498at) ((C67542d) dVar2.mo106492s(str2)).mo106496w("1");
        if (aweme != null && aweme.isLive()) {
            if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
                l = Long.valueOf(author.roomId);
            }
            atVar.mo106495v(String.valueOf(l));
            atVar.mo106491r("live");
        }
        atVar.mo96786a("video_tag", C42311d.m84672a(aweme));
        return atVar;
    }

    /* renamed from: a */
    public void mo70971a(C49672ag agVar, Aweme aweme) {
        C89219l.m154721d(agVar, "");
        C89219l.m154721d(aweme, "");
        List<? extends Aweme> list = this.f97550d;
        if (list == null) {
            C89219l.m154715b();
        }
        int i = 0;
        for (Aweme aweme2 : list) {
            if (!TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                i++;
            } else if (i != -1) {
                RecyclerView.AbstractC1362i layoutManager = this.f97564j.f97566a.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).mo4347a(i, 0);
                return;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C67496as mo70967a(Aweme aweme, Integer num, String str) {
        String str2;
        String str3;
        User author;
        C89219l.m154721d(str, "");
        View view = this.f97564j.itemView;
        C89219l.m154716b(view, "");
        C67542d dVar = (C67542d) ((C67542d) ((C67542d) C42317b.m84680b(C42460j.C42461a.m84864a(view)).mo106497x(mo70975b())).mo106491r(mo70977d()).mo106487g(mo70978e())).mo106493t(this.f97563i.f151324s).mo106456l(this.f97563i.f151323r);
        Long l = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        C67542d dVar2 = (C67542d) ((C67542d) dVar.mo106495v(str2)).mo106490d(num);
        if (aweme != null) {
            str3 = aweme.getDesc();
        } else {
            str3 = null;
        }
        C67496as B = ((C67496as) ((C67542d) dVar2.mo106492s(str3)).mo106496w("1")).mo106440B(str);
        if (aweme != null && aweme.isLive()) {
            if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
                l = Long.valueOf(author.roomId);
            }
            B.mo106495v(String.valueOf(l));
            B.mo106491r("live");
        }
        B.mo96786a("video_tag", C42311d.m84672a(aweme));
        return B;
    }

    /* renamed from: a */
    public void mo70972a(Aweme aweme, View view, List<? extends Aweme> list) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(list, "");
        C42077d dVar = new C42077d();
        dVar.mo71276a_(list);
        C50529ae.f116790a = dVar;
        Bundle b = mo70974b(aweme, view);
        C0576b b2 = C0576b.m2193b(view, view.getWidth(), view.getHeight());
        C89219l.m154716b(b2, "");
        SmartRouter.buildRoute(view.getContext(), "//aweme/detail").withParam(b).withBundleAnimation(b2.mo2564a()).withParam("activity_has_activity_options", true).withParam("playlist_search_id", C42460j.C42461a.m84864a(view).f151314i).withParam("key_search_type", C42460j.C42461a.m84864a(view).f151309d).withParam("is_from_video", 2).open();
        C49419b.m92487a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c
    /* renamed from: b */
    public final void mo60420b(int i, View view, Aweme aweme, List<? extends Aweme> list) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(list, "");
        C1731i.m5640b(new CallableC41824e(this, aweme, i), C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c
    /* renamed from: a */
    public final void mo60417a(int i, View view, Aweme aweme, List<? extends Aweme> list) {
        String str;
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(list, "");
        if (!aweme.isLive()) {
            View view2 = this.f97564j.itemView;
            C89219l.m154716b(view2, "");
            C67704b.m119869a(C42460j.C42461a.m84864a(view2));
            mo70972a(aweme, view, list);
            C49419b.m92487a(aweme);
            mo70969a(aweme, view).mo96792f();
        }
        C42452d.m84859a(view, mo70978e(), i, null);
        Integer valueOf = Integer.valueOf(i);
        if (aweme.isLive()) {
            str = "click_live";
        } else {
            str = "click_video";
        }
        mo70967a(aweme, valueOf, str).mo96792f();
        C67690d.C67691a.m119848a(C89041ag.m154421a(C89387v.m154943a("search_result_id", mo70978e()), C89387v.m154943a("list_item_id", aweme.getAid()), C89387v.m154943a("is_from_video", "2")));
    }
}
