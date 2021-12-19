package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.C43625a;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43642c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43967x;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43719a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44762c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44773c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44774d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44775e;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44778g;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44780i;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44781j;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44782k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44783l;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44787p;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.C44954h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpHeadViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpInfoViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewHeadViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpReviewViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.PdpSelectViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.ShopProfileVH;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescImageViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescTextViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescVideoViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.WaistBanner;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2861c.C45420b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel */
public final class PdpViewModel extends JediViewModel<PdpMainState> implements IEventCenter.AbstractC45375b {

    /* renamed from: A */
    private final String f104144A = "add_cart_success_tip";

    /* renamed from: B */
    private final AbstractC89244h f104145B = C89250i.m154773a((AbstractC89171a) C44648i.f104184a);

    /* renamed from: C */
    private int f104146C;

    /* renamed from: a */
    public IPdpStarter.PdpEnterParam f104147a;

    /* renamed from: b */
    public boolean f104148b;

    /* renamed from: c */
    public boolean f104149c;

    /* renamed from: d */
    public ProductPackStruct f104150d;

    /* renamed from: e */
    public SkuPanelState f104151e;

    /* renamed from: f */
    public boolean f104152f;

    /* renamed from: g */
    public DeliveryPanelStarter.PackedDeliverySelectResult f104153g;

    /* renamed from: k */
    public List<AbstractC89172b<Float, C89391z>> f104154k = new ArrayList();

    /* renamed from: l */
    public int f104155l;

    /* renamed from: m */
    public boolean f104156m;

    /* renamed from: n */
    public AbstractC89568bz f104157n;

    /* renamed from: o */
    public AbstractC89568bz f104158o;

    /* renamed from: p */
    public boolean f104159p;

    /* renamed from: q */
    public boolean f104160q;

    /* renamed from: r */
    public int f104161r;

    /* renamed from: s */
    public C44720k f104162s;

    /* renamed from: t */
    public C44762c f104163t;

    /* renamed from: u */
    public AbstractC89187q<? super Integer, ? super Integer, ? super Long, C89391z> f104164u;

    /* renamed from: v */
    public boolean f104165v = true;

    /* renamed from: w */
    public boolean f104166w = true;

    /* renamed from: x */
    public boolean f104167x;

    /* renamed from: y */
    public AbstractC88412b f104168y;

    /* renamed from: z */
    public DialogC44817l f104169z;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$d */
    public static final class C44643d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44643d f104178a = new C44643d();

        static {
            Covode.recordClassIndex(53028);
        }

        C44643d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$l */
    public static final class C44652l extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f104192a;

        /* renamed from: b */
        int f104193b;

        /* renamed from: c */
        final /* synthetic */ PdpViewModel f104194c;

        /* renamed from: d */
        Object f104195d;

        /* renamed from: e */
        Object f104196e;

        /* renamed from: f */
        Object f104197f;

        static {
            Covode.recordClassIndex(53037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44652l(PdpViewModel pdpViewModel, AbstractC89124d dVar) {
            super(dVar);
            this.f104194c = pdpViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f104192a = obj;
            this.f104193b |= Integer.MIN_VALUE;
            return this.f104194c.mo75811a((AbstractC89172b) null, this);
        }
    }

    static {
        Covode.recordClassIndex(53021);
    }

    /* renamed from: n */
    private final Keva m87379n() {
        return (Keva) this.f104145B.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$g */
    public static final class C44646g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C44646g f104182a = new C44646g();

        static {
            Covode.recordClassIndex(53031);
        }

        C44646g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$h */
    public static final class C44647h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C44647h f104183a = new C44647h();

        static {
            Covode.recordClassIndex(53032);
        }

        C44647h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final boolean mo75823a() {
        LogisticDTO logisticDTO;
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.f104153g;
        Boolean bool = null;
        if ((packedDeliverySelectResult != null ? packedDeliverySelectResult.f103422b : null) != null) {
            return true;
        }
        ProductPackStruct productPackStruct = this.f104150d;
        if (!(productPackStruct == null || (logisticDTO = productPackStruct.f104681i) == null)) {
            bool = logisticDTO.f103617d;
        }
        return C89219l.m154714a((Object) bool, (Object) true);
    }

    /* renamed from: a */
    public final void mo75821a(boolean z) {
        mo33689c(new C44663t(z));
        this.f104148b = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        Integer valueOf;
        C44720k kVar;
        String str3;
        SellerInfo sellerInfo;
        ProductBase productBase;
        List<Image> list;
        ProductBase productBase2;
        C44720k kVar2;
        CartEntry cartEntry;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String str4 = null;
        r4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        AddToCartButton addToCartButton = null;
        switch (str.hashCode()) {
            case -2037346338:
                if (str.equals("ec_sku_panel_operated")) {
                    SkuPanelStarter.SkuOperationParams skuOperationParams = (SkuPanelStarter.SkuOperationParams) C80342dg.m139301a(str2, SkuPanelStarter.SkuOperationParams.class);
                    String productId = skuOperationParams != null ? skuOperationParams.getProductId() : null;
                    ProductPackStruct productPackStruct = this.f104150d;
                    if (productPackStruct != null) {
                        str4 = productPackStruct.f104674b;
                    }
                    if (C89219l.m154714a((Object) productId, (Object) str4) && skuOperationParams != null && (valueOf = Integer.valueOf(skuOperationParams.getType())) != null) {
                        if (valueOf.intValue() == 0) {
                            C44720k kVar3 = this.f104162s;
                            if (kVar3 != null) {
                                kVar3.f104325h = true;
                                return;
                            }
                            return;
                        } else if (valueOf.intValue() == 1 && (kVar = this.f104162s) != null) {
                            kVar.f104326i = true;
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case -1599177272:
                if (str.equals("ec_sku_panel_open")) {
                    String productId2 = ((SkuPanelStarter.SkuEnterParams) C80342dg.m139301a(str2, SkuPanelStarter.SkuEnterParams.class)).getProductId();
                    ProductPackStruct productPackStruct2 = this.f104150d;
                    if (C89219l.m154714a((Object) productId2, (Object) (productPackStruct2 != null ? productPackStruct2.f104674b : null))) {
                        IEventCenter a = EventCenter.m87158a();
                        ProductPackStruct productPackStruct3 = this.f104150d;
                        if (productPackStruct3 == null || (str3 = productPackStruct3.f104674b) == null) {
                            str3 = "0";
                        }
                        SkuPanelState skuPanelState = this.f104151e;
                        String[] checkedSkuIds = skuPanelState != null ? skuPanelState.getCheckedSkuIds() : null;
                        SkuPanelState skuPanelState2 = this.f104151e;
                        Integer productQuantity = skuPanelState2 != null ? skuPanelState2.getProductQuantity() : null;
                        ProductPackStruct productPackStruct4 = this.f104150d;
                        List<SkuItem> list2 = productPackStruct4 != null ? productPackStruct4.f104679g : null;
                        ProductPackStruct productPackStruct5 = this.f104150d;
                        List<SaleProp> list3 = productPackStruct5 != null ? productPackStruct5.f104678f : null;
                        ProductPackStruct productPackStruct6 = this.f104150d;
                        ProductPrice productPrice = (productPackStruct6 == null || (productBase2 = productPackStruct6.f104677e) == null) ? null : productBase2.f104663g;
                        ProductPackStruct productPackStruct7 = this.f104150d;
                        Image image = (productPackStruct7 == null || (productBase = productPackStruct7.f104677e) == null || (list = productBase.f104660d) == null) ? null : (Image) C89070n.m154561b((List) list, 0);
                        ProductPackStruct productPackStruct8 = this.f104150d;
                        String str8 = (productPackStruct8 == null || (sellerInfo = productPackStruct8.f104676d) == null) ? null : sellerInfo.f104704a;
                        ProductPackStruct productPackStruct9 = this.f104150d;
                        if (productPackStruct9 != null) {
                            addToCartButton = productPackStruct9.f104689q;
                        }
                        String b = C80342dg.m139300a().mo46674b(new SkuPanelStarter.SkuRenderParams(str3, checkedSkuIds, productQuantity, list2, list3, "product_detail", productPrice, image, str8, addToCartButton, this.f104150d));
                        C89219l.m154716b(b, "");
                        a.mo75479a("ec_send_sku_params", b);
                        return;
                    }
                    return;
                }
                return;
            case -1186713444:
                if (str.equals("ec_sku_panel_state_change")) {
                    SkuPanelState skuPanelState3 = (SkuPanelState) C80342dg.m139301a(str2, SkuPanelState.class);
                    String productId3 = skuPanelState3 != null ? skuPanelState3.getProductId() : null;
                    ProductPackStruct productPackStruct10 = this.f104150d;
                    if (productPackStruct10 != null) {
                        str7 = productPackStruct10.f104674b;
                    }
                    if (C89219l.m154714a((Object) productId3, (Object) str7) && skuPanelState3 != null) {
                        mo75820a(skuPanelState3);
                        return;
                    }
                    return;
                }
                return;
            case -684635275:
                if (str.equals("ec_gallery_new_image_viewed")) {
                    HashMap hashMap = (HashMap) C80342dg.m139301a(str2, HashMap.class);
                    C89219l.m154716b(hashMap, "");
                    String valueOf2 = String.valueOf(hashMap.get("from"));
                    String valueOf3 = String.valueOf(hashMap.get("identity"));
                    String valueOf4 = String.valueOf(hashMap.get("position"));
                    ProductPackStruct productPackStruct11 = this.f104150d;
                    if (productPackStruct11 != null) {
                        str6 = productPackStruct11.f104674b;
                    }
                    if (C89219l.m154714a((Object) valueOf3, (Object) str6) && C89219l.m154714a((Object) valueOf2, (Object) "sku") && (kVar2 = this.f104162s) != null && valueOf4 != null) {
                        kVar2.f104321d.add(valueOf4);
                        return;
                    }
                    return;
                }
                return;
            case 2018042557:
                if (str.equals("ec_cart_refresh")) {
                    C43719a a2 = C43719a.C43720a.m86706a(str2);
                    Integer num = a2.f101900b;
                    if (num != null) {
                        int intValue = num.intValue();
                        ProductPackStruct productPackStruct12 = this.f104150d;
                        if (!(productPackStruct12 == null || (cartEntry = productPackStruct12.f104690r) == null)) {
                            str5 = cartEntry.f104633a;
                        }
                        m87377b(new CartEntry(str5, Integer.valueOf(intValue)));
                    }
                    if (a2.f101899a == 1) {
                        mo75822a(false, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r7 == null) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75819a(com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r6, java.lang.Integer r7) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.mo75819a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct, java.lang.Integer):void");
    }

    /* renamed from: a */
    public final void mo75820a(SkuPanelState skuPanelState) {
        this.f104151e = skuPanelState != null ? skuPanelState.clone() : null;
        mo33689c(new C44639ab(this));
    }

    /* renamed from: a */
    public final void mo75822a(boolean z, boolean z2) {
        AbstractC44834a a = AbstractC44834a.C44835a.m87545a();
        IPdpStarter.PdpEnterParam pdpEnterParam = this.f104147a;
        if (pdpEnterParam == null) {
            C89219l.m154715b();
        }
        this.f104168y = a.mo75949a(pdpEnterParam, z, 0, true, true).f104626c.mo143254a(new C44659p(this), new C44660q(this, z2));
    }

    /* renamed from: a */
    public final void mo75816a(Context context, C44674a aVar, View view) {
        if (context != null && aVar != null && view != null && !mo75833k()) {
            AbstractC23332b a = new C23329a(context).mo38022a(aVar.f104237a).mo38041b(view).mo38034a(EnumC23352h.BOTTOM);
            Integer a2 = C23155d.m43641a(context, R.attr.bl);
            C23329a aVar2 = (C23329a) a.mo38028a(a2 != null ? a2.intValue() : -16777216).mo38027a().mo38038b();
            aVar2.f55300a.f55327f = (int) C13628n.m24520b(context, -1000.0f);
            aVar2.mo38012d().mo38001a();
            m87379n().storeBoolean(this.f104144A, true);
        }
    }

    /* renamed from: a */
    public final void mo75815a(Context context) {
        CartEntry cartEntry;
        if (context == null) {
            C22708a.m42800a("Open cart failed. Context is NULL");
            return;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam = this.f104147a;
        ProductPackStruct productPackStruct = this.f104150d;
        C43625a.m86646a(context, pdpEnterParam, "product_detail", (productPackStruct == null || (cartEntry = productPackStruct.f104690r) == null) ? null : cartEntry.f104633a);
    }

    /* renamed from: a */
    public final void mo75817a(View view, int i) {
        if (view == null || view.getContext() == null) {
            C22708a.m42800a("Open sku failed. Context is NULL");
            return;
        }
        SkuPanelStarter.f105748b = Long.valueOf(SystemClock.elapsedRealtime());
        this.f104157n = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new C44657o(this, view, i, null), 2);
    }

    /* renamed from: a */
    public final void mo75818a(RecyclerView recyclerView, int i, boolean z) {
        int intValue;
        C89219l.m154721d(recyclerView, "");
        if (!this.f104167x) {
            int i2 = this.f104146C;
            this.f104146C = i2 + 1;
            if (i2 % 30 == 0 || z) {
                boolean canScrollVertically = recyclerView.canScrollVertically(1);
                boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                if (canScrollVertically) {
                    if (!canScrollVertically2) {
                        mo75814a(0, false);
                        return;
                    }
                    RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                    Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int k = ((LinearLayoutManager) layoutManager).mo4371k();
                    int i3 = Integer.MIN_VALUE;
                    int i4 = k + 5;
                    int i5 = 0;
                    while (k < i4) {
                        Integer a = m87374a(recyclerView, k);
                        if (a != null && (intValue = a.intValue() - i) > i3 && intValue < 0) {
                            i5 = k;
                            i3 = intValue;
                        }
                        k++;
                    }
                    RecyclerView.ViewHolder f = recyclerView.mo4451f(i5);
                    if (f != null) {
                        Class<?> cls = f.getClass();
                        if (C89219l.m154714a(cls, PdpHeadViewHolder.class) || C89219l.m154714a(cls, PdpInfoViewHolder.class) || C89219l.m154714a(cls, PdpSelectViewHolder.class)) {
                            mo75814a(0, false);
                            return;
                        } else if (C89219l.m154714a(cls, PdpReviewViewHolder.class) || C89219l.m154714a(cls, PdpReviewHeadViewHolder.class)) {
                            mo75814a(1, false);
                            return;
                        } else if (!C89219l.m154714a(cls, ProductDescImageViewHolder.class) && !C89219l.m154714a(cls, ProductDescVideoViewHolder.class) && !C89219l.m154714a(cls, ShopProfileVH.class) && !C89219l.m154714a(cls, ProductDescTextViewHolder.class)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                mo75814a(2, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$i */
    static final class C44648i extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C44648i f104184a = new C44648i();

        static {
            Covode.recordClassIndex(53033);
        }

        C44648i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("ecom_keva_store");
        }
    }

    /* renamed from: o */
    private static boolean m87380o() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final int mo75824b() {
        if (this.f104165v) {
            return C80534hh.m139609b();
        }
        return 0;
    }

    /* renamed from: i */
    public final void mo75831i() {
        C44720k kVar = this.f104162s;
        if (kVar != null) {
            kVar.mo75859a("return");
        }
        mo33689c(C44644e.f104179a);
    }

    /* renamed from: j */
    public final void mo75832j() {
        AbstractC88412b bVar = this.f104168y;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f104168y = null;
    }

    /* renamed from: k */
    public final boolean mo75833k() {
        return m87379n().getBoolean(this.f104144A, false);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        EventCenter.m87158a().mo75480a("ec_gallery_new_image_viewed", this);
        EventCenter.m87158a().mo75480a("ec_cart_refresh", this);
    }

    /* renamed from: h */
    public final boolean mo75830h() {
        Integer num;
        ProductPackStruct productPackStruct = this.f104150d;
        if (productPackStruct == null || (num = productPackStruct.f104675c) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ PdpMainState mo23027d() {
        return new PdpMainState(false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65535, null);
    }

    /* renamed from: m */
    public final Object mo75835m() {
        Object obj;
        HashMap<String, Object> trackParams;
        Object obj2;
        HashMap<String, Object> trackParams2;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.f104147a;
        if (pdpEnterParam == null || (trackParams2 = pdpEnterParam.getTrackParams()) == null || (obj = trackParams2.get("source_page_type")) == null) {
            obj = "";
        }
        C89219l.m154716b(obj, "");
        if (C89219l.m154714a(obj, (Object) "live")) {
            return "live";
        }
        IPdpStarter.PdpEnterParam pdpEnterParam2 = this.f104147a;
        if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj2 = trackParams.get("enter_from_info")) == null) {
            return "unknown";
        }
        return obj2;
    }

    /* renamed from: g */
    public final void mo75828g() {
        Application a = C17879g.m33104a();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m87380o();
        }
        if (!C58029j.f132253e) {
            mo33689c(C44661r.f104217a);
            C89219l.m154716b(a, "");
            C79459a aVar = new C79459a(m87373a(a));
            Context a2 = m87373a(a);
            C89219l.m154716b(a2, "");
            aVar.mo123052a(a2.getResources().getString(R.string.dck)).mo123053a();
            return;
        }
        this.f104161r++;
        C44720k kVar = this.f104162s;
        if (kVar != null) {
            kVar.f104335r = SystemClock.elapsedRealtime();
        }
        mo33689c(C44649j.f104185a);
        mo75822a(true, false);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        AbstractC89187q<? super Integer, ? super Integer, ? super Long, C89391z> qVar;
        AbstractC89568bz bzVar;
        AbstractC89568bz bzVar2;
        super.onCleared();
        AbstractC89568bz bzVar3 = this.f104157n;
        if (!(bzVar3 == null || !bzVar3.mo143993b() || (bzVar2 = this.f104157n) == null)) {
            bzVar2.mo143985a((CancellationException) null);
        }
        AbstractC89568bz bzVar4 = this.f104158o;
        if (!(bzVar4 == null || !bzVar4.mo143993b() || (bzVar = this.f104158o) == null)) {
            bzVar.mo143985a((CancellationException) null);
        }
        C44762c cVar = this.f104163t;
        if (!(cVar == null || (qVar = this.f104164u) == null)) {
            cVar.f104435f.remove(qVar);
        }
        mo75832j();
        EventCenter.m87158a().mo75481b("ec_gallery_new_image_viewed", this);
        EventCenter.m87158a().mo75480a("ec_cart_refresh", this);
    }

    /* renamed from: l */
    public final HashMap<String, Object> mo75834l() {
        HashMap<String, Object> hashMap;
        String str;
        String str2;
        String str3;
        String str4;
        ProductBase productBase;
        List<Image> list;
        Image image;
        List<String> urls;
        String str5;
        SellerInfo sellerInfo;
        ProductBase productBase2;
        SellerInfo sellerInfo2;
        C89378p[] pVarArr = new C89378p[6];
        IPdpStarter.PdpEnterParam pdpEnterParam = this.f104147a;
        String str6 = "";
        if (pdpEnterParam == null || (hashMap = pdpEnterParam.getTrackParams()) == null) {
            hashMap = str6;
        }
        pVarArr[0] = new C89378p("track_params", hashMap);
        ProductPackStruct productPackStruct = this.f104150d;
        if (productPackStruct == null || (sellerInfo2 = productPackStruct.f104676d) == null || (str = sellerInfo2.f104705b) == null) {
            str = str6;
        }
        pVarArr[1] = new C89378p("store_name", str);
        ProductPackStruct productPackStruct2 = this.f104150d;
        if (productPackStruct2 == null || (productBase2 = productPackStruct2.f104677e) == null || (str2 = productBase2.f104657a) == null) {
            str2 = str6;
        }
        pVarArr[2] = new C89378p("product_name", str2);
        ProductPackStruct productPackStruct3 = this.f104150d;
        if (productPackStruct3 == null || (str3 = productPackStruct3.f104674b) == null) {
            str3 = str6;
        }
        pVarArr[3] = new C89378p("product_id", str3);
        ProductPackStruct productPackStruct4 = this.f104150d;
        if (productPackStruct4 == null || (sellerInfo = productPackStruct4.f104676d) == null || (str4 = sellerInfo.f104704a) == null) {
            str4 = str6;
        }
        pVarArr[4] = new C89378p("shop_id", str4);
        ProductPackStruct productPackStruct5 = this.f104150d;
        if (!(productPackStruct5 == null || (productBase = productPackStruct5.f104677e) == null || (list = productBase.f104660d) == null || (image = list.get(0)) == null || (urls = image.getUrls()) == null || (str5 = urls.get(0)) == null)) {
            str6 = str5;
        }
        pVarArr[5] = new C89378p("product_image_url", str6);
        return C89041ag.m154428c(pVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$p */
    public static final class C44659p<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ PdpViewModel f104214a;

        static {
            Covode.recordClassIndex(53044);
        }

        C44659p(PdpViewModel pdpViewModel) {
            this.f104214a = pdpViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f104214a.mo75819a((ProductPackStruct) obj, (Integer) null);
            this.f104214a.mo75832j();
        }
    }

    /* renamed from: a */
    private static Context m87373a(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: g */
    public final void mo75829g(AbstractC89172b<? super Float, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f104154k.add(bVar);
    }

    /* renamed from: a */
    public static boolean m87376a(CartEntry cartEntry) {
        String str;
        if (cartEntry == null || (str = cartEntry.f104633a) == null) {
            return false;
        }
        return C80537hk.m139613a(str);
    }

    /* renamed from: b */
    private final void m87377b(CartEntry cartEntry) {
        Integer num;
        C44720k kVar = this.f104162s;
        if (kVar != null) {
            if (cartEntry != null) {
                num = cartEntry.f104634b;
            } else {
                num = null;
            }
            kVar.f104333p = num;
        }
        ProductPackStruct productPackStruct = this.f104150d;
        if (productPackStruct != null) {
            productPackStruct.f104690r = cartEntry;
        }
        mo33689c(new C44669w(cartEntry));
    }

    /* renamed from: d */
    static boolean m87378d(Context context) {
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo75826c(Context context) {
        C43967x.m86845a(context, this.f104150d, this.f104153g, this.f104151e, this.f104147a, this.f104148b, new C44650k(this, context));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$n */
    public static final class C44654n extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f104200a;

        /* renamed from: b */
        final /* synthetic */ PdpViewModel f104201b;

        /* renamed from: c */
        final /* synthetic */ Context f104202c;

        static {
            Covode.recordClassIndex(53039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44654n(PdpViewModel pdpViewModel, Context context, AbstractC89124d dVar) {
            super(2, dVar);
            this.f104201b = pdpViewModel;
            this.f104202c = context;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C44654n(this.f104201b, this.f104202c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C44654n) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$n$a */
        public static final class C44655a extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

            /* renamed from: a */
            final /* synthetic */ C44654n f104203a;

            /* renamed from: b */
            final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult f104204b;

            static {
                Covode.recordClassIndex(53040);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44655a(C44654n nVar, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult) {
                super(1);
                this.f104203a = nVar;
                this.f104204b = packedDeliverySelectResult;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                PdpMainState pdpMainState2 = pdpMainState;
                C89219l.m154721d(pdpMainState2, "");
                return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, this.f104203a.f104201b.mo75812a(this.f104203a.f104201b.f104150d, false), 0.0f, 0, null, 0, false, null, null, null, null, null, 65503, null);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$n$b */
        public static final class C44656b extends AbstractC89118k implements AbstractC89172b<AbstractC89124d<? super DeliveryPanelStarter.PackedDeliverySelectResult>, Object> {

            /* renamed from: a */
            int f104205a;

            /* renamed from: b */
            final /* synthetic */ C44654n f104206b;

            static {
                Covode.recordClassIndex(53041);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44656b(C44654n nVar, AbstractC89124d dVar) {
                super(1, dVar);
                this.f104206b = nVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C44656b(this.f104206b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final Object invoke(AbstractC89124d<? super DeliveryPanelStarter.PackedDeliverySelectResult> dVar) {
                return ((C44656b) create(dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                String str;
                Integer num;
                List<SkuItem> list;
                String str2;
                String str3;
                List<Region> list2;
                String str4;
                int i;
                HashMap<String, Object> trackParams;
                LogisticDTO logisticDTO;
                Object obj2 = obj;
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i2 = this.f104205a;
                if (i2 == 0) {
                    C89382r.m154942a(obj2);
                    DeliveryPanelStarter deliveryPanelStarter = DeliveryPanelStarter.f103400a;
                    Context context = this.f104206b.f104202c;
                    boolean z = this.f104206b.f104201b.f104148b;
                    PdpViewModel pdpViewModel = this.f104206b.f104201b;
                    SkuPanelState skuPanelState = pdpViewModel.f104151e;
                    String str5 = null;
                    if (skuPanelState != null) {
                        str = skuPanelState.getSkuId();
                        if (str != null) {
                            SkuPanelState skuPanelState2 = pdpViewModel.f104151e;
                            if (skuPanelState2 != null) {
                                num = skuPanelState2.getProductQuantity();
                            }
                            num = null;
                        }
                        ProductPackStruct productPackStruct = pdpViewModel.f104150d;
                        if (!(productPackStruct == null || (list = productPackStruct.f104679g) == null || !(!list.isEmpty()))) {
                            str = list.get(0).getSkuId();
                        }
                        num = null;
                    } else {
                        str = null;
                        ProductPackStruct productPackStruct2 = pdpViewModel.f104150d;
                        str = list.get(0).getSkuId();
                        num = null;
                    }
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = pdpViewModel.f104153g;
                    if (packedDeliverySelectResult == null || (logisticDTO = packedDeliverySelectResult.f103421a) == null) {
                        str2 = null;
                    } else {
                        str2 = logisticDTO.f103624k;
                    }
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult2 = pdpViewModel.f104153g;
                    if (packedDeliverySelectResult2 != null) {
                        str3 = packedDeliverySelectResult2.f103422b;
                    } else {
                        str3 = null;
                    }
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult3 = pdpViewModel.f104153g;
                    if (packedDeliverySelectResult3 != null) {
                        list2 = packedDeliverySelectResult3.f103423c;
                    } else {
                        list2 = null;
                    }
                    ProductPackStruct productPackStruct3 = pdpViewModel.f104150d;
                    if (productPackStruct3 != null) {
                        str4 = productPackStruct3.f104674b;
                    } else {
                        str4 = null;
                    }
                    String valueOf = String.valueOf(str4);
                    String valueOf2 = String.valueOf(str);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 1;
                    }
                    IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.f104147a;
                    if (!(pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null)) {
                        Map d = C89041ag.m154431d(trackParams);
                        d.put("previous_page", "product_detail");
                        str5 = C80342dg.m139300a().mo46674b(d);
                    }
                    DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = new DeliveryPanelStarter.EnterParamForProductDetailPage(str2, str3, list2, valueOf, valueOf2, i, str5);
                    this.f104205a = 1;
                    obj2 = deliveryPanelStarter.mo75367a(context, Boolean.valueOf(z), new DeliveryPanelStarter.EnterParam(enterParamForProductDetailPage.f103414a, enterParamForProductDetailPage.f103415b, enterParamForProductDetailPage.f103416c, enterParamForProductDetailPage.f103417d, enterParamForProductDetailPage.f103418e, enterParamForProductDetailPage.f103419f, null, enterParamForProductDetailPage.f103420g, 64), false, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    C89382r.m154942a(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj2;
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Float f;
            String str;
            String priceVal;
            LogisticDTO logisticDTO;
            ProductPackStruct productPackStruct;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f104200a;
            String str2 = null;
            if (i == 0) {
                C89382r.m154942a(obj);
                PdpViewModel pdpViewModel = this.f104201b;
                C44656b bVar = new C44656b(this, null);
                this.f104200a = 1;
                obj = pdpViewModel.mo75811a(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = (DeliveryPanelStarter.PackedDeliverySelectResult) obj;
            if (packedDeliverySelectResult == null) {
                packedDeliverySelectResult = new DeliveryPanelStarter.PackedDeliverySelectResult();
            }
            LogisticDTO logisticDTO2 = packedDeliverySelectResult.f103421a;
            if (logisticDTO2 != null) {
                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult2 = this.f104201b.f104153g;
                if (((packedDeliverySelectResult2 == null || (logisticDTO = packedDeliverySelectResult2.f103421a) == null) && ((productPackStruct = this.f104201b.f104150d) == null || (logisticDTO = productPackStruct.f104681i) == null)) || !C89219l.m154714a(logisticDTO2.f103623j, logisticDTO.f103623j) || !C89219l.m154714a(logisticDTO2.f103619f, logisticDTO.f103619f) || !C89219l.m154714a((Object) logisticDTO2.f103620g, (Object) logisticDTO.f103620g)) {
                    Price price = logisticDTO2.f103619f;
                    if (price == null || (priceVal = price.getPriceVal()) == null) {
                        f = null;
                    } else {
                        f = C89361p.m154861c(priceVal);
                    }
                    Price price2 = logisticDTO2.f103619f;
                    if (price2 != null) {
                        str = price2.getCurrency();
                    } else {
                        str = null;
                    }
                    LogisticTextDTO logisticTextDTO = logisticDTO2.f103623j;
                    if (logisticTextDTO != null) {
                        str2 = logisticTextDTO.f103630f;
                    }
                    C44720k kVar = this.f104201b.f104162s;
                    if (kVar != null) {
                        kVar.mo75865a("logistics", this.f104201b.f104148b, f, str, true, str2);
                    }
                }
                this.f104201b.f104153g = packedDeliverySelectResult;
                C44720k kVar2 = this.f104201b.f104162s;
                if (kVar2 != null) {
                    kVar2.f104343z = Boolean.valueOf(this.f104201b.mo75823a());
                }
                C44720k kVar3 = this.f104201b.f104162s;
                if (kVar3 != null) {
                    kVar3.f104311A = this.f104201b.f104153g;
                }
                this.f104201b.mo33689c(new C44655a(this, packedDeliverySelectResult));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$aa */
    public static final class C44638aa extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

        /* renamed from: a */
        final /* synthetic */ int f104172a;

        static {
            Covode.recordClassIndex(53023);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44638aa(int i) {
            super(1);
            this.f104172a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            C89219l.m154721d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, this.f104172a, null, 0, false, null, null, null, null, null, 65407, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$ab */
    public static final class C44639ab extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

        /* renamed from: a */
        final /* synthetic */ PdpViewModel f104173a;

        static {
            Covode.recordClassIndex(53024);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44639ab(PdpViewModel pdpViewModel) {
            super(1);
            this.f104173a = pdpViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            C89219l.m154721d(pdpMainState2, "");
            PdpViewModel pdpViewModel = this.f104173a;
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, pdpViewModel.mo75812a(pdpViewModel.f104150d, false), 0.0f, 0, null, 0, false, null, null, null, null, null, 65503, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$ac */
    static final class C44640ac extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

        /* renamed from: a */
        final /* synthetic */ float f104174a;

        static {
            Covode.recordClassIndex(53025);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44640ac(float f) {
            super(1);
            this.f104174a = f;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            C89219l.m154721d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, this.f104174a, 0, null, 0, false, null, null, null, null, null, 65471, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$e */
    public static final class C44644e extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

        /* renamed from: a */
        public static final C44644e f104179a = new C44644e();

        static {
            Covode.recordClassIndex(53029);
        }

        C44644e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            C89219l.m154721d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, true, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65531, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$f */
    public static final class C44645f extends AbstractC89220m implements AbstractC89172b<PdpMainState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpViewModel f104180a;

        /* renamed from: b */
        final /* synthetic */ Context f104181b;

        static {
            Covode.recordClassIndex(53030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44645f(PdpViewModel pdpViewModel, Context context) {
            super(1);
            this.f104180a = pdpViewModel;
            this.f104181b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(PdpMainState pdpMainState) {
            Context context;
            String string;
            PdpMainState pdpMainState2 = pdpMainState;
            C89219l.m154721d(pdpMainState2, "");
            if (pdpMainState2.isFullScreen() && !this.f104180a.mo75833k() && (context = this.f104181b) != null && (string = context.getString(R.string.bio)) != null) {
                PdpViewModel pdpViewModel = this.f104180a;
                C89219l.m154716b(string, "");
                pdpViewModel.mo33689c(new C44670x(new C44674a(string, System.currentTimeMillis())));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$j */
    static final class C44649j extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

        /* renamed from: a */
        public static final C44649j f104185a = new C44649j();

        static {
            Covode.recordClassIndex(53034);
        }

        C44649j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            C89219l.m154721d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65023, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$k */
    public static final class C44650k extends AbstractC89220m implements AbstractC89172b<List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PdpViewModel f104186a;

        /* renamed from: b */
        final /* synthetic */ Context f104187b;

        static {
            Covode.recordClassIndex(53035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44650k(PdpViewModel pdpViewModel, Context context) {
            super(1);
            this.f104186a = pdpViewModel;
            this.f104187b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends String> list) {
            final List<? extends String> list2 = list;
            AbstractC89568bz bzVar = this.f104186a.f104158o;
            if (bzVar == null || !bzVar.mo143993b()) {
                this.f104186a.f104158o = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.C44650k.C446511 */

                    /* renamed from: a */
                    int f104188a;

                    /* renamed from: b */
                    final /* synthetic */ C44650k f104189b;

                    /* renamed from: d */
                    private /* synthetic */ Object f104191d;

                    static {
                        Covode.recordClassIndex(53036);
                    }

                    {
                        this.f104189b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        C446511 r2 = 

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$m */
                        public static final class C44653m extends AbstractC89220m implements AbstractC89172b<PdpMainState, C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ PdpViewModel f104198a;

                            /* renamed from: b */
                            final /* synthetic */ C89233z.C89234a f104199b;

                            static {
                                Covode.recordClassIndex(53038);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C44653m(PdpViewModel pdpViewModel, C89233z.C89234a aVar) {
                                super(1);
                                this.f104198a = pdpViewModel;
                                this.f104199b = aVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C89391z invoke(PdpMainState pdpMainState) {
                                boolean z;
                                PdpMainState pdpMainState2 = pdpMainState;
                                C89219l.m154721d(pdpMainState2, "");
                                C89233z.C89234a aVar = this.f104199b;
                                if (pdpMainState2.getSheetState() == 4) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                aVar.element = z;
                                if (this.f104199b.element && !this.f104198a.f104148b) {
                                    this.f104198a.mo75813a(5);
                                }
                                return C89391z.f203057a;
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$o */
                        public static final class C44657o extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f104207a;

                            /* renamed from: b */
                            final /* synthetic */ PdpViewModel f104208b;

                            /* renamed from: c */
                            final /* synthetic */ View f104209c;

                            /* renamed from: d */
                            final /* synthetic */ int f104210d;

                            static {
                                Covode.recordClassIndex(53042);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C44657o(PdpViewModel pdpViewModel, View view, int i, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f104208b = pdpViewModel;
                                this.f104209c = view;
                                this.f104210d = i;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C44657o(this.f104208b, this.f104209c, this.f104210d, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C44657o) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f104207a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    PdpViewModel pdpViewModel = this.f104208b;
                                    C446581 r1 = new AbstractC89172b<AbstractC89124d<? super C89391z>, Object>(this, null) {
                                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.C44657o.C446581 */

                                        /* renamed from: a */
                                        long f104211a;

                                        /* renamed from: b */
                                        int f104212b;

                                        /* renamed from: c */
                                        final /* synthetic */ C44657o f104213c;

                                        static {
                                            Covode.recordClassIndex(53043);
                                        }

                                        {
                                            this.f104213c = r2;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return 

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$q */
                                            public static final class C44660q<T> implements AbstractC88433f {

                                                /* renamed from: a */
                                                final /* synthetic */ PdpViewModel f104215a;

                                                /* renamed from: b */
                                                final /* synthetic */ boolean f104216b;

                                                static {
                                                    Covode.recordClassIndex(53045);
                                                }

                                                C44660q(PdpViewModel pdpViewModel, boolean z) {
                                                    this.f104215a = pdpViewModel;
                                                    this.f104216b = z;
                                                }

                                                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                                                public final /* synthetic */ void accept(Object obj) {
                                                    Throwable th = (Throwable) obj;
                                                    if (!this.f104216b) {
                                                        if (th instanceof IPdpStarter.C44633b) {
                                                            this.f104215a.mo75819a((ProductPackStruct) null, Integer.valueOf(((IPdpStarter.C44633b) th).getCode()));
                                                        } else {
                                                            this.f104215a.mo75819a((ProductPackStruct) null, (Integer) null);
                                                        }
                                                    }
                                                    this.f104215a.mo75832j();
                                                }
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$r */
                                            static final class C44661r extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

                                                /* renamed from: a */
                                                public static final C44661r f104217a = new C44661r();

                                                static {
                                                    Covode.recordClassIndex(53046);
                                                }

                                                C44661r() {
                                                    super(1);
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                    C89219l.m154721d(pdpMainState2, "");
                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 2, false, null, null, null, null, null, 65023, null);
                                                }
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$s */
                                            public static final class C44662s extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

                                                /* renamed from: a */
                                                public static final C44662s f104218a = new C44662s();

                                                static {
                                                    Covode.recordClassIndex(53047);
                                                }

                                                C44662s() {
                                                    super(1);
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                    C89219l.m154721d(pdpMainState2, "");
                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, true, null, null, null, null, null, 64511, null);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$t */
                                            public static final class C44663t extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

                                                /* renamed from: a */
                                                final /* synthetic */ boolean f104219a;

                                                static {
                                                    Covode.recordClassIndex(53048);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C44663t(boolean z) {
                                                    super(1);
                                                    this.f104219a = z;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                    C89219l.m154721d(pdpMainState2, "");
                                                    return PdpMainState.copy$default(pdpMainState2, this.f104219a, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65534, null);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$v */
                                            public static final class C44668v extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

                                                /* renamed from: a */
                                                final /* synthetic */ int f104227a;

                                                static {
                                                    Covode.recordClassIndex(53053);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C44668v(int i) {
                                                    super(1);
                                                    this.f104227a = i;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                    C89219l.m154721d(pdpMainState2, "");
                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, this.f104227a, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65527, null);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$w */
                                            public static final class C44669w extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

                                                /* renamed from: a */
                                                final /* synthetic */ CartEntry f104228a;

                                                static {
                                                    Covode.recordClassIndex(53054);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C44669w(CartEntry cartEntry) {
                                                    super(1);
                                                    this.f104228a = cartEntry;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                    C89219l.m154721d(pdpMainState2, "");
                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, this.f104228a, null, 49151, null);
                                                }
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$x */
                                            static final class C44670x extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

                                                /* renamed from: a */
                                                final /* synthetic */ C44674a f104229a;

                                                static {
                                                    Covode.recordClassIndex(53055);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C44670x(C44674a aVar) {
                                                    super(1);
                                                    this.f104229a = aVar;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                    C89219l.m154721d(pdpMainState2, "");
                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, this.f104229a, null, null, 57343, null);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$y */
                                            public static final class C44671y extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

                                                /* renamed from: a */
                                                final /* synthetic */ int f104230a;

                                                /* renamed from: b */
                                                final /* synthetic */ boolean f104231b;

                                                static {
                                                    Covode.recordClassIndex(53056);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C44671y(int i, boolean z) {
                                                    super(1);
                                                    this.f104230a = i;
                                                    this.f104231b = z;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                    C89219l.m154721d(pdpMainState2, "");
                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, new C44770d(this.f104230a, this.f104231b), 0, false, null, null, null, null, null, 65279, null);
                                                }
                                            }

                                            /* renamed from: b */
                                            public final void mo75825b(Context context) {
                                                mo33687b_(new C44645f(this, context));
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$b */
                                            public static final class C44641b extends AbstractC89220m implements AbstractC89172b<C43642c, Boolean> {

                                                /* renamed from: a */
                                                final /* synthetic */ PdpViewModel f104175a;

                                                /* renamed from: b */
                                                final /* synthetic */ View f104176b;

                                                static {
                                                    Covode.recordClassIndex(53026);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C44641b(PdpViewModel pdpViewModel, View view) {
                                                    super(1);
                                                    this.f104175a = pdpViewModel;
                                                    this.f104176b = view;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ Boolean invoke(C43642c cVar) {
                                                    Integer num;
                                                    ExceptionUX exceptionUX;
                                                    C43642c cVar2 = cVar;
                                                    C89219l.m154721d(cVar2, "");
                                                    T t = cVar2.data;
                                                    Context context = null;
                                                    if (t == null || (exceptionUX = t.f101719b) == null) {
                                                        num = null;
                                                    } else {
                                                        num = exceptionUX.getExceptionUXType();
                                                    }
                                                    boolean z = true;
                                                    if (!(num == null || num.intValue() != 1 || this.f104175a.f104162s == null)) {
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                        linkedHashMap.put("error_code", Integer.valueOf(cVar2.code));
                                                        linkedHashMap.put("popup_name", "go_to_cart");
                                                        linkedHashMap.put("previous_page", "product_detail");
                                                        C44720k.m87443a(linkedHashMap);
                                                    }
                                                    if (!cVar2.isCodeOK() || !this.f104175a.f104148b || this.f104175a.mo75833k()) {
                                                        z = false;
                                                    } else {
                                                        PdpViewModel pdpViewModel = this.f104175a;
                                                        View view = this.f104176b;
                                                        if (view != null) {
                                                            context = view.getContext();
                                                        }
                                                        pdpViewModel.mo75825b(context);
                                                    }
                                                    return Boolean.valueOf(z);
                                                }
                                            }

                                            /* renamed from: e */
                                            public final void mo75827e(Context context) {
                                                String str;
                                                int i;
                                                HashMap<String, Object> trackParams;
                                                ProductDetailReview productDetailReview;
                                                Integer num;
                                                ProductDetailReview productDetailReview2;
                                                C89219l.m154721d(context, "");
                                                ProductPackStruct productPackStruct = this.f104150d;
                                                if (productPackStruct != null) {
                                                    str = productPackStruct.f104674b;
                                                } else {
                                                    str = null;
                                                }
                                                ProductPackStruct productPackStruct2 = this.f104150d;
                                                if (productPackStruct2 == null || (productDetailReview2 = productPackStruct2.f104686n) == null) {
                                                    i = null;
                                                } else {
                                                    i = productDetailReview2.f104664a;
                                                }
                                                C44720k kVar = this.f104162s;
                                                if (kVar != null) {
                                                    kVar.mo75861a("review_entrance", (AbstractC44779h) null);
                                                }
                                                if (str != null) {
                                                    C89378p[] pVarArr = new C89378p[4];
                                                    int i2 = 0;
                                                    pVarArr[0] = new C89378p("product_id", str);
                                                    if (i == null) {
                                                        i = -1;
                                                    }
                                                    pVarArr[1] = new C89378p("review_score", i);
                                                    ProductPackStruct productPackStruct3 = this.f104150d;
                                                    if (!(productPackStruct3 == null || (productDetailReview = productPackStruct3.f104686n) == null || (num = productDetailReview.f104665b) == null)) {
                                                        i2 = num.intValue();
                                                    }
                                                    pVarArr[2] = new C89378p("review_count", Integer.valueOf(i2));
                                                    HashMap hashMap = new HashMap();
                                                    IPdpStarter.PdpEnterParam pdpEnterParam = this.f104147a;
                                                    if (!(pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null)) {
                                                        hashMap.putAll(trackParams);
                                                        hashMap.put("previous_page", "product_detail");
                                                    }
                                                    pVarArr[3] = new C89378p("track_params", hashMap);
                                                    C45264j.m87843a(context, "aweme://ec/product_review", C89041ag.m154428c(pVarArr), false).open();
                                                }
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$c */
                                            public static final class C44642c<T> implements AbstractC88433f {

                                                /* renamed from: a */
                                                final /* synthetic */ PdpViewModel f104177a;

                                                static {
                                                    Covode.recordClassIndex(53027);
                                                }

                                                public C44642c(PdpViewModel pdpViewModel) {
                                                    this.f104177a = pdpViewModel;
                                                }

                                                /* JADX WARNING: Removed duplicated region for block: B:58:0x0107  */
                                                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                                public final /* synthetic */ void accept(java.lang.Object r21) {
                                                    /*
                                                    // Method dump skipped, instructions count: 316
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.C44642c.accept(java.lang.Object):void");
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$z */
                                            public static final class C44672z extends AbstractC89220m implements AbstractC89172b<PdpMainState, PdpMainState> {

                                                /* renamed from: a */
                                                final /* synthetic */ PdpViewModel f104232a;

                                                /* renamed from: b */
                                                final /* synthetic */ C89233z.C89236c f104233b;

                                                /* renamed from: c */
                                                final /* synthetic */ ProductPackStruct f104234c;

                                                static {
                                                    Covode.recordClassIndex(53057);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C44672z(PdpViewModel pdpViewModel, C89233z.C89236c cVar, ProductPackStruct productPackStruct) {
                                                    super(1);
                                                    this.f104232a = pdpViewModel;
                                                    this.f104233b = cVar;
                                                    this.f104234c = productPackStruct;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                /* JADX WARNING: Removed duplicated region for block: B:50:0x011c  */
                                                /* JADX WARNING: Removed duplicated region for block: B:53:0x012d  */
                                                /* JADX WARNING: Removed duplicated region for block: B:64:0x014d  */
                                                /* JADX WARNING: Removed duplicated region for block: B:67:0x0153  */
                                                /* JADX WARNING: Removed duplicated region for block: B:70:0x0174  */
                                                /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
                                                /* JADX WARNING: Removed duplicated region for block: B:73:0x017a  */
                                                /* JADX WARNING: Removed duplicated region for block: B:74:0x017c  */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                                public final /* synthetic */ com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpMainState invoke(com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpMainState r28) {
                                                    /*
                                                    // Method dump skipped, instructions count: 383
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.C44672z.invoke(java.lang.Object):java.lang.Object");
                                                }
                                            }

                                            /* renamed from: a */
                                            public final void mo75813a(int i) {
                                                boolean z;
                                                mo33689c(new C44668v(i));
                                                boolean z2 = true;
                                                if (i == 3) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                mo75821a(z);
                                                if (i != 5) {
                                                    if (i != 3) {
                                                        z2 = false;
                                                    }
                                                    this.f104149c = z2;
                                                }
                                            }

                                            /* renamed from: a */
                                            private static Integer m87374a(RecyclerView recyclerView, int i) {
                                                if (i < 0) {
                                                    return null;
                                                }
                                                try {
                                                    RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                                                    if (layoutManager != null) {
                                                        View c = ((LinearLayoutManager) layoutManager).mo4358c(i);
                                                        if (c == null) {
                                                            return null;
                                                        }
                                                        int[] iArr = new int[2];
                                                        c.getLocationInWindow(iArr);
                                                        return Integer.valueOf(iArr[1]);
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                                } catch (Exception unused) {
                                                    return null;
                                                }
                                            }

                                            /* renamed from: a */
                                            private void m87375a(String str, FlashSale flashSale) {
                                                Long l;
                                                C89219l.m154721d(str, "");
                                                C89219l.m154721d(flashSale, "");
                                                this.f104163t = C44762c.C44764a.m87491a(str);
                                                C44720k kVar = this.f104162s;
                                                if (kVar != null) {
                                                    kVar.f104329l = flashSale.f104641b;
                                                }
                                                C44720k kVar2 = this.f104162s;
                                                if (kVar2 != null) {
                                                    C44762c cVar = this.f104163t;
                                                    if (cVar != null) {
                                                        l = Long.valueOf(cVar.f104430a);
                                                    } else {
                                                        l = null;
                                                    }
                                                    kVar2.f104330m = l;
                                                }
                                                if (this.f104164u == null) {
                                                    this.f104164u = new C44664u(this, flashSale);
                                                }
                                                C44762c cVar2 = this.f104163t;
                                                if (cVar2 != null) {
                                                    AbstractC89187q<? super Integer, ? super Integer, ? super Long, C89391z> qVar = this.f104164u;
                                                    if (qVar == null) {
                                                        C89219l.m154715b();
                                                    }
                                                    cVar2.mo75883a(qVar);
                                                }
                                            }

                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$a */
                                            public static final class C44637a extends AbstractC89220m implements AbstractC89183m<C43642c, ButtonAction, Boolean> {

                                                /* renamed from: a */
                                                final /* synthetic */ PdpViewModel f104170a;

                                                /* renamed from: b */
                                                final /* synthetic */ View f104171b;

                                                static {
                                                    Covode.recordClassIndex(53022);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public C44637a(PdpViewModel pdpViewModel, View view) {
                                                    super(2);
                                                    this.f104170a = pdpViewModel;
                                                    this.f104171b = view;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                                public final /* synthetic */ Boolean invoke(C43642c cVar, ButtonAction buttonAction) {
                                                    Integer buttonActionType;
                                                    String str;
                                                    Context context;
                                                    Integer buttonActionType2;
                                                    C43642c cVar2 = cVar;
                                                    ButtonAction buttonAction2 = buttonAction;
                                                    String str2 = "";
                                                    C89219l.m154721d(cVar2, str2);
                                                    boolean z = true;
                                                    String str3 = null;
                                                    if (this.f104170a.f104162s != null) {
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                        linkedHashMap.put("error_code", String.valueOf(cVar2.code));
                                                        linkedHashMap.put("popup_name", "go_to_cart");
                                                        linkedHashMap.put("previous_page", "product_detail");
                                                        if (!(buttonAction2 == null || (buttonActionType2 = buttonAction2.getButtonActionType()) == null)) {
                                                            if (buttonActionType2.intValue() == 0 || buttonActionType2.intValue() == 1) {
                                                                str2 = "stay";
                                                            } else if (buttonActionType2.intValue() == 3) {
                                                                str2 = "enter";
                                                            }
                                                        }
                                                        linkedHashMap.put("action_type", str2);
                                                        C44720k.m87444b(linkedHashMap);
                                                    }
                                                    if (!(buttonAction2 == null || (buttonActionType = buttonAction2.getButtonActionType()) == null || buttonActionType.intValue() != 3)) {
                                                        ButtonActionInfo buttonActionInfo = buttonAction2.getButtonActionInfo();
                                                        if (buttonActionInfo != null) {
                                                            str = buttonActionInfo.getSchema();
                                                        } else {
                                                            str = null;
                                                        }
                                                        if (C80537hk.m139613a(str)) {
                                                            View view = this.f104171b;
                                                            if (view != null) {
                                                                context = view.getContext();
                                                            } else {
                                                                context = null;
                                                            }
                                                            IPdpStarter.PdpEnterParam pdpEnterParam = this.f104170a.f104147a;
                                                            ButtonActionInfo buttonActionInfo2 = buttonAction2.getButtonActionInfo();
                                                            if (buttonActionInfo2 != null) {
                                                                str3 = buttonActionInfo2.getSchema();
                                                            }
                                                            C43625a.m86646a(context, pdpEnterParam, "product_detail", str3);
                                                            return Boolean.valueOf(z);
                                                        }
                                                    }
                                                    z = false;
                                                    return Boolean.valueOf(z);
                                                }
                                            }

                                            /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
                                            /* JADX WARNING: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
                                            /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
                                            /* renamed from: a */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final <R> java.lang.Object mo75811a(p4600h.p4611f.p4612a.AbstractC89172b<? super p4600h.p4603c.AbstractC89124d<? super R>, ? extends java.lang.Object> r8, p4600h.p4603c.AbstractC89124d<? super R> r9) {
                                                /*
                                                // Method dump skipped, instructions count: 144
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.mo75811a(h.f.a.b, h.c.d):java.lang.Object");
                                            }

                                            /* renamed from: a */
                                            public final List<Object> mo75812a(ProductPackStruct productPackStruct, boolean z) {
                                                FlashSale flashSale;
                                                String str;
                                                String str2;
                                                boolean z2;
                                                String str3;
                                                String str4;
                                                String str5;
                                                String str6;
                                                boolean z3;
                                                boolean z4;
                                                LogisticDTO logisticDTO;
                                                String[] strArr;
                                                C44774d dVar;
                                                boolean z5;
                                                boolean z6;
                                                boolean z7;
                                                String str7;
                                                String str8;
                                                String str9;
                                                String str10;
                                                String str11;
                                                boolean z8;
                                                boolean z9;
                                                Integer num;
                                                String str12;
                                                Boolean bool;
                                                ProductPrice productPrice;
                                                Boolean bool2;
                                                ProductPrice productPrice2;
                                                ProductPrice productPrice3;
                                                ProductPrice productPrice4;
                                                Boolean bool3;
                                                ProductPrice productPrice5;
                                                if (productPackStruct == null) {
                                                    return new ArrayList();
                                                }
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(C44773c.m87496a(productPackStruct));
                                                C89219l.m154721d(productPackStruct, "");
                                                Integer num2 = productPackStruct.f104675c;
                                                if (num2 != null && num2.intValue() == 1) {
                                                    flashSale = productPackStruct.f104687o;
                                                } else {
                                                    flashSale = null;
                                                }
                                                ProductBase productBase = productPackStruct.f104677e;
                                                if (productBase == null || (productPrice5 = productBase.f104663g) == null || (str = productPrice5.f104698b) == null) {
                                                    str = "";
                                                }
                                                if (flashSale == null || (str2 = flashSale.f104646g) == null) {
                                                    str2 = str;
                                                }
                                                ProductBase productBase2 = productPackStruct.f104677e;
                                                if (productBase2 == null || (productPrice4 = productBase2.f104663g) == null || (bool3 = productPrice4.f104701e) == null) {
                                                    z2 = false;
                                                } else {
                                                    z2 = bool3.booleanValue();
                                                }
                                                ProductBase productBase3 = productPackStruct.f104677e;
                                                if (productBase3 == null || (str3 = productBase3.f104657a) == null) {
                                                    str3 = "";
                                                }
                                                if (!z) {
                                                    str2 = str;
                                                }
                                                ProductBase productBase4 = productPackStruct.f104677e;
                                                if (productBase4 == null || (productPrice3 = productBase4.f104663g) == null || (str4 = productPrice3.f104697a) == null) {
                                                    str4 = "";
                                                }
                                                ProductBase productBase5 = productPackStruct.f104677e;
                                                if (productBase5 != null) {
                                                    str5 = productBase5.f104662f;
                                                } else {
                                                    str5 = null;
                                                }
                                                ProductBase productBase6 = productPackStruct.f104677e;
                                                if (productBase6 == null || (productPrice2 = productBase6.f104663g) == null || (str6 = productPrice2.f104699c) == null) {
                                                    str6 = "";
                                                }
                                                ProductBase productBase7 = productPackStruct.f104677e;
                                                if (productBase7 == null || (productPrice = productBase7.f104663g) == null || (bool2 = productPrice.f104700d) == null) {
                                                    z3 = false;
                                                } else {
                                                    z3 = bool2.booleanValue();
                                                }
                                                WaistBanner waistBanner = productPackStruct.f104683k;
                                                VoucherInfo voucherInfo = productPackStruct.f104684l;
                                                ProductDetailReview productDetailReview = productPackStruct.f104686n;
                                                LogisticDTO logisticDTO2 = productPackStruct.f104681i;
                                                if (logisticDTO2 == null || (bool = logisticDTO2.f103621h) == null) {
                                                    z4 = false;
                                                } else {
                                                    z4 = bool.booleanValue();
                                                }
                                                arrayList.add(new C44778g(str3, str2, str4, str5, str6, z3, waistBanner, voucherInfo, productDetailReview, z4, flashSale, productPackStruct.f104691s, z2, productPackStruct.f104692t, productPackStruct.f104695w, productPackStruct.f104696x));
                                                SkuPanelState skuPanelState = this.f104151e;
                                                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.f104153g;
                                                C89219l.m154721d(productPackStruct, "");
                                                if (packedDeliverySelectResult == null || (logisticDTO = packedDeliverySelectResult.f103421a) == null) {
                                                    logisticDTO = productPackStruct.f104681i;
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                arrayList2.add(new C44954h(8.0f, false, C0643b.m2378c(C17879g.m33104a(), R.color.az), 4));
                                                Integer num3 = productPackStruct.f104675c;
                                                if (num3 != null && num3.intValue() == 1) {
                                                    if (skuPanelState != null) {
                                                        strArr = skuPanelState.getCheckedSkuIds();
                                                    } else {
                                                        strArr = null;
                                                    }
                                                    arrayList2.add(new C44782k(C45420b.m87992a(strArr, productPackStruct.f104678f)));
                                                    arrayList2.add(new C44954h(8.0f, false, C0643b.m2378c(C17879g.m33104a(), R.color.az), 4));
                                                    if (logisticDTO != null) {
                                                        Price price = logisticDTO.f103619f;
                                                        String str13 = logisticDTO.f103620g;
                                                        Boolean bool4 = logisticDTO.f103617d;
                                                        if (bool4 != null) {
                                                            z6 = bool4.booleanValue();
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        Boolean bool5 = logisticDTO.f103622i;
                                                        if (bool5 != null) {
                                                            z7 = bool5.booleanValue();
                                                        } else {
                                                            z7 = false;
                                                        }
                                                        LogisticTextDTO logisticTextDTO = logisticDTO.f103623j;
                                                        if (logisticTextDTO != null) {
                                                            str7 = logisticTextDTO.f103628d;
                                                        } else {
                                                            str7 = null;
                                                        }
                                                        LogisticTextDTO logisticTextDTO2 = logisticDTO.f103623j;
                                                        if (logisticTextDTO2 != null) {
                                                            str8 = logisticTextDTO2.f103625a;
                                                        } else {
                                                            str8 = null;
                                                        }
                                                        LogisticTextDTO logisticTextDTO3 = logisticDTO.f103623j;
                                                        if (logisticTextDTO3 != null) {
                                                            str9 = logisticTextDTO3.f103627c;
                                                        } else {
                                                            str9 = null;
                                                        }
                                                        LogisticTextDTO logisticTextDTO4 = logisticDTO.f103623j;
                                                        if (logisticTextDTO4 != null) {
                                                            str10 = logisticTextDTO4.f103629e;
                                                        } else {
                                                            str10 = null;
                                                        }
                                                        LogisticTextDTO logisticTextDTO5 = logisticDTO.f103623j;
                                                        if (logisticTextDTO5 != null) {
                                                            str11 = logisticTextDTO5.f103630f;
                                                        } else {
                                                            str11 = null;
                                                        }
                                                        Boolean bool6 = logisticDTO.f103621h;
                                                        if (bool6 != null) {
                                                            z8 = bool6.booleanValue();
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        dVar = new C44774d(price, str13, z6, z7, str7, str8, str9, str10, str11, z8);
                                                    } else {
                                                        dVar = null;
                                                    }
                                                    arrayList2.add(new C44781j(dVar));
                                                    z5 = true;
                                                    arrayList2.add(new C44954h(1.0f, true, 0, 12));
                                                } else {
                                                    z5 = true;
                                                }
                                                if (productPackStruct.f104680h != null && (productPackStruct.f104680h.isEmpty() ^ z5)) {
                                                    arrayList2.add(new C44780i(productPackStruct.f104680h));
                                                }
                                                ProductBase productBase8 = productPackStruct.f104677e;
                                                if (!(productBase8 == null || productBase8.f104661e == null || !(!productPackStruct.f104677e.f104661e.isEmpty()))) {
                                                    arrayList2.add(new C44783l(productPackStruct.f104677e.f104661e));
                                                }
                                                arrayList2.add(new C44954h(8.0f, false, C0643b.m2378c(C17879g.m33104a(), R.color.az), 4));
                                                if (arrayList2.size() == 2) {
                                                    arrayList2.clear();
                                                }
                                                arrayList.addAll(arrayList2);
                                                ProductDetailReview productDetailReview2 = productPackStruct.f104686n;
                                                Integer num4 = productPackStruct.f104675c;
                                                if (num4 != null) {
                                                    z9 = true;
                                                    if (num4.intValue() == 1) {
                                                        if (!(productDetailReview2 == null || (num = productDetailReview2.f104665b) == null || num.intValue() <= 0)) {
                                                            arrayList.add(productDetailReview2);
                                                            List<ReviewItemStruct> list = productDetailReview2.f104666c;
                                                            if (list != null) {
                                                                z9 = true;
                                                                if (!list.isEmpty()) {
                                                                    arrayList.addAll(list);
                                                                    arrayList.add(new C44954h(24.0f, true, 0, 12));
                                                                }
                                                            } else {
                                                                z9 = true;
                                                            }
                                                            arrayList.add(new C44954h(16.0f, z9, 0, 12));
                                                        }
                                                    }
                                                    Integer num5 = productPackStruct.f104675c;
                                                    if (num5 != null && num5.intValue() == z9) {
                                                        SellerInfo sellerInfo = productPackStruct.f104676d;
                                                        if (!(sellerInfo == null || (str12 = sellerInfo.f104705b) == null || str12.length() == 0)) {
                                                            arrayList.add(C44787p.m87503a(productPackStruct));
                                                        }
                                                        arrayList.addAll(C44775e.m87497a(productPackStruct, true));
                                                    }
                                                    return arrayList;
                                                }
                                                z9 = true;
                                                Integer num52 = productPackStruct.f104675c;
                                                SellerInfo sellerInfo2 = productPackStruct.f104676d;
                                                arrayList.add(C44787p.m87503a(productPackStruct));
                                                arrayList.addAll(C44775e.m87497a(productPackStruct, true));
                                                return arrayList;
                                            }

                                            /* renamed from: a */
                                            public final void mo75814a(int i, boolean z) {
                                                mo33689c(new C44671y(i, z));
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel$u */
                                            public static final class C44664u extends AbstractC89220m implements AbstractC89187q<Integer, Integer, Long, C89391z> {

                                                /* renamed from: a */
                                                final /* synthetic */ PdpViewModel f104220a;

                                                /* renamed from: b */
                                                final /* synthetic */ FlashSale f104221b;

                                                static {
                                                    Covode.recordClassIndex(53049);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C44664u(PdpViewModel pdpViewModel, FlashSale flashSale) {
                                                    super(3);
                                                    this.f104220a = pdpViewModel;
                                                    this.f104221b = flashSale;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89187q
                                                public final /* synthetic */ C89391z invoke(Integer num, Integer num2, Long l) {
                                                    FlashSale flashSale;
                                                    FlashSale flashSale2;
                                                    int intValue = num.intValue();
                                                    int intValue2 = num2.intValue();
                                                    final long longValue = l.longValue();
                                                    C44720k kVar = this.f104220a.f104162s;
                                                    if (kVar != null) {
                                                        kVar.f104330m = Long.valueOf(longValue);
                                                    }
                                                    if (intValue2 != intValue) {
                                                        ProductPackStruct productPackStruct = null;
                                                        if (intValue == 2) {
                                                            PdpViewModel pdpViewModel = this.f104220a;
                                                            ProductPackStruct productPackStruct2 = pdpViewModel.f104150d;
                                                            if (productPackStruct2 != null) {
                                                                productPackStruct = ProductPackStruct.m87572a(productPackStruct2.f104674b, productPackStruct2.f104675c, productPackStruct2.f104676d, productPackStruct2.f104677e, productPackStruct2.f104678f, productPackStruct2.f104679g, productPackStruct2.f104680h, productPackStruct2.f104681i, productPackStruct2.f104682j, productPackStruct2.f104683k, productPackStruct2.f104684l, productPackStruct2.f104685m, productPackStruct2.f104686n, FlashSale.m87569a(flashSale2.f104640a, 2, flashSale2.f104642c, flashSale2.f104643d, flashSale2.f104644e, flashSale2.f104645f, flashSale2.f104646g, flashSale2.f104647h, this.f104221b.f104648i), productPackStruct2.f104688p, productPackStruct2.f104689q, productPackStruct2.f104690r, productPackStruct2.f104691s, productPackStruct2.f104692t, productPackStruct2.f104693u, productPackStruct2.f104694v, productPackStruct2.f104695w, productPackStruct2.f104696x);
                                                            }
                                                            pdpViewModel.f104150d = productPackStruct;
                                                            C44720k kVar2 = this.f104220a.f104162s;
                                                            if (kVar2 != null) {
                                                                kVar2.mo75854a(this.f104220a.f104150d);
                                                            }
                                                            PdpViewModel pdpViewModel2 = this.f104220a;
                                                            final List<Object> a = pdpViewModel2.mo75812a(pdpViewModel2.f104150d, true);
                                                            this.f104220a.mo33689c(new AbstractC89172b<PdpMainState, PdpMainState>() {
                                                                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.C44664u.C446651 */

                                                                static {
                                                                    Covode.recordClassIndex(53050);
                                                                }

                                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                                    C89219l.m154721d(pdpMainState2, "");
                                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, a, 0.0f, 0, null, 0, false, 2, Long.valueOf(longValue), null, null, null, 59359, null);
                                                                }
                                                            });
                                                            C44720k kVar3 = this.f104220a.f104162s;
                                                            if (kVar3 != null) {
                                                                kVar3.f104329l = 2;
                                                            }
                                                        } else if (intValue == 3) {
                                                            C44720k kVar4 = this.f104220a.f104162s;
                                                            if (kVar4 != null) {
                                                                kVar4.f104329l = 3;
                                                            }
                                                            PdpViewModel pdpViewModel3 = this.f104220a;
                                                            ProductPackStruct productPackStruct3 = pdpViewModel3.f104150d;
                                                            if (productPackStruct3 != null) {
                                                                productPackStruct = ProductPackStruct.m87572a(productPackStruct3.f104674b, productPackStruct3.f104675c, productPackStruct3.f104676d, productPackStruct3.f104677e, productPackStruct3.f104678f, productPackStruct3.f104679g, productPackStruct3.f104680h, productPackStruct3.f104681i, productPackStruct3.f104682j, productPackStruct3.f104683k, productPackStruct3.f104684l, productPackStruct3.f104685m, productPackStruct3.f104686n, FlashSale.m87569a(flashSale.f104640a, 3, flashSale.f104642c, flashSale.f104643d, flashSale.f104644e, flashSale.f104645f, flashSale.f104646g, flashSale.f104647h, this.f104221b.f104648i), productPackStruct3.f104688p, productPackStruct3.f104689q, productPackStruct3.f104690r, productPackStruct3.f104691s, productPackStruct3.f104692t, productPackStruct3.f104693u, productPackStruct3.f104694v, productPackStruct3.f104695w, productPackStruct3.f104696x);
                                                            }
                                                            pdpViewModel3.f104150d = productPackStruct;
                                                            C44720k kVar5 = this.f104220a.f104162s;
                                                            if (kVar5 != null) {
                                                                kVar5.mo75854a(this.f104220a.f104150d);
                                                            }
                                                            PdpViewModel pdpViewModel4 = this.f104220a;
                                                            final List<Object> a2 = pdpViewModel4.mo75812a(pdpViewModel4.f104150d, false);
                                                            this.f104220a.mo33689c(new AbstractC89172b<PdpMainState, PdpMainState>() {
                                                                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.C44664u.C446662 */

                                                                static {
                                                                    Covode.recordClassIndex(53051);
                                                                }

                                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                                    C89219l.m154721d(pdpMainState2, "");
                                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, a2, 0.0f, 0, null, 0, false, 3, Long.valueOf(longValue), null, null, null, 59359, null);
                                                                }
                                                            });
                                                        }
                                                        this.f104220a.mo75822a(false, true);
                                                    }
                                                    this.f104220a.mo33689c(new AbstractC89172b<PdpMainState, PdpMainState>() {
                                                        /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.C44664u.C446673 */

                                                        static {
                                                            Covode.recordClassIndex(53052);
                                                        }

                                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                            PdpMainState pdpMainState2 = pdpMainState;
                                                            C89219l.m154721d(pdpMainState2, "");
                                                            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, Long.valueOf(longValue), null, null, null, 61439, null);
                                                        }
                                                    });
                                                    return C89391z.f203057a;
                                                }
                                            }
                                        }
