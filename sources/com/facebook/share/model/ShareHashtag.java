package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new Parcelable.Creator<ShareHashtag>() {
        /* class com.facebook.share.model.ShareHashtag.C249741 */

        static {
            Covode.recordClassIndex(30283);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }
    };

    /* renamed from: a */
    public final String f59249a;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static class C24975a {

        /* renamed from: a */
        public String f59250a;

        static {
            Covode.recordClassIndex(30284);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30282);
    }

    private ShareHashtag(C24975a aVar) {
        this.f59249a = aVar.f59250a;
    }

    ShareHashtag(Parcel parcel) {
        this.f59249a = parcel.readString();
    }

    /* synthetic */ ShareHashtag(C24975a aVar, byte b) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59249a);
    }
}
