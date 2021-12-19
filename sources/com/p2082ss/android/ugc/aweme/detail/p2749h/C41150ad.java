package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.model.C77386i;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.ad */
public final class C41150ad extends AbstractC41164af {

    /* renamed from: a */
    public static final C41151a f96163a = new C41151a((byte) 0);

    /* renamed from: F */
    private View f96164F;

    /* renamed from: G */
    private View f96165G;

    /* renamed from: H */
    private TuxTextView f96166H;

    /* renamed from: bx */
    private View f96167bx;

    /* renamed from: by */
    private TuxTextView f96168by;

    /* renamed from: bz */
    private View f96169bz;

    static {
        Covode.recordClassIndex(49033);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: b */
    public final void mo70406b(Aweme aweme) {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: m */
    public final void mo70387m() {
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ad$a */
    public static final class C41151a {
        static {
            Covode.recordClassIndex(49034);
        }

        private C41151a() {
        }

        public /* synthetic */ C41151a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af
    /* renamed from: o */
    public final void mo70389o() {
        TuxTextView tuxTextView = this.f96168by;
        if (tuxTextView != null) {
            tuxTextView.setText(mo70422af());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: H */
    public final void mo70402H() {
        super.mo70402H();
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        mo70394ab();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a
    public final void aF_() {
        super.aF_();
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        mo70394ab();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af
    /* renamed from: ab */
    public final void mo70394ab() {
        if (C59208ac.m108774h(mo84738bM()) || C76706a.m134282h(mo84738bM())) {
            m82861cb();
        } else {
            m82862cc();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: T */
    public final void mo70403T() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (this.f183419bv != null) {
            Activity activity = this.f183419bv;
            C89219l.m154716b(activity, "");
            if (!activity.isFinishing() && aH_() != null && mo84738bM() != null) {
                mo70394ab();
            }
        }
    }

    /* renamed from: bZ */
    private final AbstractC36413a m82859bZ() {
        if (aH_() == null) {
            return null;
        }
        Fragment aH_ = aH_();
        C89219l.m154716b(aH_, "");
        if (!aH_.isAdded()) {
            return null;
        }
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        CommentService e = CommentServiceImpl.m73664e();
        Fragment aH_2 = aH_();
        C89219l.m154716b(aH_2, "");
        View view = aH_2.getView();
        Fragment aH_3 = aH_();
        C89219l.m154716b(aH_3, "");
        return e.mo63299b(view, aH_3.getChildFragmentManager(), mo81096g(true), this, this);
    }

    /* renamed from: ca */
    private final void m82860ca() {
        long j;
        ActivityC0945e activity;
        Map<String, C77386i> map;
        C77386i iVar;
        String aid;
        Story story;
        Aweme bM = mo84738bM();
        long j2 = 0;
        if (bM == null || (story = bM.getStory()) == null) {
            j = 0;
        } else {
            j = story.getViewerCount();
        }
        Fragment aH_ = aH_();
        if (!(aH_ == null || (activity = aH_.getActivity()) == null)) {
            C77260g gVar = C77260g.f173332a;
            String str = "";
            C89219l.m154716b(activity, str);
            IStoryViewerListViewModel a = gVar.mo120136a(activity, activity);
            Aweme bM2 = mo84738bM();
            if (!(bM2 == null || (aid = bM2.getAid()) == null)) {
                str = aid;
            }
            if (!(a == null || (map = a.f171710c) == null || (iVar = map.get(str)) == null)) {
                j = (long) iVar.getTotal();
            }
        }
        if (j >= 0) {
            j2 = j;
        }
        String a2 = m82894a(j2);
        TuxTextView tuxTextView = this.f96166H;
        if (tuxTextView != null) {
            tuxTextView.setText(a2);
        }
    }

    /* renamed from: cc */
    private final void m82862cc() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (C80635y.m139811f(mo84738bM())) {
            View view = this.f96164F;
            if (!(view == null || view.getVisibility() == 8)) {
                view.setVisibility(8);
            }
            AbstractC36413a aVar = this.f96248m;
            if (aVar != null) {
                aVar.mo63685a(false);
                return;
            }
            return;
        }
        View view2 = this.f96164F;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            view2.setVisibility(8);
        }
        this.f96248m = m82859bZ();
        boolean f = C76706a.m134280f(mo84738bM());
        boolean e = C76706a.m134279e(mo84738bM());
        if (f || e) {
            AbstractC36413a aVar2 = this.f96248m;
            if (aVar2 != null) {
                aVar2.mo63685a(false);
                return;
            }
            return;
        }
        AbstractC36413a aVar3 = this.f96248m;
        if (aVar3 != null) {
            aVar3.mo63685a(true);
        }
        AbstractC36413a aVar4 = this.f96248m;
        if (aVar4 != null) {
            aVar4.mo63682a();
        }
        AbstractC36413a aVar5 = this.f96248m;
        if (aVar5 != null) {
            aVar5.mo63697k();
        }
    }

    /* renamed from: cb */
    private final void m82861cb() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (C80635y.m139811f(mo84738bM())) {
            View view = this.f96164F;
            if (!(view == null || view.getVisibility() == 8)) {
                view.setVisibility(8);
            }
            AbstractC36413a aVar = this.f96248m;
            if (aVar != null) {
                aVar.mo63685a(false);
                return;
            }
            return;
        }
        View view2 = this.f96164F;
        if (!(view2 == null || view2.getVisibility() == 0)) {
            view2.setVisibility(0);
        }
        AbstractC36413a aVar2 = this.f96248m;
        if (aVar2 != null) {
            aVar2.mo63685a(false);
        }
        if (C76706a.m134282h(mo84738bM())) {
            View view3 = this.f96165G;
            if (!(view3 == null || view3.getVisibility() == 4)) {
                view3.setVisibility(4);
            }
            View view4 = this.f96167bx;
            if (view4 != null && view4.getVisibility() != 4) {
                view4.setVisibility(4);
            }
        } else if (mo70420ad() || (C76706a.m134284j(mo84738bM()) && !C76706a.m134285k(mo84738bM()))) {
            View view5 = this.f96165G;
            if (!(view5 == null || view5.getVisibility() == 8)) {
                view5.setVisibility(8);
            }
            View view6 = this.f96167bx;
            if (!(view6 == null || view6.getVisibility() == 0)) {
                view6.setVisibility(0);
            }
            mo70389o();
        } else {
            View view7 = this.f96165G;
            if (!(view7 == null || view7.getVisibility() == 0)) {
                view7.setVisibility(0);
            }
            View view8 = this.f96167bx;
            if (!(view8 == null || view8.getVisibility() == 0)) {
                view8.setVisibility(0);
            }
            mo70389o();
            m82860ca();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: p */
    public final void mo70407p() {
        MethodCollector.m26663i(10089);
        super.mo70407p();
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (this.f183419bv == null) {
            MethodCollector.m26664o(10089);
            return;
        }
        Activity activity = this.f183419bv;
        C89219l.m154716b(activity, "");
        if (!activity.isFinishing()) {
            if (aH_() == null) {
                MethodCollector.m26664o(10089);
                return;
            }
            if (this.f96164F == null) {
                Aweme bM3 = mo84738bM();
                if (bM3 != null) {
                    bM3.getAid();
                }
                Aweme bM4 = mo84738bM();
                if (bM4 != null) {
                    Integer.valueOf(bM4.getAwemeType());
                }
                Fragment aH_ = aH_();
                C89219l.m154716b(aH_, "");
                ViewGroup viewGroup = (ViewGroup) aH_.getView();
                View view = null;
                if (viewGroup instanceof FrameLayout) {
                    view = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.ws, viewGroup, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    View findViewById = view.findViewById(R.id.ccn);
                    this.f96167bx = findViewById;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new View$OnClickListenerC41152b(this));
                    }
                    this.f96168by = (TuxTextView) view.findViewById(R.id.eqi);
                    mo70389o();
                    View findViewById2 = view.findViewById(R.id.cf0);
                    this.f96165G = findViewById2;
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new View$OnClickListenerC41153c(this));
                    }
                    this.f96166H = (TuxTextView) view.findViewById(R.id.eqn);
                    m82860ca();
                    if (mo70420ad() || (C76706a.m134284j(mo84738bM()) && !C76706a.m134285k(mo84738bM()))) {
                        View view2 = this.f96165G;
                        if (!(view2 == null || view2.getVisibility() == 8)) {
                            view2.setVisibility(8);
                        }
                    } else {
                        View view3 = this.f96165G;
                        if (!(view3 == null || view3.getVisibility() == 0)) {
                            view3.setVisibility(0);
                        }
                    }
                    if (C76706a.m134282h(mo84738bM())) {
                        View view4 = this.f96165G;
                        if (!(view4 == null || view4.getVisibility() == 4)) {
                            view4.setVisibility(4);
                        }
                        View view5 = this.f96167bx;
                        if (!(view5 == null || view5.getVisibility() == 4)) {
                            view5.setVisibility(4);
                        }
                    } else {
                        View view6 = this.f96165G;
                        if (!(view6 == null || view6.getVisibility() == 0)) {
                            view6.setVisibility(0);
                        }
                        View view7 = this.f96167bx;
                        if (!(view7 == null || view7.getVisibility() == 0)) {
                            view7.setVisibility(0);
                        }
                    }
                    View findViewById3 = view.findViewById(R.id.eju);
                    this.f96169bz = findViewById3;
                    if (findViewById3 != null) {
                        findViewById3.setOnClickListener(new View$OnClickListenerC41154d(this));
                    }
                    C89219l.m154716b(view, "");
                    view.setVisibility(8);
                    viewGroup.addView(view, layoutParams);
                }
                this.f96164F = view;
            }
            if (mo70420ad()) {
                Aweme bM5 = mo84738bM();
                if (bM5 != null) {
                    bM5.getAid();
                }
                Aweme bM6 = mo84738bM();
                if (bM6 != null) {
                    Integer.valueOf(bM6.getAwemeType());
                    MethodCollector.m26664o(10089);
                    return;
                }
                MethodCollector.m26664o(10089);
                return;
            }
            if (this.f96248m == null) {
                this.f96248m = m82859bZ();
            }
            if (mo84738bM() == null) {
                View view8 = this.f96164F;
                if (view8 != null) {
                    view8.setVisibility(8);
                }
                AbstractC36413a aVar = this.f96248m;
                if (aVar != null) {
                    aVar.mo63685a(false);
                    MethodCollector.m26664o(10089);
                    return;
                }
                MethodCollector.m26664o(10089);
                return;
            } else if (C59208ac.m108774h(mo84738bM()) || C76706a.m134282h(mo84738bM())) {
                View view9 = this.f96164F;
                if (view9 != null) {
                    view9.setVisibility(0);
                }
                AbstractC36413a aVar2 = this.f96248m;
                if (aVar2 != null) {
                    aVar2.mo63685a(false);
                    MethodCollector.m26664o(10089);
                    return;
                }
                MethodCollector.m26664o(10089);
                return;
            } else {
                View view10 = this.f96164F;
                if (view10 != null) {
                    view10.setVisibility(8);
                }
                AbstractC36413a aVar3 = this.f96248m;
                if (aVar3 != null) {
                    aVar3.mo63685a(true);
                    MethodCollector.m26664o(10089);
                    return;
                }
            }
        }
        MethodCollector.m26664o(10089);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41150ad(C49812b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b, com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
    /* renamed from: a */
    public final void mo61907a(Aweme aweme) {
        super.mo61907a(aweme);
        if (aweme != null) {
            aweme.getAid();
            Integer.valueOf(aweme.getAwemeType());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ad$d */
    static final class View$OnClickListenerC41154d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41150ad f96172a;

        static {
            Covode.recordClassIndex(49037);
        }

        View$OnClickListenerC41154d(C41150ad adVar) {
            this.f96172a = adVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                this.f96172a.mo70421ae();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b, com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
    /* renamed from: b_ */
    public final void mo61908b_(Exception exc) {
        super.mo61908b_(exc);
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ad$b */
    static final class View$OnClickListenerC41152b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41150ad f96170a;

        static {
            Covode.recordClassIndex(49035);
        }

        View$OnClickListenerC41152b(C41150ad adVar) {
            this.f96170a = adVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200) && !C76706a.m134285k(this.f96170a.mo84738bM())) {
                this.f96170a.mo70472a("click_comment_icon");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ad$c */
    static final class View$OnClickListenerC41153c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41150ad f96171a;

        static {
            Covode.recordClassIndex(49036);
        }

        View$OnClickListenerC41153c(C41150ad adVar) {
            this.f96171a = adVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200) && !C76706a.m134285k(this.f96171a.mo84738bM())) {
                this.f96171a.mo70423j("click_icon");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af
    /* renamed from: a */
    public final void mo70404a(C33942b bVar) {
        C89378p pVar;
        String str;
        if (mo84730bE() && bVar != null && (pVar = (C89378p) bVar.mo60212a()) != null) {
            Aweme bM = mo84738bM();
            if (bM != null) {
                str = bM.getAid();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, pVar.getFirst())) {
                long total = (long) ((C77386i) pVar.getSecond()).getTotal();
                if (total < 0) {
                    total = 0;
                }
                String a = m82894a(total);
                TuxTextView tuxTextView = this.f96166H;
                if (tuxTextView != null) {
                    tuxTextView.setText(a);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public final void mo59512a(List<Aweme> list, boolean z) {
        super.mo59512a(list, z);
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (list != null) {
            list.size();
        }
        mo70394ab();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: b */
    public final void mo59517b(List<Aweme> list, boolean z) {
        super.mo59517b(list, z);
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (list != null) {
            list.size();
        }
        mo70394ab();
    }
}
