package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.AdditionalInfoItem */
public final class AdditionalInfoItem implements Parcelable {
    public static final Parcelable.Creator<AdditionalInfoItem> CREATOR = new C44870a();
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public final String f104631a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public final String f104632b;

    static {
        Covode.recordClassIndex(53258);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalInfoItem)) {
            return false;
        }
        AdditionalInfoItem additionalInfoItem = (AdditionalInfoItem) obj;
        return C89219l.m154714a(this.f104631a, additionalInfoItem.f104631a) && C89219l.m154714a(this.f104632b, additionalInfoItem.f104632b);
    }

    public final int hashCode() {
        String str = this.f104631a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104632b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AdditionalInfoItem(key=" + this.f104631a + ", values=" + this.f104632b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104631a);
        parcel.writeString(this.f104632b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.AdditionalInfoItem$a */
    public static class C44870a implements Parcelable.Creator<AdditionalInfoItem> {
        static {
            Covode.recordClassIndex(53259);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AdditionalInfoItem[] newArray(int i) {
            return new AdditionalInfoItem[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AdditionalInfoItem createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new AdditionalInfoItem(parcel.readString(), parcel.readString());
        }
    }

    public AdditionalInfoItem(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f104631a = str;
        this.f104632b = str2;
    }
}
