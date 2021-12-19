package com.p2082ss.android.vesdk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.VEBitmapWithInfo */
public class VEBitmapWithInfo implements Parcelable {
    public static final Parcelable.Creator<VEBitmapWithInfo> CREATOR = new Parcelable.Creator<VEBitmapWithInfo>() {
        /* class com.p2082ss.android.vesdk.VEBitmapWithInfo.C852011 */

        static {
            Covode.recordClassIndex(99258);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEBitmapWithInfo[] newArray(int i) {
            return new VEBitmapWithInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEBitmapWithInfo createFromParcel(Parcel parcel) {
            return new VEBitmapWithInfo(parcel);
        }
    };
    public Bitmap bitmap;
    public int colorPrimary;
    public int colorSpace;
    public int colorTransfer;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99257);
    }

    /* renamed from: com.ss.android.vesdk.VEBitmapWithInfo$a */
    public enum EnumC85202a {
        UNKNOWN,
        BT601,
        BT709,
        BT2020_PQ,
        BT2020_HLG;

        static {
            Covode.recordClassIndex(99259);
        }
    }

    public VEBitmapWithInfo(Bitmap bitmap2) {
        this.bitmap = bitmap2;
        this.colorSpace = EnumC85202a.UNKNOWN.ordinal();
        this.colorPrimary = EnumC85202a.UNKNOWN.ordinal();
        this.colorTransfer = EnumC85202a.UNKNOWN.ordinal();
    }

    protected VEBitmapWithInfo(Parcel parcel) {
        this.colorSpace = parcel.readInt();
        this.colorPrimary = parcel.readInt();
        this.colorTransfer = parcel.readInt();
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.colorSpace);
        parcel.writeInt(this.colorPrimary);
        parcel.writeInt(this.colorTransfer);
        parcel.writeParcelable(this.bitmap, i);
    }

    public void setColorInfo(int i, int i2, int i3) {
        this.colorSpace = i;
        this.colorPrimary = i2;
        this.colorTransfer = i3;
    }

    public VEBitmapWithInfo(Bitmap bitmap2, int i, int i2, int i3) {
        this.bitmap = bitmap2;
        this.colorSpace = i;
        this.colorPrimary = i2;
        this.colorTransfer = i3;
    }
}
