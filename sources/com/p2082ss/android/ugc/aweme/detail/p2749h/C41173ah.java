package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.ah */
public final class C41173ah extends AbstractC41164af {

    /* renamed from: a */
    public static final C41174a f96204a = new C41174a((byte) 0);

    /* renamed from: F */
    private View f96205F;

    /* renamed from: G */
    private View f96206G;

    /* renamed from: H */
    private TuxTextView f96207H;

    /* renamed from: bx */
    private View f96208bx;

    static {
        Covode.recordClassIndex(49056);
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

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ah$a */
    public static final class C41174a {
        static {
            Covode.recordClassIndex(49057);
        }

        private C41174a() {
        }

        public /* synthetic */ C41174a(byte b) {
            this();
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
            m82927cb();
        } else {
            m82928cc();
        }
    }

    /* renamed from: ca */
    private final void m82926ca() {
        String str;
        AwemeStatistics statistics;
        Aweme bM = mo84738bM();
        if (bM == null || (statistics = bM.getStatistics()) == null) {
            str = null;
        } else {
            str = C53437b.m98615a(statistics.getPlayCount());
        }
        TuxTextView tuxTextView = this.f96207H;
        if (tuxTextView != null) {
            if (str == null) {
                str = "0";
            }
            tuxTextView.setText(str);
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
    private final AbstractC36413a m82925bZ() {
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
        return e.mo63278a(aH_2.getView(), mo84913bY(), mo81096g(true), this, this);
    }

    /* renamed from: cb */
    private final void m82927cb() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (C80635y.m139811f(mo84738bM())) {
            View view = this.f96205F;
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
        View view2 = this.f96205F;
        if (!(view2 == null || view2.getVisibility() == 0)) {
            view2.setVisibility(0);
        }
        AbstractC36413a aVar2 = this.f96248m;
        if (aVar2 != null) {
            aVar2.mo63685a(false);
        }
        if (C76706a.m134282h(mo84738bM())) {
            View view3 = this.f96206G;
            if (view3 != null && view3.getVisibility() != 4) {
                view3.setVisibility(4);
                return;
            }
            return;
        }
        View view4 = this.f96206G;
        if (!(view4 == null || view4.getVisibility() == 0)) {
            view4.setVisibility(0);
        }
        m82926ca();
    }

    /* renamed from: cc */
    private final void m82928cc() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        if (C80635y.m139811f(mo84738bM())) {
            View view = this.f96205F;
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
        View view2 = this.f96205F;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            view2.setVisibility(8);
        }
        this.f96248m = m82925bZ();
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

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: p */
    public final void mo70407p() {
        MethodCollector.m26663i(10457);
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
            MethodCollector.m26664o(10457);
            return;
        }
        Activity activity = this.f183419bv;
        C89219l.m154716b(activity, "");
        if (!activity.isFinishing()) {
            if (aH_() == null) {
                MethodCollector.m26664o(10457);
                return;
            }
            if (this.f96205F == null) {
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
                    view = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.ww, viewGroup, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    this.f96206G = view.findViewById(R.id.ce1);
                    this.f96207H = (TuxTextView) view.findViewById(R.id.eql);
                    m82926ca();
                    if (C76706a.m134282h(mo84738bM())) {
                        View view2 = this.f96206G;
                        if (!(view2 == null || view2.getVisibility() == 4)) {
                            view2.setVisibility(4);
                        }
                    } else {
                        View view3 = this.f96206G;
                        if (!(view3 == null || view3.getVisibility() == 0)) {
                            view3.setVisibility(0);
                        }
                    }
                    View findViewById = view.findViewById(R.id.eju);
                    this.f96208bx = findViewById;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new View$OnClickListenerC41175b(this));
                    }
                    C89219l.m154716b(view, "");
                    view.setVisibility(8);
                    viewGroup.addView(view, layoutParams);
                }
                this.f96205F = view;
            }
            if (mo70420ad()) {
                Aweme bM5 = mo84738bM();
                if (bM5 != null) {
                    bM5.getAid();
                }
                Aweme bM6 = mo84738bM();
                if (bM6 != null) {
                    Integer.valueOf(bM6.getAwemeType());
                    MethodCollector.m26664o(10457);
                    return;
                }
                MethodCollector.m26664o(10457);
                return;
            }
            if (this.f96248m == null) {
                this.f96248m = m82925bZ();
            }
            if (mo84738bM() == null) {
                View view4 = this.f96205F;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                AbstractC36413a aVar = this.f96248m;
                if (aVar != null) {
                    aVar.mo63685a(false);
                    MethodCollector.m26664o(10457);
                    return;
                }
                MethodCollector.m26664o(10457);
                return;
            } else if (C59208ac.m108774h(mo84738bM()) || C76706a.m134282h(mo84738bM())) {
                View view5 = this.f96205F;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                AbstractC36413a aVar2 = this.f96248m;
                if (aVar2 != null) {
                    aVar2.mo63685a(false);
                    MethodCollector.m26664o(10457);
                    return;
                }
                MethodCollector.m26664o(10457);
                return;
            } else {
                View view6 = this.f96205F;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                AbstractC36413a aVar3 = this.f96248m;
                if (aVar3 != null) {
                    aVar3.mo63685a(true);
                    MethodCollector.m26664o(10457);
                    return;
                }
            }
        }
        MethodCollector.m26664o(10457);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41173ah(C49812b bVar) {
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

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ah$b */
    static final class View$OnClickListenerC41175b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41173ah f96209a;

        static {
            Covode.recordClassIndex(49058);
        }

        View$OnClickListenerC41175b(C41173ah ahVar) {
            this.f96209a = ahVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                this.f96209a.mo70421ae();
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
