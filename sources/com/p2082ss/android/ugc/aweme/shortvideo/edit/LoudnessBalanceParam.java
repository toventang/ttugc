package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam */
public final class LoudnessBalanceParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<LoudnessBalanceParam> CREATOR = new C70774a();
    @AbstractC27891c(mo46611a = "bgm_loudness")

    /* renamed from: a */
    private double f158453a;
    @AbstractC27891c(mo46611a = "peak_loudness")

    /* renamed from: b */
    private double f158454b;
    @AbstractC27891c(mo46611a = "avg_loudness")

    /* renamed from: c */
    private double f158455c;

    static {
        Covode.recordClassIndex(83251);
    }

    public LoudnessBalanceParam() {
        this(0.0d, 0.0d, 0.0d, 7, null);
    }

    public static /* synthetic */ LoudnessBalanceParam copy$default(LoudnessBalanceParam loudnessBalanceParam, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = loudnessBalanceParam.f158453a;
        }
        if ((i & 2) != 0) {
            d2 = loudnessBalanceParam.f158454b;
        }
        if ((i & 4) != 0) {
            d3 = loudnessBalanceParam.f158455c;
        }
        return loudnessBalanceParam.copy(d, d2, d3);
    }

    public final double component1() {
        return this.f158453a;
    }

    public final double component2() {
        return this.f158454b;
    }

    public final double component3() {
        return this.f158455c;
    }

    public final LoudnessBalanceParam copy(double d, double d2, double d3) {
        return new LoudnessBalanceParam(d, d2, d3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoudnessBalanceParam)) {
            return false;
        }
        LoudnessBalanceParam loudnessBalanceParam = (LoudnessBalanceParam) obj;
        return Double.compare(this.f158453a, loudnessBalanceParam.f158453a) == 0 && Double.compare(this.f158454b, loudnessBalanceParam.f158454b) == 0 && Double.compare(this.f158455c, loudnessBalanceParam.f158455c) == 0;
    }

    public final int hashCode() {
        return (((m124990x540df5de(this.f158453a) * 31) + m124990x540df5de(this.f158454b)) * 31) + m124990x540df5de(this.f158455c);
    }

    public final String toString() {
        return "LoudnessBalanceParam(bgmLoudness=" + this.f158453a + ", peakLoudness=" + this.f158454b + ", avgLoudness=" + this.f158455c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeDouble(this.f158453a);
        parcel.writeDouble(this.f158454b);
        parcel.writeDouble(this.f158455c);
    }

    public final double getAvgLoudness() {
        return this.f158455c;
    }

    public final double getBgmLoudness() {
        return this.f158453a;
    }

    public final double getPeakLoudness() {
        return this.f158454b;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam$a */
    public static class C70774a implements Parcelable.Creator<LoudnessBalanceParam> {
        static {
            Covode.recordClassIndex(83252);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LoudnessBalanceParam[] newArray(int i) {
            return new LoudnessBalanceParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LoudnessBalanceParam createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new LoudnessBalanceParam(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }
    }

    public final void setAvgLoudness(double d) {
        this.f158455c = d;
    }

    public final void setBgmLoudness(double d) {
        this.f158453a = d;
    }

    public final void setPeakLoudness(double d) {
        this.f158454b = d;
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_LoudnessBalanceParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m124990x540df5de(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public LoudnessBalanceParam(double d, double d2, double d3) {
        this.f158453a = d;
        this.f158454b = d2;
        this.f158455c = d3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoudnessBalanceParam(double d, double d2, double d3, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3);
    }
}
