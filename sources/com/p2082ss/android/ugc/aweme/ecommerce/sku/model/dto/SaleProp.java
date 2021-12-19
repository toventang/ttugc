package com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp */
public final class SaleProp implements Parcelable {
    public static final Parcelable.Creator<SaleProp> CREATOR = new C45433a();
    @AbstractC27891c(mo46611a = "prop_id")

    /* renamed from: a */
    public final String f105846a;
    @AbstractC27891c(mo46611a = "prop_name")

    /* renamed from: b */
    public final String f105847b;
    @AbstractC27891c(mo46611a = "has_image")

    /* renamed from: c */
    public final Boolean f105848c;
    @AbstractC27891c(mo46611a = "sale_prop_values")

    /* renamed from: d */
    public final List<SalePropValue> f105849d;

    static {
        Covode.recordClassIndex(53909);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleProp)) {
            return false;
        }
        SaleProp saleProp = (SaleProp) obj;
        return C89219l.m154714a(this.f105846a, saleProp.f105846a) && C89219l.m154714a(this.f105847b, saleProp.f105847b) && C89219l.m154714a(this.f105848c, saleProp.f105848c) && C89219l.m154714a(this.f105849d, saleProp.f105849d);
    }

    public final int hashCode() {
        String str = this.f105846a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105847b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f105848c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<SalePropValue> list = this.f105849d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "SaleProp(propId=" + this.f105846a + ", propName=" + this.f105847b + ", hasImage=" + this.f105848c + ", salePropValueList=" + this.f105849d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f105846a);
        parcel.writeString(this.f105847b);
        Boolean bool = this.f105848c;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        List<SalePropValue> list = this.f105849d;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SalePropValue salePropValue : list) {
                salePropValue.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp$a */
    public static class C45433a implements Parcelable.Creator<SaleProp> {
        static {
            Covode.recordClassIndex(53910);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SaleProp[] newArray(int i) {
            return new SaleProp[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SaleProp createFromParcel(Parcel parcel) {
            Boolean bool;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(SalePropValue.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new SaleProp(readString, readString2, bool, arrayList);
        }
    }

    public SaleProp(String str, String str2, Boolean bool, List<SalePropValue> list) {
        this.f105846a = str;
        this.f105847b = str2;
        this.f105848c = bool;
        this.f105849d = list;
    }
}
