package com.p2082ss.android.ugc.aweme.hybridkit.p3059b;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15511g;
import com.bytedance.hybrid.spark.p1107a.AbstractC15512h;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.hybridkit.b.a */
public final class C53398a implements AbstractC15512h {

    /* renamed from: a */
    public AbstractC15511g f122607a;

    /* renamed from: b */
    private DmtStatusView f122608b;

    static {
        Covode.recordClassIndex(62964);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15512h
    /* renamed from: a */
    public final View mo25253a() {
        DmtStatusView dmtStatusView = this.f122608b;
        if (dmtStatusView == null) {
            C89219l.m154710a("statusView");
        }
        dmtStatusView.mo27384f();
        DmtStatusView dmtStatusView2 = this.f122608b;
        if (dmtStatusView2 == null) {
            C89219l.m154710a("statusView");
        }
        return dmtStatusView2;
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.b.a$a */
    static final class View$OnClickListenerC53399a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53398a f122609a;

        static {
            Covode.recordClassIndex(62965);
        }

        View$OnClickListenerC53399a(C53398a aVar) {
            this.f122609a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC15511g gVar = this.f122609a.f122607a;
            if (gVar != null) {
                gVar.mo25252b();
            }
        }
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15512h
    /* renamed from: a */
    public final View mo25254a(AbstractC15511g gVar) {
        C89219l.m154721d(gVar, "");
        this.f122607a = gVar;
        DmtStatusView dmtStatusView = this.f122608b;
        if (dmtStatusView == null) {
            C89219l.m154710a("statusView");
        }
        dmtStatusView.mo27387h();
        DmtStatusView dmtStatusView2 = this.f122608b;
        if (dmtStatusView2 == null) {
            C89219l.m154710a("statusView");
        }
        return dmtStatusView2;
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15512h
    /* renamed from: a */
    public final void mo25255a(Context context) {
        C89219l.m154721d(context, "");
        this.f122608b = new DmtStatusView(context);
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(context).mo27400a(2131233181, R.string.gzs, R.string.gzr, R.string.gzy, new View$OnClickListenerC53399a(this));
        DmtStatusView dmtStatusView = this.f122608b;
        if (dmtStatusView == null) {
            C89219l.m154710a("statusView");
        }
        dmtStatusView.setBuilder(a);
    }
}
