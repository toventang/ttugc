package com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData */
public final class ListReviewData implements Parcelable {
    public static final Parcelable.Creator<ListReviewData> CREATOR = new C45188a();
    @AbstractC27891c(mo46611a = "review_items")

    /* renamed from: a */
    public final List<ReviewItemStruct> f105330a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public final boolean f105331b;
    @AbstractC27891c(mo46611a = "next_cursor")

    /* renamed from: c */
    public final int f105332c;
    @AbstractC27891c(mo46611a = "review_filters")

    /* renamed from: d */
    public final List<ReviewFilterStruct> f105333d;
    @AbstractC27891c(mo46611a = "no_allow_feedback")

    /* renamed from: e */
    public final Boolean f105334e;

    static {
        Covode.recordClassIndex(53623);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListReviewData)) {
            return false;
        }
        ListReviewData listReviewData = (ListReviewData) obj;
        return C89219l.m154714a(this.f105330a, listReviewData.f105330a) && this.f105331b == listReviewData.f105331b && this.f105332c == listReviewData.f105332c && C89219l.m154714a(this.f105333d, listReviewData.f105333d) && C89219l.m154714a(this.f105334e, listReviewData.f105334e);
    }

    public final int hashCode() {
        List<ReviewItemStruct> list = this.f105330a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f105331b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (((hashCode + i2) * 31) + this.f105332c) * 31;
        List<ReviewFilterStruct> list2 = this.f105333d;
        int hashCode2 = (i5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.f105334e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ListReviewData(reviewItems=" + this.f105330a + ", hasMore=" + this.f105331b + ", nextCursor=" + this.f105332c + ", reviewFilter=" + this.f105333d + ", noAllowFeedback=" + this.f105334e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<ReviewItemStruct> list = this.f105330a;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ReviewItemStruct reviewItemStruct : list) {
                reviewItemStruct.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f105331b ? 1 : 0);
        parcel.writeInt(this.f105332c);
        List<ReviewFilterStruct> list2 = this.f105333d;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (ReviewFilterStruct reviewFilterStruct : list2) {
                reviewFilterStruct.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.f105334e;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData$a */
    public static class C45188a implements Parcelable.Creator<ListReviewData> {
        static {
            Covode.recordClassIndex(53624);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ListReviewData[] newArray(int i) {
            return new ListReviewData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ListReviewData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            C89219l.m154721d(parcel, "");
            Boolean bool = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(ReviewItemStruct.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (readInt3 != 0) {
                    arrayList2.add(ReviewFilterStruct.CREATOR.createFromParcel(parcel));
                    readInt3--;
                }
            } else {
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            return new ListReviewData(arrayList, z2, readInt2, arrayList2, bool);
        }
    }

    private /* synthetic */ ListReviewData() {
        this(null, false, 0, null, false);
    }

    public ListReviewData(List<ReviewItemStruct> list, boolean z, int i, List<ReviewFilterStruct> list2, Boolean bool) {
        this.f105330a = list;
        this.f105331b = z;
        this.f105332c = i;
        this.f105333d = list2;
        this.f105334e = bool;
    }
}
