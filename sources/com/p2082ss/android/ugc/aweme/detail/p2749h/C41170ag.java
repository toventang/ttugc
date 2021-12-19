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
import com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tcm.api.service.AbstractC77734a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.ag */
public final class C41170ag extends AbstractC41164af {

    /* renamed from: a */
    public static final C41171a f96198a = new C41171a((byte) 0);

    /* renamed from: F */
    private View f96199F;

    /* renamed from: G */
    private View f96200G;

    /* renamed from: H */
    private TuxTextView f96201H;

    /* renamed from: bx */
    private View f96202bx;

    static {
        Covode.recordClassIndex(49053);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ag$a */
    public static final class C41171a {
        static {
            Covode.recordClassIndex(49054);
        }

        private C41171a() {
        }

        public /* synthetic */ C41171a(byte b) {
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

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: p */
    public final void mo70407p() {
        super.mo70407p();
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
    }

    /* renamed from: bZ */
    private final void m82914bZ() {
        String str;
        AwemeStatistics statistics;
        Aweme bM = mo84738bM();
        if (bM == null || (statistics = bM.getStatistics()) == null) {
            str = null;
        } else {
            str = C53437b.m98615a(statistics.getPlayCount());
        }
        TuxTextView tuxTextView = this.f96201H;
        if (tuxTextView != null) {
            if (str == null) {
                str = "0";
            }
            tuxTextView.setText(str);
        }
    }

    /* renamed from: ca */
    private final void m82915ca() {
        Aweme bM = mo84738bM();
        if (bM != null) {
            bM.getAid();
        }
        Aweme bM2 = mo84738bM();
        if (bM2 != null) {
            Integer.valueOf(bM2.getAwemeType());
        }
        View view = this.f96199F;
        if (!(view == null || view.getVisibility() == 0)) {
            view.setVisibility(0);
        }
        AbstractC36413a aVar = this.f96248m;
        if (aVar != null) {
            aVar.mo63685a(false);
        }
        if (C76706a.m134282h(mo84738bM())) {
            View view2 = this.f96200G;
            if (!(view2 == null || view2.getVisibility() == 4)) {
                view2.setVisibility(4);
            }
        } else {
            View view3 = this.f96200G;
            if (!(view3 == null || view3.getVisibility() == 0)) {
                view3.setVisibility(0);
            }
            m82914bZ();
        }
        View view4 = this.f96249n;
        if (!(view4 == null || view4.getVisibility() == 8)) {
            view4.setVisibility(8);
        }
        AbstractC77734a aVar2 = this.f96251p;
        if (aVar2 != null) {
            aVar2.mo121269b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41164af
    /* renamed from: ab */
    public final void mo70394ab() {
        if (C76706a.m134278d(mo84738bM())) {
            Aweme bM = mo84738bM();
            if (bM != null) {
                bM.getAid();
            }
            Aweme bM2 = mo84738bM();
            if (bM2 != null) {
                Integer.valueOf(bM2.getAwemeType());
            }
            if (C80635y.m139811f(mo84738bM())) {
                View view = this.f96199F;
                if (!(view == null || view.getVisibility() == 8)) {
                    view.setVisibility(8);
                }
                AbstractC36413a aVar = this.f96248m;
                if (aVar != null) {
                    aVar.mo63685a(false);
                }
            } else if (C59208ac.m108774h(mo84738bM()) || C76706a.m134282h(mo84738bM())) {
                m82915ca();
            } else {
                Aweme bM3 = mo84738bM();
                if (bM3 != null) {
                    bM3.getAid();
                }
                Aweme bM4 = mo84738bM();
                if (bM4 != null) {
                    Integer.valueOf(bM4.getAwemeType());
                }
                View view2 = this.f96199F;
                if (!(view2 == null || view2.getVisibility() == 8)) {
                    view2.setVisibility(8);
                }
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
        } else {
            View view3 = this.f96199F;
            if (view3 != null && view3.getVisibility() != 8) {
                view3.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: m */
    public final void mo70387m() {
        MethodCollector.m26663i(10096);
        super.mo70387m();
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
            if (!activity.isFinishing()) {
                if (aH_() == null) {
                    MethodCollector.m26664o(10096);
                    return;
                }
                Boolean bool = this.f114781aI;
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    MethodCollector.m26664o(10096);
                    return;
                }
                if (this.f96199F == null) {
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
                        this.f96200G = view.findViewById(R.id.ce1);
                        this.f96201H = (TuxTextView) view.findViewById(R.id.eql);
                        m82914bZ();
                        if (C76706a.m134282h(mo84738bM())) {
                            View view2 = this.f96200G;
                            if (!(view2 == null || view2.getVisibility() == 4)) {
                                view2.setVisibility(4);
                            }
                        } else {
                            View view3 = this.f96200G;
                            if (!(view3 == null || view3.getVisibility() == 0)) {
                                view3.setVisibility(0);
                            }
                        }
                        View findViewById = view.findViewById(R.id.eju);
                        this.f96202bx = findViewById;
                        if (findViewById != null) {
                            findViewById.setOnClickListener(new View$OnClickListenerC41172b(this));
                        }
                        C89219l.m154716b(view, "");
                        view.setVisibility(8);
                        viewGroup.addView(view, layoutParams);
                    }
                    this.f96199F = view;
                }
                MethodCollector.m26664o(10096);
                return;
            }
        }
        MethodCollector.m26664o(10096);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.ag$b */
    static final class View$OnClickListenerC41172b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41170ag f96203a;

        static {
            Covode.recordClassIndex(49055);
        }

        View$OnClickListenerC41172b(C41170ag agVar) {
            this.f96203a = agVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f96203a.mo70421ae();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41170ag(C49812b bVar) {
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

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: b */
    public final void mo70406b(Aweme aweme) {
        if (aweme != null) {
            aweme.getAid();
            Integer.valueOf(aweme.getAwemeType());
        }
        super.mo70406b(aweme);
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
