package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, C25002a> {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new Parcelable.Creator<ShareVideoContent>() {
        /* class com.facebook.share.model.ShareVideoContent.C250011 */

        static {
            Covode.recordClassIndex(30329);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f59307a;

    /* renamed from: b */
    public final String f59308b;

    /* renamed from: c */
    public final SharePhoto f59309c;

    /* renamed from: d */
    public final ShareVideo f59310d;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30328);
    }

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    public static final class C25002a extends ShareContent.AbstractC24973a<ShareVideoContent, C25002a> {

        /* renamed from: g */
        public String f59311g;

        /* renamed from: h */
        public String f59312h;

        /* renamed from: i */
        public SharePhoto f59313i;

        /* renamed from: j */
        public ShareVideo f59314j;

        static {
            Covode.recordClassIndex(30330);
        }

        /* renamed from: a */
        public final C25002a mo40894a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.f59314j = new ShareVideo.C25000a().mo40845a(shareVideo).mo40891a();
            return this;
        }

        /* Return type fixed from 'com.facebook.share.model.ShareContent$a' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.share.model.ShareContent] */
        @Override // com.facebook.share.model.ShareContent.AbstractC24973a
        /* renamed from: a */
        public final /* synthetic */ C25002a mo40835a(ShareVideoContent shareVideoContent) {
            SharePhoto a;
            ShareVideoContent shareVideoContent2 = shareVideoContent;
            if (shareVideoContent2 == null) {
                return this;
            }
            C25002a aVar = (C25002a) super.mo40835a(shareVideoContent2);
            aVar.f59311g = shareVideoContent2.f59307a;
            aVar.f59312h = shareVideoContent2.f59308b;
            SharePhoto sharePhoto = shareVideoContent2.f59309c;
            if (sharePhoto == null) {
                a = null;
            } else {
                a = new SharePhoto.C24995a().mo40845a(sharePhoto).mo40878a();
            }
            aVar.f59313i = a;
            return aVar.mo40894a(shareVideoContent2.f59310d);
        }
    }

    private ShareVideoContent(C25002a aVar) {
        super(aVar);
        this.f59307a = aVar.f59311g;
        this.f59308b = aVar.f59312h;
        this.f59309c = aVar.f59313i;
        this.f59310d = aVar.f59314j;
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f59307a = parcel.readString();
        this.f59308b = parcel.readString();
        SharePhoto.C24995a a = new SharePhoto.C24995a().mo40876a(parcel);
        if (a.f59296c == null && a.f59295b == null) {
            this.f59309c = null;
        } else {
            this.f59309c = a.mo40878a();
        }
        this.f59310d = new ShareVideo.C25000a().mo40889a(parcel).mo40891a();
    }

    public /* synthetic */ ShareVideoContent(C25002a aVar, byte b) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f59307a);
        parcel.writeString(this.f59308b);
        parcel.writeParcelable(this.f59309c, 0);
        parcel.writeParcelable(this.f59310d, 0);
    }
}
