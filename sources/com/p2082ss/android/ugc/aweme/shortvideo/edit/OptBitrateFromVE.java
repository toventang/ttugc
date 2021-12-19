package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE */
public final class OptBitrateFromVE implements Parcelable, Serializable {
    public static final Parcelable.Creator<OptBitrateFromVE> CREATOR = new C70775a();

    /* renamed from: a */
    private final float f158457a;

    /* renamed from: b */
    private final float f158458b;

    /* renamed from: c */
    private final float f158459c;

    /* renamed from: d */
    private final float f158460d;

    static {
        Covode.recordClassIndex(83254);
    }

    public OptBitrateFromVE() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ OptBitrateFromVE copy$default(OptBitrateFromVE optBitrateFromVE, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = optBitrateFromVE.f158457a;
        }
        if ((i & 2) != 0) {
            f2 = optBitrateFromVE.f158458b;
        }
        if ((i & 4) != 0) {
            f3 = optBitrateFromVE.f158459c;
        }
        if ((i & 8) != 0) {
            f4 = optBitrateFromVE.f158460d;
        }
        return optBitrateFromVE.copy(f, f2, f3, f4);
    }

    public final float component1() {
        return this.f158457a;
    }

    public final float component2() {
        return this.f158458b;
    }

    public final float component3() {
        return this.f158459c;
    }

    public final float component4() {
        return this.f158460d;
    }

    public final OptBitrateFromVE copy(float f, float f2, float f3, float f4) {
        return new OptBitrateFromVE(f, f2, f3, f4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptBitrateFromVE)) {
            return false;
        }
        OptBitrateFromVE optBitrateFromVE = (OptBitrateFromVE) obj;
        return Float.compare(this.f158457a, optBitrateFromVE.f158457a) == 0 && Float.compare(this.f158458b, optBitrateFromVE.f158458b) == 0 && Float.compare(this.f158459c, optBitrateFromVE.f158459c) == 0 && Float.compare(this.f158460d, optBitrateFromVE.f158460d) == 0;
    }

    public final int hashCode() {
        return (((((m124991xf9157037(this.f158457a) * 31) + m124991xf9157037(this.f158458b)) * 31) + m124991xf9157037(this.f158459c)) * 31) + m124991xf9157037(this.f158460d);
    }

    public final String toString() {
        return "OptBitrateFromVE(minOptBitrate=" + this.f158457a + ", optBitrate=" + this.f158458b + ", minOptBitrateHD=" + this.f158459c + ", optBitrateHD=" + this.f158460d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeFloat(this.f158457a);
        parcel.writeFloat(this.f158458b);
        parcel.writeFloat(this.f158459c);
        parcel.writeFloat(this.f158460d);
    }

    public final float getMinOptBitrate() {
        return this.f158457a;
    }

    public final float getMinOptBitrateHD() {
        return this.f158459c;
    }

    public final float getOptBitrate() {
        return this.f158458b;
    }

    public final float getOptBitrateHD() {
        return this.f158460d;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE$a */
    public static class C70775a implements Parcelable.Creator<OptBitrateFromVE> {
        static {
            Covode.recordClassIndex(83255);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OptBitrateFromVE[] newArray(int i) {
            return new OptBitrateFromVE[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OptBitrateFromVE createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new OptBitrateFromVE(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_OptBitrateFromVE_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m124991xf9157037(float f) {
        return Float.floatToIntBits(f);
    }

    public OptBitrateFromVE(float f, float f2, float f3, float f4) {
        this.f158457a = f;
        this.f158458b = f2;
        this.f158459c = f3;
        this.f158460d = f4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OptBitrateFromVE(float f, float f2, float f3, float f4, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}
