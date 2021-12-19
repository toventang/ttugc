package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new Parcelable.Creator<ShareMessengerGenericTemplateElement>() {
        /* class com.facebook.share.model.ShareMessengerGenericTemplateElement.C249831 */

        static {
            Covode.recordClassIndex(30298);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerGenericTemplateElement[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }
    };

    /* renamed from: a */
    public final String f59269a;

    /* renamed from: b */
    public final String f59270b;

    /* renamed from: c */
    public final Uri f59271c;

    /* renamed from: d */
    public final ShareMessengerActionButton f59272d;

    /* renamed from: e */
    public final ShareMessengerActionButton f59273e;

    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30297);
    }

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f59269a = parcel.readString();
        this.f59270b = parcel.readString();
        this.f59271c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f59272d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f59273e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59269a);
        parcel.writeString(this.f59270b);
        parcel.writeParcelable(this.f59271c, i);
        parcel.writeParcelable(this.f59272d, i);
        parcel.writeParcelable(this.f59273e, i);
    }
}
