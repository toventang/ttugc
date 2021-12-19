package com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo */
public final class VoucherInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VoucherInfo> CREATOR = new C44335a();
    @AbstractC27891c(mo46611a = "best_voucher_type_ids")
    private final List<String> bestVoucherTypeIds;
    @AbstractC27891c(mo46611a = "lowest_price")
    private final Price lowestPrice;
    @AbstractC27891c(mo46611a = "vouchers")
    private List<Voucher> vouchers;

    static {
        Covode.recordClassIndex(52659);
    }

    public VoucherInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoucherInfo copy$default(VoucherInfo voucherInfo, Price price, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            price = voucherInfo.lowestPrice;
        }
        if ((i & 2) != 0) {
            list = voucherInfo.vouchers;
        }
        if ((i & 4) != 0) {
            list2 = voucherInfo.bestVoucherTypeIds;
        }
        return voucherInfo.copy(price, list, list2);
    }

    public final Price component1() {
        return this.lowestPrice;
    }

    public final List<Voucher> component2() {
        return this.vouchers;
    }

    public final List<String> component3() {
        return this.bestVoucherTypeIds;
    }

    public final VoucherInfo copy(Price price, List<Voucher> list, List<String> list2) {
        return new VoucherInfo(price, list, list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherInfo)) {
            return false;
        }
        VoucherInfo voucherInfo = (VoucherInfo) obj;
        return C89219l.m154714a(this.lowestPrice, voucherInfo.lowestPrice) && C89219l.m154714a(this.vouchers, voucherInfo.vouchers) && C89219l.m154714a(this.bestVoucherTypeIds, voucherInfo.bestVoucherTypeIds);
    }

    public final int hashCode() {
        Price price = this.lowestPrice;
        int i = 0;
        int hashCode = (price != null ? price.hashCode() : 0) * 31;
        List<Voucher> list = this.vouchers;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.bestVoucherTypeIds;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "VoucherInfo(lowestPrice=" + this.lowestPrice + ", vouchers=" + this.vouchers + ", bestVoucherTypeIds=" + this.bestVoucherTypeIds + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Price price = this.lowestPrice;
        if (price != null) {
            parcel.writeInt(1);
            price.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Voucher> list = this.vouchers;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Voucher voucher : list) {
                voucher.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeStringList(this.bestVoucherTypeIds);
    }

    public final List<String> getBestVoucherTypeIds() {
        return this.bestVoucherTypeIds;
    }

    public final Price getLowestPrice() {
        return this.lowestPrice;
    }

    public final List<Voucher> getVouchers() {
        return this.vouchers;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo$a */
    public static class C44335a implements Parcelable.Creator<VoucherInfo> {
        static {
            Covode.recordClassIndex(52660);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VoucherInfo[] newArray(int i) {
            return new VoucherInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VoucherInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            ArrayList arrayList = null;
            Price createFromParcel = parcel.readInt() != 0 ? Price.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Voucher.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new VoucherInfo(createFromParcel, arrayList, parcel.createStringArrayList());
        }
    }

    public final void setVouchers(List<Voucher> list) {
        this.vouchers = list;
    }

    public VoucherInfo(Price price, List<Voucher> list, List<String> list2) {
        this.lowestPrice = price;
        this.vouchers = list;
        this.bestVoucherTypeIds = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VoucherInfo(Price price, List list, List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : price, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
