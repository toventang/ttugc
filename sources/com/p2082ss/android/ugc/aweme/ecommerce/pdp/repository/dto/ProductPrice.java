package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo.ProductPriceEpt;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice */
public final class ProductPrice implements Parcelable {
    public static final Parcelable.Creator<ProductPrice> CREATOR = new C44882a();
    @AbstractC27891c(mo46611a = "original_price")

    /* renamed from: a */
    public final String f104697a;
    @AbstractC27891c(mo46611a = "real_price")

    /* renamed from: b */
    public final String f104698b;
    @AbstractC27891c(mo46611a = "discount")

    /* renamed from: c */
    public final String f104699c;
    @AbstractC27891c(mo46611a = "need_icon")

    /* renamed from: d */
    public final Boolean f104700d;
    @AbstractC27891c(mo46611a = "is_interval_price")

    /* renamed from: e */
    public final Boolean f104701e;

    static {
        Covode.recordClassIndex(53280);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPrice)) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) obj;
        return C89219l.m154714a(this.f104697a, productPrice.f104697a) && C89219l.m154714a(this.f104698b, productPrice.f104698b) && C89219l.m154714a(this.f104699c, productPrice.f104699c) && C89219l.m154714a(this.f104700d, productPrice.f104700d) && C89219l.m154714a(this.f104701e, productPrice.f104701e);
    }

    public final int hashCode() {
        String str = this.f104697a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104698b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104699c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f104700d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f104701e;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "ProductPrice(originPrice=" + this.f104697a + ", realPrice=" + this.f104698b + ", discount=" + this.f104699c + ", needIcon=" + this.f104700d + ", isIntervalPrice=" + this.f104701e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104697a);
        parcel.writeString(this.f104698b);
        parcel.writeString(this.f104699c);
        Boolean bool = this.f104700d;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.f104701e;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice$a */
    public static class C44882a implements Parcelable.Creator<ProductPrice> {
        static {
            Covode.recordClassIndex(53281);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductPrice[] newArray(int i) {
            return new ProductPrice[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductPrice createFromParcel(Parcel parcel) {
            Boolean bool;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            Boolean bool2 = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            return new ProductPrice(readString, readString2, readString3, bool, bool2);
        }
    }

    /* renamed from: a */
    public final ProductPriceEpt mo76032a() {
        return new ProductPriceEpt(this.f104697a, this.f104698b, this.f104699c, this.f104700d);
    }

    public ProductPrice(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.f104697a = str;
        this.f104698b = str2;
        this.f104699c = str3;
        this.f104700d = bool;
        this.f104701e = bool2;
    }
}
