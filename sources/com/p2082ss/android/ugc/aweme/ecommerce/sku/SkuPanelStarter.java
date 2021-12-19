package com.p2082ss.android.ugc.aweme.ecommerce.sku;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p4600h.C89379q;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter */
public final class SkuPanelStarter {

    /* renamed from: a */
    public static AbstractC89124d<? super SkuPanelState> f105747a;

    /* renamed from: b */
    public static Long f105748b;

    /* renamed from: c */
    public static final SkuPanelStarter f105749c = new SkuPanelStarter();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter$SkuEnterParams */
    public static final class SkuEnterParams implements Serializable {
        @AbstractC27891c(mo46611a = "checked_spec_ids")
        private final String[] checkedSkuIds;
        @AbstractC27891c(mo46611a = "click_from")
        private final int clickFrom;
        @AbstractC27891c(mo46611a = "enter_from")
        private final String enterFrom;
        @AbstractC27891c(mo46611a = "need_request")
        private final boolean needRequest;
        @AbstractC27891c(mo46611a = "orderRequestParams")
        private final HashMap<String, Object> orderRequestParams;
        @AbstractC27891c(mo46611a = "needs_dim")
        private final Boolean pdpFullScreen;
        @AbstractC27891c(mo46611a = "product_id")
        private final String productId;
        @AbstractC27891c(mo46611a = "quantity")
        private Integer productQuantity;
        @AbstractC27891c(mo46611a = "trackParams")
        private final HashMap<String, Object> trackParams;
        @AbstractC27891c(mo46611a = "use_prefetch")
        private final Integer usePrefetch;
        @AbstractC27891c(mo46611a = "visitReportParams")
        private final HashMap<String, Object> visitReportParams;

        static {
            Covode.recordClassIndex(53852);
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m87955x19828aad(int i) {
            return i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter$SkuEnterParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SkuEnterParams copy$default(SkuEnterParams skuEnterParams, String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, Integer num2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = skuEnterParams.productId;
            }
            if ((i2 & 2) != 0) {
                bool = skuEnterParams.pdpFullScreen;
            }
            if ((i2 & 4) != 0) {
                z = skuEnterParams.needRequest;
            }
            if ((i2 & 8) != 0) {
                i = skuEnterParams.clickFrom;
            }
            if ((i2 & 16) != 0) {
                str2 = skuEnterParams.enterFrom;
            }
            if ((i2 & 32) != 0) {
                strArr = skuEnterParams.checkedSkuIds;
            }
            if ((i2 & 64) != 0) {
                num = skuEnterParams.productQuantity;
            }
            if ((i2 & 128) != 0) {
                hashMap = skuEnterParams.trackParams;
            }
            if ((i2 & 256) != 0) {
                hashMap2 = skuEnterParams.orderRequestParams;
            }
            if ((i2 & 512) != 0) {
                hashMap3 = skuEnterParams.visitReportParams;
            }
            if ((i2 & 1024) != 0) {
                num2 = skuEnterParams.usePrefetch;
            }
            return skuEnterParams.copy(str, bool, z, i, str2, strArr, num, hashMap, hashMap2, hashMap3, num2);
        }

        public final String component1() {
            return this.productId;
        }

        public final HashMap<String, Object> component10() {
            return this.visitReportParams;
        }

        public final Integer component11() {
            return this.usePrefetch;
        }

        public final Boolean component2() {
            return this.pdpFullScreen;
        }

        public final boolean component3() {
            return this.needRequest;
        }

        public final int component4() {
            return this.clickFrom;
        }

        public final String component5() {
            return this.enterFrom;
        }

        public final String[] component6() {
            return this.checkedSkuIds;
        }

        public final Integer component7() {
            return this.productQuantity;
        }

        public final HashMap<String, Object> component8() {
            return this.trackParams;
        }

        public final HashMap<String, Object> component9() {
            return this.orderRequestParams;
        }

        public final SkuEnterParams copy(String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, Integer num2) {
            return new SkuEnterParams(str, bool, z, i, str2, strArr, num, hashMap, hashMap2, hashMap3, num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkuEnterParams)) {
                return false;
            }
            SkuEnterParams skuEnterParams = (SkuEnterParams) obj;
            return C89219l.m154714a(this.productId, skuEnterParams.productId) && C89219l.m154714a(this.pdpFullScreen, skuEnterParams.pdpFullScreen) && this.needRequest == skuEnterParams.needRequest && this.clickFrom == skuEnterParams.clickFrom && C89219l.m154714a(this.enterFrom, skuEnterParams.enterFrom) && C89219l.m154714a(this.checkedSkuIds, skuEnterParams.checkedSkuIds) && C89219l.m154714a(this.productQuantity, skuEnterParams.productQuantity) && C89219l.m154714a(this.trackParams, skuEnterParams.trackParams) && C89219l.m154714a(this.orderRequestParams, skuEnterParams.orderRequestParams) && C89219l.m154714a(this.visitReportParams, skuEnterParams.visitReportParams) && C89219l.m154714a(this.usePrefetch, skuEnterParams.usePrefetch);
        }

        public final int hashCode() {
            String str = this.productId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Boolean bool = this.pdpFullScreen;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.needRequest;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode2 + i2) * 31) + m87955x19828aad(this.clickFrom)) * 31;
            String str2 = this.enterFrom;
            int hashCode3 = (com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String[] strArr = this.checkedSkuIds;
            int hashCode4 = (hashCode3 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            Integer num = this.productQuantity;
            int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap = this.trackParams;
            int hashCode6 = (hashCode5 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap2 = this.orderRequestParams;
            int hashCode7 = (hashCode6 + (hashMap2 != null ? hashMap2.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap3 = this.visitReportParams;
            int hashCode8 = (hashCode7 + (hashMap3 != null ? hashMap3.hashCode() : 0)) * 31;
            Integer num2 = this.usePrefetch;
            if (num2 != null) {
                i = num2.hashCode();
            }
            return hashCode8 + i;
        }

        public final String toString() {
            return "SkuEnterParams(productId=" + this.productId + ", pdpFullScreen=" + this.pdpFullScreen + ", needRequest=" + this.needRequest + ", clickFrom=" + this.clickFrom + ", enterFrom=" + this.enterFrom + ", checkedSkuIds=" + Arrays.toString(this.checkedSkuIds) + ", productQuantity=" + this.productQuantity + ", trackParams=" + this.trackParams + ", orderRequestParams=" + this.orderRequestParams + ", visitReportParams=" + this.visitReportParams + ", usePrefetch=" + this.usePrefetch + ")";
        }

        public final String[] getCheckedSkuIds() {
            return this.checkedSkuIds;
        }

        public final int getClickFrom() {
            return this.clickFrom;
        }

        public final String getEnterFrom() {
            return this.enterFrom;
        }

        public final boolean getNeedRequest() {
            return this.needRequest;
        }

        public final HashMap<String, Object> getOrderRequestParams() {
            return this.orderRequestParams;
        }

        public final Boolean getPdpFullScreen() {
            return this.pdpFullScreen;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final Integer getProductQuantity() {
            return this.productQuantity;
        }

        public final HashMap<String, Object> getTrackParams() {
            return this.trackParams;
        }

        public final Integer getUsePrefetch() {
            return this.usePrefetch;
        }

        public final HashMap<String, Object> getVisitReportParams() {
            return this.visitReportParams;
        }

        public final void setProductQuantity(Integer num) {
            this.productQuantity = num;
        }

        public SkuEnterParams(String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, Integer num2) {
            this.productId = str;
            this.pdpFullScreen = bool;
            this.needRequest = z;
            this.clickFrom = i;
            this.enterFrom = str2;
            this.checkedSkuIds = strArr;
            this.productQuantity = num;
            this.trackParams = hashMap;
            this.orderRequestParams = hashMap2;
            this.visitReportParams = hashMap3;
            this.usePrefetch = num2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SkuEnterParams(String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, Integer num2, int i2, C89214g gVar) {
            this(str, bool, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : strArr, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : hashMap, (i2 & 256) != 0 ? null : hashMap2, (i2 & 512) != 0 ? null : hashMap3, (i2 & 1024) == 0 ? num2 : null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter$SkuKeyboardVisibilityParams */
    public static final class SkuKeyboardVisibilityParams {
        @AbstractC27891c(mo46611a = "keyboard_visibility")
        private final boolean keyboardVisibility;

        static {
            Covode.recordClassIndex(53853);
        }

        public static /* synthetic */ SkuKeyboardVisibilityParams copy$default(SkuKeyboardVisibilityParams skuKeyboardVisibilityParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = skuKeyboardVisibilityParams.keyboardVisibility;
            }
            return skuKeyboardVisibilityParams.copy(z);
        }

        public final boolean component1() {
            return this.keyboardVisibility;
        }

        public final SkuKeyboardVisibilityParams copy(boolean z) {
            return new SkuKeyboardVisibilityParams(z);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SkuKeyboardVisibilityParams) && this.keyboardVisibility == ((SkuKeyboardVisibilityParams) obj).keyboardVisibility;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.keyboardVisibility;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "SkuKeyboardVisibilityParams(keyboardVisibility=" + this.keyboardVisibility + ")";
        }

        public final boolean getKeyboardVisibility() {
            return this.keyboardVisibility;
        }

        public SkuKeyboardVisibilityParams(boolean z) {
            this.keyboardVisibility = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter$SkuOperationParams */
    public static final class SkuOperationParams {
        @AbstractC27891c(mo46611a = "product_id")
        private final String productId;
        @AbstractC27891c(mo46611a = StringSet.type)
        private final int type;

        static {
            Covode.recordClassIndex(53854);
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuOperationParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m87956x475ff57c(int i) {
            return i;
        }

        public static /* synthetic */ SkuOperationParams copy$default(SkuOperationParams skuOperationParams, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = skuOperationParams.productId;
            }
            if ((i2 & 2) != 0) {
                i = skuOperationParams.type;
            }
            return skuOperationParams.copy(str, i);
        }

        public final String component1() {
            return this.productId;
        }

        public final int component2() {
            return this.type;
        }

        public final SkuOperationParams copy(String str, int i) {
            C89219l.m154721d(str, "");
            return new SkuOperationParams(str, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkuOperationParams)) {
                return false;
            }
            SkuOperationParams skuOperationParams = (SkuOperationParams) obj;
            return C89219l.m154714a(this.productId, skuOperationParams.productId) && this.type == skuOperationParams.type;
        }

        public final int hashCode() {
            String str = this.productId;
            return ((str != null ? str.hashCode() : 0) * 31) + m87956x475ff57c(this.type);
        }

        public final String toString() {
            return "SkuOperationParams(productId=" + this.productId + ", type=" + this.type + ")";
        }

        public final String getProductId() {
            return this.productId;
        }

        public final int getType() {
            return this.type;
        }

        public SkuOperationParams(String str, int i) {
            C89219l.m154721d(str, "");
            this.productId = str;
            this.type = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter$SkuRenderParams */
    public static final class SkuRenderParams {
        @AbstractC27891c(mo46611a = "add_to_cart_button")
        private final AddToCartButton addToCartButton;
        @AbstractC27891c(mo46611a = "checked_sku_ids")
        private String[] checkedSkuIds;
        @AbstractC27891c(mo46611a = "enter_from")
        private final String enterFrom;
        @AbstractC27891c(mo46611a = "product_image")
        private final Image mainPicture;
        @AbstractC27891c(mo46611a = "product_price")
        private final ProductPrice price;
        @AbstractC27891c(mo46611a = "product_id")
        private final String productId;
        @AbstractC27891c(mo46611a = "product")
        private final ProductPackStruct productInfoPack;
        @AbstractC27891c(mo46611a = "quantity")
        private Integer productQuantity;
        @AbstractC27891c(mo46611a = "specs")
        private final List<SaleProp> salePropList;
        @AbstractC27891c(mo46611a = "seller_id")
        private final String sellerId;
        @AbstractC27891c(mo46611a = "skus")
        private final List<SkuItem> skuList;

        static {
            Covode.recordClassIndex(53855);
        }

        public final AddToCartButton getAddToCartButton() {
            return this.addToCartButton;
        }

        public final String[] getCheckedSkuIds() {
            return this.checkedSkuIds;
        }

        public final String getEnterFrom() {
            return this.enterFrom;
        }

        public final Image getMainPicture() {
            return this.mainPicture;
        }

        public final ProductPrice getPrice() {
            return this.price;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final ProductPackStruct getProductInfoPack() {
            return this.productInfoPack;
        }

        public final Integer getProductQuantity() {
            return this.productQuantity;
        }

        public final List<SaleProp> getSalePropList() {
            return this.salePropList;
        }

        public final String getSellerId() {
            return this.sellerId;
        }

        public final List<SkuItem> getSkuList() {
            return this.skuList;
        }

        public final void setCheckedSkuIds(String[] strArr) {
            this.checkedSkuIds = strArr;
        }

        public final void setProductQuantity(Integer num) {
            this.productQuantity = num;
        }

        public SkuRenderParams(String str, String[] strArr, Integer num, List<SkuItem> list, List<SaleProp> list2, String str2, ProductPrice productPrice, Image image, String str3, AddToCartButton addToCartButton2, ProductPackStruct productPackStruct) {
            C89219l.m154721d(str, "");
            this.productId = str;
            this.checkedSkuIds = strArr;
            this.productQuantity = num;
            this.skuList = list;
            this.salePropList = list2;
            this.enterFrom = str2;
            this.price = productPrice;
            this.mainPicture = image;
            this.sellerId = str3;
            this.addToCartButton = addToCartButton2;
            this.productInfoPack = productPackStruct;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SkuRenderParams(String str, String[] strArr, Integer num, List list, List list2, String str2, ProductPrice productPrice, Image image, String str3, AddToCartButton addToCartButton2, ProductPackStruct productPackStruct, int i, C89214g gVar) {
            this(str, strArr, num, list, list2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : productPrice, (i & 128) == 0 ? image : null, str3, addToCartButton2, productPackStruct);
        }
    }

    private SkuPanelStarter() {
    }

    static {
        Covode.recordClassIndex(53851);
    }

    /* renamed from: a */
    public static void m87954a(SkuPanelState skuPanelState) {
        AbstractC89124d<? super SkuPanelState> dVar = f105747a;
        if (dVar != null) {
            dVar.resumeWith(C89379q.m157068constructorimpl(skuPanelState));
        }
        f105747a = null;
    }

    /* renamed from: a */
    public static IPdpStarter.PdpEnterParam m87953a(SkuEnterParams skuEnterParams) {
        HashMap<String, Object> hashMap;
        HashMap<String, Object> hashMap2;
        boolean z;
        Boolean pdpFullScreen;
        String productId;
        HashMap hashMap3 = new HashMap();
        if (!(skuEnterParams == null || (productId = skuEnterParams.getProductId()) == null)) {
            hashMap3.put("product_id", C89070n.m154516a(productId));
        }
        HashMap<String, Object> hashMap4 = null;
        if (skuEnterParams != null) {
            hashMap = skuEnterParams.getOrderRequestParams();
            hashMap2 = skuEnterParams.getVisitReportParams();
            hashMap4 = skuEnterParams.getTrackParams();
        } else {
            hashMap = null;
            hashMap2 = null;
        }
        if (skuEnterParams == null || (pdpFullScreen = skuEnterParams.getPdpFullScreen()) == null) {
            z = false;
        } else {
            z = pdpFullScreen.booleanValue();
        }
        return new IPdpStarter.PdpEnterParam(hashMap3, hashMap, hashMap4, hashMap2, z, 0.0f, null, false, false, false, null, 2016, null);
    }
}
