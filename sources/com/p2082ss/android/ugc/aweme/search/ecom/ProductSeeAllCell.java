package com.p2082ss.android.ugc.aweme.search.ecom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductSeeAllCell */
public final class ProductSeeAllCell extends PowerCell<C67410d> {
    static {
        Covode.recordClassIndex(79024);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductSeeAllCell$a */
    static final class View$OnClickListenerC67392a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProductSeeAllCell f150984a;

        static {
            Covode.recordClassIndex(79025);
        }

        View$OnClickListenerC67392a(ProductSeeAllCell productSeeAllCell) {
            this.f150984a = productSeeAllCell;
        }

        public final void onClick(View view) {
            AbstractC89171a<C89391z> aVar;
            ClickAgent.onClick(view);
            C67410d dVar = (C67410d) this.f150984a.f42160d;
            if (dVar != null && (aVar = dVar.f151013a) != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.av_, viewGroup, false);
        a.setOnClickListener(new View$OnClickListenerC67392a(this));
        C89219l.m154716b(a, "");
        return a;
    }
}
