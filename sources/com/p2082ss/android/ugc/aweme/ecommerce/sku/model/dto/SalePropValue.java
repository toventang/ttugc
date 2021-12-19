package com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SalePropValue */
public final class SalePropValue implements Parcelable {
    public static final Parcelable.Creator<SalePropValue> CREATOR = new C45434a();
    @AbstractC27891c(mo46611a = "prop_value_id")

    /* renamed from: a */
    public final String f105850a;
    @AbstractC27891c(mo46611a = "prop_value")

    /* renamed from: b */
    public final String f105851b;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: c */
    public final Image f105852c;

    static {
        Covode.recordClassIndex(53911);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SalePropValue)) {
            return false;
        }
        SalePropValue salePropValue = (SalePropValue) obj;
        return C89219l.m154714a(this.f105850a, salePropValue.f105850a) && C89219l.m154714a(this.f105851b, salePropValue.f105851b) && C89219l.m154714a(this.f105852c, salePropValue.f105852c);
    }

    public final int hashCode() {
        String str = this.f105850a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105851b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f105852c;
        if (image != null) {
            i = image.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SalePropValue(propValueId=" + this.f105850a + ", propValue=" + this.f105851b + ", image=" + this.f105852c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f105850a);
        parcel.writeString(this.f105851b);
        Image image = this.f105852c;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SalePropValue$a */
    public static class C45434a implements Parcelable.Creator<SalePropValue> {
        static {
            Covode.recordClassIndex(53912);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SalePropValue[] newArray(int i) {
            return new SalePropValue[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SalePropValue createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SalePropValue(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public SalePropValue(String str, String str2, Image image) {
        this.f105850a = str;
        this.f105851b = str2;
        this.f105852c = image;
    }
}
