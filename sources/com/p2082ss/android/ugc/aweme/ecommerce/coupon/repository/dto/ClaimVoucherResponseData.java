package com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.ClaimVoucherResponseData */
public final class ClaimVoucherResponseData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ClaimVoucherResponseData> CREATOR = new C44331a();
    @AbstractC27891c(mo46611a = "can_retry")
    private final Boolean canRetry;
    @AbstractC27891c(mo46611a = "voucher")
    private final Voucher voucher;

    static {
        Covode.recordClassIndex(52650);
    }

    public static /* synthetic */ ClaimVoucherResponseData copy$default(ClaimVoucherResponseData claimVoucherResponseData, Boolean bool, Voucher voucher2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = claimVoucherResponseData.canRetry;
        }
        if ((i & 2) != 0) {
            voucher2 = claimVoucherResponseData.voucher;
        }
        return claimVoucherResponseData.copy(bool, voucher2);
    }

    public final Boolean component1() {
        return this.canRetry;
    }

    public final Voucher component2() {
        return this.voucher;
    }

    public final ClaimVoucherResponseData copy(Boolean bool, Voucher voucher2) {
        return new ClaimVoucherResponseData(bool, voucher2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimVoucherResponseData)) {
            return false;
        }
        ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) obj;
        return C89219l.m154714a(this.canRetry, claimVoucherResponseData.canRetry) && C89219l.m154714a(this.voucher, claimVoucherResponseData.voucher);
    }

    public final int hashCode() {
        Boolean bool = this.canRetry;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Voucher voucher2 = this.voucher;
        if (voucher2 != null) {
            i = voucher2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ClaimVoucherResponseData(canRetry=" + this.canRetry + ", voucher=" + this.voucher + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Boolean bool = this.canRetry;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Voucher voucher2 = this.voucher;
        if (voucher2 != null) {
            parcel.writeInt(1);
            voucher2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final Boolean getCanRetry() {
        return this.canRetry;
    }

    public final Voucher getVoucher() {
        return this.voucher;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.ClaimVoucherResponseData$a */
    public static class C44331a implements Parcelable.Creator<ClaimVoucherResponseData> {
        static {
            Covode.recordClassIndex(52651);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ClaimVoucherResponseData[] newArray(int i) {
            return new ClaimVoucherResponseData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ClaimVoucherResponseData createFromParcel(Parcel parcel) {
            Boolean bool;
            C89219l.m154721d(parcel, "");
            Voucher voucher = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                voucher = Voucher.CREATOR.createFromParcel(parcel);
            }
            return new ClaimVoucherResponseData(bool, voucher);
        }
    }

    public ClaimVoucherResponseData(Boolean bool, Voucher voucher2) {
        this.canRetry = bool;
        this.voucher = voucher2;
    }
}
