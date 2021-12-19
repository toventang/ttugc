package com.p2082ss.android.ugc.aweme.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.model.TextExtraStruct */
public class TextExtraStruct implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<TextExtraStruct> CREATOR = new Parcelable.Creator<TextExtraStruct>() {
        /* class com.p2082ss.android.ugc.aweme.model.TextExtraStruct.C601021 */

        static {
            Covode.recordClassIndex(70613);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextExtraStruct[] newArray(int i) {
            return new TextExtraStruct[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextExtraStruct createFromParcel(Parcel parcel) {
            return new TextExtraStruct(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "at_user_type")
    public String atUserType;
    @AbstractC27891c(mo46611a = "aweme_id")
    public String awemeId;
    public boolean boldText;
    @AbstractC27891c(mo46611a = "hashtag_id")
    public String cid;
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    public int color;
    public Object customSpan;
    @AbstractC27891c(mo46611a = "end")
    public int end;
    @AbstractC27891c(mo46611a = "hashtag_name")
    public String hashTagName;
    public boolean isClickable = true;
    @AbstractC27891c(mo46611a = "is_commerce")
    public boolean isCommerce;
    @AbstractC27891c(mo46611a = "line_idx")
    public int lineIndex;
    @AbstractC27891c(mo46611a = "live_data")
    public String liveData;
    @AbstractC27891c(mo46611a = "sec_uid")
    public String mSecUid;
    public String schema;
    @AbstractC27891c(mo46611a = "star_atlas_tag")
    public boolean starAtlasTag;
    @AbstractC27891c(mo46611a = "start")
    public int start;
    @AbstractC27891c(mo46611a = "sticker_id")
    public String stickerId;
    @AbstractC27891c(mo46611a = "sticker_source")
    public int stickerSource;
    @AbstractC27891c(mo46611a = "sticker_url")
    public UrlModel stickerUrl;
    @AbstractC27891c(mo46611a = "sub_type")
    public int subType;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "user_follow_status")
    public int userFollowStatus;
    @AbstractC27891c(mo46611a = "user_id")
    public String userId;

    public int describeContents() {
        return 0;
    }

    public String getAtUserType() {
        return this.atUserType;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getColor() {
        return this.color;
    }

    public Object getCustomSpan() {
        return this.customSpan;
    }

    public int getEnd() {
        return this.end;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public int getLineIndex() {
        return this.lineIndex;
    }

    public String getLiveData() {
        return this.liveData;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public int getStart() {
        return this.start;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerSource() {
        return this.stickerSource;
    }

    public UrlModel getStickerUrl() {
        return this.stickerUrl;
    }

    public int getSubtype() {
        return this.subType;
    }

    public int getType() {
        return this.type;
    }

    public int getUserFollowStatus() {
        return this.userFollowStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isBoldText() {
        return this.boldText;
    }

    public boolean isClickable() {
        return this.isClickable;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public boolean isStarAtlasTag() {
        return this.starAtlasTag;
    }

    public TextExtraStruct() {
    }

    static {
        Covode.recordClassIndex(70612);
    }

    @Override // java.lang.Object
    public TextExtraStruct clone() {
        try {
            return (TextExtraStruct) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.userId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (((i + 0) * 31) + this.type + this.subType) * 31;
        String str2 = this.atUserType;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.hashTagName;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public void setAtUserType(String str) {
        this.atUserType = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setBoldText(boolean z) {
        this.boldText = z;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setClickable(boolean z) {
        this.isClickable = z;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCustomSpan(Object obj) {
        this.customSpan = obj;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setHashTagName(String str) {
        this.hashTagName = str;
    }

    public void setLineIndex(int i) {
        this.lineIndex = i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setStarAtlasTag(boolean z) {
        this.starAtlasTag = z;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerSource(int i) {
        this.stickerSource = i;
    }

    public void setStickerUrl(UrlModel urlModel) {
        this.stickerUrl = urlModel;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserUserFollowStatus(int i) {
        this.userFollowStatus = i;
    }

    protected TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.mSecUid = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
        this.schema = parcel.readString();
        this.subType = parcel.readInt();
        this.lineIndex = parcel.readInt();
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextExtraStruct)) {
            return false;
        }
        TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
        if (this.type != textExtraStruct.type || this.subType != textExtraStruct.subType || ((str = this.userId) == null ? textExtraStruct.userId != null : !str.equals(textExtraStruct.userId)) || !TextUtils.equals(this.hashTagName, textExtraStruct.hashTagName)) {
            return false;
        }
        String str2 = this.atUserType;
        String str3 = textExtraStruct.atUserType;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeString(this.mSecUid);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.schema);
        parcel.writeInt(this.subType);
        parcel.writeInt(this.lineIndex);
    }
}
