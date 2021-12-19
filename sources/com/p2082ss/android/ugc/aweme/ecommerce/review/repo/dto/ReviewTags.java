package com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewTags */
public final class ReviewTags implements Parcelable {
    public static final Parcelable.Creator<ReviewTags> CREATOR = new C45195a();
    @AbstractC27891c(mo46611a = "tag_text")

    /* renamed from: a */
    public final String f105365a;
    @AbstractC27891c(mo46611a = "tag_type")

    /* renamed from: b */
    public final int f105366b;

    static {
        Covode.recordClassIndex(53636);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewTags)) {
            return false;
        }
        ReviewTags reviewTags = (ReviewTags) obj;
        return C89219l.m154714a(this.f105365a, reviewTags.f105365a) && this.f105366b == reviewTags.f105366b;
    }

    public final int hashCode() {
        String str = this.f105365a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f105366b;
    }

    public final String toString() {
        return "ReviewTags(text=" + this.f105365a + ", type=" + this.f105366b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f105365a);
        parcel.writeInt(this.f105366b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewTags$a */
    public static class C45195a implements Parcelable.Creator<ReviewTags> {
        static {
            Covode.recordClassIndex(53637);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReviewTags[] newArray(int i) {
            return new ReviewTags[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReviewTags createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ReviewTags(parcel.readString(), parcel.readInt());
        }
    }

    private /* synthetic */ ReviewTags() {
        this("", 0);
    }

    public ReviewTags(String str, int i) {
        C89219l.m154721d(str, "");
        this.f105365a = str;
        this.f105366b = i;
    }
}
