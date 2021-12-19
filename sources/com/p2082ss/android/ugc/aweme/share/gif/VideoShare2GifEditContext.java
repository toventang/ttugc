package com.p2082ss.android.ugc.aweme.share.gif;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext */
public class VideoShare2GifEditContext implements Parcelable {
    public static final Parcelable.Creator<VideoShare2GifEditContext> CREATOR = new Parcelable.Creator<VideoShare2GifEditContext>() {
        /* class com.p2082ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext.C689311 */

        static {
            Covode.recordClassIndex(81241);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoShare2GifEditContext[] newArray(int i) {
            return new VideoShare2GifEditContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoShare2GifEditContext createFromParcel(Parcel parcel) {
            return new VideoShare2GifEditContext(parcel);
        }
    };

    /* renamed from: a */
    public String f154192a;

    /* renamed from: b */
    public String f154193b;

    /* renamed from: c */
    public boolean f154194c;

    /* renamed from: d */
    public int f154195d;

    /* renamed from: e */
    public String f154196e;

    /* renamed from: f */
    public String f154197f;

    /* renamed from: g */
    public int f154198g;

    /* renamed from: h */
    public int f154199h;

    /* renamed from: i */
    public int f154200i;

    /* renamed from: j */
    public int f154201j;

    /* renamed from: k */
    public float f154202k;

    /* renamed from: l */
    public float f154203l;

    /* renamed from: m */
    public long f154204m;

    /* renamed from: n */
    public long f154205n;

    /* renamed from: o */
    public int f154206o;

    /* renamed from: p */
    public String f154207p;

    /* renamed from: q */
    public String f154208q;

    /* renamed from: r */
    public String f154209r;

    public int describeContents() {
        return 0;
    }

    public VideoShare2GifEditContext() {
    }

    static {
        Covode.recordClassIndex(81240);
    }

    protected VideoShare2GifEditContext(Parcel parcel) {
        boolean z;
        this.f154192a = parcel.readString();
        this.f154193b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f154194c = z;
        this.f154196e = parcel.readString();
        this.f154198g = parcel.readInt();
        this.f154199h = parcel.readInt();
        this.f154200i = parcel.readInt();
        this.f154201j = parcel.readInt();
        this.f154202k = parcel.readFloat();
        this.f154203l = parcel.readFloat();
        this.f154207p = parcel.readString();
        this.f154208q = parcel.readString();
        this.f154209r = parcel.readString();
        this.f154204m = parcel.readLong();
        this.f154205n = parcel.readLong();
        this.f154206o = parcel.readInt();
        this.f154195d = parcel.readInt();
        this.f154197f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f154192a);
        parcel.writeString(this.f154193b);
        parcel.writeByte(this.f154194c ? (byte) 1 : 0);
        parcel.writeString(this.f154196e);
        parcel.writeInt(this.f154198g);
        parcel.writeInt(this.f154199h);
        parcel.writeInt(this.f154200i);
        parcel.writeInt(this.f154201j);
        parcel.writeFloat(this.f154202k);
        parcel.writeFloat(this.f154203l);
        parcel.writeString(this.f154207p);
        parcel.writeString(this.f154208q);
        parcel.writeString(this.f154209r);
        parcel.writeLong(this.f154204m);
        parcel.writeLong(this.f154205n);
        parcel.writeInt(this.f154206o);
        parcel.writeInt(this.f154195d);
        parcel.writeString(this.f154197f);
    }
}
