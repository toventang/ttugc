package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.PhotoSegment */
public final class PhotoSegment implements Parcelable {
    public static final Parcelable.Creator<PhotoSegment> CREATOR = new C71407a();
    private final int height;
    private final String path;
    private final int width;

    static {
        Covode.recordClassIndex(83937);
    }

    public static /* synthetic */ PhotoSegment copy$default(PhotoSegment photoSegment, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = photoSegment.path;
        }
        if ((i3 & 2) != 0) {
            i = photoSegment.width;
        }
        if ((i3 & 4) != 0) {
            i2 = photoSegment.height;
        }
        return photoSegment.copy(str, i, i2);
    }

    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final PhotoSegment copy(String str, int i, int i2) {
        C89219l.m154721d(str, "");
        return new PhotoSegment(str, i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSegment)) {
            return false;
        }
        PhotoSegment photoSegment = (PhotoSegment) obj;
        return C89219l.m154714a(this.path, photoSegment.path) && this.width == photoSegment.width && this.height == photoSegment.height;
    }

    public final int hashCode() {
        String str = this.path;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.width) * 31) + this.height;
    }

    public final String toString() {
        return "PhotoSegment(path=" + this.path + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.PhotoSegment$a */
    public static class C71407a implements Parcelable.Creator<PhotoSegment> {
        static {
            Covode.recordClassIndex(83938);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PhotoSegment[] newArray(int i) {
            return new PhotoSegment[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PhotoSegment createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new PhotoSegment(parcel.readString(), parcel.readInt(), parcel.readInt());
        }
    }

    public PhotoSegment(String str, int i, int i2) {
        C89219l.m154721d(str, "");
        this.path = str;
        this.width = i;
        this.height = i2;
    }
}
