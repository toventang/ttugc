package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PopUp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct */
public final class ProductPackStruct implements Parcelable {
    public static final Parcelable.Creator<ProductPackStruct> CREATOR = new C44881b();

    /* renamed from: y */
    public static final Integer[] f104671y = {2, 1, 3};

    /* renamed from: z */
    public static final C44880a f104672z = new C44880a((byte) 0);

    /* renamed from: a */
    public long f104673a = SystemClock.elapsedRealtime();
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: b */
    public final String f104674b;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: c */
    public final Integer f104675c;
    @AbstractC27891c(mo46611a = "seller")

    /* renamed from: d */
    public final SellerInfo f104676d;
    @AbstractC27891c(mo46611a = "product_base")

    /* renamed from: e */
    public final ProductBase f104677e;
    @AbstractC27891c(mo46611a = "sale_props")

    /* renamed from: f */
    public final List<SaleProp> f104678f;
    @AbstractC27891c(mo46611a = "skus")

    /* renamed from: g */
    public final List<SkuItem> f104679g;
    @AbstractC27891c(mo46611a = "shop_policies")

    /* renamed from: h */
    public final List<ShopPolicy> f104680h;
    @AbstractC27891c(mo46611a = "logistic")

    /* renamed from: i */
    public final LogisticDTO f104681i;
    @AbstractC27891c(mo46611a = "additional_info")

    /* renamed from: j */
    public final List<AdditionInfo> f104682j;
    @AbstractC27891c(mo46611a = "waist_banner")

    /* renamed from: k */
    public final WaistBanner f104683k;
    @AbstractC27891c(mo46611a = "voucher_info")

    /* renamed from: l */
    public final VoucherInfo f104684l;
    @AbstractC27891c(mo46611a = "outer_voucher")

    /* renamed from: m */
    public final Voucher f104685m;
    @AbstractC27891c(mo46611a = "product_detail_review")

    /* renamed from: n */
    public final ProductDetailReview f104686n;
    @AbstractC27891c(mo46611a = "flash_sale")

    /* renamed from: o */
    public final FlashSale f104687o;
    @AbstractC27891c(mo46611a = "third_party")

    /* renamed from: p */
    public final ThirdParty f104688p;
    @AbstractC27891c(mo46611a = "add_to_cart_button")

    /* renamed from: q */
    public final AddToCartButton f104689q;
    @AbstractC27891c(mo46611a = "cart_entry")

    /* renamed from: r */
    public CartEntry f104690r;
    @AbstractC27891c(mo46611a = "activity_info")

    /* renamed from: s */
    public final PickTag f104691s;
    @AbstractC27891c(mo46611a = "promotion_logos")

    /* renamed from: t */
    public final List<PromotionLogo> f104692t;
    @AbstractC27891c(mo46611a = "pop_up")

    /* renamed from: u */
    public PopUp f104693u;
    @AbstractC27891c(mo46611a = "chain_key")

    /* renamed from: v */
    public final String f104694v;
    @AbstractC27891c(mo46611a = "promotion_view")

    /* renamed from: w */
    public final PromotionView f104695w;
    @AbstractC27891c(mo46611a = "half_waist_banner")

    /* renamed from: x */
    public final HalfWaistBanner f104696x;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static ProductPackStruct m87572a(String str, Integer num, SellerInfo sellerInfo, ProductBase productBase, List<SaleProp> list, List<SkuItem> list2, List<ShopPolicy> list3, LogisticDTO logisticDTO, List<AdditionInfo> list4, WaistBanner waistBanner, VoucherInfo voucherInfo, Voucher voucher, ProductDetailReview productDetailReview, FlashSale flashSale, ThirdParty thirdParty, AddToCartButton addToCartButton, CartEntry cartEntry, PickTag pickTag, List<PromotionLogo> list5, PopUp popUp, String str2, PromotionView promotionView, HalfWaistBanner halfWaistBanner) {
        return new ProductPackStruct(str, num, sellerInfo, productBase, list, list2, list3, logisticDTO, list4, waistBanner, voucherInfo, voucher, productDetailReview, flashSale, thirdParty, addToCartButton, cartEntry, pickTag, list5, popUp, str2, promotionView, halfWaistBanner);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPackStruct)) {
            return false;
        }
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        return C89219l.m154714a(this.f104674b, productPackStruct.f104674b) && C89219l.m154714a(this.f104675c, productPackStruct.f104675c) && C89219l.m154714a(this.f104676d, productPackStruct.f104676d) && C89219l.m154714a(this.f104677e, productPackStruct.f104677e) && C89219l.m154714a(this.f104678f, productPackStruct.f104678f) && C89219l.m154714a(this.f104679g, productPackStruct.f104679g) && C89219l.m154714a(this.f104680h, productPackStruct.f104680h) && C89219l.m154714a(this.f104681i, productPackStruct.f104681i) && C89219l.m154714a(this.f104682j, productPackStruct.f104682j) && C89219l.m154714a(this.f104683k, productPackStruct.f104683k) && C89219l.m154714a(this.f104684l, productPackStruct.f104684l) && C89219l.m154714a(this.f104685m, productPackStruct.f104685m) && C89219l.m154714a(this.f104686n, productPackStruct.f104686n) && C89219l.m154714a(this.f104687o, productPackStruct.f104687o) && C89219l.m154714a(this.f104688p, productPackStruct.f104688p) && C89219l.m154714a(this.f104689q, productPackStruct.f104689q) && C89219l.m154714a(this.f104690r, productPackStruct.f104690r) && C89219l.m154714a(this.f104691s, productPackStruct.f104691s) && C89219l.m154714a(this.f104692t, productPackStruct.f104692t) && C89219l.m154714a(this.f104693u, productPackStruct.f104693u) && C89219l.m154714a(this.f104694v, productPackStruct.f104694v) && C89219l.m154714a(this.f104695w, productPackStruct.f104695w) && C89219l.m154714a(this.f104696x, productPackStruct.f104696x);
    }

    public final int hashCode() {
        String str = this.f104674b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f104675c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        SellerInfo sellerInfo = this.f104676d;
        int hashCode3 = (hashCode2 + (sellerInfo != null ? sellerInfo.hashCode() : 0)) * 31;
        ProductBase productBase = this.f104677e;
        int hashCode4 = (hashCode3 + (productBase != null ? productBase.hashCode() : 0)) * 31;
        List<SaleProp> list = this.f104678f;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<SkuItem> list2 = this.f104679g;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ShopPolicy> list3 = this.f104680h;
        int hashCode7 = (hashCode6 + (list3 != null ? list3.hashCode() : 0)) * 31;
        LogisticDTO logisticDTO = this.f104681i;
        int hashCode8 = (hashCode7 + (logisticDTO != null ? logisticDTO.hashCode() : 0)) * 31;
        List<AdditionInfo> list4 = this.f104682j;
        int hashCode9 = (hashCode8 + (list4 != null ? list4.hashCode() : 0)) * 31;
        WaistBanner waistBanner = this.f104683k;
        int hashCode10 = (hashCode9 + (waistBanner != null ? waistBanner.hashCode() : 0)) * 31;
        VoucherInfo voucherInfo = this.f104684l;
        int hashCode11 = (hashCode10 + (voucherInfo != null ? voucherInfo.hashCode() : 0)) * 31;
        Voucher voucher = this.f104685m;
        int hashCode12 = (hashCode11 + (voucher != null ? voucher.hashCode() : 0)) * 31;
        ProductDetailReview productDetailReview = this.f104686n;
        int hashCode13 = (hashCode12 + (productDetailReview != null ? productDetailReview.hashCode() : 0)) * 31;
        FlashSale flashSale = this.f104687o;
        int hashCode14 = (hashCode13 + (flashSale != null ? flashSale.hashCode() : 0)) * 31;
        ThirdParty thirdParty = this.f104688p;
        int hashCode15 = (hashCode14 + (thirdParty != null ? thirdParty.hashCode() : 0)) * 31;
        AddToCartButton addToCartButton = this.f104689q;
        int hashCode16 = (hashCode15 + (addToCartButton != null ? addToCartButton.hashCode() : 0)) * 31;
        CartEntry cartEntry = this.f104690r;
        int hashCode17 = (hashCode16 + (cartEntry != null ? cartEntry.hashCode() : 0)) * 31;
        PickTag pickTag = this.f104691s;
        int hashCode18 = (hashCode17 + (pickTag != null ? pickTag.hashCode() : 0)) * 31;
        List<PromotionLogo> list5 = this.f104692t;
        int hashCode19 = (hashCode18 + (list5 != null ? list5.hashCode() : 0)) * 31;
        PopUp popUp = this.f104693u;
        int hashCode20 = (hashCode19 + (popUp != null ? popUp.hashCode() : 0)) * 31;
        String str2 = this.f104694v;
        int hashCode21 = (hashCode20 + (str2 != null ? str2.hashCode() : 0)) * 31;
        PromotionView promotionView = this.f104695w;
        int hashCode22 = (hashCode21 + (promotionView != null ? promotionView.hashCode() : 0)) * 31;
        HalfWaistBanner halfWaistBanner = this.f104696x;
        if (halfWaistBanner != null) {
            i = halfWaistBanner.hashCode();
        }
        return hashCode22 + i;
    }

    public final String toString() {
        return "ProductPackStruct(productId=" + this.f104674b + ", status=" + this.f104675c + ", sellerInfo=" + this.f104676d + ", baseInfo=" + this.f104677e + ", saleProps=" + this.f104678f + ", skus=" + this.f104679g + ", shopPolicies=" + this.f104680h + ", logistic=" + this.f104681i + ", additionInfo=" + this.f104682j + ", waistBanner=" + this.f104683k + ", voucherInfo=" + this.f104684l + ", outerVoucher=" + this.f104685m + ", review=" + this.f104686n + ", flashSale=" + this.f104687o + ", thirdPartyData=" + this.f104688p + ", addToCartButton=" + this.f104689q + ", cartEntry=" + this.f104690r + ", activityInfo=" + this.f104691s + ", promotionLogos=" + this.f104692t + ", popUp=" + this.f104693u + ", chainKey=" + this.f104694v + ", promotionView=" + this.f104695w + ", halfWaistBanner=" + this.f104696x + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104674b);
        Integer num = this.f104675c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        SellerInfo sellerInfo = this.f104676d;
        if (sellerInfo != null) {
            parcel.writeInt(1);
            sellerInfo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ProductBase productBase = this.f104677e;
        if (productBase != null) {
            parcel.writeInt(1);
            productBase.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<SaleProp> list = this.f104678f;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SaleProp saleProp : list) {
                saleProp.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<SkuItem> list2 = this.f104679g;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (SkuItem skuItem : list2) {
                skuItem.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<ShopPolicy> list3 = this.f104680h;
        if (list3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (ShopPolicy shopPolicy : list3) {
                shopPolicy.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        LogisticDTO logisticDTO = this.f104681i;
        if (logisticDTO != null) {
            parcel.writeInt(1);
            logisticDTO.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<AdditionInfo> list4 = this.f104682j;
        if (list4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (AdditionInfo additionInfo : list4) {
                additionInfo.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        WaistBanner waistBanner = this.f104683k;
        if (waistBanner != null) {
            parcel.writeInt(1);
            waistBanner.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        VoucherInfo voucherInfo = this.f104684l;
        if (voucherInfo != null) {
            parcel.writeInt(1);
            voucherInfo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Voucher voucher = this.f104685m;
        if (voucher != null) {
            parcel.writeInt(1);
            voucher.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ProductDetailReview productDetailReview = this.f104686n;
        if (productDetailReview != null) {
            parcel.writeInt(1);
            productDetailReview.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        FlashSale flashSale = this.f104687o;
        if (flashSale != null) {
            parcel.writeInt(1);
            flashSale.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ThirdParty thirdParty = this.f104688p;
        if (thirdParty != null) {
            parcel.writeInt(1);
            thirdParty.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        AddToCartButton addToCartButton = this.f104689q;
        if (addToCartButton != null) {
            parcel.writeInt(1);
            addToCartButton.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        CartEntry cartEntry = this.f104690r;
        if (cartEntry != null) {
            parcel.writeInt(1);
            cartEntry.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        PickTag pickTag = this.f104691s;
        if (pickTag != null) {
            parcel.writeInt(1);
            pickTag.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<PromotionLogo> list5 = this.f104692t;
        if (list5 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            for (PromotionLogo promotionLogo : list5) {
                promotionLogo.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        PopUp popUp = this.f104693u;
        if (popUp != null) {
            parcel.writeInt(1);
            popUp.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104694v);
        parcel.writeParcelable(this.f104695w, i);
        HalfWaistBanner halfWaistBanner = this.f104696x;
        if (halfWaistBanner != null) {
            parcel.writeInt(1);
            halfWaistBanner.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct$a */
    public static final class C44880a {
        static {
            Covode.recordClassIndex(53278);
        }

        private C44880a() {
        }

        public /* synthetic */ C44880a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct$b */
    public static class C44881b implements Parcelable.Creator<ProductPackStruct> {
        static {
            Covode.recordClassIndex(53279);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductPackStruct[] newArray(int i) {
            return new ProductPackStruct[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductPackStruct createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            SellerInfo createFromParcel = parcel.readInt() != 0 ? SellerInfo.CREATOR.createFromParcel(parcel) : null;
            ProductBase createFromParcel2 = parcel.readInt() != 0 ? ProductBase.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(SaleProp.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(SkuItem.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (readInt3 != 0) {
                    arrayList3.add(ShopPolicy.CREATOR.createFromParcel(parcel));
                    readInt3--;
                }
            } else {
                arrayList3 = null;
            }
            LogisticDTO createFromParcel3 = parcel.readInt() != 0 ? LogisticDTO.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (readInt4 != 0) {
                    arrayList4.add(AdditionInfo.CREATOR.createFromParcel(parcel));
                    readInt4--;
                }
            } else {
                arrayList4 = null;
            }
            WaistBanner createFromParcel4 = parcel.readInt() != 0 ? WaistBanner.CREATOR.createFromParcel(parcel) : null;
            VoucherInfo createFromParcel5 = parcel.readInt() != 0 ? VoucherInfo.CREATOR.createFromParcel(parcel) : null;
            Voucher createFromParcel6 = parcel.readInt() != 0 ? Voucher.CREATOR.createFromParcel(parcel) : null;
            ProductDetailReview createFromParcel7 = parcel.readInt() != 0 ? ProductDetailReview.CREATOR.createFromParcel(parcel) : null;
            FlashSale createFromParcel8 = parcel.readInt() != 0 ? FlashSale.CREATOR.createFromParcel(parcel) : null;
            ThirdParty createFromParcel9 = parcel.readInt() != 0 ? ThirdParty.CREATOR.createFromParcel(parcel) : null;
            AddToCartButton createFromParcel10 = parcel.readInt() != 0 ? AddToCartButton.CREATOR.createFromParcel(parcel) : null;
            CartEntry createFromParcel11 = parcel.readInt() != 0 ? CartEntry.CREATOR.createFromParcel(parcel) : null;
            PickTag createFromParcel12 = parcel.readInt() != 0 ? PickTag.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (readInt5 != 0) {
                    arrayList5.add(PromotionLogo.CREATOR.createFromParcel(parcel));
                    readInt5--;
                }
            } else {
                arrayList5 = null;
            }
            return new ProductPackStruct(readString, valueOf, createFromParcel, createFromParcel2, arrayList, arrayList2, arrayList3, createFromParcel3, arrayList4, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, createFromParcel12, arrayList5, parcel.readInt() != 0 ? PopUp.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (PromotionView) parcel.readParcelable(ProductPackStruct.class.getClassLoader()), parcel.readInt() != 0 ? HalfWaistBanner.CREATOR.createFromParcel(parcel) : null);
        }
    }

    static {
        Covode.recordClassIndex(53277);
    }

    public ProductPackStruct(String str, Integer num, SellerInfo sellerInfo, ProductBase productBase, List<SaleProp> list, List<SkuItem> list2, List<ShopPolicy> list3, LogisticDTO logisticDTO, List<AdditionInfo> list4, WaistBanner waistBanner, VoucherInfo voucherInfo, Voucher voucher, ProductDetailReview productDetailReview, FlashSale flashSale, ThirdParty thirdParty, AddToCartButton addToCartButton, CartEntry cartEntry, PickTag pickTag, List<PromotionLogo> list5, PopUp popUp, String str2, PromotionView promotionView, HalfWaistBanner halfWaistBanner) {
        this.f104674b = str;
        this.f104675c = num;
        this.f104676d = sellerInfo;
        this.f104677e = productBase;
        this.f104678f = list;
        this.f104679g = list2;
        this.f104680h = list3;
        this.f104681i = logisticDTO;
        this.f104682j = list4;
        this.f104683k = waistBanner;
        this.f104684l = voucherInfo;
        this.f104685m = voucher;
        this.f104686n = productDetailReview;
        this.f104687o = flashSale;
        this.f104688p = thirdParty;
        this.f104689q = addToCartButton;
        this.f104690r = cartEntry;
        this.f104691s = pickTag;
        this.f104692t = list5;
        this.f104693u = popUp;
        this.f104694v = str2;
        this.f104695w = promotionView;
        this.f104696x = halfWaistBanner;
    }
}
