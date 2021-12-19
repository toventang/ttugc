package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new Parcelable.Creator<ShareMessengerMediaTemplateContent>() {
        /* class com.facebook.share.model.ShareMessengerMediaTemplateContent.C249841 */

        static {
            Covode.recordClassIndex(30300);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }
    };

    /* renamed from: a */
    public final EnumC24985a f59274a;

    /* renamed from: b */
    public final String f59275b;

    /* renamed from: c */
    public final Uri f59276c;

    /* renamed from: d */
    public final ShareMessengerActionButton f59277d;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30299);
    }

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$a */
    public enum EnumC24985a {
        IMAGE,
        VIDEO;

        static {
            Covode.recordClassIndex(30301);
        }
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f59274a = (EnumC24985a) parcel.readSerializable();
        this.f59275b = parcel.readString();
        this.f59276c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f59277d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f59274a);
        parcel.writeString(this.f59275b);
        parcel.writeParcelable(this.f59276c, i);
        parcel.writeParcelable(this.f59277d, i);
    }
}
