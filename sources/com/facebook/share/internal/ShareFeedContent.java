package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;

public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new Parcelable.Creator<ShareFeedContent>() {
        /* class com.facebook.share.internal.ShareFeedContent.C249341 */

        static {
            Covode.recordClassIndex(30238);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f59195a;

    /* renamed from: b */
    public final String f59196b;

    /* renamed from: c */
    public final String f59197c;

    /* renamed from: d */
    public final String f59198d;

    /* renamed from: e */
    public final String f59199e;

    /* renamed from: f */
    public final String f59200f;

    /* renamed from: g */
    public final String f59201g;

    @Override // com.facebook.share.model.ShareContent
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30237);
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f59195a = parcel.readString();
        this.f59196b = parcel.readString();
        this.f59197c = parcel.readString();
        this.f59198d = parcel.readString();
        this.f59199e = parcel.readString();
        this.f59200f = parcel.readString();
        this.f59201g = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f59195a);
        parcel.writeString(this.f59196b);
        parcel.writeString(this.f59197c);
        parcel.writeString(this.f59198d);
        parcel.writeString(this.f59199e);
        parcel.writeString(this.f59200f);
        parcel.writeString(this.f59201g);
    }
}
