package com.p2082ss.android.ugc.aweme.autoplay.p2346b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34179o;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.discover.activity.C41571b;
import com.p2082ss.android.ugc.aweme.discover.activity.SearchLiveListActivity;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b;
import com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41937p;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42813a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.p2226a.C31292a;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.b.g */
public final class C34098g extends AbstractC34179o implements AbstractC41858b, AbstractC67459a {

    /* renamed from: e */
    public static final C34099a f80619e = new C34099a((byte) 0);

    /* renamed from: a */
    public final ViewGroup f80620a;

    /* renamed from: b */
    public String f80621b = "";

    /* renamed from: c */
    public boolean f80622c;

    /* renamed from: d */
    public final View$OnAttachStateChangeListenerC41864g f80623d;

    /* renamed from: g */
    private final AbstractC89244h f80624g;

    /* renamed from: h */
    private final AbstractC89244h f80625h;

    /* renamed from: i */
    private final AbstractC89244h f80626i;

    static {
        Covode.recordClassIndex(41032);
    }

    /* renamed from: a */
    public final C34061c mo60336a() {
        return (C34061c) this.f80624g.getValue();
    }

    /* renamed from: e */
    public final LinearLayout mo60378e() {
        return (LinearLayout) this.f80625h.getValue();
    }

    /* renamed from: g */
    public final TextView mo60379g() {
        return (TextView) this.f80626i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: k */
    public final C67678d mo60383k() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: m */
    public final int mo60385m() {
        return 72;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: q */
    public final void mo60389q() {
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: r */
    public final boolean mo60390r() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: s */
    public final SmartImageView mo60391s() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: t */
    public final AbstractC34186b.AbstractC34192d mo60392t() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: u */
    public final boolean mo60393u() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: v */
    public final void mo60394v() {
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: w */
    public final void mo60395w() {
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: x */
    public final Aweme mo60396x() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: y */
    public final boolean mo60397y() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.g$a */
    public static final class C34099a {
        static {
            Covode.recordClassIndex(41033);
        }

        private C34099a() {
        }

        public /* synthetic */ C34099a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: h */
    public final AbstractC67459a mo60380h() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: i */
    public final boolean mo60381i() {
        return this.f97202l;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: j */
    public final boolean mo60382j() {
        return this.f80622c;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: l */
    public final View mo60384l() {
        return this.f80620a;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: o */
    public final int mo60387o() {
        return getAdapterPosition();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: p */
    public final int mo60388p() {
        return getAdapterPosition();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.g$e */
    static final class C34103e extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ View f80635a;

        static {
            Covode.recordClassIndex(41037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34103e(View view) {
            super(0);
            this.f80635a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            View findViewById = this.f80635a.findViewById(R.id.dtp);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.g$f */
    static final class C34104f extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f80636a;

        static {
            Covode.recordClassIndex(41038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34104f(View view) {
            super(0);
            this.f80636a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            View findViewById = this.f80636a.findViewById(R.id.dt8);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return findViewById;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        return mo60336a().mo60489h().aZ_();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.g$c */
    public static final class RunnableC34101c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67568r f80629a;

        /* renamed from: b */
        final /* synthetic */ C42411h f80630b;

        static {
            Covode.recordClassIndex(41035);
        }

        public RunnableC34101c(C67568r rVar, C42411h hVar) {
            this.f80629a = rVar;
            this.f80630b = hVar;
        }

        public final void run() {
            String str;
            C67542d dVar = (C67542d) C42317b.m84679a(this.f80629a).mo106487g(this.f80629a.f151319n);
            C42410g gVar = this.f80630b.f98797g;
            String str2 = null;
            if (gVar == null || (str = gVar.f98786b) == null || str.length() == 0) {
                str2 = "live_card";
            } else {
                C42410g gVar2 = this.f80630b.f98797g;
                if (gVar2 != null) {
                    str2 = gVar2.f98786b;
                }
            }
            dVar.mo106497x(str2).mo96792f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: n */
    public final int mo60386n() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        if (!(view.getLayoutParams() instanceof GridLayoutManager.C1336b)) {
            return -1;
        }
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        return ((GridLayoutManager.C1336b) layoutParams).f4324a;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.g$d */
    static final class C34102d extends AbstractC89220m implements AbstractC89171a<C34061c> {

        /* renamed from: a */
        final /* synthetic */ C34098g f80631a;

        /* renamed from: b */
        final /* synthetic */ View f80632b;

        /* renamed from: c */
        final /* synthetic */ AbstractC51043a f80633c;

        /* renamed from: d */
        final /* synthetic */ AbstractC51044b f80634d;

        static {
            Covode.recordClassIndex(41036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34102d(C34098g gVar, View view, AbstractC51043a aVar, AbstractC51044b bVar) {
            super(0);
            this.f80631a = gVar;
            this.f80632b = view;
            this.f80633c = aVar;
            this.f80634d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34061c invoke() {
            MethodCollector.m26663i(8321);
            this.f80631a.f80620a.removeAllViews();
            View view = this.f80632b;
            if (view != null) {
                ViewGroup viewGroup = (ViewGroup) view;
                AbstractC51043a aVar = this.f80633c;
                AbstractC51044b bVar = this.f80634d;
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(bVar, "");
                View a = C67641m.m119786a(viewGroup, R.layout.avs);
                C34061c cVar = new C34061c(new C41827d(a), aVar, bVar, a);
                this.f80631a.f80620a.addView(cVar.mo60490i());
                this.f80631a.mo60476a(cVar);
                cVar.mo60486a(this.f80631a);
                MethodCollector.m26664o(8321);
                return cVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(8321);
            throw nullPointerException;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.g$b */
    public static final class View$OnClickListenerC34100b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C67568r f80627a;

        /* renamed from: b */
        final /* synthetic */ C42411h f80628b;

        static {
            Covode.recordClassIndex(41034);
        }

        public View$OnClickListenerC34100b(C67568r rVar, C42411h hVar) {
            this.f80627a = rVar;
            this.f80628b = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((C67542d) ((C67496as) ((C67542d) ((C67542d) C42317b.m84680b(this.f80627a).mo106497x("live_card")).mo106491r("live")).mo106492s("live").mo106487g(this.f80627a.f151319n)).mo106440B("click_more_button").mo106495v(this.f80627a.f151319n).mo106479a((Integer) 0)).mo106490d((Integer) 0).mo96792f();
            if (!C31292a.m65465a()) {
                Context context = GlobalContext.getContext();
                C89219l.m154716b(context, "");
                C41571b bVar = new C41571b();
                bVar.setSearchKeyword(this.f80627a.f151311f);
                bVar.setEnterFrom(this.f80627a.f151312g);
                bVar.setSearchId("searchId");
                bVar.setSearchType("general");
                bVar.setRoomIdList(C42813a.m85509a(this.f80628b.f98805o.f98566a));
                bVar.setEnterMethod("click_more_general_list");
                SearchLiveListActivity.C41564a.m83502a(context, bVar, C67446h.f151111a.mo106216e());
                return;
            }
            AbstractC81915c.m141874a(new C41937p(C67458j.f151139h));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34098g(View view, AbstractC51043a aVar, AbstractC51044b bVar, View$OnAttachStateChangeListenerC41864g gVar) {
        super(view, (byte) 0);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f80623d = gVar;
        View findViewById = view.findViewById(R.id.dr4);
        C89219l.m154716b(findViewById, "");
        this.f80620a = (ViewGroup) findViewById;
        this.f80624g = C89250i.m154773a((AbstractC89171a) new C34102d(this, view, aVar, bVar));
        this.f80625h = C89250i.m154773a((AbstractC89171a) new C34103e(view));
        this.f80626i = C89250i.m154773a((AbstractC89171a) new C34104f(view));
    }
}
