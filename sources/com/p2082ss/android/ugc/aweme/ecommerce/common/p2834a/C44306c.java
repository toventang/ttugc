package com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.c */
public final class C44306c implements AbstractC20595e {

    /* renamed from: a */
    public final ViewGroup f103324a;

    /* renamed from: b */
    public final AbstractC89171a<C89391z> f103325b;

    /* renamed from: c */
    private final DmtLoadingLayout f103326c;

    /* renamed from: d */
    private final View f103327d;

    static {
        Covode.recordClassIndex(52620);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e
    /* renamed from: a */
    public final View mo33842a() {
        return this.f103327d;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.a.c$a */
    static final class View$OnClickListenerC44307a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44306c f103328a;

        static {
            Covode.recordClassIndex(52621);
        }

        View$OnClickListenerC44307a(C44306c cVar) {
            this.f103328a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f103328a.f103325b.invoke();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e
    /* renamed from: a */
    public final void mo33843a(int i) {
        if (i == 241) {
            this.f103326c.setVisibility(8);
            DmtTextView dmtTextView = (DmtTextView) this.f103327d.findViewById(R.id.cg1);
            C89219l.m154716b(dmtTextView, "");
            dmtTextView.setVisibility(8);
        } else if (i == 242) {
            this.f103326c.setVisibility(0);
            DmtTextView dmtTextView2 = (DmtTextView) this.f103327d.findViewById(R.id.cg1);
            C89219l.m154716b(dmtTextView2, "");
            dmtTextView2.setVisibility(8);
        } else if (i == 243) {
            this.f103326c.setVisibility(8);
            DmtTextView dmtTextView3 = (DmtTextView) this.f103327d.findViewById(R.id.cg1);
            C89219l.m154716b(dmtTextView3, "");
            dmtTextView3.setVisibility(8);
        } else if (i == 244) {
            this.f103326c.setVisibility(8);
            DmtTextView dmtTextView4 = (DmtTextView) this.f103327d.findViewById(R.id.cg1);
            C89219l.m154716b(dmtTextView4, "");
            dmtTextView4.setVisibility(0);
            this.f103327d.setOnClickListener(new View$OnClickListenerC44307a(this));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C44306c(android.view.ViewGroup r4, p4600h.p4611f.p4612a.AbstractC89171a r5) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558973(0x7f0d023d, float:1.8743277E38)
            r0 = 0
            android.view.View r1 = com.C1764a.m5927a(r2, r1, r4, r0)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            r3.<init>(r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44306c.<init>(android.view.ViewGroup, h.f.a.a):void");
    }

    private C44306c(ViewGroup viewGroup, AbstractC89171a<C89391z> aVar, View view) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        this.f103324a = viewGroup;
        this.f103325b = aVar;
        this.f103327d = view;
        View findViewById = view.findViewById(R.id.cg3);
        C89219l.m154716b(findViewById, "");
        this.f103326c = (DmtLoadingLayout) findViewById;
    }
}
