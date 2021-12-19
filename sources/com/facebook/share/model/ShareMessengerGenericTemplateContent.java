package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new Parcelable.Creator<ShareMessengerGenericTemplateContent>() {
        /* class com.facebook.share.model.ShareMessengerGenericTemplateContent.C249811 */

        static {
            Covode.recordClassIndex(30295);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerGenericTemplateContent[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }
    };

    /* renamed from: a */
    public final boolean f59265a;

    /* renamed from: b */
    public final EnumC24982a f59266b;

    /* renamed from: c */
    public final ShareMessengerGenericTemplateElement f59267c;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30294);
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$a */
    public enum EnumC24982a {
        HORIZONTAL,
        SQUARE;

        static {
            Covode.recordClassIndex(30296);
        }
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f59265a = z;
        this.f59266b = (EnumC24982a) parcel.readSerializable();
        this.f59267c = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f59265a ? (byte) 1 : 0);
        parcel.writeSerializable(this.f59266b);
        parcel.writeParcelable(this.f59267c, i);
    }
}
