package com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct */
public final class ReviewFilterStruct implements Parcelable {
    public static final Parcelable.Creator<ReviewFilterStruct> CREATOR = new C45190b();

    /* renamed from: e */
    public static final C45189a f105335e = new C45189a((byte) 0);
    @AbstractC27891c(mo46611a = "filter_id")

    /* renamed from: a */
    public final String f105336a;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: b */
    public final String f105337b;
    @AbstractC27891c(mo46611a = "count_str")

    /* renamed from: c */
    public final String f105338c;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: d */
    public final int f105339d;

    static {
        Covode.recordClassIndex(53625);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFilterStruct)) {
            return false;
        }
        ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) obj;
        return C89219l.m154714a(this.f105336a, reviewFilterStruct.f105336a) && C89219l.m154714a(this.f105337b, reviewFilterStruct.f105337b) && C89219l.m154714a(this.f105338c, reviewFilterStruct.f105338c) && this.f105339d == reviewFilterStruct.f105339d;
    }

    public final int hashCode() {
        String str = this.f105336a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105337b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f105338c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f105339d;
    }

    public final String toString() {
        return "ReviewFilterStruct(filterId=" + this.f105336a + ", name=" + this.f105337b + ", countStr=" + this.f105338c + ", type=" + this.f105339d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f105336a);
        parcel.writeString(this.f105337b);
        parcel.writeString(this.f105338c);
        parcel.writeInt(this.f105339d);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct$a */
    public static final class C45189a {
        static {
            Covode.recordClassIndex(53626);
        }

        private C45189a() {
        }

        public /* synthetic */ C45189a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct$b */
    public static class C45190b implements Parcelable.Creator<ReviewFilterStruct> {
        static {
            Covode.recordClassIndex(53627);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReviewFilterStruct[] newArray(int i) {
            return new ReviewFilterStruct[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReviewFilterStruct createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ReviewFilterStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }
    }

    private /* synthetic */ ReviewFilterStruct() {
        this("", "", "", 0);
    }

    public ReviewFilterStruct(String str, String str2, String str3, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f105336a = str;
        this.f105337b = str2;
        this.f105338c = str3;
        this.f105339d = i;
    }
}
