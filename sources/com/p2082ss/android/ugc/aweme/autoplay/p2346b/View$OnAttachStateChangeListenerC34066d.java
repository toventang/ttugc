package com.p2082ss.android.ugc.aweme.autoplay.p2346b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34039a;
import com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34042b;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34145c;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34164k;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34176n;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34202a;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34205d;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34215e;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34218g;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34222i;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.SearchLiveView;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34246c;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41499ag;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42813a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.p3406c.AbstractC58594a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.ecom.live.C67424a;
import com.p2082ss.android.ugc.aweme.search.ecom.live.C67425b;
import com.p2082ss.android.ugc.aweme.search.ecom.live.C67426c;
import com.p2082ss.android.ugc.aweme.search.ecom.live.TopLiveProductView;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67482ak;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67573s;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67631j;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80589iu;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.autoplay.b.d */
public final class View$OnAttachStateChangeListenerC34066d extends AbstractC34164k implements View.OnAttachStateChangeListener {

    /* renamed from: g */
    public static final C34080a f80552g = new C34080a((byte) 0);

    /* renamed from: a */
    public float f80553a;

    /* renamed from: b */
    public Aweme f80554b;

    /* renamed from: c */
    public boolean f80555c;

    /* renamed from: d */
    public C34039a f80556d;

    /* renamed from: e */
    public final C51060g f80557e;

    /* renamed from: f */
    public final View f80558f;

    /* renamed from: l */
    private final AbstractC89244h f80559l = C89250i.m154773a((AbstractC89171a) new C34083d(this));

    /* renamed from: m */
    private final AbstractC89244h f80560m;

    /* renamed from: n */
    private final AbstractC89244h f80561n;

    /* renamed from: o */
    private final AbstractC89244h f80562o;

    /* renamed from: p */
    private final AbstractC89244h f80563p;

    /* renamed from: q */
    private final SearchVideoView f80564q;

    /* renamed from: r */
    private final AbstractC34145c f80565r;

    static {
        Covode.recordClassIndex(41000);
    }

    /* renamed from: n */
    private final TextView m69642n() {
        return (TextView) this.f80560m.getValue();
    }

    /* renamed from: o */
    private final TextView m69643o() {
        return (TextView) this.f80561n.getValue();
    }

    /* renamed from: p */
    private final TextView m69644p() {
        return (TextView) this.f80563p.getValue();
    }

    /* renamed from: a */
    public final SearchLiveView mo60354a() {
        return (SearchLiveView) this.f80559l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$a */
    public static final class C34080a {
        static {
            Covode.recordClassIndex(41014);
        }

        private C34080a() {
        }

        public /* synthetic */ C34080a(byte b) {
            this();
        }

        /* renamed from: a */
        public static View$OnAttachStateChangeListenerC34066d m69656a(ViewGroup viewGroup, AbstractC51043a aVar, C51060g gVar, AbstractC51044b bVar) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(gVar, "");
            C89219l.m154721d(bVar, "");
            return new View$OnAttachStateChangeListenerC34066d(C67641m.m119786a(viewGroup, R.layout.atv), aVar, gVar, bVar, viewGroup);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34164k
    /* renamed from: l */
    public final SearchVideoView mo60359l() {
        return this.f80564q;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34164k
    /* renamed from: m */
    public final AbstractC34145c mo60360m() {
        return this.f80565r;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$c */
    static final class C34082c extends AbstractC89220m implements AbstractC89171a<SmartCircleImageView> {

        /* renamed from: a */
        final /* synthetic */ View f80587a;

        static {
            Covode.recordClassIndex(41016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34082c(View view) {
            super(0);
            this.f80587a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartCircleImageView invoke() {
            View findViewById = this.f80587a.findViewById(R.id.nz);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.bytedance.lighten.loader.SmartCircleImageView");
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$e */
    static final class C34084e extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f80589a;

        static {
            Covode.recordClassIndex(41018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34084e(View view) {
            super(0);
            this.f80589a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            View findViewById = this.f80589a.findViewById(R.id.ez2);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$f */
    static final class C34085f extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f80590a;

        static {
            Covode.recordClassIndex(41019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34085f(View view) {
            super(0);
            this.f80590a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            View findViewById = this.f80590a.findViewById(R.id.dna);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$g */
    static final class C34086g extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f80591a;

        static {
            Covode.recordClassIndex(41020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34086g(View view) {
            super(0);
            this.f80591a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            View findViewById = this.f80591a.findViewById(R.id.fa1);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$d */
    static final class C34083d extends AbstractC89220m implements AbstractC89171a<SearchLiveView> {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC34066d f80588a;

        static {
            Covode.recordClassIndex(41017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34083d(View$OnAttachStateChangeListenerC34066d dVar) {
            super(0);
            this.f80588a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchLiveView invoke() {
            View findViewById = this.f80588a.itemView.findViewById(R.id.fe8);
            C89219l.m154716b(findViewById, "");
            return findViewById;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public SmartImageView mo60357j() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.bqv);
        C89219l.m154716b(smartImageView, "");
        return smartImageView;
    }

    /* renamed from: r */
    private final View m69646r() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        View findViewById = view.findViewById(R.id.cc3);
        C89219l.m154716b(findViewById, "");
        return findViewById;
    }

    /* renamed from: k */
    public final TopLiveProductView mo60358k() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TopLiveProductView topLiveProductView = (TopLiveProductView) view.findViewById(R.id.d78);
        C89219l.m154716b(topLiveProductView, "");
        return topLiveProductView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$h */
    public static final class RunnableC34087h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC34066d f80592a;

        /* renamed from: b */
        final /* synthetic */ C67568r f80593b;

        /* renamed from: c */
        final /* synthetic */ C42410g f80594c;

        /* renamed from: d */
        final /* synthetic */ User f80595d;

        static {
            Covode.recordClassIndex(41021);
        }

        RunnableC34087h(View$OnAttachStateChangeListenerC34066d dVar, C67568r rVar, C42410g gVar, User user) {
            this.f80592a = dVar;
            this.f80593b = rVar;
            this.f80594c = gVar;
            this.f80595d = user;
        }

        public final void run() {
            String str;
            String str2;
            String str3;
            String str4;
            C67542d dVar = (C67542d) C42317b.m84679a(this.f80593b).mo106487g(this.f80593b.f151319n);
            C42410g gVar = this.f80594c;
            Long l = null;
            if (gVar == null || (str4 = gVar.f98786b) == null || str4.length() == 0) {
                str = "live_card";
            } else {
                C42410g gVar2 = this.f80594c;
                if (gVar2 != null) {
                    str = gVar2.f98786b;
                } else {
                    str = null;
                }
            }
            C67542d dVar2 = (C67542d) dVar.mo106497x(str);
            User user = this.f80595d;
            if (user != null) {
                str2 = user.getRoomTitle();
            } else {
                str2 = null;
            }
            C67542d dVar3 = (C67542d) ((C67542d) ((C67542d) dVar2.mo106492s(str2)).mo106490d(Integer.valueOf(this.f80592a.getLayoutPosition()))).mo106491r("live");
            User user2 = this.f80595d;
            if (user2 != null) {
                l = Long.valueOf(user2.roomId);
            }
            C67540c v = dVar3.mo106495v(String.valueOf(l));
            if (this.f80592a.f80555c) {
                str3 = "search_live_merge_entrance";
            } else {
                str3 = "";
            }
            v.mo106452c("anchor_info", str3).mo96792f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$i */
    public static final class RunnableC34088i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67568r f80596a;

        /* renamed from: b */
        final /* synthetic */ User f80597b;

        static {
            Covode.recordClassIndex(41022);
        }

        RunnableC34088i(C67568r rVar, User user) {
            this.f80596a = rVar;
            this.f80597b = user;
        }

        public final void run() {
            Long l;
            String str;
            int i;
            C67573s sVar = (C67573s) new C67573s().mo106480a(this.f80596a.f151314i).mo106482b(this.f80596a.f151311f).mo106486f(this.f80596a.f151309d).mo106487g(this.f80596a.f151319n);
            User user = this.f80597b;
            Long l2 = null;
            if (user != null) {
                l = Long.valueOf(user.roomId);
            } else {
                l = null;
            }
            C67540c q = ((C67540c) sVar.mo106526r(String.valueOf(l)).mo106433s("general_search").mo106460p("live_cell")).mo106488q("click");
            User user2 = this.f80597b;
            if (user2 != null) {
                str = user2.getUid();
            } else {
                str = null;
            }
            C67482ak akVar = (C67482ak) q.mo106485e(str);
            User user3 = this.f80597b;
            if (user3 != null) {
                l2 = Long.valueOf(user3.roomId);
            }
            C67573s sVar2 = (C67573s) akVar.mo106434t(String.valueOf(l2)).mo106458n(this.f80596a.f151314i);
            User user4 = this.f80597b;
            if (user4 != null) {
                i = user4.getFollowStatus();
            } else {
                i = 0;
            }
            sVar2.mo106525a(i).mo96792f();
        }
    }

    public final void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        C34181a.m69857a(mo60354a().getLiveCore());
    }

    public final void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        C34181a.m69859b(mo60354a().getLiveCore());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$b */
    public static final class View$OnClickListenerC34081b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC34066d f80582a;

        /* renamed from: b */
        final /* synthetic */ Aweme f80583b;

        /* renamed from: c */
        final /* synthetic */ C34105h f80584c;

        /* renamed from: d */
        final /* synthetic */ C42815b.AbstractC42817b f80585d;

        /* renamed from: e */
        final /* synthetic */ C67568r f80586e;

        static {
            Covode.recordClassIndex(41015);
        }

        View$OnClickListenerC34081b(View$OnAttachStateChangeListenerC34066d dVar, Aweme aweme, C34105h hVar, C42815b.AbstractC42817b bVar, C67568r rVar) {
            this.f80582a = dVar;
            this.f80583b = aweme;
            this.f80584c = hVar;
            this.f80585d = bVar;
            this.f80586e = rVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C42813a aVar = C42813a.f99846a;
            Aweme aweme = this.f80583b;
            C34105h hVar = this.f80584c;
            C42815b.AbstractC42817b bVar = this.f80585d;
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            String livePlayerTag = this.f80582a.mo60354a().getLivePlayerTag();
            View view2 = this.f80582a.itemView;
            C89219l.m154716b(view2, "");
            Context context = view2.getContext();
            C89219l.m154716b(context, "");
            aVar.mo73069a(aweme, hVar, bVar, enterRoomConfig, livePlayerTag, context);
            this.f80582a.mo60356a("search_result_click", this.f80583b, this.f80586e, this.f80584c.f80637a);
            C34089e.f80598g = true;
        }
    }

    /* renamed from: a */
    public final void mo60356a(String str, Aweme aweme, C67568r rVar, C42410g gVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (rVar != null) {
            User author = aweme.getAuthor();
            if (TextUtils.equals(str, "search_result_show")) {
                C67631j.m119782a(this.itemView, new RunnableC34087h(this, rVar, gVar, author));
            } else if (TextUtils.equals(str, "search_result_click")) {
                C67542d dVar = (C67542d) C42317b.m84680b(rVar).mo106487g(rVar.f151319n);
                Long l = null;
                if (gVar == null || (str5 = gVar.f98786b) == null || str5.length() == 0) {
                    str2 = "live_card";
                } else if (gVar != null) {
                    str2 = gVar.f98786b;
                } else {
                    str2 = null;
                }
                C67542d dVar2 = (C67542d) dVar.mo106497x(str2);
                if (author != null) {
                    str3 = author.getRoomTitle();
                } else {
                    str3 = null;
                }
                C67542d dVar3 = (C67542d) ((C67542d) ((C67542d) dVar2.mo106492s(str3)).mo106490d(Integer.valueOf(getLayoutPosition()))).mo106491r("live");
                if (author != null) {
                    l = Long.valueOf(author.roomId);
                }
                C67540c v = dVar3.mo106495v(String.valueOf(l));
                if (this.f80555c) {
                    str4 = "search_live_merge_entrance";
                } else {
                    str4 = "";
                }
                ((C67496as) v.mo106452c("anchor_info", str4)).mo106440B("click_live").mo96792f();
            } else if (TextUtils.equals(str, C67573s.f151335a)) {
                C67631j.m119782a(this.itemView, new RunnableC34088i(rVar, author));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnAttachStateChangeListenerC34066d(View view, final AbstractC51043a aVar, C51060g gVar, final AbstractC51044b bVar, View view2) {
        super(view, aVar, gVar, bVar);
        C34215e dataProvider;
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view2, "");
        this.f80557e = gVar;
        this.f80558f = view2;
        this.f80560m = C89250i.m154773a((AbstractC89171a) new C34084e(view));
        this.f80561n = C89250i.m154773a((AbstractC89171a) new C34085f(view));
        this.f80562o = C89250i.m154773a((AbstractC89171a) new C34082c(view));
        this.f80563p = C89250i.m154773a((AbstractC89171a) new C34086g(view));
        this.f80553a = 1.78f;
        this.f80565r = new C34058b(mo60354a().getLiveCore());
        C34218g.m69958a(new AbstractC89172b<C34222i, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671 */

            /* renamed from: a */
            final /* synthetic */ View$OnAttachStateChangeListenerC34066d f80566a;

            static {
                Covode.recordClassIndex(41001);
            }

            {
                this.f80566a = r2;
            }

            /* renamed from: com.ss.android.ugc.aweme.autoplay.b.d$1$a */
            static final class C34077a extends AbstractC89220m implements AbstractC89171a<C51060g> {

                /* renamed from: a */
                final /* synthetic */ C51060g f80579a;

                static {
                    Covode.recordClassIndex(41011);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C34077a(C51060g gVar) {
                    super(0);
                    this.f80579a = gVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ C51060g invoke() {
                    return this.f80579a;
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C34222i iVar) {
                C34215e dataProvider;
                final C34222i iVar2 = iVar;
                C89219l.m154721d(iVar2, "");
                iVar2.mo60580a(new AbstractC89171a<C34205d>(this) {
                    /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340681 */

                    /* renamed from: a */
                    final /* synthetic */ C340671 f80569a;

                    static {
                        Covode.recordClassIndex(41002);
                    }

                    {
                        this.f80569a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C34205d invoke() {
                        return this.f80569a.f80566a.mo60354a().getLiveCore();
                    }
                });
                this.f80566a.mo60354a().setOutCorner(true);
                C51060g gVar = this.f80566a.f80557e;
                if (gVar != null) {
                    C34077a aVar = new C34077a(gVar);
                    C89219l.m154721d(aVar, "");
                    C34205d dVar = iVar2.f80913a;
                    if (!(dVar == null || (dataProvider = dVar.getDataProvider()) == null)) {
                        dataProvider.f80894c = (C51060g) aVar.invoke();
                    }
                }
                iVar2.mo60581b(new AbstractC89171a<AbstractC51043a>(this) {
                    /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340692 */

                    /* renamed from: a */
                    final /* synthetic */ C340671 f80570a;

                    static {
                        Covode.recordClassIndex(41003);
                    }

                    {
                        this.f80570a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* bridge */ /* synthetic */ AbstractC51043a invoke() {
                        return aVar;
                    }
                });
                iVar2.mo60582c(new AbstractC89171a<AbstractC51044b>(this) {
                    /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340703 */

                    /* renamed from: a */
                    final /* synthetic */ C340671 f80571a;

                    static {
                        Covode.recordClassIndex(41004);
                    }

                    {
                        this.f80571a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* bridge */ /* synthetic */ AbstractC51044b invoke() {
                        return bVar;
                    }
                });
                this.f80566a.f80556d = C34042b.m69627a(new AbstractC89172b<C34039a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340714 */

                    /* renamed from: a */
                    final /* synthetic */ C340671 f80572a;

                    static {
                        Covode.recordClassIndex(41005);
                    }

                    {
                        this.f80572a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C34039a aVar) {
                        C34039a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        aVar2.mo60328a(new AbstractC89171a<AbstractC34186b.AbstractC34192d>(this) {
                            /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340714.C340721 */

                            /* renamed from: a */
                            final /* synthetic */ C340714 f80574a;

                            static {
                                Covode.recordClassIndex(41006);
                            }

                            {
                                this.f80574a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* bridge */ /* synthetic */ AbstractC34186b.AbstractC34192d invoke() {
                                return iVar2.f80913a;
                            }
                        });
                        aVar2.mo60335d(new AbstractC89171a<Aweme>(this) {
                            /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340714.C340732 */

                            /* renamed from: a */
                            final /* synthetic */ C340714 f80575a;

                            static {
                                Covode.recordClassIndex(41007);
                            }

                            {
                                this.f80575a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* bridge */ /* synthetic */ Aweme invoke() {
                                return this.f80575a.f80572a.f80566a.f80554b;
                            }
                        });
                        aVar2.mo60333c(new AbstractC89171a<Integer>(this) {
                            /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340714.C340743 */

                            /* renamed from: a */
                            final /* synthetic */ C340714 f80576a;

                            static {
                                Covode.recordClassIndex(41008);
                            }

                            {
                                this.f80576a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ Integer invoke() {
                                return Integer.valueOf(this.f80576a.f80572a.f80566a.getAdapterPosition());
                            }
                        });
                        aVar2.mo60331b(new AbstractC89171a<AbstractC34186b.AbstractC34189c>(this) {
                            /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340714.C340754 */

                            /* renamed from: a */
                            final /* synthetic */ C340714 f80577a;

                            static {
                                Covode.recordClassIndex(41009);
                            }

                            {
                                this.f80577a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* bridge */ /* synthetic */ AbstractC34186b.AbstractC34189c invoke() {
                                return iVar2;
                            }
                        });
                        return C89391z.f203057a;
                    }
                });
                iVar2.mo60583d(new AbstractC89171a<AbstractC51064i>(this) {
                    /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340671.C340765 */

                    /* renamed from: a */
                    final /* synthetic */ C340671 f80578a;

                    static {
                        Covode.recordClassIndex(41010);
                    }

                    {
                        this.f80578a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ AbstractC51064i invoke() {
                        C34039a aVar = this.f80578a.f80566a.f80556d;
                        if (aVar == null) {
                            C89219l.m154715b();
                        }
                        return aVar;
                    }
                });
                return C89391z.f203057a;
            }
        });
        mo60354a().setMCoverView(mo60357j());
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.View$OnAttachStateChangeListenerC340782 */

            /* renamed from: a */
            final /* synthetic */ View$OnAttachStateChangeListenerC34066d f80580a;

            static {
                Covode.recordClassIndex(41012);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f80580a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f80580a.f80557e.mo86395a(this.f80580a.f80556d);
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f80580a.f80557e.mo86397b(this.f80580a.f80556d);
            }
        });
        SearchLiveView a = mo60354a();
        if (a != null && (dataProvider = a.getDataProvider()) != null) {
            dataProvider.f80904m = new AbstractC34202a(this) {
                /* class com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d.C340793 */

                /* renamed from: a */
                final /* synthetic */ View$OnAttachStateChangeListenerC34066d f80581a;

                static {
                    Covode.recordClassIndex(41013);
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b, com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34202a
                /* renamed from: a */
                public final void mo60365a() {
                    if (C67426c.m119458a()) {
                        TopLiveProductView k = this.f80581a.mo60358k();
                        if (k.f151030c > 1) {
                            k.f151033f = true;
                            k.getMHandler().removeCallbacks(k.getShowRunnable());
                            k.getMHandler().postDelayed(k.getShowRunnable(), 4000);
                        }
                    }
                    super.mo60365a();
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b, com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34202a
                public final void am_() {
                    if (C67426c.m119458a()) {
                        TopLiveProductView k = this.f80581a.mo60358k();
                        if (k.f151030c > 1) {
                            k.f151033f = false;
                            k.getMHandler().removeCallbacks(k.getShowRunnable());
                        }
                    }
                    super.am_();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f80581a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b, com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34202a
                /* renamed from: a */
                public final void mo60366a(View view, int i, int i2) {
                    super.mo60366a(view, i, i2);
                    View$OnAttachStateChangeListenerC34066d dVar = this.f80581a;
                    if (view != null) {
                        view.hashCode();
                        if (i > 0 && i2 > 0) {
                            View view2 = dVar.itemView;
                            C89219l.m154716b(view2, "");
                            SearchLiveView searchLiveView = (SearchLiveView) view2.findViewById(R.id.fe8);
                            C89219l.m154716b(searchLiveView, "");
                            int width = searchLiveView.getWidth();
                            View view3 = dVar.itemView;
                            C89219l.m154716b(view3, "");
                            SearchLiveView searchLiveView2 = (SearchLiveView) view3.findViewById(R.id.fe8);
                            C89219l.m154716b(searchLiveView2, "");
                            int height = searchLiveView2.getHeight();
                            if (width > 0 && height > 0 && view.getLayoutParams() != null) {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                float f = ((float) i2) / ((float) i);
                                float f2 = (float) height;
                                float f3 = (float) width;
                                if (f >= f2 / f3) {
                                    layoutParams2.width = (int) (f2 / f);
                                    layoutParams2.height = height;
                                } else {
                                    layoutParams2.width = width;
                                    layoutParams2.height = (int) (f3 * f);
                                }
                                layoutParams2.gravity = 17;
                                view.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo60355a(String str, Aweme aweme, C34105h hVar, C42815b.AbstractC42817b bVar, C67425b bVar2) {
        C67568r rVar;
        String str2;
        String str3;
        UrlModel urlModel;
        UrlModel urlModel2;
        Aweme aweme2;
        int i;
        boolean z;
        C67394a aVar;
        int i2;
        List<String> list;
        String str4;
        String str5;
        List<C67394a> list2;
        int i3;
        Aweme aweme3;
        int i4;
        List<C67394a> productsInfo;
        LiveRoomStruct newLiveRoomData;
        UrlModel urlModel3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aweme, "");
        if (hVar != null) {
            rVar = hVar.f80638b;
        } else {
            rVar = null;
        }
        User author = aweme.getAuthor();
        if (!(author == null || (urlModel3 = author.roomCover) == null)) {
            urlModel3.getUri();
        }
        this.f80554b = aweme;
        C34246c g = mo60348g();
        if (g != null) {
            g.f81007x = rVar;
        }
        C34246c g2 = mo60348g();
        if (g2 != null) {
            g2.mo60669b(str);
        }
        C34176n h = mo60349h();
        if (h != null) {
            h.f80824d = getPosition();
        }
        SearchLiveView a = mo60354a();
        if (rVar == null) {
            C89219l.m154715b();
        }
        a.mo60518a(aweme, rVar);
        TextView o = m69643o();
        C17191a.C17192a aVar2 = new C17191a.C17192a();
        User author2 = aweme.getAuthor();
        if (author2 == null || (str2 = author2.getRoomTitle()) == null) {
            str2 = "";
        }
        o.setText(aVar2.mo27179b(str2).f40973a);
        TextView p = m69644p();
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            str3 = author3.getSearchUserName();
        } else {
            str3 = null;
        }
        p.setText(str3);
        if (C41499ag.m83446a()) {
            ViewGroup.LayoutParams layoutParams = m69646r().getLayoutParams();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 104.0f, system.getDisplayMetrics()));
            View r = m69646r();
            View view = this.itemView;
            C89219l.m154716b(view, "");
            r.setBackground(C0643b.m2369a(view.getContext(), (int) R.drawable.bf5));
        } else if (C41499ag.m83447b() || C41499ag.m83448c()) {
            ViewGroup.LayoutParams layoutParams2 = m69646r().getLayoutParams();
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            layoutParams2.height = C89241a.m154730a(TypedValue.applyDimension(1, 136.0f, system2.getDisplayMetrics()));
            View r2 = m69646r();
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            r2.setBackground(C0643b.m2369a(view2.getContext(), (int) R.drawable.bf6));
        } else {
            ViewGroup.LayoutParams layoutParams3 = m69646r().getLayoutParams();
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            layoutParams3.height = C89241a.m154730a(TypedValue.applyDimension(1, 104.0f, system3.getDisplayMetrics()));
        }
        Aweme aweme4 = this.f80554b;
        if (aweme4 == null || (newLiveRoomData = aweme4.getNewLiveRoomData()) == null || newLiveRoomData.liveEventInfo == null) {
            TextView n = m69642n();
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            Context context = view3.getContext();
            C89219l.m154716b(context, "");
            n.setText(context.getResources().getString(R.string.ed5));
        } else {
            TextView n2 = m69642n();
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58594a j = s.mo95836j();
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            n2.setText(j.mo96052a(view4.getContext(), "pm_mt_live_events_live_consumer_live_events"));
        }
        SmartImageView q = mo60357j();
        User author4 = aweme.getAuthor();
        if (author4 != null) {
            urlModel = author4.roomCover;
        } else {
            urlModel = null;
        }
        q.setPlaceholderImage(R.drawable.b2g);
        if (urlModel != null) {
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(urlModel));
            a2.f49092E = q;
            a2.mo34186c();
        }
        User author5 = aweme.getAuthor();
        if (author5 != null) {
            urlModel2 = author5.getAvatarThumb();
        } else {
            urlModel2 = null;
        }
        C20766v a3 = C20761r.m39060a(C34735v.m70965a(urlModel2)).mo34185b(C80397em.m139369a(100)).mo34179a("AbsCellViewHolder");
        a3.f49092E = (SmartCircleImageView) this.f80562o.getValue();
        a3.mo34186c();
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        C89219l.m154721d(view5, "");
        View view6 = this.itemView;
        C89219l.m154716b(view6, "");
        Context context2 = view6.getContext();
        ViewGroup.LayoutParams layoutParams4 = view5.getLayoutParams();
        Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
        float a4 = (float) C13628n.m24504a(context2);
        if (a4 < C13628n.m24520b(context2, 375.0f)) {
            marginLayoutParams.width = (int) C13628n.m24520b(context2, 200.0f);
            marginLayoutParams.height = (int) C13628n.m24520b(context2, 356.0f);
        } else {
            float f = a4 * 0.53333336f;
            marginLayoutParams.width = (int) f;
            marginLayoutParams.height = (int) (f * this.f80553a);
        }
        View view7 = this.itemView;
        C89219l.m154716b(view7, "");
        int b = (int) C13628n.m24520b(view7.getContext(), 8.0f);
        View view8 = this.itemView;
        C89219l.m154716b(view8, "");
        ViewGroup.LayoutParams layoutParams5 = view8.getLayoutParams();
        Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginEnd(b);
        view5.setLayoutParams(marginLayoutParams);
        if (C67426c.m119458a()) {
            if (bVar2 != null) {
                aweme2 = bVar2.f151057a;
            } else {
                aweme2 = null;
            }
            if (aweme2 == null || (productsInfo = aweme2.getProductsInfo()) == null) {
                i = 0;
            } else {
                i = productsInfo.size();
            }
            if (i > 0) {
                mo60358k().setVisibility(0);
                m69643o().setVisibility(8);
                View view9 = this.itemView;
                C89219l.m154716b(view9, "");
                ViewGroup.LayoutParams layoutParams6 = view9.getLayoutParams();
                Objects.requireNonNull(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                TextView p2 = m69644p();
                int i5 = ((ViewGroup.MarginLayoutParams) layoutParams6).width;
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                int a5 = i5 - C89241a.m154730a(TypedValue.applyDimension(1, 200.0f, system4.getDisplayMetrics()));
                Resources system5 = Resources.getSystem();
                C89219l.m154709a((Object) system5, "");
                p2.setMaxWidth(a5 + C89241a.m154730a(TypedValue.applyDimension(1, 79.0f, system5.getDisplayMetrics())));
                TopLiveProductView k = mo60358k();
                View view10 = this.itemView;
                C89219l.m154716b(view10, "");
                Context context3 = view10.getContext();
                C89219l.m154716b(context3, "");
                k.setProductHandler(new C67424a(bVar2, hVar, bVar, context3, mo60354a().getLivePlayerTag(), getLayoutPosition()));
                this.f80555c = true;
                z = false;
                aVar = null;
            } else {
                mo60358k().setVisibility(8);
                z = false;
                m69643o().setVisibility(0);
                TextView p3 = m69644p();
                Resources system6 = Resources.getSystem();
                C89219l.m154709a((Object) system6, "");
                p3.setMaxWidth(C89241a.m154730a(TypedValue.applyDimension(1, 155.0f, system6.getDisplayMetrics())));
                this.f80555c = false;
                aVar = null;
                mo60358k().setProductHandler(null);
            }
            TopLiveProductView k2 = mo60358k();
            k2.f151028a = bVar2;
            if (bVar2 != null) {
                i2 = bVar2.f151058b;
            } else {
                i2 = 0;
            }
            k2.setDisplayIndex(i2);
            if (bVar2 == null || (list = bVar2.f151059c) == null) {
                list = new ArrayList<>();
            }
            k2.f151037j = list;
            if (!(bVar2 == null || (aweme3 = bVar2.f151057a) == null)) {
                k2.f151033f = z;
                k2.f151029b = aweme3.getProductsInfo();
                List<C67394a> productsInfo2 = aweme3.getProductsInfo();
                if (productsInfo2 != null) {
                    i4 = productsInfo2.size();
                } else {
                    i4 = 0;
                }
                k2.f151030c = i4;
            }
            if (k2.f151030c > 0 && (list2 = k2.f151029b) != null) {
                C67425b bVar3 = k2.f151028a;
                if (bVar3 != null) {
                    i3 = bVar3.f151058b;
                } else {
                    i3 = 0;
                }
                aVar = list2.get(i3);
            }
            k2.f151036i = aVar;
            C67394a aVar3 = k2.f151036i;
            if (!(aVar3 == null || (str5 = aVar3.f150987c) == null)) {
                k2.setCover(str5);
            }
            TuxTextView tuxTextView = k2.f151032e;
            C67394a aVar4 = k2.f151036i;
            if (aVar4 == null || (str4 = aVar4.f150990f) == null) {
                str4 = "";
            }
            tuxTextView.setText(str4);
            C67424a aVar5 = k2.f151035h;
            if (aVar5 != null) {
                k2.f151031d.setOnClickListener(new TopLiveProductView.View$OnClickListenerC67418b(aVar5, k2));
            }
        }
        mo60356a("search_result_show", aweme, rVar, hVar.f80637a);
        mo60356a(C67573s.f151335a, aweme, rVar, hVar.f80637a);
        mo60354a().setOnClickListener(new View$OnClickListenerC34081b(this, aweme, hVar, bVar, rVar));
        mo60354a().getLiveCore().setLivePlayerEntranceParam(new C11690a("general_search", "live_cell", ""));
        if (C41499ag.m83448c()) {
            C80589iu.m139729a(m69643o());
            C80589iu.m139729a(m69644p());
        }
    }
}
