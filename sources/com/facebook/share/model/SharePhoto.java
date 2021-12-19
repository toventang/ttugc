package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareMedia;

public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new Parcelable.Creator<SharePhoto>() {
        /* class com.facebook.share.model.SharePhoto.C249941 */

        static {
            Covode.recordClassIndex(30318);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }
    };

    /* renamed from: b */
    public final Bitmap f59291b;

    /* renamed from: c */
    public final Uri f59292c;

    /* renamed from: d */
    public final boolean f59293d;

    /* renamed from: e */
    public final String f59294e;

    @Override // com.facebook.share.model.ShareMedia
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia
    /* renamed from: a */
    public final ShareMedia.EnumC24979b mo40842a() {
        return ShareMedia.EnumC24979b.PHOTO;
    }

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static final class C24995a extends ShareMedia.AbstractC24978a<SharePhoto, C24995a> {

        /* renamed from: b */
        public Bitmap f59295b;

        /* renamed from: c */
        public Uri f59296c;

        /* renamed from: d */
        public boolean f59297d;

        /* renamed from: e */
        public String f59298e;

        static {
            Covode.recordClassIndex(30319);
        }

        /* renamed from: a */
        public final SharePhoto mo40878a() {
            return new SharePhoto(this, (byte) 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C24995a mo40876a(Parcel parcel) {
            return mo40845a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: a */
        public final C24995a mo40845a(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            C24995a aVar = (C24995a) super.mo40845a((ShareMedia) sharePhoto);
            aVar.f59295b = sharePhoto.f59291b;
            aVar.f59296c = sharePhoto.f59292c;
            aVar.f59297d = sharePhoto.f59293d;
            aVar.f59298e = sharePhoto.f59294e;
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(30317);
    }

    private SharePhoto(C24995a aVar) {
        super(aVar);
        this.f59291b = aVar.f59295b;
        this.f59292c = aVar.f59296c;
        this.f59293d = aVar.f59297d;
        this.f59294e = aVar.f59298e;
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f59291b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f59292c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f59293d = z;
        this.f59294e = parcel.readString();
    }

    /* synthetic */ SharePhoto(C24995a aVar, byte b) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f59291b, 0);
        parcel.writeParcelable(this.f59292c, 0);
        parcel.writeByte(this.f59293d ? (byte) 1 : 0);
        parcel.writeString(this.f59294e);
    }
}
