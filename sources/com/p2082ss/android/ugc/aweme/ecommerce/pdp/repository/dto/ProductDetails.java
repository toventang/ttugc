package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetails */
public final class ProductDetails implements Parcelable {
    public static final Parcelable.Creator<ProductDetails> CREATOR = new C44879a();
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final String f104667a;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: b */
    public final Image f104668b;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: c */
    public final String f104669c;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: d */
    public final List<String> f104670d;

    static {
        Covode.recordClassIndex(53275);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetails)) {
            return false;
        }
        ProductDetails productDetails = (ProductDetails) obj;
        return C89219l.m154714a(this.f104667a, productDetails.f104667a) && C89219l.m154714a(this.f104668b, productDetails.f104668b) && C89219l.m154714a(this.f104669c, productDetails.f104669c) && C89219l.m154714a(this.f104670d, productDetails.f104670d);
    }

    public final int hashCode() {
        String str = this.f104667a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Image image = this.f104668b;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 31;
        String str2 = this.f104669c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f104670d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ProductDetails(type=" + this.f104667a + ", image=" + this.f104668b + ", text=" + this.f104669c + ", content=" + this.f104670d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104667a);
        Image image = this.f104668b;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104669c);
        parcel.writeStringList(this.f104670d);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetails$a */
    public static class C44879a implements Parcelable.Creator<ProductDetails> {
        static {
            Covode.recordClassIndex(53276);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductDetails[] newArray(int i) {
            return new ProductDetails[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductDetails createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ProductDetails(parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArrayList());
        }
    }

    public ProductDetails(String str, Image image, String str2, List<String> list) {
        this.f104667a = str;
        this.f104668b = image;
        this.f104669c = str2;
        this.f104670d = list;
    }
}
