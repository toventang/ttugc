package com.zhihu.matisse.internal.entity;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.EnumC87938b;

public class Item implements Parcelable {
    public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {
        /* class com.zhihu.matisse.internal.entity.Item.C879531 */

        static {
            Covode.recordClassIndex(103970);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Item[] newArray(int i) {
            return new Item[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Item createFromParcel(Parcel parcel) {
            return new Item(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public final long f199736a;

    /* renamed from: b */
    public final String f199737b;

    /* renamed from: c */
    public final Uri f199738c;

    /* renamed from: d */
    public final long f199739d;

    /* renamed from: e */
    public final long f199740e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103969);
    }

    /* renamed from: b */
    public final boolean mo142475b() {
        String str = this.f199737b;
        if (str == null) {
            return false;
        }
        return str.equals(EnumC87938b.GIF.toString());
    }

    public int hashCode() {
        int hashCode = Long.valueOf(this.f199736a).hashCode() + 31;
        String str = this.f199737b;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        return (((((hashCode * 31) + this.f199738c.hashCode()) * 31) + Long.valueOf(this.f199739d).hashCode()) * 31) + Long.valueOf(this.f199740e).hashCode();
    }

    /* renamed from: a */
    public final boolean mo142474a() {
        String str = this.f199737b;
        if (str == null) {
            return false;
        }
        if (str.equals(EnumC87938b.JPEG.toString()) || this.f199737b.equals(EnumC87938b.PNG.toString()) || this.f199737b.equals(EnumC87938b.GIF.toString()) || this.f199737b.equals(EnumC87938b.BMP.toString()) || this.f199737b.equals(EnumC87938b.WEBP.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo142476c() {
        String str = this.f199737b;
        if (str == null) {
            return false;
        }
        if (str.equals(EnumC87938b.MPEG.toString()) || this.f199737b.equals(EnumC87938b.MP4.toString()) || this.f199737b.equals(EnumC87938b.QUICKTIME.toString()) || this.f199737b.equals(EnumC87938b.THREEGPP.toString()) || this.f199737b.equals(EnumC87938b.THREEGPP2.toString()) || this.f199737b.equals(EnumC87938b.MKV.toString()) || this.f199737b.equals(EnumC87938b.WEBM.toString()) || this.f199737b.equals(EnumC87938b.TS.toString()) || this.f199737b.equals(EnumC87938b.AVI.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Item m153004a(Cursor cursor) {
        return new Item(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("mime_type")), cursor.getLong(cursor.getColumnIndex("_size")), cursor.getLong(cursor.getColumnIndex("duration")));
    }

    private Item(Parcel parcel) {
        this.f199736a = parcel.readLong();
        this.f199737b = parcel.readString();
        this.f199738c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f199739d = parcel.readLong();
        this.f199740e = parcel.readLong();
    }

    public boolean equals(Object obj) {
        String str;
        Uri uri;
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        if (this.f199736a != item.f199736a || ((((str = this.f199737b) == null || !str.equals(item.f199737b)) && (this.f199737b != null || item.f199737b != null)) || ((((uri = this.f199738c) == null || !uri.equals(item.f199738c)) && (this.f199738c != null || item.f199738c != null)) || this.f199739d != item.f199739d || this.f199740e != item.f199740e))) {
            return false;
        }
        return true;
    }

    /* synthetic */ Item(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f199736a);
        parcel.writeString(this.f199737b);
        parcel.writeParcelable(this.f199738c, 0);
        parcel.writeLong(this.f199739d);
        parcel.writeLong(this.f199740e);
    }

    private Item(long j, String str, long j2, long j3) {
        Uri contentUri;
        this.f199736a = j;
        this.f199737b = str;
        if (mo142474a()) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (mo142476c()) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        this.f199738c = ContentUris.withAppendedId(contentUri, j);
        this.f199739d = j2;
        this.f199740e = j3;
    }
}
