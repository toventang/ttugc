package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview */
public final class ProductDetailReview implements Parcelable {
    public static final Parcelable.Creator<ProductDetailReview> CREATOR = new C44878a();
    @AbstractC27891c(mo46611a = "product_rating")

    /* renamed from: a */
    public final Float f104664a;
    @AbstractC27891c(mo46611a = "review_count")

    /* renamed from: b */
    public final Integer f104665b;
    @AbstractC27891c(mo46611a = "review_items")

    /* renamed from: c */
    public final List<ReviewItemStruct> f104666c;

    static {
        Covode.recordClassIndex(53273);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailReview)) {
            return false;
        }
        ProductDetailReview productDetailReview = (ProductDetailReview) obj;
        return C89219l.m154714a(this.f104664a, productDetailReview.f104664a) && C89219l.m154714a(this.f104665b, productDetailReview.f104665b) && C89219l.m154714a(this.f104666c, productDetailReview.f104666c);
    }

    public final int hashCode() {
        Float f = this.f104664a;
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        Integer num = this.f104665b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        List<ReviewItemStruct> list = this.f104666c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ProductDetailReview(rating=" + this.f104664a + ", reviewCount=" + this.f104665b + ", reviewItems=" + this.f104666c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Float f = this.f104664a;
        if (f != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.f104665b;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<ReviewItemStruct> list = this.f104666c;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ReviewItemStruct reviewItemStruct : list) {
                reviewItemStruct.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview$a */
    public static class C44878a implements Parcelable.Creator<ProductDetailReview> {
        static {
            Covode.recordClassIndex(53274);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductDetailReview[] newArray(int i) {
            return new ProductDetailReview[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductDetailReview createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            ArrayList arrayList = null;
            Float valueOf = parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(ReviewItemStruct.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new ProductDetailReview(valueOf, valueOf2, arrayList);
        }
    }

    public ProductDetailReview(Float f, Integer num, List<ReviewItemStruct> list) {
        this.f104664a = f;
        this.f104665b = num;
        this.f104666c = list;
    }
}
