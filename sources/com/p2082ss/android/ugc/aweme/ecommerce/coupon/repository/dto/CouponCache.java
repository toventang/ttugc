package com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCache */
public final class CouponCache implements Parcelable, Serializable {
    public static final Parcelable.Creator<CouponCache> CREATOR = new C44332a();
    @AbstractC27891c(mo46611a = "claim_status")
    private int claimStatus;
    @AbstractC27891c(mo46611a = "update_millis")
    private long updateMillis;
    @AbstractC27891c(mo46611a = "voucher_id")
    private final String voucherId;
    @AbstractC27891c(mo46611a = "voucher_type_id")
    private final String voucherTypeID;

    static {
        Covode.recordClassIndex(52653);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_CouponCache_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87055x2ec68c2(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_coupon_repository_dto_CouponCache_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87056x2ec68c2(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ CouponCache copy$default(CouponCache couponCache, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = couponCache.voucherId;
        }
        if ((i2 & 2) != 0) {
            str2 = couponCache.voucherTypeID;
        }
        if ((i2 & 4) != 0) {
            i = couponCache.claimStatus;
        }
        if ((i2 & 8) != 0) {
            j = couponCache.updateMillis;
        }
        return couponCache.copy(str, str2, i, j);
    }

    public final String component1() {
        return this.voucherId;
    }

    public final String component2() {
        return this.voucherTypeID;
    }

    public final int component3() {
        return this.claimStatus;
    }

    public final long component4() {
        return this.updateMillis;
    }

    public final CouponCache copy(String str, String str2, int i, long j) {
        C89219l.m154721d(str2, "");
        return new CouponCache(str, str2, i, j);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponCache)) {
            return false;
        }
        CouponCache couponCache = (CouponCache) obj;
        return C89219l.m154714a(this.voucherId, couponCache.voucherId) && C89219l.m154714a(this.voucherTypeID, couponCache.voucherTypeID) && this.claimStatus == couponCache.claimStatus && this.updateMillis == couponCache.updateMillis;
    }

    public final int hashCode() {
        String str = this.voucherId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.voucherTypeID;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + i) * 31) + m87055x2ec68c2(this.claimStatus)) * 31) + m87056x2ec68c2(this.updateMillis);
    }

    public final String toString() {
        return "CouponCache(voucherId=" + this.voucherId + ", voucherTypeID=" + this.voucherTypeID + ", claimStatus=" + this.claimStatus + ", updateMillis=" + this.updateMillis + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.voucherId);
        parcel.writeString(this.voucherTypeID);
        parcel.writeInt(this.claimStatus);
        parcel.writeLong(this.updateMillis);
    }

    public final int getClaimStatus() {
        return this.claimStatus;
    }

    public final long getUpdateMillis() {
        return this.updateMillis;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final String getVoucherTypeID() {
        return this.voucherTypeID;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCache$a */
    public static class C44332a implements Parcelable.Creator<CouponCache> {
        static {
            Covode.recordClassIndex(52654);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CouponCache[] newArray(int i) {
            return new CouponCache[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CouponCache createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new CouponCache(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }
    }

    public final void setClaimStatus(int i) {
        this.claimStatus = i;
    }

    public final void setUpdateMillis(long j) {
        this.updateMillis = j;
    }

    public CouponCache(String str, String str2, int i, long j) {
        C89219l.m154721d(str2, "");
        this.voucherId = str;
        this.voucherTypeID = str2;
        this.claimStatus = i;
        this.updateMillis = j;
    }
}
