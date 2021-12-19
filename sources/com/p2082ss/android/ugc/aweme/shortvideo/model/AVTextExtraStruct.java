package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct */
public class AVTextExtraStruct implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<AVTextExtraStruct> CREATOR = new Parcelable.Creator<AVTextExtraStruct>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct.C719841 */

        static {
            Covode.recordClassIndex(84540);
        }

        @Override // android.os.Parcelable.Creator
        public final AVTextExtraStruct[] newArray(int i) {
            return new AVTextExtraStruct[i];
        }

        @Override // android.os.Parcelable.Creator
        public final AVTextExtraStruct createFromParcel(Parcel parcel) {
            return new AVTextExtraStruct(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "at_user_type")
    String atUserType;
    @AbstractC27891c(mo46611a = "aweme_id")
    String awemeId;
    String cid;
    @AbstractC27891c(mo46611a = "end")
    int end;
    @AbstractC27891c(mo46611a = "hashtag_name")
    String hashTagName;
    boolean isStarAtlasTag;
    @AbstractC27891c(mo46611a = "line_idx")
    int lineIndex;
    @AbstractC27891c(mo46611a = "sec_uid")
    String mSecUid;
    @AbstractC27891c(mo46611a = "start")
    int start;
    @AbstractC27891c(mo46611a = "sub_type")
    int subType;
    @AbstractC27891c(mo46611a = StringSet.type)
    int type;
    @AbstractC27891c(mo46611a = "user_id")
    String userId;

    public int describeContents() {
        return 0;
    }

    public AVTextExtraStruct() {
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

    public int getEnd() {
        return this.end;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public int getLineIndex() {
        return this.lineIndex;
    }

    public int getStart() {
        return this.start;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getmSecUid() {
        return this.mSecUid;
    }

    public boolean isStarAtlasTag() {
        return this.isStarAtlasTag;
    }

    static {
        Covode.recordClassIndex(84539);
    }

    @Override // java.lang.Object
    public AVTextExtraStruct clone() {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setStart(this.start);
        aVTextExtraStruct.setEnd(this.end);
        aVTextExtraStruct.setUserId(this.userId);
        aVTextExtraStruct.setType(this.type);
        aVTextExtraStruct.setAtUserType(this.atUserType);
        aVTextExtraStruct.setHashTagName(this.hashTagName);
        aVTextExtraStruct.setAwemeId(this.awemeId);
        aVTextExtraStruct.setSubType(this.subType);
        aVTextExtraStruct.setmSecUid(this.mSecUid);
        aVTextExtraStruct.setLineIndex(this.lineIndex);
        return aVTextExtraStruct;
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

    public String toString() {
        return "AVTextExtraStruct{isStarAtlasTag=" + this.isStarAtlasTag + ", start=" + this.start + ", end=" + this.end + ", userId='" + this.userId + '\'' + ", type=" + this.type + ", atUserType='" + this.atUserType + '\'' + ", hashTagName='" + this.hashTagName + '\'' + ", awemeId='" + this.awemeId + '\'' + ", subType=" + this.subType + ", mSecUid='" + this.mSecUid + '\'' + ", lineIndex=" + this.lineIndex + ", cid='" + this.cid + '\'' + '}';
    }

    public void setAtUserType(String str) {
        this.atUserType = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
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

    public void setStarAtlasTag(boolean z) {
        this.isStarAtlasTag = z;
    }

    public void setStart(int i) {
        this.start = i;
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

    public void setmSecUid(String str) {
        this.mSecUid = str;
    }

    protected AVTextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
        this.subType = parcel.readInt();
        this.mSecUid = parcel.readString();
        this.lineIndex = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AVTextExtraStruct)) {
            return false;
        }
        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
        if (this.type != aVTextExtraStruct.type || this.subType != aVTextExtraStruct.subType) {
            return false;
        }
        String str = this.userId;
        if (str == null ? aVTextExtraStruct.userId != null : !str.equals(aVTextExtraStruct.userId)) {
            return false;
        }
        if (!TextUtils.equals(this.hashTagName, aVTextExtraStruct.hashTagName)) {
            return false;
        }
        String str2 = this.atUserType;
        String str3 = aVTextExtraStruct.atUserType;
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
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
        parcel.writeInt(this.subType);
        parcel.writeString(this.mSecUid);
        parcel.writeInt(this.lineIndex);
    }
}
