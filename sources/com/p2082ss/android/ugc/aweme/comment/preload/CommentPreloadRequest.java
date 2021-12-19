package com.p2082ss.android.ugc.aweme.comment.preload;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;

/* renamed from: com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest */
public class CommentPreloadRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.p2082ss.android.ugc.aweme.comment.preload.CommentPreloadRequest.C369491 */

        static {
            Covode.recordClassIndex(44293);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CommentPreloadRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CommentPreloadRequest(parcel);
        }
    };

    /* renamed from: a */
    public final String f86994a;

    /* renamed from: b */
    public final long f86995b;

    /* renamed from: c */
    public final int f86996c;

    /* renamed from: d */
    public final String f86997d;

    /* renamed from: e */
    public final int f86998e;

    /* renamed from: f */
    public final Long f86999f;

    /* renamed from: g */
    public final int f87000g;

    /* renamed from: h */
    public final String f87001h;

    /* renamed from: i */
    public final int f87002i;

    /* renamed from: j */
    public final Object f87003j;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(44292);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest$a */
    public static class C36950a {

        /* renamed from: a */
        public String f87004a;

        /* renamed from: b */
        public long f87005b;

        /* renamed from: c */
        public int f87006c;

        /* renamed from: d */
        public String f87007d;

        /* renamed from: e */
        public int f87008e;

        /* renamed from: f */
        public Long f87009f;

        /* renamed from: g */
        public int f87010g;

        /* renamed from: h */
        public String f87011h;

        /* renamed from: i */
        public int f87012i;

        /* renamed from: j */
        public Object f87013j;

        static {
            Covode.recordClassIndex(44294);
        }

        public C36950a(String str) {
            this.f87004a = str;
        }
    }

    private CommentPreloadRequest(C36950a aVar) {
        this.f86994a = aVar.f87004a;
        this.f86995b = aVar.f87005b;
        this.f86996c = aVar.f87006c;
        this.f86997d = aVar.f87007d;
        this.f86998e = aVar.f87008e;
        this.f86999f = aVar.f87009f;
        this.f87000g = aVar.f87010g;
        this.f87001h = aVar.f87011h;
        this.f87002i = aVar.f87012i;
        this.f87003j = aVar.f87013j;
    }

    public CommentPreloadRequest(Parcel parcel) {
        this.f86994a = parcel.readString();
        this.f86995b = parcel.readLong();
        this.f86996c = parcel.readInt();
        this.f86997d = parcel.readString();
        this.f86998e = parcel.readInt();
        this.f86999f = Long.valueOf(parcel.readLong());
        this.f87000g = parcel.readInt();
        this.f87001h = parcel.readString();
        this.f87002i = parcel.readInt();
        this.f87003j = new C27910f().mo46670a(parcel.readString(), Object.class);
    }

    public /* synthetic */ CommentPreloadRequest(C36950a aVar, byte b) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f86994a);
        parcel.writeLong(this.f86995b);
        parcel.writeInt(this.f86996c);
        parcel.writeString(this.f86997d);
        parcel.writeInt(this.f86998e);
        parcel.writeLong(this.f86999f.longValue());
        parcel.writeInt(this.f87000g);
        parcel.writeString(this.f87001h);
        parcel.writeInt(this.f87002i);
        parcel.writeString(new C27910f().mo46674b(this.f87003j));
    }
}
