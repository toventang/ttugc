package com.p2082ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel */
public class InfoStickerModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<InfoStickerModel> CREATOR = new Parcelable.Creator<InfoStickerModel>() {
        /* class com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel.C459331 */

        static {
            Covode.recordClassIndex(54464);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InfoStickerModel[] newArray(int i) {
            return new InfoStickerModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InfoStickerModel createFromParcel(Parcel parcel) {
            return new InfoStickerModel(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "sticker_dir")
    public String infoStickerDraftDir;
    @AbstractC27891c(mo46611a = "text_align")
    public int mAlign = 2;
    @AbstractC27891c(mo46611a = "bg_mode")
    public int mBgMode = 1;
    @AbstractC27891c(mo46611a = "bg_color")
    public int mColor = -1;
    @AbstractC27891c(mo46611a = "text_font_id")
    public String mFontId;
    @AbstractC27891c(mo46611a = "text_font_path")
    public String mFontPath;
    @AbstractC27891c(mo46611a = "text_font")
    public String mFontType;
    @AbstractC27891c(mo46611a = "text_audio_length")
    public int mTextAudioLength;
    @AbstractC27891c(mo46611a = "stickers")
    public List<StickerItemModel> stickers;

    /* renamed from: com_ss_android_ugc_aweme_editSticker_model_InfoStickerModel_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m88692x8a85bea7(String str, String str2) {
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(54463);
    }

    public InfoStickerModel() {
    }

    @Override // java.lang.Object
    public InfoStickerModel clone() {
        try {
            return (InfoStickerModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String getInfoStickerIds() {
        if (C84892d.m145850a(this.stickers)) {
            return "";
        }
        return getNotEmptyInfoStickerIds();
    }

    public StickerItemModel getLyricStickerModel() {
        if (C84892d.m145850a(this.stickers)) {
            return null;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isLyric()) {
                return stickerItemModel;
            }
        }
        return null;
    }

    public String getNotEmptyInfoStickerIds() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (!TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(stickerItemModel.stickerId);
            }
        }
        return sb.toString();
    }

    public int getSubtitleRule() {
        if (C84892d.m145850a(this.stickers)) {
            return -1;
        }
        for (int i = 0; i < this.stickers.size(); i++) {
            if (this.stickers.get(i).isSubtitleRule()) {
                return i;
            }
        }
        return -1;
    }

    public boolean hasAnimTimestampSticker() {
        if (C84892d.m145850a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isAnimTimestampSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasImageSticker() {
        if (C84892d.m145850a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isImageSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLocalHashTagSticker() {
        if (C84892d.m145850a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isLocalHashTagSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLyricSticker() {
        if (C84892d.m145850a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isLyric()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSubtitle() {
        if (C84892d.m145850a(this.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isSubtitle()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "InfoStickerModel{infoStickerDraftDir='" + this.infoStickerDraftDir + '\'' + ", stickers=" + this.stickers + '}';
    }

    public String getOtherEffect() {
        if (C84892d.m145850a(this.stickers)) {
            return "[]";
        }
        JSONArray jSONArray = new JSONArray();
        for (StickerItemModel stickerItemModel : this.stickers) {
            try {
                if (stickerItemModel.type == 10) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", stickerItemModel.stickerId);
                    jSONObject.put(StringSet.type, "giphy");
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public void addSticker(StickerItemModel stickerItemModel) {
        this.stickers.add(stickerItemModel);
    }

    public void removeSticker(StickerItemModel stickerItemModel) {
        this.stickers.remove(stickerItemModel);
    }

    public InfoStickerModel(InfoStickerModel infoStickerModel) {
        this.infoStickerDraftDir = infoStickerModel.infoStickerDraftDir;
        this.stickers = new ArrayList(infoStickerModel.stickers);
        this.mFontType = infoStickerModel.mFontType;
        this.mFontId = infoStickerModel.mFontId;
        this.mFontPath = infoStickerModel.mFontPath;
        this.mColor = infoStickerModel.mColor;
        this.mBgMode = infoStickerModel.mBgMode;
        this.mAlign = infoStickerModel.mAlign;
        this.mTextAudioLength = infoStickerModel.mTextAudioLength;
    }

    protected InfoStickerModel(Parcel parcel) {
        this.infoStickerDraftDir = parcel.readString();
        this.stickers = parcel.createTypedArrayList(StickerItemModel.CREATOR);
        this.mFontType = parcel.readString();
        this.mFontId = parcel.readString();
        this.mFontPath = parcel.readString();
        this.mColor = parcel.readInt();
        this.mBgMode = parcel.readInt();
        this.mAlign = parcel.readInt();
        this.mTextAudioLength = parcel.readInt();
    }

    public InfoStickerModel(String str) {
        m88692x8a85bea7("InfoStickerModel", "InfoStickerModel: ".concat(String.valueOf(str)));
        if (str.endsWith(File.separator)) {
            this.infoStickerDraftDir = str;
        } else {
            this.infoStickerDraftDir = str + File.separator;
        }
        this.stickers = new ArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.infoStickerDraftDir);
        parcel.writeTypedList(this.stickers);
        parcel.writeString(this.mFontType);
        parcel.writeString(this.mFontId);
        parcel.writeString(this.mFontPath);
        parcel.writeInt(this.mColor);
        parcel.writeInt(this.mBgMode);
        parcel.writeInt(this.mAlign);
        parcel.writeInt(this.mTextAudioLength);
    }
}
