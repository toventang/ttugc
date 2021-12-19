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
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.aweme.trending.p4149ui.C79110f;
import com.p2082ss.android.ugc.aweme.trending.p4149ui.list.C79128b;
import com.p2082ss.android.ugc.aweme.utils.C80554hv;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetCell */
public final class TrendingSheetCell extends PowerCell<C79128b> {

    /* renamed from: a */
    public static final int f177795a;

    /* renamed from: l */
    private static final C79112b f177796l = new C79112b((byte) 0);

    /* renamed from: b */
    private TextView f177797b;

    /* renamed from: j */
    private TextView f177798j;

    /* renamed from: k */
    private TextView f177799k;

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetCell$b */
    static final class C79112b {
        static {
            Covode.recordClassIndex(92294);
        }

        private C79112b() {
        }

        public /* synthetic */ C79112b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        C67590l lVar;
        C79128b bVar;
        C79128b.AbstractC79129a aVar;
        super.mo28073l();
        C79128b bVar2 = (C79128b) this.f42160d;
        if (bVar2 != null && (lVar = bVar2.f177835a) != null && (bVar = (C79128b) this.f42160d) != null && (aVar = bVar.f177837c) != null) {
            aVar.mo122916a(true, lVar);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: m */
    public final void mo28074m() {
        C67590l lVar;
        C79128b bVar;
        C79128b.AbstractC79129a aVar;
        super.mo28074m();
        C79128b bVar2 = (C79128b) this.f42160d;
        if (bVar2 != null && (lVar = bVar2.f177835a) != null && (bVar = (C79128b) this.f42160d) != null && (aVar = bVar.f177837c) != null) {
            aVar.mo122916a(false, lVar);
        }
    }

    static {
        Covode.recordClassIndex(92292);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f177795a = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetCell$c */
    static final class View$OnClickListenerC79113c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79128b f177802a;

        static {
            Covode.recordClassIndex(92295);
        }

        View$OnClickListenerC79113c(C79128b bVar) {
            this.f177802a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C79128b.AbstractC79129a aVar = this.f177802a.f177837c;
            if (aVar != null) {
                C89219l.m154716b(view, "");
                aVar.mo122915a(view, this.f177802a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.TrendingSheetCell$a */
    static final class C79111a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f177800a;

        /* renamed from: b */
        final /* synthetic */ TextView f177801b;

        static {
            Covode.recordClassIndex(92293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79111a(int i, TextView textView) {
            super(1);
            this.f177800a = i;
            this.f177801b = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f177800a;
            aVar2.f54434d = Integer.valueOf(C0643b.m2378c(this.f177801b.getContext(), R.color.bh));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b48, viewGroup, false);
        C89219l.m154716b(a, "");
        View findViewById = a.findViewById(R.id.enk);
        C89219l.m154716b(findViewById, "");
        this.f177797b = (TextView) findViewById;
        View findViewById2 = a.findViewById(R.id.enm);
        C89219l.m154716b(findViewById2, "");
        this.f177798j = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.enn);
        C89219l.m154716b(findViewById3, "");
        this.f177799k = (TextView) findViewById3;
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C79128b bVar) {
        int i;
        long j;
        C79128b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        TextView textView = this.f177797b;
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
        TextView textView2 = this.f177798j;
        if (textView2 == null) {
            C89219l.m154710a("titleText");
        }
        Integer a = C79110f.m137941a(Integer.valueOf(bVar2.f177835a.getIconType()));
        if (a != null) {
            C22999a a2 = C23005c.m43393a(new C79111a(a.intValue(), textView2));
            Context context = textView2.getContext();
            C89219l.m154716b(context, "");
            C23001b a3 = a2.mo37368a(context);
            int i2 = f177795a;
            a3.setBounds(0, 0, i2, i2);
            C80554hv.m139639a(textView2, bVar2.f177835a.getTrendingName(), a3);
        } else {
            textView2.setText(bVar2.f177835a.getTrendingName());
        }
        TextView textView3 = this.f177799k;
        if (textView3 == null) {
            C89219l.m154710a("viewCountText");
        }
        Long heatValue = bVar2.f177835a.getHeatValue();
        if (heatValue != null) {
            j = heatValue.longValue();
        } else {
            j = 0;
        }
        textView3.setText(C53437b.m98615a(j));
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.setSelected(bVar2.f177836b);
        this.itemView.setOnClickListener(new View$OnClickListenerC79113c(bVar2));
    }
}
