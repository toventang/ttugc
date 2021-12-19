package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.WaistBanner */
public final class WaistBanner implements Parcelable {
    public static final Parcelable.Creator<WaistBanner> CREATOR = new C44888a();
    @AbstractC27891c(mo46611a = "activity_name")

    /* renamed from: a */
    public final String f104722a;
    @AbstractC27891c(mo46611a = "backgroud")

    /* renamed from: b */
    public final Image f104723b;
    @AbstractC27891c(mo46611a = "promotion_name")

    /* renamed from: c */
    public final String f104724c;

    static {
        Covode.recordClassIndex(53292);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaistBanner)) {
            return false;
        }
        WaistBanner waistBanner = (WaistBanner) obj;
        return C89219l.m154714a(this.f104722a, waistBanner.f104722a) && C89219l.m154714a(this.f104723b, waistBanner.f104723b) && C89219l.m154714a(this.f104724c, waistBanner.f104724c);
    }

    public final int hashCode() {
        String str = this.f104722a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Image image = this.f104723b;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 31;
        String str2 = this.f104724c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "WaistBanner(activityName=" + this.f104722a + ", background=" + this.f104723b + ", promotionName=" + this.f104724c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104722a);
        Image image = this.f104723b;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104724c);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.WaistBanner$a */
    public static class C44888a implements Parcelable.Creator<WaistBanner> {
        static {
            Covode.recordClassIndex(53293);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WaistBanner[] newArray(int i) {
            return new WaistBanner[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WaistBanner createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new WaistBanner(parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }
    }

    private /* synthetic */ WaistBanner() {
        this("", null, null);
    }

    public WaistBanner(String str, Image image, String str2) {
        C89219l.m154721d(str, "");
        this.f104722a = str;
        this.f104723b = image;
        this.f104724c = str2;
    }
}
