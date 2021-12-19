package com.p2082ss.android.ugc.asve.recorder;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.ASMediaSegment */
public final class ASMediaSegment implements Parcelable {
    public static final C31102a CREATOR = new C31102a((byte) 0);

    /* renamed from: a */
    public final long f74531a;

    /* renamed from: b */
    public final double f74532b;

    static {
        Covode.recordClassIndex(37741);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ASMediaSegment)) {
            return false;
        }
        ASMediaSegment aSMediaSegment = (ASMediaSegment) obj;
        return this.f74531a == aSMediaSegment.f74531a && Double.compare(this.f74532b, aSMediaSegment.f74532b) == 0;
    }

    public final int hashCode() {
        long j = this.f74531a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.f74532b);
        return i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "ASMediaSegment(duration=" + this.f74531a + ", speed=" + this.f74532b + ")";
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.ASMediaSegment$a */
    public static final class C31102a implements Parcelable.Creator<ASMediaSegment> {
        static {
            Covode.recordClassIndex(37742);
        }

        private C31102a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ASMediaSegment[] newArray(int i) {
            return new ASMediaSegment[i];
        }

        public /* synthetic */ C31102a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ASMediaSegment createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ASMediaSegment(parcel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ASMediaSegment(Parcel parcel) {
        this(parcel.readLong(), parcel.readDouble());
        C89219l.m154721d(parcel, "");
    }

    public ASMediaSegment(long j, double d) {
        this.f74531a = j;
        this.f74532b = d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeLong(this.f74531a);
        parcel.writeDouble(this.f74532b);
    }
}
