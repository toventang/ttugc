package com.p2082ss.android.ugc.gamora.recorder.localmedia;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument */
public final class LocalMediaArgument implements Parcelable {
    public static final C83871a CREATOR = new C83871a((byte) 0);

    /* renamed from: a */
    public final int f187199a;

    /* renamed from: b */
    public final int f187200b;

    /* renamed from: c */
    public final int f187201c;

    /* renamed from: d */
    public final boolean f187202d;

    /* renamed from: e */
    public final int f187203e;

    /* renamed from: f */
    public final long f187204f;

    /* renamed from: g */
    public final int f187205g;

    /* renamed from: h */
    public final int f187206h;

    /* renamed from: i */
    public final int f187207i;

    /* renamed from: j */
    public final int f187208j;

    static {
        Covode.recordClassIndex(97761);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMediaArgument)) {
            return false;
        }
        LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
        return this.f187199a == localMediaArgument.f187199a && this.f187200b == localMediaArgument.f187200b && this.f187201c == localMediaArgument.f187201c && this.f187202d == localMediaArgument.f187202d && this.f187203e == localMediaArgument.f187203e && this.f187204f == localMediaArgument.f187204f && this.f187205g == localMediaArgument.f187205g && this.f187206h == localMediaArgument.f187206h && this.f187207i == localMediaArgument.f187207i && this.f187208j == localMediaArgument.f187208j;
    }

    public final String toString() {
        return "LocalMediaArgument(chooseRequestCode=" + this.f187199a + ", requestCode=" + this.f187200b + ", supportFlag=" + this.f187201c + ", enableMultiVideo=" + this.f187202d + ", chooseScene=" + this.f187203e + ", minDuration=" + this.f187204f + ", minPhotoCount=" + this.f187205g + ", maxPhotoCount=" + this.f187206h + ", minVideoCount=" + this.f187207i + ", maxVideoCount=" + this.f187208j + ")";
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument$a */
    public static final class C83871a implements Parcelable.Creator<LocalMediaArgument> {
        static {
            Covode.recordClassIndex(97762);
        }

        private C83871a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocalMediaArgument[] newArray(int i) {
            return new LocalMediaArgument[i];
        }

        public /* synthetic */ C83871a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocalMediaArgument createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new LocalMediaArgument(parcel);
        }
    }

    public final int hashCode() {
        int i = ((((this.f187199a * 31) + this.f187200b) * 31) + this.f187201c) * 31;
        boolean z = this.f187202d;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j = this.f187204f;
        return ((((((((((((i + i2) * 31) + this.f187203e) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f187205g) * 31) + this.f187206h) * 31) + this.f187207i) * 31) + this.f187208j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocalMediaArgument(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r13, r0)
            int r1 = r13.readInt()
            int r2 = r13.readInt()
            int r3 = r13.readInt()
            byte r0 = r13.readByte()
            if (r0 == 0) goto L_0x0036
            r0 = 1
            r4 = 1
        L_0x0019:
            int r5 = r13.readInt()
            long r6 = r13.readLong()
            int r8 = r13.readInt()
            int r9 = r13.readInt()
            int r10 = r13.readInt()
            int r11 = r13.readInt()
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11)
            return
        L_0x0036:
            r0 = 0
            r4 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f187199a);
        parcel.writeInt(this.f187200b);
        parcel.writeInt(this.f187201c);
        parcel.writeByte(this.f187202d ? (byte) 1 : 0);
        parcel.writeInt(this.f187203e);
        parcel.writeLong(this.f187204f);
        parcel.writeInt(this.f187205g);
        parcel.writeInt(this.f187206h);
        parcel.writeInt(this.f187207i);
        parcel.writeInt(this.f187208j);
    }

    public LocalMediaArgument(int i, int i2, int i3, boolean z, int i4, long j, int i5, int i6, int i7, int i8) {
        this.f187199a = i;
        this.f187200b = i2;
        this.f187201c = i3;
        this.f187202d = z;
        this.f187203e = i4;
        this.f187204f = j;
        this.f187205g = i5;
        this.f187206h = i6;
        this.f187207i = i7;
        this.f187208j = i8;
    }
}
