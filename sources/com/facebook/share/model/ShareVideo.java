package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareMedia;

public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new Parcelable.Creator<ShareVideo>() {
        /* class com.facebook.share.model.ShareVideo.C249991 */

        static {
            Covode.recordClassIndex(30326);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }
    };

    /* renamed from: b */
    public final Uri f59305b;

    @Override // com.facebook.share.model.ShareMedia
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia
    /* renamed from: a */
    public final ShareMedia.EnumC24979b mo40842a() {
        return ShareMedia.EnumC24979b.VIDEO;
    }

    static {
        Covode.recordClassIndex(30325);
    }

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static final class C25000a extends ShareMedia.AbstractC24978a<ShareVideo, C25000a> {

        /* renamed from: b */
        public Uri f59306b;

        static {
            Covode.recordClassIndex(30327);
        }

        /* renamed from: a */
        public final ShareVideo mo40891a() {
            return new ShareVideo(this, (byte) 0);
        }

        /* renamed from: a */
        public final C25000a mo40845a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            C25000a aVar = (C25000a) super.mo40845a((ShareMedia) shareVideo);
            aVar.f59306b = shareVideo.f59305b;
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C25000a mo40889a(Parcel parcel) {
            return mo40845a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }

    private ShareVideo(C25000a aVar) {
        super(aVar);
        this.f59305b = aVar.f59306b;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f59305b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    /* synthetic */ ShareVideo(C25000a aVar, byte b) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareMedia
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f59305b, 0);
    }
}
