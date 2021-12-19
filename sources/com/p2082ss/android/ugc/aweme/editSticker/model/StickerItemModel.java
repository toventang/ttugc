package com.p2082ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.editSticker.model.StickerItemModel */
public class StickerItemModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<StickerItemModel> CREATOR = new Parcelable.Creator<StickerItemModel>() {
        /* class com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel.C459351 */

        static {
            Covode.recordClassIndex(54468);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StickerItemModel[] newArray(int i) {
            return new StickerItemModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StickerItemModel createFromParcel(Parcel parcel) {
            return new StickerItemModel(parcel);
        }
    };

    /* renamed from: a */
    private int f106993a;

    /* renamed from: b */
    private transient boolean f106994b;

    /* renamed from: c */
    private int f106995c;
    @AbstractC27891c(mo46611a = "current_offsetX")
    public float currentOffsetX;
    @AbstractC27891c(mo46611a = "current_offsetY")
    public float currentOffsetY;
    @AbstractC27891c(mo46611a = "cutout")
    public boolean cutout;

    /* renamed from: d */
    private int f106996d;
    @AbstractC27891c(mo46611a = "deletable")
    public boolean deletable;
    @AbstractC27891c(mo46611a = "end_time")
    public int endTime;
    @AbstractC27891c(mo46611a = "extra")
    public String extra;
    @AbstractC27891c(mo46611a = "extra2")
    public String extra2;
    @AbstractC27891c(mo46611a = "extra3")
    public String extra3;
    @AbstractC27891c(mo46611a = "h")

    /* renamed from: h */
    public float f106997h;
    @AbstractC27891c(mo46611a = "in_duration")
    public int inDuration;
    @AbstractC27891c(mo46611a = "in_path")
    public String inPath;
    @AbstractC27891c(mo46611a = "in_sticker_id")
    public String inStickerId;
    @AbstractC27891c(mo46611a = "init_height")
    public float initHeight;
    @AbstractC27891c(mo46611a = "init_width")
    public float initWidth;
    @AbstractC27891c(mo46611a = "is_add_veeditor_success")
    public boolean isAddVEEditorSuccess;
    @AbstractC27891c(mo46611a = "isAnimate")
    public boolean isAnimate;
    @AbstractC27891c(mo46611a = "is_animation_loop")
    public boolean isAnimationLoop;
    @AbstractC27891c(mo46611a = "is_enable_interaction")
    public boolean isEnableInteraction;
    public boolean isImageStickerLayer;
    @AbstractC27891c(mo46611a = "is_pin")
    public boolean isPin;
    @AbstractC27891c(mo46611a = "layer_weight")
    public int layerWeight;
    public transient String lyricSrtPath;
    @AbstractC27891c(mo46611a = "lyric_color")
    public int mLyricColor;
    @AbstractC27891c(mo46611a = "lyric_fontId")
    public String mLyricFontId;
    @AbstractC27891c(mo46611a = "lyric_fontPath")
    public String mLyricFontPath;
    @AbstractC27891c(mo46611a = "lyric_in_point")
    public int mLyricInPoint;
    @AbstractC27891c(mo46611a = "lyric_info")
    public String mLyricInfo;
    @AbstractC27891c(mo46611a = "lyric_music_loop")
    public boolean mLyricMusicLoop;
    @AbstractC27891c(mo46611a = "lyric_out_point")
    public int mLyricOutPoint;
    @AbstractC27891c(mo46611a = "lyric_start_time")
    public int mLyricStartTime;
    @AbstractC27891c(mo46611a = "normalized_height")
    public float normalizedHeight;
    @AbstractC27891c(mo46611a = "normalized_width")
    public float normalizedWidth;
    @AbstractC27891c(mo46611a = "out_duration")
    public int outDuration;
    @AbstractC27891c(mo46611a = "out_path")
    public String outPath;
    @AbstractC27891c(mo46611a = "path")
    public String path;
    @AbstractC27891c(mo46611a = "pin_algorithm_file")
    public String pinAlgorithmFile;
    @AbstractC27891c(mo46611a = "angle")
    public float rotateAngle;
    @AbstractC27891c(mo46611a = "scale")
    public float scale;
    @AbstractC27891c(mo46611a = "start_time")
    public int startTime;
    @AbstractC27891c(mo46611a = "stickerDrawScale")
    public float stickerDrawScale;
    @AbstractC27891c(mo46611a = "sticker_id")
    public String stickerId;
    @AbstractC27891c(mo46611a = "tab_id")
    public String tabId;
    public int type;
    @AbstractC27891c(mo46611a = "ui_end_time")
    public int uiEndTime;
    @AbstractC27891c(mo46611a = "ui_start_time")
    public int uiStartTime;
    @AbstractC27891c(mo46611a = "uuid")
    public String uuid;
    public transient int viewHash;
    @AbstractC27891c(mo46611a = "w")

    /* renamed from: w */
    public float f106998w;
    @AbstractC27891c(mo46611a = "x")

    /* renamed from: x */
    public float f106999x;
    @AbstractC27891c(mo46611a = "y")

    /* renamed from: y */
    public float f107000y;

    public int describeContents() {
        return 0;
    }

    public int getId() {
        return this.f106993a;
    }

    public int getOriginalEndTime() {
        return this.f106996d;
    }

    public int getOriginalStartTime() {
        return this.f106995c;
    }

    public String getPinAlgorithmFile() {
        return this.pinAlgorithmFile;
    }

    public String getText() {
        return this.path;
    }

    public boolean isFromSearch() {
        return this.f106994b;
    }

    public boolean isPin() {
        return this.isPin;
    }

    static {
        Covode.recordClassIndex(54467);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public StickerItemModel clone() {
        try {
            return (StickerItemModel) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isAnimTimestampSticker() {
        if (this.type == 14) {
            return true;
        }
        return false;
    }

    public boolean isImageSticker() {
        if (this.type == 11) {
            return true;
        }
        return false;
    }

    public boolean isLocalHashTagSticker() {
        if (this.type == 13) {
            return true;
        }
        return false;
    }

    public boolean isLyric() {
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public boolean isMagnifier() {
        return "MagnifierSticker".equals(this.extra);
    }

    public boolean isSubtitle() {
        return "subtitle".equals(this.extra);
    }

    public boolean isSubtitleRule() {
        return "subtitle_rule".equals(this.extra);
    }

    public boolean isTextSticker() {
        int i = this.type;
        if (i == 2 || i == 20) {
            return true;
        }
        return false;
    }

    public StickerItemModel() {
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.f106998w = 1.0f;
        this.f106997h = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
    }

    public int hashCode() {
        int i;
        int i2;
        int id = getId() * 31;
        String str = this.stickerId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (id + i) * 31;
        String str2 = this.path;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.extra;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public StickerItemModel dumpClonedData() {
        StickerItemModel stickerItemModel = new StickerItemModel(this.stickerId, this.path, this.extra, this.layerWeight, this.isAnimate, this.startTime, this.endTime, this.type);
        stickerItemModel.scale = this.scale;
        stickerItemModel.rotateAngle = this.rotateAngle;
        stickerItemModel.initHeight = this.initHeight;
        stickerItemModel.initWidth = this.initWidth;
        stickerItemModel.currentOffsetX = this.currentOffsetX;
        stickerItemModel.currentOffsetY = this.currentOffsetY;
        stickerItemModel.isAnimate = this.isAnimate;
        stickerItemModel.isImageStickerLayer = this.isImageStickerLayer;
        stickerItemModel.pinAlgorithmFile = this.pinAlgorithmFile;
        stickerItemModel.isPin = this.isPin;
        stickerItemModel.f106999x = this.f106999x;
        stickerItemModel.f107000y = this.f107000y;
        stickerItemModel.f106998w = this.f106998w;
        stickerItemModel.f106997h = this.f106997h;
        stickerItemModel.isAnimationLoop = this.isAnimationLoop;
        stickerItemModel.inStickerId = this.inStickerId;
        stickerItemModel.inPath = this.inPath;
        stickerItemModel.inDuration = this.inDuration;
        stickerItemModel.outPath = this.outPath;
        stickerItemModel.outDuration = this.outDuration;
        return stickerItemModel;
    }

    public String toString() {
        return "StickerItemModel{id=" + getId() + ", stickerId='" + this.stickerId + '\'' + ", path='" + this.path + '\'' + ", extra='" + this.extra + '\'' + ", scale=" + this.scale + ", rotateAngle=" + this.rotateAngle + ", layerWeight=" + this.layerWeight + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", initWidth=" + this.initWidth + ", initHeight=" + this.initHeight + ", currentOffsetX=" + this.currentOffsetX + ", currentOffsetY=" + this.currentOffsetY + ", normalizedWidth=" + this.normalizedWidth + ", normalizedHeight=" + this.normalizedHeight + '}';
    }

    public void setFromSearch(boolean z) {
        this.f106994b = z;
    }

    public void setId(int i) {
        this.f106993a = i;
    }

    public void setOriginalEndTime(int i) {
        this.f106996d = i;
    }

    public void setOriginalStartTime(int i) {
        this.f106995c = i;
    }

    public void setPin(boolean z) {
        this.isPin = z;
    }

    public void setPinAlgorithmFile(String str) {
        this.pinAlgorithmFile = str;
    }

    public void updateLayerWeight(int i) {
        this.layerWeight = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerItemModel)) {
            return false;
        }
        StickerItemModel stickerItemModel = (StickerItemModel) obj;
        if (TextUtils.isEmpty(this.uuid) || getId() == 0) {
            if (getId() != stickerItemModel.getId()) {
                return false;
            }
        } else if (!TextUtils.equals(this.uuid, stickerItemModel.uuid)) {
            return false;
        }
        if (!this.path.equals(stickerItemModel.path) || !this.stickerId.equals(stickerItemModel.stickerId)) {
            return false;
        }
        String str = this.extra;
        String str2 = stickerItemModel.extra;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    protected StickerItemModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        boolean z9 = true;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.f106998w = 1.0f;
        this.f106997h = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.stickerId = parcel.readString();
        this.path = parcel.readString();
        this.extra = parcel.readString();
        this.extra2 = parcel.readString();
        this.extra3 = parcel.readString();
        this.scale = parcel.readFloat();
        this.stickerDrawScale = parcel.readFloat();
        this.rotateAngle = parcel.readFloat();
        this.layerWeight = parcel.readInt();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.uiStartTime = parcel.readInt();
        this.uiEndTime = parcel.readInt();
        this.initWidth = parcel.readFloat();
        this.initHeight = parcel.readFloat();
        this.currentOffsetX = parcel.readFloat();
        this.currentOffsetY = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimate = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isImageStickerLayer = z2;
        this.type = parcel.readInt();
        this.pinAlgorithmFile = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isPin = z3;
        this.mLyricInfo = parcel.readString();
        this.mLyricFontPath = parcel.readString();
        this.mLyricFontId = parcel.readString();
        this.mLyricColor = parcel.readInt();
        this.mLyricInPoint = parcel.readInt();
        this.mLyricStartTime = parcel.readInt();
        this.mLyricOutPoint = parcel.readInt();
        this.tabId = parcel.readString();
        this.f106999x = parcel.readFloat();
        this.f107000y = parcel.readFloat();
        this.f106998w = parcel.readFloat();
        this.f106997h = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.cutout = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.deletable = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isEnableInteraction = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.mLyricMusicLoop = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isAnimationLoop = z8;
        this.inStickerId = parcel.readString();
        this.inPath = parcel.readString();
        this.inDuration = parcel.readInt();
        this.outPath = parcel.readString();
        this.outDuration = parcel.readInt();
        this.normalizedWidth = parcel.readFloat();
        this.normalizedHeight = parcel.readFloat();
        this.isAddVEEditorSuccess = parcel.readByte() == 0 ? false : z9;
        this.uuid = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stickerId);
        parcel.writeString(this.path);
        parcel.writeString(this.extra);
        parcel.writeString(this.extra2);
        parcel.writeString(this.extra3);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.stickerDrawScale);
        parcel.writeFloat(this.rotateAngle);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.uiStartTime);
        parcel.writeInt(this.uiEndTime);
        parcel.writeFloat(this.initWidth);
        parcel.writeFloat(this.initHeight);
        parcel.writeFloat(this.currentOffsetX);
        parcel.writeFloat(this.currentOffsetY);
        parcel.writeByte(this.isAnimate ? (byte) 1 : 0);
        parcel.writeByte(this.isImageStickerLayer ? (byte) 1 : 0);
        parcel.writeInt(this.type);
        parcel.writeString(this.pinAlgorithmFile);
        parcel.writeByte(this.isPin ? (byte) 1 : 0);
        parcel.writeString(this.mLyricInfo);
        parcel.writeString(this.mLyricFontPath);
        parcel.writeString(this.mLyricFontId);
        parcel.writeInt(this.mLyricColor);
        parcel.writeInt(this.mLyricInPoint);
        parcel.writeInt(this.mLyricStartTime);
        parcel.writeInt(this.mLyricOutPoint);
        parcel.writeString(this.tabId);
        parcel.writeFloat(this.f106999x);
        parcel.writeFloat(this.f107000y);
        parcel.writeFloat(this.f106998w);
        parcel.writeFloat(this.f106997h);
        parcel.writeByte(this.cutout ? (byte) 1 : 0);
        parcel.writeByte(this.deletable ? (byte) 1 : 0);
        parcel.writeByte(this.isEnableInteraction ? (byte) 1 : 0);
        parcel.writeByte(this.mLyricMusicLoop ? (byte) 1 : 0);
        parcel.writeByte(this.isAnimationLoop ? (byte) 1 : 0);
        parcel.writeString(this.inStickerId);
        parcel.writeString(this.inPath);
        parcel.writeInt(this.inDuration);
        parcel.writeString(this.outPath);
        parcel.writeInt(this.outDuration);
        parcel.writeFloat(this.normalizedWidth);
        parcel.writeFloat(this.normalizedHeight);
        parcel.writeByte(this.isAddVEEditorSuccess ? (byte) 1 : 0);
        parcel.writeString(this.uuid);
    }

    public StickerItemModel(String str, String str2, String str3, int i, boolean z, int i2, int i3, int i4) {
        this.scale = 1.0f;
        this.stickerDrawScale = 1.0f;
        this.currentOffsetX = 0.5f;
        this.currentOffsetY = 0.5f;
        this.mLyricColor = -1;
        this.mLyricMusicLoop = true;
        this.tabId = "";
        this.f106998w = 1.0f;
        this.f106997h = 1.0f;
        this.deletable = true;
        this.isEnableInteraction = true;
        this.normalizedWidth = -1.0f;
        this.normalizedHeight = -1.0f;
        this.stickerId = str;
        this.path = str2;
        this.extra = str3;
        this.layerWeight = i;
        this.isAnimate = z;
        this.startTime = i2;
        this.endTime = i3;
        this.type = i4;
    }
}
