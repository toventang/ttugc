package com.p2082ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectPointModel */
public class EffectPointModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<EffectPointModel> CREATOR = new Parcelable.Creator<EffectPointModel>() {
        /* class com.p2082ss.android.ugc.aweme.effect.EffectPointModel.C462601 */

        static {
            Covode.recordClassIndex(54830);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EffectPointModel[] newArray(int i) {
            return new EffectPointModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EffectPointModel createFromParcel(Parcel parcel) {
            return new EffectPointModel(parcel);
        }
    };
    private String category = "filter";
    private int duration;
    private int endPoint;
    private String extra;
    private int index;
    private boolean isFromEnd;
    private String key = "0";
    private String name;
    private int originalEndTime;
    private int originalStartTime;
    private String resDir;
    private int selectedColor;
    private int startPoint;
    private int type;
    private int uiEndPoint;
    private int uiStartPoint;
    private String uuid;

    public int describeContents() {
        return 0;
    }

    public String getCategory() {
        return this.category;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEndPoint() {
        return this.endPoint;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getIndex() {
        return this.index;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public int getOriginalEndTime() {
        return this.originalEndTime;
    }

    public int getOriginalStartTime() {
        return this.originalStartTime;
    }

    public String getResDir() {
        return this.resDir;
    }

    public int getSelectedColor() {
        return this.selectedColor;
    }

    public int getStartPoint() {
        return this.startPoint;
    }

    public int getType() {
        return this.type;
    }

    public int getUiEndPoint() {
        return this.uiEndPoint;
    }

    public int getUiStartPoint() {
        return this.uiStartPoint;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isFromEnd() {
        return this.isFromEnd;
    }

    static {
        Covode.recordClassIndex(54829);
    }

    public EffectPointModel() {
    }

    @Override // java.lang.Object
    public EffectPointModel clone() {
        try {
            return (EffectPointModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "EffectPointModel{index=" + this.index + ", startPoint=" + this.startPoint + ", endPoint=" + this.endPoint + ", uiStartPoint=" + this.uiStartPoint + ", uiEndPoint=" + this.uiEndPoint + ", selectedColor=" + this.selectedColor + ", key='" + this.key + '\'' + ", type=" + this.type + ", isFromEnd=" + this.isFromEnd + ", resDir='" + this.resDir + '\'' + ", name='" + this.name + '\'' + ", duration=" + this.duration + ", category='" + this.category + '\'' + ", extra='" + this.extra + '\'' + '}';
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEndPoint(int i) {
        this.endPoint = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFromEnd(boolean z) {
        this.isFromEnd = z;
    }

    public EffectPointModel setIndex(int i) {
        this.index = i;
        return this;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOriginalEndTime(int i) {
        this.originalEndTime = i;
    }

    public void setOriginalStartTime(int i) {
        this.originalStartTime = i;
    }

    public void setResDir(String str) {
        this.resDir = str;
    }

    public void setSelectedColor(int i) {
        this.selectedColor = i;
    }

    public void setStartPoint(int i) {
        this.startPoint = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUiEndPoint(int i) {
        this.uiEndPoint = i;
    }

    public void setUiStartPoint(int i) {
        this.uiStartPoint = i;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    protected EffectPointModel(Parcel parcel) {
        boolean z;
        this.startPoint = parcel.readInt();
        this.endPoint = parcel.readInt();
        this.uiStartPoint = parcel.readInt();
        this.uiEndPoint = parcel.readInt();
        this.selectedColor = parcel.readInt();
        this.key = parcel.readString();
        this.type = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFromEnd = z;
        this.resDir = parcel.readString();
        this.name = parcel.readString();
        this.category = parcel.readString();
        this.duration = parcel.readInt();
        this.extra = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.startPoint);
        parcel.writeInt(this.endPoint);
        parcel.writeInt(this.uiStartPoint);
        parcel.writeInt(this.uiEndPoint);
        parcel.writeInt(this.selectedColor);
        parcel.writeString(this.key);
        parcel.writeInt(this.type);
        parcel.writeByte(this.isFromEnd ? (byte) 1 : 0);
        parcel.writeString(this.resDir);
        parcel.writeString(this.name);
        parcel.writeString(this.category);
        parcel.writeInt(this.duration);
        parcel.writeString(this.extra);
    }
}
