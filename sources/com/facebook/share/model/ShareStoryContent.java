package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new Parcelable.Creator<ShareStoryContent>() {
        /* class com.facebook.share.model.ShareStoryContent.C249981 */

        static {
            Covode.recordClassIndex(30324);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareStoryContent createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }
    };

    /* renamed from: a */
    public final ShareMedia f59301a;

    /* renamed from: b */
    public final SharePhoto f59302b;

    /* renamed from: c */
    public final List<String> f59303c;

    /* renamed from: d */
    public final String f59304d;

    @Override // com.facebook.share.model.ShareContent
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30323);
    }

    ShareStoryContent(Parcel parcel) {
        super(parcel);
        List<String> unmodifiableList;
        this.f59301a = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f59302b = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f59303c = unmodifiableList;
        this.f59304d = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f59301a, 0);
        parcel.writeParcelable(this.f59302b, 0);
        parcel.writeStringList(this.f59303c);
        parcel.writeString(this.f59304d);
    }
}
