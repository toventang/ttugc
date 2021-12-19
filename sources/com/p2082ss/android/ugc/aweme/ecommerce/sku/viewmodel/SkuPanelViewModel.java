package com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.C43625a;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43642c;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.C45421d;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SalePropValue;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuSaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2859a.C45383a;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel */
public final class SkuPanelViewModel extends JediViewModel<SkuState> implements IEventCenter.AbstractC45375b {

    /* renamed from: n */
    public static final C45506a f106002n = new C45506a((byte) 0);

    /* renamed from: a */
    public final List<Image> f106003a = new ArrayList();

    /* renamed from: b */
    public final List<String> f106004b = new ArrayList();

    /* renamed from: c */
    public SkuPanelState f106005c;

    /* renamed from: d */
    public SkuInfo f106006d;

    /* renamed from: e */
    public SkuPanelStarter.SkuEnterParams f106007e;

    /* renamed from: f */
    public ProductPackStruct f106008f;

    /* renamed from: g */
    public C45421d f106009g;

    /* renamed from: k */
    public Boolean f106010k;

    /* renamed from: l */
    public String f106011l;

    /* renamed from: m */
    public AbstractC88412b f106012m;

    /* renamed from: o */
    private Image f106013o;

    /* renamed from: p */
    private ProductPrice f106014p;

    /* renamed from: q */
    private AddToCartButton f106015q;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$e */
    public static final class C45511e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C45511e f106022a = new C45511e();

        static {
            Covode.recordClassIndex(54000);
        }

        C45511e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(53994);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$a */
    public static final class C45506a {
        static {
            Covode.recordClassIndex(53995);
        }

        private C45506a() {
        }

        public /* synthetic */ C45506a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo76704a(boolean z) {
        mo33689c(new C45525q(z));
    }

    /* renamed from: a */
    public final void mo76703a(EnumC45533a aVar) {
        C89219l.m154721d(aVar, "");
        mo33689c(new C45531w(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01fb, code lost:
        if (r7 != null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0106, code lost:
        if (r5.isEmpty() == false) goto L_0x0109;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ea  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76705a(java.lang.String[] r14) {
        /*
        // Method dump skipped, instructions count: 612
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.mo76705a(java.lang.String[]):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int hashCode = str.hashCode();
        if (hashCode != -49893737) {
            if (hashCode == 1117656670 && str.equals("ec_send_sku_params")) {
                SkuPanelStarter.SkuRenderParams skuRenderParams = (SkuPanelStarter.SkuRenderParams) C33039i.m67674a(str2, SkuPanelStarter.SkuRenderParams.class);
                String str3 = null;
                this.f106008f = skuRenderParams != null ? skuRenderParams.getProductInfoPack() : null;
                if (skuRenderParams != null) {
                    String productId = skuRenderParams.getProductId();
                    SkuPanelStarter.SkuEnterParams skuEnterParams = this.f106007e;
                    if (skuEnterParams != null) {
                        str3 = skuEnterParams.getProductId();
                    }
                    if (C89219l.m154714a((Object) productId, (Object) str3)) {
                        m88053a(new SkuInfo(skuRenderParams.getSkuList(), skuRenderParams.getSalePropList()), skuRenderParams.getPrice(), skuRenderParams.getMainPicture(), new SkuPanelState(skuRenderParams.getProductId(), null, null, null, skuRenderParams.getCheckedSkuIds(), skuRenderParams.getProductQuantity(), false, 0, null, null, null, 1984, null), skuRenderParams.getSellerId(), skuRenderParams.getAddToCartButton());
                        mo76703a(EnumC45533a.SUCCESS);
                    }
                }
            }
        } else if (str.equals("ec_sku_panel_keyboard_show")) {
            mo76704a(((SkuPanelStarter.SkuKeyboardVisibilityParams) C33039i.m67674a(str2, SkuPanelStarter.SkuKeyboardVisibilityParams.class)).getKeyboardVisibility());
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        EventCenter.m87158a().mo75480a("ec_send_sku_params", this);
        EventCenter.m87158a().mo75480a("ec_sku_panel_keyboard_show", this);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ SkuState mo23027d() {
        return new SkuState(null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65535, null);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        mo76706b();
        EventCenter.m87158a().mo75481b("ec_send_sku_params", this);
        EventCenter.m87158a().mo75481b("ec_sku_panel_keyboard_show", this);
    }

    /* renamed from: b */
    public final void mo76706b() {
        AbstractC88412b bVar = this.f106012m;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f106012m = null;
    }

    /* renamed from: a */
    public final String mo76700a() {
        SkuPanelState skuPanelState = this.f106005c;
        String[] checkedSkuIds = skuPanelState != null ? skuPanelState.getCheckedSkuIds() : null;
        SkuInfo skuInfo = this.f106006d;
        if (skuInfo != null) {
            List<SaleProp> list = skuInfo.f105854b;
            if (list != null && !list.isEmpty()) {
                if (checkedSkuIds == null) {
                    return list.get(0).f105847b;
                }
                int length = checkedSkuIds.length;
                for (int i = 0; i < length; i++) {
                    if (C89219l.m154714a((Object) checkedSkuIds[i], (Object) "")) {
                        return list.get(i).f105847b;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m88052a(Image image) {
        mo33689c(new C45517k(image));
    }

    /* renamed from: b */
    private void m88057b(int i) {
        mo33689c(new C45518l(i));
    }

    /* renamed from: c */
    private void m88059c(int i) {
        mo33687b_(new C45519m(this, i));
    }

    /* renamed from: d */
    private void m88061d(String str) {
        mo33689c(new C45524p(str));
    }

    /* renamed from: e */
    private void m88062e(String str) {
        mo33689c(new C45528t(str));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$h */
    public static final class C45514h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SkuPanelViewModel f106025a;

        static {
            Covode.recordClassIndex(54003);
        }

        public C45514h(SkuPanelViewModel skuPanelViewModel) {
            this.f106025a = skuPanelViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            SkuPanelViewModel skuPanelViewModel = this.f106025a;
            C89219l.m154716b(productPackStruct, "");
            skuPanelViewModel.mo76702a(productPackStruct);
            this.f106025a.mo76706b();
            this.f106025a.mo76707b(false);
        }
    }

    /* renamed from: a */
    private final void m88054a(PromotionView promotionView) {
        mo33689c(new C45529u(promotionView));
    }

    /* renamed from: b */
    private void m88058b(String str) {
        mo33689c(new C45526r(str));
    }

    /* renamed from: c */
    private void m88060c(String str) {
        C89219l.m154721d(str, "");
        mo33689c(new C45532x(str));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$f */
    public static final class C45512f extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        public static final C45512f f106023a = new C45512f();

        static {
            Covode.recordClassIndex(54001);
        }

        C45512f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, true, null, null, false, 61439, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$g */
    public static final class C45513g extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        public static final C45513g f106024a = new C45513g();

        static {
            Covode.recordClassIndex(54002);
        }

        C45513g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, true, null, null, false, 61439, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$i */
    public static final class C45515i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SkuPanelViewModel f106026a;

        /* renamed from: b */
        final /* synthetic */ Fragment f106027b;

        static {
            Covode.recordClassIndex(54004);
        }

        public C45515i(SkuPanelViewModel skuPanelViewModel, Fragment fragment) {
            this.f106026a = skuPanelViewModel;
            this.f106027b = fragment;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Resources resources;
            C23144b bVar = new C23144b(this.f106027b);
            Context context = this.f106027b.getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.fv9);
            }
            bVar.mo37635a(str).mo37637b();
            this.f106026a.mo76706b();
            this.f106026a.mo76707b(false);
            this.f106026a.mo76703a(EnumC45533a.FAIL);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$j */
    public static final class C45516j extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ AddToCartButton f106028a;

        static {
            Covode.recordClassIndex(54005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45516j(AddToCartButton addToCartButton) {
            super(1);
            this.f106028a = addToCartButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, this.f106028a, false, 49151, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$k */
    public static final class C45517k extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ Image f106029a;

        static {
            Covode.recordClassIndex(54006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45517k(Image image) {
            super(1);
            this.f106029a = image;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, this.f106029a, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65534, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$l */
    public static final class C45518l extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ int f106030a;

        static {
            Covode.recordClassIndex(54007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45518l(int i) {
            super(1);
            this.f106030a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, this.f106030a, null, false, null, null, false, 64511, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$m */
    public static final class C45519m extends AbstractC89220m implements AbstractC89172b<SkuState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelViewModel f106031a;

        /* renamed from: b */
        final /* synthetic */ int f106032b;

        static {
            Covode.recordClassIndex(54008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45519m(SkuPanelViewModel skuPanelViewModel, int i) {
            super(1);
            this.f106031a = skuPanelViewModel;
            this.f106032b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            if (skuState2.getCurrentQuantity() > this.f106032b) {
                this.f106031a.mo33689c(new AbstractC89172b<SkuState, SkuState>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.C45519m.C455201 */

                    /* renamed from: a */
                    final /* synthetic */ C45519m f106033a;

                    static {
                        Covode.recordClassIndex(54009);
                    }

                    {
                        this.f106033a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ SkuState invoke(SkuState skuState) {
                        SkuState skuState2 = skuState;
                        C89219l.m154721d(skuState2, "");
                        return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, this.f106033a.f106032b, this.f106033a.f106032b, 0, null, false, null, null, false, 64767, null);
                    }
                });
            } else {
                this.f106031a.mo33689c(new AbstractC89172b<SkuState, SkuState>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.C45519m.C455212 */

                    /* renamed from: a */
                    final /* synthetic */ C45519m f106034a;

                    static {
                        Covode.recordClassIndex(54010);
                    }

                    {
                        this.f106034a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ SkuState invoke(SkuState skuState) {
                        SkuState skuState2 = skuState;
                        C89219l.m154721d(skuState2, "");
                        return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, this.f106034a.f106032b, 0, 0, null, false, null, null, false, 65279, null);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$n */
    public static final class C45522n extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ String f106035a;

        static {
            Covode.recordClassIndex(54011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45522n(String str) {
            super(1);
            this.f106035a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            String str = "";
            C89219l.m154721d(skuState2, str);
            String str2 = this.f106035a;
            if (str2 != null) {
                str = str2;
            }
            return SkuState.copy$default(skuState2, null, null, str, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65531, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$o */
    public static final class C45523o extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ int f106036a;

        static {
            Covode.recordClassIndex(54012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45523o(int i) {
            super(1);
            this.f106036a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, this.f106036a, 0, null, false, null, null, false, 65023, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$p */
    public static final class C45524p extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ String f106037a;

        static {
            Covode.recordClassIndex(54013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45524p(String str) {
            super(1);
            this.f106037a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, this.f106037a, null, 0, 0, 0, null, false, null, null, false, 65471, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$q */
    public static final class C45525q extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ boolean f106038a;

        static {
            Covode.recordClassIndex(54014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45525q(boolean z) {
            super(1);
            this.f106038a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, Boolean.valueOf(this.f106038a), false, null, null, false, 63487, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$r */
    public static final class C45526r extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ String f106039a;

        static {
            Covode.recordClassIndex(54015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45526r(String str) {
            super(1);
            this.f106039a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, this.f106039a, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65527, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$s */
    public static final class C45527s extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ Boolean f106040a;

        static {
            Covode.recordClassIndex(54016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45527s(Boolean bool) {
            super(1);
            this.f106040a = bool;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, this.f106040a, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65533, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$t */
    public static final class C45528t extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ String f106041a;

        static {
            Covode.recordClassIndex(54017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45528t(String str) {
            super(1);
            this.f106041a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, this.f106041a, null, null, 0, 0, 0, null, false, null, null, false, 65503, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$u */
    public static final class C45529u extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ PromotionView f106042a;

        static {
            Covode.recordClassIndex(54018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45529u(PromotionView promotionView) {
            super(1);
            this.f106042a = promotionView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, this.f106042a, null, null, null, 0, 0, 0, null, false, null, null, false, 65519, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$v */
    public static final class C45530v extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ boolean f106043a;

        static {
            Covode.recordClassIndex(54019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45530v(boolean z) {
            super(1);
            this.f106043a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, this.f106043a, 32767, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$w */
    public static final class C45531w extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ EnumC45533a f106044a;

        static {
            Covode.recordClassIndex(54020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45531w(EnumC45533a aVar) {
            super(1);
            this.f106044a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, this.f106044a, null, false, 57343, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$x */
    public static final class C45532x extends AbstractC89220m implements AbstractC89172b<SkuState, SkuState> {

        /* renamed from: a */
        final /* synthetic */ String f106045a;

        static {
            Covode.recordClassIndex(54021);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45532x(String str) {
            super(1);
            this.f106045a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SkuState invoke(SkuState skuState) {
            SkuState skuState2 = skuState;
            C89219l.m154721d(skuState2, "");
            return SkuState.copy$default(skuState2, null, null, null, null, null, null, null, this.f106045a, 0, 0, 0, null, false, null, null, false, 65407, null);
        }
    }

    /* renamed from: a */
    private void m88055a(Boolean bool) {
        mo33689c(new C45527s(bool));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$c */
    public static final class C45508c extends AbstractC89220m implements AbstractC89172b<C43642c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelViewModel f106018a;

        static {
            Covode.recordClassIndex(53997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45508c(SkuPanelViewModel skuPanelViewModel) {
            super(1);
            this.f106018a = skuPanelViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C43642c cVar) {
            ExceptionUX exceptionUX;
            Integer exceptionUXType;
            C43642c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            T t = cVar2.data;
            String str = null;
            if (!(t == null || (exceptionUX = t.f101719b) == null || (exceptionUXType = exceptionUX.getExceptionUXType()) == null || exceptionUXType.intValue() != 1)) {
                Integer valueOf = Integer.valueOf(cVar2.code);
                SkuPanelStarter.SkuEnterParams skuEnterParams = this.f106018a.f106007e;
                if (skuEnterParams != null) {
                    str = skuEnterParams.getEnterFrom();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_name", "sku");
                linkedHashMap.put("popup_name", "go_to_cart");
                if (!C45383a.f105750a.containsKey("previous_page") && str != null) {
                    linkedHashMap.put("previous_page", str);
                }
                linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                if (valueOf != null) {
                    linkedHashMap.put("error_code", Integer.valueOf(valueOf.intValue()));
                }
                C45544c.m88082a("tiktokec_popup_show", linkedHashMap);
            }
            return false;
        }
    }

    /* renamed from: a */
    private void m88056a(String str) {
        mo33689c(new C45522n(str));
    }

    /* renamed from: b */
    public final void mo76707b(boolean z) {
        mo33689c(new C45530v(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$d */
    public static final class C45509d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SkuPanelViewModel f106019a;

        /* renamed from: b */
        final /* synthetic */ SkuItem f106020b;

        static {
            Covode.recordClassIndex(53998);
        }

        public C45509d(SkuPanelViewModel skuPanelViewModel, SkuItem skuItem) {
            this.f106019a = skuPanelViewModel;
            this.f106020b = skuItem;
        }

        /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x010b  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0185  */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r26) {
            /*
            // Method dump skipped, instructions count: 444
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel.C45509d.accept(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    public final void mo76701a(int i) {
        mo33689c(new C45523o(i));
        SkuPanelState skuPanelState = this.f106005c;
        if (skuPanelState != null) {
            skuPanelState.setProductQuantity(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo76702a(ProductPackStruct productPackStruct) {
        String[] strArr;
        Integer num;
        String str;
        ProductPrice productPrice;
        Image image;
        String str2;
        List<Image> list;
        this.f106008f = productPackStruct;
        C45383a.m87958a(productPackStruct);
        String str3 = productPackStruct.f104674b;
        if (str3 == null) {
            str3 = "0";
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.f106007e;
        String str4 = null;
        if (skuEnterParams != null) {
            strArr = skuEnterParams.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.f106007e;
        if (skuEnterParams2 != null) {
            num = skuEnterParams2.getProductQuantity();
        } else {
            num = null;
        }
        List<SkuItem> list2 = productPackStruct.f104679g;
        List<SaleProp> list3 = productPackStruct.f104678f;
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.f106007e;
        if (skuEnterParams3 != null) {
            str = skuEnterParams3.getEnterFrom();
        } else {
            str = null;
        }
        ProductBase productBase = productPackStruct.f104677e;
        if (productBase != null) {
            productPrice = productBase.f104663g;
        } else {
            productPrice = null;
        }
        ProductBase productBase2 = productPackStruct.f104677e;
        if (productBase2 == null || (list = productBase2.f104660d) == null) {
            image = null;
        } else {
            image = (Image) C89070n.m154561b((List) list, 0);
        }
        SellerInfo sellerInfo = productPackStruct.f104676d;
        if (sellerInfo != null) {
            str2 = sellerInfo.f104704a;
        } else {
            str2 = null;
        }
        SkuPanelStarter.SkuRenderParams skuRenderParams = new SkuPanelStarter.SkuRenderParams(str3, strArr, num, list2, list3, str, productPrice, image, str2, productPackStruct.f104689q, productPackStruct);
        String productId = skuRenderParams.getProductId();
        SkuPanelStarter.SkuEnterParams skuEnterParams4 = this.f106007e;
        if (skuEnterParams4 != null) {
            str4 = skuEnterParams4.getProductId();
        }
        if (C89219l.m154714a((Object) productId, (Object) str4)) {
            m88053a(new SkuInfo(skuRenderParams.getSkuList(), skuRenderParams.getSalePropList()), skuRenderParams.getPrice(), skuRenderParams.getMainPicture(), new SkuPanelState(skuRenderParams.getProductId(), null, null, null, skuRenderParams.getCheckedSkuIds(), skuRenderParams.getProductQuantity(), false, 0, null, null, null, 1984, null), skuRenderParams.getSellerId(), skuRenderParams.getAddToCartButton());
            mo76703a(EnumC45533a.SUCCESS);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel$b */
    public static final class C45507b extends AbstractC89220m implements AbstractC89183m<C43642c, ButtonAction, Boolean> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelViewModel f106016a;

        /* renamed from: b */
        final /* synthetic */ View f106017b;

        static {
            Covode.recordClassIndex(53996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45507b(SkuPanelViewModel skuPanelViewModel, View view) {
            super(2);
            this.f106016a = skuPanelViewModel;
            this.f106017b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(C43642c cVar, ButtonAction buttonAction) {
            String str;
            Integer num;
            Integer buttonActionType;
            String str2;
            Context context;
            HashMap<String, Object> hashMap;
            Object obj;
            String str3;
            HashMap<String, Object> visitReportParams;
            C43642c cVar2 = cVar;
            ButtonAction buttonAction2 = buttonAction;
            String str4 = "";
            C89219l.m154721d(cVar2, str4);
            String valueOf = String.valueOf(cVar2.code);
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.f106016a.f106007e;
            String str5 = null;
            if (skuEnterParams != null) {
                str = skuEnterParams.getEnterFrom();
            } else {
                str = null;
            }
            if (buttonAction2 != null) {
                num = buttonAction2.getButtonActionType();
            } else {
                num = null;
            }
            boolean z = true;
            if (num != null) {
                if (num.intValue() == 0 || num.intValue() == 1) {
                    str4 = "stay";
                } else if (num.intValue() == 3) {
                    str4 = "enter";
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "sku");
            linkedHashMap.put("popup_name", "go_to_cart");
            if (!C45383a.f105750a.containsKey("previous_page") && str != null) {
                linkedHashMap.put("previous_page", str);
            }
            if (valueOf != null) {
                linkedHashMap.put("error_code", valueOf);
            }
            linkedHashMap.put("action_type", str4);
            C45544c.m88082a("tiktokec_popup_click", linkedHashMap);
            if (!(buttonAction2 == null || (buttonActionType = buttonAction2.getButtonActionType()) == null || buttonActionType.intValue() != 3)) {
                ButtonActionInfo buttonActionInfo = buttonAction2.getButtonActionInfo();
                if (buttonActionInfo != null) {
                    str2 = buttonActionInfo.getSchema();
                } else {
                    str2 = null;
                }
                if (C80537hk.m139613a(str2)) {
                    View view = this.f106017b;
                    if (view != null) {
                        context = view.getContext();
                    } else {
                        context = null;
                    }
                    SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.f106016a.f106007e;
                    if (skuEnterParams2 != null) {
                        hashMap = skuEnterParams2.getTrackParams();
                    } else {
                        hashMap = null;
                    }
                    SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.f106016a.f106007e;
                    if (skuEnterParams3 == null || (visitReportParams = skuEnterParams3.getVisitReportParams()) == null) {
                        obj = null;
                    } else {
                        obj = visitReportParams.get("chain_key");
                    }
                    String str6 = (String) obj;
                    SkuPanelStarter.SkuEnterParams skuEnterParams4 = this.f106016a.f106007e;
                    if (skuEnterParams4 != null) {
                        str3 = skuEnterParams4.getEnterFrom();
                    } else {
                        str3 = null;
                    }
                    ButtonActionInfo buttonActionInfo2 = buttonAction2.getButtonActionInfo();
                    if (buttonActionInfo2 != null) {
                        str5 = buttonActionInfo2.getSchema();
                    }
                    C43625a.m86647a(context, hashMap, null, str6, str3, str5);
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private final void m88053a(SkuInfo skuInfo, ProductPrice productPrice, Image image, SkuPanelState skuPanelState, String str, AddToCartButton addToCartButton) {
        boolean z;
        int i;
        Integer stockNum;
        List<SaleProp> list;
        List<SalePropValue> list2;
        SkuItem skuItem;
        this.f106006d = skuInfo;
        this.f106013o = image;
        this.f106005c = skuPanelState;
        this.f106014p = productPrice;
        this.f106015q = addToCartButton;
        this.f106011l = str;
        List<SkuItem> list3 = skuInfo.f105853a;
        if (list3 == null || list3.size() != 1) {
            z = false;
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        this.f106010k = valueOf;
        SkuPanelState skuPanelState2 = this.f106005c;
        if (skuPanelState2 != null) {
            skuPanelState2.setSingleSku(valueOf);
        }
        String[] strArr = null;
        m88055a(productPrice != null ? productPrice.f104700d : null);
        m88056a(productPrice != null ? productPrice.f104698b : null);
        List<SkuItem> list4 = skuInfo.f105853a;
        m88054a((list4 == null || (skuItem = (SkuItem) C89070n.m154583g((List) list4)) == null) ? null : skuItem.getPromotionView());
        m88061d(productPrice != null ? productPrice.f104699c : null);
        m88062e(productPrice != null ? productPrice.f104697a : null);
        mo33689c(new C45516j(this.f106015q));
        SkuInfo skuInfo2 = this.f106006d;
        if (!(skuInfo2 == null || (list = skuInfo2.f105854b) == null || list.isEmpty())) {
            SaleProp saleProp = (SaleProp) C89070n.m154583g((List) list);
            if (!C89219l.m154714a((Object) (saleProp != null ? saleProp.f105848c : null), (Object) true) || (list2 = saleProp.f105849d) == null || list2.isEmpty()) {
                Image image2 = this.f106013o;
                if (image2 != null) {
                    m88052a(image2);
                    this.f106003a.add(image2);
                }
            } else {
                SalePropValue salePropValue = (SalePropValue) C89070n.m154583g((List) saleProp.f105849d);
                m88052a(salePropValue != null ? salePropValue.f105852c : null);
                for (SalePropValue salePropValue2 : saleProp.f105849d) {
                    Image image3 = salePropValue2.f105852c;
                    if (image3 != null) {
                        this.f106003a.add(image3);
                    }
                    String str2 = salePropValue2.f105851b;
                    if (str2 != null) {
                        this.f106004b.add(str2);
                    }
                }
            }
        }
        Integer productQuantity = skuPanelState.getProductQuantity();
        if (productQuantity != null) {
            i = productQuantity.intValue();
        } else {
            i = 1;
        }
        SkuPanelState skuPanelState3 = this.f106005c;
        if (skuPanelState3 != null) {
            strArr = skuPanelState3.getCheckedSkuIds();
        }
        List<SkuItem> list5 = skuInfo.f105853a;
        if (list5 != null && list5.size() == 1 && (stockNum = skuInfo.f105853a.get(0).getStockNum()) != null && stockNum.intValue() > 0) {
            List<SkuSaleProp> skuSalePropList = skuInfo.f105853a.get(0).getSkuSalePropList();
            if (skuSalePropList != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) skuSalePropList, 10));
                Iterator<T> it = skuSalePropList.iterator();
                while (it.hasNext()) {
                    String str3 = it.next().f105871b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(str3);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                strArr = (String[]) array;
            }
            mo76701a(i);
        }
        if (strArr != null) {
            mo76705a(strArr);
        }
        mo76701a(i);
    }
}
