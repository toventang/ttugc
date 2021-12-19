package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new Parcelable.Creator<ShareMessengerURLActionButton>() {
        /* class com.facebook.share.model.ShareMessengerURLActionButton.C249871 */

        static {
            Covode.recordClassIndex(30305);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }
    };

    /* renamed from: b */
    public final Uri f59281b;

    /* renamed from: c */
    public final Uri f59282c;

    /* renamed from: d */
    public final boolean f59283d;

    /* renamed from: e */
    public final boolean f59284e;

    /* renamed from: f */
    public final EnumC24988a f59285f;

    static {
        Covode.recordClassIndex(30304);
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    public enum EnumC24988a {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact;

        static {
            Covode.recordClassIndex(30306);
        }
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f59281b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f59283d = z;
        this.f59282c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f59285f = (EnumC24988a) parcel.readSerializable();
        this.f59284e = parcel.readByte() == 0 ? false : z2;
    }
}
