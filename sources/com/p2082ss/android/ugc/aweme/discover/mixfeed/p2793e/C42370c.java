package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34202a;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.C34215e;
import com.p2082ss.android.ugc.aweme.autoplay.player.live.SearchLiveView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42312e;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42318c;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b;
import com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42813a;
import com.p2082ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67498at;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c */
public final class C42370c extends C34043c implements AbstractC41858b, AbstractC67459a {

    /* renamed from: A */
    private static float f98707A;

    /* renamed from: B */
    private static float f98708B;

    /* renamed from: C */
    private static float f98709C;

    /* renamed from: D */
    private static float f98710D;

    /* renamed from: E */
    private static float f98711E;

    /* renamed from: p */
    public static final C42372a f98712p = new C42372a((byte) 0);

    /* renamed from: z */
    private static float f98713z;

    /* renamed from: e */
    public User f98714e;

    /* renamed from: f */
    public C42410g f98715f;

    /* renamed from: g */
    public boolean f98716g;

    /* renamed from: i */
    public C42411h f98717i;

    /* renamed from: m */
    public C50196d f98718m;

    /* renamed from: n */
    public final boolean f98719n;

    /* renamed from: o */
    public final View$OnAttachStateChangeListenerC41864g f98720o;

    /* renamed from: q */
    private final AbstractC89244h f98721q;

    /* renamed from: r */
    private final AbstractC89244h f98722r;

    /* renamed from: s */
    private final AbstractC89244h f98723s;

    /* renamed from: t */
    private final AbstractC89244h f98724t;

    /* renamed from: u */
    private final AbstractC89244h f98725u;

    /* renamed from: v */
    private final AbstractC89244h f98726v;

    /* renamed from: w */
    private final AbstractC89244h f98727w;

    /* renamed from: x */
    private final AbstractC89244h f98728x;

    /* renamed from: y */
    private final AbstractC89244h f98729y;

    /* renamed from: C */
    public final AvatarImageWithLive mo71570C() {
        return (AvatarImageWithLive) this.f98722r.getValue();
    }

    /* renamed from: D */
    public final LiveCircleView mo71571D() {
        return (LiveCircleView) this.f98723s.getValue();
    }

    /* renamed from: J */
    public final TextView mo71572J() {
        return (TextView) this.f98724t.getValue();
    }

    /* renamed from: K */
    public final TextView mo71573K() {
        return (TextView) this.f98725u.getValue();
    }

    /* renamed from: L */
    public final SearchLiveView mo71574L() {
        return (SearchLiveView) this.f98726v.getValue();
    }

    /* renamed from: M */
    public final View mo71575M() {
        return (View) this.f98727w.getValue();
    }

    /* renamed from: N */
    public final SmartImageView mo71576N() {
        return (SmartImageView) this.f98728x.getValue();
    }

    /* renamed from: O */
    public final TextView mo71577O() {
        return (TextView) this.f98729y.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c, com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34055d
    public final void an_() {
    }

    /* renamed from: g */
    public final TextView mo71579g() {
        return (TextView) this.f98721q.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: k */
    public final C67678d mo60383k() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: m */
    public final int mo60385m() {
        return 8;
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

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$a */
    public static final class C42372a {
        static {
            Covode.recordClassIndex(50317);
        }

        private C42372a() {
        }

        public /* synthetic */ C42372a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
        mo60344e();
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
        return this.f98716g;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return this.itemView;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: l */
    public final View mo60384l() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return view;
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

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$j */
    static final class C42381j extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ View f98739a;

        static {
            Covode.recordClassIndex(50326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42381j(View view) {
            super(0);
            this.f98739a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f98739a.findViewById(R.id.ca8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$k */
    static final class C42382k extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ View f98740a;

        static {
            Covode.recordClassIndex(50327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42382k(View view) {
            super(0);
            this.f98740a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f98740a.findViewById(R.id.afx);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$l */
    static final class C42383l extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f98741a;

        static {
            Covode.recordClassIndex(50328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42383l(View view) {
            super(0);
            this.f98741a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f98741a.findViewById(R.id.ez2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$m */
    static final class C42384m extends AbstractC89220m implements AbstractC89171a<SearchLiveView> {

        /* renamed from: a */
        final /* synthetic */ View f98742a;

        static {
            Covode.recordClassIndex(50329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42384m(View view) {
            super(0);
            this.f98742a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchLiveView invoke() {
            return this.f98742a.findViewById(R.id.fe8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$n */
    static final class C42385n extends AbstractC89220m implements AbstractC89171a<AvatarImageWithLive> {

        /* renamed from: a */
        final /* synthetic */ View f98743a;

        static {
            Covode.recordClassIndex(50330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42385n(View view) {
            super(0);
            this.f98743a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageWithLive invoke() {
            return this.f98743a.findViewById(R.id.f_g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$o */
    static final class C42386o extends AbstractC89220m implements AbstractC89171a<LiveCircleView> {

        /* renamed from: a */
        final /* synthetic */ View f98744a;

        static {
            Covode.recordClassIndex(50331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42386o(View view) {
            super(0);
            this.f98744a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveCircleView invoke() {
            return this.f98744a.findViewById(R.id.fa0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$p */
    static final class C42387p extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f98745a;

        static {
            Covode.recordClassIndex(50332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42387p(View view) {
            super(0);
            this.f98745a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f98745a.findViewById(R.id.eyq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$q */
    static final class C42388q extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f98746a;

        static {
            Covode.recordClassIndex(50333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42388q(View view) {
            super(0);
            this.f98746a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f98746a.findViewById(R.id.f6v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$r */
    static final class C42389r extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ View f98747a;

        static {
            Covode.recordClassIndex(50334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42389r(View view) {
            super(0);
            this.f98747a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f98747a.findViewById(R.id.cks);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d, com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34043c, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34189c, com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34055d
    public final boolean aZ_() {
        return mo71574L().aZ_();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b
    /* renamed from: t */
    public final AbstractC34186b.AbstractC34192d mo60392t() {
        return mo71574L().getLiveCore();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$d */
    public static final class RunnableC42375d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42370c f98733a;

        static {
            Covode.recordClassIndex(50320);
        }

        public RunnableC42375d(C42370c cVar) {
            this.f98733a = cVar;
        }

        public final void run() {
            C42318c.m84683a("others_photo", C42370c.m84732a(this.f98733a), this.f98733a.mo70877F());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$i */
    public static final class RunnableC42380i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42370c f98738a;

        static {
            Covode.recordClassIndex(50325);
        }

        public RunnableC42380i(C42370c cVar) {
            this.f98738a = cVar;
        }

        public final void run() {
            C42318c.m84683a("live_cover", C42370c.m84732a(this.f98738a), this.f98738a.mo70877F());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
        mo71574L().getLiveCore().setLivePlayerEntranceParam(new C11690a("general_search", "live_cover", ""));
        mo60340a(0);
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

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$g */
    public static final class RunnableC42378g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42370c f98736a;

        static {
            Covode.recordClassIndex(50323);
        }

        public RunnableC42378g(C42370c cVar) {
            this.f98736a = cVar;
        }

        public final void run() {
            C67568r F = this.f98736a.mo70877F();
            String valueOf = String.valueOf(C42370c.m84732a(this.f98736a).roomId);
            C89219l.m154721d(F, "");
            C89219l.m154721d(valueOf, "");
            String str = F.f151317l;
            String str2 = F.f151315j;
            String str3 = F.f151314i;
            String str4 = F.f151311f;
            C67540c a = ((C67542d) new C67498at(F).mo106480a(str3).mo106482b(str4).mo106483c(str).mo106484d(str2).mo106459o(F.f151312g)).mo106496w("0").mo106479a(Integer.valueOf(F.f151318m));
            a.mo106452c("room_id", String.valueOf(valueOf));
            ((C67542d) a.mo106487g(valueOf)).mo106497x("live_card").mo96792f();
        }
    }

    static {
        Covode.recordClassIndex(50315);
        Context a = C17867d.m33078a();
        f98713z = C13628n.m24520b(a, 2.0f);
        f98707A = C13628n.m24520b(a, 16.0f);
        f98709C = C13628n.m24520b(a, 8.0f);
        f98708B = C13628n.m24520b(a, 20.0f);
        f98710D = C13628n.m24520b(a, 20.0f);
        f98711E = C13628n.m24520b(a, 52.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$h */
    public static final class RunnableC42379h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42370c f98737a;

        static {
            Covode.recordClassIndex(50324);
        }

        public RunnableC42379h(C42370c cVar) {
            this.f98737a = cVar;
        }

        public final void run() {
            C67568r F = this.f98737a.mo70877F();
            C42410g gVar = this.f98737a.f98715f;
            if (gVar == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(F, "");
            C89219l.m154721d(gVar, "");
            String str = F.f151317l;
            String str2 = F.f151315j;
            String str3 = F.f151314i;
            String str4 = F.f151311f;
            ((C67542d) ((C67542d) new C67498at(F).mo106480a(str3).mo106482b(str4).mo106483c(str).mo106484d(str2).mo106459o(F.f151312g)).mo106496w("1")).mo106497x(gVar.f98786b).mo106479a(Integer.valueOf(F.f151318m)).mo106487g(F.f151319n).mo96792f();
            C67568r F2 = this.f98737a.mo70877F();
            C42410g gVar2 = this.f98737a.f98715f;
            if (gVar2 == null) {
                C89219l.m154715b();
            }
            String valueOf = String.valueOf(C42370c.m84732a(this.f98737a).roomId);
            String roomTitle = C42370c.m84732a(this.f98737a).getRoomTitle();
            C89219l.m154716b(roomTitle, "");
            C89219l.m154721d(F2, "");
            C89219l.m154721d(gVar2, "");
            C89219l.m154721d(valueOf, "");
            C89219l.m154721d(roomTitle, "");
            String str5 = F2.f151314i;
            String str6 = F2.f151311f;
            ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67542d) ((C67542d) new C67498at(F2).mo106480a(str5).mo106482b(str6).mo106459o(F2.f151312g)).mo106496w("1").mo106479a(Integer.valueOf(F2.f151318m))).mo106495v(valueOf)).mo106491r("live")).mo106490d((Integer) 0)).mo106492s(roomTitle).mo106487g(F2.f151319n)).mo106497x(gVar2.f98786b).mo96792f();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ User m84732a(C42370c cVar) {
        User user = cVar.f98714e;
        if (user == null) {
            C89219l.m154710a("mUser");
        }
        return user;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$b */
    public static final class View$OnClickListenerC42373b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42370c f98731a;

        static {
            Covode.recordClassIndex(50318);
        }

        public View$OnClickListenerC42373b(C42370c cVar) {
            this.f98731a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f98731a.mo71578b("live_cover");
            if (this.f98731a.f98715f == null) {
                C42318c.m84682a(this.f98731a.mo70877F(), "click_live", String.valueOf(C42370c.m84732a(this.f98731a).roomId));
                return;
            }
            C67568r F = this.f98731a.mo70877F();
            C42410g gVar = this.f98731a.f98715f;
            if (gVar == null) {
                C89219l.m154715b();
            }
            String valueOf = String.valueOf(C42370c.m84732a(this.f98731a).roomId);
            String roomTitle = C42370c.m84732a(this.f98731a).getRoomTitle();
            C89219l.m154716b(roomTitle, "");
            C42318c.m84681a(F, "click_live", gVar, valueOf, roomTitle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$c */
    public static final class View$OnClickListenerC42374c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42370c f98732a;

        static {
            Covode.recordClassIndex(50319);
        }

        public View$OnClickListenerC42374c(C42370c cVar) {
            this.f98732a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f98732a.mo71578b("others_photo");
            if (this.f98732a.f98715f == null) {
                C42318c.m84682a(this.f98732a.mo70877F(), "click_into_live", String.valueOf(C42370c.m84732a(this.f98732a).roomId));
                return;
            }
            C67568r F = this.f98732a.mo70877F();
            C42410g gVar = this.f98732a.f98715f;
            if (gVar == null) {
                C89219l.m154715b();
            }
            String valueOf = String.valueOf(C42370c.m84732a(this.f98732a).roomId);
            String roomTitle = C42370c.m84732a(this.f98732a).getRoomTitle();
            C89219l.m154716b(roomTitle, "");
            C42318c.m84681a(F, "click_into_live", gVar, valueOf, roomTitle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$f */
    public static final class View$OnClickListenerC42377f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42370c f98735a;

        static {
            Covode.recordClassIndex(50322);
        }

        public View$OnClickListenerC42377f(C42370c cVar) {
            this.f98735a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f98735a.mo71578b("live_cover");
            if (this.f98735a.f98715f == null) {
                C42318c.m84682a(this.f98735a.mo70877F(), "click_live", String.valueOf(C42370c.m84732a(this.f98735a).roomId));
                return;
            }
            C67568r F = this.f98735a.mo70877F();
            C42410g gVar = this.f98735a.f98715f;
            if (gVar == null) {
                C89219l.m154715b();
            }
            String valueOf = String.valueOf(C42370c.m84732a(this.f98735a).roomId);
            String roomTitle = C42370c.m84732a(this.f98735a).getRoomTitle();
            C89219l.m154716b(roomTitle, "");
            C42318c.m84681a(F, "click_live", gVar, valueOf, roomTitle);
        }
    }

    /* renamed from: b */
    public final void mo71578b(String str) {
        User user = this.f98714e;
        if (user == null) {
            C89219l.m154710a("mUser");
        }
        long j = user.roomId;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        ArrayList arrayList2 = new ArrayList();
        User user2 = this.f98714e;
        if (user2 == null) {
            C89219l.m154710a("mUser");
        }
        arrayList2.add(new RoomInfo(j, user2.getUid()));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28232b.f28280x = mo70877F().f151314i;
        enterRoomConfig.f28232b.f28281y = mo70877F().f151311f;
        enterRoomConfig.f28232b.f28244A = mo70877F().f151309d;
        enterRoomConfig.f28232b.f28282z = mo70877F().f151319n;
        if (this.f98715f != null) {
            EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
            User user3 = this.f98714e;
            if (user3 == null) {
                C89219l.m154710a("mUser");
            }
            logData.f28245B = String.valueOf(user3.roomId);
        }
        enterRoomConfig.f28232b.f28257a = mo70877F().f151314i;
        EnterRoomConfig.LogData logData2 = enterRoomConfig.f28232b;
        User user4 = this.f98714e;
        if (user4 == null) {
            C89219l.m154710a("mUser");
        }
        logData2.f28258b = user4.getUid();
        enterRoomConfig.f28233c.f28295L = str;
        C42813a.m85511a(mo70878G(), j, arrayList, arrayList2, enterRoomConfig, "general_search");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.c$e */
    public static final class View$OnClickListenerC42376e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42370c f98734a;

        static {
            Covode.recordClassIndex(50321);
        }

        public View$OnClickListenerC42376e(C42370c cVar) {
            this.f98734a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C42370c cVar = this.f98734a;
            SmartRoute buildRoute = SmartRouter.buildRoute(cVar.mo70878G(), "aweme://user/profile/");
            User user = cVar.f98714e;
            if (user == null) {
                C89219l.m154710a("mUser");
            }
            SmartRoute withParam = buildRoute.withParam("uid", user.getUid());
            User user2 = cVar.f98714e;
            if (user2 == null) {
                C89219l.m154710a("mUser");
            }
            SmartRoute withParam2 = withParam.withParam("sec_user_id", user2.getSecUid()).withParam("enter_from", "general_search").withParam("previous_page", "general_search").withParam("extra_from_pre_page", "general_search").withParam("extra_from_event_enter_from", "general_search");
            User user3 = cVar.f98714e;
            if (user3 == null) {
                C89219l.m154710a("mUser");
            }
            SmartRoute withParam3 = withParam2.withParam("enter_from_request_id", user3.getRequestId()).withParam("extra_previous_page_position", "main_head");
            User user4 = cVar.f98714e;
            if (user4 == null) {
                C89219l.m154710a("mUser");
            }
            withParam3.withParam("search_request_id", user4.getRequestId()).open();
            C42452d.m84859a(cVar.itemView, cVar.mo70877F().f151319n, cVar.mo70877F().f151318m, null);
            if (this.f98734a.f98715f == null) {
                C42318c.m84682a(this.f98734a.mo70877F(), "click_info", String.valueOf(C42370c.m84732a(this.f98734a).roomId));
            } else {
                C67568r F = this.f98734a.mo70877F();
                C42410g gVar = this.f98734a.f98715f;
                if (gVar == null) {
                    C89219l.m154715b();
                }
                String valueOf = String.valueOf(C42370c.m84732a(this.f98734a).roomId);
                String roomTitle = C42370c.m84732a(this.f98734a).getRoomTitle();
                C89219l.m154716b(roomTitle, "");
                C42318c.m84681a(F, "click_info", gVar, valueOf, roomTitle);
            }
            C67568r F2 = this.f98734a.mo70877F();
            User a = C42370c.m84732a(this.f98734a);
            Context G = this.f98734a.mo70878G();
            C89219l.m154721d(F2, "");
            C89219l.m154721d(a, "");
            C89219l.m154721d(G, "");
            String str = F2.f151314i;
            String str2 = F2.f151311f;
            if (F2.f151320o == 1) {
                C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "general_search").mo59983a("search_id", str).mo59983a("search_result_id", F2.f151319n).mo59983a("search_keyword", str2).mo59983a("to_user_id", a.getUid()).mo59982a("list_item_id", F2.f151304E).mo59983a("enter_method", "click_search_result").mo59983a("user_tag", C42312e.m84674a(a)).mo59983a("list_item_id", F2.f151321p).f79943a);
            } else {
                C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "general_search").mo59983a("search_id", str).mo59983a("impr_id", F2.f151315j).mo59983a("search_result_id", F2.f151319n).mo59983a("search_keyword", str2).mo59983a("to_user_id", a.getUid()).mo59983a("enter_method", "click_search_result").mo59983a("user_tag", C42312e.m84674a(a)).f79943a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42370c(View view, AbstractC51043a aVar, AbstractC51044b bVar, View$OnAttachStateChangeListenerC41864g gVar) {
        super(view, aVar, bVar);
        C34215e dataProvider;
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f98720o = gVar;
        this.f98721q = C89250i.m154773a((AbstractC89171a) new C42389r(view));
        this.f98722r = C89250i.m154773a((AbstractC89171a) new C42385n(view));
        this.f98723s = C89250i.m154773a((AbstractC89171a) new C42386o(view));
        this.f98724t = C89250i.m154773a((AbstractC89171a) new C42388q(view));
        this.f98725u = C89250i.m154773a((AbstractC89171a) new C42387p(view));
        this.f98726v = C89250i.m154773a((AbstractC89171a) new C42384m(view));
        this.f98727w = C89250i.m154773a((AbstractC89171a) new C42381j(view));
        this.f98728x = C89250i.m154773a((AbstractC89171a) new C42382k(view));
        this.f98729y = C89250i.m154773a((AbstractC89171a) new C42383l(view));
        SearchLiveView L = mo71574L();
        if (L != null && (dataProvider = L.getDataProvider()) != null) {
            dataProvider.f80904m = new AbstractC34202a(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42370c.C423711 */

                /* renamed from: a */
                final /* synthetic */ C42370c f98730a;

                static {
                    Covode.recordClassIndex(50316);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f98730a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34203b, com.p2082ss.android.ugc.aweme.autoplay.player.live.AbstractC34202a
                /* renamed from: a */
                public final void mo60366a(View view, int i, int i2) {
                    super.mo60366a(view, i, i2);
                    C42370c cVar = this.f98730a;
                    if (view != null) {
                        view.hashCode();
                        if (i > 0 && i2 > 0) {
                            int width = cVar.mo71575M().getWidth();
                            int height = cVar.mo71575M().getHeight();
                            if (width > 0 && height > 0 && view.getLayoutParams() != null) {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                float f = ((float) i2) / ((float) i);
                                float f2 = (float) height;
                                if (f >= f2 / ((float) width)) {
                                    layoutParams2.width = (int) (f2 / f);
                                    layoutParams2.height = height;
                                } else {
                                    layoutParams2.width = width;
                                    layoutParams2.height = height;
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
}
