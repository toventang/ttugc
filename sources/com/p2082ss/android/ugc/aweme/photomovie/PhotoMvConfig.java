package com.p2082ss.android.ugc.aweme.photomovie;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMvConfig */
public final class PhotoMvConfig implements Parcelable {
    public static final Parcelable.Creator<PhotoMvConfig> CREATOR = new C62889a();

    /* renamed from: a */
    public final String f142625a;

    /* renamed from: b */
    public final String f142626b;

    static {
        Covode.recordClassIndex(73723);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoMvConfig)) {
            return false;
        }
        PhotoMvConfig photoMvConfig = (PhotoMvConfig) obj;
        return C89219l.m154714a(this.f142625a, photoMvConfig.f142625a) && C89219l.m154714a(this.f142626b, photoMvConfig.f142626b);
    }

    public final int hashCode() {
        String str = this.f142625a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f142626b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PhotoMvConfig(anchorMvId=" + this.f142625a + ", anchorMvPanel=" + this.f142626b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f142625a);
        parcel.writeString(this.f142626b);
    }

    /* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMvConfig$a */
    public static class C62889a implements Parcelable.Creator<PhotoMvConfig> {
        static {
            Covode.recordClassIndex(73724);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PhotoMvConfig[] newArray(int i) {
            return new PhotoMvConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PhotoMvConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new PhotoMvConfig(parcel.readString(), parcel.readString());
        }
    }

    public PhotoMvConfig(String str, String str2) {
        this.f142625a = str;
        this.f142626b = str2;
    }
}
