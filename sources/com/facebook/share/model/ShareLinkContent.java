package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, C24977a> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new Parcelable.Creator<ShareLinkContent>() {
        /* class com.facebook.share.model.ShareLinkContent.C249761 */

        static {
            Covode.recordClassIndex(30286);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f59251a;

    /* renamed from: b */
    public final String f59252b;

    /* renamed from: c */
    public final Uri f59253c;

    /* renamed from: d */
    public final String f59254d;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    public static final class C24977a extends ShareContent.AbstractC24973a<ShareLinkContent, C24977a> {

        /* renamed from: g */
        static final String f59255g = C24977a.class.getSimpleName();

        /* renamed from: h */
        public String f59256h;

        /* renamed from: i */
        public String f59257i;

        /* renamed from: j */
        public Uri f59258j;

        /* renamed from: k */
        public String f59259k;

        static {
            Covode.recordClassIndex(30287);
        }

        /* Return type fixed from 'com.facebook.share.model.ShareContent$a' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.share.model.ShareContent] */
        @Override // com.facebook.share.model.ShareContent.AbstractC24973a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C24977a mo40835a(ShareLinkContent shareLinkContent) {
            ShareLinkContent shareLinkContent2 = shareLinkContent;
            if (shareLinkContent2 == null) {
                return this;
            }
            C24977a aVar = (C24977a) super.mo40835a(shareLinkContent2);
            aVar.f59259k = shareLinkContent2.f59254d;
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(30285);
    }

    private ShareLinkContent(C24977a aVar) {
        super(aVar);
        this.f59251a = aVar.f59256h;
        this.f59252b = aVar.f59257i;
        this.f59253c = aVar.f59258j;
        this.f59254d = aVar.f59259k;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f59251a = parcel.readString();
        this.f59252b = parcel.readString();
        this.f59253c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f59254d = parcel.readString();
    }

    public /* synthetic */ ShareLinkContent(C24977a aVar, byte b) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f59251a);
        parcel.writeString(this.f59252b);
        parcel.writeParcelable(this.f59253c, 0);
        parcel.writeString(this.f59254d);
    }
}
