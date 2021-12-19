package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65380bt;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult */
public final class HardcodeAdaptiveResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<HardcodeAdaptiveResult> CREATOR = new C72553a();

    /* renamed from: a */
    private float f162634a;

    /* renamed from: b */
    private float f162635b;

    /* renamed from: c */
    private boolean f162636c;

    static {
        Covode.recordClassIndex(85234);
    }

    public HardcodeAdaptiveResult() {
        this(0.0f, 0.0f, false, 7, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeFloat(this.f162634a);
        parcel.writeFloat(this.f162635b);
        parcel.writeInt(this.f162636c ? 1 : 0);
    }

    public final float getHwOptBitrate() {
        return this.f162634a;
    }

    public final boolean getNeedSetHwOptBitrate() {
        return this.f162636c;
    }

    public final float getPreBitrateStatus() {
        return this.f162635b;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult$a */
    public static class C72553a implements Parcelable.Creator<HardcodeAdaptiveResult> {
        static {
            Covode.recordClassIndex(85235);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ HardcodeAdaptiveResult[] newArray(int i) {
            return new HardcodeAdaptiveResult[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HardcodeAdaptiveResult createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new HardcodeAdaptiveResult(parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0);
        }
    }

    public final void setHwOptBitrate(float f) {
        this.f162634a = f;
    }

    public final void setNeedSetHwOptBitrate(boolean z) {
        this.f162636c = z;
    }

    public final void setPreBitrateStatus(float f) {
        this.f162635b = f;
    }

    public HardcodeAdaptiveResult(float f, float f2, boolean z) {
        this.f162634a = f;
        this.f162635b = f2;
        this.f162636c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HardcodeAdaptiveResult(float f, float f2, boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? -1.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? C65380bt.m117077a() : z);
    }
}
