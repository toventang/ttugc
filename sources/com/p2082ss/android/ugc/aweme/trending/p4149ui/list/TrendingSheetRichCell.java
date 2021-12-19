package com.p2082ss.android.ugc.aweme.trending.p4149ui.list;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.trending.p4149ui.C79110f;
import com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79130c;
import com.p2082ss.android.ugc.aweme.utils.C80554hv;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetRichCell */
public final class TrendingSheetRichCell extends PowerCell<C79130c> {

    /* renamed from: a */
    public static final int f177803a;

    /* renamed from: m */
    private static final C79115b f177804m = new C79115b((byte) 0);

    /* renamed from: b */
    private TextView f177805b;

    /* renamed from: j */
    private TextView f177806j;

    /* renamed from: k */
    private TextView f177807k;

    /* renamed from: l */
    private SmartImageView f177808l;

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetRichCell$b */
    static final class C79115b {
        static {
            Covode.recordClassIndex(92298);
        }

        private C79115b() {
        }

        public /* synthetic */ C79115b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        C67590l lVar;
        C79130c cVar;
        C79130c.AbstractC79131a aVar;
        super.mo28073l();
        C79130c cVar2 = (C79130c) this.f42160d;
        if (cVar2 != null && (lVar = cVar2.f177838a) != null && (cVar = (C79130c) this.f42160d) != null && (aVar = cVar.f177840c) != null) {
            aVar.mo122919a(true, lVar);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: m */
    public final void mo28074m() {
        C67590l lVar;
        C79130c cVar;
        C79130c.AbstractC79131a aVar;
        super.mo28074m();
        C79130c cVar2 = (C79130c) this.f42160d;
        if (cVar2 != null && (lVar = cVar2.f177838a) != null && (cVar = (C79130c) this.f42160d) != null && (aVar = cVar.f177840c) != null) {
            aVar.mo122919a(false, lVar);
        }
    }

    static {
        Covode.recordClassIndex(92296);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f177803a = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetRichCell$c */
    static final class View$OnClickListenerC79116c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79130c f177811a;

        static {
            Covode.recordClassIndex(92299);
        }

        View$OnClickListenerC79116c(C79130c cVar) {
            this.f177811a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C79130c.AbstractC79131a aVar = this.f177811a.f177840c;
            if (aVar != null) {
                C89219l.m154716b(view, "");
                aVar.mo122918a(view, this.f177811a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetRichCell$a */
    static final class C79114a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f177809a;

        /* renamed from: b */
        final /* synthetic */ TextView f177810b;

        static {
            Covode.recordClassIndex(92297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79114a(int i, TextView textView) {
            super(1);
            this.f177809a = i;
            this.f177810b = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f177809a;
            aVar2.f54434d = Integer.valueOf(C0643b.m2378c(this.f177810b.getContext(), R.color.bh));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b49, viewGroup, false);
        C89219l.m154716b(a, "");
        View findViewById = a.findViewById(R.id.eo1);
        C89219l.m154716b(findViewById, "");
        this.f177805b = (TextView) findViewById;
        View findViewById2 = a.findViewById(R.id.eo2);
        C89219l.m154716b(findViewById2, "");
        this.f177806j = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.eo3);
        C89219l.m154716b(findViewById3, "");
        this.f177807k = (TextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.eo0);
        C89219l.m154716b(findViewById4, "");
        this.f177808l = (SmartImageView) findViewById4;
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C79130c cVar) {
        int i;
        long j;
        C79130c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        TextView textView = this.f177805b;
        if (textView == null) {
            C89219l.m154710a("numberText");
        }
        int adapterPosition = getAdapterPosition();
        if (adapterPosition >= 0 && 2 >= adapterPosition) {
            i = R.color.bh;
        } else {
            i = R.color.bz;
        }
        textView.setText(String.valueOf(adapterPosition + 1));
        textView.setTextColor(C0643b.m2378c(textView.getContext(), i));
        TextView textView2 = this.f177806j;
        if (textView2 == null) {
            C89219l.m154710a("titleText");
        }
        Integer a = C79110f.m137941a(Integer.valueOf(cVar2.f177838a.getIconType()));
        if (a != null) {
            C22999a a2 = C23005c.m43393a(new C79114a(a.intValue(), textView2));
            Context context = textView2.getContext();
            C89219l.m154716b(context, "");
            C23001b a3 = a2.mo37368a(context);
            int i2 = f177803a;
            a3.setBounds(0, 0, i2, i2);
            C80554hv.m139639a(textView2, cVar2.f177838a.getTrendingName(), a3);
        } else {
            textView2.setText(cVar2.f177838a.getTrendingName());
        }
        TextView textView3 = this.f177807k;
        if (textView3 == null) {
            C89219l.m154710a("viewCountText");
        }
        Long heatValue = cVar2.f177838a.getHeatValue();
        if (heatValue != null) {
            j = heatValue.longValue();
        } else {
            j = 0;
        }
        textView3.setText(C53437b.m98615a(j));
        SmartImageView smartImageView = this.f177808l;
        if (smartImageView == null) {
            C89219l.m154710a("coverImage");
        }
        C20766v a4 = C20761r.m39060a(new C34602l(cVar2.f177838a.getCoverUrl(), C89070n.m154516a(cVar2.f177838a.getCoverUrl())));
        a4.f49117n = C0643b.m2369a(smartImageView.getContext(), (int) R.drawable.bo1);
        a4.f49092E = smartImageView;
        a4.mo34186c();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setSelected(cVar2.f177839b);
        this.itemView.setOnClickListener(new View$OnClickListenerC79116c(cVar2));
    }
}
