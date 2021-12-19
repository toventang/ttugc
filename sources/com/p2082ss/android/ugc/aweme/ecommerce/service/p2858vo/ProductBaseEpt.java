package com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt */
public final class ProductBaseEpt implements Parcelable {
    public static final Parcelable.Creator<ProductBaseEpt> CREATOR = new C45379a();
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public final String f105737a;
    @AbstractC27891c(mo46611a = "desc_detail")

    /* renamed from: b */
    public final String f105738b;
    @AbstractC27891c(mo46611a = "sold_count")

    /* renamed from: c */
    public final String f105739c;
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: d */
    public final ProductPriceEpt f105740d;

    static {
        Covode.recordClassIndex(53846);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBaseEpt)) {
            return false;
        }
        ProductBaseEpt productBaseEpt = (ProductBaseEpt) obj;
        return C89219l.m154714a(this.f105737a, productBaseEpt.f105737a) && C89219l.m154714a(this.f105738b, productBaseEpt.f105738b) && C89219l.m154714a(this.f105739c, productBaseEpt.f105739c) && C89219l.m154714a(this.f105740d, productBaseEpt.f105740d);
    }

    public final int hashCode() {
        String str = this.f105737a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105738b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f105739c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ProductPriceEpt productPriceEpt = this.f105740d;
        if (productPriceEpt != null) {
            i = productPriceEpt.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ProductBaseEpt(title=" + this.f105737a + ", details=" + this.f105738b + ", sales=" + this.f105739c + ", priceInfo=" + this.f105740d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f105737a);
        parcel.writeString(this.f105738b);
        parcel.writeString(this.f105739c);
        ProductPriceEpt productPriceEpt = this.f105740d;
        if (productPriceEpt != null) {
            parcel.writeInt(1);
            productPriceEpt.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt$a */
    public static class C45379a implements Parcelable.Creator<ProductBaseEpt> {
        static {
            Covode.recordClassIndex(53847);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductBaseEpt[] newArray(int i) {
            return new ProductBaseEpt[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductBaseEpt createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ProductBaseEpt(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ProductPriceEpt.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public ProductBaseEpt(String str, String str2, String str3, ProductPriceEpt productPriceEpt) {
        this.f105737a = str;
        this.f105738b = str2;
        this.f105739c = str3;
        this.f105740d = productPriceEpt;
    }
}
