package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class Album implements Parcelable {
    public static final Parcelable.Creator<Album> CREATOR = new Parcelable.Creator<Album>() {
        /* class com.zhihu.matisse.internal.entity.Album.C879521 */

        static {
            Covode.recordClassIndex(103968);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Album[] newArray(int i) {
            return new Album[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Album createFromParcel(Parcel parcel) {
            return new Album(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public static final String f199731a = "-1";

    /* renamed from: b */
    public final String f199732b;

    /* renamed from: c */
    public final Uri f199733c;

    /* renamed from: d */
    public long f199734d;

    /* renamed from: e */
    private final String f199735e;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void mo142467a() {
        this.f199734d++;
    }

    /* renamed from: b */
    public final boolean mo142468b() {
        return f199731a.equals(this.f199732b);
    }

    /* renamed from: c */
    public final boolean mo142469c() {
        if (this.f199734d == 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103967);
    }

    /* renamed from: a */
    public final String mo142466a(Context context) {
        if (mo142468b()) {
            return context.getString(R.string.d10);
        }
        return this.f199735e;
    }

    private Album(Parcel parcel) {
        this.f199732b = parcel.readString();
        this.f199733c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f199735e = parcel.readString();
        this.f199734d = parcel.readLong();
    }

    /* renamed from: a */
    public static Album m152999a(Cursor cursor) {
        return new Album(cursor.getString(cursor.getColumnIndex("bucket_id")), Uri.parse(cursor.getString(cursor.getColumnIndex("uri"))), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex("count")));
    }

    /* synthetic */ Album(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f199732b);
        parcel.writeParcelable(this.f199733c, 0);
        parcel.writeString(this.f199735e);
        parcel.writeLong(this.f199734d);
    }

    private Album(String str, Uri uri, String str2, long j) {
        this.f199732b = str;
        this.f199733c = uri;
        this.f199735e = str2;
        this.f199734d = j;
    }
}
