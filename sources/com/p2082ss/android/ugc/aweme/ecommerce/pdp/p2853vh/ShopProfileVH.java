package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44786o;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.ShopProfileVH */
public final class ShopProfileVH extends AbsFullSpanVH<C44786o> implements AbstractC33974au {

    /* renamed from: f */
    private final TuxTextView f104829f = ((TuxTextView) this.itemView.findViewById(R.id.dzz));

    /* renamed from: g */
    private final TuxTextView f104830g = ((TuxTextView) this.itemView.findViewById(R.id.d73));

    /* renamed from: j */
    private final SmartImageView f104831j = ((SmartImageView) this.itemView.findViewById(R.id.dzy));

    /* renamed from: k */
    private final TuxButton f104832k = ((TuxButton) this.itemView.findViewById(R.id.fgu));

    /* renamed from: l */
    private final AbstractC89244h f104833l;

    static {
        Covode.recordClassIndex(53342);
    }

    /* renamed from: n */
    public final PdpViewModel mo70807n() {
        return (PdpViewModel) this.f104833l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: g */
    public final void mo33829g() {
        mo76082a(new C44955i(aQ_(), (byte) 0));
        super.mo33829g();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.ShopProfileVH$a */
    public static final class C44931a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104834a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f104835b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104836c;

        static {
            Covode.recordClassIndex(53343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44931a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f104834a = jediViewHolder;
            this.f104835b = cVar;
            this.f104836c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.ShopProfileVH.C44931a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_vh_ShopProfileVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87621xe46bee02(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.ShopProfileVH$b */
    public static final class C44932b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104837a = 700;

        /* renamed from: b */
        final /* synthetic */ ShopProfileVH f104838b;

        /* renamed from: c */
        final /* synthetic */ C44786o f104839c;

        /* renamed from: d */
        final /* synthetic */ Map f104840d;

        static {
            Covode.recordClassIndex(53344);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                String uri = C45264j.m87841a(this.f104839c.f104495e, C89041ag.m154428c(new C89378p("enter_from", this.f104838b.mo70807n().mo75835m()), new C89378p("trackParams", C80342dg.m139300a().mo46674b(this.f104840d)))).build().toString();
                C89219l.m154716b(uri, "");
                C44720k kVar = this.f104838b.mo70807n().f104162s;
                if (kVar != null) {
                    kVar.f104328k = true;
                }
                SmartRouter.buildRoute(view.getContext(), uri).open();
                C44720k kVar2 = this.f104838b.mo70807n().f104162s;
                if (kVar2 != null) {
                    kVar2.mo75861a("showcase_detail", (AbstractC44779h) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44932b(ShopProfileVH shopProfileVH, C44786o oVar, Map map) {
            super(700);
            this.f104838b = shopProfileVH;
            this.f104839c = oVar;
            this.f104840d = map;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.ShopProfileVH$c */
    public static final class C44933c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104841a = 700;

        /* renamed from: b */
        final /* synthetic */ ShopProfileVH f104842b;

        /* renamed from: c */
        final /* synthetic */ C44786o f104843c;

        /* renamed from: d */
        final /* synthetic */ Map f104844d;

        static {
            Covode.recordClassIndex(53345);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                String uri = C45264j.m87841a(this.f104843c.f104495e, C89041ag.m154428c(new C89378p("enter_from", this.f104842b.mo70807n().mo75835m()), new C89378p("trackParams", C80342dg.m139300a().mo46674b(this.f104844d)))).build().toString();
                C89219l.m154716b(uri, "");
                C44720k kVar = this.f104842b.mo70807n().f104162s;
                if (kVar != null) {
                    kVar.f104328k = true;
                }
                SmartRouter.buildRoute(view.getContext(), uri).open();
                C44720k kVar2 = this.f104842b.mo70807n().f104162s;
                if (kVar2 != null) {
                    kVar2.mo75861a("showcase_detail", (AbstractC44779h) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44933c(ShopProfileVH shopProfileVH, C44786o oVar, Map map) {
            super(700);
            this.f104842b = shopProfileVH;
            this.f104843c = oVar;
            this.f104844d = map;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShopProfileVH(android.view.ViewGroup r5) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.ShopProfileVH.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        long j;
        String string;
        Object obj2;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        C44786o oVar = (C44786o) obj;
        C89219l.m154721d(oVar, "");
        C20766v a = C45562g.m88109a((Object) oVar.f104491a).mo34179a("ShopProfileVH");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        a.f49126w = C44953g.m87644a(context);
        a.f49092E = this.f104831j;
        a.mo34186c();
        TuxTextView tuxTextView = this.f104829f;
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(oVar.f104492b);
        Long l = oVar.f104493c;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        int i = 0;
        if (j > 1) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            Context context2 = view2.getContext();
            C89219l.m154716b(context2, "");
            string = context2.getResources().getString(R.string.bfz, Long.valueOf(j));
        } else {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            Context context3 = view3.getContext();
            C89219l.m154716b(context3, "");
            string = context3.getResources().getString(R.string.bf9, Long.valueOf(j));
        }
        C89219l.m154716b(string, "");
        if (C89361p.m154888a((CharSequence) string, String.valueOf(j), 0, false, 6) != -1) {
            TuxTextView tuxTextView2 = this.f104830g;
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(C45573n.m88118a(string, String.valueOf(j)));
        } else {
            TuxTextView tuxTextView3 = this.f104830g;
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(string);
        }
        TuxTextView tuxTextView4 = this.f104830g;
        C89219l.m154716b(tuxTextView4, "");
        if (j == 0) {
            i = 8;
        }
        tuxTextView4.setVisibility(i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = mo70807n().f104147a;
        if (!(pdpEnterParam == null || (trackParams2 = pdpEnterParam.getTrackParams()) == null)) {
            linkedHashMap.putAll(trackParams2);
        }
        linkedHashMap.remove("page_name");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = mo70807n().f104147a;
        if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj2 = trackParams.get("source_page_type")) == null) {
            obj2 = "unknown";
        }
        C89219l.m154716b(obj2, "");
        linkedHashMap.put("show_window_source", obj2);
        TuxButton tuxButton = this.f104832k;
        C89219l.m154716b(tuxButton, "");
        tuxButton.setOnClickListener(new C44932b(this, oVar, linkedHashMap));
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        view4.setOnClickListener(new C44933c(this, oVar, linkedHashMap));
    }
}
