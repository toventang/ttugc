package com.p2082ss.android.ugc.aweme.tools.draft.viewholder;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78230a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78240k;
import com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.f */
public final class C78448f extends AbstractC78442a<C78230a> {

    /* renamed from: a */
    public DmtStatusView f176274a;

    /* renamed from: b */
    public TextView f176275b;

    /* renamed from: c */
    public final AbstractC78249a f176276c;

    /* renamed from: d */
    private RelativeLayout f176277d;

    static {
        Covode.recordClassIndex(91576);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.f$a */
    static final class View$OnClickListenerC78449a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C78448f f176278a;

        static {
            Covode.recordClassIndex(91577);
        }

        View$OnClickListenerC78449a(C78448f fVar) {
            this.f176278a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f176278a.f176275b.setVisibility(8);
            if (this.f176278a.f176274a.mo27389j()) {
                this.f176278a.f176274a.mo27382d();
            }
            this.f176278a.f176274a.mo27384f();
            this.f176278a.f176276c.mo122090e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78442a
    /* renamed from: a */
    public final void mo122361a(C78230a aVar) {
        C89219l.m154721d(aVar, "");
        DmtStatusView dmtStatusView = this.f176274a;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(view.getContext()));
        int i = ((C78240k) aVar).f175733c;
        if (i == 0) {
            this.f176275b.setVisibility(8);
            if (this.f176274a.mo27389j()) {
                this.f176274a.mo27382d();
            }
            this.f176274a.mo27384f();
        } else if (i == 1) {
            this.f176274a.setVisibility(8);
            this.f176275b.setVisibility(0);
        }
        this.f176277d.setOnClickListener(new View$OnClickListenerC78449a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78448f(View view, AbstractC78249a aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f176276c = aVar;
        View findViewById = view.findViewById(R.id.e7n);
        C89219l.m154716b(findViewById, "");
        this.f176274a = (DmtStatusView) findViewById;
        View findViewById2 = view.findViewById(R.id.ez8);
        C89219l.m154716b(findViewById2, "");
        this.f176275b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dlf);
        C89219l.m154716b(findViewById3, "");
        this.f176277d = (RelativeLayout) findViewById3;
    }
}
