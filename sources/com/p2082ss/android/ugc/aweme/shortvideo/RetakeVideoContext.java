package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.vesdk.VERecordData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext */
public final class RetakeVideoContext implements Parcelable, AbstractC69885bi {
    public static final C69735a CREATOR = new C69735a((byte) 0);

    /* renamed from: a */
    public long f155731a;

    /* renamed from: b */
    public long f155732b;

    /* renamed from: c */
    public int f155733c;

    /* renamed from: d */
    public VERecordData f155734d;

    /* renamed from: e */
    public MultiEditVideoStatusRecordData f155735e;

    /* renamed from: f */
    public String f155736f;

    /* renamed from: g */
    public StitchParams f155737g;

    static {
        Covode.recordClassIndex(82129);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext$a */
    public static final class C69735a implements Parcelable.Creator<RetakeVideoContext> {
        static {
            Covode.recordClassIndex(82130);
        }

        private C69735a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RetakeVideoContext[] newArray(int i) {
            return new RetakeVideoContext[i];
        }

        public /* synthetic */ C69735a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RetakeVideoContext createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new RetakeVideoContext(parcel);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69885bi
    /* renamed from: a */
    public final long mo109992a() {
        return this.f155732b;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC69885bi
    /* renamed from: b */
    public final int mo109994b() {
        return this.f155733c;
    }

    public RetakeVideoContext() {
        String str = C70638dj.f158102e;
        C89219l.m154716b(str, "");
        this.f155736f = str;
    }

    /* renamed from: a */
    public final void mo109993a(String str) {
        C89219l.m154721d(str, "");
        this.f155736f = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RetakeVideoContext(Parcel parcel) {
        this();
        C89219l.m154721d(parcel, "");
        this.f155731a = parcel.readLong();
        this.f155732b = parcel.readLong();
        this.f155733c = parcel.readInt();
        this.f155734d = (VERecordData) parcel.readParcelable(VERecordData.class.getClassLoader());
        String readString = parcel.readString();
        if (readString == null) {
            readString = C70638dj.f158102e;
            C89219l.m154716b(readString, "");
        }
        this.f155736f = readString;
        this.f155735e = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
        this.f155737g = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeLong(this.f155731a);
        parcel.writeLong(this.f155732b);
        parcel.writeInt(this.f155733c);
        parcel.writeParcelable(this.f155734d, i);
        parcel.writeString(this.f155736f);
        parcel.writeParcelable(this.f155735e, i);
        parcel.writeParcelable(this.f155737g, i);
    }
}
