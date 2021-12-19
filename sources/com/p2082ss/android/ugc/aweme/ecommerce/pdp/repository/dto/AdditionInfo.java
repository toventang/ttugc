package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.AdditionInfo */
public final class AdditionInfo implements Parcelable {
    public static final Parcelable.Creator<AdditionInfo> CREATOR = new C44869a();
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final int f104628a;
    @AbstractC27891c(mo46611a = "info_title")

    /* renamed from: b */
    public final String f104629b;
    @AbstractC27891c(mo46611a = "info_items")

    /* renamed from: c */
    public final List<AdditionalInfoItem> f104630c;

    static {
        Covode.recordClassIndex(53256);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionInfo)) {
            return false;
        }
        AdditionInfo additionInfo = (AdditionInfo) obj;
        return this.f104628a == additionInfo.f104628a && C89219l.m154714a(this.f104629b, additionInfo.f104629b) && C89219l.m154714a(this.f104630c, additionInfo.f104630c);
    }

    public final int hashCode() {
        int i = this.f104628a * 31;
        String str = this.f104629b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<AdditionalInfoItem> list = this.f104630c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AdditionInfo(type=" + this.f104628a + ", title=" + this.f104629b + ", items=" + this.f104630c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f104628a);
        parcel.writeString(this.f104629b);
        List<AdditionalInfoItem> list = this.f104630c;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (AdditionalInfoItem additionalInfoItem : list) {
                additionalInfoItem.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.AdditionInfo$a */
    public static class C44869a implements Parcelable.Creator<AdditionInfo> {
        static {
            Covode.recordClassIndex(53257);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AdditionInfo[] newArray(int i) {
            return new AdditionInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AdditionInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add(AdditionalInfoItem.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList = null;
            }
            return new AdditionInfo(readInt, readString, arrayList);
        }
    }

    public AdditionInfo(int i, String str, List<AdditionalInfoItem> list) {
        C89219l.m154721d(str, "");
        this.f104628a = i;
        this.f104629b = str;
        this.f104630c = list;
    }
}
