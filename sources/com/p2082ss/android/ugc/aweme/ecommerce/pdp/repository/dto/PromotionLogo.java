package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo */
public final class PromotionLogo implements Parcelable {
    public static final Parcelable.Creator<PromotionLogo> CREATOR = new C44883a();
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: a */
    public final Image f104702a;
    @AbstractC27891c(mo46611a = "promotion_id")

    /* renamed from: b */
    public final String f104703b;

    static {
        Covode.recordClassIndex(53282);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionLogo)) {
            return false;
        }
        PromotionLogo promotionLogo = (PromotionLogo) obj;
        return C89219l.m154714a(this.f104702a, promotionLogo.f104702a) && C89219l.m154714a(this.f104703b, promotionLogo.f104703b);
    }

    public final int hashCode() {
        Image image = this.f104702a;
        int i = 0;
        int hashCode = (image != null ? image.hashCode() : 0) * 31;
        String str = this.f104703b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PromotionLogo(image=" + this.f104702a + ", promotionId=" + this.f104703b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Image image = this.f104702a;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104703b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo$a */
    public static class C44883a implements Parcelable.Creator<PromotionLogo> {
        static {
            Covode.recordClassIndex(53283);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PromotionLogo[] newArray(int i) {
            return new PromotionLogo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PromotionLogo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new PromotionLogo(parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }
    }

    public PromotionLogo(Image image, String str) {
        this.f104702a = image;
        this.f104703b = str;
    }
}
