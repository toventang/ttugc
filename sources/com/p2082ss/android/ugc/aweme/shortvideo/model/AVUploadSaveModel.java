package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel */
public class AVUploadSaveModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AVUploadSaveModel> CREATOR = new Parcelable.Creator<AVUploadSaveModel>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel.C719851 */

        static {
            Covode.recordClassIndex(84543);
        }

        @Override // android.os.Parcelable.Creator
        public final AVUploadSaveModel[] newArray(int i) {
            return new AVUploadSaveModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final AVUploadSaveModel createFromParcel(Parcel parcel) {
            return new AVUploadSaveModel(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "enable_silent_enhancement")
    private boolean enableSilentEnhancement;
    @AbstractC27891c(mo46611a = "is_save_local")
    private boolean isSaveLocal;
    @AbstractC27891c(mo46611a = "is_water_mark")
    private boolean isWaterMark;
    @AbstractC27891c(mo46611a = "local_final_path")
    private String mLocalFinalPath;
    @AbstractC27891c(mo46611a = "local_temp_path")
    private String mLocalTempPath;
    @AbstractC27891c(mo46611a = "save_to_album")
    private boolean mSaveToAlbum;
    @AbstractC27891c(mo46611a = "save_private_path")
    private boolean mSaveToAppPathInsteadOfAlbum;
    @AbstractC27891c(mo46611a = "save_type")
    private int mSaveType;
    @AbstractC27891c(mo46611a = "save_with_caption")
    private boolean mSaveWithCaption;

    public int describeContents() {
        return 0;
    }

    public AVUploadSaveModel() {
    }

    public String getLocalFinalPath() {
        return this.mLocalFinalPath;
    }

    public String getLocalTempPath() {
        return this.mLocalTempPath;
    }

    public boolean getSaveToAlbum() {
        return this.mSaveToAlbum;
    }

    public int getSaveType() {
        return this.mSaveType;
    }

    public boolean isSaveToAppPathInsteadOfAlbum() {
        return this.mSaveToAppPathInsteadOfAlbum;
    }

    public boolean isSaveWithCaption() {
        return this.mSaveWithCaption;
    }

    public boolean isWaterMark() {
        return this.isWaterMark;
    }

    static {
        Covode.recordClassIndex(84542);
    }

    public boolean isSaveLocal() {
        if (this.isSaveLocal || this.mSaveToAlbum) {
            return true;
        }
        return false;
    }

    public boolean isSaveLocalWithWaterMark() {
        if ((this.isSaveLocal || this.mSaveToAlbum) && this.isWaterMark) {
            return true;
        }
        return false;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        if ((this.isSaveLocal || this.mSaveToAlbum) && !this.isWaterMark) {
            return true;
        }
        return false;
    }

    public void setEnableSilentEnhancement(boolean z) {
        this.enableSilentEnhancement = z;
    }

    public void setLocalFinalPath(String str) {
        this.mLocalFinalPath = str;
    }

    public void setLocalTempPath(String str) {
        this.mLocalTempPath = str;
    }

    public void setSaveLocal(boolean z) {
        this.isSaveLocal = z;
    }

    public void setSaveToAlbum(boolean z) {
        this.mSaveToAlbum = z;
    }

    public void setSaveToAppPathInsteadOfAlbum(boolean z) {
        this.mSaveToAppPathInsteadOfAlbum = z;
    }

    public void setSaveType(int i) {
        this.mSaveType = i;
    }

    public void setSaveWithCaption(boolean z) {
        this.mSaveWithCaption = z;
    }

    public void setWaterMark(boolean z) {
        this.isWaterMark = z;
    }

    protected AVUploadSaveModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isWaterMark = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isSaveLocal = z2;
        this.mLocalTempPath = parcel.readString();
        this.mSaveType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mSaveToAlbum = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mSaveToAppPathInsteadOfAlbum = z4;
        this.enableSilentEnhancement = parcel.readByte() == 0 ? false : z5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isWaterMark ? (byte) 1 : 0);
        parcel.writeByte(this.isSaveLocal ? (byte) 1 : 0);
        parcel.writeString(this.mLocalTempPath);
        parcel.writeInt(this.mSaveType);
        parcel.writeByte(this.mSaveToAlbum ? (byte) 1 : 0);
        parcel.writeByte(this.mSaveToAppPathInsteadOfAlbum ? (byte) 1 : 0);
        parcel.writeByte(this.enableSilentEnhancement ? (byte) 1 : 0);
    }
}
