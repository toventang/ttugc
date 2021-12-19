package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemData */
public final class InputItemData implements Parcelable {
    public static final Parcelable.Creator<InputItemData> CREATOR = new C43361a();
    @AbstractC27891c(mo46611a = "input_items")

    /* renamed from: a */
    public final List<InputItemDTO> f101206a;
    @AbstractC27891c(mo46611a = "district")

    /* renamed from: b */
    public final Region f101207b;

    static {
        Covode.recordClassIndex(51584);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItemData)) {
            return false;
        }
        InputItemData inputItemData = (InputItemData) obj;
        return C89219l.m154714a(this.f101206a, inputItemData.f101206a) && C89219l.m154714a(this.f101207b, inputItemData.f101207b);
    }

    public final int hashCode() {
        List<InputItemDTO> list = this.f101206a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Region region = this.f101207b;
        if (region != null) {
            i = region.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InputItemData(inputItems=" + this.f101206a + ", regionInfo=" + this.f101207b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<InputItemDTO> list = this.f101206a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (InputItemDTO inputItemDTO : list) {
                inputItemDTO.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Region region = this.f101207b;
        if (region != null) {
            parcel.writeInt(1);
            region.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemData$a */
    public static class C43361a implements Parcelable.Creator<InputItemData> {
        static {
            Covode.recordClassIndex(51585);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InputItemData[] newArray(int i) {
            return new InputItemData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InputItemData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            Region region = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(InputItemDTO.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                region = Region.CREATOR.createFromParcel(parcel);
            }
            return new InputItemData(arrayList, region);
        }
    }

    public InputItemData(List<InputItemDTO> list, Region region) {
        this.f101206a = list;
        this.f101207b = region;
    }
}
