package com.p2082ss.android.ugc.aweme.mediachoose.helper;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.MediaModel */
public class MediaModel implements Parcelable, Cloneable, Comparable<MediaModel> {
    public static final Parcelable.Creator<MediaModel> CREATOR = new Parcelable.Creator<MediaModel>() {
        /* class com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel.C591821 */

        static {
            Covode.recordClassIndex(69541);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MediaModel[] newArray(int i) {
            return new MediaModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MediaModel createFromParcel(Parcel parcel) {
            return new MediaModel(parcel);
        }
    };

    /* renamed from: a */
    public String f134661a;

    /* renamed from: b */
    public String f134662b;

    /* renamed from: c */
    public String f134663c;

    /* renamed from: d */
    public String f134664d;

    /* renamed from: e */
    public String f134665e;

    /* renamed from: f */
    public long f134666f;

    /* renamed from: g */
    public int f134667g;

    /* renamed from: h */
    public long f134668h;

    /* renamed from: i */
    public long f134669i;

    /* renamed from: j */
    public String f134670j;

    /* renamed from: k */
    public String f134671k;

    /* renamed from: l */
    public int f134672l;

    /* renamed from: m */
    public int f134673m;

    /* renamed from: n */
    public long f134674n;

    /* renamed from: o */
    public Uri f134675o;

    /* renamed from: p */
    public String f134676p;

    /* renamed from: q */
    public int f134677q;

    /* renamed from: r */
    public int f134678r;

    /* renamed from: s */
    public float f134679s = 1.0f;

    /* renamed from: t */
    public String f134680t;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final MediaModel mo96673a() {
        return (MediaModel) super.clone();
    }

    @Override // java.lang.Object
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public int hashCode() {
        return this.f134661a.hashCode();
    }

    static {
        Covode.recordClassIndex(69540);
    }

    /* renamed from: b */
    public final boolean mo96674b() {
        if (this.f134667g == 4) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MediaModel{id=" + this.f134661a + ", filePath='" + this.f134662b + '\'' + ", date=" + this.f134666f + ", type=" + this.f134667g + ", duration=" + this.f134668h + ", fileSize=" + this.f134669i + ", mimeType='" + this.f134670j + '\'' + ", thumbnail='" + this.f134671k + '\'' + ", width=" + this.f134672l + ", height=" + this.f134673m + ", modify=" + this.f134674n + ", userName=" + this.f134676p + ", startTime=" + this.f134677q + ", endTime=" + this.f134678r + ", speed=" + this.f134679s + ", extra='" + this.f134680t + '\'' + '}';
    }

    public MediaModel(long j) {
        this.f134661a = String.valueOf(j);
    }

    public MediaModel(String str) {
        this.f134661a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(MediaModel mediaModel) {
        long j = this.f134666f;
        long j2 = mediaModel.f134666f;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaModel)) {
            return false;
        }
        return ((MediaModel) obj).f134661a.equals(this.f134661a);
    }

    protected MediaModel(Parcel parcel) {
        this.f134661a = parcel.readString();
        this.f134662b = parcel.readString();
        this.f134663c = parcel.readString();
        this.f134664d = parcel.readString();
        this.f134665e = parcel.readString();
        this.f134666f = parcel.readLong();
        this.f134667g = parcel.readInt();
        this.f134668h = parcel.readLong();
        this.f134669i = parcel.readLong();
        this.f134670j = parcel.readString();
        this.f134671k = parcel.readString();
        this.f134672l = parcel.readInt();
        this.f134673m = parcel.readInt();
        this.f134676p = parcel.readString();
        this.f134677q = parcel.readInt();
        this.f134678r = parcel.readInt();
        this.f134680t = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134661a);
        parcel.writeString(this.f134662b);
        parcel.writeString(this.f134663c);
        parcel.writeString(this.f134664d);
        parcel.writeString(this.f134665e);
        parcel.writeLong(this.f134666f);
        parcel.writeInt(this.f134667g);
        parcel.writeLong(this.f134668h);
        parcel.writeLong(this.f134669i);
        parcel.writeString(this.f134670j);
        parcel.writeString(this.f134671k);
        parcel.writeInt(this.f134672l);
        parcel.writeInt(this.f134673m);
        parcel.writeString(this.f134676p);
        parcel.writeInt(this.f134677q);
        parcel.writeInt(this.f134678r);
        parcel.writeString(this.f134680t);
    }
}
