package com.p2082ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEAudioEffectBean */
public class VEAudioEffectBean implements Parcelable {
    public static final Parcelable.Creator<VEAudioEffectBean> CREATOR = new Parcelable.Creator<VEAudioEffectBean>() {
        /* class com.p2082ss.android.vesdk.VEAudioEffectBean.C851911 */

        static {
            Covode.recordClassIndex(99243);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEAudioEffectBean[] newArray(int i) {
            return new VEAudioEffectBean[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEAudioEffectBean createFromParcel(Parcel parcel) {
            return new VEAudioEffectBean(parcel);
        }
    };
    public int blockSize;
    public float centtone;
    public boolean formatShiftOn;
    public float octative;
    public int phaseAdjustMethod;
    public int phaseResetMode;
    public int pitchTunerMode;
    public int processChMode;
    public float semiton;
    public boolean smoothOn;
    public float speedRatio;
    public int transientDetectMode;
    public int type;
    public int windowMode;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99242);
    }

    public String toString() {
        return "VEAudioEffectBean{type=" + this.type + ", formatShiftOn=" + this.formatShiftOn + ", smoothOn=" + this.smoothOn + ", processChMode=" + this.processChMode + ", transientDetectMode=" + this.transientDetectMode + ", phaseResetMode=" + this.phaseResetMode + ", phaseAdjustMethod=" + this.phaseAdjustMethod + ", windowMode=" + this.windowMode + ", pitchTunerMode=" + this.pitchTunerMode + ", blockSize=" + this.blockSize + ", centtone=" + this.centtone + ", semiton=" + this.semiton + ", octative=" + this.octative + ", speedRatio=" + this.speedRatio + '}';
    }

    protected VEAudioEffectBean(Parcel parcel) {
        boolean z;
        this.type = parcel.readInt();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.formatShiftOn = z;
        this.smoothOn = parcel.readByte() == 0 ? false : z2;
        this.processChMode = parcel.readInt();
        this.transientDetectMode = parcel.readInt();
        this.phaseResetMode = parcel.readInt();
        this.phaseAdjustMethod = parcel.readInt();
        this.windowMode = parcel.readInt();
        this.pitchTunerMode = parcel.readInt();
        this.blockSize = parcel.readInt();
        this.centtone = parcel.readFloat();
        this.semiton = parcel.readFloat();
        this.octative = parcel.readFloat();
        this.speedRatio = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeByte(this.formatShiftOn ? (byte) 1 : 0);
        parcel.writeByte(this.smoothOn ? (byte) 1 : 0);
        parcel.writeInt(this.processChMode);
        parcel.writeInt(this.transientDetectMode);
        parcel.writeInt(this.phaseResetMode);
        parcel.writeInt(this.phaseAdjustMethod);
        parcel.writeInt(this.windowMode);
        parcel.writeInt(this.pitchTunerMode);
        parcel.writeInt(this.blockSize);
        parcel.writeFloat(this.centtone);
        parcel.writeFloat(this.semiton);
        parcel.writeFloat(this.octative);
        parcel.writeFloat(this.speedRatio);
    }

    public VEAudioEffectBean(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, float f2, float f3, float f4) {
        this.type = i;
        this.formatShiftOn = z;
        this.smoothOn = z2;
        this.processChMode = i2;
        this.transientDetectMode = i3;
        this.phaseResetMode = i4;
        this.phaseAdjustMethod = i5;
        this.windowMode = i6;
        this.pitchTunerMode = i7;
        this.blockSize = i8;
        this.centtone = f;
        this.semiton = f2;
        this.octative = f3;
        this.speedRatio = f4;
    }
}
