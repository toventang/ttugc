package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.a */
public final class C41136a extends AbstractC41220y {

    /* renamed from: a */
    public final Bundle f96139a;

    /* renamed from: bx */
    private RelativeLayout f96140bx;

    /* renamed from: by */
    private View f96141by;

    /* renamed from: com.ss.android.ugc.aweme.detail.h.a$a */
    final /* synthetic */ class View$OnClickListenerC41137a implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f96142a;

        static {
            Covode.recordClassIndex(49020);
        }

        View$OnClickListenerC41137a(AbstractC89172b bVar) {
            this.f96142a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f96142a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(49019);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: o */
    public final int mo70389o() {
        return R.string.dfa;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: n */
    public final void mo70388n() {
        Activity activity = this.f183419bv;
        if (activity != null) {
            activity.setResult(-1);
        }
        Activity activity2 = this.f183419bv;
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b, com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: m */
    public final void mo70387m() {
        ViewGroup viewGroup;
        MethodCollector.m26663i(10500);
        if (this.f183419bv != null) {
            Activity activity = this.f183419bv;
            C89219l.m154716b(activity, "");
            if (!activity.isFinishing()) {
                if (aH_() == null) {
                    MethodCollector.m26664o(10500);
                    return;
                } else if (this.f96140bx != null) {
                    MethodCollector.m26664o(10500);
                    return;
                } else {
                    Fragment aH_ = aH_();
                    C89219l.m154716b(aH_, "");
                    ViewGroup viewGroup2 = (ViewGroup) aH_.getView();
                    if (viewGroup2 != null) {
                        viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.b89);
                    } else {
                        viewGroup = null;
                    }
                    View a = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wc, viewGroup, false);
                    C89219l.m154716b(a, "");
                    this.f96141by = a;
                    if (viewGroup != null) {
                        viewGroup.addView(a);
                    }
                    this.f96140bx = new RelativeLayout(this.f183419bv);
                    if (viewGroup2 == null) {
                        C89219l.m154715b();
                    }
                    viewGroup2.addView(this.f96140bx, new ViewGroup.LayoutParams(-1, -1));
                    this.f96327F = mo70386a(this.f96140bx);
                    ViewGroup viewGroup3 = (ViewGroup) this.f96327F.findViewById(R.id.ui);
                    if (viewGroup3 != null) {
                        viewGroup3.setOnClickListener(new View$OnClickListenerC41137a(new C41138b(this)));
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(12);
                    RelativeLayout relativeLayout = this.f96140bx;
                    if (relativeLayout != null) {
                        relativeLayout.addView(this.f96327F, layoutParams);
                        MethodCollector.m26664o(10500);
                        return;
                    }
                    MethodCollector.m26664o(10500);
                    return;
                }
            }
        }
        MethodCollector.m26664o(10500);
    }

    public C41136a(Bundle bundle) {
        this.f96139a = bundle;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.a$b */
    static final /* synthetic */ class C41138b extends C89217j implements AbstractC89172b<View, C89391z> {
        static {
            Covode.recordClassIndex(49021);
        }

        C41138b(C41136a aVar) {
            super(1, aVar, C41136a.class, "clickButton", "clickButton(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            ((C41136a) this.receiver).mo70388n();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: a */
    public final View mo70386a(RelativeLayout relativeLayout) {
        View a = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wb, relativeLayout, false);
        C89219l.m154716b(a, "");
        return a;
    }
}
