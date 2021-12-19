package com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuSaleProp */
public final class SkuSaleProp implements Parcelable {
    public static final Parcelable.Creator<SkuSaleProp> CREATOR = new C45438a();
    @AbstractC27891c(mo46611a = "prop_id")

    /* renamed from: a */
    public final String f105870a;
    @AbstractC27891c(mo46611a = "prop_value_id")

    /* renamed from: b */
    public final String f105871b;

    static {
        Covode.recordClassIndex(53919);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuSaleProp)) {
            return false;
        }
        SkuSaleProp skuSaleProp = (SkuSaleProp) obj;
        return C89219l.m154714a(this.f105870a, skuSaleProp.f105870a) && C89219l.m154714a(this.f105871b, skuSaleProp.f105871b);
    }

    public final int hashCode() {
        String str = this.f105870a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105871b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SkuSaleProp(propId=" + this.f105870a + ", propValueId=" + this.f105871b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f105870a);
        parcel.writeString(this.f105871b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuSaleProp$a */
    public static class C45438a implements Parcelable.Creator<SkuSaleProp> {
        static {
            Covode.recordClassIndex(53920);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuSaleProp[] newArray(int i) {
            return new SkuSaleProp[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuSaleProp createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SkuSaleProp(parcel.readString(), parcel.readString());
        }
    }

    public SkuSaleProp(String str, String str2) {
        this.f105870a = str;
        this.f105871b = str2;
    }
}
