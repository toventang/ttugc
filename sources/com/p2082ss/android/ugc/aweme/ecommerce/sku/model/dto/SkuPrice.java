package com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice */
public final class SkuPrice implements Parcelable, Serializable {
    public static final Parcelable.Creator<SkuPrice> CREATOR = new C45437a();
    @AbstractC27891c(mo46611a = "real_price")

    /* renamed from: a */
    private final Price f105867a;
    @AbstractC27891c(mo46611a = "original_price")

    /* renamed from: b */
    private final String f105868b;
    @AbstractC27891c(mo46611a = "discount")

    /* renamed from: c */
    private final String f105869c;

    static {
        Covode.recordClassIndex(53917);
    }

    public SkuPrice() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SkuPrice copy$default(SkuPrice skuPrice, Price price, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            price = skuPrice.f105867a;
        }
        if ((i & 2) != 0) {
            str = skuPrice.f105868b;
        }
        if ((i & 4) != 0) {
            str2 = skuPrice.f105869c;
        }
        return skuPrice.copy(price, str, str2);
    }

    public final Price component1() {
        return this.f105867a;
    }

    public final String component2() {
        return this.f105868b;
    }

    public final String component3() {
        return this.f105869c;
    }

    public final SkuPrice copy(Price price, String str, String str2) {
        return new SkuPrice(price, str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuPrice)) {
            return false;
        }
        SkuPrice skuPrice = (SkuPrice) obj;
        return C89219l.m154714a(this.f105867a, skuPrice.f105867a) && C89219l.m154714a(this.f105868b, skuPrice.f105868b) && C89219l.m154714a(this.f105869c, skuPrice.f105869c);
    }

    public final int hashCode() {
        Price price = this.f105867a;
        int i = 0;
        int hashCode = (price != null ? price.hashCode() : 0) * 31;
        String str = this.f105868b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f105869c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SkuPrice(realPrice=" + this.f105867a + ", originalPrice=" + this.f105868b + ", discount=" + this.f105869c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Price price = this.f105867a;
        if (price != null) {
            parcel.writeInt(1);
            price.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f105868b);
        parcel.writeString(this.f105869c);
    }

    public final String getDiscount() {
        return this.f105869c;
    }

    public final String getOriginalPrice() {
        return this.f105868b;
    }

    public final Price getRealPrice() {
        return this.f105867a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice$a */
    public static class C45437a implements Parcelable.Creator<SkuPrice> {
        static {
            Covode.recordClassIndex(53918);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuPrice[] newArray(int i) {
            return new SkuPrice[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuPrice createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SkuPrice(parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }
    }

    public final SkuPrice merge(SkuPrice skuPrice) {
        if (skuPrice == null) {
            return this;
        }
        String str = skuPrice.f105868b;
        if (str == null) {
            str = this.f105868b;
        }
        Price price = skuPrice.f105867a;
        if (price == null) {
            price = this.f105867a;
        }
        String str2 = skuPrice.f105869c;
        if (str2 == null) {
            str2 = this.f105869c;
        }
        return new SkuPrice(price, str, str2);
    }

    public SkuPrice(Price price, String str, String str2) {
        this.f105867a = price;
        this.f105868b = str;
        this.f105869c = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SkuPrice(Price price, String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : price, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
