package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Video;
import com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo.ProductBaseEpt;
import com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo.ProductPriceEpt;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase */
public final class ProductBase implements Parcelable {
    public static final Parcelable.Creator<ProductBase> CREATOR = new C44877a();
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: a */
    public final String f104657a;
    @AbstractC27891c(mo46611a = "desc_detail")

    /* renamed from: b */
    public final String f104658b;
    @AbstractC27891c(mo46611a = "desc_video")

    /* renamed from: c */
    public final Video f104659c;
    @AbstractC27891c(mo46611a = "images")

    /* renamed from: d */
    public final List<Image> f104660d;
    @AbstractC27891c(mo46611a = "specifications")

    /* renamed from: e */
    public final List<Specification> f104661e;
    @AbstractC27891c(mo46611a = "sold_count")

    /* renamed from: f */
    public final String f104662f;
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: g */
    public final ProductPrice f104663g;

    static {
        Covode.recordClassIndex(53271);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBase)) {
            return false;
        }
        ProductBase productBase = (ProductBase) obj;
        return C89219l.m154714a(this.f104657a, productBase.f104657a) && C89219l.m154714a(this.f104658b, productBase.f104658b) && C89219l.m154714a(this.f104659c, productBase.f104659c) && C89219l.m154714a(this.f104660d, productBase.f104660d) && C89219l.m154714a(this.f104661e, productBase.f104661e) && C89219l.m154714a(this.f104662f, productBase.f104662f) && C89219l.m154714a(this.f104663g, productBase.f104663g);
    }

    public final int hashCode() {
        String str = this.f104657a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104658b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Video video = this.f104659c;
        int hashCode3 = (hashCode2 + (video != null ? video.hashCode() : 0)) * 31;
        List<Image> list = this.f104660d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<Specification> list2 = this.f104661e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.f104662f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ProductPrice productPrice = this.f104663g;
        if (productPrice != null) {
            i = productPrice.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "ProductBase(title=" + this.f104657a + ", details=" + this.f104658b + ", video=" + this.f104659c + ", images=" + this.f104660d + ", props=" + this.f104661e + ", sales=" + this.f104662f + ", priceInfo=" + this.f104663g + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104657a);
        parcel.writeString(this.f104658b);
        Video video = this.f104659c;
        if (video != null) {
            parcel.writeInt(1);
            video.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Image> list = this.f104660d;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Image image : list) {
                image.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<Specification> list2 = this.f104661e;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Specification specification : list2) {
                specification.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104662f);
        ProductPrice productPrice = this.f104663g;
        if (productPrice != null) {
            parcel.writeInt(1);
            productPrice.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase$a */
    public static class C44877a implements Parcelable.Creator<ProductBase> {
        static {
            Covode.recordClassIndex(53272);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductBase[] newArray(int i) {
            return new ProductBase[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductBase createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ProductPrice productPrice = null;
            Video createFromParcel = parcel.readInt() != 0 ? Video.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Image.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(Specification.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList2 = null;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                productPrice = ProductPrice.CREATOR.createFromParcel(parcel);
            }
            return new ProductBase(readString, readString2, createFromParcel, arrayList, arrayList2, readString3, productPrice);
        }
    }

    /* renamed from: a */
    public final ProductBaseEpt mo76003a() {
        ProductPriceEpt productPriceEpt;
        String str = this.f104657a;
        String str2 = this.f104658b;
        String str3 = this.f104662f;
        ProductPrice productPrice = this.f104663g;
        if (productPrice != null) {
            productPriceEpt = productPrice.mo76032a();
        } else {
            productPriceEpt = null;
        }
        return new ProductBaseEpt(str, str2, str3, productPriceEpt);
    }

    public ProductBase(String str, String str2, Video video, List<Image> list, List<Specification> list2, String str3, ProductPrice productPrice) {
        this.f104657a = str;
        this.f104658b = str2;
        this.f104659c = video;
        this.f104660d = list;
        this.f104661e = list2;
        this.f104662f = str3;
        this.f104663g = productPrice;
    }
}
