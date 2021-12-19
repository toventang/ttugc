package com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.C43626a;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43641b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44771a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.C45429a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2859a.C45383a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget */
public final class PdpBottomNavBarWidget extends JediBaseWidget implements AbstractC33974au {

    /* renamed from: h */
    boolean f105048h;

    /* renamed from: i */
    public final Fragment f105049i;

    /* renamed from: j */
    private final AbstractC89244h f105050j;

    static {
        Covode.recordClassIndex(53462);
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return R.layout.o6;
    }

    /* renamed from: l */
    public final PdpViewModel mo76166l() {
        return (PdpViewModel) this.f105050j.getValue();
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget$a */
    public static final class C45037a extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f105051a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f105052b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105053c;

        static {
            Covode.recordClassIndex(53463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45037a(Widget widget, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f105051a = widget;
            this.f105052b = cVar;
            this.f105053c = cVar2;
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget.C45037a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_widget_PdpBottomNavBarWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87719x6102a40a(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: c */
    public final void mo39080c() {
        super.mo39080c();
        View view = this.f56005e;
        if (view != null) {
            TuxButton tuxButton = (TuxButton) view.findViewById(R.id.a0k);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setOnClickListener(new C45038b(this));
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.dv9);
            C89219l.m154716b(tuxIconView, "");
            tuxIconView.setOnClickListener(new C45039c(this));
        }
        AbstractC88412b unused = selectSubscribe(mo76166l(), C45071j.f105111a, new C20370ah(), new C45040d(this));
        AbstractC88412b unused2 = selectSubscribe(mo76166l(), C45072k.f105112a, new C20370ah(), new C45041e(this));
        AbstractC88412b unused3 = selectSubscribe(mo76166l(), C45073l.f105113a, new C20370ah(), new C45042f(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget$b */
    public static final class C45038b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105054a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpBottomNavBarWidget f105055b;

        static {
            Covode.recordClassIndex(53464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45038b(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(700);
            this.f105055b = pdpBottomNavBarWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            Boolean bool;
            Context context;
            Boolean bool2;
            Integer productQuantity;
            List<SkuItem> list;
            T t;
            String str;
            ProductBase productBase;
            ProductPrice productPrice;
            HashMap<String, Object> trackParams;
            String str2;
            ProductBase productBase2;
            ProductPrice productPrice2;
            if (view != null) {
                ProductPackStruct productPackStruct = this.f105055b.mo76166l().f104150d;
                SkuPrice skuPrice = null;
                if (productPackStruct == null || (productBase2 = productPackStruct.f104677e) == null || (productPrice2 = productBase2.f104663g) == null) {
                    bool = null;
                } else {
                    bool = productPrice2.f104700d;
                }
                int i = 1;
                boolean a = C89219l.m154714a((Object) bool, (Object) true);
                if (this.f105055b.mo76166l().mo75830h()) {
                    PdpViewModel l = this.f105055b.mo76166l();
                    View view2 = this.f105055b.f105049i.getView();
                    if (view2 != null) {
                        context = view2.getContext();
                    } else {
                        context = null;
                    }
                    if (context == null) {
                        C22708a.m42800a("Open sku or osp failed. Context is NULL");
                    } else if (l.f104152f) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        IPdpStarter.PdpEnterParam pdpEnterParam = l.f104147a;
                        if (!(pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null)) {
                            trackParams.put("click_buynow_start_time", Long.valueOf(elapsedRealtime));
                        }
                        ProductPackStruct productPackStruct2 = l.f104150d;
                        if (productPackStruct2 == null || (productBase = productPackStruct2.f104677e) == null || (productPrice = productBase.f104663g) == null) {
                            bool2 = null;
                        } else {
                            bool2 = productPrice.f104700d;
                        }
                        C44720k kVar = l.f104162s;
                        if (kVar != null) {
                            kVar.mo75858a(bool2, l.f104148b, elapsedRealtime);
                        }
                        C44720k kVar2 = l.f104162s;
                        if (kVar2 != null) {
                            ProductPackStruct productPackStruct3 = l.f104150d;
                            if (!(productPackStruct3 == null || (list = productPackStruct3.f104679g) == null)) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it.next();
                                    String skuId = t.getSkuId();
                                    SkuPanelState skuPanelState = l.f104151e;
                                    if (skuPanelState != null) {
                                        str = skuPanelState.getSkuId();
                                    } else {
                                        str = null;
                                    }
                                    if (C89361p.m154872a(skuId, str, false)) {
                                        break;
                                    }
                                }
                                T t2 = t;
                                if (t2 != null) {
                                    skuPrice = t2.getPrice();
                                }
                            }
                            SkuPanelState skuPanelState2 = l.f104151e;
                            if (!(skuPanelState2 == null || (productQuantity = skuPanelState2.getProductQuantity()) == null)) {
                                i = productQuantity.intValue();
                            }
                            kVar2.mo75856a(skuPrice, i);
                        }
                        Context context2 = view2.getContext();
                        C89219l.m154716b(context2, "");
                        l.mo75826c(context2);
                    } else {
                        l.mo75817a(view2, 1);
                    }
                    C44720k kVar3 = this.f105055b.mo76166l().f104162s;
                    if (kVar3 != null) {
                        TuxButton tuxButton = (TuxButton) view.findViewById(R.id.a0k);
                        C89219l.m154716b(tuxButton, "");
                        kVar3.mo75863a("buy_now", Boolean.valueOf(tuxButton.isEnabled()), Boolean.valueOf(a));
                    }
                    C44720k kVar4 = this.f105055b.mo76166l().f104162s;
                    if (kVar4 != null) {
                        HashMap<String, Object> hashMap = new HashMap<>();
                        TuxButton tuxButton2 = (TuxButton) view.findViewById(R.id.a0k);
                        C89219l.m154716b(tuxButton2, "");
                        String str3 = "1";
                        if (tuxButton2.isEnabled()) {
                            str2 = str3;
                        } else {
                            str2 = "0";
                        }
                        hashMap.put("is_clickable", str2);
                        if (!a) {
                            str3 = "0";
                        }
                        hashMap.put("is_buy_with_coupon", str3);
                        kVar4.mo75873b("buy_now", hashMap);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget$c */
    public static final class C45039c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105056a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpBottomNavBarWidget f105057b;

        static {
            Covode.recordClassIndex(53465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45039c(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(700);
            this.f105057b = pdpBottomNavBarWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            Object obj;
            HashMap<String, Object> trackParams;
            HashMap<String, Object> trackParams2;
            SellerInfo sellerInfo;
            if (view != null) {
                ProductPackStruct productPackStruct = this.f105057b.mo76166l().f104150d;
                if (productPackStruct == null || (sellerInfo = productPackStruct.f104676d) == null) {
                    str = null;
                } else {
                    str = sellerInfo.f104709f;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                IPdpStarter.PdpEnterParam pdpEnterParam = this.f105057b.mo76166l().f104147a;
                if (!(pdpEnterParam == null || (trackParams2 = pdpEnterParam.getTrackParams()) == null)) {
                    linkedHashMap.putAll(trackParams2);
                }
                linkedHashMap.remove("page_name");
                linkedHashMap.put("previous_page", "product_detail");
                IPdpStarter.PdpEnterParam pdpEnterParam2 = this.f105057b.mo76166l().f104147a;
                if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj = trackParams.get("source_page_type")) == null) {
                    obj = "unknown";
                }
                C89219l.m154716b(obj, "");
                linkedHashMap.put("show_window_source", obj);
                if (str != null) {
                    String uri = C45264j.m87841a(str, C89041ag.m154428c(new C89378p("enter_from", this.f105057b.mo76166l().mo75835m()), new C89378p("trackParams", C80342dg.m139300a().mo46674b(linkedHashMap)))).build().toString();
                    C89219l.m154716b(uri, "");
                    SmartRouter.buildRoute(this.f105057b.mo39077a().getContext(), uri).open();
                    C44720k kVar = this.f105057b.mo76166l().f104162s;
                    if (kVar != null) {
                        kVar.mo75863a("show_window", (Boolean) null, (Boolean) null);
                    }
                    C44720k kVar2 = this.f105057b.mo76166l().f104162s;
                    if (kVar2 != null) {
                        kVar2.f104328k = true;
                    }
                }
            }
        }
    }

    public PdpBottomNavBarWidget(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f105049i = fragment;
        AbstractC89277c a = C89204ab.m154669a(PdpViewModel.class);
        this.f105050j = C89250i.m154773a((AbstractC89171a) new C45037a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget$h */
    public static final class C45044h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105065a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpBottomNavBarWidget f105066b;

        /* renamed from: c */
        final /* synthetic */ String f105067c;

        /* renamed from: d */
        final /* synthetic */ C44771a f105068d;

        static {
            Covode.recordClassIndex(53470);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            HashMap<String, Object> hashMap;
            if (view != null) {
                String str = this.f105067c;
                HashMap c = C89041ag.m154428c(new C89378p("enter_from", "product_detail"));
                IPdpStarter.PdpEnterParam pdpEnterParam = this.f105066b.mo76166l().f104147a;
                if (pdpEnterParam != null) {
                    hashMap = pdpEnterParam.getTrackParams();
                } else {
                    hashMap = null;
                }
                c.put("trackParams", C80342dg.m139300a().mo46674b(hashMap));
                String uri = C45264j.m87841a(str, c).build().toString();
                C89219l.m154716b(uri, "");
                SmartRouter.buildRoute(view.getContext(), uri).open();
                C44720k kVar = this.f105066b.mo76166l().f104162s;
                if (kVar != null) {
                    kVar.mo75863a("contact_seller", (Boolean) null, (Boolean) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45044h(PdpBottomNavBarWidget pdpBottomNavBarWidget, String str, C44771a aVar) {
            super(700);
            this.f105066b = pdpBottomNavBarWidget;
            this.f105067c = str;
            this.f105068d = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget$g */
    public static final class C45043g extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105061a = 700;

        /* renamed from: b */
        final /* synthetic */ PdpBottomNavBarWidget f105062b;

        /* renamed from: c */
        final /* synthetic */ boolean f105063c;

        /* renamed from: d */
        final /* synthetic */ AddToCartButton f105064d;

        static {
            Covode.recordClassIndex(53469);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            LinkedHashMap<String, Object> linkedHashMap;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            String str6;
            HashMap<String, Object> hashMap;
            HashMap<String, Object> hashMap2;
            Object obj;
            HashMap<String, Object> trackParams;
            SellerInfo sellerInfo;
            String str7;
            if (view != null && this.f105062b.mo76166l().mo75830h()) {
                if (this.f105063c) {
                    View view2 = this.f105062b.f56005e;
                    if (view2 != null) {
                        C23144b bVar = new C23144b(view2);
                        AddToCartButton addToCartButton = this.f105064d;
                        if (addToCartButton != null) {
                            str7 = addToCartButton.getClickHint();
                        } else {
                            str7 = null;
                        }
                        bVar.mo37635a(str7).mo37637b();
                    }
                } else {
                    PdpViewModel l = this.f105062b.mo76166l();
                    View view3 = this.f105062b.f56005e;
                    if (l.f104152f) {
                        String a = C45429a.m87999a(2);
                        SkuPanelState skuPanelState = l.f104151e;
                        if (skuPanelState != null) {
                            str = skuPanelState.getSkuId();
                        } else {
                            str = null;
                        }
                        C44720k kVar = l.f104162s;
                        if (kVar != null) {
                            linkedHashMap = kVar.f104318a;
                        } else {
                            linkedHashMap = null;
                        }
                        C45383a.m87961a(a, str, 1, "add_to_cart", "product_detail", "product_detail", linkedHashMap);
                        C43626a aVar = C43626a.f101693c;
                        ProductPackStruct productPackStruct = l.f104150d;
                        if (productPackStruct == null || (sellerInfo = productPackStruct.f104676d) == null) {
                            str2 = null;
                        } else {
                            str2 = sellerInfo.f104704a;
                        }
                        SkuPanelState skuPanelState2 = l.f104151e;
                        if (skuPanelState2 != null) {
                            str3 = skuPanelState2.getWarehouseId();
                        } else {
                            str3 = null;
                        }
                        ProductPackStruct productPackStruct2 = l.f104150d;
                        if (productPackStruct2 != null) {
                            str4 = productPackStruct2.f104674b;
                        } else {
                            str4 = null;
                        }
                        SkuPanelState skuPanelState3 = l.f104151e;
                        if (skuPanelState3 != null) {
                            str5 = skuPanelState3.getSkuId();
                        } else {
                            str5 = null;
                        }
                        SkuPanelState skuPanelState4 = l.f104151e;
                        if (skuPanelState4 != null) {
                            num = skuPanelState4.getProductQuantity();
                        } else {
                            num = null;
                        }
                        IPdpStarter.PdpEnterParam pdpEnterParam = l.f104147a;
                        if (pdpEnterParam != null) {
                            str6 = pdpEnterParam.getChainKey();
                        } else {
                            str6 = null;
                        }
                        IPdpStarter.PdpEnterParam pdpEnterParam2 = l.f104147a;
                        if (pdpEnterParam2 != null) {
                            hashMap = pdpEnterParam2.getTrackParams();
                        } else {
                            hashMap = null;
                        }
                        String a2 = C43626a.C43627a.m86650a(hashMap);
                        IPdpStarter.PdpEnterParam pdpEnterParam3 = l.f104147a;
                        if (pdpEnterParam3 != null) {
                            hashMap2 = pdpEnterParam3.getTrackParams();
                        } else {
                            hashMap2 = null;
                        }
                        Integer valueOf = Integer.valueOf(IPdpStarter.C44631a.m87368a(hashMap2));
                        IPdpStarter.PdpEnterParam pdpEnterParam4 = l.f104147a;
                        if (pdpEnterParam4 == null || (trackParams = pdpEnterParam4.getTrackParams()) == null) {
                            obj = null;
                        } else {
                            obj = trackParams.get("author_id");
                        }
                        aVar.mo74301a(new C43641b(str2, str3, str4, str5, num, str6, a2, valueOf, (String) obj), view3, view3, true, new PdpViewModel.C44637a(l, view3), new PdpViewModel.C44641b(l, view3)).mo143254a(new PdpViewModel.C44642c(l), PdpViewModel.C44643d.f104178a);
                    } else {
                        l.mo75817a(view3, 2);
                    }
                }
                C44720k kVar2 = this.f105062b.mo76166l().f104162s;
                if (kVar2 != null) {
                    kVar2.mo75873b("add_to_cart", (HashMap<String, Object>) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45043g(PdpBottomNavBarWidget pdpBottomNavBarWidget, boolean z, AddToCartButton addToCartButton) {
            super(700);
            this.f105062b = pdpBottomNavBarWidget;
            this.f105063c = z;
            this.f105064d = addToCartButton;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget$d */
    static final class C45040d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBottomNavBarWidget f105058a;

        static {
            Covode.recordClassIndex(53466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45040d(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(2);
            this.f105058a = pdpBottomNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            LinearLayout linearLayout;
            LinearLayout linearLayout2;
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            if (intValue != -1) {
                View view = this.f105058a.f56005e;
                if (!(view == null || (linearLayout2 = (LinearLayout) view.findViewById(R.id.d04)) == null)) {
                    linearLayout2.setVisibility(8);
                }
            } else {
                View view2 = this.f105058a.f56005e;
                if (!(view2 == null || (linearLayout = (LinearLayout) view2.findViewById(R.id.d04)) == null)) {
                    linearLayout.setVisibility(0);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget$f */
    static final class C45042f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, AddToCartButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBottomNavBarWidget f105060a;

        static {
            Covode.recordClassIndex(53468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45042f(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(2);
            this.f105060a = pdpBottomNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r10, com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton r11) {
            /*
            // Method dump skipped, instructions count: 241
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget.C45042f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget$e */
    static final class C45041e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C44771a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpBottomNavBarWidget f105059a;

        static {
            Covode.recordClassIndex(53467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45041e(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(2);
            this.f105059a = pdpBottomNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C44771a aVar) {
            Context context;
            String str;
            String str2;
            TuxButton tuxButton;
            TuxButton tuxButton2;
            TuxButton tuxButton3;
            View view;
            TuxButton tuxButton4;
            View view2;
            TuxButton tuxButton5;
            String str3;
            TuxButton tuxButton6;
            TuxButton tuxButton7;
            TuxButton tuxButton8;
            TuxButton tuxButton9;
            TuxButton tuxButton10;
            String str4;
            C44771a aVar2 = aVar;
            C89219l.m154721d(iVar, "");
            if (aVar2 != null) {
                PdpBottomNavBarWidget pdpBottomNavBarWidget = this.f105059a;
                View view3 = pdpBottomNavBarWidget.f56005e;
                Boolean bool = null;
                if (view3 != null) {
                    context = view3.getContext();
                } else {
                    context = null;
                }
                View view4 = pdpBottomNavBarWidget.f56005e;
                if (!(view4 == null || (tuxButton10 = (TuxButton) view4.findViewById(R.id.a0k)) == null)) {
                    if (C89219l.m154714a((Object) aVar2.f104455c, (Object) true)) {
                        if (context != null) {
                            str4 = context.getString(R.string.bgw);
                        } else {
                            str4 = null;
                        }
                    } else if (context != null) {
                        str4 = context.getString(R.string.bf_);
                    } else {
                        str4 = null;
                    }
                    tuxButton10.setText(str4);
                }
                if (aVar2.f104453a == 3 || aVar2.f104453a == 2) {
                    View view5 = pdpBottomNavBarWidget.f56005e;
                    if (!(view5 == null || (tuxButton9 = (TuxButton) view5.findViewById(R.id.a0k)) == null)) {
                        tuxButton9.setEnabled(false);
                    }
                    View view6 = pdpBottomNavBarWidget.f56005e;
                    if (!(view6 == null || (tuxButton8 = (TuxButton) view6.findViewById(R.id.h5)) == null)) {
                        tuxButton8.setVisibility(8);
                    }
                    if (context != null) {
                        View view7 = pdpBottomNavBarWidget.f56005e;
                        if (!(view7 == null || (tuxButton7 = (TuxButton) view7.findViewById(R.id.a0k)) == null)) {
                            tuxButton7.setBackgroundColor(C0643b.m2378c(context, R.color.f));
                        }
                        int c = C0643b.m2378c(context, R.color.bz);
                        View view8 = pdpBottomNavBarWidget.f56005e;
                        if (!(view8 == null || (tuxButton6 = (TuxButton) view8.findViewById(R.id.a0k)) == null)) {
                            tuxButton6.setTextColor(c);
                        }
                    }
                }
                SellerInfo sellerInfo = aVar2.f104454b;
                if (sellerInfo != null) {
                    str = sellerInfo.f104710g;
                } else {
                    str = null;
                }
                View view9 = pdpBottomNavBarWidget.f56005e;
                if (view9 != null) {
                    if (str == null || !(!C89361p.m154870a((CharSequence) str))) {
                        TuxIconView tuxIconView = (TuxIconView) view9.findViewById(R.id.bjw);
                        C89219l.m154716b(tuxIconView, "");
                        tuxIconView.setVisibility(8);
                    } else {
                        TuxIconView tuxIconView2 = (TuxIconView) view9.findViewById(R.id.bjw);
                        C89219l.m154716b(tuxIconView2, "");
                        tuxIconView2.setVisibility(0);
                        TuxIconView tuxIconView3 = (TuxIconView) view9.findViewById(R.id.bjw);
                        C89219l.m154716b(tuxIconView3, "");
                        tuxIconView3.setOnClickListener(new C45044h(pdpBottomNavBarWidget, str, aVar2));
                    }
                    SellerInfo sellerInfo2 = aVar2.f104454b;
                    if (sellerInfo2 != null) {
                        str3 = sellerInfo2.f104710g;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null || C89361p.m154870a((CharSequence) aVar2.f104454b.f104710g) || aVar2.f104454b.f104705b == null || aVar2.f104454b.f104705b.length() == 0) {
                        TuxIconView tuxIconView4 = (TuxIconView) view9.findViewById(R.id.dv9);
                        C89219l.m154716b(tuxIconView4, "");
                        tuxIconView4.setVisibility(8);
                    } else {
                        TuxIconView tuxIconView5 = (TuxIconView) view9.findViewById(R.id.dv9);
                        C89219l.m154716b(tuxIconView5, "");
                        tuxIconView5.setVisibility(0);
                    }
                }
                if (!(aVar2.f104453a != 3 || (view2 = pdpBottomNavBarWidget.f56005e) == null || (tuxButton5 = (TuxButton) view2.findViewById(R.id.a0k)) == null)) {
                    tuxButton5.setText(R.string.bg8);
                }
                if (!(aVar2.f104453a != 2 || (view = pdpBottomNavBarWidget.f56005e) == null || (tuxButton4 = (TuxButton) view.findViewById(R.id.a0k)) == null)) {
                    tuxButton4.setText(R.string.bg2);
                }
                if (aVar2.f104453a == 1) {
                    View view10 = pdpBottomNavBarWidget.f56005e;
                    if (!(view10 == null || (tuxButton3 = (TuxButton) view10.findViewById(R.id.h5)) == null)) {
                        tuxButton3.setEnabled(true);
                    }
                    View view11 = pdpBottomNavBarWidget.f56005e;
                    if (!(view11 == null || (tuxButton2 = (TuxButton) view11.findViewById(R.id.a0k)) == null)) {
                        tuxButton2.setEnabled(true);
                    }
                }
                View view12 = pdpBottomNavBarWidget.f56005e;
                if (!(view12 == null || (tuxButton = (TuxButton) view12.findViewById(R.id.a0k)) == null)) {
                    bool = Boolean.valueOf(tuxButton.isEnabled());
                }
                C44720k kVar = pdpBottomNavBarWidget.mo76166l().f104162s;
                if (kVar != null) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    String str5 = "1";
                    if (bool != null) {
                        bool.booleanValue();
                        if (bool.booleanValue()) {
                            str2 = str5;
                        } else {
                            str2 = "0";
                        }
                        hashMap.put("is_clickable", str2);
                    }
                    if (!C89219l.m154714a((Object) aVar2.f104455c, (Object) true)) {
                        str5 = "0";
                    }
                    hashMap.put("is_buy_with_coupon", str5);
                    kVar.mo75864a("buy_now", hashMap);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo76165a(boolean z, View view, AddToCartButton addToCartButton) {
        view.setOnClickListener(new C45043g(this, z, addToCartButton));
    }
}
