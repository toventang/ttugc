package com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCacheList */
public final class CouponCacheList implements Parcelable, Serializable {
    public static final Parcelable.Creator<CouponCacheList> CREATOR = new C44333a();
    @AbstractC27891c(mo46611a = "list")
    private final List<CouponCache> list;

    static {
        Covode.recordClassIndex(52655);
    }

    public CouponCacheList() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCacheList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CouponCacheList copy$default(CouponCacheList couponCacheList, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list2 = couponCacheList.list;
        }
        return couponCacheList.copy(list2);
    }

    public final List<CouponCache> component1() {
        return this.list;
    }

    public final CouponCacheList copy(List<CouponCache> list2) {
        C89219l.m154721d(list2, "");
        return new CouponCacheList(list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CouponCacheList) && C89219l.m154714a(this.list, ((CouponCacheList) obj).list);
        }
        return true;
    }

    public final int hashCode() {
        List<CouponCache> list2 = this.list;
        if (list2 != null) {
            return list2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CouponCacheList(list=" + this.list + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<CouponCache> list2 = this.list;
        parcel.writeInt(list2.size());
        for (CouponCache couponCache : list2) {
            couponCache.writeToParcel(parcel, 0);
        }
    }

    public final List<CouponCache> getList() {
        return this.list;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCacheList$a */
    public static class C44333a implements Parcelable.Creator<CouponCacheList> {
        static {
            Covode.recordClassIndex(52656);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CouponCacheList[] newArray(int i) {
            return new CouponCacheList[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CouponCacheList createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(CouponCache.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new CouponCacheList(arrayList);
        }
    }

    public CouponCacheList(List<CouponCache> list2) {
        C89219l.m154721d(list2, "");
        this.list = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CouponCacheList(List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list2);
    }
}
