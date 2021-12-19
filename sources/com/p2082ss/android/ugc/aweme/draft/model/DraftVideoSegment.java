package com.p2082ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftVideoSegment */
public final class DraftVideoSegment implements Parcelable {
    public static final Parcelable.Creator<DraftVideoSegment> CREATOR = new C43218a();
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: a */
    public int f100717a;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: b */
    public int f100718b;
    @AbstractC27891c(mo46611a = "start")

    /* renamed from: c */
    public int f100719c;
    @AbstractC27891c(mo46611a = "end")

    /* renamed from: d */
    public int f100720d;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: e */
    public int f100721e;
    @AbstractC27891c(mo46611a = "speed")

    /* renamed from: f */
    public float f100722f;
    @AbstractC27891c(mo46611a = "roatete")

    /* renamed from: g */
    public int f100723g;
    @AbstractC27891c(mo46611a = "video_path")

    /* renamed from: h */
    public String f100724h;
    @AbstractC27891c(mo46611a = "audio_path")

    /* renamed from: i */
    public String f100725i;
    @AbstractC27891c(mo46611a = "reverse_path")

    /* renamed from: j */
    public String f100726j;
    @AbstractC27891c(mo46611a = "temp_path")

    /* renamed from: k */
    public String f100727k;

    static {
        Covode.recordClassIndex(51417);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftVideoSegment)) {
            return false;
        }
        DraftVideoSegment draftVideoSegment = (DraftVideoSegment) obj;
        return this.f100717a == draftVideoSegment.f100717a && this.f100718b == draftVideoSegment.f100718b && this.f100719c == draftVideoSegment.f100719c && this.f100720d == draftVideoSegment.f100720d && this.f100721e == draftVideoSegment.f100721e && Float.compare(this.f100722f, draftVideoSegment.f100722f) == 0 && this.f100723g == draftVideoSegment.f100723g && C89219l.m154714a(this.f100724h, draftVideoSegment.f100724h) && C89219l.m154714a(this.f100725i, draftVideoSegment.f100725i) && C89219l.m154714a(this.f100726j, draftVideoSegment.f100726j) && C89219l.m154714a(this.f100727k, draftVideoSegment.f100727k);
    }

    public final String toString() {
        return "DraftVideoSegment(width=" + this.f100717a + ", height=" + this.f100718b + ", start=" + this.f100719c + ", end=" + this.f100720d + ", duration=" + this.f100721e + ", speed=" + this.f100722f + ", rotate=" + this.f100723g + ", videoPath=" + this.f100724h + ", audioPath=" + this.f100725i + ", reversePath=" + this.f100726j + ", tempVideoPath=" + this.f100727k + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f100717a);
        parcel.writeInt(this.f100718b);
        parcel.writeInt(this.f100719c);
        parcel.writeInt(this.f100720d);
        parcel.writeInt(this.f100721e);
        parcel.writeFloat(this.f100722f);
        parcel.writeInt(this.f100723g);
        parcel.writeString(this.f100724h);
        parcel.writeString(this.f100725i);
        parcel.writeString(this.f100726j);
        parcel.writeString(this.f100727k);
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.DraftVideoSegment$a */
    public static class C43218a implements Parcelable.Creator<DraftVideoSegment> {
        static {
            Covode.recordClassIndex(51418);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DraftVideoSegment[] newArray(int i) {
            return new DraftVideoSegment[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DraftVideoSegment createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new DraftVideoSegment(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    private /* synthetic */ DraftVideoSegment() {
        this(0, 0, 0, 0, 0, 1.0f, 0, "", null, null, null);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int floatToIntBits = ((((((((((((this.f100717a * 31) + this.f100718b) * 31) + this.f100719c) * 31) + this.f100720d) * 31) + this.f100721e) * 31) + Float.floatToIntBits(this.f100722f)) * 31) + this.f100723g) * 31;
        String str = this.f100724h;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (floatToIntBits + i) * 31;
        String str2 = this.f100725i;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f100726j;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.f100727k;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i7 + i4;
    }

    public DraftVideoSegment(int i, int i2, int i3, int i4, int i5, float f, int i6, String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        this.f100717a = i;
        this.f100718b = i2;
        this.f100719c = i3;
        this.f100720d = i4;
        this.f100721e = i5;
        this.f100722f = f;
        this.f100723g = i6;
        this.f100724h = str;
        this.f100725i = str2;
        this.f100726j = str3;
        this.f100727k = str4;
    }
}
