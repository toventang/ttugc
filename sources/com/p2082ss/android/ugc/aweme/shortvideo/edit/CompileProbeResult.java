package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult */
public final class CompileProbeResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<CompileProbeResult> CREATOR = new C70773a();

    /* renamed from: a */
    private final ResultStatus f158431a;

    /* renamed from: b */
    private final ResultData f158432b;

    static {
        Covode.recordClassIndex(83243);
    }

    public static /* synthetic */ CompileProbeResult copy$default(CompileProbeResult compileProbeResult, ResultStatus resultStatus, ResultData resultData, int i, Object obj) {
        if ((i & 1) != 0) {
            resultStatus = compileProbeResult.f158431a;
        }
        if ((i & 2) != 0) {
            resultData = compileProbeResult.f158432b;
        }
        return compileProbeResult.copy(resultStatus, resultData);
    }

    public final ResultStatus component1() {
        return this.f158431a;
    }

    public final ResultData component2() {
        return this.f158432b;
    }

    public final CompileProbeResult copy(ResultStatus resultStatus, ResultData resultData) {
        C89219l.m154721d(resultStatus, "");
        return new CompileProbeResult(resultStatus, resultData);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileProbeResult)) {
            return false;
        }
        CompileProbeResult compileProbeResult = (CompileProbeResult) obj;
        return C89219l.m154714a(this.f158431a, compileProbeResult.f158431a) && C89219l.m154714a(this.f158432b, compileProbeResult.f158432b);
    }

    public final int hashCode() {
        ResultStatus resultStatus = this.f158431a;
        int i = 0;
        int hashCode = (resultStatus != null ? resultStatus.hashCode() : 0) * 31;
        ResultData resultData = this.f158432b;
        if (resultData != null) {
            i = resultData.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CompileProbeResult(status=" + this.f158431a + ", data=" + this.f158432b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        this.f158431a.writeToParcel(parcel, 0);
        ResultData resultData = this.f158432b;
        if (resultData != null) {
            parcel.writeInt(1);
            resultData.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData */
    public static final class ResultData implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResultData> CREATOR = new C70770a();

        /* renamed from: a */
        private final int f158433a;

        /* renamed from: b */
        private final float f158434b;

        /* renamed from: c */
        private final int f158435c;

        /* renamed from: d */
        private final int f158436d;

        /* renamed from: e */
        private final int f158437e;

        /* renamed from: f */
        private final int f158438f;

        /* renamed from: g */
        private final int f158439g;

        /* renamed from: h */
        private final float f158440h;

        /* renamed from: i */
        private final int f158441i;

        /* renamed from: j */
        private final int f158442j;

        /* renamed from: k */
        private final double f158443k;

        /* renamed from: l */
        private final int f158444l;

        /* renamed from: m */
        private final float f158445m;

        /* renamed from: n */
        private final OptBitrateFromVE f158446n;

        /* renamed from: o */
        private final int f158447o;

        static {
            Covode.recordClassIndex(83244);
        }

        /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m124988x6733a65d(int i) {
            return i;
        }

        public static /* synthetic */ ResultData copy$default(ResultData resultData, int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE, int i10, int i11, Object obj) {
            int i12 = i2;
            float f4 = f;
            int i13 = i;
            int i14 = i5;
            int i15 = i4;
            int i16 = i3;
            int i17 = i7;
            float f5 = f2;
            int i18 = i6;
            double d2 = d;
            int i19 = i8;
            float f6 = f3;
            int i20 = i9;
            int i21 = i10;
            OptBitrateFromVE optBitrateFromVE2 = optBitrateFromVE;
            if ((i11 & 1) != 0) {
                i13 = resultData.f158433a;
            }
            if ((i11 & 2) != 0) {
                f4 = resultData.f158434b;
            }
            if ((i11 & 4) != 0) {
                i12 = resultData.f158435c;
            }
            if ((i11 & 8) != 0) {
                i16 = resultData.f158436d;
            }
            if ((i11 & 16) != 0) {
                i15 = resultData.f158437e;
            }
            if ((i11 & 32) != 0) {
                i14 = resultData.f158438f;
            }
            if ((i11 & 64) != 0) {
                i18 = resultData.f158439g;
            }
            if ((i11 & 128) != 0) {
                f5 = resultData.f158440h;
            }
            if ((i11 & 256) != 0) {
                i17 = resultData.f158441i;
            }
            if ((i11 & 512) != 0) {
                i19 = resultData.f158442j;
            }
            if ((i11 & 1024) != 0) {
                d2 = resultData.f158443k;
            }
            if ((i11 & 2048) != 0) {
                i20 = resultData.f158444l;
            }
            if ((i11 & 4096) != 0) {
                f6 = resultData.f158445m;
            }
            if ((i11 & 8192) != 0) {
                optBitrateFromVE2 = resultData.f158446n;
            }
            if ((i11 & 16384) != 0) {
                i21 = resultData.f158447o;
            }
            return resultData.copy(i13, f4, i12, i16, i15, i14, i18, f5, i17, i19, d2, i20, f6, optBitrateFromVE2, i21);
        }

        public final int component1() {
            return this.f158433a;
        }

        public final int component10() {
            return this.f158442j;
        }

        public final double component11() {
            return this.f158443k;
        }

        public final int component12() {
            return this.f158444l;
        }

        public final float component13() {
            return this.f158445m;
        }

        public final OptBitrateFromVE component14() {
            return this.f158446n;
        }

        public final int component15() {
            return this.f158447o;
        }

        public final float component2() {
            return this.f158434b;
        }

        public final int component3() {
            return this.f158435c;
        }

        public final int component4() {
            return this.f158436d;
        }

        public final int component5() {
            return this.f158437e;
        }

        public final int component6() {
            return this.f158438f;
        }

        public final int component7() {
            return this.f158439g;
        }

        public final float component8() {
            return this.f158440h;
        }

        public final int component9() {
            return this.f158441i;
        }

        public final ResultData copy(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE, int i10) {
            C89219l.m154721d(optBitrateFromVE, "");
            return new ResultData(i, f, i2, i3, i4, i5, i6, f2, i7, i8, d, i9, f3, optBitrateFromVE, i10);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultData)) {
                return false;
            }
            ResultData resultData = (ResultData) obj;
            return this.f158433a == resultData.f158433a && Float.compare(this.f158434b, resultData.f158434b) == 0 && this.f158435c == resultData.f158435c && this.f158436d == resultData.f158436d && this.f158437e == resultData.f158437e && this.f158438f == resultData.f158438f && this.f158439g == resultData.f158439g && Float.compare(this.f158440h, resultData.f158440h) == 0 && this.f158441i == resultData.f158441i && this.f158442j == resultData.f158442j && Double.compare(this.f158443k, resultData.f158443k) == 0 && this.f158444l == resultData.f158444l && Float.compare(this.f158445m, resultData.f158445m) == 0 && C89219l.m154714a(this.f158446n, resultData.f158446n) && this.f158447o == resultData.f158447o;
        }

        public final int hashCode() {
            int com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((((((((((((((((m124988x6733a65d(this.f158433a) * 31) + m124987x6733a65d(this.f158434b)) * 31) + m124988x6733a65d(this.f158435c)) * 31) + m124988x6733a65d(this.f158436d)) * 31) + m124988x6733a65d(this.f158437e)) * 31) + m124988x6733a65d(this.f158438f)) * 31) + m124988x6733a65d(this.f158439g)) * 31) + m124987x6733a65d(this.f158440h)) * 31) + m124988x6733a65d(this.f158441i)) * 31) + m124988x6733a65d(this.f158442j)) * 31) + m124986x6733a65d(this.f158443k)) * 31) + m124988x6733a65d(this.f158444l)) * 31) + m124987x6733a65d(this.f158445m)) * 31;
            OptBitrateFromVE optBitrateFromVE = this.f158446n;
            return ((com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (optBitrateFromVE != null ? optBitrateFromVE.hashCode() : 0)) * 31) + m124988x6733a65d(this.f158447o);
        }

        public final String toString() {
            return "ResultData(optimizeCrf=" + this.f158433a + ", videoBitrate=" + this.f158434b + ", encoderType=" + this.f158435c + ", preset=" + this.f158436d + ", maxBitrate=" + this.f158437e + ", encodeWidth=" + this.f158438f + ", encodeHeight=" + this.f158439g + ", psnr=" + this.f158440h + ", crf=" + this.f158441i + ", gop=" + this.f158442j + ", qpoffset=" + this.f158443k + ", durationMs=" + this.f158444l + ", optBitrate=" + this.f158445m + ", optBitrateFromVE=" + this.f158446n + ", version=" + this.f158447o + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeInt(this.f158433a);
            parcel.writeFloat(this.f158434b);
            parcel.writeInt(this.f158435c);
            parcel.writeInt(this.f158436d);
            parcel.writeInt(this.f158437e);
            parcel.writeInt(this.f158438f);
            parcel.writeInt(this.f158439g);
            parcel.writeFloat(this.f158440h);
            parcel.writeInt(this.f158441i);
            parcel.writeInt(this.f158442j);
            parcel.writeDouble(this.f158443k);
            parcel.writeInt(this.f158444l);
            parcel.writeFloat(this.f158445m);
            this.f158446n.writeToParcel(parcel, 0);
            parcel.writeInt(this.f158447o);
        }

        public final int getCrf() {
            return this.f158441i;
        }

        public final int getDurationMs() {
            return this.f158444l;
        }

        public final int getEncodeHeight() {
            return this.f158439g;
        }

        public final int getEncodeWidth() {
            return this.f158438f;
        }

        public final int getEncoderType() {
            return this.f158435c;
        }

        public final int getGop() {
            return this.f158442j;
        }

        public final int getMaxBitrate() {
            return this.f158437e;
        }

        public final float getOptBitrate() {
            return this.f158445m;
        }

        public final OptBitrateFromVE getOptBitrateFromVE() {
            return this.f158446n;
        }

        public final int getOptimizeCrf() {
            return this.f158433a;
        }

        public final int getPreset() {
            return this.f158436d;
        }

        public final float getPsnr() {
            return this.f158440h;
        }

        public final double getQpoffset() {
            return this.f158443k;
        }

        public final int getVersion() {
            return this.f158447o;
        }

        public final float getVideoBitrate() {
            return this.f158434b;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData$a */
        public static class C70770a implements Parcelable.Creator<ResultData> {
            static {
                Covode.recordClassIndex(83245);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ResultData[] newArray(int i) {
                return new ResultData[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResultData createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new ResultData(parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readFloat(), OptBitrateFromVE.CREATOR.createFromParcel(parcel), parcel.readInt());
            }
        }

        /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m124987x6733a65d(float f) {
            return Float.floatToIntBits(f);
        }

        /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m124986x6733a65d(double d) {
            long doubleToLongBits = Double.doubleToLongBits(d);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }

        public ResultData(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE, int i10) {
            C89219l.m154721d(optBitrateFromVE, "");
            this.f158433a = i;
            this.f158434b = f;
            this.f158435c = i2;
            this.f158436d = i3;
            this.f158437e = i4;
            this.f158438f = i5;
            this.f158439g = i6;
            this.f158440h = f2;
            this.f158441i = i7;
            this.f158442j = i8;
            this.f158443k = d;
            this.f158444l = i9;
            this.f158445m = f3;
            this.f158446n = optBitrateFromVE;
            this.f158447o = i10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResultData(int i, float f, int i2, int i3, int i4, int i5, int i6, float f2, int i7, int i8, double d, int i9, float f3, OptBitrateFromVE optBitrateFromVE, int i10, int i11, C89214g gVar) {
            this(i, f, i2, i3, i4, i5, i6, f2, i7, i8, d, i9, (i11 & 4096) != 0 ? 0.0f : f3, (i11 & 8192) != 0 ? new OptBitrateFromVE(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : optBitrateFromVE, (i11 & 16384) != 0 ? 1 : i10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus */
    public static final class ResultStatus implements Parcelable, Serializable {
        public static final Parcelable.Creator<ResultStatus> CREATOR = new C70771a();

        /* renamed from: a */
        private final State f158448a;

        /* renamed from: b */
        private final int f158449b;

        /* renamed from: c */
        private final int f158450c;

        /* renamed from: d */
        private final String f158451d;

        static {
            Covode.recordClassIndex(83246);
        }

        /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_CompileProbeResult$ResultStatus_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m124989x164463e5(int i) {
            return i;
        }

        public static /* synthetic */ ResultStatus copy$default(ResultStatus resultStatus, State state, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                state = resultStatus.f158448a;
            }
            if ((i3 & 2) != 0) {
                i = resultStatus.f158449b;
            }
            if ((i3 & 4) != 0) {
                i2 = resultStatus.f158450c;
            }
            if ((i3 & 8) != 0) {
                str = resultStatus.f158451d;
            }
            return resultStatus.copy(state, i, i2, str);
        }

        public final State component1() {
            return this.f158448a;
        }

        public final int component2() {
            return this.f158449b;
        }

        public final int component3() {
            return this.f158450c;
        }

        public final String component4() {
            return this.f158451d;
        }

        public final ResultStatus copy(State state, int i, int i2, String str) {
            C89219l.m154721d(state, "");
            C89219l.m154721d(str, "");
            return new ResultStatus(state, i, i2, str);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultStatus)) {
                return false;
            }
            ResultStatus resultStatus = (ResultStatus) obj;
            return C89219l.m154714a(this.f158448a, resultStatus.f158448a) && this.f158449b == resultStatus.f158449b && this.f158450c == resultStatus.f158450c && C89219l.m154714a(this.f158451d, resultStatus.f158451d);
        }

        public final int hashCode() {
            State state = this.f158448a;
            int i = 0;
            int hashCode = (((((state != null ? state.hashCode() : 0) * 31) + m124989x164463e5(this.f158449b)) * 31) + m124989x164463e5(this.f158450c)) * 31;
            String str = this.f158451d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "ResultStatus(state=" + this.f158448a + ", veCode=" + this.f158449b + ", toolsCode=" + this.f158450c + ", msg=" + this.f158451d + ")";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(this.f158448a.name());
            parcel.writeInt(this.f158449b);
            parcel.writeInt(this.f158450c);
            parcel.writeString(this.f158451d);
        }

        public final String getMsg() {
            return this.f158451d;
        }

        public final State getState() {
            return this.f158448a;
        }

        public final int getToolsCode() {
            return this.f158450c;
        }

        public final int getVeCode() {
            return this.f158449b;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus$a */
        public static class C70771a implements Parcelable.Creator<ResultStatus> {
            static {
                Covode.recordClassIndex(83247);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ResultStatus[] newArray(int i) {
                return new ResultStatus[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ResultStatus createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return new ResultStatus((State) Enum.valueOf(State.class, parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readString());
            }
        }

        public ResultStatus(State state, int i, int i2, String str) {
            C89219l.m154721d(state, "");
            C89219l.m154721d(str, "");
            this.f158448a = state;
            this.f158449b = i;
            this.f158450c = i2;
            this.f158451d = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResultStatus(State state, int i, int i2, String str, int i3, C89214g gVar) {
            this(state, i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str);
        }
    }

    public final ResultData getData() {
        return this.f158432b;
    }

    public final ResultStatus getStatus() {
        return this.f158431a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State */
    public enum State implements Parcelable, Serializable {
        SUCCESS,
        ERROR,
        CANCEL;
        
        public static final Parcelable.Creator<State> CREATOR = new C70772a();

        static {
            Covode.recordClassIndex(83248);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C89219l.m154721d(parcel, "");
            parcel.writeString(name());
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State$a */
        public static class C70772a implements Parcelable.Creator<State> {
            static {
                Covode.recordClassIndex(83249);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ State[] newArray(int i) {
                return new State[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ State createFromParcel(Parcel parcel) {
                C89219l.m154721d(parcel, "");
                return Enum.valueOf(State.class, parcel.readString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$a */
    public static class C70773a implements Parcelable.Creator<CompileProbeResult> {
        static {
            Covode.recordClassIndex(83250);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CompileProbeResult[] newArray(int i) {
            return new CompileProbeResult[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CompileProbeResult createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new CompileProbeResult(ResultStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ResultData.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public CompileProbeResult(ResultStatus resultStatus, ResultData resultData) {
        C89219l.m154721d(resultStatus, "");
        this.f158431a = resultStatus;
        this.f158432b = resultData;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompileProbeResult(ResultStatus resultStatus, ResultData resultData, int i, C89214g gVar) {
        this(resultStatus, (i & 2) != 0 ? null : resultData);
    }
}
