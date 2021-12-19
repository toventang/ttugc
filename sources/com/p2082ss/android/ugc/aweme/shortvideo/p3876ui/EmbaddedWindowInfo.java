package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo */
public final class EmbaddedWindowInfo implements Parcelable {
    public static final C73306a CREATOR = new C73306a((byte) 0);
    @AbstractC27891c(mo46611a = "w")

    /* renamed from: a */
    public int f164624a;
    @AbstractC27891c(mo46611a = "h")

    /* renamed from: b */
    public int f164625b;
    @AbstractC27891c(mo46611a = "x")

    /* renamed from: c */
    public int f164626c;
    @AbstractC27891c(mo46611a = "y")

    /* renamed from: d */
    public int f164627d;
    @AbstractC27891c(mo46611a = "s")

    /* renamed from: e */
    public int f164628e;
    @AbstractC27891c(mo46611a = "e")

    /* renamed from: f */
    public int f164629f;

    static {
        Covode.recordClassIndex(86026);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo$a */
    public static final class C73306a implements Parcelable.Creator<EmbaddedWindowInfo> {
        static {
            Covode.recordClassIndex(86027);
        }

        private C73306a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EmbaddedWindowInfo[] newArray(int i) {
            return new EmbaddedWindowInfo[i];
        }

        public /* synthetic */ C73306a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EmbaddedWindowInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EmbaddedWindowInfo(parcel);
        }
    }

    public EmbaddedWindowInfo() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmbaddedWindowInfo(Parcel parcel) {
        this();
        C89219l.m154721d(parcel, "");
        this.f164624a = parcel.readInt();
        this.f164625b = parcel.readInt();
        this.f164626c = parcel.readInt();
        this.f164627d = parcel.readInt();
        this.f164628e = parcel.readInt();
        this.f164629f = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f164624a);
        parcel.writeInt(this.f164625b);
        parcel.writeInt(this.f164626c);
        parcel.writeInt(this.f164627d);
        parcel.writeInt(this.f164628e);
        parcel.writeInt(this.f164629f);
    }
}
