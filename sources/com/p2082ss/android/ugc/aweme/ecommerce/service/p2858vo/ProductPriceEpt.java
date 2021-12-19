package com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.service.vo.ProductPriceEpt */
public final class ProductPriceEpt implements Parcelable {
    public static final Parcelable.Creator<ProductPriceEpt> CREATOR = new C45380a();
    @AbstractC27891c(mo46611a = "original_price")

    /* renamed from: a */
    public final String f105741a;
    @AbstractC27891c(mo46611a = "real_price")

    /* renamed from: b */
    public final String f105742b;
    @AbstractC27891c(mo46611a = "discount")

    /* renamed from: c */
    public final String f105743c;
    @AbstractC27891c(mo46611a = "need_icon")

    /* renamed from: d */
    public final Boolean f105744d;

    static {
        Covode.recordClassIndex(53848);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPriceEpt)) {
            return false;
        }
        ProductPriceEpt productPriceEpt = (ProductPriceEpt) obj;
        return C89219l.m154714a(this.f105741a, productPriceEpt.f105741a) && C89219l.m154714a(this.f105742b, productPriceEpt.f105742b) && C89219l.m154714a(this.f105743c, productPriceEpt.f105743c) && C89219l.m154714a(this.f105744d, productPriceEpt.f105744d);
    }

    public final int hashCode() {
        String str = this.f105741a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105742b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f105743c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f105744d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ProductPriceEpt(originPrice=" + this.f105741a + ", realPrice=" + this.f105742b + ", discount=" + this.f105743c + ", needIcon=" + this.f105744d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f105741a);
        parcel.writeString(this.f105742b);
        parcel.writeString(this.f105743c);
        Boolean bool = this.f105744d;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        parcel.writeInt(i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.service.vo.ProductPriceEpt$a */
    public static class C45380a implements Parcelable.Creator<ProductPriceEpt> {
        static {
            Covode.recordClassIndex(53849);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductPriceEpt[] newArray(int i) {
            return new ProductPriceEpt[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductPriceEpt createFromParcel(Parcel parcel) {
            Boolean bool;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new ProductPriceEpt(readString, readString2, readString3, bool);
        }
    }

    public ProductPriceEpt(String str, String str2, String str3, Boolean bool) {
        this.f105741a = str;
        this.f105742b = str2;
        this.f105743c = str3;
        this.f105744d = bool;
    }
}
