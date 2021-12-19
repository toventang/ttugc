package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.AbstractC44324b;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.C44321a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2835a.C44323a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCache;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44762c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44705a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44707c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44778g;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.C45672a;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder */
public final class PdpInfoViewHolder extends AbsFullSpanVH<C44778g> implements IEventCenter.AbstractC45375b, IEventCenter.AbstractC45375b {

    /* renamed from: f */
    public final CommerceProductInfoView f104761f;

    /* renamed from: g */
    public CommerceProductInfoView f104762g;

    /* renamed from: j */
    public int f104763j;

    /* renamed from: k */
    public int f104764k;

    /* renamed from: l */
    private final AbstractC89244h f104765l;

    /* renamed from: m */
    private final C44908b f104766m;

    /* renamed from: n */
    private final Map<String, Voucher> f104767n = new LinkedHashMap();

    static {
        Covode.recordClassIndex(53314);
    }

    /* renamed from: n */
    public final PdpViewModel mo70807n() {
        return (PdpViewModel) this.f104765l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: g */
    public final void mo33829g() {
        super.mo33829g();
        mo76082a(new C44955i(aQ_(), (byte) 0));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$a */
    public static final class C44907a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f104768a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f104769b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104770c;

        static {
            Covode.recordClassIndex(53315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44907a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f104768a = jediViewHolder;
            this.f104769b = cVar;
            this.f104770c = cVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpInfoViewHolder.C44907a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpInfoViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87596x9f6efd8(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$c */
    static final class C44909c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpInfoViewHolder f104775a;

        static {
            Covode.recordClassIndex(53317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44909c(PdpInfoViewHolder pdpInfoViewHolder) {
            super(0);
            this.f104775a = pdpInfoViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            PdpInfoViewHolder pdpInfoViewHolder = this.f104775a;
            pdpInfoViewHolder.f104764k = pdpInfoViewHolder.f104761f.getHeight();
            PdpInfoViewHolder pdpInfoViewHolder2 = this.f104775a;
            pdpInfoViewHolder2.f104763j = pdpInfoViewHolder2.f104762g.getHeight();
            if (!this.f104775a.mo70807n().f104148b) {
                this.f104775a.itemView.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpInfoViewHolder.C44909c.RunnableC449101 */

                    /* renamed from: a */
                    final /* synthetic */ C44909c f104776a;

                    static {
                        Covode.recordClassIndex(53318);
                    }

                    {
                        this.f104776a = r1;
                    }

                    public final void run() {
                        View view = this.f104776a.f104775a.itemView;
                        C89219l.m154716b(view, "");
                        View view2 = this.f104776a.f104775a.itemView;
                        C89219l.m154716b(view2, "");
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        layoutParams.height = this.f104776a.f104775a.f104764k;
                        view.setLayoutParams(layoutParams);
                    }
                });
            } else {
                View view = this.f104775a.itemView;
                C89219l.m154716b(view, "");
                View view2 = this.f104775a.itemView;
                C89219l.m154716b(view2, "");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = this.f104775a.f104763j;
                view.setLayoutParams(layoutParams);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        this.f104762g.setAlpha(0.0f);
        this.f104761f.setAlpha(1.0f);
        if (mo70807n().f104148b) {
            this.f104762g.setAlpha(1.0f);
            this.f104761f.setAlpha(0.0f);
        } else {
            this.f104762g.setAlpha(0.0f);
            this.f104761f.setAlpha(1.0f);
        }
        mo70807n().mo75829g(new C44911d(this));
        AbstractC88412b unused = selectSubscribe(mo70807n(), C44952f.f104885a, new C20370ah(), new C44912e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$d */
    static final class C44911d extends AbstractC89220m implements AbstractC89172b<Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpInfoViewHolder f104777a;

        static {
            Covode.recordClassIndex(53319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44911d(PdpInfoViewHolder pdpInfoViewHolder) {
            super(1);
            this.f104777a = pdpInfoViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Float f) {
            float floatValue = f.floatValue();
            this.f104777a.f104762g.setAlpha(floatValue);
            this.f104777a.f104761f.setAlpha(1.0f - floatValue);
            if (!(this.f104777a.f104763j == 0 || this.f104777a.f104764k == 0)) {
                View view = this.f104777a.itemView;
                C89219l.m154716b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = this.f104777a.f104764k + ((int) (((float) (this.f104777a.f104763j - this.f104777a.f104764k)) * floatValue));
                View view2 = this.f104777a.itemView;
                C89219l.m154716b(view2, "");
                view2.setLayoutParams(layoutParams);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PdpInfoViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559013(0x7f0d0265, float:1.8743358E38)
            r0 = 0
            android.view.View r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a.m87492a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            android.view.View r1 = r4.itemView
            r0 = 2131367161(0x7f0a14f9, float:1.8354236E38)
            android.view.View r2 = r1.findViewById(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r3)
            com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView r2 = (com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView) r2
            r4.f104761f = r2
            android.view.View r1 = r4.itemView
            r0 = 2131367159(0x7f0a14f7, float:1.8354232E38)
            android.view.View r0 = r1.findViewById(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView r0 = (com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView) r0
            r4.f104762g = r0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r4.f104765l = r0
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$b r1 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$b
            r1.<init>(r4, r5)
            r4.f104766m = r1
            r2.setCouponLogListener(r1)
            com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView r0 = r4.f104762g
            r0.setCouponLogListener(r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.f104767n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpInfoViewHolder.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        C44762c cVar;
        C44778g gVar = (C44778g) obj;
        C89219l.m154721d(gVar, "");
        this.f104764k = 0;
        this.f104763j = 0;
        FlashSale flashSale = gVar.f104478k;
        if (!(flashSale == null || (cVar = mo70807n().f104163t) == null)) {
            long j = cVar.f104430a;
            this.f104761f.mo76099a(flashSale, j);
            this.f104762g.mo76099a(flashSale, j);
        }
        CommerceProductInfoView commerceProductInfoView = this.f104761f;
        ViewGroup.LayoutParams layoutParams = commerceProductInfoView.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            FrameLayout.LayoutParams layoutParams3 = layoutParams2;
            layoutParams3.height = -2;
            layoutParams3.width = -1;
            commerceProductInfoView.setLayoutParams(layoutParams2);
        }
        CommerceProductInfoView commerceProductInfoView2 = this.f104762g;
        ViewGroup.LayoutParams layoutParams4 = commerceProductInfoView2.getLayoutParams();
        if (!(layoutParams4 instanceof FrameLayout.LayoutParams)) {
            layoutParams4 = null;
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
        if (layoutParams5 != null) {
            FrameLayout.LayoutParams layoutParams6 = layoutParams5;
            layoutParams6.height = -2;
            layoutParams6.width = -1;
            commerceProductInfoView2.setLayoutParams(layoutParams5);
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
        if ((layoutParams7 instanceof ViewGroup.LayoutParams) && layoutParams7 != null) {
            layoutParams7.height = -2;
            layoutParams7.width = -1;
            view.setLayoutParams(layoutParams7);
        }
        this.f104761f.mo76098a(gVar, 1, (AbstractC89171a<C89391z>) null);
        this.f104762g.mo76098a(gVar, Integer.MAX_VALUE, new C44909c(this));
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        C44998a.C44999a.m87685a(view2, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$b */
    public static final class C44908b implements CommerceProductInfoView.AbstractC44965d {

        /* renamed from: a */
        public boolean f104771a;

        /* renamed from: b */
        public boolean f104772b;

        /* renamed from: c */
        final /* synthetic */ PdpInfoViewHolder f104773c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f104774d;

        static {
            Covode.recordClassIndex(53316);
        }

        C44908b(PdpInfoViewHolder pdpInfoViewHolder, ViewGroup viewGroup) {
            this.f104773c = pdpInfoViewHolder;
            this.f104774d = viewGroup;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.AbstractC44965d
        /* renamed from: a */
        public final void mo76084a(String str, String str2) {
            if (!this.f104771a) {
                C44720k kVar = this.f104773c.mo70807n().f104162s;
                if (kVar != null) {
                    C45544c.m88081a("tiktokec_banner_show", new C44720k.C44741u(kVar, str, str2));
                }
                this.f104771a = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.AbstractC44965d
        /* renamed from: a */
        public final void mo76083a(PromotionView promotionView, int i) {
            String str;
            String str2;
            String str3;
            PromotionView promotionView2;
            List<PromotionItem> promotion_items;
            PromotionItem promotionItem;
            if (!this.f104772b) {
                C44720k kVar = this.f104773c.mo70807n().f104162s;
                if (kVar != null) {
                    C44707c cVar = new C44707c();
                    cVar.mo75848a(kVar.f104318a);
                    String str4 = null;
                    if (promotionView != null) {
                        str = C45672a.m88178a(promotionView, i);
                    } else {
                        str = null;
                    }
                    cVar.mo75849b(str);
                    if (promotionView != null) {
                        str2 = C45672a.m88179b(promotionView, i);
                    } else {
                        str2 = null;
                    }
                    cVar.mo75847a(str2);
                    if (promotionView != null) {
                        str3 = C45672a.m88180c(promotionView, i);
                    } else {
                        str3 = null;
                    }
                    cVar.mo75851c(str3);
                    ProductPackStruct productPackStruct = kVar.f104327j;
                    if (!(productPackStruct == null || (promotionView2 = productPackStruct.f104695w) == null || (promotion_items = promotionView2.getPromotion_items()) == null || (promotionItem = (PromotionItem) C89070n.m154583g((List) promotion_items)) == null)) {
                        str4 = promotionItem.getLog_extra();
                    }
                    Map<String, ? extends Object> f = C44720k.m87445f(str4);
                    if (f != null) {
                        cVar.mo75850b(f);
                    }
                    cVar.mo76747d();
                }
                this.f104772b = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.AbstractC44965d
        /* renamed from: b */
        public final void mo76085b(PromotionView promotionView, int i) {
            Object obj;
            String str;
            HashMap<String, Object> trackParams;
            String str2;
            String str3;
            String str4;
            String str5;
            PromotionView promotionView2;
            List<PromotionItem> promotion_items;
            PromotionItem promotionItem;
            C44720k kVar = this.f104773c.mo70807n().f104162s;
            HashMap<String, Object> hashMap = null;
            if (kVar != null) {
                C44705a aVar = new C44705a();
                aVar.mo75848a(kVar.f104318a);
                if (promotionView != null) {
                    str2 = C45672a.m88178a(promotionView, i);
                } else {
                    str2 = null;
                }
                aVar.mo75849b(str2);
                if (promotionView != null) {
                    str3 = C45672a.m88179b(promotionView, i);
                } else {
                    str3 = null;
                }
                aVar.mo75847a(str3);
                if (promotionView != null) {
                    str4 = C45672a.m88180c(promotionView, i);
                } else {
                    str4 = null;
                }
                aVar.mo75851c(str4);
                ProductPackStruct productPackStruct = kVar.f104327j;
                if (productPackStruct == null || (promotionView2 = productPackStruct.f104695w) == null || (promotion_items = promotionView2.getPromotion_items()) == null || (promotionItem = (PromotionItem) C89070n.m154583g((List) promotion_items)) == null) {
                    str5 = null;
                } else {
                    str5 = promotionItem.getLog_extra();
                }
                Map<String, ? extends Object> f = C44720k.m87445f(str5);
                if (f != null) {
                    aVar.mo75850b(f);
                }
                aVar.mo76747d();
            }
            Context context = this.f104774d.getContext();
            if (context instanceof ActivityC0945e) {
                IPdpStarter.PdpEnterParam pdpEnterParam = this.f104773c.mo70807n().f104147a;
                if (pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null) {
                    obj = null;
                } else {
                    obj = trackParams.get("entrance_info");
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam2 = this.f104773c.mo70807n().f104147a;
                if (pdpEnterParam2 != null) {
                    hashMap = pdpEnterParam2.getTrackParams();
                }
                C89219l.m154721d(context, "");
                AbstractC44324b.C44325a.m87050a(context, 1, "product_detail", 2, str, hashMap, null, null);
                PdpInfoViewHolder pdpInfoViewHolder = this.f104773c;
                EventCenter.m87158a().mo75480a("ec_voucher_click_claim", pdpInfoViewHolder);
                EventCenter.m87158a().mo75480a("ec_voucher_click_cover", pdpInfoViewHolder);
                EventCenter.m87158a().mo75480a("ec_voucher_page_close", pdpInfoViewHolder);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$e */
    static final class C44912e extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C44778g>, Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpInfoViewHolder f104778a;

        static {
            Covode.recordClassIndex(53320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44912e(PdpInfoViewHolder pdpInfoViewHolder) {
            super(2);
            this.f104778a = pdpInfoViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C44778g> jediSimpleViewHolder, Long l) {
            FlashSale flashSale;
            Long l2 = l;
            C89219l.m154721d(jediSimpleViewHolder, "");
            if (!(l2 == null || l2.longValue() < 0 || (flashSale = ((C44778g) this.f104778a.aQ_()).f104478k) == null)) {
                this.f104778a.f104761f.mo76099a(flashSale, l2.longValue());
                this.f104778a.f104762g.mo76099a(flashSale, l2.longValue());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C44321a a;
        String voucherID;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int hashCode = str.hashCode();
        if (hashCode != 440795539) {
            if (hashCode != 440904974) {
                if (hashCode != 882422714 || !str.equals("ec_voucher_page_close")) {
                    return;
                }
            } else if (!str.equals("ec_voucher_click_cover")) {
                return;
            }
            IEventCenter a2 = EventCenter.m87158a();
            a2.mo75481b("ec_voucher_click_claim", this);
            a2.mo75481b("ec_voucher_click_cover", this);
            a2.mo75481b("ec_voucher_page_close", this);
        } else if (str.equals("ec_voucher_click_claim") && (a = C44321a.C44322a.m87047a(str2)) != null && a.f103365a != null && (voucherID = a.f103365a.getVoucherID()) != null && C80538hl.m139614a(voucherID)) {
            String voucherTypeID = a.f103365a.getVoucherTypeID();
            String voucherID2 = a.f103365a.getVoucherID();
            C89219l.m154721d(voucherTypeID, "");
            C44323a.f103368a.put(voucherTypeID, new CouponCache(voucherID2, voucherTypeID, 3, System.currentTimeMillis()));
            this.f104767n.put(a.f103365a.getVoucherTypeID(), a.f103365a);
        }
    }
}
