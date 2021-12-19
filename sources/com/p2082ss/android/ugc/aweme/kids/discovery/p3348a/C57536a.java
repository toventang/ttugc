package com.p2082ss.android.ugc.aweme.kids.discovery.p3348a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57544e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.a */
public class C57536a extends C57544e.AbstractC57547b {

    /* renamed from: a */
    public DmtStatusView f131345a;

    static {
        Covode.recordClassIndex(67486);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.a$b */
    public static final class View$OnAttachStateChangeListenerC57538b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ DmtStatusView f131347a;

        static {
            Covode.recordClassIndex(67488);
        }

        public final void onViewDetachedFromWindow(View view) {
        }

        View$OnAttachStateChangeListenerC57538b(DmtStatusView dmtStatusView) {
            this.f131347a = dmtStatusView;
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f131347a.mo27389j() && view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.a$a */
    static final class View$OnClickListenerC57537a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57544e f131346a;

        static {
            Covode.recordClassIndex(67487);
        }

        View$OnClickListenerC57537a(C57544e eVar) {
            this.f131346a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C57544e eVar = this.f131346a;
            eVar.mo94896b(1);
            eVar.mo94894a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57544e.AbstractC57547b
    /* renamed from: a */
    public void mo94889a(int i) {
        DmtStatusView dmtStatusView;
        if (i == 0) {
            DmtStatusView dmtStatusView2 = this.f131345a;
            if (dmtStatusView2 != null) {
                dmtStatusView2.setStatus(-1);
            }
        } else if (i == 1) {
            DmtStatusView dmtStatusView3 = this.f131345a;
            if (dmtStatusView3 != null) {
                dmtStatusView3.setStatus(0);
            }
        } else if (i == 2) {
            DmtStatusView dmtStatusView4 = this.f131345a;
            if (dmtStatusView4 != null) {
                dmtStatusView4.setStatus(1);
            }
        } else if (i == 3 && (dmtStatusView = this.f131345a) != null) {
            dmtStatusView.setStatus(2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57544e.AbstractC57547b
    /* renamed from: a */
    public final View mo94888a(ViewGroup viewGroup, C57544e eVar) {
        MethodCollector.m26663i(1658);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(eVar, "");
        DmtStatusView dmtStatusView = new DmtStatusView(viewGroup.getContext());
        dmtStatusView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) C13628n.m24520b(viewGroup.getContext(), 60.0f)));
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, (ViewGroup) null);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setGravity(17);
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, (ViewGroup) null);
            if (inflate2 != null) {
                TextView textView2 = (TextView) inflate2;
                textView2.setText(R.string.cxh);
                textView2.setOnClickListener(new View$OnClickListenerC57537a(eVar));
                textView2.setGravity(17);
                DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(viewGroup.getContext());
                dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                dmtLoadingLayout.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC57538b(dmtStatusView));
                dmtStatusView.setBuilder(new DmtStatusView.C17269a(viewGroup.getContext()).mo27403a(dmtLoadingLayout).mo27406b(textView).mo27408c(textView2));
                this.f131345a = dmtStatusView;
                MethodCollector.m26664o(1658);
                return dmtStatusView;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            MethodCollector.m26664o(1658);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        MethodCollector.m26664o(1658);
        throw nullPointerException2;
    }
}
