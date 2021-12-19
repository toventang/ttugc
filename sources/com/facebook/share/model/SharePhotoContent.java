package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, C24997a> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new Parcelable.Creator<SharePhotoContent>() {
        /* class com.facebook.share.model.SharePhotoContent.C249961 */

        static {
            Covode.recordClassIndex(30321);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }
    };

    /* renamed from: a */
    public final List<SharePhoto> f59299a;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30320);
    }

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    public static class C24997a extends ShareContent.AbstractC24973a<SharePhotoContent, C24997a> {

        /* renamed from: g */
        public final List<SharePhoto> f59300g = new ArrayList();

        static {
            Covode.recordClassIndex(30322);
        }

        /* renamed from: a */
        public final SharePhotoContent mo40884a() {
            return new SharePhotoContent(this, (byte) 0);
        }

        /* renamed from: a */
        public final C24997a mo40835a(SharePhotoContent sharePhotoContent) {
            if (sharePhotoContent == null) {
                return this;
            }
            return ((C24997a) super.mo40835a((ShareContent) sharePhotoContent)).m47915b(sharePhotoContent.f59299a);
        }

        /* renamed from: b */
        private C24997a m47915b(List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto sharePhoto : list) {
                    mo40881a(sharePhoto);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C24997a mo40881a(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f59300g.add(new SharePhoto.C24995a().mo40845a(sharePhoto).mo40878a());
            }
            return this;
        }

        /* renamed from: a */
        public final C24997a mo40883a(List<SharePhoto> list) {
            this.f59300g.clear();
            m47915b(list);
            return this;
        }
    }

    private SharePhotoContent(C24997a aVar) {
        super(aVar);
        this.f59299a = Collections.unmodifiableList(aVar.f59300g);
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList<ShareMedia> arrayList = new ArrayList(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            arrayList.add(parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : arrayList) {
            if (shareMedia instanceof SharePhoto) {
                arrayList2.add(shareMedia);
            }
        }
        this.f59299a = Collections.unmodifiableList(arrayList2);
    }

    /* synthetic */ SharePhotoContent(C24997a aVar, byte b) {
        this(aVar);
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        List<SharePhoto> list = this.f59299a;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            shareMediaArr[i2] = list.get(i2);
        }
        parcel.writeParcelableArray(shareMediaArr, i);
    }
}
