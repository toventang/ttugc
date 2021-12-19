package com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher */
public final class SkuVoucher implements Parcelable, Serializable {
    public static final Parcelable.Creator<SkuVoucher> CREATOR = new C45439a();
    @AbstractC27891c(mo46611a = "best_voucher_type_ids")

    /* renamed from: a */
    private final List<String> f105872a;

    static {
        Covode.recordClassIndex(53921);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkuVoucher copy$default(SkuVoucher skuVoucher, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skuVoucher.f105872a;
        }
        return skuVoucher.copy(list);
    }

    public final List<String> component1() {
        return this.f105872a;
    }

    public final SkuVoucher copy(List<String> list) {
        return new SkuVoucher(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SkuVoucher) && C89219l.m154714a(this.f105872a, ((SkuVoucher) obj).f105872a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f105872a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SkuVoucher(bestVoucherTypeIds=" + this.f105872a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeStringList(this.f105872a);
    }

    public final List<String> getBestVoucherTypeIds() {
        return this.f105872a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher$a */
    public static class C45439a implements Parcelable.Creator<SkuVoucher> {
        static {
            Covode.recordClassIndex(53922);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuVoucher[] newArray(int i) {
            return new SkuVoucher[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuVoucher createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SkuVoucher(parcel.createStringArrayList());
        }
    }

    public SkuVoucher(List<String> list) {
        this.f105872a = list;
    }
}
