package com.p2082ss.android.ugc.aweme.ecommerce.sku.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2861c.C45419a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2861c.C45420b;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState */
public final class SkuPanelState implements Parcelable, Cloneable {
    public static final Parcelable.Creator<SkuPanelState> CREATOR = new C45428a();
    @AbstractC27891c(mo46611a = "cart_entry")
    private CartEntry cartEntry;
    @AbstractC27891c(mo46611a = "checked_sku_ids")
    private String[] checkedSkuIds;
    @AbstractC27891c(mo46611a = "close_from")
    private int closeFrom;
    @AbstractC27891c(mo46611a = "exception_ux")
    private ExceptionUX exceptionUX;
    @AbstractC27891c(mo46611a = "is_single_sku")
    private Boolean isSingleSku;
    @AbstractC27891c(mo46611a = "jump_OSP")
    private boolean jumpOSP;
    @AbstractC27891c(mo46611a = "product_id")
    private final String productId;
    @AbstractC27891c(mo46611a = "quantity")
    private Integer productQuantity;
    @AbstractC27891c(mo46611a = "sku_id")
    private String skuId;
    @AbstractC27891c(mo46611a = "voucher_info")
    private SkuVoucher voucherInfo;
    @AbstractC27891c(mo46611a = "warehouse_id")
    private String warehouseId;

    static {
        Covode.recordClassIndex(53902);
    }

    public static /* synthetic */ SkuPanelState copy$default(SkuPanelState skuPanelState, String str, String str2, String str3, SkuVoucher skuVoucher, String[] strArr, Integer num, boolean z, int i, CartEntry cartEntry2, ExceptionUX exceptionUX2, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = skuPanelState.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = skuPanelState.skuId;
        }
        if ((i2 & 4) != 0) {
            str3 = skuPanelState.warehouseId;
        }
        if ((i2 & 8) != 0) {
            skuVoucher = skuPanelState.voucherInfo;
        }
        if ((i2 & 16) != 0) {
            strArr = skuPanelState.checkedSkuIds;
        }
        if ((i2 & 32) != 0) {
            num = skuPanelState.productQuantity;
        }
        if ((i2 & 64) != 0) {
            z = skuPanelState.jumpOSP;
        }
        if ((i2 & 128) != 0) {
            i = skuPanelState.closeFrom;
        }
        if ((i2 & 256) != 0) {
            cartEntry2 = skuPanelState.cartEntry;
        }
        if ((i2 & 512) != 0) {
            exceptionUX2 = skuPanelState.exceptionUX;
        }
        if ((i2 & 1024) != 0) {
            bool = skuPanelState.isSingleSku;
        }
        return skuPanelState.copy(str, str2, str3, skuVoucher, strArr, num, z, i, cartEntry2, exceptionUX2, bool);
    }

    public final String component1() {
        return this.productId;
    }

    public final ExceptionUX component10() {
        return this.exceptionUX;
    }

    public final Boolean component11() {
        return this.isSingleSku;
    }

    public final String component2() {
        return this.skuId;
    }

    public final String component3() {
        return this.warehouseId;
    }

    public final SkuVoucher component4() {
        return this.voucherInfo;
    }

    public final String[] component5() {
        return this.checkedSkuIds;
    }

    public final Integer component6() {
        return this.productQuantity;
    }

    public final boolean component7() {
        return this.jumpOSP;
    }

    public final int component8() {
        return this.closeFrom;
    }

    public final CartEntry component9() {
        return this.cartEntry;
    }

    public final SkuPanelState copy(String str, String str2, String str3, SkuVoucher skuVoucher, String[] strArr, Integer num, boolean z, int i, CartEntry cartEntry2, ExceptionUX exceptionUX2, Boolean bool) {
        C89219l.m154721d(str, "");
        return new SkuPanelState(str, str2, str3, skuVoucher, strArr, num, z, i, cartEntry2, exceptionUX2, bool);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SkuPanelState(productId=" + this.productId + ", skuId=" + this.skuId + ", warehouseId=" + this.warehouseId + ", voucherInfo=" + this.voucherInfo + ", checkedSkuIds=" + Arrays.toString(this.checkedSkuIds) + ", productQuantity=" + this.productQuantity + ", jumpOSP=" + this.jumpOSP + ", closeFrom=" + this.closeFrom + ", cartEntry=" + this.cartEntry + ", exceptionUX=" + this.exceptionUX + ", isSingleSku=" + this.isSingleSku + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.productId);
        parcel.writeString(this.skuId);
        parcel.writeString(this.warehouseId);
        SkuVoucher skuVoucher = this.voucherInfo;
        if (skuVoucher != null) {
            parcel.writeInt(1);
            skuVoucher.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringArray(this.checkedSkuIds);
        Integer num = this.productQuantity;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.jumpOSP ? 1 : 0);
        parcel.writeInt(this.closeFrom);
        CartEntry cartEntry2 = this.cartEntry;
        if (cartEntry2 != null) {
            parcel.writeInt(1);
            cartEntry2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ExceptionUX exceptionUX2 = this.exceptionUX;
        if (exceptionUX2 != null) {
            parcel.writeInt(1);
            exceptionUX2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.isSingleSku;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final String[] getCheckedSkuIds() {
        return this.checkedSkuIds;
    }

    public final int getCloseFrom() {
        return this.closeFrom;
    }

    public final ExceptionUX getExceptionUX() {
        return this.exceptionUX;
    }

    public final boolean getJumpOSP() {
        return this.jumpOSP;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Integer getProductQuantity() {
        return this.productQuantity;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final SkuVoucher getVoucherInfo() {
        return this.voucherInfo;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public final Boolean isSingleSku() {
        return this.isSingleSku;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState$a */
    public static class C45428a implements Parcelable.Creator<SkuPanelState> {
        static {
            Covode.recordClassIndex(53903);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuPanelState[] newArray(int i) {
            return new SkuPanelState[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuPanelState createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Boolean bool = null;
            SkuVoucher createFromParcel = parcel.readInt() != 0 ? SkuVoucher.CREATOR.createFromParcel(parcel) : null;
            String[] createStringArray = parcel.createStringArray();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            CartEntry createFromParcel2 = parcel.readInt() != 0 ? CartEntry.CREATOR.createFromParcel(parcel) : null;
            ExceptionUX createFromParcel3 = parcel.readInt() != 0 ? ExceptionUX.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            return new SkuPanelState(readString, readString2, readString3, createFromParcel, createStringArray, valueOf, z2, readInt, createFromParcel2, createFromParcel3, bool);
        }
    }

    public final int hashCode() {
        int i;
        String[] strArr = this.checkedSkuIds;
        int i2 = 0;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Integer num = this.productQuantity;
        if (num != null) {
            i2 = num.intValue();
        }
        return ((i3 + i2) * 31) + this.productId.hashCode();
    }

    @Override // java.lang.Object
    public final SkuPanelState clone() {
        String[] strArr;
        String str = this.productId;
        String str2 = this.skuId;
        String str3 = this.warehouseId;
        SkuVoucher skuVoucher = this.voucherInfo;
        String[] strArr2 = this.checkedSkuIds;
        if (strArr2 != null) {
            Object[] copyOf = Arrays.copyOf(strArr2, strArr2.length);
            C89219l.m154716b(copyOf, "");
            strArr = (String[]) copyOf;
        } else {
            strArr = null;
        }
        return new SkuPanelState(str, str2, str3, skuVoucher, strArr, this.productQuantity, this.jumpOSP, 0, null, null, null, 1920, null);
    }

    public final void setCartEntry(CartEntry cartEntry2) {
        this.cartEntry = cartEntry2;
    }

    public final void setCheckedSkuIds(String[] strArr) {
        this.checkedSkuIds = strArr;
    }

    public final void setCloseFrom(int i) {
        this.closeFrom = i;
    }

    public final void setExceptionUX(ExceptionUX exceptionUX2) {
        this.exceptionUX = exceptionUX2;
    }

    public final void setJumpOSP(boolean z) {
        this.jumpOSP = z;
    }

    public final void setProductQuantity(Integer num) {
        this.productQuantity = num;
    }

    public final void setSingleSku(Boolean bool) {
        this.isSingleSku = bool;
    }

    public final void setSkuId(String str) {
        this.skuId = str;
    }

    public final void setVoucherInfo(SkuVoucher skuVoucher) {
        this.voucherInfo = skuVoucher;
    }

    public final void setWarehouseId(String str) {
        this.warehouseId = str;
    }

    public final SkuItem getFullSkuItem(List<SkuItem> list) {
        String[] strArr;
        if (list == null || (strArr = this.checkedSkuIds) == null) {
            return null;
        }
        return C45419a.m87988a(C45420b.m87991a(strArr), list);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState");
        String[] strArr = this.checkedSkuIds;
        if (strArr != null) {
            SkuPanelState skuPanelState = (SkuPanelState) obj;
            if (skuPanelState.checkedSkuIds == null) {
                return false;
            }
            String[] strArr2 = skuPanelState.checkedSkuIds;
            if (strArr2 == null) {
                C89219l.m154715b();
            }
            if (!Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (((SkuPanelState) obj).checkedSkuIds != null) {
            return false;
        }
        SkuPanelState skuPanelState2 = (SkuPanelState) obj;
        if (!(!C89219l.m154714a(this.productQuantity, skuPanelState2.productQuantity)) && !(!C89219l.m154714a((Object) this.productId, (Object) skuPanelState2.productId))) {
            return true;
        }
        return false;
    }

    public SkuPanelState(String str, String str2, String str3, SkuVoucher skuVoucher, String[] strArr, Integer num, boolean z, int i, CartEntry cartEntry2, ExceptionUX exceptionUX2, Boolean bool) {
        C89219l.m154721d(str, "");
        this.productId = str;
        this.skuId = str2;
        this.warehouseId = str3;
        this.voucherInfo = skuVoucher;
        this.checkedSkuIds = strArr;
        this.productQuantity = num;
        this.jumpOSP = z;
        this.closeFrom = i;
        this.cartEntry = cartEntry2;
        this.exceptionUX = exceptionUX2;
        this.isSingleSku = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SkuPanelState(String str, String str2, String str3, SkuVoucher skuVoucher, String[] strArr, Integer num, boolean z, int i, CartEntry cartEntry2, ExceptionUX exceptionUX2, Boolean bool, int i2, C89214g gVar) {
        this(str, str2, str3, skuVoucher, strArr, num, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? null : cartEntry2, (i2 & 512) != 0 ? null : exceptionUX2, (i2 & 1024) == 0 ? bool : null);
    }
}
