package com.p2082ss.android.ugc.aweme.search.ecom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductCell */
public final class ProductCell extends PowerCell<C67409c> {

    /* renamed from: a */
    public SmartImageView f150963a;

    /* renamed from: b */
    TextView f150964b;

    /* renamed from: j */
    TextView f150965j;

    /* renamed from: k */
    ViewGroup f150966k;

    /* renamed from: l */
    private TextView f150967l;

    /* renamed from: m */
    private SmartImageView f150968m;

    static {
        Covode.recordClassIndex(79016);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        AbstractC67411e eVar;
        super.mo28073l();
        C67409c cVar = (C67409c) this.f42160d;
        if (cVar != null && (eVar = cVar.f151012c) != null) {
            eVar.mo106319a(cVar.f151010a, getBindingAdapterPosition());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.ProductCell$a */
    static final class View$OnClickListenerC67386a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProductCell f150969a;

        static {
            Covode.recordClassIndex(79017);
        }

        View$OnClickListenerC67386a(ProductCell productCell) {
            this.f150969a = productCell;
        }

        public final void onClick(View view) {
            AbstractC67393a aVar;
            ClickAgent.onClick(view);
            C67409c cVar = (C67409c) this.f150969a.f42160d;
            if (cVar != null && (aVar = cVar.f151011b) != null) {
                aVar.mo106300a(cVar.f151010a, this.f150969a.getBindingAdapterPosition());
            }
        }
    }

    /* renamed from: a */
    static int m119430a(View view) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 == null) {
            return 0;
        }
        return marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.awf, viewGroup, false);
        C89219l.m154716b(a, "");
        View findViewById = a.findViewById(R.id.d7_);
        C89219l.m154716b(findViewById, "");
        this.f150963a = (SmartImageView) findViewById;
        View findViewById2 = a.findViewById(R.id.d7e);
        C89219l.m154716b(findViewById2, "");
        this.f150964b = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.d7a);
        C89219l.m154716b(findViewById3, "");
        this.f150965j = (TextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.d7b);
        C89219l.m154716b(findViewById4, "");
        this.f150966k = (ViewGroup) findViewById4;
        View findViewById5 = a.findViewById(R.id.d7d);
        C89219l.m154716b(findViewById5, "");
        this.f150967l = (TextView) findViewById5;
        View findViewById6 = a.findViewById(R.id.d7c);
        C89219l.m154716b(findViewById6, "");
        this.f150968m = (SmartImageView) findViewById6;
        a.setOnClickListener(new View$OnClickListenerC67386a(this));
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C67409c cVar) {
        String str;
        String str2;
        C67409c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        super.mo23350a((AbstractC17641a) cVar2);
        TextView textView = this.f150964b;
        if (textView == null) {
            C89219l.m154710a("titleText");
        }
        textView.setText(cVar2.f151010a.f150986b);
        TextView textView2 = this.f150965j;
        if (textView2 == null) {
            C89219l.m154710a("priceText");
        }
        textView2.setText(cVar2.f151010a.f150990f);
        List<String> list = cVar2.f151010a.f150989e;
        if (!(list == null || (str2 = (String) C89070n.m154561b((List) list, 0)) == null)) {
            C20766v a = C20761r.m39061a(str2);
            SmartImageView smartImageView = this.f150963a;
            if (smartImageView == null) {
                C89219l.m154710a("coverImage");
            }
            a.f49092E = smartImageView;
            a.mo34186c();
        }
        C67394a.C67395a aVar = cVar2.f151010a.f150991g;
        UrlModel urlModel = null;
        if (aVar != null) {
            str = aVar.f150998a;
        } else {
            str = null;
        }
        C67394a.C67395a aVar2 = cVar2.f151010a.f150991g;
        if (aVar2 != null) {
            urlModel = aVar2.f150999b;
        }
        if (!(str == null || urlModel == null)) {
            ViewGroup viewGroup = this.f150966k;
            if (viewGroup == null) {
                C89219l.m154710a("tagLayout");
            }
            viewGroup.setVisibility(0);
            TextView textView3 = this.f150967l;
            if (textView3 == null) {
                C89219l.m154710a("tagText");
            }
            textView3.setText(str);
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(urlModel));
            SmartImageView smartImageView2 = this.f150968m;
            if (smartImageView2 == null) {
                C89219l.m154710a("tagIconImage");
            }
            a2.f49092E = smartImageView2;
            a2.mo34186c();
            if (C89391z.f203057a != null) {
                return;
            }
        }
        ViewGroup viewGroup2 = this.f150966k;
        if (viewGroup2 == null) {
            C89219l.m154710a("tagLayout");
        }
        viewGroup2.setVisibility(8);
    }
}
