package com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34179o;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42435q;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42436r;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.p2766b.AbstractC41858b;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67631j;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.i */
public final class C34137i extends AbstractC34179o implements AbstractC41858b, AbstractC67459a {

    /* renamed from: i */
    public static final C34138a f80725i = new C34138a((byte) 0);

    /* renamed from: a */
    public final ViewGroup f80726a;

    /* renamed from: b */
    public final TextView f80727b;

    /* renamed from: c */
    public AwemeRawAd f80728c;

    /* renamed from: d */
    public int f80729d = 16;

    /* renamed from: e */
    public boolean f80730e;

    /* renamed from: g */
    public final AbstractC34121d f80731g;

    /* renamed from: h */
    public final C67678d f80732h;

    /* renamed from: m */
    private final AbstractC89244h f80733m;

    static {
        Covode.recordClassIndex(41071);
    }

    /* renamed from: a */
    public final C34131h mo60336a() {
        return (C34131h) this.f80733m.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: m */
    public final int mo60385m() {
        return 70;
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

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.i$a */
    public static final class C34138a {
        static {
            Covode.recordClassIndex(41072);
        }

        private C34138a() {
        }

        public /* synthetic */ C34138a(byte b) {
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
        return this.f80730e;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a
    /* renamed from: k */
    public final C67678d mo60383k() {
        return this.f80732h;
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

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.i$c */
    public static final class RunnableC34140c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34137i f80737a;

        /* renamed from: b */
        final /* synthetic */ C42435q f80738b;

        static {
            Covode.recordClassIndex(41074);
        }

        public RunnableC34140c(C34137i iVar, C42435q qVar) {
            this.f80737a = iVar;
            this.f80738b = qVar;
        }

        public final void run() {
            this.f80737a.mo60469a("search_result_show", this.f80738b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.i$e */
    public static final class RunnableC34142e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34137i f80740a;

        /* renamed from: b */
        final /* synthetic */ String f80741b;

        /* renamed from: c */
        final /* synthetic */ C42435q f80742c;

        static {
            Covode.recordClassIndex(41076);
        }

        RunnableC34142e(C34137i iVar, String str, C42435q qVar) {
            this.f80740a = iVar;
            this.f80741b = str;
            this.f80742c = qVar;
        }

        public final void run() {
            this.f80740a.f80731g.mo60411a(this.f80741b, this.f80742c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        return mo60336a().mo60489h().aZ_();
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

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.i$d */
    static final class C34141d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C34137i f80739a;

        static {
            Covode.recordClassIndex(41075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34141d(C34137i iVar) {
            super(0);
            this.f80739a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Aweme aweme;
            C34137i iVar = this.f80739a;
            List<? extends Aweme> list = iVar.mo60336a().f80763f;
            if (list == null || !(!list.isEmpty())) {
                list = null;
            }
            List<? extends Aweme> list2 = iVar.mo60336a().f80763f;
            if (list2 != null) {
                aweme = (Aweme) C89070n.m154561b((List) list2, 0);
            } else {
                aweme = null;
            }
            if (!(list == null || aweme == null)) {
                iVar.mo60336a().mo60418a(iVar.mo70878G(), (View) null, aweme, list);
            }
            ((C67496as) ((C67542d) C42317b.m84680b(iVar.mo60336a().mo60421j().f80701b).mo106487g(iVar.mo60336a().mo60423l())).mo106497x(iVar.mo60336a().mo60422k())).mo106440B("click_title").mo106479a(Integer.valueOf(iVar.mo60474D())).mo96792f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.i$f */
    static final class C34143f extends AbstractC89220m implements AbstractC89171a<C34131h> {

        /* renamed from: a */
        final /* synthetic */ C34137i f80743a;

        /* renamed from: b */
        final /* synthetic */ View f80744b;

        /* renamed from: c */
        final /* synthetic */ AbstractC51043a f80745c;

        /* renamed from: d */
        final /* synthetic */ AbstractC51044b f80746d;

        static {
            Covode.recordClassIndex(41077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34143f(C34137i iVar, View view, AbstractC51043a aVar, AbstractC51044b bVar) {
            super(0);
            this.f80743a = iVar;
            this.f80744b = view;
            this.f80745c = aVar;
            this.f80746d = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34131h invoke() {
            MethodCollector.m26663i(8136);
            this.f80743a.f80726a.removeAllViews();
            View view = this.f80744b;
            if (view != null) {
                ViewGroup viewGroup = (ViewGroup) view;
                AbstractC51043a aVar = this.f80745c;
                AbstractC51044b bVar = this.f80746d;
                C89219l.m154721d(viewGroup, "");
                C89219l.m154721d(aVar, "");
                C89219l.m154721d(bVar, "");
                C34131h hVar = new C34131h(new C41827d(C67641m.m119786a(viewGroup, R.layout.avk)), aVar, bVar);
                this.f80743a.f80726a.addView(hVar.mo60490i());
                this.f80743a.mo60476a(hVar);
                hVar.mo60486a(this.f80743a);
                MethodCollector.m26664o(8136);
                return hVar;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(8136);
            throw nullPointerException;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34179o, com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewDetachedFromWindow(view);
        this.f80730e = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.i$b */
    public static final class View$OnClickListenerC34139b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34137i f80734a;

        /* renamed from: b */
        final /* synthetic */ C42435q f80735b;

        /* renamed from: c */
        final /* synthetic */ C67568r f80736c;

        static {
            Covode.recordClassIndex(41073);
        }

        public View$OnClickListenerC34139b(C34137i iVar, C42435q qVar, C67568r rVar) {
            this.f80734a = iVar;
            this.f80735b = qVar;
            this.f80736c = rVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                Context G = this.f80734a.mo70878G();
                C42436r rVar = this.f80735b.f98894b;
                String str2 = null;
                if (rVar != null) {
                    str = rVar.f98902f;
                } else {
                    str = null;
                }
                SmartRoute withParam = SmartRouter.buildRoute(G, str).withParam("pre_search_id", this.f80736c.f151314i);
                C67674b bVar = SearchEnterViewModel.C42997a.m85830a(this.f80734a.mo70879H()).f100248a;
                if (bVar != null) {
                    str2 = bVar.getEnterSearchFrom();
                }
                withParam.withParam("enter_from", str2).open();
                this.f80734a.mo60469a("search_result_click", this.f80735b);
            }
        }
    }

    /* renamed from: a */
    public final void mo60469a(String str, C42435q qVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(qVar, "");
        if (TextUtils.equals(str, "search_result_show")) {
            C67631j.m119782a(this.itemView, new RunnableC34142e(this, str, qVar));
        } else {
            this.f80731g.mo60411a(str, qVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34137i(C67678d dVar, View view, AbstractC51043a aVar, AbstractC51044b bVar) {
        super(view, (byte) 0);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f80732h = dVar;
        View findViewById = view.findViewById(R.id.dr4);
        C89219l.m154716b(findViewById, "");
        this.f80726a = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.za);
        C89219l.m154716b(findViewById2, "");
        this.f80727b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.beh);
        C89219l.m154716b(findViewById3, "");
        this.f80731g = new C34110b((ViewStub) findViewById3, new C34141d(this));
        this.f80733m = C89250i.m154773a((AbstractC89171a) new C34143f(this, view, aVar, bVar));
    }
}
