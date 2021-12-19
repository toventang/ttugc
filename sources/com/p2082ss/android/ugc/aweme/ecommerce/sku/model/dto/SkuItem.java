package com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem */
public final class SkuItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<SkuItem> CREATOR = new C45436a();
    @AbstractC27891c(mo46611a = "sku_id")

    /* renamed from: a */
    private final String f105855a;
    @AbstractC27891c(mo46611a = "sku_sale_props")

    /* renamed from: b */
    private final List<SkuSaleProp> f105856b;
    @AbstractC27891c(mo46611a = "sale_prop_value_ids")

    /* renamed from: c */
    private final String f105857c;
    @AbstractC27891c(mo46611a = "stock")

    /* renamed from: d */
    private final Integer f105858d;
    @AbstractC27891c(mo46611a = "low_stock_warning")

    /* renamed from: e */
    private final String f105859e;
    @AbstractC27891c(mo46611a = "purchase_limit")

    /* renamed from: f */
    private final Integer f105860f;
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: g */
    private final SkuPrice f105861g;
    @AbstractC27891c(mo46611a = "need_icon")

    /* renamed from: h */
    private final Boolean f105862h;
    @AbstractC27891c(mo46611a = "voucher_info")

    /* renamed from: i */
    private final SkuVoucher f105863i;
    @AbstractC27891c(mo46611a = "warehouse_id")

    /* renamed from: j */
    private String f105864j;
    @AbstractC27891c(mo46611a = "add_to_cart_button")

    /* renamed from: k */
    private final AddToCartButton f105865k;
    @AbstractC27891c(mo46611a = "promotion_view")

    /* renamed from: l */
    private final PromotionView f105866l;

    static {
        Covode.recordClassIndex(53915);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkuItem copy$default(SkuItem skuItem, String str, List list, String str2, Integer num, String str3, Integer num2, SkuPrice skuPrice, Boolean bool, SkuVoucher skuVoucher, String str4, AddToCartButton addToCartButton, PromotionView promotionView, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skuItem.f105855a;
        }
        if ((i & 2) != 0) {
            list = skuItem.f105856b;
        }
        if ((i & 4) != 0) {
            str2 = skuItem.f105857c;
        }
        if ((i & 8) != 0) {
            num = skuItem.f105858d;
        }
        if ((i & 16) != 0) {
            str3 = skuItem.f105859e;
        }
        if ((i & 32) != 0) {
            num2 = skuItem.f105860f;
        }
        if ((i & 64) != 0) {
            skuPrice = skuItem.f105861g;
        }
        if ((i & 128) != 0) {
            bool = skuItem.f105862h;
        }
        if ((i & 256) != 0) {
            skuVoucher = skuItem.f105863i;
        }
        if ((i & 512) != 0) {
            str4 = skuItem.f105864j;
        }
        if ((i & 1024) != 0) {
            addToCartButton = skuItem.f105865k;
        }
        if ((i & 2048) != 0) {
            promotionView = skuItem.f105866l;
        }
        return skuItem.copy(str, list, str2, num, str3, num2, skuPrice, bool, skuVoucher, str4, addToCartButton, promotionView);
    }

    public final String component1() {
        return this.f105855a;
    }

    public final String component10() {
        return this.f105864j;
    }

    public final AddToCartButton component11() {
        return this.f105865k;
    }

    public final PromotionView component12() {
        return this.f105866l;
    }

    public final List<SkuSaleProp> component2() {
        return this.f105856b;
    }

    public final String component3() {
        return this.f105857c;
    }

    public final Integer component4() {
        return this.f105858d;
    }

    public final String component5() {
        return this.f105859e;
    }

    public final Integer component6() {
        return this.f105860f;
    }

    public final SkuPrice component7() {
        return this.f105861g;
    }

    public final Boolean component8() {
        return this.f105862h;
    }

    public final SkuVoucher component9() {
        return this.f105863i;
    }

    public final SkuItem copy(String str, List<SkuSaleProp> list, String str2, Integer num, String str3, Integer num2, SkuPrice skuPrice, Boolean bool, SkuVoucher skuVoucher, String str4, AddToCartButton addToCartButton, PromotionView promotionView) {
        return new SkuItem(str, list, str2, num, str3, num2, skuPrice, bool, skuVoucher, str4, addToCartButton, promotionView);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuItem)) {
            return false;
        }
        SkuItem skuItem = (SkuItem) obj;
        return C89219l.m154714a(this.f105855a, skuItem.f105855a) && C89219l.m154714a(this.f105856b, skuItem.f105856b) && C89219l.m154714a(this.f105857c, skuItem.f105857c) && C89219l.m154714a(this.f105858d, skuItem.f105858d) && C89219l.m154714a(this.f105859e, skuItem.f105859e) && C89219l.m154714a(this.f105860f, skuItem.f105860f) && C89219l.m154714a(this.f105861g, skuItem.f105861g) && C89219l.m154714a(this.f105862h, skuItem.f105862h) && C89219l.m154714a(this.f105863i, skuItem.f105863i) && C89219l.m154714a(this.f105864j, skuItem.f105864j) && C89219l.m154714a(this.f105865k, skuItem.f105865k) && C89219l.m154714a(this.f105866l, skuItem.f105866l);
    }

    public final int hashCode() {
        String str = this.f105855a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<SkuSaleProp> list = this.f105856b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f105857c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f105858d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f105859e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.f105860f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        SkuPrice skuPrice = this.f105861g;
        int hashCode7 = (hashCode6 + (skuPrice != null ? skuPrice.hashCode() : 0)) * 31;
        Boolean bool = this.f105862h;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        SkuVoucher skuVoucher = this.f105863i;
        int hashCode9 = (hashCode8 + (skuVoucher != null ? skuVoucher.hashCode() : 0)) * 31;
        String str4 = this.f105864j;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AddToCartButton addToCartButton = this.f105865k;
        int hashCode11 = (hashCode10 + (addToCartButton != null ? addToCartButton.hashCode() : 0)) * 31;
        PromotionView promotionView = this.f105866l;
        if (promotionView != null) {
            i = promotionView.hashCode();
        }
        return hashCode11 + i;
    }

    public final SkuItem merge(SkuItem skuItem) {
        return skuItem == null ? this : skuItem;
    }

    public final String toString() {
        return "SkuItem(skuId=" + this.f105855a + ", skuSalePropList=" + this.f105856b + ", salePropValueIds=" + this.f105857c + ", stockNum=" + this.f105858d + ", lowStockWarning=" + this.f105859e + ", purchaseLimit=" + this.f105860f + ", price=" + this.f105861g + ", needIcon=" + this.f105862h + ", voucherInfo=" + this.f105863i + ", warehouseId=" + this.f105864j + ", addToCartButton=" + this.f105865k + ", promotionView=" + this.f105866l + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f105855a);
        List<SkuSaleProp> list = this.f105856b;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SkuSaleProp skuSaleProp : list) {
                skuSaleProp.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f105857c);
        Integer num = this.f105858d;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f105859e);
        Integer num2 = this.f105860f;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        SkuPrice skuPrice = this.f105861g;
        if (skuPrice != null) {
            parcel.writeInt(1);
            skuPrice.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f105862h;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        SkuVoucher skuVoucher = this.f105863i;
        if (skuVoucher != null) {
            parcel.writeInt(1);
            skuVoucher.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f105864j);
        AddToCartButton addToCartButton = this.f105865k;
        if (addToCartButton != null) {
            parcel.writeInt(1);
            addToCartButton.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.f105866l, i);
    }

    public final AddToCartButton getAddToCartButton() {
        return this.f105865k;
    }

    public final String getLowStockWarning() {
        return this.f105859e;
    }

    public final Boolean getNeedIcon() {
        return this.f105862h;
    }

    public final SkuPrice getPrice() {
        return this.f105861g;
    }

    public final PromotionView getPromotionView() {
        return this.f105866l;
    }

    public final Integer getPurchaseLimit() {
        return this.f105860f;
    }

    public final String getSalePropValueIds() {
        return this.f105857c;
    }

    public final String getSkuId() {
        return this.f105855a;
    }

    public final List<SkuSaleProp> getSkuSalePropList() {
        return this.f105856b;
    }

    public final Integer getStockNum() {
        return this.f105858d;
    }

    public final SkuVoucher getVoucherInfo() {
        return this.f105863i;
    }

    public final String getWarehouseId() {
        return this.f105864j;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem$a */
    public static class C45436a implements Parcelable.Creator<SkuItem> {
        static {
            Covode.recordClassIndex(53916);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuItem[] newArray(int i) {
            return new SkuItem[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            AddToCartButton addToCartButton = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(SkuSaleProp.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            String readString2 = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            SkuPrice createFromParcel = parcel.readInt() != 0 ? SkuPrice.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            SkuVoucher createFromParcel2 = parcel.readInt() != 0 ? SkuVoucher.CREATOR.createFromParcel(parcel) : null;
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                addToCartButton = AddToCartButton.CREATOR.createFromParcel(parcel);
            }
            return new SkuItem(readString, arrayList, readString2, valueOf, readString3, valueOf2, createFromParcel, bool, createFromParcel2, readString4, addToCartButton, (PromotionView) parcel.readParcelable(SkuItem.class.getClassLoader()));
        }
    }

    public final void setWarehouseId(String str) {
        this.f105864j = str;
    }

    public SkuItem(String str, List<SkuSaleProp> list, String str2, Integer num, String str3, Integer num2, SkuPrice skuPrice, Boolean bool, SkuVoucher skuVoucher, String str4, AddToCartButton addToCartButton, PromotionView promotionView) {
        this.f105855a = str;
        this.f105856b = list;
        this.f105857c = str2;
        this.f105858d = num;
        this.f105859e = str3;
        this.f105860f = num2;
        this.f105861g = skuPrice;
        this.f105862h = bool;
        this.f105863i = skuVoucher;
        this.f105864j = str4;
        this.f105865k = addToCartButton;
        this.f105866l = promotionView;
    }
}
