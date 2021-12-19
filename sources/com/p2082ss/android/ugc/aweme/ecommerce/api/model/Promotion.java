package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.Promotion */
public final class Promotion implements Parcelable {
    public static final Parcelable.Creator<Promotion> CREATOR = new C43607a();
    @AbstractC27891c(mo46611a = "promotion_id")
    private final String promotionId;

    static {
        Covode.recordClassIndex(51860);
    }

    public static /* synthetic */ Promotion copy$default(Promotion promotion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotion.promotionId;
        }
        return promotion.copy(str);
    }

    public final String component1() {
        return this.promotionId;
    }

    public final Promotion copy(String str) {
        return new Promotion(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Promotion) && C89219l.m154714a(this.promotionId, ((Promotion) obj).promotionId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.promotionId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Promotion(promotionId=" + this.promotionId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.promotionId);
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.Promotion$a */
    public static class C43607a implements Parcelable.Creator<Promotion> {
        static {
            Covode.recordClassIndex(51861);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Promotion[] newArray(int i) {
            return new Promotion[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Promotion createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new Promotion(parcel.readString());
        }
    }

    public Promotion(String str) {
        this.promotionId = str;
    }
}
