package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.DistrictData */
public final class DistrictData implements Parcelable {
    public static final Parcelable.Creator<DistrictData> CREATOR = new C45654a();
    @AbstractC27891c(mo46611a = "districts")

    /* renamed from: a */
    public final List<District> f106275a;
    @AbstractC27891c(mo46611a = "has_next_level")

    /* renamed from: b */
    public final Boolean f106276b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    public final String f106277c;
    @AbstractC27891c(mo46611a = "title_en")

    /* renamed from: d */
    public final String f106278d;

    static {
        Covode.recordClassIndex(54155);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictData)) {
            return false;
        }
        DistrictData districtData = (DistrictData) obj;
        return C89219l.m154714a(this.f106275a, districtData.f106275a) && C89219l.m154714a(this.f106276b, districtData.f106276b) && C89219l.m154714a(this.f106277c, districtData.f106277c) && C89219l.m154714a(this.f106278d, districtData.f106278d);
    }

    public final int hashCode() {
        List<District> list = this.f106275a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.f106276b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f106277c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f106278d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "DistrictData(districts=" + this.f106275a + ", hasNextLevel=" + this.f106276b + ", title=" + this.f106277c + ", titleEn=" + this.f106278d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<District> list = this.f106275a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (District district : list) {
                district.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f106276b;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f106277c);
        parcel.writeString(this.f106278d);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.DistrictData$a */
    public static class C45654a implements Parcelable.Creator<DistrictData> {
        static {
            Covode.recordClassIndex(54156);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DistrictData[] newArray(int i) {
            return new DistrictData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DistrictData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            Boolean bool = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(District.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DistrictData(arrayList, bool, parcel.readString(), parcel.readString());
        }
    }

    public DistrictData(List<District> list, Boolean bool, String str, String str2) {
        this.f106275a = list;
        this.f106276b = bool;
        this.f106277c = str;
        this.f106278d = str2;
    }
}
