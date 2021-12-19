package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam */
public class VEVideoTransformFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoTransformFilterParam> CREATOR = new Parcelable.Creator<VEVideoTransformFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEVideoTransformFilterParam.C855061 */

        static {
            Covode.recordClassIndex(99662);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoTransformFilterParam[] newArray(int i) {
            return new VEVideoTransformFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoTransformFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoTransformFilterParam(parcel);
        }
    };
    public float alpha;
    public int animEndTime;
    public String animPath;
    public int animStartTime;
    public String blendModePath;
    public int borderColor;
    public int borderWidth;
    public int degree;
    public boolean disableInsideScale;
    public int mirror;
    public float scaleFactor;
    public float transX;
    public float transY;
    public int transformType;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99661);
    }

    /* renamed from: com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam$a */
    public enum EnumC85507a {
        UPDATE_VIDEO_TRANSFORM,
        UPDATE_VIDEO_ANIMATION,
        UPDATE_VIDEO_ANIMATION_AND_ANIMATION;

        static {
            Covode.recordClassIndex(99663);
        }
    }

    public VEVideoTransformFilterParam() {
        this.filterName = "canvas blend";
        this.filterType = 15;
        this.filterDurationType = 1;
        this.scaleFactor = 1.0f;
        this.alpha = 1.0f;
        this.animPath = "";
        this.blendModePath = "";
        this.transformType = EnumC85507a.UPDATE_VIDEO_TRANSFORM.ordinal();
        this.borderColor = -1;
        this.borderWidth = 0;
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoTransformFilterParam{scaleFactor=" + this.scaleFactor + ", disableInsideScale=" + this.disableInsideScale + ", degree=" + this.degree + ", transX=" + this.transX + ", transY=" + this.transY + ", mirror=" + this.mirror + ", blendModePath='" + this.blendModePath + '\'' + ", alpha=" + this.alpha + ", animPath='" + this.animPath + '\'' + ", animStartTime=" + this.animStartTime + ", animEndTime=" + this.animEndTime + ", transformType=" + this.transformType + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '\'' + ", borderColor =" + this.borderColor + '\'' + ", borderWidth =" + this.borderWidth + '}';
    }

    protected VEVideoTransformFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        this.scaleFactor = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.disableInsideScale = z;
        this.degree = parcel.readInt();
        this.transX = parcel.readFloat();
        this.transY = parcel.readFloat();
        this.mirror = parcel.readInt();
        this.blendModePath = parcel.readString();
        this.alpha = parcel.readFloat();
        this.animPath = parcel.readString();
        this.animStartTime = parcel.readInt();
        this.animEndTime = parcel.readInt();
        this.transformType = parcel.readInt();
        this.borderColor = parcel.readInt();
        this.borderWidth = parcel.readInt();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.scaleFactor);
        parcel.writeByte(this.disableInsideScale ? (byte) 1 : 0);
        parcel.writeInt(this.degree);
        parcel.writeFloat(this.transX);
        parcel.writeFloat(this.transY);
        parcel.writeInt(this.mirror);
        parcel.writeString(this.blendModePath);
        parcel.writeFloat(this.alpha);
        parcel.writeString(this.animPath);
        parcel.writeInt(this.animStartTime);
        parcel.writeInt(this.animEndTime);
        parcel.writeInt(this.transformType);
        parcel.writeInt(this.borderColor);
        parcel.writeInt(this.borderWidth);
    }
}
