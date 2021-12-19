package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.HalfWaistBanner */
public final class HalfWaistBanner implements Parcelable {
    public static final Parcelable.Creator<HalfWaistBanner> CREATOR = new C44875a();
    @AbstractC27891c(mo46611a = "background_image")

    /* renamed from: a */
    public final GImage f104649a;
    @AbstractC27891c(mo46611a = "left_image")

    /* renamed from: b */
    public final GImage f104650b;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: c */
    public final String f104651c;
    @AbstractC27891c(mo46611a = "text_color")

    /* renamed from: d */
    public final String f104652d;

    static {
        Covode.recordClassIndex(53267);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HalfWaistBanner)) {
            return false;
        }
        HalfWaistBanner halfWaistBanner = (HalfWaistBanner) obj;
        return C89219l.m154714a(this.f104649a, halfWaistBanner.f104649a) && C89219l.m154714a(this.f104650b, halfWaistBanner.f104650b) && C89219l.m154714a(this.f104651c, halfWaistBanner.f104651c) && C89219l.m154714a(this.f104652d, halfWaistBanner.f104652d);
    }

    public final int hashCode() {
        GImage gImage = this.f104649a;
        int i = 0;
        int hashCode = (gImage != null ? gImage.hashCode() : 0) * 31;
        GImage gImage2 = this.f104650b;
        int hashCode2 = (hashCode + (gImage2 != null ? gImage2.hashCode() : 0)) * 31;
        String str = this.f104651c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f104652d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "HalfWaistBanner(backgroundImage=" + this.f104649a + ", leftImage=" + this.f104650b + ", text=" + this.f104651c + ", textColor=" + this.f104652d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeParcelable(this.f104649a, i);
        parcel.writeParcelable(this.f104650b, i);
        parcel.writeString(this.f104651c);
        parcel.writeString(this.f104652d);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.HalfWaistBanner$a */
    public static class C44875a implements Parcelable.Creator<HalfWaistBanner> {
        static {
            Covode.recordClassIndex(53268);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ HalfWaistBanner[] newArray(int i) {
            return new HalfWaistBanner[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HalfWaistBanner createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new HalfWaistBanner((GImage) parcel.readParcelable(HalfWaistBanner.class.getClassLoader()), (GImage) parcel.readParcelable(HalfWaistBanner.class.getClassLoader()), parcel.readString(), parcel.readString());
        }
    }

    public HalfWaistBanner(GImage gImage, GImage gImage2, String str, String str2) {
        this.f104649a = gImage;
        this.f104650b = gImage2;
        this.f104651c = str;
        this.f104652d = str2;
    }
}
