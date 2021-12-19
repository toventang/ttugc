package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareOpenGraphAction;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new Parcelable.Creator<ShareOpenGraphContent>() {
        /* class com.facebook.share.model.ShareOpenGraphContent.C249911 */

        static {
            Covode.recordClassIndex(30312);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }
    };

    /* renamed from: a */
    public final ShareOpenGraphAction f59287a;

    /* renamed from: b */
    public final String f59288b;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30311);
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f59287a = new ShareOpenGraphAction(new ShareOpenGraphAction.C24990a().mo40864a(parcel), (byte) 0);
        this.f59288b = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f59287a, 0);
        parcel.writeString(this.f59288b);
    }
}
