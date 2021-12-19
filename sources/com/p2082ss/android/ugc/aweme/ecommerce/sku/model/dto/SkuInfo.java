package com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuInfo */
public final class SkuInfo implements Parcelable {
    public static final Parcelable.Creator<SkuInfo> CREATOR = new C45435a();
    @AbstractC27891c(mo46611a = "skus")

    /* renamed from: a */
    public final List<SkuItem> f105853a;
    @AbstractC27891c(mo46611a = "sale_props")

    /* renamed from: b */
    public final List<SaleProp> f105854b;

    static {
        Covode.recordClassIndex(53913);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuInfo)) {
            return false;
        }
        SkuInfo skuInfo = (SkuInfo) obj;
        return C89219l.m154714a(this.f105853a, skuInfo.f105853a) && C89219l.m154714a(this.f105854b, skuInfo.f105854b);
    }

    public final int hashCode() {
        List<SkuItem> list = this.f105853a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<SaleProp> list2 = this.f105854b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SkuInfo(skuList=" + this.f105853a + ", salePropList=" + this.f105854b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<SkuItem> list = this.f105853a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SkuItem skuItem : list) {
                skuItem.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<SaleProp> list2 = this.f105854b;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (SaleProp saleProp : list2) {
                saleProp.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuInfo$a */
    public static class C45435a implements Parcelable.Creator<SkuInfo> {
        static {
            Covode.recordClassIndex(53914);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuInfo[] newArray(int i) {
            return new SkuInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(SkuItem.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(SaleProp.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            }
            return new SkuInfo(arrayList, arrayList2);
        }
    }

    public SkuInfo(List<SkuItem> list, List<SaleProp> list2) {
        this.f105853a = list;
        this.f105854b = list2;
    }
}
