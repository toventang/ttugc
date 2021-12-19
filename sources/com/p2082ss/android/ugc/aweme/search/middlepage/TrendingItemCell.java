package com.p2082ss.android.ugc.aweme.search.middlepage;

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
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.search.middlepage.TrendingItemCell */
public final class TrendingItemCell extends PowerCell<C67665c> {

    /* renamed from: a */
    public static final int f151558a;

    /* renamed from: m */
    private static final C67651b f151559m = new C67651b((byte) 0);

    /* renamed from: b */
    private TextView f151560b;

    /* renamed from: j */
    private TextView f151561j;

    /* renamed from: k */
    private TextView f151562k;

    /* renamed from: l */
    private TuxIconView f151563l;

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.TrendingItemCell$b */
    static final class C67651b {
        static {
            Covode.recordClassIndex(79292);
        }

        private C67651b() {
        }

        public /* synthetic */ C67651b(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(79290);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f151558a = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.TrendingItemCell$f */
    static final class View$OnClickListenerC67655f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TrendingItemCell f151569a;

        /* renamed from: b */
        final /* synthetic */ C67665c f151570b;

        static {
            Covode.recordClassIndex(79296);
        }

        View$OnClickListenerC67655f(TrendingItemCell trendingItemCell, C67665c cVar) {
            this.f151569a = trendingItemCell;
            this.f151570b = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC42664al.AbstractC42669e eVar = this.f151570b.f151594b;
            if (eVar != null) {
                eVar.mo72871b(this.f151570b.f151593a, this.f151569a.getLayoutPosition(), this.f151570b.f151595c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.TrendingItemCell$a */
    static final class C67650a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f151564a;

        /* renamed from: b */
        final /* synthetic */ TextView f151565b;

        static {
            Covode.recordClassIndex(79291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67650a(int i, TextView textView) {
            super(1);
            this.f151564a = i;
            this.f151565b = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f151564a;
            aVar2.f54434d = Integer.valueOf(C0643b.m2378c(this.f151565b.getContext(), R.color.bh));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.TrendingItemCell$c */
    static final class C67652c extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C67652c f151566a = new C67652c();

        static {
            Covode.recordClassIndex(79293);
        }

        C67652c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.drawable.bez;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.TrendingItemCell$d */
    static final class C67653d extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C67653d f151567a = new C67653d();

        static {
            Covode.recordClassIndex(79294);
        }

        C67653d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.drawable.bf0;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.TrendingItemCell$e */
    static final class C67654e extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C67654e f151568a = new C67654e();

        static {
            Covode.recordClassIndex(79295);
        }

        C67654e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.drawable.bf1;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.avd, viewGroup, false);
        C89219l.m154716b(a, "");
        View findViewById = a.findViewById(R.id.enk);
        C89219l.m154716b(findViewById, "");
        this.f151560b = (TextView) findViewById;
        View findViewById2 = a.findViewById(R.id.enm);
        C89219l.m154716b(findViewById2, "");
        this.f151561j = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.enn);
        C89219l.m154716b(findViewById3, "");
        this.f151562k = (TextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.enl);
        C89219l.m154716b(findViewById4, "");
        this.f151563l = (TuxIconView) findViewById4;
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo23350a(com.p2082ss.android.ugc.aweme.search.middlepage.C67665c r9) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.middlepage.TrendingItemCell.mo23350a(com.bytedance.ies.powerlist.b.a):void");
    }
}
